package com.example.demo.maths.service;

import com.example.demo.maths.repository.MathRepository;

public class CalculatorServiceImpl implements CalculatorService{
   
    private MathRepository mathRepository;
    
    public CalculatorServiceImpl(MathRepository mathrepository){
        this.mathRepository=mathRepository;
    }
    public int doubleNumber(){
        int number =mathRepository.getNumber();
        return number *2;
    }
}
