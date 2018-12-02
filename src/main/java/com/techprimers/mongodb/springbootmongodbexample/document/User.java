package com.techprimers.mongodb.springbootmongodbexample.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    @Id
    private Integer id;
    private String name;
    private String teamName;
    private Long salary;

    public User() {
    }

    public User(Integer id, String name, String teamName, Long salary) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return String.format("the user id is %s "
                + "the user name is %s "
                + "the user password is %s "
                + "the user email is %s ",
                this.id, this.name, this.teamName, this.salary);
    }
}
