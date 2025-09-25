<?php
    $fileName = "../outputPHP/nombres.txt";
    $arr = ["Ana","Luis","Marta","Carlos","Julia"];
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w+");
        foreach ($arr as $value) {
            fwrite($file, $value."\n");
        }
        echo fgets($file);
        fclose($file);
    }
    echo file_get_contents($fileName)."\n";
    
?>
