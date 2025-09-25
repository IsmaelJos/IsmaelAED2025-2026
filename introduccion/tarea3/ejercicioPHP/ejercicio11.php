<?php
    $fileName = "../outputPHP/diario.txt";
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        fwrite($file, date("[Y-m-d h:i]")." Primera entrada del diario \n");
        fclose($file);
    }else{
        $diario = file_get_contents($fileName);
        $diario .= date("[Y-m-d h:i]")." Otra entrada mas al diario \n";
        file_put_contents($fileName, $diario);
    }

    echo file_get_contents($fileName),"\n";
    
?>