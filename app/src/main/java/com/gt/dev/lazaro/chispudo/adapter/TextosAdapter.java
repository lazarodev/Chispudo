package com.gt.dev.lazaro.chispudo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gt.dev.lazaro.chispudo.R;

import java.util.ArrayList;

/**
 * Created by Lazarus on 31/12/2016.
 */

public class TextosAdapter extends BaseAdapter {

    private ArrayList<Textos> categoria;
    LayoutInflater inflater;
    Context contexto;

    public TextosAdapter(ArrayList<Textos> cat, Context con) {
        this.categoria = cat;
        inflater = LayoutInflater.from(con);
        this.contexto = con;
    }

    @Override
    public int getCount() {
        return categoria.size();
    }

    @Override
    public Object getItem(int position) {
        return categoria.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.texto_adapter, null);
        Textos cat = categoria.get(position);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tv_texto_title);
        TextView tvDescription = (TextView) convertView.findViewById(R.id.tv_texto_description);

        tvTitle.setText(cat.getTitulo());
        tvDescription.setText(cat.getDescription());

        return convertView;
    }
}
