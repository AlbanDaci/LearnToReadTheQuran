package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Advanced_Words_IV_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Advanced_Words_IV extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"يَبْلُغُ", "تَبْدَأُ", "تَتْرُكُ", "يَجْلِسُ", "تَجْتَهِدُ", "يَتِمُّ", "يَفُوزُ", "اِقْرَأْ"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:"};

    String [] english_letter = {"Yab-lu-ghu", "Tab-da-u", "Tat-ru-ku", "Yaj-li-su", "Taj-ta-hi-du", "Ya-tim-mu", "Ya-fuu-zu", "Iq-ra'"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced__words__iv);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_advanced_words_iv);
        adapter = new Advanced_Words_IV_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
