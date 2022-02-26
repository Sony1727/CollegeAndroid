package com.example.studentdatabaseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getName,getRollno,getAdmno,getCollege;
    DatabaseHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        dbhelper=new DatabaseHelper( this);
        dbhelper.getWritableDatabase();

        ed1=(EditText)findViewById(R.id.Name);
        ed2=(EditText)findViewById(R.id.Rollno);
        ed3=(EditText)findViewById(R.id.Admno);
        ed4=(EditText)findViewById(R.id.College);
        b1=(AppCompatButton)findViewById(R.id.Submit);
        b2=(AppCompatButton)findViewById(R.id.Backtomenu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = ed1.getText().toString();
                getRollno = ed2.getText().toString();
                getAdmno = ed3.getText().toString();
                getCollege = ed4.getText().toString();
                boolean result=dbhelper.insertdata(getName,getRollno,getAdmno,getCollege);
                if(result==true)
                {
                    ed1.setText("");
                    ed2.setText("");
                    ed3.setText("");
                    ed4.setText("");
                    Toast.makeText(getApplicationContext(), "SUCCESSFULLY INSERTED", Toast.LENGTH_SHORT).show();
            }
            else {
                    Toast.makeText(getApplicationContext(), "Data failed to insert", Toast.LENGTH_SHORT).show();

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        }
    }




