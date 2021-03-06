<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Clubs</title>
  <link href="css/index.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="navbar">
<ul>
  <li><a class ="active" href="index.html">Home</a></li>
  <li><a href="scheduleindex.php">Events</a></li>
  <li><a href="view_clubs.php">Clubs</a></li>
  <li style="float:right"><a href="contacts.php">Contact</a></li>
</ul>
</div>
<br/>
<img src = "http://www.togenit.com/front_media/user_images/500x500/1420736920.3034.jpg" alt = "SAO" class="center" width = 100px height = 100px>
<h2>Clubs</h2>
<table style="border: solid 1px white;">
<tr><th>Club ID</th><th>Club Name</th><th>Advisor Name</tr>

<span style="color:white;"><?php
class TableRows extends RecursiveIteratorIterator {
  function __construct($it) {
    parent::__construct($it, self::LEAVES_ONLY);
  }
  function current() {
    return "<td style='border:1px solid white;'>" . parent::current() . "</td>";
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
  $sth = $dbh->prepare("SELECT ClubID, Cdescript , AdvLName
                        FROM CLub NATURAL JOIN Advisor ORDER BY ClubID");
  $sth->execute();

  // set the resulting array to associative
  $result = $sth->setFetchMode(PDO::FETCH_ASSOC);
  foreach(new TableRows(new RecursiveArrayIterator($sth->fetchAll())) as $k=>$v) {
     echo $v;
  }
}
catch(PDOException $e) {
  echo "Error: " . $e->getMessage();
}
$dbh = null;
?></span>

</table>
</body>
</html>
