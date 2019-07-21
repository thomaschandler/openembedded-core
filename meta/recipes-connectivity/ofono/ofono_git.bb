require ofono.inc

S	 = "${WORKDIR}/git"
SRCREV = "b28a7b73b40c01de7fe835db1ad5eee4e9d9e2c7"
PV	 = "1.29-git${SRCPV}"
PR = "r5"

# https://stackoverflow.com/questions/5193048/bin-sh-pushd-not-found
# https://github.com/dotnet/roslyn/issues/7499
export SHELL = "/bin/bash"
# From notes in git/INSTALL in work directory
export CONFIG_SHELL = "/bin/bash"

SRC_URI  = "git://git.kernel.org/pub/scm/network/ofono/ofono.git \
	    file://ofono"

do_configure_prepend () {
  ${S}/bootstrap
}

