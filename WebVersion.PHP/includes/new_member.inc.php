<?php
//
// New_Event.inc.php
//

$error_msg = "";
date_default_timezone_set('UTC');  // This is needed to get the current date

// Set the following variables to initialize the form fields.
$StudID = $ClubID = $sem = $year ="";


if ($_SERVER["REQUEST_METHOD"] == "POST")
{
  // Get data from form
  $StudID       = $_POST["StudID"];
  $ClubID     = $_POST["ClubID"];
  $sem = $_POST["sem"];
  $year   = $_POST["year"];
 

  // Connect to database server
  include_once 'db_connect.php';

  try
  {
    // Set the PDO error mode to exception
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Check whether the Evt submitted already exists
    $sql = "SELECT StudID
            FROM member
            WHERE StudID = :StudID AND ClubID = :ClubID";

    $sth = $dbh->prepare($sql);
    $sth->bindParam(':StudID', $StudID);
    // Execute the prepared query.
    $res = $sth->execute();
    $record = $sth->fetchAll();

    if (count($record) > 0)
    {
      // A Evt with this code already exists
      $error_msg = "<p>A Student with this code already exists; no StudID added.</p>";
    }

    else 
    {
      // Insert the new Evt into the the Evt table
      $sql = "call add_member(:StudID,:ClubID,:sem,:year)";

      $sth = $dbh->prepare($sql);
      $sth->bindParam(':StudID'      , $StudID);
      $sth->bindParam(':ClubID'    , $ClubID);
      $sth->bindParam(':sem', $sem);
      $sth->bindParam(':year'  , $year);

 
      // Execute the prepared query.
      $sth->execute();
      $message = "Student succesfully added!";
      echo "<script type='text/javascript'>alert('$message');</script>";

      header('Location: welcomeclub.php');
      exit();
    }
  }
  catch(PDOException $e)
  {
    $error_msg = "<p>Database error: " . $e->getMessage() . "</p>";
  }

  $dbh = null;
}
