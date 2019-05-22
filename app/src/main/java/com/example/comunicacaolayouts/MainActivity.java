package com.example.comunicacaolayouts;

import android.content.Intent;
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
        initViews();

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validarAntesDeIrHome();


            }
        });
    }

    public void validarAntesDeIrHome() {
        String nome = nomeText.getText().toString();
        String sobrenome = nomeText.getText().toString();
        int idade = Integer.parseInt(idadeText.getText().toString());

        if (nome.isEmpty()) {
            nomeText.setError("O nome não pode ser vazio!");


        }
        if (sobrenome.isEmpty()) {
            nomeText.setError("Insira seu sobrenome!");


        }
        if (idade > 0) {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            Bundle pacote = new Bundle();
            pacote.putString("NAME", "Martins");
            intent.putExtras(pacote);
            startActivity(intent);
        } else {
            System.out.println("Email ou senha invalidos");
        }


    }


    private void initViews() {
        nomeText = findViewById(R.id.nomeText);
        sobrenomeText = findViewById(R.id.sobrenomeText);
        idadeText = findViewById(R.id.idadeText);
        btnEnviar = findViewById(R.id.btnEnviar);
    }

}
