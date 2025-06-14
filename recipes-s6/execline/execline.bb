SUMMARY = "A small scripting language, to be used in place of a shell in non-interactive scripts."
DESCRIPTION = "execline is a (non-interactive) scripting language, like sh - but its syntax is quite different from a traditional shell syntax. The execlineb program is meant to be used as an interpreter for a text file; the other commands are essentially useful inside an execlineb script."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c17f5dc8226509a4f72d6be7ae756b4"
RPROVIDES:${PN} += "${@bb.utils.contains('DISTRO_FEATURES', 'usrmerge', '/bin/execlineb', '', d)}"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "73c9160efc994078d8ea5480f9161bfd1b3cf0b61f7faab704ab1898517d0207"

PV = "2.9.7.0"

inherit s6-skarnet
EXTRA_S6CONF = "--enable-multicall"
