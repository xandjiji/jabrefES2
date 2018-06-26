@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  JabRef startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and JAB_REF_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\JabRef-4.2.jar;%APP_HOME%\lib\spin.jar;%APP_HOME%\lib\customjfx-1.0.0.jar;%APP_HOME%\lib\AppleJavaExtensions.jar;%APP_HOME%\lib\jgoodies-forms-1.9.0.jar;%APP_HOME%\lib\jgoodies-common-1.8.1.jar;%APP_HOME%\lib\pdfbox-2.0.9.jar;%APP_HOME%\lib\fontbox-2.0.9.jar;%APP_HOME%\lib\xmpbox-2.0.9.jar;%APP_HOME%\lib\bcprov-jdk15on-1.59.jar;%APP_HOME%\lib\commons-cli-1.4.jar;%APP_HOME%\lib\juh-5.4.2.jar;%APP_HOME%\lib\jurt-5.4.2.jar;%APP_HOME%\lib\ridl-5.4.2.jar;%APP_HOME%\lib\unoil-5.4.2.jar;%APP_HOME%\lib\java-diff-utils-2.1.1.jar;%APP_HOME%\lib\java-string-similarity-1.1.0.jar;%APP_HOME%\lib\antlr-runtime-3.5.2.jar;%APP_HOME%\lib\citeproc-java-1.0.1.jar;%APP_HOME%\lib\antlr4-runtime-4.7.1.jar;%APP_HOME%\lib\mysql-connector-java-5.1.46.jar;%APP_HOME%\lib\pgjdbc-ng-0.7.1.jar;%APP_HOME%\lib\glazedlists_java15-1.9.1.jar;%APP_HOME%\lib\guava-24.1-jre.jar;%APP_HOME%\lib\afterburner.fx-1.7.0.jar;%APP_HOME%\lib\javafxsvg-1.3.0.jar;%APP_HOME%\lib\fontawesomefx-materialdesignfont-1.7.22-4.jar;%APP_HOME%\lib\mvvmfx-validation-1.7.0.jar;%APP_HOME%\lib\easybind-1.0.3.jar;%APP_HOME%\lib\richtextfx-0.9.0.jar;%APP_HOME%\lib\flowless-0.6.1.jar;%APP_HOME%\lib\controlsfx-8.40.15-SNAPSHOT.jar;%APP_HOME%\lib\jsoup-1.11.3.jar;%APP_HOME%\lib\unirest-java-1.4.9.jar;%APP_HOME%\lib\log4j-slf4j-impl-2.11.0.jar;%APP_HOME%\lib\slf4j-api-1.8.0-beta2.jar;%APP_HOME%\lib\log4j-jcl-2.11.0.jar;%APP_HOME%\lib\applicationinsights-logging-log4j2-2.0.2.jar;%APP_HOME%\lib\log4j-core-2.11.0.jar;%APP_HOME%\lib\log4j-api-2.11.0.jar;%APP_HOME%\lib\styles-1.0.1-SNAPSHOT.jar;%APP_HOME%\lib\locales-1.0.1-SNAPSHOT.jar;%APP_HOME%\lib\latex2unicode_2.12-0.2.2.jar;%APP_HOME%\lib\applicationinsights-core-2.0.2.jar;%APP_HOME%\lib\xmlgraphics-commons-2.1.jar;%APP_HOME%\lib\httpasyncclient-4.1.1.jar;%APP_HOME%\lib\httpmime-4.5.2.jar;%APP_HOME%\lib\httpclient-4.5.2.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\jsr305-3.0.0.jar;%APP_HOME%\lib\jcip-annotations-1.0.jar;%APP_HOME%\lib\netty-handler-4.1.8.Final.jar;%APP_HOME%\lib\netty-codec-4.1.8.Final.jar;%APP_HOME%\lib\netty-transport-4.1.8.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.8.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.8.Final.jar;%APP_HOME%\lib\netty-common-4.1.8.Final.jar;%APP_HOME%\lib\checker-compat-qual-2.0.0.jar;%APP_HOME%\lib\error_prone_annotations-2.1.3.jar;%APP_HOME%\lib\j2objc-annotations-1.1.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.14.jar;%APP_HOME%\lib\batik-transcoder-1.8.jar;%APP_HOME%\lib\fontawesomefx-commons-8.15.jar;%APP_HOME%\lib\undofx-2.0.0.jar;%APP_HOME%\lib\reactfx-2.0-M5.jar;%APP_HOME%\lib\wellbehavedfx-0.3.3.jar;%APP_HOME%\lib\json-20160212.jar;%APP_HOME%\lib\commons-lang3-3.4.jar;%APP_HOME%\lib\jbibtex-1.0.15.jar;%APP_HOME%\lib\fastparse_2.12-0.4.2.jar;%APP_HOME%\lib\fastparse-utils_2.12-0.4.2.jar;%APP_HOME%\lib\sourcecode_2.12-0.1.3.jar;%APP_HOME%\lib\scala-library-2.12.3.jar;%APP_HOME%\lib\batik-bridge-1.8.jar;%APP_HOME%\lib\batik-script-1.8.jar;%APP_HOME%\lib\batik-anim-1.8.jar;%APP_HOME%\lib\batik-gvt-1.8.jar;%APP_HOME%\lib\batik-svggen-1.8.jar;%APP_HOME%\lib\batik-svg-dom-1.8.jar;%APP_HOME%\lib\batik-parser-1.8.jar;%APP_HOME%\lib\batik-awt-util-1.8.jar;%APP_HOME%\lib\batik-dom-1.8.jar;%APP_HOME%\lib\batik-xml-1.8.jar;%APP_HOME%\lib\batik-css-1.8.jar;%APP_HOME%\lib\batik-util-1.8.jar;%APP_HOME%\lib\batik-ext-1.8.jar;%APP_HOME%\lib\xalan-2.7.0.jar;%APP_HOME%\lib\xml-apis-ext-1.3.04.jar;%APP_HOME%\lib\commons-io-1.3.1.jar;%APP_HOME%\lib\httpcore-nio-4.4.4.jar;%APP_HOME%\lib\httpcore-4.4.4.jar;%APP_HOME%\lib\commons-codec-1.9.jar

@rem Execute JabRef
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %JAB_REF_OPTS%  -classpath "%CLASSPATH%" org.jabref.JabRefMain %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable JAB_REF_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%JAB_REF_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
