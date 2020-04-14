<!DOCTYPE html>
<!-- New_Event.php -->
  <html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>New Event</title>
    <script type="text/JavaScript" src="js/forms.js"></script>
  </head>
  <body>

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
    <p>Go back to <a href="../welcome.html">main page</a>.</p>
  </body>
</html>
