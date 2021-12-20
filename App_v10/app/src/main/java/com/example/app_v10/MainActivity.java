package com.example.app_v10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Inicio Programa
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Botones pantalla
     */
    private Button btnProductos, btnServicios, btnSucursales;

    /**
     * Creación pantalla
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        setContentView(R.layout.activity_main);

        btnProductos = (Button) findViewById(R.id.btnProductos);
        btnServicios = (Button) findViewById(R.id.btnServicios);
        btnSucursales = (Button) findViewById(R.id.btnSucursales);

        btnProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "El botón PRODUCTO se implementará en la siguiente versión (Versión 2)", Toast.LENGTH_SHORT).show();
            }
        });
        btnServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "El botón SERVICIO se implementará en la siguiente versión (Versión 2)", Toast.LENGTH_SHORT).show();
            }
        });
        btnSucursales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "El botón SUCURSALES se implementará en la siguiente versión (Versión 2)", Toast.LENGTH_SHORT).show();
            }
        });


    }

    /**
     * Creación menú
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return super.onCreateOptionsMenu(menu);
    }


    /**
     * Creación acciones menú
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.productos:
                Toast.makeText(getApplicationContext(), "PRODUCTO se implementará en la versión 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sucursales:
                Toast.makeText(getApplicationContext(), "SUCURSAL se implementará en la versión 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.servicios:
                Toast.makeText(getApplicationContext(), "SERVICIOS se implementará en la versión 2", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}