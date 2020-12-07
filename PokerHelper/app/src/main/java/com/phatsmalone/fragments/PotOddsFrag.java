package com.phatsmalone.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.phatsmalone.calculations.PotOddsCalculations;
import com.phatsmalone.pokerhelper.MainActivity;
import com.phatsmalone.pokerhelper.R;

import java.io.IOException;

/**
 * A simple {@link Fragment} subclass.
 */
public class PotOddsFrag extends Fragment {

    private EditText villianBet, potAmountb4Bet, numOuts;
    private TextView potRatio, callOrFold, outsRatio;
    private Button back, calculate;
    private static final String TAG = "PotOddsCalculator";

    public PotOddsFrag() {
        setRetainInstance(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.pot_odds_frag, container, false);
        villianBet = v.findViewById(R.id.villianinput);
        potAmountb4Bet = v.findViewById(R.id.potsizeinput);
        numOuts = v.findViewById(R.id.outsinput);
        potRatio = v.findViewById(R.id.potratio_output);
        outsRatio = v.findViewById(R.id.outsratio_output);
        callOrFold = v.findViewById(R.id.cof_output);
        back = v.findViewById(R.id.backbuttonpotodds);
        calculate = v.findViewById(R.id.calculate);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Main Menu", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        final PotOddsCalculations pCalculate = new PotOddsCalculations();

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    double vBet = Double.parseDouble(villianBet.getText().toString());
                    double potAmountb4 = Double.parseDouble(potAmountb4Bet.getText().toString());
                    pCalculate.setInitialVars(vBet, potAmountb4);
                    double outs = Double.parseDouble(numOuts.getText().toString());
                    pCalculate.setOuts(outs);

                    potRatio.setText(pCalculate.getPotRatio());
                    outsRatio.setText(pCalculate.getOutsRatio());
                    callOrFold.setText(pCalculate.getCallOrFold());
                }catch(Exception e){

                    System.out.println(e.toString() + "Try Inputs again");
                }

            }
        });
        return v;
    }

}
