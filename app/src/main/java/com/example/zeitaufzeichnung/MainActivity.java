package com.example.zeitaufzeichnung;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zeitaufzeichnung.fragments.mainfragments.SettingsFragment;
import com.example.zeitaufzeichnung.fragments.mainfragments.TaskListFragment;
import com.example.zeitaufzeichnung.fragments.mainfragments.TimeOverviewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;

    TaskListFragment taskListFragment = new TaskListFragment();
    TimeOverviewFragment timeOverviewFragment = new TimeOverviewFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_appbar, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(new Intent(this, LoginActivity.class));
        return super.onOptionsItemSelected(item);
    }

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottomNav);
        bottomNav.setSelectedItemId(R.id.myTasks);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, taskListFragment).commit();

        bottomNav.setOnItemSelectedListener( item -> {
            switch (item.getItemId()) {
                case R.id.myTasks:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, taskListFragment).commit();
                    return true;
                case R.id.timeOverview:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, timeOverviewFragment).commit();
                    return true;
                case R.id.settings:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, settingsFragment).commit();
                    return true;
            }
            return false;
        });
    }



}
