<?php
    $fileName = "../outputPHP/comidas.txt";
    $arr = ["pizza","sushi","pizza","pasta"];
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w+");
        foreach ($arr as $value) {
            fwrite($file, $value."\n");
        }
        echo fgets($file);
        fclose($file);
    }
    echo file_get_contents($fileName)."\n";
    //No terminado
?>
