package com.narvasoft.repapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity  {
    Button btnVolver, btnSumar, btnRestar, btnMulti, btnDivi;
    TextView txtN1, txtN2, txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialize your views here
        Button btnVolver = findViewById(R.id.btnvolver);
        Button btnSumar = findViewById(R.id.btnsumar);
        Button btnRestar = findViewById(R.id.btnrestar);
        Button btnMulti = findViewById(R.id.btnmulti);
        Button btnDivi = findViewById(R.id.btndivi);

        TextView txtN1 = findViewById(R.id.txtinput1);
        TextView txtN2 = findViewById(R.id.txtinput2);
        TextView txtResultado = findViewById(R.id.txtresultado);

        // Set click listener for the "Volver" button
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for the "Sumar" button
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(txtN1.getText().toString());
                int n2 = Integer.parseInt(txtN2.getText().toString());
                int suma = n1 + n2;
                txtResultado.setText("La suma es: " + suma);
            }
        });

        // Set click listener for the "restar" button
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(txtN1.getText().toString());
                int n2 = Integer.parseInt(txtN2.getText().toString());
                int resta = n1 - n2;
                txtResultado.setText("La resta es: " + resta);
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(txtN1.getText().toString());
                int n2 = Integer.parseInt(txtN2.getText().toString());
                int multi= n1 * n2;
                txtResultado.setText("La multiplicación es: " + multi);
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(txtN1.getText().toString());
                int n2 = Integer.parseInt(txtN2.getText().toString());
                if (n2 !=0) {
                    double divi = n1 / n2;
                    txtResultado.setText("La división es: " + divi);
                }else
                txtResultado.setText("División por cero \n Cambie el segundo valor");
            }
        });

    }

}