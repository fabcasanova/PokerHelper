package com.phatsmalone.fragments;


import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.phatsmalone.calculations.HandRangeCalculations;
import com.phatsmalone.calculations.PlayerInformation;
import com.phatsmalone.pokerhelper.MainActivity;
import com.phatsmalone.pokerhelper.R;

/**
 * This class controls the hand range button functions
 */
public class HandRangeFrag extends Fragment {

    private static final String TAG = "Handrange";
    public GridLayout grid;
    public HandRangeFrag frag;

    public HandRangeFrag() {

        setRetainInstance(true);
    }

    public interface HRListener{

        void update(String c);
    }

    HRListener listener = new HRListener() {
        @Override
        public void update(String c) {
            //Log.e(TAG, "Update " + c);
        }
    };
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(getActivity());
        this.listener = (HRListener)getActivity();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.hand_range_gridlayout,container,false);
        grid = v.findViewById(R.id.handrange_grid);
        final HandRangeCalculations hr = new HandRangeCalculations();

            ToggleButton buttonAA = v.findViewById(R.id.AA);
            buttonAA.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        int pocketpair = 6;
                        hr.addRangeTotal(pocketpair);

                    } else {

                        int subtractPair = -6;
                        hr.addRangeTotal(subtractPair);
                    }
                }
            });

        ToggleButton buttonKK = v.findViewById(R.id.KKp);
        buttonKK.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQQ = v.findViewById(R.id.QQp);
        buttonQQ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJJ = v.findViewById(R.id.JJp);
        buttonJJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonTT = v.findViewById(R.id.TTp);
        buttonTT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button99 = v.findViewById(R.id._99p);
        button99.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button88 = v.findViewById(R.id._88p);
        button88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button77 = v.findViewById(R.id._77p);
        button77.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button66 = v.findViewById(R.id._66p);
        button66.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button55 = v.findViewById(R.id._55p);
        button55.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button44 = v.findViewById(R.id._44p);
        button44.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button33 = v.findViewById(R.id._33p);
        button33.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button22 = v.findViewById(R.id._22p);
        button22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 6;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -6;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        //SUITED CARDS

        ToggleButton buttonAKs = v.findViewById(R.id.AKs);
        buttonAKs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonAQs = v.findViewById(R.id.AQs);
        buttonAQs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonAJs = v.findViewById(R.id.AJs);
        buttonAJs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonATs = v.findViewById(R.id.ATs);
        buttonATs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonA9s = v.findViewById(R.id.A9s);
        buttonA9s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonA8s = v.findViewById(R.id.A8s);
        buttonA8s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonA7s = v.findViewById(R.id.A7s);
        buttonA7s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonA6s = v.findViewById(R.id.A6s);
        buttonA6s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonA5s = v.findViewById(R.id.A5s);
        buttonA5s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonA4s = v.findViewById(R.id.A4s);
        buttonA4s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonA3s = v.findViewById(R.id.A3s);
        buttonA3s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonA2s = v.findViewById(R.id.A2s);
        buttonA2s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonKQs = v.findViewById(R.id.KQs);
        buttonKQs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonKJs = v.findViewById(R.id.KJs);
        buttonKJs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonKTs = v.findViewById(R.id.KTs);
        buttonKTs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonK9s = v.findViewById(R.id.K9s);
        buttonK9s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonK8s = v.findViewById(R.id.K8s);
        buttonK8s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonK7s = v.findViewById(R.id.K7s);
        buttonK7s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonK6s = v.findViewById(R.id.K6s);
        buttonK6s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonK5s = v.findViewById(R.id.K5s);
        buttonK5s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonK4s = v.findViewById(R.id.K4s);
        buttonK4s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonK3s = v.findViewById(R.id.K3s);
        buttonK3s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonK2s = v.findViewById(R.id.K2s);
        buttonK2s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQJs = v.findViewById(R.id.QJs);
        buttonQJs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQTs = v.findViewById(R.id.QTs);
        buttonQTs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQ9s = v.findViewById(R.id.Q9s);
        buttonQ9s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQ8s = v.findViewById(R.id.Q8s);
        buttonQ8s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQ7s = v.findViewById(R.id.Q7s);
        buttonQ7s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQ6s = v.findViewById(R.id.Q6s);
        buttonQ6s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQ5s = v.findViewById(R.id.Q5s);
        buttonQ5s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQ4s = v.findViewById(R.id.Q4s);
        buttonQ4s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQ3s = v.findViewById(R.id.Q3s);
        buttonQ3s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonQ2s = v.findViewById(R.id.Q2s);
        buttonQ2s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJTs = v.findViewById(R.id.JTs);
        buttonJTs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJ9s = v.findViewById(R.id.J9s);
        buttonJ9s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJ8s = v.findViewById(R.id.J8s);
        buttonJ8s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJ7s = v.findViewById(R.id.J7s);
        buttonJ7s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJ6s = v.findViewById(R.id.J6s);
        buttonJ6s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJ5s = v.findViewById(R.id.J5s);
        buttonJ5s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJ4s = v.findViewById(R.id.J4s);
        buttonJ4s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJ3s = v.findViewById(R.id.J3s);
        buttonJ3s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonJ2s = v.findViewById(R.id.J2s);
        buttonJ2s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonT9s = v.findViewById(R.id.T9s);
        buttonT9s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonT8s = v.findViewById(R.id.T8s);
        buttonT8s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonT7s = v.findViewById(R.id.T7s);
        buttonT7s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonT6s = v.findViewById(R.id.T6s);
        buttonT6s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonT5s = v.findViewById(R.id.T5s);
        buttonT5s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonT4s = v.findViewById(R.id.T4s);
        buttonT4s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonT3s = v.findViewById(R.id.T3s);
        buttonT3s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton buttonT2s = v.findViewById(R.id.T2s);
        buttonT2s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button98s = v.findViewById(R.id._98s);
        button98s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button97s = v.findViewById(R.id._97s);
        button97s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button96s = v.findViewById(R.id._96s);
        button96s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button95s = v.findViewById(R.id._95s);
        button95s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button94s = v.findViewById(R.id._94s);
        button94s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button93s = v.findViewById(R.id._93s);
        button93s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button92s = v.findViewById(R.id._92s);
        button92s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button87s = v.findViewById(R.id._87s);
        button87s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button86s = v.findViewById(R.id._86s);
        button86s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button85s = v.findViewById(R.id._85s);
        button85s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button84s = v.findViewById(R.id._84s);
        button84s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button83s = v.findViewById(R.id._83s);
        button83s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button82s = v.findViewById(R.id._82s);
        button82s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button75s = v.findViewById(R.id._75s);
        button75s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button74s = v.findViewById(R.id._74s);
        button74s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button73s = v.findViewById(R.id._73s);
        button73s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button72s = v.findViewById(R.id._72s);
        button72s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button65s = v.findViewById(R.id._65s);
        button65s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button64s = v.findViewById(R.id._64s);
        button64s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button63s = v.findViewById(R.id._63s);
        button63s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button62s = v.findViewById(R.id._62s);
        button62s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button54s = v.findViewById(R.id._54s);
        button54s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button53s = v.findViewById(R.id._53s);
        button53s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button52s = v.findViewById(R.id._52s);
        button52s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int pocketpair = 4;
                    hr.addRangeTotal(pocketpair);

                } else {

                    int subtractPair = -4;
                    hr.addRangeTotal(subtractPair);
                }
            }
        });

        ToggleButton button43s = v.findViewById(R.id._43s);
        button43s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 4;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -4;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button42s = v.findViewById(R.id._42s);
        button42s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 4;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -4;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button32s = v.findViewById(R.id._32s);
        button32s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 4;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -4;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        //offsuit cards

        ToggleButton buttonAKo = v.findViewById(R.id.AKo);
        buttonAKo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonAQo = v.findViewById(R.id.AQo);
        buttonAQo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonKQo = v.findViewById(R.id.KQo);
        buttonKQo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonAJo = v.findViewById(R.id.AJo);
        buttonAJo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonKJo = v.findViewById(R.id.KJo);
        buttonKJo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQJo = v.findViewById(R.id.QJo);
        buttonQJo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonATo = v.findViewById(R.id.ATo);
        buttonATo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonKTo = v.findViewById(R.id.KTo);
        buttonKTo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQTo = v.findViewById(R.id.QTo);
        buttonQTo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonJTo = v.findViewById(R.id.JTo);
        buttonJTo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonA9o = v.findViewById(R.id.A9o);
        buttonA9o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonK9o = v.findViewById(R.id.K9o);
        buttonK9o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQ9o = v.findViewById(R.id.Q9o);
        buttonQ9o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonJ9o = v.findViewById(R.id.J9o);
        buttonJ9o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonT9o = v.findViewById(R.id.T9o);
        buttonT9o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonA8o = v.findViewById(R.id.A8o);
        buttonA8o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonK8o = v.findViewById(R.id.K8o);
        buttonK8o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQ8o = v.findViewById(R.id.Q8o);
        buttonQ8o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonJ8o = v.findViewById(R.id.J8o);
        buttonJ8o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonT8o = v.findViewById(R.id.T8o);
        buttonT8o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button98o = v.findViewById(R.id._98o);
        button98o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonA7o = v.findViewById(R.id.A7o);
        buttonA7o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonK7o = v.findViewById(R.id.K7o);
        buttonK7o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQ7o = v.findViewById(R.id.Q7o);
        buttonQ7o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonJ7o = v.findViewById(R.id.J7o);
        buttonJ7o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonT7o = v.findViewById(R.id.T7o);
        buttonT7o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button97o = v.findViewById(R.id._97o);
        button97o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button87o = v.findViewById(R.id._87o);
        button87o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonA6o = v.findViewById(R.id.A6o);
        buttonA6o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonK6o = v.findViewById(R.id.K6o);
        buttonK6o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQ6o = v.findViewById(R.id.Q6o);
        buttonQ6o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonJ6o = v.findViewById(R.id.J6o);
        buttonJ6o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonT6o = v.findViewById(R.id.T6o);
        buttonT6o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button96o = v.findViewById(R.id._96o);
        button96o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button86o = v.findViewById(R.id._86o);
        button86o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button76o = v.findViewById(R.id._76o);
        button76o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonA5o = v.findViewById(R.id.A5o);
        buttonA5o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonK5o = v.findViewById(R.id.K5o);
        buttonK5o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQ5o = v.findViewById(R.id.Q5o);
        buttonQ5o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonJ5o = v.findViewById(R.id.J5o);
        buttonJ5o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonT5o = v.findViewById(R.id.T5o);
        buttonT5o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button95o = v.findViewById(R.id._95o);
        button95o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button85o = v.findViewById(R.id._85o);
        button85o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button75o = v.findViewById(R.id._75o);
        button75o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button65o = v.findViewById(R.id._65o);
        button65o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonA4o = v.findViewById(R.id.A4o);
        buttonA4o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonK4o = v.findViewById(R.id.K4o);
        buttonK4o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQ4o = v.findViewById(R.id.Q4o);
        buttonQ4o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonJ4o = v.findViewById(R.id.J4o);
        buttonJ4o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonT4o = v.findViewById(R.id.T4o);
        buttonT4o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button94o = v.findViewById(R.id._94o);
        button94o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button84o = v.findViewById(R.id._84o);
        button84o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button74o = v.findViewById(R.id._74o);
        button74o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button64o = v.findViewById(R.id._64o);
        button64o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button54o = v.findViewById(R.id._54o);
        button54o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonA3o = v.findViewById(R.id.A3o);
        buttonA3o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonK3o = v.findViewById(R.id.K3o);
        buttonK3o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQ3o = v.findViewById(R.id.Q3o);
        buttonQ3o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonJ3o = v.findViewById(R.id.J3o);
        buttonJ3o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonT3o = v.findViewById(R.id.T3o);
        buttonT3o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button93o = v.findViewById(R.id._93o);
        button93o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button83o = v.findViewById(R.id._83o);
        button83o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button73o = v.findViewById(R.id._73o);
        button73o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button63o = v.findViewById(R.id._63o);
        button63o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button53o = v.findViewById(R.id._53o);
        button53o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button43o = v.findViewById(R.id._43o);
        button43o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonA2o = v.findViewById(R.id.A2o);
        buttonA2o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonK2o = v.findViewById(R.id.K2o);
        buttonK2o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonQ2o = v.findViewById(R.id.Q2o);
        buttonQ2o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonJ2o = v.findViewById(R.id.J2o);
        buttonJ2o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton buttonT2o = v.findViewById(R.id.T2o);
        buttonT2o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button92o = v.findViewById(R.id._92o);
        button92o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button82o = v.findViewById(R.id._82o);
        button82o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button72o = v.findViewById(R.id._72o);
        button72o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button62o = v.findViewById(R.id._62o);
        button62o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button52o = v.findViewById(R.id._52o);
        button52o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button42o = v.findViewById(R.id._42o);
        button42o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        ToggleButton button32o = v.findViewById(R.id._32o);
        button32o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int suited = 12;
                    hr.addRangeTotal(suited);

                } else {

                    int subtractsuited = -12;
                    hr.addRangeTotal(subtractsuited);
                }
            }
        });

        final EditText edit = v.findViewById(R.id.edit);

        final Button backButton = v.findViewById(R.id.back_grid);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String percentage;
                double output;

                output = hr.getPercentage();
                percentage = String.valueOf(output);
                edit.setText(percentage);
                System.out.println(edit.getText());

                try {
                    listener.update(percentage);

                } catch(NullPointerException e){

                    Log.d(TAG, percentage);
                    System.out.println(e.toString());
                }

                Toast.makeText(getActivity(), "Player Information", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);

            }
        });
        return v;
    }


}

