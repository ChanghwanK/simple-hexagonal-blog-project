package com.simple.blog.mapper;

import com.simple.blog.entity.PostJpaEntity;
import com.simple.blog.post.Post;
import com.simple.blog.post.PostMetaInfo;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {
    public PostJpaEntity mapToJpaEntity(Post post) {
        return metaInfo(post.getMetaInfo())
            .content(post.getContent().getValue())
            .password(post.getPassword().getValue())
            .viewCount(post.getViewCount().getValue())
            .shareLink(post.getShareLink().getValue())
            .build();
    }

    private PostJpaEntity.PostJpaEntityBuilder metaInfo(PostMetaInfo postMetaInfo) {
        return PostJpaEntity.builder().nickName(postMetaInfo.getNickName()).title(
            postMetaInfo.getTitle());
    }
}
