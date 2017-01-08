package com.tumblr.albandaci.learntoreadthequran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Learn_To_Read_Adapter;

public class LearnToRead extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33"};
    String [] alphabet_text = {"Alphabet (Single)", "Alphabet (Initial)", "Alphabet (Middle)", "Alphabet (End)",
            "Short Vowels (I)", "Short Vowels (II)", "Short Vowels (III)", "Short Vowels (IV)",
            "Long Vowels (I)", "Long Vowels (II)", "Long Vowels (III)", "Long Vowels (IV)",
            "Sukuun (I)", "Sukuun (II)", "Sukuun (III)", "Sukuun (IV)",
            "Basic Words (I)", "Basic Words (II)", "Basic Words (III)", "Basic Words (IV)",
            "Intermediate Words (I)", "Intermediate Words (II)", "Intermediate Words (III)", "Intermediate Words (IV)",
            "Advanced Words (I)", "Advanced Words (II)", "Advanced Words (III)", "Advanced Words (IV)",
            "Indefinites (Nominative)", "Indefinites (Accusative)", "Indefinites (Genitive)",
            "Definites", "Definites (Plural)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_to_read);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_learn_to_read);
        adapter = new Learn_To_Read_Adapter(number, alphabet_text);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
