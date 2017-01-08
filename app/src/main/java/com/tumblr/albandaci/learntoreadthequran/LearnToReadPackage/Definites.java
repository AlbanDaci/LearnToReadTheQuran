package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Definites_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Definites extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"اَلْكِتَاب", "اَلدَّرْس", "اَلْقَلَم", "اَلْقَائِل", "اَلْقَائِم", "اَلْجَالِس", "اَلْوَرَقَة", "اَلْعِلْم", "اَلْخُبْز", "اَلْمُجْتَهِد"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:"};

    String [] english_letter = {"Al-ki-taab", "Ad-dars", "Al-qa-lam", "Al-qaa-il", "Al-qaa-im", "Al-jaa-lis", "Al-wa-ra-qa", "Al-'ilm", "Al-khubz", "Al-muj-ta-hid"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definites);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_definites);
        adapter = new Definites_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
