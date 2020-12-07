package com.phatsmalone.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.phatsmalone.pokerhelper.MainActivity;
import com.phatsmalone.pokerhelper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    private static final String TAG = "MainMenu";
    private Button addPlayerButton, openPlayerButton, potOddsButton;

    public MenuFragment() {

        setRetainInstance(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.main_frag, container, false);
        addPlayerButton = v.findViewById(R.id.add_player);
        openPlayerButton = v.findViewById(R.id.open_existing);
        potOddsButton = v.findViewById(R.id.pot_odds);


        addPlayerButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Add Player Name", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        openPlayerButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Player Information", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        potOddsButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Pot Odds Calculator", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(4);
            }
        });

        return v;
    }

}
