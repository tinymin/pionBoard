package pionnet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pionnet.dto.ArticleCreateRequest;
import pionnet.model.Article;
import pionnet.repository.ArticleRepository;

import javax.transaction.Transactional;

/**
 * Created by SuncheolKim on 2017. 7. 3..
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repository;

    @Transactional
    public Article createArticle(ArticleCreateRequest createReq) {
        Article article = new Article(createReq.getTitle(), createReq.getContents(), createReq.getAuthor());

        return repository.save(article);
    }

    @Transactional
    public Article getArticle(Long id) {
        return repository.findOne(id);
    }
}
