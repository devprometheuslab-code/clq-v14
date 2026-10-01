@echo off
setlocal
cd /d "%~dp0"
call gradlew.bat assembleDebug testDebugUnitTest lintDebug --console=plain
if errorlevel 1 exit /b 1
copy /Y "app\build\outputs\apk\debug\app-debug.apk" "CLQ_v14_Android.apk"
if errorlevel 1 exit /b 1
echo APK : %CD%\CLQ_v14_Android.apk
endlocal
