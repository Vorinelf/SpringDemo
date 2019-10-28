package com.voronov.springDemo.domain.util;

import com.voronov.springDemo.domain.User;

public abstract class MessageHelper {
    public static String getAuthorName(User author ){
        return  author!=null?author.getUsername():"<NONE>";

    }
}
