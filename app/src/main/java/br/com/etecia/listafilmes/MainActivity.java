package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView ListaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaFilmes =
                findViewById(R.id.idListaFilmes);
        Myadapter adapter = new Myadapter();

        //preparar para instanciar o adapatador
        ListaFilmes.setAdapter(adapter);

    }
    //criando uma inner class Myadapter

    public class Myadapter extends BaseAdapter {


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }


}


