package com.sdm.practica2app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;

import com.mycompany.myapp.CreditsActivity;
import com.mycompany.myapp.IntentsActivity;
import com.mycompany.myapp.ParametersActivity;

public class MainActivity extends Activity {

    Button buttonIntents;
    Button buttonParameter;
    Button buttonCredits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIntents = (Button) findViewById(R.id.buttonIntents);
        buttonParameter = (Button) findViewById(R.id.buttonParameter);
        buttonCredits = (Button) findViewById(R.id.buttonCredits);

        buttonIntents.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre_funcion(buttonIntents);
            }
        });

        buttonParameter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre_funcion(buttonParameter);

            }
        });

        buttonCredits.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre_funcion(buttonCredits);
            }
        });

    }

    public void nombre_funcion (View v){
        //String stringParameter = getResources().getString(R.string.stringParameter);
       // String stringParameter;
        int id = v.getId();
       if(id == R.id.buttonIntents) {
          Intent i = new Intent(this, IntentsActivity.class);
          //i.putExtra(stringParameter,  getResources().getString(R.string.stringParameter));
          i.putExtra("stringParameter",  getResources().getString(R.string.stringParameter));
          startActivity(i);


       }else if(id == R.id.buttonParameter){
           Intent i = new Intent(this, ParametersActivity.class);
           startActivity(i);

       }else if(id == R.id.buttonCredits){
           Intent i = new Intent(this, CreditsActivity.class);
           startActivity(i);

       }


    }

}
