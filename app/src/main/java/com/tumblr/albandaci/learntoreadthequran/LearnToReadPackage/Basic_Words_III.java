package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Basic_Words_III_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Basic_Words_III extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"نَظَرَ", "وَرَدَ", "وَصَلَ", "أَمِنَ", "رَكِبَ", "شَرِبَ", "لَبِسَ", "لَقِيَ", "وَرِثَ", "سَوِيَ", "يَقِظَ"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:"};

    String [] english_letter = {"Na-zha-ra", "Wa-ra-da", "Wa-ssa-la", "A-mi-na", "Ra-ki-ba", "Sha-ri-ba", "La-bi-sa", "La-qi-ya", "Wa-ri-tha", "Sa-wi-ya", "Ya-qi-zha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic__words__iii);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_basic_words_iii);
        adapter = new Basic_Words_III_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
