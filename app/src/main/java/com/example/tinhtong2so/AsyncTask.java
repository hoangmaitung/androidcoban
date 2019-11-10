package com.example.tinhtong2so;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AsyncTask extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);

        img = (ImageView) findViewById(R.id.img);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new LoadHinhTuInternet().execute("http://thuthuatphanmem.vn/uploads/2018/09/11/hinh-anh-dep-11_044127919.jpg");
            }
        });
    }

    private class LoadHinhTuInternet extends android.os.AsyncTask<String, Integer, Bitmap> {

        Bitmap bitmap = null;

        @Override
        protected Bitmap doInBackground(String... params) {

            try {
                URL u = new URL(params[0]);
                bitmap = BitmapFactory.decodeStream(u.openConnection().getInputStream());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            img.setImageBitmap(bitmap);
        }
    }
}




