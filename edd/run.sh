#!/bin/sh

PROGRAMA=edu.itszapopan.edd.programas.SimpleListSearch

# Ejecutar el programa
java $PROGRAMA

#Hacer el archivo Jar
jar cfe JMessenger.jar %PROGRAMA% img edu/itszapopan/jmessenger/*.class

