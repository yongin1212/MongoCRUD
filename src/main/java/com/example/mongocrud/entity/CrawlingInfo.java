package com.example.mongocrud.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "interpark")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CrawlingInfo {

    @Id
    private String id;

    private String title;

    private String content;
}
