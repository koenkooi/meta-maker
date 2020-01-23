SUMMARY = "Alternative regular expression module, to replace re."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/regex"

LICENSE = "PSFL"
LIC_FILES_CHKSUM = "file://setup.py;beginline=32;endline=31;md5=d41d8cd98f00b204e9800998ecf8427e"

SRC_URI = "https://pypi.python.org/packages/source/r/regex/regex-${PV}.tar.gz"
SRC_URI[md5sum] = "73abc3d7e902e94b4281fd2652f5a94f"
SRC_URI[sha256sum] = "d0f424328f9822b0323b3b6f2e4b9c90960b24743d220763c7f07071e0778351"

S = "${WORKDIR}/regex-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
