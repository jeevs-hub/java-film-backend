package com.techprimers.mongodb.springbootmongodbexample.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    @Id
    private ObjectId id;
    private String name;
    private String email;
    private String password;

    public User() {
    }

    public User(String name, String email, String password) {
        this.id = new ObjectId();
        this.name = name;
        this.email = email;
        this.password =  password;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return email;
    }

    public void setTeamName(String teamName) {
        this.email = teamName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("the user id is %s "
                + "the user name is %s "
                + "the user password is %s "
                + "the user email is %s ",
                id, name, email, password);
    }
}
