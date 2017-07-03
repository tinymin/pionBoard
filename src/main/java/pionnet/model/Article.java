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
@Getter
@Setter
@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String contents;

    @Column
    private String author;

    @Column
    private String regtime;

    public Article() {
    }

    public Article(String title, String contents, String author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
        this.regtime = DateTimeFormatter.ISO_INSTANT.format(LocalDateTime.now().toInstant(ZoneOffset.UTC));
    }
}
