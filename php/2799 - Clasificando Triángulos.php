<?php
$stdin = fopen('php://stdin', 'r');

$input = fgets($stdin, 10);
list($a) = split(" ",$input);
$input = fgets($stdin, 10);
list($b) = split(" ",$input);
$input = fgets($stdin, 10);
list($c) = split(" ",$input);

if (($a+$b+$c==180)) {
	if (($a==$b)&&($b==$c)&&($c==$a)) {
	echo "Equilateral \n";
	}
	else if (($a==$b)||($b==$c)||($c==$a)) {
	echo "Isosceles \n";
	} else {
	echo "Scalene \n";
	}
} else {
	echo "Error \n";
}
		
fclose($stdin);
?>