package com.abhi.em_project;

public class Employee {
    private String name;
    private String phone;
    private String email;

    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name=name;
        this.phone-=phone;
        this.email=email;
    }
    // public void setName(String phone){
    //     this.phone=phone;
    // }
    // public void setName(String email){
    //     this.email=email;
    // }
}
