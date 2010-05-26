@echo off
setlocal
set CLASSPATH=%CLASSPATH%;pdfbox-1.1.0.jar
set CLASSPATH=%CLASSPATH%;commons-logging-1.1.1.jar
set CLASSPATH=%CLASSPATH%;fontbox-1.1.0.jar
javac pdf2txt.java
for /R ..\pdf %%i in (*.pdf) do java pdf2txt "%%i"
endlocal
echo on
