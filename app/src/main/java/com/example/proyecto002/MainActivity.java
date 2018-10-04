package com.example.proyecto002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);

    }

    //Ahora creo el metodo que sumara los numeros al pulsar el boton
    public void suma (View view){
        //guardo en una variable tipo texto los valores del campo
        // et1 y et2
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        //comvierto estas variables string a tipo int
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);

        //genero una variable nueva tipo int y guardo el resultado de la suma
        int suma = nro1 + nro2;
        //comvierto el resultado a una variable tipo string
        String resultado = String.valueOf(suma);

        //envio la variable tipo string al cuadro de texto tv1.
        tv1.setText(resultado);
    }
}
