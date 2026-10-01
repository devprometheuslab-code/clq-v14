@echo off
setlocal
cd /d "%~dp0"
call gradlew.bat assembleInstallation --console=plain
if errorlevel 1 exit /b 1
copy /Y "app\build\outputs\apk\installation\app-installation.apk" "CLQ_v14_ameliore_test.apk"
if errorlevel 1 exit /b 1
echo APK : %CD%\CLQ_v14_ameliore_test.apk
endlocal
