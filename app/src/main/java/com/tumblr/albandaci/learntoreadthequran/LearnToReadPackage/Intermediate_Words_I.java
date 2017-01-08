package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Intermediate_Words_I_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Intermediate_Words_I extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"أَبَى", "أَتَى", "جَرَى", "دَعَا", "بَرِئَ", "رَأَى", "أَرَى", "رَمَى", "رَوَى", "وَقَى"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:"};

    String [] english_letter = {"A-baa", "A-taa", "Ja-raa", "Da-'aa", "Ba-ri-a", "Ra-aa", "A-raa", "Ra-maa", "Ra-waa", "Wa-qaa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate__words__i);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_intermediate_words_i);
        adapter = new Intermediate_Words_I_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
