package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Long_Vowels_II_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Long_Vowels_II extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"دَا", "دِي", "دُو", "ذَا", "ذِي", "ذُو", "رَا", "رِي", "رُو", "زَا", "زِي", "زُو", "سَا", "سِي", "سُو", "شَا", "شِي", "شُو", "صَا", "صِي", "صُو"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration"};

    String [] english_letter = {"Daa", "Dii", "Duu", "Dhaa", "Dhii", "Dhuu", "Raa", "Rii", "Ruu", "Zaa", "Zii", "Zuu", "Saa", "Sii", "Suu", "Shaa", "Shii", "Shuu", "Ssaa", "Ssii", "Ssuu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long__vowels__ii);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_long_vowels_ii);
        adapter = new Long_Vowels_II_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
