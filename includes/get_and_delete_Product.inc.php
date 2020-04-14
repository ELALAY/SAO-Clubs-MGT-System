<?php
//
// get_product_to_update.inc.php
//

$error_msg = "";
$pcode = "";

if ($_SERVER["REQUEST_METHOD"] == "POST")
{
  // Get data from form
  $pcode = $_POST["pcode"];

  // Connect to database server
  include_once 'db_connect.php';

  try {
    // Set the PDO error mode to exception
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Check whether the submitted product already exists
    $sql = "SELECT ProdCode
            FROM Product
            WHERE ProdCode = :pcode";

    $sth = $dbh->prepare($sql);
    $sth->bindParam(':pcode', $pcode);
    // Execute the prepared query.
    $res = $sth->execute();
    $record = $sth->fetchAll();

    if (count($record) == 0)
    {
      // A product with this code does not exists
      $error_msg = "<p>A product with this code does not exists.</p>";
    }
    else
    {
      $sql2 = "DELETE FROM Product
              WHERE ProdCode = :pcode";

      $sth2 = $dbh->prepare($sql2);
      $sth2->bindParam(':pcode', $pcode);
      // Execute the prepared query.
      $res = $sth2->execute();
      // A Message that the product was deleted
      //$error_msg = "<p>The product has been deleted</p>";
      $message = "product deleted!";
      echo "<script type='text/javascript'>alert('$message');</script>";
      header('location: index.html');
      exit();
    }
  }
  catch(PDOException $e)
  {
    echo "Database error: " . $e->getMessage();
  }

  $dbh = null;
}
