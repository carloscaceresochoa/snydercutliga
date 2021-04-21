package com.usb.appligasnyder;

import java.util.ArrayList;
import java.util.List;

public class Liga {

    public List<Heroes> ligaJusticia(){

        List<Heroes> liga=new ArrayList<Heroes>();
        liga.add(new Heroes("Superman",R.drawable.superman));
        liga.add(new Heroes("Batman",R.drawable.batman));
        liga.add(new Heroes("Mujer Maravilla",R.drawable.wonder));
        liga.add(new Heroes("Aquaman",R.drawable.aquaman));
        liga.add(new Heroes("Cyborg",R.drawable.cyborg));
        liga.add(new Heroes("Flash",R.drawable.flash));

        return liga;
    }


}
