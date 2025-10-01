<?php

    $fileNameInput = "../inputPHP/texto.txt";
    $fileNameOutput = "../outputPHP/estadisticas.csv";

    if(file_exists($fileNameInput)){
        $contenidoString = file_get_contents($fileNameInput);
        $contenidoString = strtolower($contenidoString);
        $words = array_count_values(str_word_count($contenidoString, 1, 'áéíóú'));
        // print_r($words);
        $fileOutput = fopen($fileNameOutput,"w");
        
        foreach ($words as $key => $word) {
            fwrite($fileOutput,"$key,$word \n");
        }
        fclose($fileOutput);
    }


?>