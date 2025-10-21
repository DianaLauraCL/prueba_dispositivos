package com.example.dispositivosmoviles.Lifecycle;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dispositivosmoviles.R;

public class LifecycleActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d(TAG, "onCreate(): La actividad está siendo creada.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): La actividad está a punto de ser visible.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): La actividad ahora es visible");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): La actividad está a punto de pausarse.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): La actividad ya no es visible.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart(): La actividad se está reiniciando después de estar detenida.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy(): La actividad está a punto de ser destruida.");
    }
}
