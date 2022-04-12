package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    public int searchBtn;
    public Button insertBtn;
    public TextView welcome;
    public TextInputEditText searchInput;
    public Button searchAction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frame=(FrameLayout)findViewById(R.id.frameLayout);
        searchBtn =R.id.search;

    }
}