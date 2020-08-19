package com.poly.tracnghiem12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.poly.tracnghiem12.DAO.NguoiDungDAO;
import com.poly.tracnghiem12.Model.NguoiDung;

import java.util.List;

public class ThongTin_CaNhan_Activity extends AppCompatActivity  {
    EditText edtendangnhaptt, edmatkhautt, edhotentt, edtruongdanghoctt, edquequantt;
    NguoiDungDAO nguoiDungDAO;
    AlertDialog alertDialog;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    List<NguoiDung> nguoiDungList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin__ca_nhan_);
        setTitle("Thông tin cá nhân");
        edtruongdanghoctt = findViewById(R.id.edtruongdanghoctt);
        edmatkhautt = findViewById(R.id.edmatkhautt);
        edhotentt = findViewById(R.id.edhotentt);
        edquequantt = findViewById(R.id.edquequantt);
        edtendangnhaptt = findViewById(R.id.edtendangnhaptt);

        nguoiDungDAO = new NguoiDungDAO(this);
        nguoiDungList= nguoiDungDAO.getallnguoidung();

        edmatkhautt.setText(nguoiDungList.get(0).getMatkhau());
        edtruongdanghoctt.setText(nguoiDungList.get(0).getTruongdanghoc());
        edtendangnhaptt.setText(nguoiDungList.get(0).getTendangnhap());
        edhotentt.setText(nguoiDungList.get(0).getHoten());
        edquequantt.setText(nguoiDungList.get(0).getQuequan());








//
//        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        editor = sharedPreferences.edit();
//        String savehotens = sharedPreferences.getString("hotens", "");
//        String savematkhaus = sharedPreferences.getString("matkhaus", "");
//        String savequequans = sharedPreferences.getString("quequans", "");
//        String savetendangnhaps = sharedPreferences.getString("tendangnhaps", "");
//        String savetruongdanghocs = sharedPreferences.getString("truongdanghocs", "");
//        edtendangnhaptt.setText(savetendangnhaps);
//        edquequantt.setText(savequequans);
//        edhotentt.setText(savehotens);
//        edtruongdanghoctt.setText(savetruongdanghocs);
//        edmatkhautt.setText(savematkhaus);
//        btnluu.setOnClickListener(this);

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
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Đăng xuất");
        builder.setMessage("bạn có chắc chắn muốn đnăg xuất khỏi ứng dụng ?");
        builder.setPositiveButton("Đăng xuất", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(ThongTin_CaNhan_Activity.this, Login_Activity.class);
                startActivity(intent);
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


    public void capnhat(View view) {
        NguoiDung nguoiDung = new NguoiDung();
        nguoiDung.setTendangnhap(edtendangnhaptt.getText().toString());
        nguoiDung.setMatkhau(edmatkhautt.getText().toString());
        nguoiDung.setHoten(edhotentt.getText().toString());
        nguoiDung.setTruongdanghoc(edtruongdanghoctt.getText().toString());
        nguoiDung.setQuequan(edquequantt.getText().toString());
        long kq = nguoiDungDAO.update(nguoiDung);
        if (edhotentt.getText().toString().isEmpty() || edmatkhautt.getText().toString().isEmpty() ||
                edtendangnhaptt.getText().toString().isEmpty() || edquequantt.getText().toString().isEmpty() || edtruongdanghoctt.getText().toString().isEmpty()) {
            Toast.makeText(ThongTin_CaNhan_Activity.this, "Bạn cần nhập đủ thông tin", Toast.LENGTH_SHORT).show();


        } else {


            if (kq > 0) {
                Toast.makeText(ThongTin_CaNhan_Activity.this, "cập nhật thành công", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(ThongTin_CaNhan_Activity.this, "cập nhật không thành công", Toast.LENGTH_SHORT).show();
            }
        }
    }




//    @Override
//    public void onClick(View v) {
//        if (v == btnluu) {
//
//            String tendangnhaps = edtendangnhaptt.getText().toString();
//            String matkhaus = edmatkhautt.getText().toString();
//            String hotens = edhotentt.getText().toString();
//            String quequans = edquequantt.getText().toString();
//            String truongdanghocs = edtruongdanghoctt.getText().toString();
//
//
//            // Nếu click vào nút Save, ta sẽ lưu dữ liệu lại.
//            // "DATA" là key, data tham số thứ 2 là value.
////            editor.putString("DATA", data);
////            editor.commit();
//            editor.putString("tendangnhaps", tendangnhaps);
//            editor.putString("matkhaus", matkhaus);
//            editor.putString("hotens", hotens);
//            editor.putString("quequans", quequans);
//            editor.putString("truongdanghocs", truongdanghocs);
//            editor.commit();
//        }
//
//    }
}