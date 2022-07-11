package org.esissalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int valeur = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("esis", "onCreate");
        Button btn = findViewById(R.id.button);
        TextView tv = findViewById(R.id.textView);
        btn.setOnClickListener(v -> {
            valeur++;
            tv.setText(String.valueOf(valeur));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("esis", "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("esis", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("esis", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("esis", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("esis", "onDestroy");
    }
}

