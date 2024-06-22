<?php
$stdin = fopen('php://stdin', 'r');
$input = fgets($stdin, 10);

list($R1,$s) = split(" ",$input);

echo ($s*2)-$R1,"\n";

fclose($stdin);
?>