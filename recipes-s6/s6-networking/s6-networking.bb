SUMMARY = "UCSPI Unix and TCP tools, a SSL/TLS tunnel, access control tools, and network time management utilities."
DESCRIPTION = "s6-networking is a suite of small networking utilities for Unix systems. It includes command-line client and server management, TCP access control, privilege escalation across UNIX domain sockets, IDENT protocol management and clock synchronization."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs execline s6 s6-dns"
RDEPENDS:${PN} = "s6-dns"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c17f5dc8226509a4f72d6be7ae756b4"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "a7b33497e72921a59d4c1fc67ce5cc74bd065e09105bf1a79f1fc73cf9a06592"

PV = "2.7.1.0"

inherit s6-skarnet
