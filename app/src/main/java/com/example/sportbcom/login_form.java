package com.example.sportbcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_form extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);


    }

    public void singup(View view) {
        startActivity(new Intent(getApplicationContext(),Singup_form.class) );
    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(),Main2Activity.class) );
    }

}
 