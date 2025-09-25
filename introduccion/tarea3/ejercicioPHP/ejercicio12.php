<?php
    $fileName = "../outputPHP/ranking.txt";
    $juegos = array("Mario" => 9, "Sonic" => 8, "Zelda" => 10, "Otro" => 7);
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        foreach ($juegos as $key => $value) {
            fwrite($file, "$key: $value \n");
        }
        fclose($file);
    }
    $arrJuegos = file($fileName);
    sort($arrJuegos, SORT_NATURAL | SORT_FLAG_CASE);
    foreach ($arrJuegos as $key => $value) {
        echo "$value";
    }
    
?>