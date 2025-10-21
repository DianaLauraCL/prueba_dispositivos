package com.example.dispositivosmoviles;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ArrayTestActivity extends AppCompatActivity {


    private static final String TAG = "ArrayTestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_test);

        Log.d(TAG, "Iniciando la prueba de ordenamiento de arreglo.");

        realizarPruebaDeOrdenamiento();
    }

    private void realizarPruebaDeOrdenamiento() {

        long tiempoInicio = System.nanoTime();

        int tamanoArreglo = 1_000_000;
        int[] miArreglo = new int[tamanoArreglo];
        Random generadorAleatorio = new Random();

        for (int i = 0; i < tamanoArreglo; i++) {
            miArreglo[i] = generadorAleatorio.nextInt();
        }

        Log.i(TAG, "Arreglo de " + tamanoArreglo + " elementos creado con éxito.");

        Arrays.sort(miArreglo);

        Log.i(TAG, "El arreglo ha sido ordenado.");

        long tiempoFin = System.nanoTime();
        long duracionNano = tiempoFin - tiempoInicio;

        long duracionMilisegundos = TimeUnit.NANOSECONDS.toMillis(duracionNano);

        String resultado = "Tiempo total de ejecución: " + duracionMilisegundos + " ms (" + duracionNano + " nanosegundos)";
        Log.d(TAG, "-------------------");
        Log.d(TAG, "RESULTADOS:");
        Log.d(TAG, resultado);
        Log.d(TAG, "--------------------");
    }
}
