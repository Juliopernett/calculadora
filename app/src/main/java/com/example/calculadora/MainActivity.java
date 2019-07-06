package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultado;
    EditText num1, num2;
    double n1,n2, suma;
    String opciones[];
    Spinner combo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //captura de los objetos utilizados
        num1 = findViewById(R.id.txtNumeroUno);
        num2 = findViewById(R.id.txtNumeroDos);
        resultado = findViewById(R.id.txtResultado);
        combo = findViewById((R.id.cmbOperacion));

        //traemos las opciones de un array de String
        opciones = getResources().getStringArray(R.array.operaciones);
        //sobre que elemento lo vas a mostrar, de que forma lo vas a mostrar, y lo que vas a mostrar
        //creamos el adapter indicando, donde se va a colocar como va  visualizar y que se va a mostrar
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, opciones);

        // pasamos el adapter al combo
        combo.setAdapter(adapter);


    }

    public void calcular(View v){
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        suma = n1 + n2;
        resultado.setText(""+suma);

    }

}
