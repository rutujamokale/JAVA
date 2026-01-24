package com.hr;

public class SalesManager extends SalesEmployee  {
    int bonus;

     public SalesManager(int id, String firstName, String lastName, String email, long contactNumber, String location,
            String birthDate, int incentive, int target, int achievedTarget, int basicSalary,
             int hra, int bonus) {
          super(id, firstName, lastName, email, contactNumber, location, birthDate, incentive, target, achievedTarget,
                 basicSalary, hra);

         this.bonus = bonus;

     }
    
    public void dowork() {
        System.out.println(firstName + " is managing the sales team and strategy");
    }

     @Override
     public int computePay() {
         return super.computePay() + this.bonus;
     }
}
