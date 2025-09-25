<?php
    $fileName = "../outputPHP/chistes.txt";
    $arr = ["¿Sabes cuál es el colmo de un programador? Tener mala RAM-oria.","Ayer vi un bit triste… estaba des-bit-ido.","Yo no sudo, compilo."];
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        foreach ($arr as $value) {
            fwrite($file, $value."\n");
        }
        fclose($file);
    }
    $arrChistes = file($fileName);
    //echo $arrChistes[];
    // no terminado
?>