package com.example.internshipmanagementsystem.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.internshipmanagementsystem.R;
import com.example.internshipmanagementsystem.student.ApplyForInternship;

public class AdminDashboard extends AppCompatActivity {

CardView crdViewStudents;
CardView crdViewSupervisors;
CardView crdStudentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_admin_dashboard);
        crdViewStudents = findViewById(R.id.viewStudents);
        crdViewSupervisors = findViewById(R.id.viewSupervisors);
        crdStudentView = findViewById(R.id.studentView);

        crdViewStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminDashboard.this, DisplayAllStudents.class));
            }
        });

        crdViewSupervisors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminDashboard.this, DisplayAllSupervisors.class));
            }
        });

        /*crdStudentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminDashboard.this, ApplyForInternship.class));
            }
        });*/
    }
}