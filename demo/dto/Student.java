package com.example.demo.dto;

public class Student {
    long id;
    String name;
    int age;
    String address;

    public Student(long id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "StudentInfo" + "\n" + "[" + "id = " + id + "name = " + name + "age = " + age + "address = " + address;
    }
}
