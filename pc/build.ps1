param([switch]$Verify)
$ErrorActionPreference = 'Stop'
$pcRoot = $PSScriptRoot
$compiler = Join-Path $env:WINDIR 'Microsoft.NET\Framework64\v4.0.30319\csc.exe'
if (-not (Test-Path -LiteralPath $compiler)) { throw 'Le compilateur .NET Framework est introuvable.' }
$outDir = Join-Path $pcRoot 'dist'
New-Item -ItemType Directory -Path $outDir -Force | Out-Null
$exe = Join-Path $outDir 'CLQ_Windows.exe'
$bank = Join-Path $pcRoot 'data\questions.json.gz'
$sources = Get-ChildItem -LiteralPath (Join-Path $pcRoot 'src') -Filter '*.cs' | ForEach-Object FullName
& $compiler /nologo /target:winexe /platform:anycpu /optimize+ /codepage:65001 "/out:$exe" /reference:System.Windows.Forms.dll /reference:System.Drawing.dll /reference:System.Web.Extensions.dll "/resource:$bank,questions.gz" @sources
if ($LASTEXITCODE -ne 0) { throw 'Compilation Windows échouée.' }
Set-Content -LiteralPath ($exe + '.config') -Encoding utf8 -Value '<?xml version="1.0" encoding="utf-8"?><configuration><startup><supportedRuntime version="v4.0" sku=".NETFramework,Version=v4.8"/></startup></configuration>'
if ($Verify) {
    $report = Join-Path $pcRoot 'pc_tests.txt'
    $process = Start-Process -FilePath $exe -ArgumentList @('--self-test', ('"' + $report + '"')) -WindowStyle Hidden -PassThru -Wait
    Get-Content -LiteralPath $report -Tail 4
    if ($process.ExitCode -ne 0) { throw 'Vérification Windows échouée.' }
}
Write-Output "Exécutable : $exe"
