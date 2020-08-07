package com.poly.tracnghiem12.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.poly.tracnghiem12.Fragment.DeThi_Tienganh_Fragment;
import com.poly.tracnghiem12.Fragment.TaiLieu_Tienganh10_Fragment;

public class Tienganh10_Adapter extends FragmentStatePagerAdapter {
    public Tienganh10_Adapter(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DeThi_Tienganh_Fragment();
        } else if (position == 1) {

            return new TaiLieu_Tienganh10_Fragment();
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Đề thi ";
        } else if (position == 1) {
            return "Tài liệu";
        }
        return null;
    }
}
