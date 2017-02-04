<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Store Module</title>
</head>
<body>

<?php
$file = fopen('data.json', 'a');        // open file, a - append
if($file) {                             // if file is there
   fwrite(                              // write to file
      $file,                            // specified by $file
      json_encode($_POST).PHP_EOL);     // json-encode POSTed data (add end of line)
   fclose($file);                       // close file
   echo 'Data submitted successfully. <br>'; // inform of success
}
else {
   echo 'Error opening data file.';     // inform of failure
}
?><br>

 <a href="retrieve.php">RESULTS</a>

</body>
</html>