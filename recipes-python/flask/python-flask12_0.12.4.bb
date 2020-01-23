DESCRIPTION = "A microframework based on Werkzeug, Jinja2 and good intentions"
HOMEPAGE = "https://pypi.python.org/pypi/Flask/"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=19866b76b054ab30c270c0eb9d7e43d7"

SRCNAME = "Flask"

SRCREV = "5beb3be536cc743962de6cd2bd95a6e036d11f52"
SRC_URI = "git://github.com/pallets/flask.git;protocol=https"

S = "${WORKDIR}/git"

inherit setuptools

CLEANBROKEN = "1"

RCONFLICTS_${PN} = "python-flask"
RPROVIDES_${PN} = "python-flask"
RCONFLICTS_${PN} = "python-flask10"
