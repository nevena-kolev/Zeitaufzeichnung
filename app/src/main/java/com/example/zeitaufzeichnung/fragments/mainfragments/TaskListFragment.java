package com.example.zeitaufzeichnung.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.example.zeitaufzeichnung.R;

public class TaskListFragment extends Fragment {
    public TaskListFragment() {

    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("My Tasks");
        return inflater.inflate(R.layout.fragment_task_list, container, false);
    }
}
