<html>
	<head>
		<meta charset="utf-8">
		<title>Login</title>
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">
                <link href="css/style.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<div class="login">
			<h1>Login As An Advisor</h1>
			<img src = "https://lh3.googleusercontent.com/proxy/mhzWA2-LZ2V6ZTmqU9-I31CtIuNcXf5wI9wiVYOgDpc6M-7bevVDf_Pj9QraSCeOgvLHQAmX-QeIeHiZdJNvtAO64U6D7Y0GdLBNSZOOcarK3jz5DIarjWMaR23BRzTmVB4" alt = "SAO" class="center">
			<form action="verificationadvisor.php" method="post">
				<label for="username">
					<i class="fas fa-user"></i>
				</label>
				<input type="text" name="username" placeholder="Advisor Id" id="username" required>
				<label for="password">
					<i class="fas fa-lock"></i>
				</label>
				<input type="password" name="password" placeholder="Password" id="password" required>
				<input type="submit" id="submit" value="Login">
				<?php
                			if (isset($_GET['erreur'])){
                   			$err = $_GET['erreur'];
                    			if($err==1 || $err==2)
                        		echo "<p style='color:red'>Wrong Username or Password.</p>";
                			}
                		?>
			</form>
		</div>
	</body>
</html>