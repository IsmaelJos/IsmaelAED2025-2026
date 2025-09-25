<?php
    $fileName = "../outputPHP/excusas.txt";
    $arr = ["Mi perro se comió la tarea.","El Wi-Fi decidió tomarse el día libre.","Me abdujeron los marcianos."];
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        foreach ($arr as $value) {
            fwrite($file, $value."\n");
        }
        fclose($file);
    }
    $arrExcusas = file($fileName);
    echo $arrExcusas[array_rand($arrExcusas)];
    
?>