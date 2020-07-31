package com.poly.tracnghiem12.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.poly.tracnghiem12.Model.Tailieu_pdf;
import com.poly.tracnghiem12.R;

import java.util.List;

public class Tailieu_pdf_adapter extends BaseAdapter {
    List<Tailieu_pdf> tailieu_pdfs;

    public Tailieu_pdf_adapter(List<Tailieu_pdf> tailieu_pdfs, Context context) {
        this.tailieu_pdfs = tailieu_pdfs;
        this.context = context;
    }

    Context context;
    @Override
    public int getCount() {
        return tailieu_pdfs.size();
    }

    @Override
    public Object getItem(int position) {
        return tailieu_pdfs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
  View view=      LayoutInflater.from(context).inflate(R.layout.row_tailieu_pdf, parent, false);
        TextView tvten_tailieu= view.findViewById(R.id.tvten_tailieu);
        TextView tvsotrang= view.findViewById(R.id.tvsotrang);


        tvten_tailieu.setText(tailieu_pdfs.get(position).getTentailieu());
        tvsotrang.setText(tailieu_pdfs.get(position).getSotrang());



        return view;
    }
}
