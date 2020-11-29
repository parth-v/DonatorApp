package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent = getIntent();
        String amount = intent.getStringExtra("amount");
        TextView textView = (TextView) findViewById(R.id.textSuccessHeader);
        textView.setText(String.format("Transaction Successful !\nAmount Paid: %s", amount));
    }
}