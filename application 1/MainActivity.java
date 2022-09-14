package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button b1,b2;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        b1=(Button) findViewById(R.id.reset);
        b2=(Button) findViewById(R.id.submit);
        t3=(TextView)findViewById(R.id.t3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username.setText("");
                password.setText("");

            }


});
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String us = username.getText().toString();
                String ps = password.getText().toString();
                t3.setText("Username is:" + username.getText() + "\nPassword is:" + password.getText());
            }
        });

}}