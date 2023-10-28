package com.example.recyclesscrollandcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Scroll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
    }

    public void Seleccion(View View){
        String cadena=getResources().getResourceEntryName(View.getId());
        Toast.makeText(this,"Este boton es" +cadena, Toast.LENGTH_SHORT).show();
    }
}