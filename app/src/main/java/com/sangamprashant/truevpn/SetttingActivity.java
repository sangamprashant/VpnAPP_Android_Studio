package com.sangamprashant.truevpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class SetttingActivity extends AppCompatActivity {
    View GotoMainActivity ;
    RelativeLayout ToTermsPageStatic,ToPrivacyPolicyPageStatic, GoToFeedbackStatic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settting);

        GotoMainActivity= findViewById(R.id.gotoMainActivity);
        ToTermsPageStatic=findViewById(R.id.ToTermsPage);
        ToPrivacyPolicyPageStatic=findViewById(R.id.ToPrivacyPolicyPage);
        GoToFeedbackStatic =findViewById(R.id.goToFeedback);
        GotoMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SetttingActivity.this,MainActivity.class));

            }
        });
        ToTermsPageStatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SetttingActivity.this,TermsContentActivity.class));

            }
        });
        ToPrivacyPolicyPageStatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SetttingActivity.this,PrivacyContentActivity.class));

            }
        });
        GoToFeedbackStatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SetttingActivity.this, FeedBackActivity.class));
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(SetttingActivity.this, MainActivity.class));
    }

}