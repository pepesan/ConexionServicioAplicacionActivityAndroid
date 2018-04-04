package com.cursosdedesarrollo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Integer dato;
    public Aplicacion app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Toast.makeText(this,"MainActivity:onCreate",Toast.LENGTH_SHORT).show();
        app=(Aplicacion) getApplication();
        dato=app.getDato();
        Toast.makeText(this,"MainActivity:onCreate:Application:dato:"+dato,Toast.LENGTH_SHORT).show();
        app.setDato(13);
        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    @Override
    protected void onResume() {
        super.onResume();
        //TODO pendiente de colocar en una asynctask
        app.cargaDatos();
        ProgressBar bar=findViewById(R.id.progressBar);
        bar.setVisibility(View.GONE);
        TextView texto=(TextView)findViewById(R.id.texto);
        texto.setVisibility(View.VISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_salta) {
            //Toast.makeText(this,"Quiero saltar",Toast.LENGTH_LONG).show();
            Intent i = new Intent(this,Main2Activity.class);
            i.putExtra("numero",12);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_cierra) {
            //Toast.makeText(this,"Quiero saltar",Toast.LENGTH_LONG).show();
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
