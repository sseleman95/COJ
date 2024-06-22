<?php
$stdin = fopen('php://stdin', 'r');

$input = fgets($stdin, 10);
list($a, b$, c$) = split(" ",$input);

if (($a**2==$b**2+$c**2)||($b**2==$a**2+$c**2)||($c**2==$a**2+$b**2)) {
			echo "rectangulo \n";
		} else if (($a**2>$b**2+$c**2)||$b**2>$a**2+$c**2)||($c**2>$a**2+$b**2)) {
			echo "obtusangulo \n";
		} else {
			echo "acutangulo \n";
		}
		


fclose($stdin);
?>