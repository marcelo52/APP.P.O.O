package com.example.apppoo;

import androidx.appcompat.app.AppCompatActivity;

import android.R.layout;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static android.R.layout.*;

public class TerceiraTela<adapter, simple_spinner_dropdown_item> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);
    }
    Spinner spinner = (Spinner) findViewById(R.id.carrosCampo);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.carros, simple_spinner_item);
    adapter.setDropDownViewResource(simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
}
    /*
    String carrosCampo[]{"carro1","carro2","carro3","carro4","carro5"}
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, carrosCampo)
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    carrosCampo.setAdapter(adapter);

     */
/*
    spinner spinner = (spinner) findViewById(R.id.possiveisProblemasCampo);
    ArrayList carros = new ArrayList<>(Array.asList("carro1","carro2","carro3","carro4","carro5"));
    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,carros);
    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinner.setAdapter(dataAdapter);
}

     */
