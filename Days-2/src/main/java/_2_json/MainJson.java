package _2_json;

public class MainJson {
    public static void main(String[] args) {

        ServiceJson json = new ServiceJson();
        Posts posts = json.result();
        for (Post post : posts.getPosts()) {
            System.out.println(post.getTitle());
        }

    }
}
