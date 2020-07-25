package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.poly.tracnghiem12.Fragment.Toan_Fragment;

public class MonHoc_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_hoc_);
        setTitle("Môn học");

        Toan_Fragment toan_fragment= new Toan_Fragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.monhoc_fragment, toan_fragment).commit();
    }
}