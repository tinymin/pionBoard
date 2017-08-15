package pionnet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pionnet.dto.CommentCreateRequest;
import pionnet.model.Comment;
import pionnet.repository.CommentRepository;

import javax.transaction.Transactional;

@Service
public class CommentService {
    @Autowired
    private  CommentRepository repository;

    @Transactional
    public Comment createComment(CommentCreateRequest createRequest) {
        Comment comment = new Comment(createRequest.getArticle_id(), createRequest.getContent(), createRequest.getAuthor());

        return repository.save(comment);
    }

    @Transactional
    public Comment getComment(Long aLong) {
        return repository.findOne(aLong);
    }
}
