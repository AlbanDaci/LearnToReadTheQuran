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

public class Al_Layl extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"92:1", "92:2", "92:3", "92:4", "92:5", "92:6", "92:7", "92:8", "92:9", "92:10", "92:11", "92:12", "92:13", "92:14", "92:15", "92:16",
            "92:17", "92:18", "92:19", "92:20", "92:21", ""};

    String [] arabic_verses = {"وَاللَّيْلِ إِذَا يَغْشَىٰ",
    "وَالنَّهَارِ إِذَا تَجَلَّىٰ",
    "وَمَا خَلَقَ الذَّكَرَ وَالْأُنثَىٰ",
    "إِنَّ سَعْيَكُمْ لَشَتَّىٰ",
    "فَأَمَّا مَنْ أَعْطَىٰ وَاتَّقَىٰ",
    "وَصَدَّقَ بِالْحُسْنَىٰ",
    "فَسَنُيَسِّرُهُ لِلْيُسْرَىٰ",
    "وَأَمَّا مَن بَخِلَ وَاسْتَغْنَىٰ",
    "وَكَذَّبَ بِالْحُسْنَىٰ",
    "فَسَنُيَسِّرُهُ لِلْعُسْرَىٰ",
    "وَمَا يُغْنِي عَنْهُ مَالُهُ إِذَا تَرَدَّىٰ",
    "إِنَّ عَلَيْنَا لَلْهُدَىٰ",
    "وَإِنَّ لَنَا لَلْآخِرَةَ وَالْأُولَىٰ",
    "فَأَنذَرْتُكُمْ نَارًا تَلَظَّىٰ",
    "لَا يَصْلَاهَا إِلَّا الْأَشْقَى",
    "الَّذِي كَذَّبَ وَتَوَلَّىٰ",
    "وَسَيُجَنَّبُهَا الْأَتْقَى",
    "الَّذِي يُؤْتِي مَالَهُ يَتَزَكَّىٰ",
    "وَمَا لِأَحَدٍ عِندَهُ مِن نِّعْمَةٍ تُجْزَىٰ",
    "إِلَّا ابْتِغَاءَ وَجْهِ رَبِّهِ الْأَعْلَىٰ",
    "وَلَسَوْفَ يَرْضَىٰ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", ""};

    String [] english_verses = {"By the night when it covers",
    "And [by] the day when it appears",
    "And [by] He who created the male and female,",
    "Indeed, your efforts are diverse.",
    "As for he who gives and fears Allah",
    "And believes in the best [reward],",
    "We will ease him toward ease.",
    "But as for he who withholds and considers himself free of need",
    "And denies the best [reward],",
    "We will ease him toward difficulty.",
    "And what will his wealth avail him when he falls?",
    "Indeed, [incumbent] upon Us is guidance.",
    "And indeed, to Us belongs the Hereafter and the first [life].",
    "So I have warned you of a Fire which is blazing.",
    "None will [enter to] burn therein except the most wretched one.",
    "Who had denied and turned away.",
    "But the righteous one will avoid it -",
    "[He] who gives [from] his wealth to purify himself",
    "And not [giving] for anyone who has [done him] a favor to be rewarded",
    "But only seeking the countenance of his Lord, Most High.",
    "And he is going to be satisfied.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__layl);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_layl);
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
