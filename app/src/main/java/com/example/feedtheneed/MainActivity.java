package com.example.feedtheneed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.feedtheneed.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAbout(View view) {
        Intent intent = new Intent(this, AboutPage.class);
        //EditText editText = (EditText) findViewById(R.id.);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void goToReg(View view) {
        Intent intent = new Intent(this, RegisterPage.class);
        //EditText editText = (EditText) findViewById(R.id.);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void goToVol(View view) {
        Intent intent = new Intent(this, VolunteerPage.class);
        //EditText editText = (EditText) findViewById(R.id.);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void goToReq(View view) {
        Intent intent = new Intent(this, RequestPage.class);
        //EditText editText = (EditText) findViewById(R.id.);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}