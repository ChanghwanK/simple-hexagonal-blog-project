package com.simple.blog.post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Value;

@Value
public class PostMetaInfo {
    String nickName;
    String title;
    String writtenDate;

    public PostMetaInfo(
            final String nickName,
            final String title
            ) {
        this.nickName = nickName;
        this.title = title;
        this.writtenDate = writtenDate();
    }

    public static PostMetaInfo of(final String nickName, final String title) {
        return new PostMetaInfo(nickName, title);
    }

    public String writtenDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
