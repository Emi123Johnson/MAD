package com.example.myapplication2;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.un);
        password=(EditText)findViewById(R.id.pd);
        b1=(Button)findViewById(R.id.reset);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                username.setText("");
                password.setText("");
            }
        });
        b2=(Button)findViewById(R.id.sub);
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Unsuccessfull", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
