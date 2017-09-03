package com.example.arjunsarel.fragmentsexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentC2 extends Fragment{
    private static final String TAG = "FragmentC1 Yoo";
    private Button btnv,btnv2,btnv3,btnvsa;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1_layout,container,false);
        btnv=(Button) view.findViewById(R.id.button);
        btnv2=(Button) view.findViewById(R.id.button2);
        btnv3=(Button) view.findViewById(R.id.button3);
        btnvsa=(Button) view.findViewById(R.id.button4);
        Log.d(TAG, "onCreateView: started ye wali");

        btnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to Frag---1",Toast.LENGTH_SHORT).show();
                //navigate to frag method call
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        btnv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to Frag---2",Toast.LENGTH_SHORT).show();
                //navigate to frag method call
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        btnv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to Frag---3",Toast.LENGTH_SHORT).show();
                //navigate to frag method call
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        btnvsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to Frag---1",Toast.LENGTH_SHORT).show();
                //navigate to frag method call
                Intent in=new Intent(getActivity(),SecondActivity.class);
                startActivity(in);
            }
        });

        return view;
    }
}
