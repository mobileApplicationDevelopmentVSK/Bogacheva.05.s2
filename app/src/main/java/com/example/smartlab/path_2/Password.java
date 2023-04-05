package com.example.smartlab.path_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.smartlab.R;
import com.example.smartlab.path_2.CardOfPacient;

public class Password extends AppCompatActivity implements View.OnClickListener {
    TextView skip;
    EditText ellipse_58, ellipse_59, ellipse_60, ellipse_61;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        skip = findViewById(R.id.skip);
        ellipse_58 = findViewById(R.id.ellipse_58);
        ellipse_59 = findViewById(R.id.ellipse_59);
        ellipse_60 = findViewById(R.id.ellipse_60);
        ellipse_61 = findViewById(R.id.ellipse_61);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, CardOfPacient.class);
        startActivity(intent);
    }

}