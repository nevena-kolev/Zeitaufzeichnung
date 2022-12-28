package com.example.zeitaufzeichnung;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.os.Bundle;
import android.view.MenuItem;

import org.jetbrains.annotations.NotNull;

/**
 * @author Nevena Kolev, 5BHIT
 * As a user I want...
 *      - to see a list of all my tasks,
 *      - to distinguish between finished (marked gray) and active tasks,
 *      - my tasks to be sorted by name,
 *      - to be able to hide the finished ones, but they should still be accessible for
 *        me if I need to make changes,
 *      - to have an overview of both a list and of the time spent on a task,
 *      - to switch between these two views in a few steps only,
 *      - to have a menu in which I can log out, go to my settings and delete tasks,
 *      - to tap on a task to edit it,
 *      - to get a popup where I can create a new task with useful information.
 */
public class ShowTaskList extends AppCompatActivity implements  NavigationBarView.OnItemSelectedListener {
    BottomNavigationView bottomNav;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottomNav);
        bottomNav.setSelectedItemId(R.id.myTasks);

    }
    TaskListFragment taskListFragment = new TaskListFragment();
    TimeOverviewFragment timeOverviewFragment = new TimeOverviewFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override public boolean onNavigationItemSelected(@NotNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.myTasks:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, taskListFragment).commit();
                return true;

            case R.id.timeOverview:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, timeOverviewFragment).commit();
                return true;

            case R.id.settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, settingsFragment).commit();
                return true;
        }
        return false;
    }
}
