package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Alphabet_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Alphabet_Initial extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"ا", "بــ", "تــ", "ثــ", "جــ", "حــ", "خــ",
            "د", "ذ", "ر", "ز", "ســ", "شــ", "صــ",
            "ضــ", "طــ", "ظــ", "عــ", "غــ", "فــ", "قــ",
            "كــ", "لــ", "مــ", "نــ", "هــ", "و", "لا",
            "يــ"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:",
            "Transliteration"};

    String [] english_letter = {"Alif (Single & Initial)", "Baa' (Initial)", "Taa' (Initial)", "Thaa' (Initial)", "Jeem (Initial)", "Hhaa' (Initial)", "Khaa' (Initial)",
            "Daal (Single & Initial)", "Dhaal (Single & Initial)", "Raa' (Single & Initial)", "Zaay (Single & Initial)", "Seen (Initial)", "Sheen (Initial)", "Ssaad (Initial)",
            "Ddaad (Initial)", "Ttaa' (Initial)", "Zhaa' (Initial)", "'Ain (Initial)", "Ghayn (Initial)", "Faa' (Initial)", "Qaaf (Initial)",
            "Kaaf (Initial)", "Laam (Initial)", "Meem (Initial)", "Noon (Initial)", "Haa' (Initial)", "Waaw (Single & Initial)", "Laamalif (Single & Initial)",
            "Yaa' (Initial)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet__initial);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_alphabet_initial);
        adapter = new Alphabet_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
