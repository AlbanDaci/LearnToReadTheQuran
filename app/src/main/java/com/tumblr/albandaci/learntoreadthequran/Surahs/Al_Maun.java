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

public class Al_Maun extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"107:1", "107:2", "107:3", "107:4", "107:5", "107:6", "107:7", ""};

    String [] arabic_verses = {"أَرَأَيْتَ الَّذِي يُكَذِّبُ بِالدِّينِ",
    "فَذَٰلِكَ الَّذِي يَدُعُّ الْيَتِيمَ",
    "وَلَا يَحُضُّ عَلَىٰ طَعَامِ الْمِسْكِينِ",
    "فَوَيْلٌ لِّلْمُصَلِّينَ",
    "الَّذِينَ هُمْ عَن صَلَاتِهِمْ سَاهُونَ",
    "الَّذِينَ هُمْ يُرَاءُونَ",
    "وَيَمْنَعُونَ الْمَاعُونَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Have you seen the one who denies the Recompense?",
    "For that is the one who drives away the orphan",
    "And does not encourage the feeding of the poor.",
    "So woe to those who pray",
    "[But] who are heedless of their prayer -",
    "Those who make show [of their deeds]",
    "And withhold [simple] assistance.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__maun);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_maun);
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
