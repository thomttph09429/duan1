package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.poly.tracnghiem12.DAO.NguoiDungDAO;
import com.poly.tracnghiem12.Fragment.Trangchu_Fragment;
import com.poly.tracnghiem12.Model.NguoiDung;

public class Dangky_Activity extends AppCompatActivity {
    NguoiDungDAO nguoiDungDAO;
    EditText edtendangnhaps, edhoten, edtruongdanghoc, edquequan;
    TextInputLayout textInputLayoutmatkhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky_);
        nguoiDungDAO = new NguoiDungDAO(this);


        edtendangnhaps = findViewById(R.id.edtendangnhaps);

        edhoten = findViewById(R.id.edhoten);
        edtruongdanghoc = findViewById(R.id.edtruongdanghoc);
        edquequan = findViewById(R.id.edquequan);
        textInputLayoutmatkhau = findViewById(R.id.etPasswordLayout);

    }

    public void back(View view) {
        Intent intent = new Intent(Dangky_Activity.this, Login_Activity.class);
        startActivity(intent);
    }

    public void dangkitaikhoan(View view) {
        if (edtendangnhaps.getText().toString().isEmpty() || textInputLayoutmatkhau.getEditText().getText().toString().isEmpty() || edhoten.getText().toString().isEmpty() || edtruongdanghoc.getText().toString().isEmpty() || edquequan.getText().toString().isEmpty()) {
            Toast.makeText(Dangky_Activity.this, "Không được để trống", Toast.LENGTH_LONG).show();
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        } else if (textInputLayoutmatkhau.getEditText().getText().toString().length() < 6) {
            Toast.makeText(Dangky_Activity.this, "mật khẩu nhập nhiều hơn 5 kí tự", Toast.LENGTH_LONG).show();

        } else {
            NguoiDung nguoiDung = new NguoiDung();

            nguoiDung.setMatkhau(textInputLayoutmatkhau.getEditText().getText().toString());
            nguoiDung.setTendangnhap(edtendangnhaps.getText().toString());
            nguoiDung.setHoten(edhoten.getText().toString());
            nguoiDung.setTruongdanghoc(edtruongdanghoc.getText().toString());
            nguoiDung.setQuequan(edquequan.getText().toString());



            long kq = nguoiDungDAO.inertnguoidung(nguoiDung);
            if (kq > 0) {
                Toast.makeText(Dangky_Activity.this, "Đăng kí thành công", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Dangky_Activity.this, HomeActivity.class);

                startActivity(intent);

            } else {
                Toast.makeText(Dangky_Activity.this, "Tên trùng", Toast.LENGTH_LONG).show();
            }
        }

    }


}