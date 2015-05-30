package com.alvardev.demos.favoriteplaces;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        final List<ItemEntity> items = new ArrayList<ItemEntity>();


        items.add(new ItemEntity(R.drawable.musica, "Linkin Park", "10"));
        items.add(new ItemEntity(R.drawable.musica, "Green Day", "9"));
        items.add(new ItemEntity(R.drawable.imagen, "concierto","7"));

        items.add(new ItemEntity(R.drawable.musica, "Linkin Park", "10"));
        items.add(new ItemEntity(R.drawable.musica, "Green Day","9"));
        items.add(new ItemEntity(R.drawable.imagen, "concierto","7"));

        items.add(new ItemEntity(R.drawable.musica, "Linkin Park", "10"));
        items.add(new ItemEntity(R.drawable.musica, "Green Day","9"));
        items.add(new ItemEntity(R.drawable.imagen, "concierto","7"));

        items.add(new ItemEntity(R.drawable.musica, "Linkin Park", "10"));
        items.add(new ItemEntity(R.drawable.musica, "Green Day","9"));
        items.add(new ItemEntity(R.drawable.imagen, "concierto","7"));

        items.add(new ItemEntity(R.drawable.musica, "Linkin Park", "10"));
        items.add(new ItemEntity(R.drawable.musica, "Green Day","9"));
        items.add(new ItemEntity(R.drawable.imagen, "concierto","7"));

        items.add(new ItemEntity(R.drawable.musica, "Linkin Park", "10"));
        items.add(new ItemEntity(R.drawable.musica, "Green Day","9"));
        items.add(new ItemEntity(R.drawable.imagen, "concierto","7"));


        ItemAdapter adapter = new ItemAdapter(this, items);

        listLugares.setAdapter(adapter);


        listLugares.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),
                        items.get(position).getTitulo(),
                        Toast.LENGTH_SHORT).show();
            }
        });


        //ArrayAdapter adapter = new ArrayAdapter<String>
        //        (this,R.layout.layout_lugar, lugares);


        //listLugares.setAdapter(adapter);

    }


}
