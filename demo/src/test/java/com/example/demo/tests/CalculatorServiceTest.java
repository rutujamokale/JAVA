package com.example.demo.tests;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;  
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.demo.maths.repository.MathRepository;
import com.example.demo.maths.service.CalculatorServiceImpl; 

public class CalculatorServiceTest {

    private MathRepository mathRepository;
    private CalculatorServiceImpl calculatorService; 

    @BeforeMethod
    public void setup() {
        mathRepository = Mockito.mock(MathRepository.class);
        calculatorService = new CalculatorServiceImpl(mathRepository); 
    }

    @Test
    public void testDoubleNumber() {
        
        when(mathRepository.getNumber()).thenReturn(5);

        int result = calculatorService.doubleNumber();

        assertEquals(result, 10);

       
        verify(mathRepository, times(1)).getNumber();
    }
}
