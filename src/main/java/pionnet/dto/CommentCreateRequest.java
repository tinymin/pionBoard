package pionnet.dto;

import lombok.Data;

@Data
public class CommentCreateRequest {
    private Long article_id;
    private String content;
    private String author;

    public CommentCreateRequest() {
    }

    public CommentCreateRequest(Long article_id, String content, String author) {
        this.article_id = article_id;
        this.content = content;
        this.author = author;
    }
}
