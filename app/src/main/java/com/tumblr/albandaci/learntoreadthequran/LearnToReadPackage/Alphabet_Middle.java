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

public class Alphabet_Middle extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"ــا", "ــبــ", "ــتــ", "ــثــ", "ــجــ", "ــحــ", "ــخــ",
            "ــد", "ــذ", "ــر", "ــز", "ــســ", "ــشــ", "ــصــ",
            "ــضــ", "ــطــ", "ــظــ", "ــعــ", "ــغــ", "ــفــ", "ــقــ",
            "ــكــ", "ــلــ", "ــمــ", "ــنــ", "ــهــ", "ــو", "ــلا",
            "ــيــ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration", ""};

    String [] english_letter = {"Alif (Middle & End)", "Baa' (Middle)", "Taa' (Middle)", "Thaa' (Middle)", "Jeem (Middle)", "Hhaa' (Middle)", "Khaa' (Middle)",
            "Daal (Middle & End)", "Dhaal (Middle & End)", "Raa' (Middle & End)", "Zaay (Middle & End)", "Seen (Middle)", "Sheen (Middle)", "Ssaad (Middle)",
            "Ddaad (Middle)", "Ttaa' (Middle)", "Zhaa' (Middle)", "'Ain (Middle)", "Ghayn (Middle)", "Faa' (Middle)", "Qaaf (Middle)",
            "Kaaf (Middle)", "Laam (Middle)", "Meem (Middle)", "Noon (Middle)", "Haa' (Middle)", "Waaw (Middle & End)", "Laamalif (Middle & End)",
            "Yaa' (Middle)", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet__middle);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_alphabet_middle);
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
