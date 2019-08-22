package org.linlinjava.litemall.admin.domain;

import java.io.Serializable;

/**
 * Date 2019-8-20.
 * Author: wang ding
 */
public class Person implements Serializable{
    private String id;
    private String name;
    private String age;
    private String address;
    private String university;

    public Person() {
    }

    public Person(String name, String age, String address, String university,String id) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.university = university;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
