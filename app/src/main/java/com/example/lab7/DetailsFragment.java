package com.example.lab7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        // Get the TextViews
        TextView nameTextView = view.findViewById(R.id.name);
        TextView heightTextView = view.findViewById(R.id.height);
        TextView massTextView = view.findViewById(R.id.mass);

        // Get the arguments passed to this fragment
        Bundle bundle = getArguments();
        if (bundle != null) {
            nameTextView.setText("Name: " + bundle.getString("name"));
            heightTextView.setText("Height: " + bundle.getString("height"));
            massTextView.setText("Mass: " + bundle.getString("mass"));
        }

        return view;
    }
}