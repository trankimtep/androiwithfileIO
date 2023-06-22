package com.example.final4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DSChuyenMonAct extends AppCompatActivity {

    ListView listView;
    Context context;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dschuyen_mon);

        listView = (ListView) findViewById(R.id.DSChuyenMon_list);
        context = this;
        ArrayList<String> chuyenMonList = FileHelper.readFromFile(context, "ChuyenMon_B19DCAT083.txt");
        adapter = new ArrayAdapter(context, android.R.layout.simple_list_item_1, chuyenMonList);
        listView.setAdapter(adapter);

    }
}