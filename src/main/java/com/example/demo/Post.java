package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Post {

    private String id;
    private String title;
    private String category;
    private String authorId;
}
