package com.crash.kevin.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crash.kevin.R;

public class CatFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View mCatView = inflater.inflate(R.layout.activity_tab_cat, container,false);
        return mCatView;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
}
