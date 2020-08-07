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


public class TaiLieu_Tienganh10_Fragment extends Fragment {
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
                intent.putExtra("tentailieu", tentailieu);

                startActivity(intent);
            }
        });
        tailieu_pdfs.add(new Tailieu_pdf("Câu gián tiếp tiếng anh lớp 10", "Cau_gian_tiep_Mon_Tieng_anh_lop_10.pdf", "Đọc"));
        tailieu_pdfs.add(new Tailieu_pdf("Động từ tiếng anh lớp 10", "Dong_tu_DABTTL_mon_Tieng_anh_lop_10.pdf", "Đọc"));
        tailieu_pdfs.add(new Tailieu_pdf("Giới từ ", "Gioi_tu_BTTL_mon_Tieng_anh_lop_10.pdf", "Đọc"));
        tailieu_pdfs.add(new Tailieu_pdf("Lấy gốc tiếng anh từ 12 thì của động từ", "Lay_goc_tieng_Anh_tu_12_thi_dong_tu.pdf", "Đọc"));
        tailieu_pdfs.add(new Tailieu_pdf("Liên từ trong tiếng anh", "Lien_tu_BTTL_mon_Tieng_anh_lop_10.pdf", "Đọc"));
        tailieu_pdfs.add(new Tailieu_pdf("Qúa khứ đơn và quá khứ hoàn thành lớp 10", "Qua_khu_don_va_qua_khu_hoan_thanh_BTTL_mon_Tieng_anh_lop_10.pdf", "Đọc"));
        tailieu_pdfs.add(new Tailieu_pdf("Thì quá khứ đơn", "Qua_khu_don_va_qua_khu_hoan_thanh_Mon_Tieng_anh_lop_10.pdf", "Đọc"));
        tailieu_pdfs.add(new Tailieu_pdf("Thì hiện tại đơn và hiện tại tiếp diễn", "Thi_hien_tai_don_va_hien_tai_tiep_dien_DABTTL_mon_Tieng_anh_lop_10.pdf", "Đọc"));
        tailieu_pdfs.add(new Tailieu_pdf("Thì hiện tại tiếp diễn", "Thi_hien_tai_don_va_hien_tai_tiep_dien_BTTL_mon_Tieng_anh_lop_10.pdf", "Đọc"));
        tailieu_pdfs.add(new Tailieu_pdf("Tính từ và trạng từ", "Tinh_tu_trang_tu_BTTL_mon_Tieng_anh_lop_10.pdf", "Đọc"));
        tailieu_pdf_adapter = new Tailieu_pdf_adapter(tailieu_pdfs, getContext());
        lv.setAdapter(tailieu_pdf_adapter);


        return view;
    }


}