package com.alvardev.demos.favoriteplaces;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ListaLugaresActivity extends ActionBarActivity {

    private ListView listLugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_lugares);
        getSupportActionBar().hide();

        listLugares = (ListView) findViewById(R.id.listLugares);

        List<String> lugares = new ArrayList<String>();

        for(int i=0; i<20; i++){
            lugares.add("Lugar: "+i);
        }


        ArrayAdapter adapter = new ArrayAdapter<String>
                (this,R.layout.layout_lugar, lugares);


        listLugares.setAdapter(adapter);

    }


}
