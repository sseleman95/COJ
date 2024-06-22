<?php
$stdin = fopen('php://stdin', 'r');
$input = fgets($stdin, 10);

list($n) = split(" ",$input);

echo ($n*(2*$n))+(($n*(2*5))/2),"\n";

fclose($stdin);
?>