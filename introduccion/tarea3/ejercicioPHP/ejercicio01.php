<?php

    if(!file_exists("../outputPHP/datos.txt")){
        $file = fopen("../outputPHP/datos.txt", "w");
        fwrite($file, "Hola Mundo desde PHP");
        fclose($file);
    }

    echo file_get_contents("../outputPHP/datos.txt"),"\n";
    
?>
