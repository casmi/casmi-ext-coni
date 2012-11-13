# casmi-ext-coni

# Dependency

* OpenNI v1.5.2.23-stable
* NITE v1.5.2.21-stable
* Sensor/SensorKinect

# Usage

## Install OpenNI, NITE, Sensor/SensorKinect

Install OpenNI, NITE, and Sensor/SensorKinect on your PC.

You can download OpenNI, NITE, and Sensor from [OpenNI official page](http://www.openni.org/Downloads/OpenNIModules.aspx).

SensorKinect from [Github page](https://github.com/avin2/SensorKinect).

## Install native libraries

Copy native libraries that is installed along with OpenNI and NITE to 
directory under `java.library.path`.

* Linux
    * libOpenNI.jni.so
    * libXnVNITE.jni.so
* Mac OS X
    * libOpenNI.jni.dylib
    * libXnVNITE.jni.dylib
* Windows
    * OpenNI.jni.dll
    * XnVNITE.jni.dll
    
Typical directories under `java.library.path` are followings.

* Linux
    * /usr/local/lib
    * /usr/lib
    * /lib
* Mac OS X
    * /Library/Java/Extensions
    * /System/Library/Java/Extensions
    * /usr/lib/java
* Windows
    * C:\Windows\system32
    * C:\Windows
    
## Using maven    

Add dependencies to pom.xml.

    <repositories>
        <repository>
            <id>casmi</id>
            <name>casmi</name>
            <url>http://casmi.github.com/maven-repo/</url>
        </repository>
    </repositories>
  
    <dependencies>
        <dependency>
            <groupId>casmi</groupId>
            <artifactId>casmi</artifactId>
            <version>0.3.0</version>
        </dependency>
        <dependency>
    	     <groupId>casmi</groupId>
    	     <artifactId>casmi-ext-video</artifactId>
    	     <version>0.3.0</version>
        </dependency>
    </dependencies>
  
# License

## casmi-ext-coni

casmi is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.

## examples

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.

You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and limitations under the License.