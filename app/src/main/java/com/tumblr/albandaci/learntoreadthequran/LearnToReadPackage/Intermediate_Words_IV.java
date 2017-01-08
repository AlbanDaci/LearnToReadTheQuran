package com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Intermediate_Words_IV_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Intermediate_Words_IV extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"كُتِبَ", "رُزِقَ", "وُزِنَ", "نُزِلَ", "ذُكِرَ", "قُتِلَ", "فُتِحَ"};

    String [] transliteration = {"Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:", "Transliteration:"};

    String [] english_letter = {"Ku-ti-ba", "Ru-zi-qa", "Wu-zi-na", "Nu-zi-la", "Dhu-ki-ra", "Qu-ti-la", "Fu-ti-hha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate__words__iv);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_intermediate_words_iv);
        adapter = new Intermediate_Words_IV_Adapter(arabic_letter, transliteration, english_letter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
