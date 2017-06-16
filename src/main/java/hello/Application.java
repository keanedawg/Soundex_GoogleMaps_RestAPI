package hello;

import org.apache.commons.codec.EncoderException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.codec.language.Soundex;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Soundex s = new Soundex();
        try {
            System.out.println(s.difference("st.", "saint"));
            System.out.println(s.encode("st"));
            System.out.println(s.encode("csrmel"));
            System.out.println(s.encode("hospital"));
            System.out.println(s.encode("saint"));
            System.out.println(s.encode("carmel"));
            System.out.println(s.encode("hpspital"));
            System.out.println(s.encode("Carl"));
            SpringApplication.run(Application.class, args);
        } catch (EncoderException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace().toString());
        }
    }
}
