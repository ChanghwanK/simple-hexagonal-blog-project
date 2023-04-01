package com.simple.blog.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;


@MappedSuperclass
public abstract class BaseEntity {

    @Column(nullable = false, name = "created_at")
    private LocalDateTime createdAt;

    @Column(nullable = false, name = "last_modified_at")
    private LocalDateTime lastModifiedAt;

    @PrePersist
    void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        createdAt = now;
        lastModifiedAt = now;
    }

    @PreUpdate
    void preUpdate() {
        lastModifiedAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {return createdAt;}

    public LocalDateTime getLastModifiedAt() {
        return lastModifiedAt;
    }
}
