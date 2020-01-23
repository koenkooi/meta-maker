SUMMARY = "Semantic version comparison for Python (see http://semver.org/)"
SECTION = "devel/python"

HOMEPAGE = "https://github.com/rbarrois/python-semanticversion"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fb31e3c1c7eeb8b5e8c07657cdd54e2"

SRC_URI = "git://github.com/rbarrois/python-semanticversion.git;protocol=https"
SRCREV = "db7ac214cc5b47c223406cd74529698b765d68f1"

# Exact version, no need for +git...
PV = "2.8.4"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR


BBCLASSEXTEND = "native"
