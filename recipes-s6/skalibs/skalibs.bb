SUMMARY = "A set of general-purpose C programming libraries all skarnet.org software depends on."
DESCRIPTION = "skalibs is a package centralizing the free software / open source C development files used for building all software at skarnet.org: it contains essentially general-purpose libraries."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = ""
LIC_FILES_CHKSUM = "file://COPYING;md5=ea5b4b9a81f21793db1a769bee7302f3"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "fa359c70439b480400a0a2ef68026a2736b315025a9d95df69d34601fb938f0f"

PV = "2.14.5.1"

inherit s6-skarnet

do_configure() {
    ${S}/configure --with-sysdep-devurandom=y --enable-static \
		--libdir=${libdir} --enable-static-libc --prefix=${root_prefix}
}

do_configure:class-native() {
    ${S}/configure --prefix=${root_prefix} --includedir=${includedir} --libdir=${libdir}
}

INSANE_SKIP:${PN} = "useless-rpaths"
