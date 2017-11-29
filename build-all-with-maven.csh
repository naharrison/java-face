#!/bin/csh -f

mvn install

if ($? != 0) then
	echo 'BuIlD fAIlD'
	exit 1
else
	echo 'BuIlD sUcCeSsFuL'
endif

