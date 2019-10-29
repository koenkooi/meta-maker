SUMMARY = "Extract from werkzeug.cache"
HOMEPAGE = "https://github.com/pallets/cachelib"

inherit pypi setuptools

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a32a7594742a04098377c0c777ec1af7"

SRCREV = "159ee3974bd71b939840ed302cbdf03fd7b16767"
SRC_URI = "git://github.com/pallets/cachelib.git;protocol=https"

S = "${WORKDIR}/git"
