package com.poly.tracnghiem12.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.poly.tracnghiem12.Model.Dethi_Toan;
import com.poly.tracnghiem12.R;

import java.util.List;

public class Dethi_Toan_Adapter extends BaseAdapter {
    Context context;
    List<Dethi_Toan> dethi_toans;
    Dethi_Toan dethi_toan;

    public Dethi_Toan_Adapter(Context context, List<Dethi_Toan> dethi_toans) {
        this.context = context;
        this.dethi_toans = dethi_toans;
    }

    @Override
    public int getCount() {
        return dethi_toans.size();
    }

    @Override
    public Object getItem(int position) {
        return dethi_toans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_dethitoan, parent, false);
        TextView ten_De_Thi_toan = view.findViewById(R.id.tv_tendethitoan);
        TextView tvthoigian = view.findViewById(R.id.tv_thoigian);
        TextView tvsocau = view.findViewById(R.id.tv_socauhoi);

        ten_De_Thi_toan.setText(dethi_toans.get(position).getTen_de_thi());
        tvsocau.setText(dethi_toans.get(position).getSo_Cau());
        tvthoigian.setText(dethi_toans.get(position).getThoi_gian());


        return view;
    }
}
