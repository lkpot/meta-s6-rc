SUMMARY = "A complete service manager for s6 systems"
DESCRIPTION = "A suite of programs that can start and stop services, both long-running daemons and one-time initialization scripts, in the proper order according to a dependency tree."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs s6 execline"
RDEPENDS:${PN} = "s6 s6-linux-init execline"
LIC_FILES_CHKSUM = "file://COPYING;md5=3710923a1cbdcc20ee753ff94bc119ca"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "81277f6805e8d999ad295bf9140a909943b687ffcfb5aa3c4efd84b1a574586e"

PV = "0.5.6.0"

inherit s6-skarnet
