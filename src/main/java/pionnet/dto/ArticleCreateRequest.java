package pionnet.dto;

import lombok.Data;

/**
 * Created by SuncheolKim on 2017. 7. 3..
 */
@Data
public class ArticleCreateRequest {
    private String title;
    private String contents;
    private String author;

    public ArticleCreateRequest() {
    }

    public ArticleCreateRequest(String title, String contents, String author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
    }
}
