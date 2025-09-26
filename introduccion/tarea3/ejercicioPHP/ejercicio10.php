<?php
$fileName = "../outputPHP/datos.json";
if(!file_exists($fileName)){
    $file=fopen($fileName, "w");
    $datos = [
        ["nombre" => "Ana", "edad" => 25],
        ["nombre" => "Luis", "edad" => 30]
    ];
    fwrite($file, "[\n");
    foreach ($datos as $persona) {
        fwrite($file, json_encode($persona));
        if ($persona !== end($datos)) {
            fwrite($file, ",\n");
        }
    }
    fwrite($file, "\n]");
    fclose($file);
}

echo file_get_contents($fileName);
?>
