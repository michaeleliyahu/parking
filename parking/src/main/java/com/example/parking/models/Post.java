package com.example.parking.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "post")
public class Post {

    @Id
    private int id;
    private String lastName;
    private String firstName;
    private int department;
    private String start;
    private String end;


    public Post(int id, String lastName, String firstName, int department, String start, String end) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.start = start;
        this.end = end;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", department=" + department +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
