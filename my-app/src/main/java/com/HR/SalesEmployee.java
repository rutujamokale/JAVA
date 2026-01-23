package com.HR;



public class SalesEmployee extends Employee {

    private int incentive;
    private int target;
    private int achievedTarget;
    private int basicSalary;
    private int hra;

    public SalesEmployee(int id, String firstName, String lastName, String email, long contactNumber, String location,
            String birthDate, int incentive, int target, int achievedTarget, int basicSalary,
            int hra) {

        super(id, firstName, lastName, email, contactNumber, location, birthDate);

        this.incentive = incentive;
        this.target = target;
        this.achievedTarget = achievedTarget;
        this.basicSalary = basicSalary;
        this.hra = hra;

    }

    @Override
    public void doWork() {
        System.out.println(firstName + "is selling products and meeting clients");
    }

     
    public int computePay() {
        int salary = this.basicSalary + this.hra;
        if (this.achievedTarget >= this.target) {
            salary += this.incentive;
        }
        return salary;
    }
    }
     

