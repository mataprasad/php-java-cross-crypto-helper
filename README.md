# php-java-cross-crypto-helper
php-java-cross-crypto-helper

#Code Source

http://www.androidsnippets.com/encrypt-decrypt-between-android-and-php.html


Using in JAVA --

MCrypt mcrypt = new MCrypt(); <br />
//Encrypt <br />
String encrypted = MCrypt.bytesToHex( mcrypt.encrypt("Text to Encrypt") ); <br />
//Decrypt <br />
String decrypted = new String( mcrypt.decrypt( encrypted ) ); <br />

------------------------------------
Using in PHP --

$mcrypt = new MCrypt(); <br />
//Encrypt <br />
$encrypted = $mcrypt->encrypt("Text to encrypt"); <br />
//Decrypt <br />
$decrypted = $mcrypt->decrypt($encrypted); <br />
