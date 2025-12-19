package com.example.yourappname;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ytoubtech.app.battleverse.R;

public class SignupActivity extends AppCompatActivity {

    EditText Username, etEmail, etPassword;
    Button btnSignup, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup); // XML file name


        // Initialize Views
        Username = findViewById(R.id.Username);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);
        btnLogin = findViewById(R.id.btnLogin);

        // SIGN UP BUTTON CLICK
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = Username.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Validation
                if (TextUtils.isEmpty(username)) {
                    Username.setError("Enter Username");
                    Username.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(email)) {
                    etEmail.setError("Enter Email");
                    etEmail.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    etPassword.setError("Enter Password");
                    etPassword.requestFocus();
                    return;
                }

                // Success Message
                Toast.makeText(SignupActivity.this,
                        "Signup Successful",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // LOGIN BUTTON CLICK
        btnLogin.setOnClickListener(new View.OnClickListener() {
            class login {
            }

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SignupActivity.this, login.class);
                startActivity(intent);
            }
        });
    }
}
