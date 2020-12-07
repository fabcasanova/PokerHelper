package com.phatsmalone.calculations;

public class PotOddsCalculations {
    int deck = 52;
    double vBet, potAmountb4, outs, potPercent, outPercent;
    double potRatio, outsRatio;
    String call = "call", fold = "fold";

    public PotOddsCalculations(){

        this.potPercent = 0;
        this.outPercent = 0;
        this.vBet = 0;
        this.potAmountb4 = 0;
        this.outs = 0;
        this.potRatio = 0;
        this.outsRatio = 0;
    }

    public void setInitialVars(double vBet, double potAmountb4){

        this.vBet = vBet;
        this.potAmountb4 = potAmountb4;
    }

    public void setOuts(double outs){
        this.outs = outs;
    }

    public String getPotRatio(){

        double div = 0;
        String ratio = "";

        if(vBet != 0){
            div = potAmountb4 / vBet;
        }

        potPercent = vBet / potAmountb4;
        ratio = String.format("%.2f", div) + " : 1";

        return ratio;
    }

    public String getOutsRatio(){

        double div = 0;
        String ratio = "";

        if(outs != 0){

            div = deck / outs;
        }

        outPercent = outs / deck;
        ratio = String.format("%.2f", div) + " : 1";

        return ratio;
    }

    public String getCallOrFold(){

        if(outPercent > potPercent){

            return call;
        }
        else{

            return fold;
        }
    }
}
