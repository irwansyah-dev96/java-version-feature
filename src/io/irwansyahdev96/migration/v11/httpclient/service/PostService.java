package io.irwansyahdev96.migration.v11.httpclient.service;

// File: PostService.java
import java.net.http.*;
import java.net.URI;
import java.io.IOException;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;

import io.irwansyahdev96.migration.v11.httpclient.model.Post;

public class PostService {
    private final HttpClient client;
    // private final ObjectMapper mapper;

    public PostService() {
        this.client = HttpClient.newHttpClient();
        // this.mapper = new ObjectMapper();
    }

    // GET single post
    public Post getPost(int id) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/" + id))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // return mapper.readValue(response.body(), Post.class);
        return response.body().lines()
                    .filter(line -> line.contains("\"id\":") || line.contains("\"title\":"))
                    .map(line -> {
                        String[] parts = line.trim().replace("\"", "").replace(",", "").split(": ");
                        if (parts[0].equals("id")) {
                            Post post = new Post();
                            post.setId(Integer.parseInt(parts[1]));
                            return post;
                        } else if (parts[0].equals("title")) {
                            Post post = new Post();
                            post.setTitle(parts[1]);
                            return post;
                        }
                        return null;
                    })
                    .filter(post -> post != null)
                    .findFirst()
                    .orElse(new Post());
    }

    // GET all posts
    public List<Post> getAllPosts() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // return mapper.readValue(response.body(), new TypeReference<List<Post>>() {});
        return response.body().lines()
                    .filter(line -> line.contains("\"id\":") || line.contains("\"title\":"))
                    .map(line -> {
                        String[] parts = line.trim().replace("\"", "").replace(",", "").split(": ");
                        if (parts[0].equals("id")) {
                            Post post = new Post();
                            post.setId(Integer.parseInt(parts[1]));
                            return post;
                        } else if (parts[0].equals("title")) {
                            Post post = new Post();
                            post.setTitle(parts[1]);
                            return post;
                        }
                        return null;
                    })
                    .filter(post -> post != null)
                    .toList();
    }
}
