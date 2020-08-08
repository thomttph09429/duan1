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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.poly.tracnghiem12.MonHoc_Activity;
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
                        ". Mỗi đề sẽ có 40 câu hỏi\n" +
                        ". Sau khi làm xong bạn chọn nộp\n" +
                        "bài và sau đó xem điểm của mình,\n" +
                        "bạn có thể chọn cách làm lại hoặc\n" +
                        "lưu điểm của mình đã làm được");

                builder.setPositiveButton("Đã hiểu",new DialogInterface.OnClickListener() {
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


        tienganh10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MonHoc_Activity.class);
                startActivity(intent);

            }
        });


        return view;


    }
}