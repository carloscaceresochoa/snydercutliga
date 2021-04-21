package com.usb.appligasnyder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearSmoothScroller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class HeroesActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);
        listView=findViewById(R.id.listview);
        Liga liga=new Liga();
        List<Heroes> heroes=liga.ligaJusticia();
        Adaptador adaptador=new Adaptador(heroes,this);
        View header= LayoutInflater.from(this).inflate(R.layout.header,null);
        View footer= LayoutInflater.from(this).inflate(R.layout.footer,null);
        listView.setAdapter(adaptador);
        listView.addHeaderView(header);
        listView.addFooterView(footer);

    }
}