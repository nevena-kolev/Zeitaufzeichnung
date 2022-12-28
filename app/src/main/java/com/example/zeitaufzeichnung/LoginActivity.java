package com.example.zeitaufzeichnung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

/**
 * @author Nevena Kolev
 * sources: https://www.geeksforgeeks.org/how-to-implement-dark-night-mode-in-android-app/
 * https://stackoverflow.com/questions/7200108/android-gettext-from-edittext-field
 * https://www.geeksforgeeks.org/bottom-navigation-bar-in-android/
 */
public class MainActivity extends AppCompatActivity {
    private final String EMAIL = "admin@tempico.com";
    private final String PASSWORD = "admin";

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Switch switchTheme = findViewById(R.id.switchTheme);
        switchTheme.setOnClickListener(
                new View.OnClickListener() {
                    @Override public void onClick(View view) {
                        AppCompatDelegate.setDefaultNightMode((switchTheme.isChecked() ?
                                AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO));
                    }
                }
        );
    }

    public void login(View view) {
        String email = ((TextView) findViewById(R.id.txt_email)).getText().toString();
        String password = ((TextView) findViewById(R.id.txt_password)).getText().toString();

        if (email.equals(EMAIL) && password.equals(PASSWORD)) {
            Intent ShowTaskList = new Intent(this, ShowTaskList.class);
            startActivity(ShowTaskList);
        }
    }
}