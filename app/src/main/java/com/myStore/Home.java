package com.myStore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {


    Button btnRegistro;
    Button btnInicioSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        btnRegistro = findViewById(R.id.btn_ir_registro);

        btnInicioSesion = findViewById(R.id.btn_ir_inicio_sesion);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irRegistro();
            }

        });

        btnInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irInicioSesion();
            }
        });

    }


    public void irRegistro() {
        Intent intent = new Intent(this, registrer.class);
        startActivity(intent);
    }

    public void irInicioSesion(){
        Intent intent = new Intent(this, InicioSesion.class);
        startActivity(intent);
    }

}