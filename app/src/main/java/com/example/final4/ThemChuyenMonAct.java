package com.example.final4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThemChuyenMonAct extends AppCompatActivity {

    EditText tenChuyenMon, moTa;
    Button them;

    private static final String FILE_NAME = "ChuyenMon_B19DCAT083.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_chuyen_mon);

        tenChuyenMon = (EditText) findViewById(R.id.themChuyenMon_tenChuyenMon);
        moTa = (EditText) findViewById(R.id.themChuyenMon_moTa);
        them = (Button) findViewById(R.id.themChuyenMon_btn);

        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strTen = String.valueOf(tenChuyenMon.getText());
                String strMoTa = String.valueOf(moTa.getText());

                if (TextUtils.isEmpty(strTen) || TextUtils.isEmpty(strMoTa)){
                    Toast.makeText(ThemChuyenMonAct.this, "Vui long dien du thong tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                int lineCount = FileHelper.countLines(ThemChuyenMonAct.this, FILE_NAME);
                String data = (lineCount+1)+"    "+strTen;
                FileHelper.writeToFile(ThemChuyenMonAct.this,FILE_NAME, data);

                Toast.makeText(ThemChuyenMonAct.this, "Them chuyen mon thanh cong", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ThemChuyenMonAct.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}