<?php
$stdin = fopen('php://stdin', 'r');
$input = fgets($stdin, 10);

list($a,$b,$c) = split(" ",$input);

if( (($b*$b) - 4 * $a * $c) < 0){
	echo "NO \n";
}else{
	echo "YES \n";
}

fclose($stdin);
?>