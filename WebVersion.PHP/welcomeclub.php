<html>
    <head>
        <meta charset="utf-8">
        <!-- importer le fichier de style -->
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
	</div>
<img src = "https://lh3.googleusercontent.com/proxy/mhzWA2-LZ2V6ZTmqU9-I31CtIuNcXf5wI9wiVYOgDpc6M-7bevVDf_Pj9QraSCeOgvLHQAmX-QeIeHiZdJNvtAO64U6D7Y0GdLBNSZOOcarK3jz5DIarjWMaR23BRzTmVB4" alt = "SAO" class="center" width = 100px height = 100px>
        <div id="content">
            <!-- tester si l'utilisateur est connecté -->
            <?php
                session_start();
                if($_SESSION['username'] !== ""){
                    $user = $_SESSION['username'];
                    // afficher un message
                    echo "Welcome - $user";
		    echo '<br /><br /><a href = "logout.php">Sign Out</a>';
                }
            ?>
            
        </div>
    </body>
</html>