param(
    [switch]$Run
)

if (-not (Test-Path out)) {
    New-Item -ItemType Directory -Path out | Out-Null
}

$javaFiles = Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName }

javac -d out $javaFiles

if ($LASTEXITCODE -ne 0) {
    Write-Error "Compilation failed."
    exit 1
}

Write-Host "Compiled successfully to ./out"

if ($Run) {
    Write-Host "Running school.Main..."
    java -cp out school.Main
}


