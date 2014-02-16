package com.mycompany.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.TextView;
import android.util.Log;

import com.sdm.practica2app.R;

public class ParametersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parameters);

      /*  TextView texto = (TextView) findViewById(R.id.textView);
        Bundle parametroRecibido = getIntent().getExtras();
        texto.setText(parametroRecibido.getString("stringParameter"));*/

        //CAMBIO PARA PROBAR GITHUB
try{
        TextView texto = (TextView) findViewById(R.id.textView);
        Intent intentRecibido = getIntent();
        String stringRecibida = intentRecibido.getStringExtra("stringParameter");

        texto.setText(stringRecibida);
    Log.v("VERBOSE", stringRecibida);

    }catch (Exception e){

    e.printStackTrace();
    }
    }
}
