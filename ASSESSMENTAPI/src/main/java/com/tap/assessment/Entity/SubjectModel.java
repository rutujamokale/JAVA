package com.tap.assessment.Entity;

public class SubjectModel implements Cloneable {
    private int id;
    private String subject;


    public SubjectModel() {

    }

    public SubjectModel(int id, String subject) {
        this.id = id;
        this.subject = subject;
    }
    
     public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getsubject(){
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Id: " + id + " subject: " + subject;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
