package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Alphabet_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Alphabet_Single extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"ا", "ب", "ت", "ث", "ج", "ح", "خ",
    "د", "ذ", "ر", "ز", "س", "ش", "ص",
    "ض", "ط", "ظ", "ع", "غ", "ف", "ق",
    "ك", "ل", "م", "ن", "ه", "و", "لا",
    "ي"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration"};

    String [] english_letter = {"Alif (Single & Initial)", "Baa' (Single)", "Taa' (Single)", "Thaa' (Single)", "Jeem (Single)", "Hhaa' (Single)", "Khaa' (Single)",
    "Daal (Single & Initial)", "Dhaal (Single & Initial)", "Raa' (Single & Initial)", "Zaay (Single & Initial)", "Seen (Single)", "Sheen (Single)", "Ssaad (Single)",
    "Ddaad (Single)", "Ttaa' (Single)", "Zhaa' (Single)", "'Ain (Single)", "Ghayn (Single)", "Faa' (Single)", "Qaaf (Single)",
    "Kaaf (Single)", "Laam (Single)", "Meem (Single)", "Noon (Single)", "Haa' (Single)", "Waaw (Single & Initial)", "Laamalif (Single & Initial)",
    "Yaa' (Single)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet__single);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_alphabet_single);
        adapter = new Alphabet_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
