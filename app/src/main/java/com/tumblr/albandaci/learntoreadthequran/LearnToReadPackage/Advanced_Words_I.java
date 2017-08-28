package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Advanced_Words_I_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Advanced_Words_I extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"فَقَامَ", "فَكَانَ", "فَكَتَبَ", "فَنَزَلَتْ", "فَرَكِبَ", "فَفَهِمَتْ", "فَقُتِلَ", "أَرَادَ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", ""};

    String [] english_letter = {"Fa-qaa-ma", "Fa-kaa-na", "Fa-ka-ta-ba", "Fa-na-za-lat", "Fa-ra-ki-ba", "Fa-fa-hi-mat", "Fa-qu-ti-la", "A-raa-da", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced__words__i);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_advanced_words_i);
        adapter = new Advanced_Words_I_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
