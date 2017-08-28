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

public class Al_Ghashiyah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"88:1", "88:2", "88:3", "88:4", "88:5", "88:6", "88:7", "88:8", "88:9", "88:10", "88:11", "88:12", "88:13", "88:14", "88:15", "88:16",
            "88:17", "88:18", "88:19", "88:20", "88:21", "88:22", "88:23", "88:24", "88:25", "88:26", ""};

    String [] arabic_verses = {"هَلْ أَتَاكَ حَدِيثُ الْغَاشِيَةِ",
    "وُجُوهٌ يَوْمَئِذٍ خَاشِعَةٌ",
    "عَامِلَةٌ نَّاصِبَةٌ",
    "تَصْلَىٰ نَارًا حَامِيَةً",
    "تُسْقَىٰ مِنْ عَيْنٍ آنِيَةٍ",
    "لَّيْسَ لَهُمْ طَعَامٌ إِلَّا مِن ضَرِيعٍ",
    "لَّا يُسْمِنُ وَلَا يُغْنِي مِن جُوعٍ",
    "وُجُوهٌ يَوْمَئِذٍ نَّاعِمَةٌ",
    "لِّسَعْيِهَا رَاضِيَةٌ",
    "فِي جَنَّةٍ عَالِيَةٍ",
    "لَّا تَسْمَعُ فِيهَا لَاغِيَةً",
    "فِيهَا عَيْنٌ جَارِيَةٌ",
    "فِيهَا سُرُرٌ مَّرْفُوعَةٌ",
    "وَأَكْوَابٌ مَّوْضُوعَةٌ",
    "وَنَمَارِقُ مَصْفُوفَةٌ",
    "وَزَرَابِيُّ مَبْثُوثَةٌ",
    "أَفَلَا يَنظُرُونَ إِلَى الْإِبِلِ كَيْفَ خُلِقَتْ",
    "وَإِلَى السَّمَاءِ كَيْفَ رُفِعَتْ",
    "وَإِلَى الْجِبَالِ كَيْفَ نُصِبَتْ",
    "وَإِلَى الْأَرْضِ كَيْفَ سُطِحَتْ",
    "فَذَكِّرْ إِنَّمَا أَنتَ مُذَكِّرٌ",
    "لَّسْتَ عَلَيْهِم بِمُصَيْطِرٍ",
    "إِلَّا مَن تَوَلَّىٰ وَكَفَرَ",
    "فَيُعَذِّبُهُ اللَّهُ الْعَذَابَ الْأَكْبَرَ",
    "إِنَّ إِلَيْنَا إِيَابَهُمْ",
    "ثُمَّ إِنَّ عَلَيْنَا حِسَابَهُم",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Has there reached you the report of the Overwhelming [event]?",
    "[Some] faces, that Day, will be humbled,",
    "Working [hard] and exhausted.",
    "They will [enter to] burn in an intensely hot Fire.",
    "They will be given drink from a boiling spring.",
    "For them there will be no food except from a poisonous, thorny plant",
    "Which neither nourishes nor avails against hunger.",
    "[Other] faces, that Day, will show pleasure.",
    "With their effort [they are] satisfied",
    "In an elevated garden,",
    "Wherein they will hear no unsuitable speech.",
    "Within it is a flowing spring.",
    "Within it are couches raised high",
    "And cups put in place",
    "And cushions lined up",
    "And carpets spread around.",
    "Then do they not look at the camels - how they are created?",
    "And at the sky - how it is raised?",
    "And at the mountains - how they are erected?",
    "And at the earth - how it is spread out?",
    "So remind, [O Muhammad]; you are only a reminder.",
    "You are not over them a controller.",
    "However, he who turns away and disbelieves -",
    "Then Allah will punish him with the greatest punishment.",
    "Indeed, to Us is their return.",
    "Then indeed, upon Us is their account.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__ghashiyah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_ghashiyah);
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
