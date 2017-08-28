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

public class Ash_Shams extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"91:1", "91:2", "91:3", "91:4", "91:5", "91:6", "91:7", "91:8", "91:9", "91:10", "91:11", "91:12", "91:13", "91:14", "91:15", ""};

    String [] arabic_verses = {"وَالشَّمْسِ وَضُحَاهَا",
    "وَالْقَمَرِ إِذَا تَلَاهَا",
    "وَالنَّهَارِ إِذَا جَلَّاهَا",
    "وَاللَّيْلِ إِذَا يَغْشَاهَا",
    "وَالسَّمَاءِ وَمَا بَنَاهَا",
    "وَالْأَرْضِ وَمَا طَحَاهَا",
    "وَنَفْسٍ وَمَا سَوَّاهَا",
    "فَأَلْهَمَهَا فُجُورَهَا وَتَقْوَاهَا",
    "قَدْ أَفْلَحَ مَن زَكَّاهَا",
    "وَقَدْ خَابَ مَن دَسَّاهَا",
    "كَذَّبَتْ ثَمُودُ بِطَغْوَاهَا",
    "إِذِ انبَعَثَ أَشْقَاهَا",
    "فَقَالَ لَهُمْ رَسُولُ اللَّهِ نَاقَةَ اللَّهِ وَسُقْيَاهَا",
    "فَكَذَّبُوهُ فَعَقَرُوهَا فَدَمْدَمَ عَلَيْهِمْ رَبُّهُم بِذَنبِهِمْ فَسَوَّاهَا",
    "وَلَا يَخَافُ عُقْبَاهَا",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"By the sun and its brightness",
    "And [by] the moon when it follows it",
    "And [by] the day when it displays it",
    "And [by] the night when it covers it",
    "And [by] the sky and He who constructed it",
    "And [by] the earth and He who spread it",
    "And [by] the soul and He who proportioned it",
    "And inspired it [with discernment of] its wickedness and its righteousness,",
    "He has succeeded who purifies it,",
    "And he has failed who instills it [with corruption].",
    "Thamud denied [their prophet] by reason of their transgression,",
    "When the most wretched of them was sent forth.",
    "And the messenger of Allah [Salih] said to them, \"[Do not harm] the she-camel of Allah or [prevent her from] her drink.\"",
    "But they denied him and hamstrung her. So their Lord brought down upon them destruction for their sin and made it equal [upon all of them].",
    "And He does not fear the consequence thereof.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ash__shams);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ash_shams);
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
