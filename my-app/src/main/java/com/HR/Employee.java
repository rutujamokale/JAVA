package com.HR;

abstract public class Employee {

     int id;
     String firstName;
     String lastName;
     String email;
     long contactNumber;
     String location;
     String birthDate;
     
     
        
     public Employee(int id,String firstName,String lastName,String email,long contactNumber,String location,String birthDate){
          this.id = id;
          this.firstName = firstName;
          this.lastName = lastName;
          this.email = email;
          this.contactNumber = contactNumber;
          this.location = location;
          this.birthDate = birthDate;
     }

      
     public  abstract void doWork();
  
     public abstract int computePay();
     
     public String toString() {
          return "Employee{" + 
               "id=" +id +
               ", firstName=" + firstName +
               ", lastname=" + lastName +
               ",email=" + email +
               ",contactNumber=" + contactNumber +
               ",location=" + location +
                    ",birthDate=" + birthDate;  
          }
     }



