package com.poly.tracnghiem12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ketquatienganh11_Activity extends AppCompatActivity {
    TextView tv_tongsocau, tv_tongdiem, tv_socausai, tv_socaudung;
    Button btn_mainmenu, btn_lamlai;
    String category;
    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketquatienganh11_);
        tv_tongdiem = findViewById(R.id.tv_tongdiem);
        tv_tongsocau = findViewById(R.id.tv_tongsocau);
        tv_socaudung = findViewById(R.id.tv_socaudung);
        tv_socausai = findViewById(R.id.tv_socausai);
        btn_lamlai = findViewById(R.id.btn_lamlai);
        btn_mainmenu = findViewById(R.id.btn_mainmenu);
        setTitle("Kết quả");

        Intent intent = getIntent();
        int tongsocau = intent.getIntExtra("tongsocau", 0);
        int tongdiem = intent.getIntExtra("tongdiem", 0);

        final int caudung = intent.getIntExtra("caudung", 0);

        int causai = intent.getIntExtra("causai", 0);
        category = intent.getStringExtra("category");
        title = intent.getStringExtra("tendethi");


        tv_socausai.setText("" + causai);
        tv_tongdiem.setText("" + tongdiem);
        tv_socaudung.setText("" + caudung);
        tv_tongsocau.setText("" + tongsocau);
        btn_lamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ketquatienganh11_Activity.this, Quiz_Tienganh11_Activity.class);
                intent.putExtra("category", category);
                intent.putExtra("tendethi", title);
                startActivity(intent);

            }
        });
        btn_mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ketquatienganh11_Activity.this, HomeActivity.class);
                startActivity(intent);

            }
        });

    }
}