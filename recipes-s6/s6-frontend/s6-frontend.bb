SUMMARY = "A higher-level interface to the s6 ecosystem."
DESCRIPTION = "A frontend to the s6 init system. It provides the one-stop-shop s6 command, that is used to address every part of the init system."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs execline s6-linux-init s6 s6-rc util-linux"
RDEPENDS:${PN} = ""
LIC_FILES_CHKSUM = "file://COPYING;md5=bf2e714ed36534bb7976bdbae107223b"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "7660f881fc2c923446083d6878dead6a8405fdedb3645a87e188d679ccc8c628"

PV = "0.0.1.0"

inherit s6-skarnet
