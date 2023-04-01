package com.simple.blog.entity;


import com.simple.blog.post.Post;
import com.simple.blog.post.PostMetaInfo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.Builder;

@Entity
@Table(
    name = "posts",
    indexes = {
        @Index(name = "uq__partner__token", columnList = "share_link", unique = true)
    }
)
public class PostJpaEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nickName;
    @Column(nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Integer viewCount;
    @Column(nullable = false, name = "share_link")
    private String shareLink;

    protected PostJpaEntity() {}

    @Builder
    private PostJpaEntity(
            final String nickName,
            final String title,
            final String content,
            final String password,
            final Integer viewCount,
            final String shareLink) {
        // todo parameter null check
        this.nickName = nickName;
        this.title = title;
        this.content = content;
        this.password = password;
        this.viewCount = viewCount;
        this.shareLink = shareLink;
    }

    public static PostJpaEntity of(Post post) {
        PostMetaInfo metaInfo = post.getMetaInfo();
        return PostJpaEntity.builder()
            .nickName(post.getMetaInfo().getNickName())
            .title(metaInfo.getTitle())
            .content(post.getContent().getValue())
            .password(post.getPassword().getValue())
            .viewCount(post.getViewCount().getValue())
            .shareLink(post.getShareLink().getValue())
            .build();
    }

    public Long getId() {return id;}

    public String getNickName() {return nickName;}

    public String getTitle() {return title;}

    public String getContent() {return content;}

    public String getPassword() {return password;}

    public String getShareLink() {return shareLink;}

    public Integer getViewCount() {return viewCount;}
}
