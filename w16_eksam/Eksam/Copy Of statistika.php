<?php 
	$python = 'python Statistika.py';
	
?>
<!DOCTYPE html>
<head>
	<meta charset="utf-8">
	<title>Statistika</title>
	<script type="text/javascript">
  function handleClickB() {
var fh = fopen("stat.txt", 0); // Open the file for reading
if(fh!=-1) // If the file has been successfully opened
{         // Get the length of the file    
    var str = fread(fh, -1);     // Read in the entire file
    fclose(fh);
}
var fh2 = fopen("stat.txt", 3); // Open the file for writing

if(fh2!=-1) // If the file has been successfully opened
{
	var today = new Date(Date.now());
    var newdate = new Date(today.getYear()+1900,today.getMonth(), today.getDate()-Math.random() *30, Math.random()*24, Math.random()*60);
	var newendfate = new Date(newdate.getYear()+1900,newdate.getMonth(), newdate.getDate(), newdate.getHour()+Math.random()*24, Math.random()*60);
    var str2 = toString(intval(toString.split(",")[0])+1)+","+toString(newdate)+","+toString(newdate)+","+toString(newendfate)+","+0+","+Math.random()*150;
    fwrite(fh2, str2); // Write the string to a file
    fclose(fh2); // Close the file
}

} 
</script>
<script type="text/javascript"> 
  function handleClickA(myRadio) {
var selectedValueA = myRadio.value;
}
</script>
<script type="text/javascript">
function handleClickT(myRadio) {
var selectedValueT = myRadio.value;
}
</script>
<script type="text/javascript">
window.onload = function () {
	var[] ajad = {"päevas","nädalas","kuus"};
	var[] tyybid = {"Elektri","Rahalised ","Kütte"};
    var chart = new CanvasJS.Chart("chartContainer",
    {

      title:{
      text: tyybid[selectedValueT-1]+"kulud "+ajad[selectedValueA-1]
      },
	  data: [
      {
        type: "line",

        dataPoints: $python
      }
      ]
    });

    chart.render();
  }
</script>
 <script type="text/javascript" src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</head>
<html lang="et">
<body>
<h1></h1>
<label>Sisesta suvaline kirje</label><br>
<input type="submit" name="randomsubmit" value="Salvesta" onclick="handleClickB">
<!--<span><?php if($error1==True){ echo "Auto on juba parklas!";}?></span>
-->
<p>Vali näidatav periood:</p>
<input type="radio" id="p2ev" name="aeg" value="1" onclick="handleClickA(this)">
<label for="p2ev">Päev</label>
<input type="radio" id="n2dal" name="aeg" value="2" onclick="handleClickA(this)">
<label for="n2dal">Nädal</label>
<input type="radio" id="kuu" name="aeg" value="3" onclick="handleClickA(this)">
<label for="kuu">Kuu</label><br>
<p>Vali andmete tüüp:</p>
<input type="radio" id="elekter" name="tyyp" onclick="handleClickT(this)">
<label for="p2ev">Elekter</label>
<input type="radio" id="raha" name="tyyp" onclick="handleClickT(this)">
<label for="p2ev">Raha</label>
<input type="radio" id="kyte" name="tyyp" onclick="handleClickT(this)">
<label for="p2ev">Küte</label><br>
<br>
<br>
<div id="chartContainer" style="height: 300px; width: 100%;">
  </div>
</body>
</html>