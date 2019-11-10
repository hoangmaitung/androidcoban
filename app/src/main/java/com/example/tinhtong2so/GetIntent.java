
package com.example.tinhtong2so;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetIntent extends AppCompatActivity {

    private TextView tvHoten;
        private Button back;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_get_intent);

        tvHoten = (TextView) findViewById(R.id.tvHoten);

//       nhận tham số

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String ten = bundle.getString("hoten");

            tvHoten.setText(ten);
        }



        //quay về
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetIntent.this, PutExtra.class);
                startActivity(intent);
            }
        });

    }
}
