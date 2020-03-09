package com.eliascapasso.quienmeayuda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class RegistroUsuarioActivity extends AppCompatActivity {
    private EditText txtNombre, txtApellido, txtDni, txtFechaNacimiento, txtEmail, txtEmailConfirmacion, txtPass, txtPassConfirmacion, txtTelefono, txtExperiencia;
    private Spinner spSexo, spPais, spProvincia, spLocalidad;
    private CheckBox cbEsAyudante;
    private TextView tituloDniFrente, tituloDniDorso, tituloExperiencia;
    private ImageView imgFotoPerfil, imgDniFrente, imgDniDorso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        inicializarComponentes();

        cbEsAyudante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbEsAyudante.isChecked()){
                    txtDni.setVisibility(View.INVISIBLE);
                    imgDniFrente.setVisibility(View.INVISIBLE);
                    tituloDniFrente.setVisibility(View.INVISIBLE);
                    imgDniDorso.setVisibility(View.INVISIBLE);
                    tituloDniDorso.setVisibility(View.INVISIBLE);
                    tituloExperiencia.setVisibility(View.INVISIBLE);
                    txtExperiencia.setVisibility(View.INVISIBLE);
                }
                else{
                    txtDni.setVisibility(View.VISIBLE);
                    imgDniFrente.setVisibility(View.VISIBLE);
                    tituloDniFrente.setVisibility(View.VISIBLE);
                    imgDniDorso.setVisibility(View.VISIBLE);
                    tituloDniDorso.setVisibility(View.VISIBLE);
                    tituloExperiencia.setVisibility(View.VISIBLE);
                    txtExperiencia.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void inicializarComponentes(){
        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtApellido = (EditText)findViewById(R.id.txtApellido);
        txtDni = (EditText)findViewById(R.id.txtDni);
        txtFechaNacimiento = (EditText)findViewById(R.id.txtFechaNacimiento);
        txtEmail = (EditText)findViewById(R.id.txtEmail);
        txtEmailConfirmacion = (EditText)findViewById(R.id.txtEmailConfirmacion);
        txtPass = (EditText)findViewById(R.id.txtPass);
        txtPassConfirmacion = (EditText)findViewById(R.id.txtPassConfirmar);
        txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        txtExperiencia = (EditText)findViewById(R.id.txtExperiencia);
        spSexo = (Spinner)findViewById(R.id.spSexo);
        spPais = (Spinner)findViewById(R.id.spPais);
        spProvincia = (Spinner)findViewById(R.id.spProvincia);
        spLocalidad = (Spinner)findViewById(R.id.spLocalidad);
        cbEsAyudante = (CheckBox) findViewById(R.id.cbEsAyudante);
        imgFotoPerfil = (ImageView) findViewById(R.id.imgFotoPerfil);
        imgDniFrente = (ImageView) findViewById(R.id.imgDniFrente);
        imgDniDorso = (ImageView) findViewById(R.id.imgDniDorso);
        tituloDniFrente = (TextView) findViewById(R.id.tituloDniFrente);
        tituloDniDorso = (TextView) findViewById(R.id.tituloDniDorso);
        tituloExperiencia = (TextView) findViewById(R.id.tituloExperiencia);
    }
}
