<?php
    $fileName = "../outputPHP/adjetivos.txt";
    $fileName2 = "../outputPHP/animales.txt";

    $arrAdjetivos = file($fileName);
    $arrAnimales = file($fileName2);
    echo 
        substr($arrAnimales[array_rand($arrAnimales)],0,-1).
        " ". 
        $arrAdjetivos[array_rand($arrAdjetivos)] ;
?>