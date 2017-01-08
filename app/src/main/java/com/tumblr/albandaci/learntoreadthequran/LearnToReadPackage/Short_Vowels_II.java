package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Short_Vowels_II_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Short_Vowels_II extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"دَ", "دِ", "دُ", "ذَ", "ذِ", "ذُ", "رَ", "رِ", "رُ", "زَ", "زِ", "زُ", "سَــ", "سِــ", "سُــ", "شَــ", "شِــ", "شُــ", "صَــ", "صِــ", "صُــ"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration"};

    String [] english_letter = {"Da", "Di", "Du", "Dha", "Dhi", "Dhu", "Ra", "Ri", "Ru", "Za", "Zi", "Zu", "Sa", "Si", "Su", "Sha", "Shi", "Shu", "Ssa", "Ssi", "Ssu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short__vowels__ii);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_short_vowels_ii);
        adapter = new Short_Vowels_II_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
