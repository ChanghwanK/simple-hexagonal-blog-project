package com.simple.blog.mapper;

import com.simple.blog.entity.PostJpaEntity;
import com.simple.blog.post.Post;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {
    public PostJpaEntity mapToJpaEntity(Post post) {
        return PostJpaEntity.of(post);
    }
}
