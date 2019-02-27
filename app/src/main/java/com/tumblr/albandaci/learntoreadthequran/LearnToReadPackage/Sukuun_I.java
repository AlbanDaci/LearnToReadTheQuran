package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Sukuun_I_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Sukuun_I extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"اَلْ", "أَبْ", "أَخْ", "أَمْ", "أَوْ", "أَيْ", "بَثْ", "بَسْ", "بَشْ", "بَلْ", "بَكْ", "خَلْ", "سَلْ", "صَحْ", "صَهْ", "تَمْ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", ""};

    String [] english_letter = {"Al", "Ab", "Akh", "Am", "Aw", "Ay", "Beth", "Bes", "Besh", "Bel", "Bek", "Khal", "Sel", "Ssahh", "Ssah", "Tem", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukuun__i);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_sukuun_i);
        adapter = new Sukuun_I_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        Toast.makeText(getApplicationContext(), "Click on the text to listen to the Audio", Toast.LENGTH_LONG).show();
    }
}
