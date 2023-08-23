package com.narvasoft.repapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btnIr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIr = (Button) findViewById(R.id.btnir);//casteamos el boton de xml a java
        btnIr.setOnClickListener(this);//asociamos el evento click al boton
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);//creamos el intent para ir a la otra actividad
        startActivity(intent);//iniciamos la actividad
    }
}
