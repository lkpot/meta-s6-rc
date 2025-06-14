SUMMARY = "Good, usable DNS client libraries and command-line DNS client utilities."
DESCRIPTION = "s6-dns is a suite of DNS client programs and libraries for Unix systems, as an alternative to the BIND, djbdns or other DNS clients."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c17f5dc8226509a4f72d6be7ae756b4"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "b6308519f109a67469c4aaafa9df1f009ad0961fa798ffc38f895587e6935729"

PV = "2.4.1.0"

inherit s6-skarnet
