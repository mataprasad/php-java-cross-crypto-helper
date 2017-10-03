# php-java-cross-crypto-helper
php-java-cross-crypto-helper

#Code Source

http://www.androidsnippets.com/encrypt-decrypt-between-android-and-php.html


HOW TO USE IT (JAVA) --

mcrypt = new MCrypt(); <br />
//Encrypt <br />
String encrypted = MCrypt.bytesToHex( mcrypt.encrypt("Text to Encrypt") ); <br />
//Decrypt <br />
String decrypted = new String( mcrypt.decrypt( encrypted ) ); <br />

------------------------------------
HOW TO USE IT (PHP) --

$mcrypt = new MCrypt(); <br />
//Encrypt <br />
$encrypted = $mcrypt->encrypt("Text to encrypt"); <br />
//Decrypt <br />
$decrypted = $mcrypt->decrypt($encrypted); <br />
