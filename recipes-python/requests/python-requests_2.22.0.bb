inherit pypi setuptools
require python-requests.inc

SRC_URI[md5sum] = "ee28bee2de76e9198fc41e48f3a7dd47"
SRC_URI[sha256sum] = "11e007a8a2aa0323f5a921e9e6a2d7e4e67d9877e85773fba9ba6419025cbeb4"

RDEPENDS_${PN} += "${PYTHON_PN}-zlib"
