package com.example.zeitaufzeichnung.fragments.mainfragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.example.zeitaufzeichnung.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        getActivity().setTitle("Settings");
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
