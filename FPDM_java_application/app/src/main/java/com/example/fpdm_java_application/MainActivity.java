package com.example.fpdm_java_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private TextView texto2;
    private EditText texto1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log.i("onCreate", "Entrou no método onCreate.");
        setContentView(R.layout.activity_main);
        texto1 = (EditText) findViewById(R.id.textTexto1);
        texto2 = (TextView) findViewById(R.id.textTexto2);
    }

    @Override
    protected void onStart() {
        log.i("onStart", "Entrou no método onStart.");
        super.onStart();
    }
}