package com.example.readbook_fe.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.readbook_fe.R;


public class ReadBook extends Fragment {


    public static ReadBook newInstance(String idBook) {
        ReadBook fragment = new ReadBook();
        Bundle bundle = new Bundle();
        bundle.putString("idBook", idBook);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_read_book, container, false);
    }
}