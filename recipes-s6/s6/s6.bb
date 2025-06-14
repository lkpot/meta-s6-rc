SUMMARY = "skarnet.org's small & secure supervision software suite."
DESCRIPTION = "Comes with an ultra-fast init replacement, process management tools, an asynchronous locking library, and more."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs execline"
RDEPENDS:${PN} = "execline"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c17f5dc8226509a4f72d6be7ae756b4"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"

SRC_URI[sha256sum] = "c5114b8042716bb70691406931acb0e2796d83b41cbfb5c8068dce7a02f99a45"

PV = "2.13.2.0"

inherit s6-skarnet
