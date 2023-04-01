package com.simple.blog;

import com.simple.blog.dto.PostSaveRequestDto;
import com.simple.blog.port.in.PostSaveUseCase;
import com.simple.blog.post.Post.CoreData;
import com.simple.blog.response.CommonResponse;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostApiController {

    private final PostSaveUseCase postSaveUseCase;

    public PostApiController(final PostSaveUseCase postSaveUseCase) {
        this.postSaveUseCase = postSaveUseCase;
    }

    @PostMapping("/api/v1/posts")
    public CommonResponse save(
            @RequestBody @Valid PostSaveRequestDto dto) {

        postSaveUseCase.command(new PostSaveUseCase.Command(
                new CoreData(
                    dto.getNickName(),
                    dto.getTitle(),
                    dto.getContent(),
                    dto.getPassword())));

        return CommonResponse.SUCCESS;
    }
}
