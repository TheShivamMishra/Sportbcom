package com.example.sportbcom;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("");
       handler = new Handler();
       handler.postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, login_form.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
