package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.poly.tracnghiem12.DAO.NguoiDungDAO;
import com.poly.tracnghiem12.Model.NguoiDung;

public class Login_Activity extends AppCompatActivity {
    EditText edtendangnhap;
    EditText edmatkhau;
    NguoiDungDAO nguoiDungDAO;
    Button btndangnhap, btndangki, btnloginfb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);


        edtendangnhap = findViewById(R.id.edtendanhnhap);
        edmatkhau = findViewById(R.id.edmatkhau);


        btndangki = findViewById(R.id.btndangki);
        btndangnhap = findViewById(R.id.btndangnhap);
        btnloginfb = findViewById(R.id.btnloginfb);
        nguoiDungDAO = new NguoiDungDAO(this);




    }

    public void loginfb(View view) {

    }


    public void dangki(View view) {
        Intent intent = new Intent(Login_Activity.this, Dangky_Activity.class);
        startActivity(intent);



    }

    public void dangnhap(View view) {
        nguoiDungDAO = new NguoiDungDAO(this);

        String tendangnhap = edtendangnhap.getText().toString();
        String matkhau = edmatkhau.getText().toString();
        boolean kiemtra = nguoiDungDAO.kiemtralogin(tendangnhap, matkhau);
        if (kiemtra) {
            Intent intent = new Intent( Login_Activity.this, ThongTin_CaNhan_Activity.class);
            startActivity(intent);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(Login_Activity.this);
            builder.setTitle("bạn chưa có tài khoản");
            builder.setMessage("bạn có muốn đăng kí ?");
            builder.setPositiveButton("đăng kí", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent intent = new Intent( Login_Activity.this, Dangky_Activity.class);
                    startActivity(intent);
//                    edtendangnhap.requestFocus();
//                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);

                }
            });
            builder.setNegativeButton("hủy", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.create();
            builder.show();
        }


    }


}