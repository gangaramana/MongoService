package com.modak.ServiceMongo.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")

public class Student {


    private String id;
    private String firstName;
    private String lastName;
    private Integer rank;
    public Student(){

    }

    public Student(String id, String firstName, String lastName, Integer rank) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rank=" + rank +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

}
