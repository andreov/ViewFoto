package com.example.viewfoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void fotoNext(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        int a = (int)(Math.random()*100+1);
        textView.setText("http://mainFoto.ru/"+ a);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void fotoBack(View view) {
        finish();
    }
}