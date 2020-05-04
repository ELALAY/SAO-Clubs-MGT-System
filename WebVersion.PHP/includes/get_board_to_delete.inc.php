<?php
//
// get_product_to_delete.inc.php
//

$error_msg = "";
$pcode = "";

if ($_SERVER["REQUEST_METHOD"] == "POST")
{
  // Get data from form
  $clubid = $_POST["clubid"];
  $studid = $_POST["studid"];

  // Connect to database server
  include_once 'db_connect.php';

  try {
    // Set the PDO error mode to exception
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Check whether the submitted product already exists
    $sql = "SELECT *
            FROM Board
            WHERE StudID = '".$studid."' AND ClubID = '".$clubid."'";

    $sth = $dbh->prepare($sql);
    $sth->bindParam(':clubid', $clubid);
    $sth->bindParam(':studid', $studid);
    
    // Execute the prepared query.
    $res = $sth->execute();
    $record = $sth->fetchAll();

    if (count($record) == 0)
    {
      // A board member with this id in this club does not exist
      $error_msg = "<p>A board member with this id in this club does not exist.</p>";
    }
    else
    {
	
	// Delete the product from the Product table
      	$sql = "DELETE FROM Board
                WHERE StudID = '".$studid."' AND ClubID = '".$clubid."'";
	$sth = $dbh->prepare($sql);
    	$sth->bindParam(':pcode', $pcode);
	$res = $sth->execute();
	$error_msg = "<p> Board member deleted successfully.</p>";
  echo $error_msg;

	// Go to the page with product catalog
      //	header("Location:view_members_club.php");
	exit();
    }
  }
  catch(PDOException $e)
  {
    echo "Database error: " . $e->getMessage();
  }

	$dbh = null;
}
