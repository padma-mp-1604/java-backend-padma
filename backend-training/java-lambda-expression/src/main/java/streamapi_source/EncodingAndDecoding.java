package streamapi_source;

import java.util.Base64;

public class EncodingAndDecoding {
    public static void main(String[] args) {

        String password = "password1234";

        //encoding
        String encode = Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println(encode);

        String encode1=Base64.getUrlEncoder().encodeToString(password.getBytes());
        System.out.println(encode1);

        String encode3 = Base64.getMimeEncoder().encodeToString(password.getBytes());
        System.out.println(encode3);

        //decoding
        Base64.Decoder decoder = Base64.getDecoder();
        String decoder1 = new String(decoder.decode(encode));
        System.out.println(decoder1);

        //byte[] decoder = Base64.getDecoder().decode(e)

    }

}
