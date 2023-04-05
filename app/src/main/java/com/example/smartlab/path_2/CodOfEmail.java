package com.example.smartlab.path_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.smartlab.R;

public class CodOfEmail extends AppCompatActivity implements View.OnClickListener {
    EditText etCode, etCode2, etCode3, etCode4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cod_of_email);
        etCode = findViewById(R.id.etcode);
        etCode2 = findViewById(R.id.etcode2);
        etCode3 = findViewById(R.id.etcode3);
        etCode4 = findViewById(R.id.etcode4);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
}