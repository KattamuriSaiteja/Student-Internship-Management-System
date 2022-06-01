package com.example.internshipmanagementsystem.faculty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.internshipmanagementsystem.R;

public class FacultyOverallList extends AppCompatActivity {

    TextView t10,t11,t12,t13,t14,t15,t16,t17,t18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_faculty_overall_list);

        t10 = findViewById(R.id.textView7);
        t11 = findViewById(R.id.textView11);
        t12 = findViewById(R.id.textView12);
        t13 = findViewById(R.id.textView13);
        t14 = findViewById(R.id.textView14);
        t15 = findViewById(R.id.textView15);
        t16 = findViewById(R.id.textView16);
        t17 = findViewById(R.id.textView17);
        t18 = findViewById(R.id.textView18);


    }
}