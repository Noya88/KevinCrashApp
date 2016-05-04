package com.crash.kevin.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crash.kevin.R;

/**
 * Created by hades on 2016/5/4.
 */
public class DogFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View mDogView = inflater.inflate(R.layout.activity_tab_dog, container,false);
        return mDogView;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
}
