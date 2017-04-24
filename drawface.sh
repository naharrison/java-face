#!/bin/sh -f

MALLOC_ARENA_MAX=1; export MALLOC_ARENA_MAX

javac src/parts/Eye.java
if [ $? != 0 ]
then
	echo "Eye failure"
	exit 1
fi

javac src/parts/Nose.java
if [ $? != 0 ]
then
	echo "Nose failure"
	exit 1
fi

javac src/parts/Mouth.java
if [ $? != 0 ]
then
	echo "Mouth failure"
	exit 1
fi

javac src/scratch/MyThing.java
if [ $? != 0 ]
then
echo "MyThing failure"
exit 1
fi

javac -cp src/ src/utest/MyThingTest.java
if [ $? != 0 ]
then
	echo "MyThingTest failure"
	exit 1
fi

javac -cp src/ src/scratch/Face.java
if [ $? != 0 ]
then
	echo "Face failure"
	exit 1
fi

javac -cp src/ src/scratch/HeyWorld.java
if [ $? != 0 ]
then
	echo "HeyWorld failure"
	exit 1
fi

#java -Xmx1536m -Xms1024m -cp src/ scratch.Face
java -Xmx1536m -Xms1024m -cp src/ scratch.HeyWorld
java -Xmx1536m -Xms1024m -cp src/ utest.MyThingTest

