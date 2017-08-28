package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Basic_Words_IV_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Basic_Words_IV extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"كَثُرَ", "قَامَ", "دَامَ", "قَالَ", "كَانَ", "خَافَ", "زَادَ", "زَالَ", "سَاَرَ", "شَاءَ", "كَادَ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", ""};

    String [] english_letter = {"Ka-thu-ra", "Qaa-ma", "Daa-ma", "Qaa-la", "Kaa-na", "Khaa-fa", "Zaa-da", "Zaa-la", "Saa-ra", "Shaa-a", "Kaa-da", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic__words__iv);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_basic_words_iv);
        adapter = new Basic_Words_IV_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
