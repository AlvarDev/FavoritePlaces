package com.alvardev.demos.favoriteplaces;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends ActionBarActivity {

    private EditText usuario;
    private EditText password;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        usuario = (EditText)findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.password);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = usuario.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("USMP") && pass.equals("ieee")){
                    Intent intent = new Intent(getApplicationContext(), ListaLugaresActivity.class);
                    startActivity(intent);
                }else{
                    Log.i("Resultado", "No ingreso");
                }

            }
        });

    }



}
