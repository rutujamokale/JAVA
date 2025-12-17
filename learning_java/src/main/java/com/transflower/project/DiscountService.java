package com.transflower.project;

public class DiscountService {

    public double calculatefinalamount(double billAmount){
        double discount=0;
        if(billAmount>=10000){
            discount=0.20;
        }else if(billAmount>=5000){
            discount=0.10;

        }
        return billAmount-(billAmount*discount);
    }
}