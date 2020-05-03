<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Delete Board Member</title>
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

        <div class="navbar">


      <a class ="active" href="welcomeclub.php   ">
 <img alt="" src="icons/home.png"
         width="32" height="32">
      </a>
   

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
    <a href="add_a_member.php">Add a member</a>
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
<?php include_once 'includes/get_board_to_delete.inc.php';?>

  <!-- Delete product form to be output if the POST variables are not
  set or if the deletion script caused an error. -->
  <h2>Enter the board member to delete</h2>
  <?php echo $error_msg;?>
  <form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post" name="Delete_board_form">
    Club ID: <input type="text" name="clubid" value="" />
    Student ID: <input type="text" name="studid" value="" />
    <input type="submit" value="Submit" onclick="return checkform2(this.form, this.form.clubid, this.form.studid);" />
    <input type="reset" />
  </form>
</body>
</html>
