package com.gt.dev.lazaro.chispudo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gt.dev.lazaro.chispudo.R;
import com.gt.dev.lazaro.chispudo.adapter.Textos;
import com.gt.dev.lazaro.chispudo.adapter.TextosAdapter;

import java.util.ArrayList;

public class TextoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<Textos> categoria = new ArrayList<>();
    private ListView lvTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto);

        // get the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lvTexto = (ListView) findViewById(R.id.lv_texto);

        categoria.add(new Textos("titulo", "description"));
        categoria.add(new Textos("tituo2", "description2"));

        TextosAdapter adapter = new TextosAdapter(categoria, this);
        lvTexto.setAdapter(adapter);

        lvTexto.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(TextoActivity.this, DetailTextoActivity.class));
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
