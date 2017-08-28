package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Intermediate_Words_III_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Intermediate_Words_III extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"قَدَّرَ", "قَرَّرَ", "نَزَّلَ", "وَسَّخَ", "يَسَّرَ", "سَمَّى", "حَيَّ", "حَاجَّ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", ""};

    String [] english_letter = {"Qad-da-ra", "Qar-ra-ra", "Naz-za-la", "Was-sa-kha", "Yas-sa-ra", "Sam-maa", "Hhay-ya", "Hhaaj-ja", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate__words__iii);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_intermediate_words_iii);
        adapter = new Intermediate_Words_III_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
