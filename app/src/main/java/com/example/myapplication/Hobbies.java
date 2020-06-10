package com.example.myapplication;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Hobbies extends AppCompatActivity {

    TextView textView;
    TextView textView2, textView3, textPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);

        textView = findViewById(R.id.textView2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView2 = findViewById(R.id.textView3);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        textView3 = findViewById(R.id.textView4);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        textPlay = findViewById(R.id.play);
        textPlay.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
