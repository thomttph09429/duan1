package com.poly.tracnghiem12.Model;

public class Dethi_Toan {
    String ten_de_thi;
    String thoi_gian;
    String so_Cau;


    public Dethi_Toan() {
    }

    public String getTen_de_thi() {
        return ten_de_thi;
    }

    public void setTen_de_thi(String ten_de_thi) {
        this.ten_de_thi = ten_de_thi;
    }

    public String getThoi_gian() {
        return thoi_gian;
    }

    public void setThoi_gian(String thoi_gian) {
        this.thoi_gian = thoi_gian;
    }

    public String getSo_Cau() {
        return so_Cau;
    }

    public void setSo_Cau(String so_Cau) {
        this.so_Cau = so_Cau;
    }


    public Dethi_Toan(String ten_de_thi, String thoi_gian, String so_Cau) {
        this.ten_de_thi = ten_de_thi;
        this.thoi_gian = thoi_gian;
        this.so_Cau = so_Cau;
    }
}

