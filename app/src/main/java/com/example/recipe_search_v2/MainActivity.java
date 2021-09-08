package com.example.recipe_search_v2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.recipe_search_v2.accounts.SignIn;
import com.example.recipe_search_v2.searchClasses.Search;

public class MainActivity extends AppCompatActivity {

    private Button Search;
    private Button SignIn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);
        // set vars
        Search = (Button) findViewById(R.id.SearchBtn);
        SignIn = (Button) findViewById(R.id.SignInBtn);
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Search.class);
                startActivity(in);
            }
        });
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, SignIn.class);
                startActivity(in);
            }
        });

    }
}