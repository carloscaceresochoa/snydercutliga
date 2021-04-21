package com.usb.appligasnyder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {
    private List<Heroes> heroes;
    private Context context;
    private LayoutInflater layoutInflater;

    public Adaptador(List<Heroes> heroes, Context context) {
        this.heroes = heroes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return heroes.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView heroetext;
        ImageView heroeimage;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.heore_item,parent,false);
        heroetext=view.findViewById(R.id.heroetext);
        heroeimage=view.findViewById(R.id.heoreimage);
        heroetext.setText(heroes.get(position).getNombre());
        heroeimage.setImageResource(heroes.get(position).getImagen());
        return view;
    }
}
