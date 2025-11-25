package com.tap.assessment;

public class Role{
    int id;
    String name;
    String lob;


    public Role(){
        this.id=0;
        this.name=null;
        this.lob=null;
    }

    public Role(int id,String name,String lob){
        this.id=id;
        this.name=name;
        this.lob=lob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob=lob;

}
}
