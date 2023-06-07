package com.sangamprashant.truevpn;
import com.bumptech.glide.Glide;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    LottieAnimationView settings, menu;
    NavigationView navView;
    DrawerLayout drawerLayout;
    MaterialCardView serversList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        settings = findViewById(R.id.ButtonSetting);
        serversList = findViewById(R.id.moreServer);
        navView = findViewById(R.id.Nav_View);
        drawerLayout = findViewById(R.id.drawer_view);
        menu = findViewById(R.id.ButtonMenu);

        drawerLayout.bringToFront();
        navView.setCheckedItem(R.id.AllServers);
        navView.setNavigationItemSelectedListener(this);

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SetttingActivity.class));
            }
        });

        serversList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServerListActivity.class));
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle menu item selections here
        if (item.getItemId() == R.id.AllServers) {
            openAllServerPage();
        } else if (item.getItemId() == R.id.menuSetting) {
            openSettingActivity();
        }
        else if (item.getItemId() == R.id.menuAbout) {
            openAbout();
        }
        else if (item.getItemId() == R.id.menuContactus) {
            openContactUs();
        }

        // Close the navigation drawer after a selection is made
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void openAllServerPage() {
        // Code to open Page goes here
        startActivity(new Intent(MainActivity.this, ServerListActivity.class));
    }

    private void openSettingActivity() {
        Intent intent = new Intent(MainActivity.this, SetttingActivity.class);
        startActivity(intent);
    }
    private void openAbout() {
        Intent intent = new Intent(MainActivity.this, AboutContentActivity.class);
        startActivity(intent);
    }
    private void openContactUs() {
        Intent intent = new Intent(MainActivity.this, ContectUsContentActivity.class);
        startActivity(intent);
    }
}
