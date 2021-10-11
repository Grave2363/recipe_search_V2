package com.example.recipe_search_v2.accounts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.recipe_search_v2.R;

public class SignIn extends Fragment {
    private EditText email;
    private EditText pass;
    private Button submit;
    private Button reg;

    public View onCreateView(LayoutInflater inflator, Bundle savedInstanceState, ViewGroup container) {
        super.onCreate(savedInstanceState);
        View root = inflator.inflate(R.layout.sign_in, container, false);
        // set vars
        email = root.findViewById(R.id.Email);
        pass = root.findViewById(R.id.Pass);
        submit = root.findViewById(R.id.submitSignIn);
        reg = root.findViewById(R.id.register);

        
        return root;

    }
}
