package com.transflower.project;

import java.util.ArrayList;
import java.util.List;


public class studentService{

    private  List<Student> students=new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudent(){
        if(students.isEmpty()){
            System.out.println("student is not found");

            return;


        }

        for(Student s:students){
            System.out.println(s);
        }
    }

}
