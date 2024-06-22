<?php
$stdin = fopen('php://stdin', 'r');
$input = fgets($stdin, 10);

list($n) = split(" ",$input);

if ($n == 0) {
	echo "1";
}

if ($n > 0) {
	echo $n * ($n + 1) / 2,"\n";
}

if ($n < 0) {
	$n = -1*$n;
	echo -1*($n * ($n + 1) / 2 - 1),"\n";
}

fclose($stdin);
?>