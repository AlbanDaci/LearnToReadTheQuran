package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Sukuun_III_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Sukuun_III extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"غِلْ", "قِصْ", "بِرْ", "لِمْ", "لِصْ", "ذِرْ", "أُفْ", "ذُلْ", "رُزْ", "خُلْ", "خُذْ", "قُلْ", "مُخْ", "غُلْ", "قُمْ", "جُلْ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", ""};

    String [] english_letter = {"Ghil", "Qiss", "Bir", "Lim", "Liss", "Dhir", "Uf", "Dhul", "Ruz", "Khul", "Khudh", "Qul", "Mukh", "Ghul", "Qum", "Jul", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukuun__iii);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_sukuun_iii);
        adapter = new Sukuun_III_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
