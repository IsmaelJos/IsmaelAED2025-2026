<?php

$altura = 5;
$asteriscos = [];
for ($i=1; $i <= $altura; $i++) { 
    array_push($asteriscos,"*");
    foreach ($asteriscos as $asterisco) {
        echo $asterisco," ";
    }
    echo "<br>";
}

?>
