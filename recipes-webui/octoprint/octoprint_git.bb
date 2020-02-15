SUMMARY = "OctoPrint provides a responsive web interface for controlling a 3D printer (RepRap, Ultimaker, ...)."
HOMEPAGE = "http://octoprint.org"

SECTION = "devel/python"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "python-markdown-native"

SRCREV = "73f7c4d8a11a7aea7b0ece474d3bf37ad53c65d4"

PE = "1"
# Bump PE after RC ends
PV = "1.4.0rc5+git${SRCPV}"

PATCHTOOL = "git"
SRC_URI = "git://github.com/foosel/OctoPrint.git;protocol=https;branch=rc/maintenance \ 
           file://config.yaml \
           file://octoprint.service \
           file://octoprint \
           file://pip-sudo \
"
S = "${WORKDIR}/git"

inherit setuptools systemd useradd pythonnative


export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"

do_configure_prepend() {
    # 'post0' only exist as tarball, no matching commit/version in the git repo :/
    sed -i -e s:post0::g ${S}/setup.py
}

do_install_append() {

    sed -i -e s:/etc:${sysconfdir}:g ${WORKDIR}/octoprint.service
    sed -i -e s:/etc:${sysconfdir}:g ${WORKDIR}/config.yaml
    sed -i -e 's: /sbin: ${base_sbindir}:g' ${WORKDIR}/octoprint
    sed -i -e 's: /bin: ${base_bindir}:g' ${WORKDIR}/octoprint
    sed -i -e s:/usr/bin:${bindir}:g ${WORKDIR}/octoprint

    install -d ${D}${sysconfdir}/octoprint
    install -m 0644 ${WORKDIR}/config.yaml ${D}${sysconfdir}/octoprint/config.yaml
    chmod a+rw ${D}${sysconfdir}/octoprint/config.yaml

    install -d ${D}/lib/systemd/system
    install -m 0644 ${WORKDIR}/octoprint.service ${D}${systemd_unitdir}/system

    install -d ${D}${localstatedir}/lib/octoprint
    chmod a+rw ${D}${localstatedir}/lib/octoprint

    install -d ${D}${sysconfdir}/sudoers.d
    install -m 0644 ${WORKDIR}/octoprint ${D}${sysconfdir}/sudoers.d/

    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/pip-sudo ${D}${bindir}
}

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "--system --home ${localstatedir}/lib/octoprint/ -M -g nogroup -G dialout octoprint"

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "octoprint.service"

FILES_${PN} += "${sysconfdir} ${localstatedir}"
CONFFILES_${PN} += "${sysconfdir}/octoprint/config.yaml"

pkg_postinst_${PN}_append () {
        chown -R octoprint $D${sysconfdir}/octoprint
}

RDEPENDS_${PN} = "python-awesome-slugify \
                  python-backports-abc \
                  python-backports-ssl \
                  python-blinker \
                  python-cachelib \
                  python-feedparser \
                  python-filetype \
                  python-flask12 \
                  python-flask-assets \
                  python-flask-babel \
                  python-flask-login \
                  python-frozendict \
                  python-html \
                  python-itsdangerous \
                  python-jinja2.8 \
                  python-json \
                  python-markdown \
                  python-netaddr \
                  python-netifaces \
                  python-netserver \
                  python-numpy \
                  python-pathtools \
                  python-pip \
                  python-pkginfo \
                  python-psutil \
                  python-pylru \
                  python-pyserial \
                  python-pyyaml51 \
                  python-requests \
                  python-rsa \
                  python-sarge \
                  python-semantic-version \
                  python-sentry-sdk \
                  python-singledispatch \
                  python-sockjs-tornado45 \
                  python-sphinx-rtd-theme \
                  python-sphinxcontrib-httpdomain \
                  python-tornado45 \
                  python-typing \
                  python-watchdog \
                  python-werkzeug \
                  python-werkzeug-tests \
                  python-click \
                  python-chainmap \
                  python-future \
                  python-scandir \
                  python-websocket-client \
                  python-wrapt \
                  python-futures \
                  python-emoji \
                  python-monotonic \
                  sudo \
"

RRECOMMENDS_${PN} = "ffmpeg \
                     mjpg-streamer \
                     octoprint-nginx \
                    "
