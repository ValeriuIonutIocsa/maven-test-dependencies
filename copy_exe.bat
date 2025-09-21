@echo off

set SRC_JAR_FILE_PATH=%1
set SRC_JAR_WITH_DEP_FILE_PATH=%2
set DST_FOLDER_PATH=%~dp3
set GITIGNORE_PATH=%3
set DEST_JAR_PATH=%4

if not exist "%DST_FOLDER_PATH%" (
    echo creating %DST_FOLDER_PATH%
    mkdir "%DST_FOLDER_PATH%"
)

if exist "%SRC_JAR_WITH_DEP_FILE_PATH%" (
    echo writing "%GITIGNORE_PATH%"
    echo *.jar>"%GITIGNORE_PATH%"
    echo copy "%SRC_JAR_WITH_DEP_FILE_PATH%" "%DEST_JAR_PATH%"
    copy "%SRC_JAR_WITH_DEP_FILE_PATH%" "%DEST_JAR_PATH%"

) else (
    if exist "%SRC_JAR_FILE_PATH%" (
        echo writing "%GITIGNORE_PATH%"
        echo *.jar>"%GITIGNORE_PATH%"
        echo copy "%SRC_JAR_FILE_PATH%" "%DEST_JAR_PATH%"
        copy "%SRC_JAR_FILE_PATH%" "%DEST_JAR_PATH%"
    )
)
