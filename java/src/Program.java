public class Program {
    public static void main(String[] args) throws Exception {
        MCrypt  mcrypt = new MCrypt();
/* Encrypt */
        String encrypted = MCrypt.bytesToHex( mcrypt.encrypt("Text to Encrypt") );
/* Decrypt */
        String decrypted = new String( mcrypt.decrypt("cb4b4ca864213684070465b38783a6c8" ) );

        System.out.println("encrypted : "+encrypted);
        System.out.println("decrypted : "+decrypted);
    }
}
