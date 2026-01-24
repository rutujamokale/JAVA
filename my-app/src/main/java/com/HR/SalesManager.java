package com.hr;

import com.hr.Interface.IInterviewPanel;
import com.hr.Interface.IManagerBenefits;
import com.hr.Interface.ITrainer;

public class SalesManager extends SalesEmployee implements  IManagerBenefits,
                            IInterviewPanel,
                            ITrainer  {
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

     @Override

     public float CalculateBonus() {
         return bonus;
     }
     
     @Override
     public void ConductAppraisal()
     {
         System.out.println("Manager appraisal completed.");
     }

     @Override
    public void ApproveLeave()
    {
        System.out.println("Leave approved by Sales Manager.");
    }

      @Override
    public void TakeInterview()
    {
        System.out.println("Sales Manager conducting interview.");
    }

    @Override
    public void Train()
    {
        System.out.println("Sales Manager training sales team.");
    }
}
