@echo off
setlocal
cd /d "%~dp0"
powershell -NoProfile -ExecutionPolicy Bypass -File "pc\build.ps1" -Verify
if errorlevel 1 exit /b 1
copy /Y "pc\dist\CLQ_Windows.exe" "CLQ_Windows.exe"
if errorlevel 1 exit /b 1
copy /Y "pc\dist\CLQ_Windows.exe.config" "CLQ_Windows.exe.config"
if errorlevel 1 exit /b 1
echo Windows : %CD%\CLQ_Windows.exe
endlocal
