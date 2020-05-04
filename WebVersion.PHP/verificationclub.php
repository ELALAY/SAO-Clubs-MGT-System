

<?php

if(isset($_POST['username']) && isset($_POST['password']))
{
    // connexion à la base de données
    $db_username = 'un';
    $db_password = 'pw';
    $db_name     = 'dbname';
    $db_host     = 'localhost';
    $db = mysqli_connect($db_host, $db_username, $db_password,$db_name)
           or die('could not connect to database');


    // This part of the code was taken from Internet 
    // on applique les deux fonctions mysqli_real_escape_string et htmlspecialchars
    // pour éliminer toute attaque de type injection SQL et XSS
    $username = mysqli_real_escape_string($db,htmlspecialchars($_POST['username'])); 
    $password = mysqli_real_escape_string($db,htmlspecialchars($_POST['password']));
    
    if($username !== "" && $password !== "")
    {
        $requete = "SELECT count(*) FROM club where 
              ClubID = '".$username."' and CPass = '".$password."' ";
	$query = "SELECT CName FROM club where 
              ClubID = '".$username."' and CPass = '".$password."' ";
	$res = mysqli_query($query);
        $exec_requete = mysqli_query($db,$requete);
        $reponse      = mysqli_fetch_array($exec_requete);
        $count = $reponse['count(*)'];
        if($count==1) // nom d'utilisateur et mot de passe correctes
        {
           $_SESSION['username'] = $res;
           header('Location: welcomeclub.php?');
        }
        else
        {
           header('Location: loginclub.php?erreur=1'); 
        }
    }
    else
    {
       header('Location: loginclub.php?erreur=2'); 
    }
}
else
{
   header('Location: loginclub.php');
}
mysqli_close($db); 
?>

