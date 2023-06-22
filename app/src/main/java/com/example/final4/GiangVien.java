package com.example.final4;

public class GiangVien {
    private int maGiangVien;
    private String tenGiangVien;
    private String trinhDo;
    private int namKinhNghiem;

    public GiangVien(int maGiangVien, String tenGiangVien, String trinhDo, int namKinhNghiem) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
        this.trinhDo = trinhDo;
        this.namKinhNghiem = namKinhNghiem;
    }

    public int getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(int maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }

    @Override
    public String toString(){
        return ""+maGiangVien+"    "+tenGiangVien;
    }

}
