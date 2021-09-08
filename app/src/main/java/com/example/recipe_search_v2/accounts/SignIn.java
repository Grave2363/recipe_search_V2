package com.example.recipe_search_v2.accounts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.recipe_search_v2.R;

public class SignIn extends AppCompatActivity {
    private EditText email;
    private EditText pass;
    private Button submit;
    private Button reg;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);
        // set vars
        email = findViewById(R.id.Email);
        pass = findViewById(R.id.Pass);
        submit = findViewById(R.id.submit);
        reg = findViewById(R.id.register);

    }
}
