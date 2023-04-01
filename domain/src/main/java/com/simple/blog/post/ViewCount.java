package com.simple.blog.post;

import lombok.NonNull;
import lombok.Value;

@Value
public class ViewCount {
    public static final ViewCount ZERO = ViewCount.of(0);

    @NonNull
    Integer value;

    private ViewCount(final Integer value) {
        this.value = value;
    }

    public static ViewCount of(Integer count) {
        if(count < 0) throw new IllegalArgumentException();
        return new ViewCount(count);
    }

    public ViewCount up() {
        return new ViewCount(this.value + 1);
    }
}
