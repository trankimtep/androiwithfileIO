package com.example.final4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThemGiangVienAct extends AppCompatActivity {

    EditText edTenGiangVien, edtTrinhDo, edtNamKinhNghiem;
    Button btnThem;
    private static final String FILE_NAME = "GiangVien_B19DCAT083.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_giang_vien);

        edTenGiangVien = (EditText) findViewById(R.id.themGiangVien_tenGiangVien);
        edtTrinhDo = (EditText) findViewById(R.id.themGiangVien_trinhDo);
        edtNamKinhNghiem = (EditText) findViewById(R.id.themGiangVien_namKinhNghiem);
        btnThem = (Button) findViewById(R.id.themGiangVien_btn);

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenGiangVien = String.valueOf(edTenGiangVien.getText());
                String trinhDo = String.valueOf(edtTrinhDo.getText());
                String namKinhNghiem = String.valueOf(edtNamKinhNghiem.getText());

                int lineCount = FileHelper.countLines(ThemGiangVienAct.this, FILE_NAME);
                String data = (lineCount+1) + "," + tenGiangVien + "," + trinhDo + "," + namKinhNghiem;
                FileHelper.writeToFile(ThemGiangVienAct.this, FILE_NAME, data);

                Toast.makeText(ThemGiangVienAct.this, "Them giang vien thanh cong", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ThemGiangVienAct.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}