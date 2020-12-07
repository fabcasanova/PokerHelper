package com.phatsmalone.pokerhelper;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AddFragAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mfrag = new ArrayList<>();
    private final List<String> mFragTitleList = new ArrayList<>();

    public AddFragAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title){

        mfrag.add(fragment);
        mFragTitleList.add(title);

    }
    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        return mfrag.get(position);
    }

    @Override
    public int getCount() {
        return mFragTitleList.size();
    }
}
