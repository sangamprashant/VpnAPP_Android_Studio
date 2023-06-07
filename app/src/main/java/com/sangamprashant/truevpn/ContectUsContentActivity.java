package com.sangamprashant.truevpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContectUsContentActivity extends AppCompatActivity {
    View goToSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contect_us_content);
        goToSetting = findViewById(R.id.gotoMainActivity2);
        goToSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContectUsContentActivity.this, MainActivity.class));
                finish();
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ContectUsContentActivity.this, MainActivity.class));
        finish();
    }
}