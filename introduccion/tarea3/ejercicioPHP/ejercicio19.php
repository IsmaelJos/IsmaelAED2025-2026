<?php
    $fileName = "../outputPHP/tweets.txt";
    if(!file_exists($fileName)){
        $file = fopen($fileName, "w");
        fwrite($file, date("[Y-m-d h:i]")." Aprendiendo PHP con ejercicios divertidos #php \n");
        fclose($file);
    }else{
        $tweets = file_get_contents($fileName);
        $tweets .= date("[Y-m-d h:i]")." Otro día más programando \n";
        file_put_contents($fileName, $tweets);
    }

    $arrTweets = file($fileName);
    for ($i=5; $i > 0 ; $i--) { 
        echo $arrTweets[count($arrTweets)-$i];
    }
    
?>