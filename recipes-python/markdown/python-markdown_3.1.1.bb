SUMMARY = "Python implementation of Markdown."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/markdown/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=745aaad0c69c60039e638bff9ffc59ed"

SRCREV = "58b4d64db00ef50c090a9da4bc303c5e840c5c9f"
SRC_URI = "git://github.com/Python-Markdown/markdown.git;protocol=https"

S = "${WORKDIR}/git"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
