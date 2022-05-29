package com.prateek.test.moviedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DescActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        Result obj = (Result) getIntent().getSerializableExtra("Object");

        TextView txt = findViewById(R.id.describe);
        txt.setText(obj.getOverview());
    }
}