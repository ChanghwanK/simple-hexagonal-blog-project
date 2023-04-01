package com.simple.blog.repository;

import com.simple.blog.entity.PostJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostJpaEntity, Long> { }
