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

public class Al_Balad extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"90:1", "90:2", "90:3", "90:4", "90:5", "90:6", "90:7", "90:8", "90:9", "90:10", "90:11", "90:12", "90:13", "90:14", "90:15", "90:16",
            "90:17", "90:18", "90:19", "90:20"};

    String [] arabic_verses = {"لَا أُقْسِمُ بِهَٰذَا الْبَلَدِ",
    "وَأَنتَ حِلٌّ بِهَٰذَا الْبَلَدِ",
    "وَوَالِدٍ وَمَا وَلَدَ",
    "لَقَدْ خَلَقْنَا الْإِنسَانَ فِي كَبَدٍ",
    "أَيَحْسَبُ أَن لَّن يَقْدِرَ عَلَيْهِ أَحَدٌ",
    "يَقُولُ أَهْلَكْتُ مَالًا لُّبَدًا",
    "أَيَحْسَبُ أَن لَّمْ يَرَهُ أَحَدٌ",
    "أَلَمْ نَجْعَل لَّهُ عَيْنَيْنِ",
    "وَلِسَانًا وَشَفَتَيْنِ",
    "وَهَدَيْنَاهُ النَّجْدَيْنِ",
    "فَلَا اقْتَحَمَ الْعَقَبَةَ",
    "وَمَا أَدْرَاكَ مَا الْعَقَبَةُ",
    "فَكُّ رَقَبَةٍ",
    "أَوْ إِطْعَامٌ فِي يَوْمٍ ذِي مَسْغَبَةٍ",
    "يَتِيمًا ذَا مَقْرَبَةٍ",
    "أَوْ مِسْكِينًا ذَا مَتْرَبَةٍ",
    "ثُمَّ كَانَ مِنَ الَّذِينَ آمَنُوا وَتَوَاصَوْا بِالصَّبْرِ وَتَوَاصَوْا بِالْمَرْحَمَةِ",
    "أُولَٰئِكَ أَصْحَابُ الْمَيْمَنَةِ",
    "وَالَّذِينَ كَفَرُوا بِآيَاتِنَا هُمْ أَصْحَابُ الْمَشْأَمَةِ",
    "عَلَيْهِمْ نَارٌ مُّؤْصَدَةٌ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"I swear by this city, Makkah -",
    "And you, [O Muhammad], are free of restriction in this city -",
    "And [by] the father and that which was born [of him],",
    "We have certainly created man into hardship.",
    "Does he think that never will anyone overcome him?",
    "He says, \"I have spent wealth in abundance.\"",
    "Does he think that no one has seen him?",
    "Have We not made for him two eyes?",
    "And a tongue and two lips?",
    "And have shown him the two ways?",
    "But he has not broken through the difficult pass.",
    "And what can make you know what is [breaking through] the difficult pass?",
    "It is the freeing of a slave",
    "Or feeding on a day of severe hunger",
    "An orphan of near relationship",
    "Or a needy person in misery",
    "And then being among those who believed and advised one another to patience and advised one another to compassion.",
    "Those are the companions of the right.",
    "But they who disbelieved in Our signs - those are the companions of the left.",
    "Over them will be fire closed in."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__balad);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_balad);
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
