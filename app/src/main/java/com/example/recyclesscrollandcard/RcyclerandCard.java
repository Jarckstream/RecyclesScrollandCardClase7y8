package com.example.recyclesscrollandcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class RcyclerandCard extends AppCompatActivity {


    List<listaElementos> elementos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcyclerand_card);

        init();
    }

    public void init(){
        elementos = new ArrayList<>();
        elementos.add(new listaElementos("#775447", "Laura","Temuco","Activo"));
        elementos.add(new listaElementos("#607d8b", "Sofia","Talca","Inactivo"));
        elementos.add(new listaElementos("#03a9f4", "Natalia","Vilcun","Bloqueado"));
        elementos.add(new listaElementos("#f44336", "Nicole","Arica","Inactivo"));
        elementos.add(new listaElementos("#009688", "Catalina","Concepcion","Activo"));

        listaAdaptador listAdapter = new listaAdaptador(elementos,this);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);


    }
}