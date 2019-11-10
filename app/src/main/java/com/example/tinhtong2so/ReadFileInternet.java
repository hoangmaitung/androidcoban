package com.example.tinhtong2so;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;

public class ReadFileInternet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_file_internet);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new LoadStringFromUrl().execute("http://khoapham.vn");
            }
        });
    }

    class LoadStringFromUrl extends AsyncTask<String, Integer, String>{

        @Override
        protected String doInBackground(String... params) {
            String ndung = getXmlFromUrl(params[0]);
            return ndung;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(ReadFileInternet.this, s, Toast.LENGTH_LONG ).show();
        }
    }

    private String getXmlFromUrl(String urlString){
        String xml = null;
        try {
            // defaulthttpClient lấy toàn bộ dữ liệu trong http đổ vào 1 chuỗi
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(urlString);
            HttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();

            xml = EntityUtils.toString(httpEntity, HTTP.UTF_8);
            //set utf-8 cho ra chữ unnikey

        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        } catch (ClientProtocolException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        //return xml
        return xml;
    }
}
