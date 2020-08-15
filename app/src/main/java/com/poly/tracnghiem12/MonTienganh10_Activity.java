package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.poly.tracnghiem12.Fragment.Tienganh10_Fragment;

public class MonTienganh10_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienganh10_);
        setTitle("Tiếng anh 12");

        Tienganh10_Fragment toan_fragment= new Tienganh10_Fragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.monhoc_fragment, toan_fragment).commit();
    }
}