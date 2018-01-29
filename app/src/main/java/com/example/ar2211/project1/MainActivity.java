package com.example.ar2211.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.lang.String;
import java.lang.Object;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import java.io.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    TextView texter;
    Button btner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texter =(TextView) findViewById(R.id.editText4);
        btner=(Button)findViewById(R.id.button1);

        btner.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                texter.setText(Integer.valueOf(R.string._1));

            }
        });
    }



};


