SUMMARY = "A small daemon managing kernel hotplug events, similarly to udevd."
DESCRIPTION = "It uses the same configuration file as mdev, which is a hotplug manager integrated in the Busybox suite of tools. However, mdev needs to be registered in /proc/sys/kernel/hotplug, and the kernel forks an instance of mdev for every event; by contrast, mdevd is a daemon and does not fork."
HOMEPAGE = "https://skarnet.org/software/${BPN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs execline"
RDEPENDS:${PN} = "execline"
LIC_FILES_CHKSUM = "file://COPYING;md5=65002497793ffd12ad4c6062c84d6ff7"

SRC_URI = "https://skarnet.org/software/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "ec966eec39879f33c785343373021c44f887c836a08fcaf1d63412e3bdbfca32"

PV = "0.1.7.0"

inherit s6-skarnet
