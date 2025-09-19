<?php

    function montañaAsteriscos(int $n, $m): void{

        $asteriscos = [];
        for ($i=0; $i < $n; $i++) { 
            array_push($asteriscos,"*");
            echo "<br>";
        }

    }

    montañaAsteriscos(4,2);


?>
