<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Events Schedule</title>
                <script type="text/javascript" src="js/index.js"></script>
		<link href="css/index.css" rel="stylesheet" type="text/css">
	</head>
	<body>
	<div class="navbar">
	<ul>
  		<li><a class ="active" href="index.html">Home</a></li>
  		<li><a href="scheduleindex.php">Events</a></li>
  		<li><a href="view_club.php">Clubs</a></li>
  		<li style="float:right"><a href="contacts.php">Contact</a></li>
	</ul>
	</div>
		<div>
<br/>
<img src = "http://www.togenit.com/front_media/user_images/500x500/1420736920.3034.jpg" alt = "SAO" class="center" width = 100px height = 100px>
			<h3>Events Schedule</h3>
		<span style="color:white;"><?php
		echo "<table style='border: solid 1px white;'>";
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
		 return "<td style='border:1px solid white;'>" . parent::current() .
		"</td>";
		 }
		 function beginChildren() {
		 echo "<tr>";
		 }
		 function endChildren() {
		 echo "</tr>" . "\n";
		 }
		}
		// Connect to database server
			include_once 'includes/db_connect.php';
		try {
		 $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
		 $stmt = $dbh->prepare("SELECT EvtID, c.CName, EvtName, EvtDescript, 
		 								EvtLocation, EvtStart, EvtEnd
		 						 FROM event NATURAL JOIN Club as c
		 						 WHERE SAOApproval = 1 AND ADVApproval = 1;");
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
		?></span>
	</div>
</body>
</html>