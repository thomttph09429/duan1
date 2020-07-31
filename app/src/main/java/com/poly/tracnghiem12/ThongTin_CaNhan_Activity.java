package com.poly.tracnghiem12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThongTin_CaNhan_Activity extends AppCompatActivity {
    TextView edtendangnhaptt, edmatkhautt, edhotentt, edtruongdanghoctt, edquequantt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin__ca_nhan_);
        setTitle("Thông tin cá nhân");


    }


    public void btnstart(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Thông báo");
        builder.setMessage("bạn bắt đầu làm bài luôn chứ ?");
        builder.setPositiveButton("Ok luôn", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(ThongTin_CaNhan_Activity.this, HomeActivity.class);
                startActivity(intent);

            }
        });
        builder.setNegativeButton("đợi 1 lúc ^.^", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.create();
        builder.show();


    }

    public void dangxuat(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view1 = LayoutInflater.from(getApplication()).inflate(R.layout.dialog_dang_xuat, null);
        builder.setView(view1);
        Button btndangxuat = view1.findViewById(R.id.btn_dangxuat);
        Button btnhuy = view1.findViewById(R.id.btn_huy);
        btndangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThongTin_CaNhan_Activity.this, Login_Activity.class);
                startActivity(intent);
            }
        });
        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        builder.create();
        builder.show();


    }

    public void sua_thong_tin(View view) {
    }
}