package com.example.spring.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Getter
@Setter
@ToString

@Document(collection="User")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String password;

}
