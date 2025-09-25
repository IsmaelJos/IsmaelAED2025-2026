<?php
    $fileName = "../outputPHP/canciones.txt";
    $arr = ["Hysteria","Bohemian Rhapsody","Africa"];
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        foreach ($arr as $value) {
            fwrite($file, $value."\n");
        }
        fclose($file);
    }
    $arrMusica = file($fileName);
    echo $arrMusica[array_rand($arrMusica)];
    
?>