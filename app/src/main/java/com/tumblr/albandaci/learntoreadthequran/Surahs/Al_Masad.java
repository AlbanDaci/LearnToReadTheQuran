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

public class Al_Masad extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"111:1", "111:2", "111:3", "111:4", "111:5"};

    String [] arabic_verses = {"تَبَّتْ يَدَا أَبِي لَهَبٍ وَتَبَّ",
    "مَا أَغْنَىٰ عَنْهُ مَالُهُ وَمَا كَسَبَ",
    "سَيَصْلَىٰ نَارًا ذَاتَ لَهَبٍ",
    "وَامْرَأَتُهُ حَمَّالَةَ الْحَطَبِ",
    "فِي جِيدِهَا حَبْلٌ مِّن مَّسَدٍ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"May the hands of Abu Lahab be ruined, and ruined is he.",
    "His wealth will not avail him or that which he gained.",
    "He will [enter to] burn in a Fire of [blazing] flame",
    "And his wife [as well] - the carrier of firewood.",
    "Around her neck is a rope of [twisted] fiber."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__masad);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_masad);
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
