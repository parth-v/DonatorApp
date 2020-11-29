package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }
    public void openSuccessActivity (View view) {
        Intent intent = new Intent(this, SuccessActivity.class);
        EditText editText = (EditText) findViewById(R.id.amount);
        String amount = String.valueOf(editText.getText());
        intent.putExtra("amount", amount);
        startActivity(intent);
    }
}