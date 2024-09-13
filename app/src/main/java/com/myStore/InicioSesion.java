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

public class InicioSesion extends AppCompatActivity {

    Button btnVolverHome;
    Button btnDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio_sesion);

        btnVolverHome = findViewById(R.id.btn_volver_home);

        btnVolverHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volverHomeInicioSesion();
            }
        });

        btnDashboard = findViewById(R.id.btn_ir_a_dashboard);

        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IrADashboard();
            }
        });

    }
    public void volverHomeInicioSesion(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void IrADashboard(){
        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);
    }

}
