package com.redsystem.redsocialfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PantallaDeCarga extends AppCompatActivity {

    //NOS VEMOS EN EL SIGUIENTE VIDEO
    //SEE YOU IN THE FOLLOWING VIDEO

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_de_carga);

        //Esto se representa en segundos, que demorará la pantalla de carga
        final int Duracion = 2500;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Esto se ejecutará pasado los segundos que hemos establecido
                Intent intent = new Intent(PantallaDeCarga.this, MainActivity.class);
                startActivity(intent);
                //Nos dirige de ésta actividad, al mainActivity

            }
        },Duracion);
    }
}