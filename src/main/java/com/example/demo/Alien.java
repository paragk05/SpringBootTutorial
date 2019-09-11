package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien
{
    private int aid;
    private String aname;

    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;

    public Alien()
    {
        System.err.println("An Object is created");
    }

    private String tech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show()
    {
        System.err.println("Something is Printing");
        laptop.compile();
    }

    public Laptop getLaptop()
    {
        return laptop;
    }

    public void setLaptop(Laptop laptop)
    {
        this.laptop = laptop;
    }
}
