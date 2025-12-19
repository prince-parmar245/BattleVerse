package com.ytoubtech.app.battleverse;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // PUBG Card Click Logic
        CardView pubgCard = findViewById(R.id.pubgCardView);
        pubgCard.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MatchesActivity.class);
            startActivity(intent);
        });

        // Bottom Navigation Logic
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setSelectedItemId(R.id.nav_home);
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_earning) {
                startActivity(new Intent(this, EarningActivity.class));
                return true;
            } else if (id == R.id.nav_wallet) {
                startActivity(new Intent(this, WalletActivity.class));
                return true;
            } else if (id == R.id.nav_profile) {
                startActivity(new Intent(this, ProfileActivity.class));
                return true;
            }
            return false;
        });
    }
}