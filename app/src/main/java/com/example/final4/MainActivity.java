package com.example.final4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button dsGiangVien, dsChuyenMon, dsGiangVienChuyenMon, ds10nam, top2ChuyenMon, themGiangVien, themCHuyenMon, themChuyenMonGiangVien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dsGiangVien = (Button) findViewById(R.id.main_danhSachGiangVien);
        dsChuyenMon = (Button) findViewById(R.id.main_danhSachChuyenMon);
        dsGiangVienChuyenMon = (Button) findViewById(R.id.main_danhSachGiangVienChuyenMon);
        ds10nam = (Button) findViewById(R.id.main_DSLonHon10);
        top2ChuyenMon = (Button) findViewById(R.id.main_top2);
        themGiangVien = (Button) findViewById(R.id.main_themGiangVien);
        themCHuyenMon = (Button) findViewById(R.id.main_themChuyenMon);
        themChuyenMonGiangVien = (Button) findViewById(R.id.main_themChuyenMonGiangVien);

        dsGiangVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DSGiangVienAct.class);
                startActivity(intent);
            }
        });

        dsChuyenMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DSChuyenMonAct.class);
                startActivity(intent);
            }
        });

        dsGiangVienChuyenMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DSGiangVien_ChuyenMon.class);
                startActivity(intent);
            }
        });

        ds10nam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DSLonHon10Act.class);
                startActivity(intent);
            }
        });

        top2ChuyenMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Top2ChuyenMonAct.class);
                startActivity(intent);
            }
        });

        themGiangVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThemGiangVienAct.class);
                startActivity(intent);
            }
        });

        themCHuyenMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThemChuyenMonAct.class);
                startActivity(intent);
            }
        });

        themChuyenMonGiangVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThemChuyenMonGiangVienAct.class);
                startActivity(intent);
            }
        });

    }
}