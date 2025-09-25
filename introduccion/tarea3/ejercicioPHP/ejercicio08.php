<?php
    $fileName = "../outputPHP/tabla5.txt";
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        for ($i=1; $i <= 10 ; $i++) { 
            $multiplicacion = "5 x $i = " . 5*$i . "\n";
            fwrite($file, $multiplicacion);
        }
        fclose($file);
    }

    echo file_get_contents($fileName),"\n";
    
?>