package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Basic_Words_I_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Basic_Words_I extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"أَبَدَ", "أَزَلَ", "أَجَلَ", "أَخَذَ", "أَثَرَ", "أَسَرَ", "أَكَلَ", "أَمَلَ", "بَدَأَ", "بَدَلَ", "بَلَغَ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", ""};

    String [] english_letter = {"A-ba-da", "A-za-la", "A-ja-la", "A-kha-dha", "A-tha-ra", "A-sa-ra", "A-ka-la", "A-ma-la", "Ba-da-a", "Ba-da-la", "Ba-la-gha", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic__words__i);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_basic_words_i);
        adapter = new Basic_Words_I_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
