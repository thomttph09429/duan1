package com.poly.tracnghiem12.Fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.poly.tracnghiem12.Dethi_tienganh12_Activity;
import com.poly.tracnghiem12.MonTienganh10_Activity;
import com.poly.tracnghiem12.MonTienganh11_Activity;
import com.poly.tracnghiem12.R;


public class Trangchu_Fragment extends Fragment {
    Button tienganh10, tienganh11, tienganh12;
    int id;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trangchu_, container, false);
        TextView tvhuongdan = view.findViewById(R.id.tvhuongdan);


        tvhuongdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Hướng dẫn");
                builder.setMessage(".Bạn có thể làm bài trắc nghiệm\n" +
                        "bằng cách chọn môn học rồi sau \n" +
                        "đó trả lời từng câu hỏi đước đưa ra\n" +
                        ". Sau khi làm xong finish\n" +
                        "bài và sau đó xem số câu đúng câu sai,\n" +
                        "bạn có thể chọn cách làm lại hoặc\n" +
                        "trở về màn hình chính");

                builder.setPositiveButton("Đã hiểu", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.create();
                builder.show();
            }

        });

        tienganh10 = view.findViewById(R.id.tienganh10);
        tienganh11 = view.findViewById(R.id.tienganh11);
        tienganh12 = view.findViewById(R.id.tienganh12);
        tienganh12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Dethi_tienganh12_Activity.class);
                startActivity(intent);


            }
        });
        tienganh11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MonTienganh11_Activity.class);
                startActivity(intent);
            }
        });


        tienganh10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MonTienganh10_Activity.class);
                startActivity(intent);

            }
        });


        return view;


    }
}