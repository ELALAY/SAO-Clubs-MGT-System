<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Events Schedule</title>
	</head>
	<body>
		<div>
			<h3>Envents Schedule</h3>
		<?php
		echo "<table style='border: solid 1px black;'>";
		echo "	<th>Event ID</th>
				<th>Club Name</th>
				<th>Event Name</th>
				<th>Event Description</th>
				<th>Location</th>
				<th>Start Time</th>
				<th>End Time</th>";
		class TableRows extends RecursiveIteratorIterator {
		 function __construct($it) {
		 parent::__construct($it, self::LEAVES_ONLY);
		 }
		 function current() {
		 return "<td style='border:1px solid black;'>" . parent::current() .
		"</td>";
		 }
		 function beginChildren() {
		 echo "<tr>";
		 }
		 function endChildren() {
		 echo "</tr>" . "\n";
		 }
		}
		$host = "localhost";
		$user = "aymanen";
		$password = "marrakec";
		$dbname = "saodb";
		try {
		 $conn = new PDO("mysql:host=$host;dbname=$dbname", $user, $password);
		 $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
		 $stmt = $conn->prepare("SELECT EvtID, c.CName, EvtName, EvtDescript, 
		 								EvtLocation, EvtStart, EvtEnd
		 						 FROM event NATURAL JOIN Club as c");
		 $stmt->execute();
		 
		 // set the resulting array to associative
		 $result = $stmt->setFetchMode(PDO::FETCH_ASSOC);
		 foreach(new TableRows(new RecursiveArrayIterator($stmt->fetchAll())) as
		$k=>$v) {
		 echo $v;
		}
		}
		catch(PDOException $e) {
		 echo "Error: " . $e->getMessage();
		}
		$conn = null;
		echo "</table>";
		?>
		<p>Go back to <a href="events.html">Events choice</a>.</p>
		<p>Go back to <a href="../welcome.html">main page</a>.</p>
	</div>
</body>
</html>