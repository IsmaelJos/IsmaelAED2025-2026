<?php

    $fileNameInput = "../inputPHP/ops.csv";
    $fileNameOutput = "../outputPHP/resultado.csv";
    if(file_exists($fileNameInput)){
        
        $contenidoString = file_get_contents($fileNameInput);
        $arrLineas = explode("\n",$contenidoString);
        foreach ($arrLineas as $lineas) {
            
            $fileOutput=fopen($fileNameOutput,"a");
            $arr=explode(",",$lineas);
            if($arr[2]=="suma"){
                fwrite($fileOutput,$lineas.",".($arr[0]+$arr[1])."\n");
            }
            if($arr[2]=="resta"){
                fwrite($fileOutput,$lineas.",".($arr[0]-$arr[1])."\n");
            }
            if($arr[2]=="producto"){
                fwrite($fileOutput,$lineas.",".($arr[0]*$arr[1])."\n");
            }
            if($arr[2]=="division"){
                if($arr[1]!=0){
                    fwrite($fileOutput,$lineas.",".($arr[0]/$arr[1])."\n");
                }else{
                    fwrite($fileOutput,$lineas.",ERROR\n");
                }
            }
            
        }
        fclose($fileOutput);
    }
    
    
?>