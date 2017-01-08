package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Indefinites_Nominative_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Indefinites_Nominative extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"كِتَابٌ", "دَرْسٌ", "قَلَمٌ", "قَائِمٌ", "قَائِلٌ", "جَالِسٌ", "وَرَقَةٌ", "عِلْمٌ", "خُبْزٌ", "مُجْتَهِدٌ"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:"};

    String [] english_letter = {"Ki-taa-bun", "Dar-sun", "Qa-la-mun", "Qaa-i-mun", "Qaa-i-lun", "Jaa-li-sun", "Wa-ra-qa-tun", "'Il-mun", "Khub-zun", "Muj-ta-hi-dun"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indefinites__nominative);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_indefinites_nominative);
        adapter = new Indefinites_Nominative_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
