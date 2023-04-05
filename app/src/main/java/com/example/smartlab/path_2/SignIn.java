package com.example.smartlab.path_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.smartlab.R;
import com.example.smartlab.path_2.CodOfEmail;

public class SignIn extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        button = findViewById(R.id.button);

    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, CodOfEmail.class);
        startActivity(intent);
    }

}