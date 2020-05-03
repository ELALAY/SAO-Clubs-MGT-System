<?php
//
// New_Board.inc.php
//

$error_msg = "";
date_default_timezone_set('UTC');  // This is needed to get the current date

// Set the following variables to initialize the form fields.
$StudID = $ClubID = $sem = $year = $ranking = "";


if ($_SERVER["REQUEST_METHOD"] == "POST")
{
  // Get data from form
  $StudID       = $_POST["StudID"];
  $ClubID     = $_POST["ClubID"];
  $sem = $_POST["sem"];
  $year   = $_POST["year"];
  $ranking   = $_POST["ranking"];
 

  // Connect to database server
  include_once 'db_connect.php';

  try
  {
    // Set the PDO error mode to exception
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Check whether the Board member submitted already exists
    $sql = "SELECT StudID
            FROM Board
            WHERE StudID = :StudID AND ClubID = :ClubID";

    $sth = $dbh->prepare($sql);
    $sth->bindParam(':StudID', $StudID);
    // Execute the prepared query.
    $res = $sth->execute();
    $record = $sth->fetchAll();

    if (count($record) > 0)
    {
      // A board member with this code already exists
      $error_msg = "<p>A Student with this code already exists in this board; no StudID added.</p>";
    }

    else 
    {
      // Insert the new Board into the the Board table
      $sql = "call add_board(:StudID,:ClubID,:sem,:year,:ranking)";

      $sth = $dbh->prepare($sql);
      $sth->bindParam(':StudID', $StudID);
      $sth->bindParam(':ClubID' , $ClubID);
      $sth->bindParam(':sem', $sem);
      $sth->bindParam(':year', $year);
      $sth->bindParam(':ranking', $ranking);
 
      // Execute the prepared query.
      $sth->execute();
      $message = "Board Member succesfully added!";
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
