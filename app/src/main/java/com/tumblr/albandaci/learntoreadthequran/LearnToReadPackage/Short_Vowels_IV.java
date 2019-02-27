package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Short_Vowels_IV_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Short_Vowels_IV extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"كَــ", "كِــ", "كُــ", "لـَـ", "لـِـ", "لُــ", "مَــ", "مِــ", "مُــ", "نــَ", "نِــ", "نُــ", "هَــ", "هِــ", "هُــ", "وَ", "وِ", "وُ", "يــَ", "يِــ", "يُــ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration", ""};

    String [] english_letter = {"Ka", "Ki", "Ku", "La", "Li", "Lu", "Ma", "Mi", "Mu", "Na", "Ni", "Nu", "Ha", "Hi", "Hu", "Wa", "Wi", "Wu", "Ya", "Yi", "Yu", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short__vowels__iv);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_short_vowels_iv);
        adapter = new Short_Vowels_IV_Adapter(arabic_letter, transliteration, english_letter);
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
