package com.lab5.dictionaryApp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.lab5.dictionaryApp.R;
import com.lab5.dictionaryApp.WordMeaningActivity;

public class FragmentAntonyms extends Fragment {


    public FragmentAntonyms() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_definition, container, false);//Inflate Layout

        Context context = getActivity();

        TextView text = (TextView) view.findViewById(R.id.textview_d);//Find textView Id

        String example = ((WordMeaningActivity) context).antonyms;
        text.setText(example);

        if (example == null) {
            text.setText("No Example found");
        }


        return view;


    }
}
