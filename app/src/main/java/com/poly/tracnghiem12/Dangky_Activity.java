package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.poly.tracnghiem12.DAO.NguoiDungDAO;
import com.poly.tracnghiem12.Model.NguoiDung;

public class Dangky_Activity extends AppCompatActivity {
    NguoiDungDAO nguoiDungDAO;
    EditText edtendangnhaps, edmatkhaus, edhoten, edtruongdanghoc, edquequan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky_);
        nguoiDungDAO = new NguoiDungDAO(this);


        edtendangnhaps = findViewById(R.id.edtendangnhaps);
        edmatkhaus = findViewById(R.id.edmatkhaus);
        edhoten = findViewById(R.id.edhoten);
        edtruongdanghoc = findViewById(R.id.edtruongdanghoc);
        edquequan = findViewById(R.id.edquequan);

    }

    public void back(View view) {
        Intent intent = new Intent(Dangky_Activity.this, Login_Activity.class);
        startActivity(intent);
    }

    public void dangkitaikhoan(View view) {
        if (edtendangnhaps.getText().toString().isEmpty() || edmatkhaus.getText().toString().isEmpty() || edhoten.getText().toString().isEmpty() || edtruongdanghoc.getText().toString().isEmpty() || edquequan.getText().toString().isEmpty()) {
            Toast.makeText(Dangky_Activity.this, "Không được để trống", Toast.LENGTH_LONG).show();
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        } else if (edmatkhaus.getText().toString().length() < 6) {
            Toast.makeText(Dangky_Activity.this, "mật khẩu nhập nhiều hơn 5 kí tự", Toast.LENGTH_LONG).show();

        } else {
            NguoiDung nguoiDung = new NguoiDung();
            nguoiDung.setMatkhau(edmatkhaus.getText().toString());
            nguoiDung.setTendangnhap(edtendangnhaps.getText().toString());
            nguoiDung.setHoten(edhoten.getText().toString());
            nguoiDung.setTruongdanghoc(edtruongdanghoc.getText().toString());
            nguoiDung.setQuequan(edquequan.getText().toString());


            long kq = nguoiDungDAO.inertnguoidung(nguoiDung);
            if (kq > 0) {



                Intent intent = new Intent(Dangky_Activity.this, ThongTin_CaNhan_Activity.class);
                Bundle bundle =new Bundle();
                bundle.putString("tendangnhap", edtendangnhaps.getText().toString());
                bundle.putString("matkhau", edmatkhaus.getText().toString());
                bundle.putString("hoten", edhoten.getText().toString());
                bundle.putString("truongdanghoc", edtruongdanghoc.getText().toString());
                bundle.putString("quequan", edquequan.getText().toString());
                intent.putExtra("thongtincanhan", bundle);
                startActivity(intent);


            } else {
                Toast.makeText(Dangky_Activity.this, "Lỗi", Toast.LENGTH_LONG).show();
            }
        }

    }
}