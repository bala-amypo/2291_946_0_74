package com.example.entity;
import jakarta.persistence.*;

@entity

public class Student{
    private int ID;
    private String name;
    private String email;
    private float cgpa;
}
public int getId(){
    return ID;
}public void setId(int ID){
   this.id = id;
}
public String getName(){
    return name;
}public void setName(int name){
   this.name = name;
}
public String getEmail(){
    return email;
}public void setEmail(int email){
   this.email = email;
}
    
public Float getCgpa(){
    return cgpa;
}public void setCgpa(int cgpa){
   this.cgpa = cgpa;
}

public Student (int ID,String name,String email,float cgpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
}
public Student(){

}