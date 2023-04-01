package com.simple.blog.controller;

import com.simple.blog.port.in.PostSaveUseCase;
import com.simple.blog.port.in.PostSaveUseCase.Command;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostApiController {

    private final PostSaveUseCase postSaveUseCase;

    public PostApiController(final PostSaveUseCase postSaveUseCase) {
        this.postSaveUseCase = postSaveUseCase;
    }

    @PostMapping("/api/v1/posts")
    public void save() {
        System.out.println("sava api called");
        postSaveUseCase.command(new Command("hello"));
    }
}
