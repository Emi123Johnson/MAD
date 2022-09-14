package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"This is inside onstart method",Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onStart() {

        super.onStart();
        Toast.makeText(getApplicationContext(),"This is inside onstart method",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {

        super.onStart();
        Toast.makeText(getApplicationContext(),"This is inside onrestart method",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), " onResume method", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "onpause method", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"inside onstop method",Toast.LENGTH_SHORT).show();
    }
    @Override

        protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"ondestroy method",Toast.LENGTH_SHORT).show();

    }
}
