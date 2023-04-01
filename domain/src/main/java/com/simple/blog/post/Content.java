package com.simple.blog.post;

import lombok.Value;

@Value
public class Content {
    String value;

    private Content(final String value) {
        this.value = value;
    }

    public static Content of(final String content) {
        return new Content(content);
    }

    public Content update(final String newContent) {
        return new Content(newContent);
    }
}
