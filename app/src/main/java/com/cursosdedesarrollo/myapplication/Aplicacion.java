package com.cursosdedesarrollo.myapplication;

import android.app.Application;
import android.widget.Toast;

public class Aplicacion extends Application {

    private Integer dato;
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"Aplicacion:onCreate",Toast.LENGTH_SHORT).show();
    }

    public void cargaDatos(){
        try {
            Thread.sleep(3000);
            this.dato=12;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }
}
