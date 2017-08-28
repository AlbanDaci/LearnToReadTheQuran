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

public class Al_Adiyat extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"100:1", "100:2", "100:3", "100:4", "100:5", "100:6", "100:7", "100:8", "100:9", "100:10", "100:11", ""};

    String [] arabic_verses = {"وَالْعَادِيَاتِ ضَبْحًا",
    "فَالْمُورِيَاتِ قَدْحًا",
    "فَالْمُغِيرَاتِ صُبْحًا",
    "فَأَثَرْنَ بِهِ نَقْعًا",
    "فَوَسَطْنَ بِهِ جَمْعًا",
    "إِنَّ الْإِنسَانَ لِرَبِّهِ لَكَنُودٌ",
    "وَإِنَّهُ عَلَىٰ ذَٰلِكَ لَشَهِيدٌ",
    "وَإِنَّهُ لِحُبِّ الْخَيْرِ لَشَدِيدٌ",
    "أَفَلَا يَعْلَمُ إِذَا بُعْثِرَ مَا فِي الْقُبُورِ",
    "وَحُصِّلَ مَا فِي الصُّدُورِ",
    "إِنَّ رَبَّهُم بِهِمْ يَوْمَئِذٍ لَّخَبِيرٌ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", ""};

    String [] english_verses = {"By the racers, panting,",
    "And the producers of sparks [when] striking",
    "And the chargers at dawn,",
    "Stirring up thereby [clouds of] dust,",
    "Arriving thereby in the center collectively,",
    "Indeed mankind, to his Lord, is ungrateful.",
    "And indeed, he is to that a witness.",
    "And indeed he is, in love of wealth, intense.",
    "But does he not know that when the contents of the graves are scattered",
    "And that within the breasts is obtained,",
    "Indeed, their Lord with them, that Day, is [fully] Acquainted.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__adiyat);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_adiyat);
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
