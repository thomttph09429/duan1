package com.poly.tracnghiem12.Model;

public class Tailieu_pdf {
    String tentailieu;
    String pdf;
    String sotrang;

    public Tailieu_pdf() {
    }

    public String getTentailieu() {
        return tentailieu;
    }

    public void setTentailieu(String tentailieu) {
        this.tentailieu = tentailieu;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getSotrang() {
        return sotrang;
    }

    public void setSotrang(String sotrang) {
        this.sotrang = sotrang;
    }

    public Tailieu_pdf(String tentailieu, String sotrang) {
        this.tentailieu = tentailieu;
        this.sotrang = sotrang;
    }

    public Tailieu_pdf(String tentailieu, String pdf, String sotrang) {
        this.tentailieu = tentailieu;
        this.pdf = pdf;
        this.sotrang = sotrang;
    }
}
