DESCRIPTION = "ovlock"
SECTION = "base"
PRIORITY = "required"
MAINTAINER = "Open Vision Developers"
require conf/license/license-gplv2.inc

inherit rm_python_pyc compile_python_pyo no_python_src

SRC_URI = "file://ov.py"

FILES_${PN} = "/usr"

S = "${WORKDIR}"

PACKAGES = "${PN}"

do_install() {
	install -d ${D}${libdir}/python2.7
	install -m 0644 ${WORKDIR}/ov.pyo ${D}${libdir}/python2.7
}
