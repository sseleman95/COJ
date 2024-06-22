<?php
$stdin = fopen('php://stdin', 'r');
$input = fgets($stdin, 10);

list($n) = split(" ",$input);

 if ($n<2) {
	echo "WRONG ANSWER \n";
} else if ($n>3) {
	echo "RUNTIME ERROR \n";
} else {
	echo "ACCEPTED \n";
}

fclose($stdin);
?>