<?php
    $fileName = "../outputPHP/origen.txt";
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        fwrite($file, "Este es el archivo original.");
        fclose($file);
    }
    $fileName2 = "../outputPHP/copia.txt";
    if(!file_exists($fileName2)){
        copy($fileName,$fileName2);
        echo "Se ha copiado el archivo original a $fileName2","\n";
    }
    
    echo file_get_contents($fileName),"\n";
    echo file_get_contents($fileName2),"\n";

?>