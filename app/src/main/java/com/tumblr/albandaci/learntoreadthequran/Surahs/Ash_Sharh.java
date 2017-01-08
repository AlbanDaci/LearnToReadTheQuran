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

public class Ash_Sharh extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"94:1", "94:2", "94:3", "94:4", "94:5", "94:6", "94:7", "94:8"};

    String [] arabic_verses = {"أَلَمْ نَشْرَحْ لَكَ صَدْرَكَ",
    "وَوَضَعْنَا عَنكَ وِزْرَكَ",
    "الَّذِي أَنقَضَ ظَهْرَكَ",
    "وَرَفَعْنَا لَكَ ذِكْرَكَ",
    "فَإِنَّ مَعَ الْعُسْرِ يُسْرًا",
    "إِنَّ مَعَ الْعُسْرِ يُسْرًا",
    "فَإِذَا فَرَغْتَ فَانصَبْ",
    "وَإِلَىٰ رَبِّكَ فَارْغَب"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"Did We not expand for you, [O Muhammad], your breast?",
    "And We removed from you your burden",
    "Which had weighed upon your back",
    "And raised high for you your repute.",
    "For indeed, with hardship [will be] ease.",
    "Indeed, with hardship [will be] ease.",
    "So when you have finished [your duties], then stand up [for worship].",
    "And to your Lord direct [your] longing."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ash__sharh);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ash_sharh);
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
