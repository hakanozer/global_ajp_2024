package _2_json;

import org.jsoup.Jsoup;

public class ServiceJson {

    public void result() {
        try {
            String url = "https://dummyjson.com/posts";
            String stData = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().body().text();
            System.out.println(stData);
        }catch (Exception ex) {
            System.err.println("Json Error: " + ex.getMessage());
        }
    }

}
