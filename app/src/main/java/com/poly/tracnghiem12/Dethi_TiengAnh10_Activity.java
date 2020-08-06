package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dethi_TiengAnh10_Activity extends AppCompatActivity {
    String tendethi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dethi__tienganh10_);
        Intent intent = getIntent();
        tendethi = intent.getStringExtra("tendethi");
        setTitle(tendethi);


    }

    public void start_quiz(View view) {
        Intent intent = new Intent(Dethi_TiengAnh10_Activity.this, Quiz_Tienganh10_Activity.class);
        intent.putExtra("tendethi", tendethi);
        startActivity(intent);
    }
}