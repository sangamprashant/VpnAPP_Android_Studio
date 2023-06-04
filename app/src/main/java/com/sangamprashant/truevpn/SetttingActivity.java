package com.sangamprashant.truevpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SetttingActivity extends AppCompatActivity {
    View GotoMainActivity ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settting);

        GotoMainActivity= findViewById(R.id.gotoMainActivity);

        GotoMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SetttingActivity.this,MainActivity.class));

            }
        });

    }


}