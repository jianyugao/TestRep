#!/bin/sh

for var in $*
do
	case $var in
		35)
echo "35 here"
mvn start: mvn exec:java -Dexec.mainClass="mvn1.mainInput.MainArgument" -Dexec.args="35" 
;;
 23) 
echo "23 here"
mvn start: mvn exec:java -Dexec.mainClass="mvn1.mainInput.MainArgument" -Dexec.args="23" 

;;

	esac

done 