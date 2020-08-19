package com.poly.tracnghiem12.Fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.poly.tracnghiem12.R;
import com.poly.tracnghiem12.ThongTin_CaNhan_Activity;

public class Thongtincanhan_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_thongtincanhan_, container, false);
//            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
//            builder.setTitle("thông báo");
//            builder.setMessage("Nếu bạn cần chỉnh sửa thông tin cá nhân, hãy nhấn vào đây");
//            builder.setPositiveButton("Đã hiểu", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    Intent intent = new Intent(getActivity(), ThongTin_CaNhan_Activity.class);
//                    startActivity(intent);
//                }
//            });
//
//            builder.create();
//            builder.show();

        Intent intent = new Intent( getContext(), ThongTin_CaNhan_Activity.class);
        startActivity(intent);
            return view;
    }
}