<?php

require 'MCrypt.php';

$mcrypt = new MCrypt();
#Encrypt
$encrypted = $mcrypt->encrypt("Text to encrypt");
#Decrypt
$decrypted = $mcrypt->decrypt("9975e28df055c336a9b7090b03f88689");

printf("encrypted : ".$encrypted);
printf("\n");
printf("decrypted : ".$decrypted);