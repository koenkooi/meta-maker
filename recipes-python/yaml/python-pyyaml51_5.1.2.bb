require recipes-devtools/python/python-pyyaml.inc
inherit setuptools

SRC_URI[md5sum] = "20f87ab421b0271dbf371dc5c1cddb5c"
SRC_URI[sha256sum] = "01adf0b6c6f61bd11af6e10ca52b7d4057dd0be0343eb9283c878cf3af56aee4"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a76b4c69bfcf82313bbdc0393b04438a"

S = "${WORKDIR}/PyYAML-${PV}"

RCONFLICTS_${PN} = "python-pyyaml313"
RPROVIDES_${PN} = "python-pyyaml"
