//import java.util.Hex;
//
//public class Hexadecimal {
//    /*
//    * hexadecimal has a base of 16 digits:
//    * 0123456789ABCDEF
//    * Goes up by 16^x like this
//    * 1 16 256 4096 65536
//    * */
//    public static void main(String[] args) {
//        // 47872 = 0xBB00
//
//        String foo = "I am a string";
//        byte[] bytes = foo.getBytes();
//        Hex.encodeHexString(bytes);
//
////        String x = byteArrayToHex(16);
////
////
////        System.out.println(x);
//    }
//
//    public static final String HEXADECIMAL = "0123456789ABCDEF";
//
//    public static String byteArrayToHex(byte[] a) {
//        StringBuilder sb = new StringBuilder(a.length * 2);
//        for (byte b: a) {
//            sb.append(String.format("%02x", b));
//        }
//        return sb.toString();
//    }
//
//    static int toHex(int d) {
//
//        var r = d % 16;
//        if (d - r == 0) {
//            return toChar(r);
//        }
//        return toHex((d - r) / 16) + toChar(r);
//    }
//
//    static char toChar(int n) {
//        return HEXADECIMAL.charAt(n);
//    }
//}
