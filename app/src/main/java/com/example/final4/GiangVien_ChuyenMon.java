package com.example.final4;

public class GiangVien_ChuyenMon {
    private  int maGiangVien;
    private int maChuyenMon;
    private int namKinhNghiem;

    public GiangVien_ChuyenMon(int maGiangVien, int maChuyenMon, int namKinhNghiem) {
        this.maGiangVien = maGiangVien;
        this.maChuyenMon = maChuyenMon;
        this.namKinhNghiem = namKinhNghiem;
    }

    public int getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(int maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public int getMaChuyenMon() {
        return maChuyenMon;
    }

    public void setMaChuyenMon(int maChuyenMon) {
        this.maChuyenMon = maChuyenMon;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }

}
