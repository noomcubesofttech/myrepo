package com.cubesofttech.bdd.cucumber.calculator;

public class Calculator {

    private double result1;
    private double result2;
    private double result3;
    private double result4;

    public void add(double arg1, double arg2) {
        result1 = arg1 + arg2;
    }
    
    public void minus(double arg1, double arg2) {
        result2 = arg1 - arg2;
    }
    
    public void multiply(double arg1, double arg2) {
        result3 = arg1 * arg2;
    }
    
    public void division(double arg1, double arg2) {
        result4 = arg1 / arg2;
    }

    public double getResult1() {
        return result1;
    }
    
    public double getResult2() {
        return result2;
    }
    
    public double getResult3() {
        return result3;
    }
    
    public double getResult4() {
        return result4;
    }
    
   
}
