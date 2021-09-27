package com.example.demo;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

@Service
public class HelloQueryResolver implements GraphQLQueryResolver {

    public String hello() {
        return "Hello, GraphQL!";
    }
}
