package com.example.labexer3_vivas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText subj1,subj2,subj3,subj4,subj5,subj6,subj7,subj8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subj1 = findViewById(R.id.subj1);
        subj2 = findViewById(R.id.subj2);
        subj3 = findViewById(R.id.subj3);
        subj4 = findViewById(R.id.subj4);
        subj5 = findViewById(R.id.subj5);
        subj6 = findViewById(R.id.subj6);
        subj7 = findViewById(R.id.subj7);
        subj8 = findViewById(R.id.subj8);
    }
    public void writeData (View v){
        String data1 = subj1.getText().toString() + "/";
        String data2 = subj2.getText().toString() + "/";
        String data3 = subj3.getText().toString() + "/";
        String data4 = subj4.getText().toString() + "/";
        String data5 = subj5.getText().toString() + "/";
        String data6 = subj6.getText().toString() + "/";
        String data7 = subj7.getText().toString() + "/";
        String data8 = subj8.getText().toString() + "/";
        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data1.txt",MODE_PRIVATE);

            writer.write(data1.getBytes());
            writer.write(data2.getBytes());
            writer.write(data3.getBytes());
            writer.write(data4.getBytes());
            writer.write(data5.getBytes());
            writer.write(data6.getBytes());
            writer.write(data7.getBytes());
            writer.write(data8.getBytes());
        } catch (FileNotFoundException e) {
            Log.d("ERROR","FILE NOT FOUND");

        } catch (IOException e) {
            Log.d("ERROR","IO ERROR");
        }finally {

            try {
                writer.close();
            } catch (IOException e) {
                Log.d("ERROR", "FILE NOT FOUND");
            }
        }
        Toast.makeText(this, "data saved...", Toast.LENGTH_LONG).show();
    }
    public void display(View v){
        Intent i = new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}
