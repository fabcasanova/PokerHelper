package com.phatsmalone.fragments;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.phatsmalone.calculations.PlayerInformation;
import com.phatsmalone.db.PHDatabaseHelper;
import com.phatsmalone.pokerhelper.MainActivity;
import com.phatsmalone.pokerhelper.R;

import java.util.List;

public class PlayerInformationFrag extends Fragment{

    private static final String TAG = "Player_Information";
    PHDatabaseHelper dbHelper;
    private Spinner playernames, position;
    private Button handRangeButton, updateButton;
    public EditText handRangeOutput, playerNotes;
    double s;
    public PlayerInformationFrag() {
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.player_information_fragment, container, false);

        playernames = v.findViewById(R.id.playernames_spinner);
        position = v.findViewById(R.id.player_positions);
        handRangeButton = v.findViewById(R.id.handrange_button);
        updateButton = v.findViewById(R.id.updatebutton);
        handRangeOutput = v.findViewById(R.id.handrange_io);
        playerNotes = v.findViewById(R.id.player_notes);

        loadNames();
        setHandRangeOutput(s);
        handRangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "HandRange", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(3);
            }
        });

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }


    private void loadNames(){

        dbHelper = new PHDatabaseHelper(getActivity());
        List<String> names = dbHelper.getNames();

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, names);

        playernames.setAdapter(adapter);

    }

    public void setupGrid(double s){
        this.s = s;

    }

    private void setHandRangeOutput(double s){

        handRangeOutput.setText(String.valueOf(s));
    }

}
