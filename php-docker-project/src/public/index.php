<?php

    function montañaAsteriscos(int $n, $m): void{

        $principio = 1;
        $final = ($n*$m);
        $completo = [[]];
        for ($j=0; $j < $n ; $j++) { 
            $linea = [];
            for ($i=1; $i <= ($n*$m); $i++) { 

                if($i<=$n){

                    if($i<=$principio){
                        array_push($linea,"*");
                    }else {
                        array_push($linea,"_");
                    }

                }else{ // $i>$n

                    if($i>=$final){
                        array_push($linea,"*");
                    }else {
                        array_push($linea,"_");
                    }

                }
            }
            echo implode($linea);
            array_push($completo,$linea);
            echo "<br>";
            $principio++;
            $final--;
        }
        


        /*
        $arrAsteriscos = [[]];
        for ($i=1; $i <= $m; $i++) { 
            if (($i % 2) == 0) {
                $asteriscos = [];
                for ($h=0; $h < $n; $h++) { 
                    array_push($asteriscos,"*");
                    array_push($arrAsteriscos, $asteriscos);
                }
            }else{
                $asteriscos = [];
                for ($j=$n; $j > $n; $j--) { 
                    $text = 
                    array_push($asteriscos,"*");
                    array_push($arrAsteriscos, $asteriscos);
                }
            }
            
            foreach ($arrAsteriscos as $arrAsterisco) {
                echo implode(" ",$arrAsterisco) ;
                echo "<br>";
            }
        }
        */

    }

    montañaAsteriscos(4,2);
    
?> 
