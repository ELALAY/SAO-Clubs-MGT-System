<!DOCTYPE html>
<!-- get_Event_to_update.php -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Delete Event</title>
</head>
<body>
<?php include_once '../includes/get_and_delete_event_club.inc.php';?>

  <!-- Add Event form to be output if the POST variables are not
  set or if the registration script caused an error. -->
<br/>
<img src = "https://lh3.googleusercontent.com/proxy/mhzWA2-LZ2V6ZTmqU9-I31CtIuNcXf5wI9wiVYOgDpc6M-7bevVDf_Pj9QraSCeOgvLHQAmX-QeIeHiZdJNvtAO64U6D7Y0GdLBNSZOOcarK3jz5DIarjWMaR23BRzTmVB4" alt = "SAO" class="center" width = 100px height = 100px>
  <h2>Enter an Event</h2>
  <?php echo $error_msg;?>
  <form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post" name="Delete_Event_form">
    Event code: <input type="text" name="EvtID" value="<?php echo $EvtID;?>" />
    <input type="submit" value="Submit" onclick="return checkform2(this.form, this.form.EvtID);" />
    <input type="reset" />
  </form>
  <p>Go back to <a href="eventsclubs.php">main page</a>.</p>
</body>
</html>
