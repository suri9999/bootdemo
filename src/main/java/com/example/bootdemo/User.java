package com.example.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User {

    private int Uid;
    private String Uname;
    private String Urole;

    @Autowired
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getUrole() {
        return Urole;
    }

    public void setUrole(String urole) {
        Urole = urole;
    }

    @Override
    public String toString() {
        return "User{" +
                "Uid=" + Uid +
                ", Uname='" + Uname + '\'' +
                ", Urole='" + Urole + '\'' +
                '}';
    }

    public User() {
        System.out.println("Object Created");

    }

    public void show(){
        System.out.println("Hey User bean is called");
        laptop.compile();
    }
}
