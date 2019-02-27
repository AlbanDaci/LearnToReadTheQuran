package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Alphabet_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Alphabet_End extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"ــا", "ــب", "ــت", "ــث", "ــج", "ــح", "ــخ",
            "ــد", "ــذ", "ــر", "ــز", "ــس", "ــش", "ــص",
            "ــض", "ــط", "ــظ", "ــع", "ــغ", "ــف", "ــق",
            "ــك", "ــل", "ــم", "ــن", "ــه", "ــو", "ــلا",
            "ــي", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration", ""};

    String [] english_letter = {"Alif (Middle & End)", "Baa' (End)", "Taa' (End)", "Thaa' (End)", "Jeem (End)", "Hhaa' (End)", "Khaa' (End)",
            "Daal (Middle & End)", "Dhaal (Middle & End)", "Raa' (Middle & End)", "Zaay (Middle & End)", "Seen (End)", "Sheen (End)", "Ssaad (End)",
            "Ddaad (End)", "Ttaa' (End)", "Zhaa' (End)", "'Ain (End)", "Ghayn (End)", "Faa' (End)", "Qaaf (End)",
            "Kaaf (End)", "Laam (End)", "Meem (End)", "Noon (End)", "Haa' (End)", "Waaw (Middle & End)", "Laamalif (Middle & End)",
            "Yaa' (End)", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet__end);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_alphabet_end);
        adapter = new Alphabet_Adapter(arabic_letter, transliteration, english_letter);
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
