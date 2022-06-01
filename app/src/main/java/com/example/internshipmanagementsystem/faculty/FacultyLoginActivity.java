package com.example.internshipmanagementsystem.faculty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.internshipmanagementsystem.R;
import com.example.internshipmanagementsystem.admin.AdminDashboard;
import com.example.internshipmanagementsystem.admin.AdminLoginActivity;

public class FacultyLoginActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button btnSignIn;
    TextView txtFacultyForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_faculty_login);
        email = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnSignIn = findViewById(R.id.login);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailUsername = email.getText().toString();
                String passwordText = password.getText().toString();

                if (emailUsername.equals("S12345@nwmissouri.edu") && passwordText.equals("northwest")) {
                    startActivity(new Intent(FacultyLoginActivity.this, FacultyDashboard.class));
                }else{
                    Toast.makeText(getApplicationContext(), "Please enter valid credentials", Toast.LENGTH_LONG).show();
                }
            }
        });

        txtFacultyForgotPassword = findViewById(R.id.txtFacultyPassword);
        txtFacultyForgotPassword.setMovementMethod(LinkMovementMethod.getInstance());
    }
}