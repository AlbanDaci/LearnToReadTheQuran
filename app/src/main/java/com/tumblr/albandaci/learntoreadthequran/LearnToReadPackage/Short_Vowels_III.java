package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Short_Vowels_III_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Short_Vowels_III extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"ضَــ", "ضِــ", "ضُــ", "طَــ", "طِــ", "طُــ", "ظَــ", "ظِــ", "ظُــ", "عَــ", "عِــ", "عُــ", "غَــ", "غِــ", "غُــ", "فَــ", "فِــ", "فُــ", "قَــ", "قِــ", "قُــ", ""};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration", ""};

    String [] english_letter = {"Dda", "Ddi", "Ddu", "Tta", "Tti", "Ttu", "Zha", "Zhi", "Zhu", "'A", "'I", "'U", "Gha", "Ghi", "Ghu", "Fa", "Fi", "Fu", "Qa", "Qi", "Qu", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short__vowels__iii);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_short_vowels_iii);
        adapter = new Short_Vowels_III_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
