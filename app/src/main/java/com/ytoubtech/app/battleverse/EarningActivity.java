package com.ytoubtech.app.battleverse;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class EarningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earning);

        // 1. Bottom Navigation ko find karein
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);

        // 2. Earning icon ko blue (highlight) karein
        bottomNav.setSelectedItemId(R.id.nav_earning);

        // 3. Navigation Click Logic
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                overridePendingTransition(0, 0);
                finish(); // Purani activity band karne ke liye
                return true;
            } else if (id == R.id.nav_earning) {
                return true; // Isi page par hain toh kuch nahi karna
            } else if (id == R.id.nav_wallet) {
                startActivity(new Intent(getApplicationContext(), WalletActivity.class));
                overridePendingTransition(0, 0);
                finish();
                return true;
            } else if (id == R.id.nav_profile) {
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                overridePendingTransition(0, 0);
                finish();
                return true;
            }
            return false;
        });
    }
}