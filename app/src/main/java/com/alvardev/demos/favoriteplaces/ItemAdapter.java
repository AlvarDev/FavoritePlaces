package com.alvardev.demos.favoriteplaces;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter{

    private Context context;
    private List<ItemEntity> lista;

    public ItemAdapter(Context context, List<ItemEntity> lista){
        this.context = context;
        this.lista = lista;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView img;
        TextView titulo;
        TextView puntaje;
    }


    public View getView(int position, View convertView, ViewGroup parent){

        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.layout_linea, null);
            holder = new ViewHolder();
            holder.img = (ImageView) convertView.findViewById(R.id.img);
            holder.titulo = (TextView) convertView.findViewById(R.id.titulo);
            holder.puntaje = (TextView) convertView.findViewById(R.id.puntaje);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        ItemEntity item = (ItemEntity) getItem(position);

        holder.img.setImageDrawable(context.getResources().getDrawable(item.getImagen()));
        holder.titulo.setText(item.getTitulo());
        holder.puntaje.setText(item.getPuntaje());

        return convertView;
    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.indexOf(getItem(position));
    }



}
