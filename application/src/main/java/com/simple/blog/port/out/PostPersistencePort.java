package com.simple.blog.port.out;

import com.simple.blog.post.Post;

public interface PostPersistencePort {
    void saveWithShareLink(Post post, String shareLink);
}
