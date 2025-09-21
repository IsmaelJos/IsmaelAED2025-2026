<?php

    function multiplosTresOCinco(int $n): array{
        $array = [];
        do {
            if (($n % 3) == 0) {
                array_push($array,$n);
            }elseif(($n % 5) == 0) {
                array_push($array,$n);
            }
            $n--;
        }
        while ($n != 0);
        return $array;
    }
    $multiplos = multiplosTresOCinco(10);
    $suma = 0;
    echo implode(" , ", $multiplos);

    foreach ($multiplos as $multiplo) {
        $suma += $multiplo; 
    }

    echo "<br>","Suma = $suma";
    
?> 
