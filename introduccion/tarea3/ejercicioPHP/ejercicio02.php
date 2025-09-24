<?php

    if(!file_exists("../outputPHP/numeros.txt")){
        $file = fopen("../outputPHP/numeros.txt", "w");
        for ($i=1; $i <= 10; $i++) { 
            fwrite($file, $i."\n");
        }
        fclose($file);
    }

    echo file_get_contents("../outputPHP/numeros.txt"),"\n";
    
?>
