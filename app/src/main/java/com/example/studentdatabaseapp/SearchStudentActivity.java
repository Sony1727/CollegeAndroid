package com.example.studentdatabaseapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchStudentActivity extends AppCompatActivity {
    AppCompatButton b1;
    EditText e1,e2,e3;
    String getName,getRoll,getcollege,getbacktomenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_student);
        e1=(EditText)findViewById(R.id.Name);
        e2=(EditText)findViewById(R.id.Rollno);
        e3=(EditText)findViewById(R.id.College);
        b1=(AppCompatButton)findViewById(R.id.Backtomenu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = e1.getText().toString();
                getRoll = e2.getText().toString();
                getcollege = e3.getText().toString();

                Toast.makeText(getApplicationContext(), getRoll, Toast.LENGTH_SHORT).show();

            });

            Intent i = new Intent(getApplicationContext(), SearchStudentActivity.class);

            startActivity(i);
        }

});