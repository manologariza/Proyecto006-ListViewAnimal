package com.example.dell.proyecto006_listviewanimal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    ArrayList <Datos> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos=(ListView)findViewById(R.id.lstDatos);
        lista=new ArrayList<Datos>();

        lista.add(new Datos(1, "Gallina", "La más feliz del corral", R.drawable.animal1));
        lista.add(new Datos(2, "Vaca", "Me da leche merengada...Ay, pero que salaa!!!", R.drawable.animal2));
        lista.add(new Datos(3, "Perro", "chindawn, Manolito", R.drawable.animal3));
        lista.add(new Datos(4, "Burro", "Pero que guapo eres!!", R.drawable.animal4));
        lista.add(new Datos(5, "Pato", "Cuac, cuac...", R.drawable.animal5));
        lista.add(new Datos(6, "Caballo", "Corre caballito, corre!!", R.drawable.animal6));
        lista.add(new Datos(7, "Gallo", "Galliniiiita, galliniiiita", R.drawable.animal7));
        lista.add(new Datos(8, "Oveja", "Mamá, que va pasar conmigo estas navidades?", R.drawable.animal8));
        lista.add(new Datos(9, "Pavo", "Creo que lo que a mí", R.drawable.animal9));

        Adaptador miAdaptador=new Adaptador(getApplicationContext(), lista);

        listaDatos.setAdapter(miAdaptador);


        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Datos obj = (Datos) adapterView.getItemAtPosition(i);

                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto", (Serializable)obj);
                startActivity(paso);
            }
        });


    }
}
