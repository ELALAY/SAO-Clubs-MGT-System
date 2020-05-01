<!DOCTYPE html>
<!-- add_Club.php -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Add Club</title>
  <script type="text/JavaScript" src="js/forms.js"></script>
   <script type="text/javascript" src="js/index.js"></script>
        <link href="css/index.css" rel="stylesheet" type="text/css">
    </head>
    <body>
	<div class="navbar">
	<ul>
  		<li><a class ="active" href="welcomeadvisor.php">Home</a></li>
  		<li><a href="eventsadvisor.php">Events</a></li>
  		<li><a href="view_club_advisor.php">Clubs</a></li>
		<li><a href="get_club_to_view.php">Members</a></li>
  		<li style="float:right"><a href="contact.php">Contact</a></li>
	</ul>
	</div>
<br/>
<img src = "https://lh3.googleusercontent.com/proxy/mhzWA2-LZ2V6ZTmqU9-I31CtIuNcXf5wI9wiVYOgDpc6M-7bevVDf_Pj9QraSCeOgvLHQAmX-QeIeHiZdJNvtAO64U6D7Y0GdLBNSZOOcarK3jz5DIarjWMaR23BRzTmVB4" alt = "SAO" class="center" width = 100px height = 100px>
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
</body>
</html>
