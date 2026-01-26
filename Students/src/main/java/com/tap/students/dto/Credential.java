package com.tap.students.dto;

public class Credential {
    
   public String email;
    public String password;

    public Credential() {
        this.email = " ";
        this.password = " ";
    }

    public Credential(String email,String password) {
        this.email = email;
        this.password = password;
    }
}
