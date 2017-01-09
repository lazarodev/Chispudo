package com.gt.dev.lazaro.chispudo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        categoria.add(new Textos(getString(R.string.aguambado), getString(R.string.aguambado_glosario)));
        categoria.add(new Textos(getString(R.string.burra), getString(R.string.burra_glosario)));
        categoria.add(new Textos(getString(R.string.cachimbazo), getString(R.string.cachimbazo_glosario)));
        categoria.add(new Textos(getString(R.string.camandula), getString(R.string.camandula_glosario)));
        categoria.add(new Textos(getString(R.string.cantinear), getString(R.string.cantinear_glosario)));
        categoria.add(new Textos(getString(R.string.caquero), getString(R.string.caquero_glosario)));
        categoria.add(new Textos(getString(R.string.casaca), getString(R.string.casaca_glosario)));
        categoria.add(new Textos(getString(R.string.chafa), getString(R.string.chafa_glosario)));
        categoria.add(new Textos(getString(R.string.chafarote), getString(R.string.chafarote_glosario)));
        categoria.add(new Textos(getString(R.string.chaye), getString(R.string.chaye)));
        categoria.add(new Textos(getString(R.string.chele), getString(R.string.chele_glosario)));
        categoria.add(new Textos(getString(R.string.choco), getString(R.string.chocco_glosario)));
        categoria.add(new Textos(getString(R.string.chompipe), getString(R.string.chompipe_glosario)));
        categoria.add(new Textos(getString(R.string.chonte), getString(R.string.chonte_glosario)));
        categoria.add(new Textos(getString(R.string.chucho), getString(R.string.chucho_glosario)));
        categoria.add(new Textos(getString(R.string.chumino), getString(R.string.chumino_glosario)));
        categoria.add(new Textos(getString(R.string.chumpa), getString(R.string.chumpa_glosario)));
        categoria.add(new Textos(getString(R.string.chunto), getString(R.string.chunto_glosario)));
        categoria.add(new Textos(getString(R.string.colocho), getString(R.string.colocho_glosario)));
        categoria.add(new Textos(getString(R.string.cuque), getString(R.string.cuque_glosario)));
        categoria.add(new Textos(getString(R.string.ficha), getString(R.string.ficha_glosario)));
        categoria.add(new Textos(getString(R.string.guaca), getString(R.string.guaca_glosario)));
        categoria.add(new Textos(getString(R.string.guaro), getString(R.string.guaro_glosario)));
        categoria.add(new Textos(getString(R.string.guasa), getString(R.string.guasa_glosario)));
        categoria.add(new Textos(getString(R.string.hueco), getString(R.string.hueco_glosario)));
        categoria.add(new Textos(getString(R.string.ishto), getString(R.string.ishto_gloario)));
        categoria.add(new Textos(getString(R.string.len), getString(R.string.len_glosario)));
        categoria.add(new Textos(getString(R.string.neque), getString(R.string.neque)));
        categoria.add(new Textos(getString(R.string.pararlacola), getString(R.string.pararlacola_glosario)));
        categoria.add(new Textos(getString(R.string.patachucho), getString(R.string.patachucho)));
        categoria.add(new Textos(getString(R.string.patojo), getString(R.string.patojo_glosario)));
        categoria.add(new Textos(getString(R.string.pisado), getString(R.string.pisado_glosario)));
        categoria.add(new Textos(getString(R.string.pisto), getString(R.string.pisado_glosario)));
        categoria.add(new Textos(getString(R.string.puchica), getString(R.string.puchica_glosario)));
        categoria.add(new Textos(getString(R.string.serote), getString(R.string.serote_glosario)));
        categoria.add(new Textos(getString(R.string.sho), getString(R.string.sho_glosario)));
        categoria.add(new Textos(getString(R.string.sholco), getString(R.string.sholco_glosario)));
        categoria.add(new Textos(getString(R.string.shuco), getString(R.string.shuco_glosario)));
        categoria.add(new Textos(getString(R.string.tipunco), getString(R.string.tinpunco_glosario)));
        categoria.add(new Textos(getString(R.string.trompudo), getString(R.string.trompudo_glosario)));
        categoria.add(new Textos(getString(R.string.virula), getString(R.string.virula_glosario)));

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
