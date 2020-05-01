<!DOCTYPE html>
<!-- get_Event_to_update.php -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Delete Event</title>
</head>
<body>
<?php include_once '../includes/get_and_delete_Event.inc.php';?>

  <!-- Add Event form to be output if the POST variables are not
  set or if the registration script caused an error. -->
  <h2>Enter a Event</h2>
  <?php echo $error_msg;?>
  <form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post" name="Delete_Event_form">
    Event code: <input type="text" name="EvtID" value="<?php echo $EvtID;?>" />
    <input type="submit" value="Submit" onclick="return checkform2(this.form, this.form.EvtID);" />
    <input type="reset" />
  </form>
  <p>Go back to <a href="Events.html">main page</a>.</p>
</body>
</html>
