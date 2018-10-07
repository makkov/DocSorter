package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UtilMD5 {

    public UtilMD5() {
    }

    public static String md5Custom(String st) {
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(st.getBytes());
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);
        while( md5Hex.length() < 32 ){
            md5Hex = "0" + md5Hex;
        }
        return md5Hex;
    }

//    public static void main(String[] args) {
//        UtilMD5 utilMD5 = new UtilMD5();
//        System.out.println(utilMD5.md5Custom("1"));//c4ca4238a0b923820dcc509a6f75849b
//        System.out.println(utilMD5.md5Custom("2"));//c81e728d9d4c2f636f067f89cc14862c
//    }
}
