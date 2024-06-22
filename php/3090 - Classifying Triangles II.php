<?php
$stdin = fopen('php://stdin', 'r');

$input = fgets($stdin, 10);
list($a, $b, $c) = split(" ",$input);

if ((($a*$a)==($b*$b)+($c*$c))||(($b*$b)==($a*$a)+($c*$c))||(($c*$c)==($a*$a)+($b*$b))) {
	echo "rectangulo \n";
} else if ((($a*$a)>($b*$b)+($c*$c))||(($b*$b)>($a*$a)+($c*$c))||(($c*$c)>($a*$a)+($b*$b))) {
	echo "obtusangulo \n";
} else {
	echo "acutangulo \n";
}
		
fclose($stdin);
?>