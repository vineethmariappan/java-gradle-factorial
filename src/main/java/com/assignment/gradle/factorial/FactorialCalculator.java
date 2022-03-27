package com.assignment.gradle.factorial;

public class FactorialCalculator {
    private final int num;
    private final int flagForNegativeNum=-1;
    public FactorialCalculator(int num) {
        this.num = num;
    }

    public int calculateFactorial(){
        if(returnsTrueIfNumIsNegative()){
            System.out.println("Factorial can't be calculated for the given negative number");
            return flagForNegativeNum;
        }
        int factorialOfNum = 1;
        for(int i=1;i<=num;i++){
            factorialOfNum*=i;
        }
        return factorialOfNum;
    }

    private boolean returnsTrueIfNumIsNegative() {
        return num<0;
    }
}
