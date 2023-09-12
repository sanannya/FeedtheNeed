package com.example.feedtheneed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VolunteerForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_form);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, VolunteerPage.class);
        startActivity(intent);
    }

    public void goCheckout(View view) {
        Intent intent = new Intent(this, Checkout.class);
        startActivity(intent);
    }
}