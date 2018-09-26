package com.example.mdmuktadir.fragmentscommunication;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentOne extends Fragment {
    EditText editText;
    Button button;
    OnNameSetListener onNameSetListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container,false);
        editText = (EditText)view.findViewById(R.id.et_name);
        button = (Button)view.findViewById(R.id.btn_submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                onNameSetListener.setName(name);

            }
        });

        return view;
    }

    public interface OnNameSetListener{
        public void setName(String name);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            onNameSetListener = (OnNameSetListener) activity;
        }catch (Exception e)
        {

        }

    }
}
