package com.example.final4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DSGiangVienAct extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsgiang_vien);
        context = this;
        listView = (ListView) findViewById(R.id.DSGiangVien_list);

        ArrayList<String> listGiangVien = FileHelper.readFromFile(context, "GiangVien_B19DCAT083.txt");
        adapter = new ArrayAdapter(context, android.R.layout.simple_list_item_1, listGiangVien);
        listView.setAdapter(adapter);

    }
}