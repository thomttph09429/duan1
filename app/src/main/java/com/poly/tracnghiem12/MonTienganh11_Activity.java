package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.poly.tracnghiem12.Fragment.Tienganh10_Fragment;
import com.poly.tracnghiem12.Fragment.Tienganh11_Fragment;

public class MonTienganh11_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_tienganh11_);


        setTitle("Tiếng anh 11");

        Tienganh11_Fragment tienganh11_fragment= new Tienganh11_Fragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.tienganh11_fragment, tienganh11_fragment).commit();
    }
}