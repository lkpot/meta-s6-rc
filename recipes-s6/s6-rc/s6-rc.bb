SUMMARY = "A complete service manager for s6 systems"
DESCRIPTION = "A suite of programs that can start and stop services, both long-running daemons and one-time initialization scripts, in the proper order according to a dependency tree."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs s6 execline"
RDEPENDS:${PN} = "s6 s6-linux-init execline"
LIC_FILES_CHKSUM = "file://COPYING;md5=397588315e6b6414b74abe203749f1ee"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "46d4a62959ef16097b84dcfb0c3b31a6ff49aa476d4aeec9c5b7bde1ce684901"

PV = "0.6.0.0"

inherit s6-skarnet
