<html>
	<head>
		<meta charset="utf-8">
		<title>Login</title>
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">
                <link href="css/style.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<div class="login">
			<h1>Login As A Club</h1>
			<img src = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQaK5FlS-3yf2H1gjIsUcSLeu2_ZXflq5fehN-6ai5tubaDHc8O&usqp=CAU" alt = "SAO" class="center">
		<!--	<form action="verificationclub.php" method="post"> -->
			<form action="welcomeclub.php" method="post">
				
				<label for="username">
					<i class="fas fa-user"></i>
				</label>
				<input type="text" name="username" placeholder="Club Id" id="username" required >

		

				<label for="password">
					<i class="fas fa-lock"></i>
				</label>
				<input type="password" name="password" placeholder="Password" id="password" required>
				<input type="submit" id="submit" value="Login"  onclick="return submitForm(this.form);">

			<!--	<?php
				session_start();
				//$_SESSION["username"]=$_POST["username"];

                			if (isset($_GET['erreur'])){
                   			$err = $_GET['erreur'];
                    			if($err==1 || $err==2)
                        		echo "<p style='color:red'>Wrong Username or Password.</p>";
                			}
                		?> 
                	-->
			</form>



		</div>
	</body>
</html>