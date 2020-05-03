<!DOCTYPE html>
<!-- New_Event.php -->
  <html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>New Event</title>
    <script type="text/JavaScript" src="js/forms.js"></script>
        <link href="css/index.css" rel="stylesheet" type="text/css">

<style>
.dropbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #3e8e41;}
</style>


    </head>
    <body>

<form action="view_members_club.php" method="post">
<input type="hidden" name="username" placeholder="Club Id" id="username" required value = "<?php echo $_POST["username"]?>">

</form>

        <div class="navbar">

  <div class="dropdown">
    <button class="dropbtn">Home 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
       <a href="welcomeclub.php">Go back home</a>
      </div>
  </div> 




   <div class="dropdown">
    <button class="dropbtn">Clubs 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="view_club_club.php">View all clubs</a>
      <a href="#"></a>
      <a href="#"></a>
    </div>
  </div> 



   <div class="dropdown">
    <button class="dropbtn">Events 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="all_events_club.php">View all events</a>
    <a href="eventschedule.php">View all approved events</a>
    <a href="new_event_club.php">Add an event</a>
    </div>
  </div> 



  <div class="dropdown">
    <button class="dropbtn">Members 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="view_members_club.php">View all members</a>
    <a href="add_member.php">Add a member</a>
    <a href="update_member.php">Update a member</a>
    </div>
  </div> 
<div class="dropdown">
    <button class="dropbtn">Board 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="view_board.php">View all board members</a>
    <a href="add_board.php">Add a board member</a>
    <a href="delete_board.php">Delete a member</a>
    </div>
  </div>  
</div>
<img src = "http://www.togenit.com/front_media/user_images/500x500/1420736920.3034.jpg" alt = "SAO" class="center" width = 100px height = 100px>
    <?php include_once 'includes/new_event.inc.php';?>

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
