<html>
    <head>


        <meta charset="utf-8">
        <!-- importer le fichier de style -->
        <script type="text/javascript" src="js/index.js"></script>
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


            
       
<?php session_start();

  $_SESSION["username"]=$_POST["username"];

    $user = $_SESSION["username"];


$servername = "localhost";
$username = "aouridy";
$password = "parisberlinY7";
$dbname = "saodb";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT Cdescript FROM Club WHERE ClubID = '".$user."'";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "Welcome: "  . $row["Cdescript"]. "<br>";
    }
} else {
    echo "0 results";
}
$conn->close();



            ?>


     <!--   <form  method="post">
<input type="hidden" name="username" placeholder="Club Id" id="user"  value = "<?php echo $_SESSION["username"]?>">
<button name='pcode' type='submit'  value="<?php echo $_POST["username"]?>" formmethod='POST'  onclick="return submitForm(this.form);">CHECK </button> 
</form> 
-->



        <div class="navbar">

  <div class="dropdown">
    <button class="dropbtn">Home 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
       <a href="welcomeclub.php?user=$username">Go back home</a>
      </div>
  </div> 




   <div class="dropdown">
    <button class="dropbtn">Clubs 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="view_club_club.php?user=<?php echo $user?>">View all clubs</a>
      <a href="#"></a>
      <a href="#"></a>
    </div>
  </div> 



   <div class="dropdown">
    <button class="dropbtn">Events 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="all_events_club.php?user=<?php echo $user?>">View all events</a>
    <a href="eventschedule.php?user=<?php echo $user?>">View all approved events</a>
    <a href="new_event_club.php?user=<?php echo $user?>">Add an event</a>
    </div>
  </div> 



  <div class="dropdown">
    <button class="dropbtn">Members 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="view_members_club.php?user=<?php echo $user?>">View all members</a>
    <a href="add_a_member.php?user=<?php echo $user?>">Add a member</a>
    <a href="update_member.php?user=<?php echo $user?>">Update a member</a>
    </div>
  </div> 
<div class="dropdown">
    <button class="dropbtn">Board 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="view_board.php?user=<?php echo $user?>">View all board members</a>
    <a href="add_board.php?user=<?php echo $user?>">Add a board member</a>
    <a href="delete_board.php?user=<?php echo $user?>">Delete a member</a>
    </div>
  </div>  

</div>
    
<img src = "http://www.togenit.com/front_media/user_images/500x500/1420736920.3034.jpg" alt = "SAO" class="center" width = 100px height = 100px>
        <div id="content">
            <!-- tester si l'utilisateur est connecté -->
            <?php

           // echo $_POST["username"];
            

               /* if($_SESSION['username'] !== ""){
                    $user = $_SESSION['username'];
                    // afficher un message
                    echo "Welcome a sii - $user";
		    echo '<br /><br /><a href = "logout.php"> Sign Out</a>';
                }
*/                 // echo "Welcome a sii - $user";
            echo '<br /><br /><a href = "logout.php"> Sign Out</a>';
            ?>
            
        </div>


    </body>
</html>