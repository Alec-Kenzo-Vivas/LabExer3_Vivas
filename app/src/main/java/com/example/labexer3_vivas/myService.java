package com.example.labexer3_vivas;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class myService extends IntentService {

    public myService() {
        super("myService");

    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITF", "myService is running");
    }
}