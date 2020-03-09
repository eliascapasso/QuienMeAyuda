package com.eliascapasso.quienmeayuda;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegistroUsuarioActivity extends AppCompatActivity {
    private EditText txtFechaNacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        inicializarComponentes();
    }

    private void inicializarComponentes(){
        txtFechaNacimiento = (EditText)findViewById(R.id.txtFechaNacimiento);

        //TODO: Inicializar el resto de los componentes
    }
}
