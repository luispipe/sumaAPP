package com.example.sumarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numero= findViewById(R.id.editTextTextValue);
        TextView resultado= findViewById(R.id.textViewSuma);
        Button sumar= findViewById(R.id.buttonSuma);
        Button resta= findViewById(R.id.buttonRestar);

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //isEmpty es un metodo de java que valida si un elemento esta vacio
                if(numero.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Por favor ingrese un valor",Toast.LENGTH_LONG).show();
                }else{
                    if (resultado.getText().toString().isEmpty()){
                        resultado.setText("-"+numero.getText().toString());
                        numero.setText("");
                    }else{
                        //En java los valores númericos se definen con int
                        //Integer.parseInt es una funcionalidad a la que le entra
                        //un texto y lo convierte en número
                        int result= Integer.parseInt(resultado.getText().toString());
                        int restar = Integer.parseInt(numero.getText().toString());
                        int total= result-restar;
                        //para convertir cualquier elemento es texto se usa +""
                        // o usar String.valueOf(valorAconvertir)
                        resultado.setText(String.valueOf(total));
                        numero.setText("");
                    }
                }
            }
        });

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //isEmpty es un metodo de java que valida si un elemento esta vacio
                if(numero.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                "Por favor ingrese un valor",Toast.LENGTH_LONG).show();
                }else{
                    if (resultado.getText().toString().isEmpty()){
                        resultado.setText(numero.getText().toString());
                        numero.setText("");
                    }else{
                        //En java los valores númericos se definen con int
                        //Integer.parseInt es una funcionalidad a la que le entra
                        //un texto y lo convierte en número
                        int sumar= Integer.parseInt(resultado.getText().toString());
                        int result= Integer.parseInt(numero.getText().toString());
                        int total= sumar+result;
                        //para convertir cualquier elemento es texto se usa +""
                        // o usar String.valueOf(valorAconvertir)
                        resultado.setText(String.valueOf(total));
                        numero.setText("");
                    }
                }
            }
        });



    }
}