package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_pratica_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listaretornada = (ListView) findViewById(R.id.listafrutas);
        listaretornada.setAdapter(new FrutasAdapter(this));
        listaretornada.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String fruta = (String) adapterView.getAdapter().getItem(i);
        Toast.makeText(MainActivity.this, "Fruta selecionada: " + fruta, Toast.LENGTH_SHORT).show();
    }
}
