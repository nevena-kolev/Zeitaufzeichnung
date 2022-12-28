package com.example.zeitaufzeichnung.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.example.zeitaufzeichnung.R;

public class SettingsFragment extends Fragment {
    public SettingsFragment() {

    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Settings");
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }
}
