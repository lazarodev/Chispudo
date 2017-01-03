package com.gt.dev.lazaro.chispudo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gt.dev.lazaro.chispudo.R;
import com.gt.dev.lazaro.chispudo.adapter.GlosarioAdapter;
import com.gt.dev.lazaro.chispudo.adapter.Textos;

import java.util.ArrayList;

public class GlosarioActivty extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<Textos> categoria = new ArrayList<>();
    private ListView lvGlosario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glosario_activty);

        // Obtenemos el toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lvGlosario = (ListView) findViewById(R.id.lv_glosario);

        categoria.add(new Textos("palabra", "significado"));
        categoria.add(new Textos("palabra2", "significado2"));

        GlosarioAdapter adapter = new GlosarioAdapter(categoria, this);
        lvGlosario.setAdapter(adapter);

        lvGlosario.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
