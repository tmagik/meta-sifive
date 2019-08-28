inherit core-image

SUMMARY = "SiFive flash recovery + boot testing image"

LICENSE = "MIT"

DESCRIPTION = "Small image capable of booting a device with support for the \
Minimal MTD Utilities, which let the user interact with the MTD subsystem in \
the kernel to perform operations on flash devices."
DESCRIPTION = "Small image for use in the SiFive HiFive Unleashed as a \
recovery image from flash, and a basic quick functionality test"

IMAGE_INSTALL += "mtd-utils"
IMAGE_INSTALL += "\
    kernel-modules \
    dhrystone \
    iperf3 \
    lmbench \
    pciutils \
    usbutils \
    devmem2 \
    "


VIRTUAL-RUNTIME_login_manager = "busybox"
VIRTUAL-RUNTIME_dev_manager = "busybox-mdev"

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
