<?php
$stdin = fopen('php://stdin', 'r');
$input = fgets($stdin, 10);

list($n) = split(" ",$input);

echo 3000-$n,"\n";

fclose($stdin);
?>