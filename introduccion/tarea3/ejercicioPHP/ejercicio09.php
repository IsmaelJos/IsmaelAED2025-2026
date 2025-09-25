<?php
    $fileName = "../outputPHP/usuarios.txt";
    $nombres = "Ana,Pedro,Lucía";
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        fwrite($file, "Ana\n" . "Pedro\n" . "Lucía");
        fclose($file);
    }
    
    $nombresArr = file($fileName);
    foreach ($nombresArr as $nombre) {
        echo "$nombre";
    }
    echo "\n";
?>