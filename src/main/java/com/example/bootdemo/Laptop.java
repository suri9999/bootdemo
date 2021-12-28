package com.example.bootdemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private int Lid;
    private String Lbrand;

    public int getLid() {
        return Lid;
    }

    public void setLid(int lid) {
        Lid = lid;
    }

    public String getLbrand() {
        return Lbrand;
    }

    public void setLbrand(String lbrand) {
        Lbrand = lbrand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Lid=" + Lid +
                ", Lbrand='" + Lbrand + '\'' +
                '}';
    }

    public void compile(){
        System.out.println("Compiling");
    }
}
