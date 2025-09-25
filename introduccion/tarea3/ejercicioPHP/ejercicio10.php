<?php
    $fileName = "../outputPHP/datos.json";
    var_dump(json_decode(file_get_contents($fileName)));
?>