<?php
	session_start();
	function randText(){
$txt="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		$str="";
		for($i=0;$i<5;$i++)
		{
			$index=rand(0,strlen($txt)-1);
			$str.=$txt[$index];
		}
		return $str;
	}
	header("Content-type:image/png");
	$image=imagecreate(70,30);
	$backcolor=imagecolorallocate($image,168,167,165);
	$txtcolor=imgcolorallocate($image,250,250,250);
	$code=randText()'
	$_session["captcha"]=$code;
	imagestring($image,5,15,7,$code,$txtcolor);
	imagepng($image);
	imagecolordeallocate($backColor);
	imagecolordeallocate($txtColor);
	imagedestroy($image);
?>