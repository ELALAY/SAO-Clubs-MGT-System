<!DOCTYPE html>
<!-- New_Event.php -->
  <html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>New Event</title>
    <script type="text/JavaScript" src="js/forms.js"></script>
  <script type="text/javascript" src="js/index.js"></script>
        <link href="css/index.css" rel="stylesheet" type="text/css">
    </head>
    <body>
	<div class="navbar">
	<ul>
  		<li><a class ="active" href="welcomeclub.php">Home</a></li>
  		<li><a href="eventsclubs.php">Events</a></li>
  		<li><a href="view_club_club.php">Clubs</a></li>
		<li><a href="view_members_club.php">Members</a></li>
		<li><a href="boardclub.php">Board</a></li>
  		<li style="float:right"><a href="contacts.php">Contact</a></li>
	</ul>
<img src = "https://lh3.googleusercontent.com/proxy/mhzWA2-LZ2V6ZTmqU9-I31CtIuNcXf5wI9wiVYOgDpc6M-7bevVDf_Pj9QraSCeOgvLHQAmX-QeIeHiZdJNvtAO64U6D7Y0GdLBNSZOOcarK3jz5DIarjWMaR23BRzTmVB4" alt = "SAO" class="center" width = 100px height = 100px>
    <?php include_once '../includes/new_event.inc.php';?>

    <!-- Add Event form to be output when doc posted
       or if the insertion script caused an error.
    -->
    <h2>Create a new event</h2>
    <?php echo $error_msg;?>
    <form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post" name="new_event_form">
      <table>
      
      <tr><td>Event ID: </td><td><input type="text" name="EvtID" value="<?php echo $EvtID;?>" /></td></tr>
      
      <tr><td>Event Name: </td><td><input type="text" name="EvtName" value="<?php echo $EvtName;?>" /></td></tr>
      
      <tr><td>Event Description: </td><td><input type="text" name="EvtDescript" value="<?php echo $EvtDescript;?>" /></td></tr>
      
      <tr><td>Event Budget </td><td><input type="text" name="EvtBudget" value="<?php echo $EvtBudget;?>" /></td></tr>
      
      <tr><td>Location </td><td><input type="text" name="EvtLocation" value="<?php echo $EvtLocation;?>" /></td></tr>
      
      <tr><td>Start Date: </td><td><input type="date" name="EvtStart" value="<?php echo $EvtStart;?>" /></td></tr>
      
      <tr><td>End Date: </td><td><input type="date" name="EvtEnd" value="<?php echo $EvtEnd;?>" /></td></tr>

      <tr><td>Club ID: </td><td><input type="text" name="ClubID" value="<?php echo $ClubID;?>" /></td></tr>
      
      <tr><td><input type="submit" value="Submit"
                 onclick="return checkform(this.form, this.form.EvtID, this.form.EvtName,
                 this.form.EvtDescript, this.form.EvtLocation, this.form,EvtBudget,
                 this.form.EvtStart, this.form.EvtEnd, this.form.ClubID);" /></td>
          <td><input type="reset" value="Reset" 
          onclick="return reset()" /></td></tr>
      </table>
    </form>
  </body>
</html>
