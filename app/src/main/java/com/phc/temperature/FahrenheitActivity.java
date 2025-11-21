//Shreya Sivakumar
//WN85777
//Fahrenheit Activity
package com.phc.temperature;
//importing interfaces to connect and run the conversion
import android.content.Intent;
import android.os.Bundle;

import android.util.Log; //using log
//importing xml
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FahrenheitActivity extends AppCompatActivity {
    private static final String TAG = "FahrenheitActivity";
    //Intialize private varibles
    private EditText textfahrenheit;
    private TextView finalanswer;
    private Button convertbutton;
    private Button fahrenheitbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //use log
        Log.d(getClass().getSimpleName(), "onCreate()");
        //Connect the ids of buttons, editextview and textview from xml file
        textfahrenheit = findViewById(R.id.editTextFahrenheit);
        finalanswer = findViewById(R.id.tv1);
        convertbutton = findViewById(R.id.btn);
        fahrenheitbutton = findViewById(R.id.btn2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //function for convert button to convert the number
        convertbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertTemperature();
            }
        });
        fahrenheitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FahrenheitActivity.this, FahrenheitActivity.class);
                startActivity(intent);
            }
        });
    }
    //convert temperature function to input and output the numbers
    private void convertTemperature() {
        String tempStr = textfahrenheit.getText().toString();
        Farenheit fahrenheit = new Farenheit(tempStr);
        String result = fahrenheit.convert(tempStr);
        finalanswer.setText(result);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(getClass().getSimpleName(), "onStart called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(getClass().getSimpleName(), "onResume called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(getClass().getSimpleName(), "onPause called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(getClass().getSimpleName(), "onStop called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getClass().getSimpleName(), "onDestroy called");

    }
}

