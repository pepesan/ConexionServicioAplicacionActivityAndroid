package com.cursosdedesarrollo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    public Aplicacion app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int i=getIntent().getExtras().getInt("numero");
        Toast.makeText(this,""+i,Toast.LENGTH_LONG).show();
        app=(Aplicacion) getApplication();
        Toast.makeText(this,"Main2Activity:onCreate:dato:"+app.getDato(),Toast.LENGTH_SHORT).show();
    }
    public void volver(View v){
        finish();
    }
}
