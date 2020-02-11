package com.example.sisuperjatim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivityLogged extends AppCompatActivity {
SessionManager sessionManager;
private TextView name, email;
private Button logout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profile_logged);

        sessionManager = new SessionManager(this);
        sessionManager.checkLogin();

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        logout = findViewById(R.id.logout);


    }


}
