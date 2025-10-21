package com.example.dispositivosmoviles.Fibonacci;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dispositivosmoviles.R;

import java.util.HashMap;
import java.util.Map;

public class FibonacciActivity extends AppCompatActivity {

    private static final String TAG = "FibonacciActivity";

    private TextView textFibonacciValue;
    private Button buttonNext, buttonPrevious;

    private int currentIndex = 0;

    private Map<Integer, Long> memo = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        textFibonacciValue = findViewById(R.id.text_fibonacci_value);
        buttonNext = findViewById(R.id.button_next);
        buttonPrevious = findViewById(R.id.button_previous);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                updateFibonacciValue();
            }
        });

        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentIndex > 0) {
                    currentIndex--;
                    updateFibonacciValue();
                }
            }
        });

        updateFibonacciValue();
    }

    private long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            Log.d(TAG, "Usando valor de memo para n=" + n);
            return memo.get(n);
        }

        Log.d(TAG, "Calculando valor para n=" + n);
        long result = fibonacci(n - 1) + fibonacci(n - 2);

        memo.put(n, result);

        return result;
    }

    private void updateFibonacciValue() {
        long value;
        if (currentIndex == 0) {
            value = 0;
        } else {
            value = fibonacci(currentIndex);
        }

        textFibonacciValue.setText(String.valueOf(value));

        buttonPrevious.setEnabled(currentIndex > 0);
    }
}
