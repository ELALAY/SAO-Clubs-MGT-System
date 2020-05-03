<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
        <!-- importer le fichier de style -->
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
<img src = "http://www.togenit.com/front_media/user_images/500x500/1420736920.3034.jpg" alt = "SAO" class="center" width = 100px height = 100px>
 <table style="border: solid 1px white;">
<tr><th>Option</th><th> Student ID</th><th>Club ID</th><th>Semester</th><th> Year</th><th>Active</tr>

  <?php
class TableRows extends RecursiveIteratorIterator {
  function __construct($it) {
    parent::__construct($it, self::LEAVES_ONLY);
  }
  function current() {
    return "<td style='border:1px solid white;'>" . parent::current() . "</td>";
  }
  function beginChildren() {
     echo "<tr><td style='border:1px solid black;'>
          <button name='pcode' type='submit' formaction='view_member.php' value='" . parent::current() .
             "' formmethod='POST' >View</button>
          <button name='pcode' type='submit' formaction='upd_member.php' value='" . parent::current() .
             "' formmethod='POST'>Upd</button>
          <button name='pcode' type='submit' formaction='del_member.php'  value='" . parent::current() .
             "' formmethod='POST'>Del</button></td>
           
             \n";


  }
  function endChildren() {
    echo "</tr>" . "\n";
  }
}


// Connect to database server
include_once 'includes/db_connect.php';

//include_once 'loginclub.php';


//$user=$_POST["usernames"];
//$username = mysqli_real_escape_string($db,htmlspecialchars($_POST['username'])); 


//echo "Bonjour $username ";

//$user=$_REQUEST['user'];

$user= $_REQUEST['user'];

echo $user;

try {
  $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
  $sth = $dbh->prepare("call view_club_members('".$user."') ");
  $sth->execute();

  // set the resulting array to associative
  $result = $sth->setFetchMode(PDO::FETCH_ASSOC);
  foreach(new TableRows(new RecursiveArrayIterator($sth->fetchAll())) as $k=>$v) {
     echo $v;
  }
}
catch(PDOException $e) {
  echo "Error: " . $e->getMessage();
}
$dbh = null;
?></span>

</table>
</body>
</html>
