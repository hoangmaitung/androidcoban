package com.example.tinhtong2so;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnRutbai(View view) {
        Intent intent = new Intent(MainActivity.this, RutbaiRandom.class);
        startActivity(intent);
    }

    public void btnPheptinh(View view) {
        Intent intent = new Intent(MainActivity.this, Pheptinh2so.class);
        startActivity(intent);
    }

    public void btnAsyncTask(View view) {
        Intent intent = new Intent(MainActivity.this, AsyncTask.class);
        startActivity(intent);
    }

    public void btnReadFile(View view) {
        Intent intent = new Intent(MainActivity.this, ReadFileInternet.class);
        startActivity(intent);
    }

    public void btnTruyenthamso(View view) {
        Intent intent = new Intent(MainActivity.this, PutExtra.class);
        startActivity(intent);
    }
}
