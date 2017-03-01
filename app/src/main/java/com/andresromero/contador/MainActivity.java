package com.andresromero.contador;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends Activity {


    int cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cont = 0;
        mostrarRes();
    }

    public void  sumaCont(View vista){

        cont++;
        mostrarRes();

    }

    public void restaCont(View vista) {

        cont--;
        if (cont < 0) {
            CheckBox negativo = (CheckBox) findViewById(R.id.conteoN);
            if (!negativo.isChecked()) {
                cont = 0;
            }
        }
            mostrarRes();

    }
    public void resetCont(View vista){
        cont = 0;
        mostrarRes();
    }



    public void mostrarRes(){
        TextView resultado = (TextView)findViewById(R.id.contadorPulsaciones);
        resultado.setText("contador: " + cont);
    }
}
