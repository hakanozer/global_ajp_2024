package _2_json;

import java.util.List;

@lombok.Data
public class Posts {
    private List<Post> posts;
    private long total;
    private long skip;
    private long limit;
}
