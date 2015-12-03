organization := "org.ozb"

name := "ozb-xscalawt"

version := "0.1"

scalaVersion := "2.11.7"

resolvers +=
		"Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
//
//resolvers +=
//    "SWT repo" at "http://maven-eclipse.github.io/maven"

resolvers +=
    "Jabylon" at "http://www.jabylon.org/maven"


libraryDependencies ++= Seq(
	"org.eclipse" % "jface" % "3.9.1",
	"org.eclipse.equinox" % "common" % "3.6.200",
	"org.eclipse.core" % "databinding" % "1.4.1",
	"org.eclipse.core" % "commands" % "3.6.1",
	"org.eclipse.core.databinding" % "observable" % "1.4.0",
	"org.eclipse.core.databinding" % "beans" % "1.2.100",
	"org.eclipse.jface" % "databinding" % "1.5.0",
	"org.eclipse.core.databinding" % "property" % "1.4.0"
	// Note : the SWT native library will be downloaded and placed in to /lib on first update.
	//        To this end, set the "swtNativeUrl" setting value
)

scalacOptions ++= Seq("-deprecation")

/** URL of the Eclipse update site */
eclipseUpdateSite := "http://eclipse.ialto.org/eclipse/updates/3.7/R-3.7.2-201202080800/"

/** URL to the swt lib to compile against (adapt it to your platform, mine is Mac OS X) */
swtNativeUrl <<= eclipseUpdateSite { _ + "plugins/org.eclipse.swt.cocoa.macosx_3.7.2.v3740f.jar" }

/** URLs of the required eclipse libs that will be downloaded from the eclipse
 update site and installed in the local ivy repository */
eclipseLibs := Seq(
	"org.eclipse.jface_3.7.0.v20110928-1505.jar",
	"org.eclipse.equinox.common_3.6.0.v20110523.jar",
	"org.eclipse.core.databinding_1.4.0.I20110111-0800.jar",
	"org.eclipse.core.commands_3.6.0.I20110111-0800.jar",
	"org.eclipse.core.databinding.observable_1.4.0.I20110222-0800.jar",
	"org.eclipse.core.databinding.beans_1.2.100.I20100824-0800.jar",
	"org.eclipse.jface.databinding_1.5.0.I20100907-0800.jar",
	"org.eclipse.core.databinding.property_1.4.0.I20110222-0800.jar"
)
