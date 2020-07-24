package com.poly.tracnghiem12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThongTin_CaNhan_Activity extends AppCompatActivity {
    EditText edtendangnhaptt, edmatkhautt, edhotentt, edtruongdanghoctt, edquequantt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin__ca_nhan_);




        AlertDialog.Builder builder = new AlertDialog.Builder(this);
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


        edtendangnhaptt = findViewById(R.id.edtendangnhaptt);
        edmatkhautt = findViewById(R.id.edmatkhautt);
        edhotentt = findViewById(R.id.edhotentt);
        edtruongdanghoctt = findViewById(R.id.edtruongdanghoctt);
        edquequantt = findViewById(R.id.edquequantt);
        setTitle("Thông tin cá nhân");
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("thongtincanhan");
        String tendangnhap = bundle.getString("tendangnhap");
        String matkhau = bundle.getString("matkhau");
        String hoten = bundle.getString("hoten");
        String truongdanghoc = bundle.getString("truongdanghoc");
        String quequan = bundle.getString("quequan");

        edtendangnhaptt.setText(tendangnhap);
        edmatkhautt.setText(matkhau);
        edhotentt.setText(hoten);
        edquequantt.setText(quequan);
        edtruongdanghoctt.setText(truongdanghoc);


    }


    public void btnstart(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
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
}