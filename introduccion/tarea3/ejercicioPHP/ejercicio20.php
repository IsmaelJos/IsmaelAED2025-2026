<?php
    $thisFileName = "../outputPHP/datos.txt";
    $fileName1 = "../outputPHP/animales.txt";
    $fileName2 = "../outputPHP/lugares.txt";
    $fileName3 = "../outputPHP/comidas.txt";

    $arrAnimales = file($fileName1);
    $arrLugares = file($fileName2);
    $arrComidas = file($fileName3);

    $randomAnimal = substr($arrAnimales[array_rand($arrAnimales)],0,-1);
    $randomLugar = substr($arrLugares[array_rand($arrLugares)],0,-1);
    $randomComida = substr($arrComidas[array_rand($arrComidas)],0,-1);

    if(!file_exists($thisFileName)){
        $file = fopen($thisFileName, "w");
        fwrite($file, "Un $randomAnimal viajó a $randomLugar para comer $randomComida.");
        fclose($file);
    }else{
        file_put_contents($thisFileName, "Un $randomAnimal viajó a $randomLugar para comer $randomComida.");
    }
    echo file_get_contents($thisFileName),"\n";
    
?>