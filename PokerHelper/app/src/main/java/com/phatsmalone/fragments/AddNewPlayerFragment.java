package com.phatsmalone.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.phatsmalone.db.PHDatabaseHelper;
import com.phatsmalone.pokerhelper.MainActivity;
import com.phatsmalone.calculations.PlayerInformation;
import com.phatsmalone.pokerhelper.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddNewPlayerFragment extends Fragment {

    private static final String TAG = "AddPlayer";
    PHDatabaseHelper dbHelper;
    private Button  backButton, nextButton;
    private EditText userInput;

    public AddNewPlayerFragment() {

        setRetainInstance(true);
    }

    // Inflate the layout for this fragment
    //finish fragment, make sure it pops up on menu before adding
    //data into the db
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_add_new_player, container, false);
        userInput = v.findViewById(R.id.addName);
        backButton = v.findViewById(R.id.backbutton);
        nextButton = v.findViewById(R.id.nextbutton);
        dbHelper = new PHDatabaseHelper(getActivity());
        PlayerInformation playerName = new PlayerInformation();

        /*EditText newName = v.findViewById(R.id.addName);
        String name = newName.getText().toString();
        playerName.setPlayerName(name);
        */

        backButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String newName = userInput.getText().toString();
                if(newName.length() != 0){
                    addName(newName);
                } else {

                    Toast.makeText(getActivity(), "Input Name Please!", Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(getActivity(), "Player Information", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });


        return v;
    }

    public void addName(String name){

        boolean insertName = dbHelper.addPlayerName(name);
        if(insertName){
            Toast.makeText(getActivity(), "Insert Success!", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(getActivity(), "Insert Failed!", Toast.LENGTH_SHORT).show();
        }
    }

}
