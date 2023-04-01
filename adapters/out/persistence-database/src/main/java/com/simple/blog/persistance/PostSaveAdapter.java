package com.simple.blog.persistance;

import com.simple.blog.port.out.PostSavePort;
import org.springframework.stereotype.Component;

@Component
public class PostSaveAdapter implements PostSavePort {

    @Override
    public void save() {
        System.out.println("hello");
    }
}
