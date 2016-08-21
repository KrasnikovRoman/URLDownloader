import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by roman on 21.08.16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String[] strings;
            URL url = new URL("http://go.mail.ru/realtime?q=java");
            /*strings = url.getPath().split("/");
            for (String s : strings) {
                System.out.println(s);
            }*/
            System.out.println(Parser.getNameOfFileFromURL(url));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
