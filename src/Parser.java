import java.net.URL;

/**
 * Created by roman on 21.08.16.
 */

public class Parser {

        public static String getNameOfFileFromURL(URL url) {

        StringBuilder stringBuilder = new StringBuilder();
        String path = url.getPath();

        if (path.isEmpty())
            return "/index.html";
        else {
            String[] strings = path.split("/");
            if (strings[strings.length - 1].contains(".")) {
               return stringBuilder.append("/").append(deleteFileExtension(strings[strings.length - 1])).append(".html").toString();
            } else {
                return stringBuilder.append("/").append(strings[strings.length - 1]).append(".html").toString();
            }
        }
    }

    private static String deleteFileExtension(String string) {
        int position = string.indexOf(".");
        return string.substring(0, position);
    }
}
