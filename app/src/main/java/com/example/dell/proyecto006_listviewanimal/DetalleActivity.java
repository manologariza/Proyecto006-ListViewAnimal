package com.example.dell.proyecto006_listviewanimal;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    ImageView foto;
    TextView titulo;
    TextView detalle;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        foto=(ImageView)findViewById(R.id.imgvFoto);
        titulo=(TextView)findViewById(R.id.txtTitulo);
        detalle=(TextView)findViewById(R.id.txtDetalle);

        Datos obj = (Datos) getIntent().getExtras().getSerializable("objeto");
        titulo.setText(obj.getTitulo());
        detalle.setText(obj.getDetalle());
        foto.setImageResource(obj.getImagen());

        mp=MediaPlayer.create(this, obj.getSonido());
    }

    public void reproducir(View v){
        mp.start();
    }
}
