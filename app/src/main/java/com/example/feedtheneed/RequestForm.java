package com.example.feedtheneed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RequestForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_form);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, RequestPage.class);
        startActivity(intent);
    }

    public void goCheckout(View view) {
        Intent intent = new Intent(this, Checkout.class);
        startActivity(intent);
    }}