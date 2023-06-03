package com.sangamprashant.truevpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Next_Activity extends AppCompatActivity {
    Button NextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        NextButton=findViewById(R.id.buttonGetStarted);
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Next_Activity.this,MainActivity.class));
                finish();
            }
        });

    }
}