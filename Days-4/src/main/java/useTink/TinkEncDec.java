package useTink;

import com.google.crypto.tink.proto.AesGcm;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.crypto.tink.subtle.Base64;

public class TinkEncDec {

    private static String key128Bit = "NcRfUjXn2r5u7x!A";
    private static String extraKey = "key123";


    public static String encrypt(String plainText) {
        String cipherText = "";
        try {
            AesGcmJce aesGcmJce = new AesGcmJce(key128Bit.getBytes());
            byte[] bytes = aesGcmJce.encrypt(plainText.getBytes(), extraKey.getBytes());
            cipherText = new String(bytes, "iso-8859-1");
        }catch (Exception ex) {
            System.err.println("encrypt error: " + ex.getMessage());
        }
        cipherText = Base64.encode(cipherText.getBytes());
        return cipherText;
    }

}
