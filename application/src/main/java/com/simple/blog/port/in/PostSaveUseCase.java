package com.simple.blog.port.in;

import com.simple.blog.post.Post.CoreData;

public interface PostSaveUseCase {

    void command(Command command);

    class Command {
        private final CoreData metaInfo;

        public Command(final CoreData metaInfo) { this.metaInfo = metaInfo;}

        public CoreData getCoreData() { return metaInfo;}
    }
}
