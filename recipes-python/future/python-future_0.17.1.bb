DESCRIPTION = "Clean single-source support for Python 3 and 2"
HOMEPAGE = "https://python-future.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3c00b89de8dabf26a9b70748ccf4c477"

PYPI_PACKAGE_HASH = "99abde815842bc6e97d5a7806ad51236630da14ca2f3b1fce94c0bb94d3d"

inherit pypi setuptools

SRC_URI[md5sum] = "e42113b4b72fabb5273ff88417104913"
SRC_URI[sha256sum] = "67045236dcfd6816dc439556d009594abf643e5eb48992e36beac09c2ca659b8"

RCONFLICTS_${PN} = "python-future15"
BBCLASSEXTEND = "native"
