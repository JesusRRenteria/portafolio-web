package com.example.spring.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@ToString

@Document (collection = "Productos")
public class Productos {
    @Id
    private String id;
    private int cost;
    private String description;
    private String version;
    private String title;
}
