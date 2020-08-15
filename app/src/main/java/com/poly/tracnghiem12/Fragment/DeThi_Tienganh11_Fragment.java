package com.poly.tracnghiem12.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.poly.tracnghiem12.Adapter.Dethi_Tienganh11_Adapter;
import com.poly.tracnghiem12.Dethi_TiengAnh11_Activity;
import com.poly.tracnghiem12.Model.Category11;
import com.poly.tracnghiem12.Model.Dethi_Tienganh11;
import com.poly.tracnghiem12.R;
import com.poly.tracnghiem12.Tienganh.Question_Tienganh11;
import com.poly.tracnghiem12.Tienganh.Quiz_Tienganh11_Helper;

import java.util.ArrayList;
import java.util.List;


public class DeThi_Tienganh11_Fragment extends Fragment {

    Dethi_Tienganh11_Adapter dethi_toan_adapter;
    List<Dethi_Tienganh11> dethi_toans;
    Dethi_Tienganh11 dethi_toan;


    Quiz_Tienganh11_Helper quiz_tienganh11_helper;


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_de_thi__tienganh11_, container, false);
        ListView lvdethitoan = view.findViewById(R.id.lvdethitoan);
        dethi_toans = new ArrayList<>();
        quiz_tienganh11_helper = new Quiz_Tienganh11_Helper(getContext());


        dethi_toans.add(new Dethi_Tienganh11("Đề số 1", "30 phút", "20 câu"));
        dethi_toans.add(new Dethi_Tienganh11("Đề số 2", "30 phút", "20 câu"));

        dethi_toans.add(new Dethi_Tienganh11("Đề số 3", "30 phút", "20 câu"));

        dethi_toans.add(new Dethi_Tienganh11("Đề số 4", "30 phút", "20 câu"));

        dethi_toans.add(new Dethi_Tienganh11("Đề số 5", "30 phút", "20 câu"));
        dethi_toans.add(new Dethi_Tienganh11("Đề số 6", "30 phút", "20 câu"));

        dethi_toan_adapter = new Dethi_Tienganh11_Adapter(getContext(), dethi_toans);

        lvdethitoan.setAdapter(dethi_toan_adapter);
        lvdethitoan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dethi_toan = (Dethi_Tienganh11) dethi_toan_adapter.getItem(position);
                String tendethi = dethi_toan.getTen_de_thi();
                switch (position) {
                    case 0:
//
                      Intent  intentde1 = new Intent(getContext(), Dethi_TiengAnh11_Activity.class);
                        intentde1.putExtra("category", Question_Tienganh11.CATEGORY_DETHISO1);
                        intentde1.putExtra("tendethi", tendethi);
                        startActivity(intentde1);
                        break;
                    case 1:
                     Intent   intentde2 = new Intent(getContext(), Dethi_TiengAnh11_Activity.class);
                        intentde2.putExtra("category", Question_Tienganh11.CATEGORY_DETHISO2);
                        intentde2.putExtra("tendethi", tendethi);

                        startActivity(intentde2);
                        break;
                    case 2:
                    Intent    intentde3 = new Intent(getContext(), Dethi_TiengAnh11_Activity.class);
                        intentde3.putExtra("category", Question_Tienganh11.CATEGORY_DETHISO3);
                        intentde3.putExtra("tendethi", tendethi);

                        startActivity(intentde3);
                        break;
                    case 3:
                      Intent  intentde4 = new Intent(getContext(), Dethi_TiengAnh11_Activity.class);
                        intentde4.putExtra("category", Question_Tienganh11.CATEGORY_DETHISO4);
                        intentde4.putExtra("tendethi", tendethi);

                        startActivity(intentde4);
                        break;
                    case 4:
                    Intent    intentde5 = new Intent(getContext(), Dethi_TiengAnh11_Activity.class);
                        intentde5.putExtra("category", Question_Tienganh11.CATEGORY_DETHISO5);
                        intentde5.putExtra("tendethi", tendethi);

                        startActivity(intentde5);
                        break;
                    case 5:
                        Intent   intentde6 = new Intent(getContext(), Dethi_TiengAnh11_Activity.class);
                        intentde6.putExtra("category", Question_Tienganh11.CATEGORY_DETHISO6);
                        intentde6.putExtra("tendethi", tendethi);

                        startActivity(intentde6);
                        break;

                }



            }
        });

        return view;


    }
}