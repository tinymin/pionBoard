package pionnet;

import org.junit.Assert;
import org.junit.Test;
import pionnet.dto.ArticleCreateRequest;
import pionnet.model.Article;
import pionnet.service.ArticleService;

/**
 * Created by Kim.Suncheol on 2017-07-03.
 */
public class ArticleTest {
    @Test
    public void 글객체테스트() throws Exception {
        Article a = new Article();
        a.setTitle("제목1");
        a.setContents("Contents1");
        a.setAuthor("tester");
        a.setRegtime("20170703");

        Assert.assertEquals("Contents1", a.getContents());
    }

    @Test
    public void 글쓰기테스트() throws Exception {
        ArticleService as = new ArticleService();

        ArticleCreateRequest createReq = new ArticleCreateRequest("제목1", "내용1", "작성자1");
        as.createArticle(createReq);
        Article article = as.getArticle(1L);

        Assert.assertEquals("제목1", article.getTitle());
        Assert.assertEquals("내용1", article.getContents());

    }
}
