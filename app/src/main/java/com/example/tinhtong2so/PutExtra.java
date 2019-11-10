package com.example.tinhtong2so;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PutExtra extends AppCompatActivity {

    private EditText edtHoten;
    private Button btnTTS;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_extra);

        edtHoten = (EditText) findViewById(R.id.edtHoten);
        btnTTS = (Button) findViewById(R.id.btnTTS);

        btnTTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PutExtra.this, GetIntent.class);
                intent.putExtra("hoten", edtHoten.getText().toString());
                startActivity(intent);
            }
        });

    }
}
