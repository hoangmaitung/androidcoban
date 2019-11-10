package com.example.tinhtong2so;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class RutbaiRandom extends AppCompatActivity {

    private ImageView img;
    private Button btnTong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutbai_random);

        img = (ImageView) findViewById(R.id.img);
        btnTong = (Button) findViewById(R.id.btnTong);

        final ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.c1);
        list.add(R.drawable.c2);
        list.add(R.drawable.c3);
        list.add(R.drawable.c4);
        list.add(R.drawable.c5);
        list.add(R.drawable.c7);
        list.add(R.drawable.c6);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int batki = r.nextInt(list.size());
                img.setImageResource(list.get(batki));
            }
        });



        new CountDownTimer(12000, 3000) {
            @Override
            public void onTick(long l) {

                Random r = new Random();
                int batki = r.nextInt(list.size());
                img.setImageResource(list.get(batki));
            }

            @Override
            public void onFinish() {
                Toast.makeText(RutbaiRandom.this, "Đã rút xong 4 lần", Toast.LENGTH_LONG ).show();
            }
        }.start();
    }
}
