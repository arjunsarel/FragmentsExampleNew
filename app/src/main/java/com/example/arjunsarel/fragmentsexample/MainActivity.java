package com.example.arjunsarel.fragmentsexample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity_YO";
    private SectionSPA mSectionPA;
    private ViewPager mViewObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        mSectionPA=new SectionSPA(getSupportFragmentManager());
        mViewObj=(ViewPager) findViewById(R.id.containr);
        //setup for Pager;
        setupViewPager(mViewObj);
    }
    private void setupViewPager(ViewPager viePag)
    {
        SectionSPA adp=new SectionSPA(getSupportFragmentManager());
        adp.addFragment(new FragmentC1(),"FraaggM 1"); //first shows first seq
        adp.addFragment(new FragmentC2(),"FraaggM 2");
        adp.addFragment(new FragmentC3(),"FraaggM 3");
        viePag.setAdapter(adp);

    }
    public void setViewPager(int fragnumber)
    {
        mViewObj.setCurrentItem(fragnumber);
    }
}
