package com.example.gasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalcBestPrice(View view) {

        TextInputEditText alcool = findViewById(R.id.textInputEditText);
        TextInputEditText gasoline = findViewById(R.id.textInputEditText2);
        TextView result = findViewById(R.id.textView3);

        if(alcool.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Por favor é necessario colocar um valor para o alcool", Toast.LENGTH_SHORT).show();
            return;
        }

        if(gasoline.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Por favor é necessario colocar um valor para a gasolina", Toast.LENGTH_SHORT).show();
            return;
        }

        
        if(Float.parseFloat(alcool.getText().toString()) <= Float.parseFloat(gasoline.getText().toString()) * 0.7f) {
            result.setText("Resultado: Alcool é a melhor opção");
        } else {
            result.setText("Resultado: Gasolina é a melhor opção");
        }

    }
}