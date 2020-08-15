package com.poly.tracnghiem12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Dethi_TiengAnh11_Activity extends AppCompatActivity {
    String tendethi;
    String category;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dethi__tienganh11_);
        Intent intent = getIntent();
        tendethi = intent.getStringExtra("tendethi");
        category = intent.getStringExtra("category");
        setTitle(tendethi);


    }

    public void start_quiz(View view) {
        Intent intent = new Intent(Dethi_TiengAnh11_Activity.this, Quiz_Tienganh11_Activity.class);
        intent.putExtra("tendethi", tendethi);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}