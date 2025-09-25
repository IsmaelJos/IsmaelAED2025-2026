<?php
    $fileName = "../outputPHP/frase.txt";
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w+");
        fwrite($file, "Hola PHP");
        fclose($file);
    }
    $fileName2 = "../outputPHP/frase_invertida.txt";
    if(!file_exists($fileName2)){
        file_put_contents($fileName2,strrev(file_get_contents($fileName)));
    }

    echo file_get_contents($fileName),"\n";
    echo file_get_contents($fileName2),"\n";
    
?>