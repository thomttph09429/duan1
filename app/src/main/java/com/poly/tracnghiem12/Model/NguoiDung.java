package com.poly.tracnghiem12.Model;

public class NguoiDung {
    String tendangnhap;
    String matkhau;
    String hoten;
    String truongdanghoc;
    String quequan;
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTruongdanghoc() {
        return truongdanghoc;
    }

    public void setTruongdanghoc(String truongdanghoc) {
        this.truongdanghoc = truongdanghoc;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public NguoiDung(String tendangnhap, String matkhau, String hoten, String truongdanghoc, String quequan) {
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.truongdanghoc = truongdanghoc;
        this.quequan = quequan;
    }



    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public NguoiDung() {
    }

    public NguoiDung(String tendangnhap, String matkhau) {
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
    }
}
