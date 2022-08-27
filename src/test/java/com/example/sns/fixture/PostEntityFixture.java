package com.example.sns.fixture;

import com.example.sns.model.Entity.PostEntity;
import com.example.sns.model.Entity.UserEntity;

public class PostEntityFixture {

    public static PostEntity get(String userName, Integer postId, Integer userId) {
        UserEntity user = new UserEntity();
        user.setId(userId);
        user.setUserName(userName);

        PostEntity result = new PostEntity();
        result.setId(postId);
        result.setUser(user);

        return result;
    }
}
