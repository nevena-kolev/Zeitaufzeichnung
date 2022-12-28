package com.example.zeitaufzeichnung.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.example.zeitaufzeichnung.R;

public class TimeOverviewFragment extends Fragment {
    public TimeOverviewFragment() {

    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Time Overview");
        return inflater.inflate(R.layout.fragment_time_overview, container, false);
    }
}
