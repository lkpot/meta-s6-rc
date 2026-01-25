SUMMARY = "UCSPI Unix and TCP tools, a SSL/TLS tunnel, access control tools, and network time management utilities."
DESCRIPTION = "s6-networking is a suite of small networking utilities for Unix systems. It includes command-line client and server management, TCP access control, privilege escalation across UNIX domain sockets, IDENT protocol management and clock synchronization."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs execline s6 s6-dns"
RDEPENDS:${PN} = "s6-dns"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea5b4b9a81f21793db1a769bee7302f3"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "679f8652d85be343dac1f076497cd36ca8c56400948780f85dc64e34055e2c1b"

PV = "2.7.2.1"

inherit s6-skarnet
