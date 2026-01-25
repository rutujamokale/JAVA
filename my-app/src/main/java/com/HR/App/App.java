package com.hr.App;

import com.hr.Employee;
import com.hr.Interface.IAppraisable;
import com.hr.Interface.IBonusEligible;
import com.hr.Interface.IInterviewPanel;
import com.hr.Interface.ITrainer;
import com.hr.SalesEmployee;
import com.hr.SalesManager;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Employee emp1 = new SalesEmployee(1, "rutuja", "mokale", "rutujamokale@gmail.com", 9545107220L, "pune",
                "23-01-2026", 1000, 5000, 20000, 10000, 120000);


         Employee emp2 = new SalesEmployee(1, "reena", "mokale", "reenamokale@gmail.com", 9545107220L, "pune",
                 "23-01-2026", 2000, 6000, 30000, 20000, 130000);
                
         emp1.doWork();
         emp2.doWork();
         
         System.out.println(emp1.computePay());
         System.out.println(emp2.computePay());
         
         
         SalesManager manager = new SalesManager(1, "rutuja", "mokale", "rutujamokale2003@gmail.com", 9529259355L,
                         "mumbai", "22-06-2003", 10000, 5000, 20000, 40000, 2000, 20000);

         IAppraisable appraisable = manager;
                 
         appraisable.ConductAppraisal();


         IBonusEligible bonusEligible = manager;

         System.out.println("bonus:" + bonusEligible.CalculateBonus());


         IInterviewPanel panel = manager;
         panel.TakeInterview();


         ITrainer trainer = manager;
              trainer.Train();

        
    }
}
