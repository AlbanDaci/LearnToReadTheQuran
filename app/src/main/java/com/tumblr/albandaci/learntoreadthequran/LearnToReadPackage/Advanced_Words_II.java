package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Advanced_Words_II_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Advanced_Words_II extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"تَآمَرَ", "تَأَثَّرَ", "جَاوَرَ", "سَافَرَ", "شَارَكَ", "تَبَادَلَ", "اِتَّخَذَ", "إِبْتَدَأَ"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:"};

    String [] english_letter = {"Ta-aaa-ma-ra", "Ta-ath-tha-ra", "Jaa-wa-ra", "Saa-fa-ra", "Shaa-ra-ka", "Ta-baa-da-la", "It-ta-kha-dha", "Ib-ta-da-a"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced__words__ii);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_advanced_words_ii);
        adapter = new Advanced_Words_II_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
