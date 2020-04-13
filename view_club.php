<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Clubs</title>
</head>
<body style= "background-color: wheat;">
<h2>Clubs</h2>
<table style="border: solid 1px black;">
<tr><th>Club ID</th><th>Club Name</th><th>Advisor Name</tr>

<?php
class TableRows extends RecursiveIteratorIterator {
  function __construct($it) {
    parent::__construct($it, self::LEAVES_ONLY);
  }
  function current() {
    return "<td style='border:1px solid black;'>" . parent::current() . "</td>";
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
?>

</table>
</body>
  <p>Go back to <a href="clubs.html">main page</a>.</p>
</html>
