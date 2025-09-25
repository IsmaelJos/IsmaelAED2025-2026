<?php
    $fileName = "../outputPHP/datos_numericos.txt";
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        fwrite($file, "10,20,30,40");
        fclose($file);
    }

    echo file_get_contents($fileName),"\n";
    echo "suma de valores = ".array_sum(explode(",",file_get_contents($fileName))),"\n";

?>