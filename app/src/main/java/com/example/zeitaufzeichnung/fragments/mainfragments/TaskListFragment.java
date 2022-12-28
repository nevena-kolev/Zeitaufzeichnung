package com.example.zeitaufzeichnung.fragments.mainfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.zeitaufzeichnung.CardModel;
import com.example.zeitaufzeichnung.CardsAdapter;
import com.example.zeitaufzeichnung.R;

public class TaskListFragment extends Fragment {

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("My Tasks");

        SettingsFragment settingsFragment = new SettingsFragment();

        View view = inflater.inflate(R.layout.fragment_task_list, container, false);

        ListView lvCards = view.findViewById(R.id.lV);
        CardsAdapter adapter = new CardsAdapter(this.getContext());

        lvCards.setAdapter(adapter);
        adapter.addAll(new CardModel("Login page mockup", "May 23, 2015", "Best of Luck"),
                new CardModel("Database connection setup", "June 22, 2015", "Sample Text"),
                new CardModel("Menu mockup", "June 30, 2015", "Lorem ipsum"));

        return view;
    }
}
