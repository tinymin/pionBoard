package pionnet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * Created by tinym on 2017-07-03.
 */
@Setter
@Getter
@Entity
public class Comment {
    @Id
    @GeneratedValue
    @Column(name="COMMENT_ID")
    private Long id;

    @Column(name="ARTICLE_ID")
    private Long article_id;

    @Column
    private String content;

    @Column
    private String author;

    @Column
    private String regtime;

    public Comment() {
    }

    public Comment(Long article_id, String content, String author) {
        this.article_id = article_id;
        this.content = content;
        this.author = author;
        this.regtime = DateTimeFormatter.ISO_INSTANT.format(LocalDateTime.now().toInstant(ZoneOffset.UTC));
    }
}
