package com.example.mdmuktadir.fragmentscommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two,container,false);
        textView = (TextView)view.findViewById(R.id.txt_name);
        textView.setVisibility(View.GONE);
        return view;

    }

    public void updateName(String name){
        textView.setText("Welcome to "+name);
        textView.setVisibility(View.VISIBLE);

    }
}
