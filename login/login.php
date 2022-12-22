<?php session_start();?>
<html>
	<head>
		<title>Login Form with Captcha in PHP</title>
	</head>
	<body>
		<br>
		<h1 align='center'>Login Form with Captcha</h1>
		<?php 	
			$data=[
			"uname"=>"",
			"upass"=>"",
			"err_uname"=>"",
			"err_upass"=>"",
			"err_msg"=>"",
		];

		if($_SERVER["REQUEST_METHOD"]=="POST"){

			$date["uname"]=$_POST["uname"];
			$data["upass"]=$_POST["upass"];

		if($_SESSION["Captcha"]==$_POST["code"]){
		
				#database Connection
			$con=mysqli_connect("localhost","root","","db_login");
			$uname=mysqli_real_escape_string($con,$_POST["uname"]);
			$upass=mysqli_real_escape_string($con,$_POST["upass"]);
			$sql="select * from users where UNAME ='{$uname}'";
					$res=$con->query($sql);
				if($res->num_rows>0){
				$row=$res->fetch_assoc();
				if($row["UPASS"]===$upass){
				$_SESSION["login_details"]=$row;
				header("location:home.php");
				}else{

				#set error message for Invalid Password
				$data["err_upass"]="Invalid Password";
				}
					}else{
				#set error message for Invalid Username
				$data["err_uname"]="Invalid Username";
				}
					}else{
				#set error message for Invalid Captcha	
				$data["err_msg"]="Please Enter correct Captcha";
					}
				}
		?>
	<form method='post' action='<?php echo $_SERVER["REQUEST_URI"];?>'
	class='frm' autocomplete='off'>
	<p><input type='text' name='uname' required placeholder='Enter User name' value='<?php echo $data["uname"];?>'></p>
	<p style='color:red;'><?php echo $data["err_uname"];?></p>
	<p><input type='text' name='upass' required placeholder='Enter Password' value='<?php echo $data["upass"];?>'></p>
	<p style='color:red;'><?php echo $data["err_upass"];?></p>
	<p><input type='text' name='code' required placeholder='Enter Captcha'></p>
	<p style='color:red;'><?php echo $data["err_msg"];?></p>
	<img src="captcha.php">
	<p><input type='submit' name='submit' value='Login'></p>
	</form>
	</body>
	</html>