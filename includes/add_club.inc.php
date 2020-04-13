<?php
//
// add_product.inc.php
//

$error_msg = "";
date_default_timezone_set('UTC');  // This is needed to get the current date

// Set the following variables to initialize the form fields.
$clubid =$cname =$cdescript =$advid = $balance = $cpass = "";
$ccreationdate = date('Y-m-d');  // get current date

if ($_SERVER["REQUEST_METHOD"] == "POST")
{
  // Get data from form
  $clubid = $_POST["clubid"];
  $cname = $_POST["cname"];
  $cdescript =  $_POST["cdescript"];
  $ccreationdate =  $_POST["Ccreationdate"];
  $advid = $_POST["advid"];
  $balance = $_POST["balance"];
  $cpass = $_POST["cpass"];

  // Connect to database server
  include_once 'db_connect.php';

  try
  {
    // Set the PDO error mode to exception
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Check whether the product submitted already exists
    $sql = "SELECT ClubID
            FROM Club
            WHERE ClubID = :clubid";

    $sth = $dbh->prepare($sql);
    $sth->bindParam(':clubid', $clubid);
    // Execute the prepared query.
    $res = $sth->execute();
    $record = $sth->fetchAll();

    if (count($record) > 0)
    {
      // A product with this code already exists
      $error_msg = "<p>A product with this code already exists; no product added.</p>";
    }

    //Check if the vendor exists
  $sql = "SELECT Advid
            FROM Advisor
            WHERE advid = :advid";

    $sth = $dbh->prepare($sql);
    $sth->bindParam(':advid', $advid);
    // Execute the prepared query.
    $res = $sth->execute();
    $record = $sth->fetchAll();

    if (! $record)
    {
      // Vendor does not exist
      $error_msg = "<p>Advisor does not exist</p>";
    }
//Check if quantity is less than minimum quantity
   // else if($qoh<$min){
    //$error_msg = "<p>A Club not added. Quantity On Hand cannot be less than minimum quantity.</p>";
    //}
    else 
    {
      // Insert the new product into the the Product table
      $sql = "INSERT INTO Club
                (ClubID, CName, CDescript, Ccreationdate, AdvID, Balance, Cpass)
              VALUES
                (:clubid, :cname, :cdescript, :ccreationdate, :advid, :balance, :cpass)";

      $sth = $dbh->prepare($sql);
      $sth->bindParam(':clubid', $clubid);
      $sth->bindParam(':cname', $cname);
      $sth->bindParam(':cdescript', $cdescript);
      $sth->bindParam(':ccreationdate', $ccreationdate);
      $sth->bindParam(':advid', $advid);
      $sth->bindParam(':balance', $balance);
      $sth->bindParam(':cpass', $cpass);
      
 
      // Execute the prepared query.
      $sth->execute();
      $message = "Club succesfully added!";
      echo "<script type='text/javascript'>alert('$message');</script>";

      header('Location: clubs.html');
      exit();
    }
  }
  catch(PDOException $e)
  {
    $error_msg = "<p>Database error: " . $e->getMessage() . "</p>";
  }

  $dbh = null;
}
