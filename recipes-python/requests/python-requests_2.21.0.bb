inherit pypi setuptools
require python-requests.inc

SRC_URI[md5sum] = "1bcd0e0977c3f8db1848ba0e2b7ab904"
SRC_URI[sha256sum] = "502a824f31acdacb3a35b6690b5fbf0bc41d63a24a45c4004352b0242707598e"

RDEPENDS_${PN} += "${PYTHON_PN}-zlib"
