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

public class At_Tariq extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"86:1", "86:2", "86:3", "86:4", "86:5", "86:6", "86:7", "86:8", "86:9", "86:10", "86:11", "86:12", "86:13", "86:14", "86:15", "86:16",
            "86:17", ""};

    String [] arabic_verses = {"وَالسَّمَاءِ وَالطَّارِقِ",
    "وَمَا أَدْرَاكَ مَا الطَّارِقُ",
    "النَّجْمُ الثَّاقِبُ",
    "إِن كُلُّ نَفْسٍ لَّمَّا عَلَيْهَا حَافِظٌ",
    "فَلْيَنظُرِ الْإِنسَانُ مِمَّ خُلِقَ",
    "خُلِقَ مِن مَّاءٍ دَافِقٍ",
    "يَخْرُجُ مِن بَيْنِ الصُّلْبِ وَالتَّرَائِبِ",
    "إِنَّهُ عَلَىٰ رَجْعِهِ لَقَادِرٌ",
    "يَوْمَ تُبْلَى السَّرَائِرُ",
    "فَمَا لَهُ مِن قُوَّةٍ وَلَا نَاصِرٍ",
    "وَالسَّمَاءِ ذَاتِ الرَّجْعِ",
    "وَالْأَرْضِ ذَاتِ الصَّدْعِ",
    "إِنَّهُ لَقَوْلٌ فَصْلٌ",
    "وَمَا هُوَ بِالْهَزْلِ",
    "إِنَّهُمْ يَكِيدُونَ كَيْدًا",
    "وَأَكِيدُ كَيْدًا",
    "فَمَهِّلِ الْكَافِرِينَ أَمْهِلْهُمْ رُوَيْدًا",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"By the sky and the night comer -",
    "And what can make you know what is the night comer?",
    "It is the piercing star -",
    "There is no soul but that it has over it a protector.",
    "So let man observe from what he was created.",
    "He was created from a fluid, ejected,",
    "Emerging from between the backbone and the ribs.",
    "Indeed, Allah, to return him [to life], is Able.",
    "The Day when secrets will be put on trial,",
    "Then man will have no power or any helper.",
    "By the sky which returns [rain]",
    "And [by] the earth which cracks open,",
    "Indeed, the Qur'an is a decisive statement,",
    "And it is not amusement.",
    "Indeed, they are planning a plan,",
    "But I am planning a plan.",
    "So allow time for the disbelievers. Leave them awhile.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at__tariq);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_at_tariq);
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
