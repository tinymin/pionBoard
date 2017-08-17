package pionnet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by tinym on 2017-07-03.
 */
@Getter
@Setter
@Entity
public class Article {
    @Id
    @GeneratedValue
    @Column(name="ARTICLE_ID")
    private Long id;

    @Column
    private String title;

    @Column
    private String contents;

    @Column
    private String author;

    // Article에 Comment에 대한 연관관계 설정
    @OneToMany(fetch= FetchType.EAGER) // EAGER를 하지 않으면 LazyLoad로 인해 comment를 바로 조회해오지 않는다.
    @JoinColumn(name="ARTICLE_ID")
    private List<Comment> comments;

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
