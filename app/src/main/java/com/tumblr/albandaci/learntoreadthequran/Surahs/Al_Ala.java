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

public class Al_Ala extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"87:1", "87:2", "87:3", "87:4", "87:5", "87:6", "87:7", "87:8", "87:9", "87:10", "87:11", "87:12", "87:13", "87:14", "87:15", "87:16",
            "87:17", "87:18", "87:19", ""};

    String [] arabic_verses = {"سَبِّحِ اسْمَ رَبِّكَ الْأَعْلَى",
    "الَّذِي خَلَقَ فَسَوَّىٰ",
    "وَالَّذِي قَدَّرَ فَهَدَىٰ",
    "وَالَّذِي أَخْرَجَ الْمَرْعَىٰ",
    "فَجَعَلَهُ غُثَاءً أَحْوَىٰ",
    "سَنُقْرِئُكَ فَلَا تَنسَىٰ",
    "إِلَّا مَا شَاءَ اللَّهُ ۚ إِنَّهُ يَعْلَمُ الْجَهْرَ وَمَا يَخْفَىٰ",
    "وَنُيَسِّرُكَ لِلْيُسْرَىٰ",
    "فَذَكِّرْ إِن نَّفَعَتِ الذِّكْرَىٰ",
    "سَيَذَّكَّرُ مَن يَخْشَىٰ",
    "وَيَتَجَنَّبُهَا الْأَشْقَى",
    "الَّذِي يَصْلَى النَّارَ الْكُبْرَىٰ",
    "ثُمَّ لَا يَمُوتُ فِيهَا وَلَا يَحْيَىٰ",
    "قَدْ أَفْلَحَ مَن تَزَكَّىٰ",
    "وَذَكَرَ اسْمَ رَبِّهِ فَصَلَّىٰ",
    "بَلْ تُؤْثِرُونَ الْحَيَاةَ الدُّنْيَا",
    "وَالْآخِرَةُ خَيْرٌ وَأَبْقَىٰ",
    "إِنَّ هَٰذَا لَفِي الصُّحُفِ الْأُولَىٰ",
    "صُحُفِ إِبْرَاهِيمَ وَمُوسَىٰ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Exalt the name of your Lord, the Most High,",
    "Who created and proportioned",
    "And Who destined and [then] guided",
    "And who brings out the pasture",
    "And [then] makes it black stubble.",
    "We will make you recite, [O Muhammad], and you will not forget,",
    "Except what Allah should will. Indeed, He knows what is declared and what is hidden.",
    "And We will ease you toward ease.",
    "So remind, if the reminder should benefit;",
    "He who fears [Allah] will be reminded.",
    "But the wretched one will avoid it -",
    "[He] who will [enter and] burn in the greatest Fire,",
    "Neither dying therein nor living.",
    "He has certainly succeeded who purifies himself",
    "And mentions the name of his Lord and prays.",
    "But you prefer the worldly life,",
    "While the Hereafter is better and more enduring.",
    "Indeed, this is in the former scriptures,",
    "The scriptures of Abraham and Moses.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__ala);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_ala);
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
