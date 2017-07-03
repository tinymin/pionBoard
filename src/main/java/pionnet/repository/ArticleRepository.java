package pionnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pionnet.model.Article;

/**
 * Created by SuncheolKim on 2017. 7. 3..
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

}
