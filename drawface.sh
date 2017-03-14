#!/bin/sh -f

MALLOC_ARENA_MAX=1; export MALLOC_ARENA_MAX

javac src/parts/Eye.java
javac src/parts/Nose.java
javac src/parts/Mouth.java
javac -cp src/ src/scratch/Face.java
java -Xmx1536m -Xms1024m -cp src/ scratch.Face
