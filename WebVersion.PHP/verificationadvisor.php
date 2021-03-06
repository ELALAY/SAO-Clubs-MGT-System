<?php
session_start();
if(isset($_POST['username']) && isset($_POST['password']))
{
    // connexion à la base de données
    $db_username = 'root';
    $db_password = 'jehurle.1';
    $db_name     = 'events';
    $db_host     = 'localhost';
    $db = mysqli_connect($db_host, $db_username, $db_password,$db_name)
           or die('could not connect to database');
    
    // on applique les deux fonctions mysqli_real_escape_string et htmlspecialchars
    // pour éliminer toute attaque de type injection SQL et XSS
    $username = mysqli_real_escape_string($db,htmlspecialchars($_POST['username'])); 
    $password = mysqli_real_escape_string($db,htmlspecialchars($_POST['password']));
    
    if($username !== "" && $password !== "")
    {
        $requete = "SELECT count(*) FROM advisor where 
              AdvID = '".$username."' and AdvPass = '".$password."' ";
        $exec_requete = mysqli_query($db,$requete);
        $reponse = mysqli_fetch_array($exec_requete);
        $count = $reponse['count(*)'];
        if($count==1) // nom d'utilisateur et mot de passe correctes
        {
           $_SESSION['username'] = $username;
           header('Location: welcomeadvisor.php');
        }
        else
        {
           header('Location: loginadvisor.php?erreur=1'); // username or password incorrect
        }
    }
    else
    {
       header('Location: loginadvisor.php?erreur=2'); // username or password field empty
    }
}
else
{
   header('Location: loginadvisor.php');
}
mysqli_close($db); // fermer la connexion
?>