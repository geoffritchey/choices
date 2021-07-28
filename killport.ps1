$processes = (get-NetTCPConnection| ? {$_.LocalPort -eq "8080"}).OwningProcess
foreach ($process in $processes) {Get-Process -PID $process | Stop-Process -Force}
