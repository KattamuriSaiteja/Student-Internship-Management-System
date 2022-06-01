package com.example.internshipmanagementsystem.faculty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.internshipmanagementsystem.MainActivity;
import com.example.internshipmanagementsystem.R;
import com.example.internshipmanagementsystem.student.ConfirmationActivity;

public class FacultyDashboard extends AppCompatActivity {

    TextView t10,t11,t12,t13,t14,t15,t16,t17,t18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacultyDashboard.this, IndividualListActivity.class));
            }
        });

        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacultyDashboard.this, IndividualListActivity.class));
            }
        });

        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacultyDashboard.this, IndividualListActivity.class));
            }
        });

        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacultyDashboard.this, IndividualListActivity.class));
            }
        });

        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacultyDashboard.this, IndividualListActivity.class));
            }
        });

        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacultyDashboard.this, IndividualListActivity.class));
            }
        });

        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacultyDashboard.this, IndividualListActivity.class));
            }
        });

        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacultyDashboard.this, IndividualListActivity.class));
            }
        });

        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacultyDashboard.this, IndividualListActivity.class));
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.student_dashboard2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
                startActivity(new Intent(FacultyDashboard.this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}