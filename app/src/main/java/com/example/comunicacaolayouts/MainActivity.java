package com.example.comunicacaolayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nomeText;
    EditText sobrenomeText;
    EditText idadeText;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        nomeText = findViewById(R.id.nomeText);
        sobrenomeText = findViewById(R.id.sobrenomeText);
        idadeText = findViewById(R.id.idadeText);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        String nome = nomeText.getText().toString();
        String sobrenome = nomeText.getText().toString();
        int idade = Integer.parseInt(nomeText.getText().toString());


    }
}