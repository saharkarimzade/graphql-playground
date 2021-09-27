package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Author {

    private String id;
    private String name;
    private String  thumbnail;
    private List<Post> posts;
}
