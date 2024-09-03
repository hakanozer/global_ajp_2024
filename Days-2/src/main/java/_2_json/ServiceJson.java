package _2_json;

import com.google.gson.Gson;
import org.jsoup.Jsoup;

public class ServiceJson {

    public Posts result() {
        try {
            String url = "https://dummyjson.com/posts";
            String stData = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().body().text();
            Gson gson = new Gson();
            Posts posts = gson.fromJson(stData, Posts.class);
            return posts;
        }catch (Exception ex) {
            System.err.println("Json Error: " + ex.getMessage());
        }
        return null;
    }

}
