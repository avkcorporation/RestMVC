<?php
/**
 * User: Alexander Kononenko
 *
 * Create request for rest service
 */
$a= 0;
$b= 0;

if (isset($_GET['a']))  {$a = $_GET['a'];   if ($a == '')        {$a=0;} }
if (isset($_GET['b']))  {$b = $_GET['b'];   if ($b == '')        {$a=0;} }

$url = "http://localhost:8080/restmvc/calc/".$a."/".$b;

//Обработка json-ответа
$ch = curl_init();
curl_setopt($ch, CURLOPT_URL, $url);
curl_setopt($ch, CURLOPT_HEADER, 0);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
// grab URL and pass it to the browser
$json=0;
$json = curl_exec($ch);
echo $json;
// close curl resource, and free up system resources
curl_close($ch);

$route = 0;
$route = json_decode($json, true);

unset($a);
unset($b);
?>