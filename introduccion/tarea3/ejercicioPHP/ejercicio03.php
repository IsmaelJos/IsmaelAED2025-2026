<?php

    if(!file_exists("../outputPHP/texto.txt")){
        $file = fopen("../outputPHP/texto.txt", "w");
        fwrite($file, "PHP es muy divertido y potente.");
        fclose($file);
    }

    echo file_get_contents("../outputPHP/texto.txt"),"\n";
    print_r(str_word_count(file_get_contents("../outputPHP/texto.txt"),1)); // añadir despues del 1 una , y otros valores si quieres que no los separe en otras palabras
?>
