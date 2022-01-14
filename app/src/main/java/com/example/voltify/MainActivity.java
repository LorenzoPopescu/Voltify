package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button inserisci;
    EditText titolo;
    GestioneDati gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inserisci = (Button)findViewById(R.id.inserisci);
        titolo = (EditText)findViewById(R.id.titolo);
        inserisci.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                gd.addBrani();
            }
        });

    }
}