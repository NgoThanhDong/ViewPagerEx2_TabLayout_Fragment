package com.example1.qlamxmaster.viewpagerex2_tablayout_fragment;

/**
 * Created by QLamXmaster on 13/03/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//Our class extending fragment
public class Tab3 extends Fragment {

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        return inflater.inflate(R.layout.tab3, container, false);
    }
}