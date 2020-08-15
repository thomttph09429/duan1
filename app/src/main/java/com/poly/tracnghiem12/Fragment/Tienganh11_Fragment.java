package com.poly.tracnghiem12.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.poly.tracnghiem12.Adapter.Tienganh10_Adapter;
import com.poly.tracnghiem12.Adapter.Tienganh11_Adapter;
import com.poly.tracnghiem12.R;


public class Tienganh11_Fragment extends Fragment {

    Tienganh11_Adapter tienganh11_adapter;
    TabLayout tabLayout;
    ViewPager viewPager;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tienganh11_, container, false);
        tienganh11_adapter = new Tienganh11_Adapter(getActivity().getSupportFragmentManager());
        tabLayout = view.findViewById(R.id.tablayout_tienganh11);
        viewPager = view.findViewById(R.id.viewpager_tienganh11);
        viewPager.setAdapter(tienganh11_adapter);
        tabLayout.setupWithViewPager(viewPager);


        return view;    }
}