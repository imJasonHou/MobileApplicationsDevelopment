package com.example.android.navigationdrawertest;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.activity_2, container, false);

        View view =  inflater.inflate(R.layout.activity_2, container, false);
        TextView activity_2_tv1 = (TextView) view.findViewById(R.id.activity_2_tv1);
        activity_2_tv1.setText("fragment: activity 2");
        return view;
    }
}
