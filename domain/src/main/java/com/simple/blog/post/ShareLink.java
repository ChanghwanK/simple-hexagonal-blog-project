package com.simple.blog.post;

import java.util.UUID;
import lombok.Value;

@Value
public class ShareLink {
    private String DOMAIN = "https://www.simple.blog.com";
    private int SHARE_LINK_ID_LENGTH = 5;

    public static final ShareLink INIT = new ShareLink();
    String value = createShareLink();

    private String createShareLink() {
        return DOMAIN + createShareLinkCode();
    }

    private String createShareLinkCode() {
        return UUID.randomUUID().toString().substring(0, SHARE_LINK_ID_LENGTH);
    }
}
