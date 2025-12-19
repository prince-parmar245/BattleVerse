package com.ytoubtech.app.battleverse;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WalletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ✅ Tumhari layout file wallet.xml hai
        setContentView(R.layout.wallet);

        BottomNavigationView bottomNav =
                findViewById(R.id.bottomNavigation);

        // Safety check
        if (bottomNav == null) return;

        // Wallet tab selected
        bottomNav.setSelectedItemId(R.id.nav_wallet);

        bottomNav.setOnItemSelectedListener(item -> {

            int id = item.getItemId();

            if (id == R.id.nav_home) {
                startActivity(new Intent(WalletActivity.this, MainActivity.class));
                finish();
                return true;
            }

            if (id == R.id.nav_earning) {
                startActivity(new Intent(WalletActivity.this, EarningActivity.class));
                finish();
                return true;
            }

            if (id == R.id.nav_wallet) {
                return true; // already on wallet
            }

            if (id == R.id.nav_profile) {
                startActivity(new Intent(WalletActivity.this, ProfileActivity.class));
                finish();
                return true;
            }

            return false;
        });
    }
}
