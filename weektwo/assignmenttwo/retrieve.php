<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Retrieve Module</title>
</head>
<body>
    <h1>Data Retrieved</h1>

<?php
$male = 0;
$female = 0;

$file = fopen('data.json', 'r')         // open file, 'r' - read
   or exit('Data not found.');          // or give error message and exit
while(!feof($file))                     // while end of file not reached
{
   $line = fgets($file);                // get one line
   $data = json_decode($line, TRUE);    // json-decode it, TRUE - associative array
   if (is_array($data)) {               // if decoded data is an array
      foreach ($data as $key => $value) // iterate through associative array
      {
         if($value == 'male') {
            $males++;
         }
         echo htmlspecialchars($value).' '; // show key=value pairs, escape html
      }
      echo ',<br>'.PHP_EOL;              // start a new line
   }
}
fclose($file);    

$male_angle = 120;
$female_angle = 240;
                      // close file
?>

<script src="piechart.js"></script>
<canvas id="piechart1" width="200" height="200"></canvas>

<script>
   piechart(
      "piechart1", 
      ["red", "yellow", "green"], 
      [<?php eco $male_angle; ?>, ]
   );
</script>
</body>
</html>