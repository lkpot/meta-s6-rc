SUMMARY = "skarnet.org's small & secure supervision software suite."
DESCRIPTION = "Comes with an ultra-fast init replacement, process management tools, an asynchronous locking library, and more."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs execline"
RDEPENDS:${PN} = "execline"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea5b4b9a81f21793db1a769bee7302f3"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"

SRC_URI[sha256sum] = "c25afe817cbc3f594efc5050351f8b9101ba78616d0ce915658f370e7ee2e258"

PV = "2.14.0.1"

inherit s6-skarnet
