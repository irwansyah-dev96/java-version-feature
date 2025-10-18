package io.irwansyahdev96.migration.v11.httpclient;

import java.io.IOException;

import io.irwansyahdev96.migration.v11.httpclient.model.Post;
import io.irwansyahdev96.migration.v11.httpclient.service.PostService;

public class HttpClientV11 {

    public static void showHttpClientV11() {
        System.out.println("Http Client V11");
        PostService ps = new PostService();

        try {
            ps.getAllPosts().forEach(post -> {
                System.out.println(post.getId() + " - " + post.getTitle());
            });

            System.out.println();
            System.out.println("Get Post By Id");
            Post postById = ps.getPost(1);
            System.out.println(postById.getId() + " - " + postById.getTitle());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
