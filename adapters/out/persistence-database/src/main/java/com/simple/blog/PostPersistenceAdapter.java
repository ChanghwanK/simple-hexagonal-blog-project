package com.simple.blog;

import com.simple.blog.annotations.PersistenceAdapter;
import com.simple.blog.mapper.PostMapper;
import com.simple.blog.port.out.PostPersistencePort;
import com.simple.blog.post.Post;
import com.simple.blog.repository.PostRepository;

@PersistenceAdapter
public class PostPersistenceAdapter implements PostPersistencePort {

    private final PostMapper postMapper;
    private final PostRepository postRepository;

    public PostPersistenceAdapter(final PostMapper postMapper, final PostRepository postRepository) {
        this.postMapper = postMapper;
        this.postRepository = postRepository;
    }

    @Override
    public void saveWithShareLink(Post post, String shareLink) {
        postRepository.save(postMapper.mapToJpaEntity(post, shareLink));
    }
}
