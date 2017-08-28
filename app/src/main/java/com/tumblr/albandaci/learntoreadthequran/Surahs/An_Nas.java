package com.tumblr.albandaci.learntoreadthequran.Surahs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Al_Fatihah_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class An_Nas extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"114:1", "114:2", "114:3", "114:4", "114:5", "114:6", ""};

    String [] arabic_verses = {"قُلْ أَعُوذُ بِرَبِّ النَّاسِ",
    "مَلِكِ النَّاسِ",
    "إِلَٰهِ النَّاسِ",
    "مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ",
    "الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ",
    "مِنَ الْجِنَّةِ وَالنَّاسِ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Say, \"I seek refuge in the Lord of mankind,",
    "The Sovereign of mankind.",
    "The God of mankind,",
    "From the evil of the retreating whisperer -",
    "Who whispers [evil] into the breasts of mankind -",
    "From among the jinn and mankind.\"",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an__nas);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_an_nas);
        adapter = new Al_Fatihah_Adapter(verses, arabic_verses, sahih_international, english_verses);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.play_arrow_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(getApplicationContext(), "You need to download the premium version of this app: \"Learn To Read The Quran Premium\" to listen to the audio", Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}
