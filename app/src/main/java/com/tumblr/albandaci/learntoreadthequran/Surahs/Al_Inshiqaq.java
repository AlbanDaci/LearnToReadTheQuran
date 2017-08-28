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

public class Al_Inshiqaq extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"84:1", "84:2", "84:3", "84:4", "84:5", "84:6", "84:7", "84:8", "84:9", "84:10", "84:11", "84:12", "84:13", "84:14", "84:15", "84:16",
            "84:17", "84:18", "84:19", "84:20", "84:21", "84:22", "84:23", "84:24", "84:25", ""};

    String [] arabic_verses = {"إِذَا السَّمَاءُ انشَقَّتْ",
    "وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ",
    "وَإِذَا الْأَرْضُ مُدَّتْ",
    "وَأَلْقَتْ مَا فِيهَا وَتَخَلَّتْ",
    "وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ",
    "يَا أَيُّهَا الْإِنسَانُ إِنَّكَ كَادِحٌ إِلَىٰ رَبِّكَ كَدْحًا فَمُلَاقِيهِ",
    "فَأَمَّا مَنْ أُوتِيَ كِتَابَهُ بِيَمِينِهِ",
    "فَسَوْفَ يُحَاسَبُ حِسَابًا يَسِيرًا",
    "وَيَنقَلِبُ إِلَىٰ أَهْلِهِ مَسْرُورًا",
    "وَأَمَّا مَنْ أُوتِيَ كِتَابَهُ وَرَاءَ ظَهْرِهِ",
    "فَسَوْفَ يَدْعُو ثُبُورًا",
    "وَيَصْلَىٰ سَعِيرًا",
    "إِنَّهُ كَانَ فِي أَهْلِهِ مَسْرُورًا",
    "إِنَّهُ ظَنَّ أَن لَّن يَحُورَ",
    "بَلَىٰ إِنَّ رَبَّهُ كَانَ بِهِ بَصِيرًا",
    "فَلَا أُقْسِمُ بِالشَّفَقِ",
    "وَاللَّيْلِ وَمَا وَسَقَ",
    "وَالْقَمَرِ إِذَا اتَّسَقَ",
    "لَتَرْكَبُنَّ طَبَقًا عَن طَبَقٍ",
    "فَمَا لَهُمْ لَا يُؤْمِنُونَ",
    "وَإِذَا قُرِئَ عَلَيْهِمُ الْقُرْآنُ لَا يَسْجُدُونَ ۩",
    "بَلِ الَّذِينَ كَفَرُوا يُكَذِّبُونَ",
    "وَاللَّهُ أَعْلَمُ بِمَا يُوعُونَ",
    "فَبَشِّرْهُم بِعَذَابٍ أَلِيمٍ",
    "إِلَّا الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"When the sky has split [open]",
    "And has responded to its Lord and was obligated [to do so]",
    "And when the earth has been extended",
    "And has cast out that within it and relinquished [it]",
    "And has responded to its Lord and was obligated [to do so] -",
    "O mankind, indeed you are laboring toward your Lord with [great] exertion and will meet it.",
    "Then as for he who is given his record in his right hand,",
    "He will be judged with an easy account",
    "And return to his people in happiness.",
    "But as for he who is given his record behind his back,",
    "He will cry out for destruction",
    "And [enter to] burn in a Blaze.",
    "Indeed, he had [once] been among his people in happiness;",
    "Indeed, he had thought he would never return [to Allah].",
    "But yes! Indeed, his Lord was ever of him, Seeing.",
    "So I swear by the twilight glow",
    "And [by] the night and what it envelops",
    "And [by] the moon when it becomes full",
    "[That] you will surely experience state after state.",
    "So what is [the matter] with them [that] they do not believe,",
    "And when the Qur'an is recited to them, they do not prostrate [to Allah]?",
    "But those who have disbelieved deny,",
    "And Allah is most knowing of what they keep within themselves.",
    "So give them tidings of a painful punishment,",
    "Except for those who believe and do righteous deeds. For them is a reward uninterrupted.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__inshiqaq);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_inshiqaq);
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
