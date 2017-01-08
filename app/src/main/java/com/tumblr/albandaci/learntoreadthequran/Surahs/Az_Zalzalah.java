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

public class Az_Zalzalah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"99:1", "99:2", "99:3", "99:4", "99:5", "99:6", "99:7", "99:8"};

    String [] arabic_verses = {"إِذَا زُلْزِلَتِ الْأَرْضُ زِلْزَالَهَا",
    "وَأَخْرَجَتِ الْأَرْضُ أَثْقَالَهَا",
    "وَقَالَ الْإِنسَانُ مَا لَهَا",
    "يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا",
    "بِأَنَّ رَبَّكَ أَوْحَىٰ لَهَا",
    "يَوْمَئِذٍ يَصْدُرُ النَّاسُ أَشْتَاتًا لِّيُرَوْا أَعْمَالَهُمْ",
    "فَمَن يَعْمَلْ مِثْقَالَ ذَرَّةٍ خَيْرًا يَرَهُ",
    "وَمَن يَعْمَلْ مِثْقَالَ ذَرَّةٍ شَرًّا يَرَهُ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"When the earth is shaken with its [final] earthquake",
    "And the earth discharges its burdens",
    "And man says, \"What is [wrong] with it?\" -",
    "That Day, it will report its news",
    "Because your Lord has commanded it.",
    "That Day, the people will depart separated [into categories] to be shown [the result of] their deeds.",
    "So whoever does an atom's weight of good will see it,",
    "And whoever does an atom's weight of evil will see it."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az__zalzalah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_az_zalzalah);
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
