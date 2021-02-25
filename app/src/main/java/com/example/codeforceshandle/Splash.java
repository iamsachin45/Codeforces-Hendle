package com.example.codeforceshandle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Space;

public class Splash extends AppCompatActivity
{
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
      //  editText = findViewById(R.id.e1);
    }
    public void enter(View view)
    {
      //  String s = editText.getText().toString();
     //   Helper helper = new Helper();
      //  helper.setHaldel(s);
        Intent intent = new Intent(Splash.this,MainActivity2.class);
        startActivity(intent);
    }
}