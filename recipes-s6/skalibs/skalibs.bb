SUMMARY = "A set of general-purpose C programming libraries all skarnet.org software depends on."
DESCRIPTION = "skalibs is a package centralizing the free software / open source C development files used for building all software at skarnet.org: it contains essentially general-purpose libraries."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = ""
LIC_FILES_CHKSUM = "file://COPYING;md5=5c17f5dc8226509a4f72d6be7ae756b4"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "0e626261848cc920738f92fd50a24c14b21e30306dfed97b8435369f4bae00a5"

PV = "2.14.4.0"

inherit s6-skarnet

do_configure() {
    ${S}/configure --with-sysdep-devurandom=y --enable-static \
		--libdir=${libdir} --enable-static-libc --prefix=${root_prefix}
}

do_configure:class-native() {
    ${S}/configure --prefix=${root_prefix} --includedir=${includedir} --libdir=${libdir}
}

INSANE_SKIP:${PN} = "useless-rpaths"
