package com.example.labexer3_vivas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("4ITB", "onCreate has executed");
        Intent i = new Intent(this, myService.class);
        startService(i);
    }

    public void showData(View v){
        FileInputStream reader = null;
        String data= "";
        try {
            reader = openFileInput("data1.txt");
            int token;

            while ((token = reader.read()) != -1){
                data = data + (char)token;
            }
        } catch (FileNotFoundException e) {
            Log.d("ERROR","FILE NOT FOUND");
        }
        catch (IOException e) {
            Log.d("ERROR","IO ERROR");
        }
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();

    }
}
