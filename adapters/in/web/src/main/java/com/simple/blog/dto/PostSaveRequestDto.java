package com.simple.blog.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
public class PostSaveRequestDto {

    @NotBlank(message = "닉네임은 필수 값입니다.")
    private final String nickName;
    @Length(min = 2, max = 100, message = "제목은 최소 2글자에서 최대 100글자까지 허용됩니다.")
    @NotBlank(message = "title은 필수 값입니다.")
    private final String title;
    @Length(max = 2000, message = "본문은 최대 2000글자까지 허용됩니다.")
    private final String content;
    @Length(min = 4, max = 16, message = "패스워드는 최소 4글자에서 최대 16글자까지 허용됩니다.")
    @NotBlank(message = "Password는 필수 값입니다.")
    private final String password;

    public PostSaveRequestDto(
            final String nickName,
            final String title,
            final String content,
            final String password) {
        this.nickName = nickName;
        this.title = title;
        this.content = content;
        this.password = password;
    }
}
