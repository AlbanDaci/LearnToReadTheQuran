package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Long_Vowels_IV_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Long_Vowels_IV extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"كَا", "كِي", "كُو", "لَا", "لِي", "لُو", "مَا", "مِي", "مُو", "نَا", "نِي", "نُو", "هَا", "هِي", "هُو", "وَا", "وِي", "وُو", "يَا", "يِي", "يُو", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration", ""};

    String [] english_letter = {"Kaa", "Kii", "Kuu", "Laa", "Lii", "Luu", "Maa", "Mii", "Muu", "Naa", "Nii", "Nuu", "Haa", "Hii", "Huu", "Waa", "Wii", "Wuu", "Yaa", "Yii", "Yuu", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long__vowels__iv);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_long_vowels_iv);
        adapter = new Long_Vowels_IV_Adapter(arabic_letter, transliteration, english_letter);
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
