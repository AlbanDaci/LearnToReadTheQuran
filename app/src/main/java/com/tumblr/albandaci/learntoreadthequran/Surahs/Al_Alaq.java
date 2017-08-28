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

public class Al_Alaq extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"96:1", "96:2", "96:3", "96:4", "96:5", "96:6", "96:7", "96:8", "96:9", "96:10", "96:11", "96:12", "96:13", "96:14", "96:15", "96:16",
            "96:17", "96:18", "96:19", ""};

    String [] arabic_verses = {"اقْرَأْ بِاسْمِ رَبِّكَ الَّذِي خَلَقَ",
    "خَلَقَ الْإِنسَانَ مِنْ عَلَقٍ",
    "اقْرَأْ وَرَبُّكَ الْأَكْرَمُ",
    "الَّذِي عَلَّمَ بِالْقَلَمِ",
    "عَلَّمَ الْإِنسَانَ مَا لَمْ يَعْلَمْ",
    "كَلَّا إِنَّ الْإِنسَانَ لَيَطْغَىٰ",
    "أَن رَّآهُ اسْتَغْنَىٰ",
    "إِنَّ إِلَىٰ رَبِّكَ الرُّجْعَىٰ",
    "أَرَأَيْتَ الَّذِي يَنْهَىٰ",
    "عَبْدًا إِذَا صَلَّىٰ",
    "أَرَأَيْتَ إِن كَانَ عَلَى الْهُدَىٰ",
    "أَوْ أَمَرَ بِالتَّقْوَىٰ",
    "أَرَأَيْتَ إِن كَذَّبَ وَتَوَلَّىٰ",
    "أَلَمْ يَعْلَم بِأَنَّ اللَّهَ يَرَىٰ",
    "كَلَّا لَئِن لَّمْ يَنتَهِ لَنَسْفَعًا بِالنَّاصِيَةِ",
    "نَاصِيَةٍ كَاذِبَةٍ خَاطِئَةٍ",
    "فَلْيَدْعُ نَادِيَهُ",
    "سَنَدْعُ الزَّبَانِيَةَ",
    "كَلَّا لَا تُطِعْهُ وَاسْجُدْ وَاقْتَرِب ۩",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Recite in the name of your Lord who created -",
    "Created man from a clinging substance.",
    "Recite, and your Lord is the most Generous -",
    "Who taught by the pen -",
    "Taught man that which he knew not.",
    "No! [But] indeed, man transgresses",
    "Because he sees himself self-sufficient.",
    "Indeed, to your Lord is the return.",
    "Have you seen the one who forbids",
    "A servant when he prays?",
    "Have you seen if he is upon guidance",
    "Or enjoins righteousness?",
    "Have you seen if he denies and turns away -",
    "Does he not know that Allah sees?",
    "No! If he does not desist, We will surely drag him by the forelock -",
    "A lying, sinning forelock.",
    "Then let him call his associates;",
    "We will call the angels of Hell.",
    "No! Do not obey him. But prostrate and draw near [to Allah].",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__alaq);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_alaq);
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
