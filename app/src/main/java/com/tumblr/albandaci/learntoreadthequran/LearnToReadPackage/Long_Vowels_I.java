package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Long_Vowels_I_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Long_Vowels_I extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"آ", "إيــ", "أُو", "بَا", "بِي", "بُو", "تَا", "تِي", "تُو", "ثَا", "ثِي", "ثُو", "جَا", "جِي", "جُو", "حَا", "حِي", "حُو", "خَا", "خِي", "خُو", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration", ""};

    String [] english_letter = {"Aa", "Ii", "Uu", "Baa", "Bii", "Buu", "Taa", "Tii", "Tuu", "Thaa", "Thii", "Thuu", "Jaa", "Jii", "Juu", "Hhaa", "Hhii", "Hhuu", "Khaa", "Khii", "Khuu", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long__vowels__i);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_long_vowels_i);
        adapter = new Long_Vowels_I_Adapter(arabic_letter, transliteration, english_letter);
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
