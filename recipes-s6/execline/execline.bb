SUMMARY = "A small scripting language, to be used in place of a shell in non-interactive scripts."
DESCRIPTION = "execline is a (non-interactive) scripting language, like sh - but its syntax is quite different from a traditional shell syntax. The execlineb program is meant to be used as an interpreter for a text file; the other commands are essentially useful inside an execlineb script."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea5b4b9a81f21793db1a769bee7302f3"
RPROVIDES:${PN} += "${@bb.utils.contains('DISTRO_FEATURES', 'usrmerge', '/bin/execlineb', '', d)}"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "23350d10797909636060522607591cb4a2118328cb58c5e65fb19a2c0d47264e"

PV = "2.9.8.1"

inherit s6-skarnet
EXTRA_S6CONF = "--enable-multicall"
