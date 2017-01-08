package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Intermediate_Words_II_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Intermediate_Words_II extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"أَكَّلَ", "أَدَّى", "تَمَّ", "دلَّ", "سَدَّ", "شَكَّ", "ظَنَّ", "وَدَّ", "بَلَّغَ"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:"};

    String [] english_letter = {"Ak-ka-la", "Ad-daa", "Tam-ma", "Dal-la", "Sad-da", "Shak-ka", "Zhan-na", "Wad-da", "Bal-la-gha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate__words__ii);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_intermediate_words_ii);
        adapter = new Intermediate_Words_II_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
