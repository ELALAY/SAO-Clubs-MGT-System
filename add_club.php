<!DOCTYPE html>
<!-- add_Club.php -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Aourid: Add Club</title>
  <script type="text/JavaScript" src="js/forms.js"></script>
</head>
<body style= "background-color: palegreen;">

<?php include_once 'includes/add_club.inc.php';?>

<!-- Add Club form to be output when doc posted
     or if the insertion script caused an error.
-->
  <h2>Add a new club</h2>
  <?php echo $error_msg;?>
  <form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post" name="add_Club_form">
    <table>
    <tr><td>Club ID: </td><td><input type="text" name="clubid" value="<?php echo $clubid;?>" /></td></tr>
    <tr><td>Club Name: </td><td><input type="text" name="cname" value="<?php echo $cname;?>" /></td></tr>
    <tr><td>Club Description: </td><td><input type="text" name="cdescript" value="<?php echo $cdescript;?>" /></td></tr>
    <tr><td>Creation Date: </td><td><input type="date" name="Ccreationdate" value="<?php echo $Ccreationdate;?>" /></td></tr>
    <tr><td>Advisor ID: </td><td><input type="text" name="advid" value="<?php echo $advid;?>" /></td></tr>
    <tr><td>Balance </td><td><input type="text" name="balance" value="<?php echo $balance;?>" /></td></tr>
    <tr><td>Club Password </td><td><input type="text" name="cpass" value="<?php echo $cpass;?>" /></td></tr>
    
    <tr><td><input type="submit" value="Submit"
               onclick="return checkform(this.form);" /></td>
        <td><input type="reset" value="Reset" 
        onclick="return reset()" /></td></tr>
    </table>
  </form>
  <p>Go back to <a href="welcome.html">main page</a>.</p>
</body>
</html>
