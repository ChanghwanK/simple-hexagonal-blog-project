package com.simple.blog.post;


import lombok.Getter;
import lombok.Value;

public class Post {
    @Getter private PostId id;
    @Getter private PostMetaInfo metaInfo;
    @Getter private Content content;
    @Getter private ViewCount viewCount;
    @Getter private Password password;
    @Getter private ShareLink shareLink;

    private Post() {}

    public Post(
            final PostMetaInfo metaInfo,
            final Content content,
            final Password password) {
        this.metaInfo = metaInfo;
        this.content = content;
        this.viewCount = ViewCount.ZERO;
        this.password = password;
        this.shareLink = ShareLink.INIT;
    }

    public static Post initPostWithCoreData(
            final PostMetaInfo metaInfo,
            final Content content,
            final Password password) {
        return new Post(metaInfo, content, password);
    }

    @Value
    public static class PostId {
        Long value;
    }
}
