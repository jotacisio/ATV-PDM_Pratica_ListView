package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_pratica_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

public class FrutasAdapter extends BaseAdapter
{
    private String[] frutas = new String[]
    {"Banana", "Maça", "Pera", "Abacaxi", "Tomate",
    "Uva", "Melão", "Goiaba", "Caja","Caju", "Manga"};
    private Context contexto;

    public FrutasAdapter(Context contexto) {
        super();
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return frutas.length;
    }

    @Override
    public Object getItem(int i) {
        return frutas[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        String fruta_escolhida = frutas[i];
        LayoutInflater txtviewInflater = LayoutInflater.from(contexto);
        TextView txtview = (TextView) txtviewInflater.inflate(R.layout.textview_inflater,viewGroup, false);
        txtview.setText(fruta_escolhida);

        return txtview;
    }
}
