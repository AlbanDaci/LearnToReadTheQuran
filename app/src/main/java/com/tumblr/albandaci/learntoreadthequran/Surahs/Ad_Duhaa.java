package com.tumblr.albandaci.learntoreadthequran.Surahs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Al_Fatihah_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Ad_Duhaa extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"93:1", "93:2", "93:3", "93:4", "93:5", "93:6", "93:7", "93:8", "93:9", "93:10", "93:11"};

    String [] arabic_verses = {"وَالضُّحَىٰ",
    "وَاللَّيْلِ إِذَا سَجَىٰ",
    "مَا وَدَّعَكَ رَبُّكَ وَمَا قَلَىٰ",
    "وَلَلْآخِرَةُ خَيْرٌ لَّكَ مِنَ الْأُولَىٰ",
    "وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَىٰ",
    "أَلَمْ يَجِدْكَ يَتِيمًا فَآوَىٰ",
    "وَوَجَدَكَ ضَالًّا فَهَدَىٰ",
    "وَوَجَدَكَ عَائِلًا فَأَغْنَىٰ",
    "فَأَمَّا الْيَتِيمَ فَلَا تَقْهَرْ",
    "وَأَمَّا السَّائِلَ فَلَا تَنْهَرْ",
    "وَأَمَّا بِنِعْمَةِ رَبِّكَ فَحَدِّثْ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International"};

    String [] english_verses = {"By the morning brightness",
    "And [by] the night when it covers with darkness,",
    "Your Lord has not taken leave of you, [O Muhammad], nor has He detested [you].",
    "And the Hereafter is better for you than the first [life].",
    "And your Lord is going to give you, and you will be satisfied.",
    "Did He not find you an orphan and give [you] refuge?",
    "And He found you lost and guided [you],",
    "And He found you poor and made [you] self-sufficient.",
    "So as for the orphan, do not oppress [him].",
    "And as for the petitioner, do not repel [him].",
    "But as for the favor of your Lord, report [it]."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad__duhaa);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ad_duhaa);
        adapter = new Al_Fatihah_Adapter(verses, arabic_verses, sahih_international, english_verses);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
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
