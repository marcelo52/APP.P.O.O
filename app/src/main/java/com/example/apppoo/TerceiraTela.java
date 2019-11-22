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

public class TerceiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);
    }
    Spinner carrosSpinner = (Spinner) findViewById(R.id.carrosCampo);
   String itemSelecionado = carrosSpinner.getSelectedItem().toString();
    Spinner problemasSpinner = (Spinner) findViewById(R.id.possiveisProblemasCampo);
    String itemSelecionado2 = problemasSpinner.getSelectedItem().toString();
    Spinner pecasSpinner = (Spinner) findViewById(R.id.possiveisPecasCampo);
    String itemSelecionado3 = pecasSpinner.getSelectedItem().toString();
}
