<!DOCTYPE html>
<!-- get_club_to_view.php -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>View Club</title>
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
<?php include_once '../includes/get_club_to_view.inc.php';?>

  <!-- Add Event form to be output if the POST variables are not
  set or if the registration script caused an error. -->
  <h2>Enter a Club</h2>
  <?php echo $error_msg;?>
  <form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post" name="Get_Club_form">
    Event code: <input type="text" name="ClubID" value="<?php echo $ClubID;?>" />
    <input type="submit" value="Submit" onclick="return checkform2(this.form, this.form.ClubID);" />
    <input type="reset" />
  </form>
</body>