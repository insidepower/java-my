import java.lang.*;
import java.util.Properties; 

public class SystemPropTest {

   public static void main(String[] args) {

      // this will list the current system properties
      Properties p = System.getProperties();
      p.list(System.out);
  }
} 

/* Output
 -- listing properties --
java.runtime.name=Java(TM) SE Runtime Environment
sun.boot.library.path=/usr/local/java/jdk1.7.0_45/jre/lib/i386
java.vm.version=24.45-b08
java.vm.vendor=Oracle Corporation
java.vendor.url=http://java.oracle.com/
path.separator=:
java.vm.name=Java HotSpot(TM) Server VM
file.encoding.pkg=sun.io
user.country=US
sun.java.launcher=SUN_STANDARD
sun.os.patch.level=unknown
java.vm.specification.name=Java Virtual Machine Specification
user.dir=/home/knxy/java-my
java.runtime.version=1.7.0_45-b18
java.awt.graphicsenv=sun.awt.X11GraphicsEnvironment
java.endorsed.dirs=/usr/local/java/jdk1.7.0_45/jre/lib/e...
os.arch=i386
java.io.tmpdir=/tmp
line.separator=

java.vm.specification.vendor=Oracle Corporation
os.name=Linux
sun.jnu.encoding=UTF-8
java.library.path=/usr/java/packages/lib/i386:/lib:/usr...
java.specification.name=Java Platform API Specification
java.class.version=51.0
sun.management.compiler=HotSpot Tiered Compilers
os.version=3.8.0-35-generic
user.home=/home/knxy
user.timezone=
java.awt.printerjob=sun.print.PSPrinterJob
file.encoding=UTF-8
java.specification.version=1.7
user.name=knxy
java.class.path=.
java.vm.specification.version=1.7
sun.arch.data.model=32
java.home=/usr/local/java/jdk1.7.0_45/jre
sun.java.command=SystemPropTest
java.specification.vendor=Oracle Corporation
user.language=en
awt.toolkit=sun.awt.X11.XToolkit
java.vm.info=mixed mode
java.version=1.7.0_45
java.ext.dirs=/usr/local/java/jdk1.7.0_45/jre/lib/e...
sun.boot.class.path=/usr/local/java/jdk1.7.0_45/jre/lib/r...
java.vendor=Oracle Corporation
file.separator=/
java.vendor.url.bug=http://bugreport.sun.com/bugreport/
sun.cpu.endian=little
sun.io.unicode.encoding=UnicodeLittle
sun.desktop=gnome
sun.cpu.isalist=
   */
