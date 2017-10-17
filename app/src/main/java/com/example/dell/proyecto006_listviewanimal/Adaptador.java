package com.example.dell.proyecto006_listviewanimal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dell on 11/10/2017.
 */

public class Adaptador extends BaseAdapter {

    Context contexto; //contexto de la aplicacion
    List<Datos> ListaObjetos; //lista de datos a generar. Podemos usar tb un ArrayList

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size(); //Devuelve la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int i) { //Devuelve el objeto de la lista en la posición indicada como parametro
        return ListaObjetos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ListaObjetos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //Es el método que se ejecuta cuando se muestra en mi ListView cada item
        View vista=view;
        LayoutInflater inflate = LayoutInflater.from(contexto); //Obtenemos el contexto del item sobre el cual estamos trabajando del ListView
        vista=inflate.inflate(R.layout.itemlistview, null); //Consigo referenciar a la vista en sí

        ImageView imagen=(ImageView)vista.findViewById(R.id.imgv);
        TextView titulo=(TextView)vista.findViewById(R.id.tvTitulo);
        TextView detalle=(TextView)vista.findViewById(R.id.tvDetalle);

        titulo.setText(ListaObjetos.get(i).getTitulo().toString());
        detalle.setText(ListaObjetos.get(i).getDetalle().toString());
        imagen.setImageResource(ListaObjetos.get(i).getImagen());

        return vista;

    }

}
