package com.poly.tracnghiem12.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.poly.tracnghiem12.Adapter.Dethi_Toan_Adapter;
import com.poly.tracnghiem12.Model.Dethi_Toan;
import com.poly.tracnghiem12.R;

import java.util.ArrayList;
import java.util.List;


public class DeThi_Toan_Fragment extends Fragment {
    Dethi_Toan_Adapter dethi_toan_adapter;
    List<Dethi_Toan> dethi_toans;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_de_thi__toan_, container, false);
        ListView lvdethitoan = view.findViewById(R.id.lvdethitoan);
        dethi_toans = new ArrayList<>();

        dethi_toans.add(new Dethi_Toan("Đề số 1", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 2", "90 phút", "50 câu"));

        dethi_toans.add(new Dethi_Toan("Đề số 3", "90 phút", "50 câu"));

        dethi_toans.add(new Dethi_Toan("Đề số 4", "90 phút", "50 câu"));

        dethi_toans.add(new Dethi_Toan("Đề số 5", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 6", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 7", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 8", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 9", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 10", "90 phút", "50 câu"));

        dethi_toans.add(new Dethi_Toan("Đề số 10", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 11", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 12", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 13", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 14", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 15", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 16", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 18", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 19", "90 phút", "50 câu"));
        dethi_toans.add(new Dethi_Toan("Đề số 20", "90 phút", "50 câu"));

        dethi_toan_adapter = new Dethi_Toan_Adapter(getContext(), dethi_toans);

        lvdethitoan.setAdapter(dethi_toan_adapter);
        lvdethitoan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),"chưa code xong", Toast.LENGTH_LONG).show();
            }
        });
        return view;


    }
}