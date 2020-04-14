<?php
//
// New_Event.inc.php
//

$error_msg = "";
date_default_timezone_set('UTC');  // This is needed to get the current date

// Set the following variables to initialize the form fields.
$EvtID = $EvtName = $EvtDescript = $EvtBudget = $EvtLocation = $EvtStart ="";
$ClubID  = $EvtEnd = "";

if ($_SERVER["REQUEST_METHOD"] == "POST")
{
  // Get data from form
  $EvtID       = $_POST["EvtID"];
  $EvtName     = $_POST["EvtName"];
  $EvtDescript = $_POST["EvtDescript"];
  $EvtBudget   = $_POST["EvtBudget"];
  $EvtLocation = $_POST["EvtLocation"];
  $EvtStart    = $_POST["EvtStart"];
  $EvtEnd      = $_POST["EvtEnd"];
  $ClubID      = $_POST["ClubID"];

  // Connect to database server
  include_once 'db_connect.php';

  try
  {
    // Set the PDO error mode to exception
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Check whether the Evt submitted already exists
    $sql = "SELECT EvtID
            FROM event
            WHERE EvtID = :EvtID";

    $sth = $dbh->prepare($sql);
    $sth->bindParam(':EvtID', $EvtID);
    // Execute the prepared query.
    $res = $sth->execute();
    $record = $sth->fetchAll();

    if (count($record) > 0)
    {
      // A Evt with this code already exists
      $error_msg = "<p>A Event with this code already exists; no EvtID added.</p>";
    }

    else 
    {
      // Insert the new Evt into the the Evt table
      $sql = "INSERT INTO event
                (EvtID ,EvtName ,EvtDescript ,EvtBudget ,EvtLocation ,EvtStart ,EvtEnd ,ClubID)

              VALUES
                (:EvtID , :EvtName , :EvtDescript , :EvtBudget , :EvtLocation , :EvtStart , :EvtEnd , :ClubID)";

      $sth = $dbh->prepare($sql);
      $sth->bindParam(':EvtID'      , $EvtID);
      $sth->bindParam(':EvtName'    , $EvtName);
      $sth->bindParam(':EvtDescript', $EvtDescript);
      $sth->bindParam(':EvtBudget'  , $EvtBudget);
      $sth->bindParam(':EvtLocation', $EvtLocation);
      $sth->bindParam(':EvtStart'   , $EvtStart);
      $sth->bindParam(':EvtEnd'     , $EvtEnd);
      $sth->bindParam(':ClubID'     , $ClubID);
      
 
      // Execute the prepared query.
      $sth->execute();
      $message = "Evt succesfully added!";
      echo "<script type='text/javascript'>alert('$message');</script>";

      header('Location: Events.html');
      exit();
    }
  }
  catch(PDOException $e)
  {
    $error_msg = "<p>Database error: " . $e->getMessage() . "</p>";
  }

  $dbh = null;
}
