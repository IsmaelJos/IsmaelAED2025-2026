<?php
    $fileName = "../outputPHP/palabras.txt";
    $arr = ["manzana","platano","cereza"];
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        foreach ($arr as $value) {
            fwrite($file, $value."\n");
        }
        fclose($file);
    }
    $arrPalabras = file($fileName);
    echo substr($arrPalabras[array_rand($arrPalabras)],0,2)."\n";
    
?>