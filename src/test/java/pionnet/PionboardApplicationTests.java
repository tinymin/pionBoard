package pionnet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pionnet.dto.ArticleCreateRequest;
import pionnet.dto.CommentCreateRequest;
import pionnet.model.Article;
import pionnet.model.Comment;
import pionnet.service.ArticleService;
import pionnet.service.CommentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PionboardApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void 글객체테스트() throws Exception {
		Article a = new Article();
		a.setTitle("제목1");
		a.setContents("Contents1");
		a.setAuthor("tester");
		a.setRegtime("20170703");

		Assert.assertEquals("Contents1", a.getContents());
	}

	@Autowired
	private ArticleService as;

	@Test
	public void 글쓰기테스트() throws Exception {
		ArticleCreateRequest createReq = new ArticleCreateRequest("제목1", "내용1", "작성자1");
		as.createArticle(createReq);
		Article article = as.getArticle(1L);

		Assert.assertEquals("제목1", article.getTitle());
		Assert.assertEquals("내용1", article.getContents());
	}

	@Autowired
	private CommentService cs;

	@Test
	public void 댓글쓰기테스트() throws Exception {
		CommentCreateRequest createRequest = new CommentCreateRequest(1L, "댓글입니다", "작성자1");
		cs.createComment(createRequest);
		Comment comment = cs.getComment(1L);

		Assert.assertEquals("댓글입니다", comment.getContent());
	}
}
