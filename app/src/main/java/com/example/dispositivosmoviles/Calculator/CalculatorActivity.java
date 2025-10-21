package com.example.dispositivosmoviles.Calculator;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dispositivosmoviles.R;

public class CalculatorActivity extends AppCompatActivity {

    private static final String TAG = "CalculatorActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Log.d(TAG, "Activity de la calculadora iniciada.");

        Calculator miCalculadora = new BasicCalculator();

        realizarOperaciones(miCalculadora);
    }

    private void realizarOperaciones(Calculator calculadora) {
        double num1 = 20;
        double num2 = 5;

        Log.d(TAG, "INICIO DE OPERACIONES");
        Log.d(TAG, "Números: " + num1 + " y " + num2);

        double resultadoSuma = calculadora.sumar(num1, num2);
        imprimirResultado("Suma", resultadoSuma);

        double resultadoResta = calculadora.restar(num1, num2);
        imprimirResultado("Resta", resultadoResta);

        double resultadoMultiplicacion = calculadora.multiplicar(num1, num2);
        imprimirResultado("Multiplicación", resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(num1, num2);
        imprimirResultado("División", resultadoDivision);

        Log.d(TAG, "Probando división por cero :");
        double num3 = 15;
        double num4 = 0;
        Log.d(TAG, "Números: " + num3 + " y " + num4);
        double resultadoDivisionCero = calculadora.dividir(num3, num4);
        imprimirResultado("División por Cero", resultadoDivisionCero);

        Log.d(TAG, "FIN DE OPERACIONES");
    }

    private void imprimirResultado(String operacion, double resultado) {
        if (Double.isNaN(resultado)) {
            Log.e(TAG, operacion + ": El resultado es indefinido (NaN). Operación no válida (ej. división por cero).");
        } else {
            Log.i(TAG, operacion + ": El resultado es " + resultado);
        }
    }
}
