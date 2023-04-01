package com.simple.blog.service;

import com.simple.blog.port.in.PostSaveUseCase;
import com.simple.blog.port.out.PostPersistencePort;
import com.simple.blog.post.Post;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PostSaveService implements PostSaveUseCase {

    private final PostPersistencePort persistencePort;

    public PostSaveService(PostPersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    @Override
    public void command(PostSaveUseCase.Command command) {
        Post post = Post.initPostWithCoreData(command.getCoreData());
        String shareLink = post.createShareLink();
        persistencePort.saveWithShareLink(post, shareLink);
    }
}
