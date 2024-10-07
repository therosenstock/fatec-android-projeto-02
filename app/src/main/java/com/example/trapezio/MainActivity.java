package com.example.trapezio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.trapezio.R.id;

public class MainActivity extends AppCompatActivity {
    /*
     *@author:<Fabiola / 111048231311>
     */

    TextView labelResultado;
    EditText txtBaseMaior;
    EditText txtBaseMenor;
    EditText txtAltura;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBaseMaior = findViewById(R.id.txtBaseMaior);
        txtBaseMenor = findViewById(R.id.txtBaseMenor);
        btnCalcular = findViewById(R.id.btnCalcular);
        labelResultado = findViewById(R.id.resultado);
        txtAltura = findViewById(R.id.txtValorAltura);

        btnCalcular.setOnClickListener(op -> {
            calcular();
        });
    }

    private void calcular(){
        float maior = Float.parseFloat(txtBaseMaior.getText().toString());
        float menor = Float.parseFloat(txtBaseMenor.getText().toString());
        float altura = Float.parseFloat((txtAltura.getText().toString()));

        float resultado = (maior + menor) * altura / 2;
        labelResultado.setText("Valor da área: "+ resultado + " cm.");



    }
}