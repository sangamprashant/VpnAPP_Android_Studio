package com.sangamprashant.truevpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class TermsContentActivity extends AppCompatActivity {
    View goToSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_content);
        goToSetting = findViewById(R.id.goToSetting);

        // Find the ImageView in your activity or fragment
        ImageView gifImageView = findViewById(R.id.gifImageView);

        // Load the GIF using Glide
        Glide.with(this)
                .asGif()
                .load(R.drawable.terms)
                .into(gifImageView);

        goToSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TermsContentActivity.this, SetttingActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(TermsContentActivity.this, SetttingActivity.class));
        finish();
    }
}
