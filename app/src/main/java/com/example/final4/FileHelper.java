package com.example.final4;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileHelper{
    public static void writeToFile(Context context, String filename, String data){
        try {
            FileOutputStream fileOutputStream = context.openFileOutput(filename, Context.MODE_APPEND);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write(data+"\n");

            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
          }
        }

    public static ArrayList<String> readFromFile(Context context, String filename){
        ArrayList<String> lines = new ArrayList<>();
        try {
            InputStream inputStream = context.openFileInput(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static int countLines(Context context, String filename){
        ArrayList<String> lines = new ArrayList<>();
        try {
            InputStream inputStream = context.openFileInput(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines.size();
    }

}
