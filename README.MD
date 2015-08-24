# TestRep
mvnproject is a maven project. It contains the following skills:
(1) how to run two main functions in a maven project;
(2) how to read properties files in java.

# JNI
######how to create JNI
javac packagename/xx.java
javah -jni packagename.xx
gcc -shared -fPIC -o libxx.so -I$JAVA_HOME/include -I $JAVA_HOME/include/linux HelloJNI.c 
java -Djava.library.path=. jni.jnilib

#####how to use log4c
gcc -g -Wall -o0  test-log.c log.c -o test-log -L/usr/local/log4c/lib/ -I/usr/local/log4c/include /usr/local/log4c/lib/liblog4c.so
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/usr/local/log4c/lib

######compile log4c and JNI libxx.so together
gcc -shared  -fPIC  -L/usr/local/log4c/lib/ -I$JAVA_HOME/include -I$JAVA_HOME/include/linux  -I/usr/local/log4c/include /usr/local/log4c/lib/liblog4c.so HelloJNI.c  log.c -o libReadFile.so -llog4c
######log4c file needed
log.c log.h log4c(folder) log4crc log4c.h
######how to use Zlog
gcc -shared -fPIC -o libZlogTest.so -I$JAVA_HOME/include -I $JAVA_HOME/include/linux TestZlog.c 
gcc  -shared -fPIC -o libZlogTest.so -I /usr/local/include -I$JAVA_HOME/include -I $JAVA_HOME/include/linux -L/usr/local/lib TestZlog.c -lzlog 
java -Djava.library.path=. zlogJNI.TestZlog
//gcc  -shared -fPIC -o libZlogTest.so -I /usr/local/include -I$JAVA_HOME/include -I $JAVA_HOME/include/linux //-L/usr/local/lib zlog.c TestZlog.c -lzlog 自己写zlog框架在运行的时候报错 
