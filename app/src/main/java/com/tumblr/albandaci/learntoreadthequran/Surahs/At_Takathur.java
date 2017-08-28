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

public class At_Takathur extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"102:1", "102:2", "102:3", "102:4", "102:5", "102:6", "102:7", "102:8", ""};

    String [] arabic_verses = {"أَلْهَاكُمُ التَّكَاثُرُ",
    "حَتَّىٰ زُرْتُمُ الْمَقَابِرَ",
    "كَلَّا سَوْفَ تَعْلَمُونَ",
    "ثُمَّ كَلَّا سَوْفَ تَعْلَمُونَ",
    "كَلَّا لَوْ تَعْلَمُونَ عِلْمَ الْيَقِينِ",
    "لَتَرَوُنَّ الْجَحِيمَ",
    "ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِينِ",
    "ثُمَّ لَتُسْأَلُنَّ يَوْمَئِذٍ عَنِ النَّعِيمِ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Competition in [worldly] increase diverts you",
    "Until you visit the graveyards.",
    "No! You are going to know.",
    "Then no! You are going to know.",
    "No! If you only knew with knowledge of certainty...",
    "You will surely see the Hellfire.",
    "Then you will surely see it with the eye of certainty.",
    "Then you will surely be asked that Day about pleasure.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at__takathur);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_at_takathur);
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
