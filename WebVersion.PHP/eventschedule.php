<!DOCTYPE html>
<!-- New_Event.php -->
  <html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>Add member</title>
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
    <a href="add_a_member.php">Add a member</a>
    <a href="update_member.php>">Update a member</a>
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
			<h3>Events Schedule</h3>
		<span style="color:white;"><?php
		echo "<table style='border: solid 1px white;'>";
		echo "	<th>Event ID</th>
				<th>Club Name</th>
				<th>Event Name</th>
				<th>Event Description</th>
				<th>Location</th>
				<th>Start Time</th>
				<th>End Time</th>";
		class TableRows extends RecursiveIteratorIterator {
		 function __construct($it) {
		 parent::__construct($it, self::LEAVES_ONLY);
		 }
		 function current() {
		 return "<td style='border:1px solid white;'>" . parent::current() .
		"</td>";
		 }
		 function beginChildren() {
		 echo "<tr>";
		 }
		 function endChildren() {
		 echo "</tr>" . "\n";
		 }
		}
		// Connect to database server
			include_once 'includes/db_connect.php';
		try {
		 $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
		 $stmt = $dbh->prepare("SELECT EvtID, c.CName, EvtName, EvtDescript, 
		 								EvtLocation, EvtStart, EvtEnd
		 						 FROM event NATURAL JOIN Club as c
		 						 WHERE SAOApproval = 1 AND ADVApproval = 1;");
		 $stmt->execute();
		 
		 // set the resulting array to associative
		 $result = $stmt->setFetchMode(PDO::FETCH_ASSOC);
		 foreach(new TableRows(new RecursiveArrayIterator($stmt->fetchAll())) as
		$k=>$v) {
		 echo $v;
		}
		}
		catch(PDOException $e) {
		 echo "Error: " . $e->getMessage();
		}
		$conn = null;
		echo "</table>";
		?></span>
	</div>
</body>
</html>