package com.example.readbook_fe.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.readbook_fe.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileUser#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileUser extends Fragment {


    public ProfileUser() {
        // Required empty public constructor
    }

    public static ProfileUser newInstance() {
        ProfileUser fragment = new ProfileUser();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_user, container, false);
    }
}