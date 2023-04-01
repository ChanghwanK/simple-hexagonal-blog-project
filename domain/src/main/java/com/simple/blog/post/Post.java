package com.simple.blog.post;


import java.util.UUID;
import lombok.Getter;
import lombok.Value;

public class Post {
    private final String DOMAIN = "https://www.simple.blog.com";
    private final int SHARE_LINK_ID_LENGTH = 5;

    @Getter private PostId id;
    @Getter private CoreData metaInfo;

    private Post() {}
    private Post(final CoreData metaInfo) { this.metaInfo = metaInfo; }

    public static Post initPostWithCoreData(CoreData coreData) {
        return new Post(coreData);
    }

    public String createShareLink() {
        return DOMAIN + createUniqueCode();
    }

    private String createUniqueCode() {
        return UUID.randomUUID().toString().substring(0, SHARE_LINK_ID_LENGTH);
    }

    @Value
    public static class CoreData {
        String nickName;
        String title;
        String content;
        String password;
    }

    @Value
    public static class PostId {
        Long value;
    }
}
