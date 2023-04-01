package com.simple.blog.mapper;

import com.simple.blog.entity.PostJpaEntity;
import com.simple.blog.post.Post;
import com.simple.blog.post.Post.CoreData;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {
    public PostJpaEntity mapToJpaEntity(Post post, String shareLink) {
        CoreData metaInfo = post.getMetaInfo();
        return new PostJpaEntity(
                metaInfo.getNickName(),
                metaInfo.getTitle(),
                metaInfo.getContent(),
                metaInfo.getPassword(),
                shareLink);
    }
}
