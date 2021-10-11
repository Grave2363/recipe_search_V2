package com.example.recipe_search_v2.accounts;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.recipe_search_v2.R;

public class Register extends Fragment {
    private EditText email;
    private EditText pass;
    private EditText confPass;
    private Button submit;
    private Button signIn;

     public View onCreateView(LayoutInflater inflator,Bundle savedInstanceState, ViewGroup container) {
        super.onCreate(savedInstanceState);
        View root = inflator.inflate(R.layout.register, container, false);
        // set vars
        email = root.findViewById(R.id.Email);
        pass = root.findViewById(R.id.Pass);
        confPass = root.findViewById(R.id.confirmPass);
        submit = root.findViewById(R.id.SubmitReg);
        signIn = root.findViewById(R.id.SignIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), SignIn.class);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo send user info to register usr
            }
        });
        return root;
    }
}

