package com.michael.springboot.thymeleafdemo.model;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String color;
    private String programmingLanguage;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
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

    public void setCountry(String country) {
        this.country =country;
    }

    public String getCountry(){
        return country;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

}
