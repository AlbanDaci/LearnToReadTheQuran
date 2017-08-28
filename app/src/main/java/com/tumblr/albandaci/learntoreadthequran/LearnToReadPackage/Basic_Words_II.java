package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Basic_Words_II_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Basic_Words_II extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"جَلَسَ", "دَخَلَ", "ذَهَبَ", "ذَكَرَ", "سَأَلَ", "سَمَحَ", "فَتَحَ", "قَتَلَ", "كَتَبَ", "مَلَكَ", "نَزَلَ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", ""};

    String [] english_letter = {"Ja-la-sa", "Da-kha-la", "Dha-ha-ba", "Dha-ka-ra", "Sa-a-la", "Sa-ma-hha", "Fa-ta-hha", "Qa-ta-la", "Ka-ta-ba", "Ma-la-ka", "Na-za-la", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic__words__ii);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_basic_words_ii);
        adapter = new Basic_Words_II_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
