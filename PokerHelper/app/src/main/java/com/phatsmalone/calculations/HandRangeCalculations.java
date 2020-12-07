package com.phatsmalone.calculations;

public class HandRangeCalculations {

    int rangeTotal;
    double totalCombinations = 1326;

    public HandRangeCalculations(){

        this.rangeTotal = 0;
    }

    public void addRangeTotal(int value){

        if(rangeTotal >= 0) {
            rangeTotal += value;
        } else{

            rangeTotal = 0;
        }
    }

    public double getPercentage(){

        double percentage = 0;

        percentage = (rangeTotal / totalCombinations) * 100;

        return percentage;
    }
}
