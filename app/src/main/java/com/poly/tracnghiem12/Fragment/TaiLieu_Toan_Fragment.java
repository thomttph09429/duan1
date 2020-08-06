package com.poly.tracnghiem12.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.poly.tracnghiem12.Adapter.Tailieu_pdf_adapter;
import com.poly.tracnghiem12.Model.Tailieu_pdf;
import com.poly.tracnghiem12.R;
import com.poly.tracnghiem12.TailieuTiengAnh10_Activity;

import java.util.ArrayList;
import java.util.List;


public class TaiLieu_Toan_Fragment extends Fragment {
    List<Tailieu_pdf> tailieu_pdfs;
    Tailieu_pdf_adapter tailieu_pdf_adapter;
    Intent intent;
//    public List<String> link = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tai_lieu__tienganh10_, container, false);
        tailieu_pdfs = new ArrayList<>();
        intent = new Intent(getActivity(), TailieuTiengAnh10_Activity.class);

        final ListView lv = view.findViewById(R.id.lvtailieu);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tailieu_pdf tailieu_pdf = (Tailieu_pdf) tailieu_pdf_adapter.getItem(position);
                String links = tailieu_pdf.getPdf();
                String tentailieu = tailieu_pdf.getTentailieu();
                intent.putExtra("linkURL", links);
                intent.putExtra("tentailieu",tentailieu );

                startActivity(intent);
            }
        });
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi thpt quốc gia số 1 có đáp án", "de1.pdf", "7 trang"));
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi thpt quốc gia số 2 có đáp án", "de2.pdf", "7 trang"));
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi thpt quốc gia số 3 có đáp án", "de3.pdf", "7 trang"));
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi thpt quốc gia số 4 có đáp án", "de4.pdf", "7 trang"));
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi thpt quốc gia số 5 có đáp án", "de5.pdf", "7 trang"));
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi thpt quốc gia số 6 có đáp án", "de6.pdf", "7 trang"));
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi  thpt quốc gia số 7 có đáp án", "de7.pdf", "7 trang"));
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi thpt quốc gia số 8 có đáp án", "de8.pdf", "7 trang"));
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi thpt quốc gia số 9 có đáp án", "de9.pdf", "7 trang"));
        tailieu_pdfs.add(new Tailieu_pdf("Đề thi thpt quốc gia số 10 có đáp án", "de10.pdf", "7 trang"));
        tailieu_pdf_adapter = new Tailieu_pdf_adapter(tailieu_pdfs, getContext());
        lv.setAdapter(tailieu_pdf_adapter);


        return view;
    }


}