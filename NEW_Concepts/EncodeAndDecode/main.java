import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

public class main {
    public static void main(String[] args) {
        String credential = "Username:Password";

        Encoder encoder=Base64.getEncoder();
        String encodedStr = encoder.encodeToString(credential.getBytes());
        System.out.println(encodedStr);


        Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode(encodedStr.getBytes());
        String decodedStr = new String(decode);
        System.out.println(decodedStr);


    }
}
