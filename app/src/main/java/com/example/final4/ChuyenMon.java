package com.example.final4;

public class ChuyenMon {
    private int maChuyenMon;
    private String tenChuyenMon;
    private String moTa;

    public ChuyenMon(int maChuyenMon, String tenChuyenMon, String moTa) {
        this.maChuyenMon = maChuyenMon;
        this.tenChuyenMon = tenChuyenMon;
        this.moTa = moTa;
    }

    public int getMaChuyenMon() {
        return maChuyenMon;
    }

    public void setMaChuyenMon(int maChuyenMon) {
        this.maChuyenMon = maChuyenMon;
    }

    public String getTenChuyenMon() {
        return tenChuyenMon;
    }

    public void setTenChuyenMon(String tenChuyenMon) {
        this.tenChuyenMon = tenChuyenMon;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString(){
        return ""+maChuyenMon+"    "+tenChuyenMon;
    }
}
