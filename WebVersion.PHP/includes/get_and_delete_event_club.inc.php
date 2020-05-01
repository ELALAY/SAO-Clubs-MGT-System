<?php
//
// get_Event_to_update.inc.php
//

$error_msg = "";
$EvtID = "";

if ($_SERVER["REQUEST_METHOD"] == "POST")
{
  // Get data from form
  $EvtID = $_POST["EvtID"];

  // Connect to database server
  include_once 'db_connect.php';

  try {
    // Set the PDO error mode to exception
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Check whether the submitted Event already exists
    $sql = "SELECT EvtID
            FROM Event
            WHERE EvtID = :EvtID";

    $sth = $dbh->prepare($sql);
    $sth->bindParam(':EvtID', $EvtID);
    // Execute the prepared query.
    $res = $sth->execute();
    $record = $sth->fetchAll();

    if (count($record) == 0)
    {
      // A Event with this code does not exists
      $error_msg = "<p>A Event with this code does not exists.</p>";
    }
    else
    {
      $sql2 = "DELETE FROM Event
              WHERE EvtID = :EvtID";

      $sth2 = $dbh->prepare($sql2);
      $sth2->bindParam(':EvtID', $EvtID);
      // Execute the prepared query.
      $res = $sth2->execute();
      // A Message that the Event was deleted
      //$error_msg = "<p>The Event has been deleted</p>";
      $message = "Event deleted!";
      echo "<script type='text/javascript'>alert('$message');</script>";
      header('location: eventsclubs.php');
      exit();
    }
  }
  catch(PDOException $e)
  {
    echo "Database error: " . $e->getMessage();
  }

  $dbh = null;
}
