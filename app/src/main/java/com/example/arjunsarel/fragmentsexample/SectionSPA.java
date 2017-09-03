package com.example.arjunsarel.fragmentsexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionSPA extends FragmentStatePagerAdapter {
    private final List<Fragment> mFragList=new ArrayList<>();
    private final List<String> mTList=new ArrayList<>();
    public SectionSPA(FragmentManager fm) {
    super(fm);
    }

    public void addFragment(Fragment fragment,String title)
    {
        mFragList.add(fragment);
        mTList.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragList.get(position);
    }

    @Override
    public int getCount() {
        return mFragList.size();
    }
}
