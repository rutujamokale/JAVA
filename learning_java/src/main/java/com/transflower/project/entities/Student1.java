package com.transflower.project.entities;

public class Student1 {
    
    private  int id;
    private  String name;
   private  double marks;

    public Student1(){

    } 

    public Student1(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

     public void display(){
            System.out.println(id + "|" + name + "|" + marks);
    }
}
