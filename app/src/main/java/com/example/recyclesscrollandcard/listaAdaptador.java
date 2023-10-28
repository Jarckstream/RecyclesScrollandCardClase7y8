package com.example.recyclesscrollandcard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class listaAdaptador extends RecyclerView.Adapter<listaAdaptador.ViewHolder> {

    private List<listaElementos> mData;
    private LayoutInflater mInflater;
    private Context context;

    public listaAdaptador(List<listaElementos> itemList, Context context){
        this.mInflater=LayoutInflater.from(context);
        this.context=context;
        this.mData= itemList;
    }

    @Override
    public int getItemCount(){ return mData.size();}

    @Override
    public listaAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view= mInflater.inflate(R.layout.lista_elementos,null);
        return new listaAdaptador.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final listaAdaptador.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItems(List<listaElementos> items){mData=items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, city, status;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImage);
            name = itemView.findViewById(R.id.txtNombre);
            city = itemView.findViewById(R.id.txtCiudad);
            status = itemView.findViewById(R.id.txtEstado);
        }

        void bindData(final listaElementos item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getNombre());
            city.setText(item.getCiudad());
            status.setText(item.getEstado());
        }

    }






}
