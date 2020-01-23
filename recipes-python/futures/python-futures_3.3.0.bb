DESCRIPTION = "The concurrent.futures module provides a high-level interface for asynchronously executing callables."
SECTION = "devel/python"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=8640b307bde88868b2851674523fd163"
HOMEPAGE = "http://code.google.com/p/pythonfutures"
DEPENDS = "python"

inherit pypi setuptools

PYPI_PACKAGE = "futures"

SRC_URI[md5sum] = "b43a39ae1475e3fd6940f2b4f7214675"
SRC_URI[sha256sum] = "7e033af76a5e35f58e56da7a91e687706faf4e7bdfb2cbc3f2cca6b9bcda9794"
