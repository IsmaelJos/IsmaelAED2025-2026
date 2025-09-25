<?php
    $fileName = "../outputPHP/datos.txt";
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        fwrite($file, "Hola Mundo desde PHP");
        fclose($file);
    }

    echo file_get_contents($fileName),"\n";
    
?>