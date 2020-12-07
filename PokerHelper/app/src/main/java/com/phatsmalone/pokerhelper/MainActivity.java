package com.phatsmalone.pokerhelper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.phatsmalone.calculations.PlayerInformation;
import com.phatsmalone.fragments.AddNewPlayerFragment;
import com.phatsmalone.fragments.HandRangeFrag;
import com.phatsmalone.fragments.MenuFragment;
import com.phatsmalone.fragments.PlayerInformationFrag;
import com.phatsmalone.fragments.PotOddsFrag;

public class MainActivity extends AppCompatActivity implements HandRangeFrag.HRListener {

    private static final String TAG = "MainActivity";
    private static final String ITEM_POSITION = "Position";
    private int position;
    private AddFragAdapter adapter;
    public ViewPager mViewPager;
    double output = 0;

    public toPlayerInfo mlistener = new toPlayerInfo() {
        @Override
        public void updateGrid(String sequence){
            Log.d(TAG, "UpdateGrid:" + sequence);
        }
    };

    @Override
    protected void onSaveInstanceState(final Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt(ITEM_POSITION, position);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);
        position = savedInstanceState.getInt(ITEM_POSITION);
    }
    //Create view on main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new AddFragAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.fragment_container);

        setupView(mViewPager);
    }

    public interface toPlayerInfo{

        void updateGrid(String sequence);
    }

    @Nullable
    @Override
    public void update(String e){

        PlayerInformation playerinfo = new PlayerInformation();
        playerinfo.setHandRange(Double.parseDouble(e));
        output = playerinfo.getHandRange();
        PlayerInformationFrag player = new PlayerInformationFrag();
        player.setupGrid(output);
    }



    //setup main view of the activity with a fragment
    private void setupView(ViewPager view){

        AddFragAdapter mainAdapter = new AddFragAdapter(getSupportFragmentManager());
        //setup for main menu
        mainAdapter.addFragment(new MenuFragment(), "MainMenu");
        mainAdapter.addFragment(new AddNewPlayerFragment(),"AddPlayer");
        mainAdapter.addFragment(new PlayerInformationFrag(),"Player_Information");
        mainAdapter.addFragment(new HandRangeFrag(), "Handrange");
        mainAdapter.addFragment(new PotOddsFrag(), "PotOddsCalculator" );
        view.setAdapter(mainAdapter);


    }
    //this method grabs the fragment number for the adapter
    public void setViewPager(int fragmentNum){

        mViewPager.setCurrentItem(fragmentNum);
    }
}
