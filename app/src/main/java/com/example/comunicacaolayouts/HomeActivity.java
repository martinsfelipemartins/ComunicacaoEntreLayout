package com.example.comunicacaolayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textView = findViewById(R.id.textView);

        if (getIntent() != null && getIntent().getExtras() != null) {

            Bundle bundle = getIntent().getExtras();

            if (bundle.getString("NAME") != null) {
                textView.setText("Olá, " + bundle.getString("NAME")+" seja bem vindo!");
            }

        }
    }
}
