package com.cookandroid.dutchpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    EditText edtPay, edtPerson;
    CheckBox chkN, chkPersent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        edtPay = findViewById(R.id.edtPay);
        edtPerson = findViewById(R.id.edtPerson);
        chkPersent = findViewById(R.id.chkPersent);
        chkN = findViewById(R.id.chkN);

        edtPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, WebActivity.class);
                intent.putExtra("TEXT",
                        "https://m.shopping.naver.com/search/all?query=" + editText.getText().toString());  // 텍스트 읽어오기
                startActivity(intent);
            }
        });
    }
}