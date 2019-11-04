package com.example.intent04092019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","Main1 : onCreate");

        btnIntent = findViewById(R.id.buttonIntent);

        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main1 : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main1 : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main1 : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main1 : onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main1 : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main1 : onDestroy");
    }
}
