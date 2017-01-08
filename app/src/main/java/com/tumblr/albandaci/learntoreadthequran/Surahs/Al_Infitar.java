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

public class Al_Infitar extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"82:1", "82:2", "82:3", "82:4", "82:5", "82:6", "82:7", "82:8", "82:9", "82:10", "82:11", "82:12", "82:13", "82:14", "82:15", "82:16",
            "82:17", "82:18", "82:19"};

    String [] arabic_verses = {"إِذَا السَّمَاءُ انفَطَرَتْ",
    "وَإِذَا الْكَوَاكِبُ انتَثَرَتْ",
    "وَإِذَا الْبِحَارُ فُجِّرَتْ",
    "وَإِذَا الْقُبُورُ بُعْثِرَتْ",
    "عَلِمَتْ نَفْسٌ مَّا قَدَّمَتْ وَأَخَّرَتْ",
    "يَا أَيُّهَا الْإِنسَانُ مَا غَرَّكَ بِرَبِّكَ الْكَرِيمِ",
    "الَّذِي خَلَقَكَ فَسَوَّاكَ فَعَدَلَكَ",
    "فِي أَيِّ صُورَةٍ مَّا شَاءَ رَكَّبَكَ",
    "كَلَّا بَلْ تُكَذِّبُونَ بِالدِّينِ",
    "وَإِنَّ عَلَيْكُمْ لَحَافِظِينَ",
    "كِرَامًا كَاتِبِينَ",
    "يَعْلَمُونَ مَا تَفْعَلُونَ",
    "إِنَّ الْأَبْرَارَ لَفِي نَعِيمٍ",
    "وَإِنَّ الْفُجَّارَ لَفِي جَحِيمٍ",
    "يَصْلَوْنَهَا يَوْمَ الدِّينِ",
    "وَمَا هُمْ عَنْهَا بِغَائِبِينَ",
    "وَمَا أَدْرَاكَ مَا يَوْمُ الدِّينِ",
    "ثُمَّ مَا أَدْرَاكَ مَا يَوْمُ الدِّينِ",
    "يَوْمَ لَا تَمْلِكُ نَفْسٌ لِّنَفْسٍ شَيْئًا ۖ وَالْأَمْرُ يَوْمَئِذٍ لِّلَّهِ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"When the sky breaks apart",
    "And when the stars fall, scattering,",
    "And when the seas are erupted",
    "And when the [contents of] graves are scattered,",
    "A soul will [then] know what it has put forth and kept back.",
    "O mankind, what has deceived you concerning your Lord, the Generous,",
    "Who created you, proportioned you, and balanced you?",
    "In whatever form He willed has He assembled you.",
    "No! But you deny the Recompense.",
    "And indeed, [appointed] over you are keepers,",
    "Noble and recording;",
    "They know whatever you do.",
    "Indeed, the righteous will be in pleasure,",
    "And indeed, the wicked will be in Hellfire.",
    "They will [enter to] burn therein on the Day of Recompense,",
    "And never therefrom will they be absent.",
    "And what can make you know what is the Day of Recompense?",
    "Then, what can make you know what is the Day of Recompense?",
    "It is the Day when a soul will not possess for another soul [power to do] a thing; and the command, that Day, is [entirely] with Allah."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__infitar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_infitar);
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
