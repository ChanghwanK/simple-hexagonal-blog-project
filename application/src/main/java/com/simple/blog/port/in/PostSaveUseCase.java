package com.simple.blog.port.in;

import com.simple.blog.post.Content;
import com.simple.blog.post.Password;
import com.simple.blog.post.PostMetaInfo;
import lombok.Getter;

public interface PostSaveUseCase {

    void command(Command command);

    @Getter
    class Command {
        private final PostMetaInfo postMetaInfo;
        private final Content content;
        private final Password password;

        public Command(
                final PostMetaInfo postMetaInfo,
                final Content content,
                final Password password) {
            this.postMetaInfo = postMetaInfo;
            this.content = content;
            this.password = password;
        }
    }
}
