package com.mcs.navigationdrawerexample.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mcs.navigationdrawerexample.R;

public class UniversalFragment extends Fragment
{
    public static UniversalFragment newInstance() {
        return new UniversalFragment();
    }

    @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getLayout(), container, false);
        //return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private int getLayout(){
        return getArguments().getInt("layout", R.layout.fragment_main);
    }
}