package com.simple.blog.service;

import com.simple.blog.port.in.PostSaveUseCase;
import com.simple.blog.port.out.PostSavePort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PostSaveService implements PostSaveUseCase {

    private final PostSavePort postSavePort;

    public PostSaveService(PostSavePort postSaveAdapter) {
        this.postSavePort = postSaveAdapter;
    }

    @Override
    public void command(Command command) {
        System.out.println("Command");
    }
}
