package com.poly.tracnghiem12.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.poly.tracnghiem12.Adapter.Toan_Adapter;
import com.poly.tracnghiem12.R;


public class Toan_Fragment extends Fragment {
    Toan_Adapter toan_adapter;
    TabLayout tabLayout;
    ViewPager viewPager;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_toan_, container, false);
        toan_adapter = new Toan_Adapter(getActivity().getSupportFragmentManager());
        tabLayout = view.findViewById(R.id.tablayout_toan);
        viewPager = view.findViewById(R.id.viewpager_toan);
        viewPager.setAdapter(toan_adapter);
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }
}