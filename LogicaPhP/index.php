<?php
	$helloWorld = ['H','-','e','-','l','-','l','-','o'];
	$string = '';
	for($i = 0; $i < count($helloWorld); $i++){
		if($helloWorld[$i] =='-'){
			continue;
		}
		$string.=$helloWorld[$i];
	}
	echo $string;
?>