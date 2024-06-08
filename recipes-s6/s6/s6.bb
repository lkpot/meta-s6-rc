SUMMARY = "skarnet.org's small & secure supervision software suite."
DESCRIPTION = "Comes with an ultra-fast init replacement, process management tools, an asynchronous locking library, and more."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs execline"
RDEPENDS:${PN} = "execline"
LIC_FILES_CHKSUM = "file://COPYING;md5=c92b5c6593e97d6cc9bcb4892128e2b8"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"

SRC_URI[sha256sum] = "7e46f8f55d80bb0e2025a64d5d649af4a4ac21e348020caaadde30ba5e5b4830"

PV = "2.13.0.0"

inherit s6-skarnet
