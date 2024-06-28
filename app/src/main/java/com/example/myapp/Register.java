package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.pname);
        ed3=(EditText) findViewById(R.id.num);
        ed4=(EditText) findViewById(R.id.pass);
        ed4=(EditText) findViewById(R.id.conpass);
        bt1=(AppCompatButton) findViewById(R.id.reg);
        bt2=(AppCompatButton) findViewById(R.id.content);
        bt3=(AppCompatButton) findViewById(R.id.goback);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getName=ed1.getText().toString();
                String getPname=ed2.getText().toString();
                String getNum=ed3.getText().toString();
                String getPass=ed4.getText().toString();
                String getConfirm=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),"Registerd"+ getName,Toast.LENGTH_LONG).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(), Content.class);
                startActivity(j);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}