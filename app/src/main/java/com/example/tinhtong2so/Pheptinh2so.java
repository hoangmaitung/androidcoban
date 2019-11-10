package com.example.tinhtong2so;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pheptinh2so extends AppCompatActivity {

    private EditText edtSo1;
    private EditText edtSo2;
    private Button btnTong;
    private TextView kq;

    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pheptinh2so);

        edtSo1 = (EditText) findViewById(R.id.edtSo1);
        edtSo2 = (EditText) findViewById(R.id.edtSo2);
        btnTong = (Button) findViewById(R.id.btnTong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        kq = (TextView) findViewById(R.id.kq);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = edtSo1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = edtSo2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int tong = so1 + so2;
                kq.setText(String.valueOf(tong));
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = edtSo1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = edtSo2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int tru = so1 - so2;
                kq.setText(String.valueOf(tru));
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = edtSo1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = edtSo2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int nhan = so1 * so2;
                kq.setText(String.valueOf(nhan));
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = edtSo1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = edtSo2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int chia = so1 / so2;
                kq.setText(String.valueOf(chia));
            }
        });
    }
}
