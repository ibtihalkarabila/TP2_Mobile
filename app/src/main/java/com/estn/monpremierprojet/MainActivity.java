package com.estn.monpremierprojet;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TP2_DEBUG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "L'activité MainActivity a été créée avec succès."); // Info
        Log.d(TAG, "Test de valeur de débogage : API Level = " +
                android.os.Build.VERSION.SDK_INT); // Debug
        Button btn = findViewById(R.id.btnTest);
        btn.setOnClickListener(v -> {
            Log.e(TAG, "Le bouton a été cliqué par l'utilisateur !"); // Error
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}