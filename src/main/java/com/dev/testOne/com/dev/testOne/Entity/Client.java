package com.dev.testOne.com.dev.testOne.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue
    int idClient;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    String age;

    public Client(){}

    public Client(int idClient, String name, String age) {
        this.idClient = idClient;
        this.name = name;
        this.age = age;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
