package com.simple.blog.post;

import lombok.Value;

@Value
public class Password {

    String value;
    public Password(final String value) {this.value = value;}

    public static Password of(final String password) {
        return new Password(password);
    }
    public Password update(final String newPassword) {
        return new Password(newPassword);
    }

    public void verification(String password) {
        if(! password.equals(value))  throw new IllegalArgumentException();
    }
}
