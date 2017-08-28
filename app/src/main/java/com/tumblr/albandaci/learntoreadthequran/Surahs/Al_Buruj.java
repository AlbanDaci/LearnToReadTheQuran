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

public class Al_Buruj extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"85:1", "85:2", "85:3", "85:4", "85:5", "85:6", "85:7", "85:8", "85:9", "85:10", "85:11", "85:12", "85:13", "85:14", "85:15", "85:16",
            "85:17", "85:18", "85:19", "85:20", "85:21", "85:22", ""};

    String [] arabic_verses = {"وَالسَّمَاءِ ذَاتِ الْبُرُوجِ",
    "وَالْيَوْمِ الْمَوْعُودِ",
    "وَشَاهِدٍ وَمَشْهُودٍ",
    "قُتِلَ أَصْحَابُ الْأُخْدُودِ",
    "النَّارِ ذَاتِ الْوَقُودِ",
    "إِذْ هُمْ عَلَيْهَا قُعُودٌ",
    "وَهُمْ عَلَىٰ مَا يَفْعَلُونَ بِالْمُؤْمِنِينَ شُهُودٌ",
    "وَمَا نَقَمُوا مِنْهُمْ إِلَّا أَن يُؤْمِنُوا بِاللَّهِ الْعَزِيزِ الْحَمِيدِ",
    "الَّذِي لَهُ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ ۚ وَاللَّهُ عَلَىٰ كُلِّ شَيْءٍ شَهِيدٌ",
    "إِنَّ الَّذِينَ فَتَنُوا الْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ ثُمَّ لَمْ يَتُوبُوا فَلَهُمْ عَذَابُ جَهَنَّمَ وَلَهُمْ عَذَابُ الْحَرِيقِ",
    "إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ جَنَّاتٌ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ ۚ ذَٰلِكَ الْفَوْزُ الْكَبِيرُ",
    "إِنَّ بَطْشَ رَبِّكَ لَشَدِيدٌ",
    "إِنَّهُ هُوَ يُبْدِئُ وَيُعِيدُ",
    "وَهُوَ الْغَفُورُ الْوَدُودُ",
    "ذُو الْعَرْشِ الْمَجِيدُ",
    "فَعَّالٌ لِّمَا يُرِيدُ",
    "هَلْ أَتَاكَ حَدِيثُ الْجُنُودِ",
    "فِرْعَوْنَ وَثَمُودَ",
    "بَلِ الَّذِينَ كَفَرُوا فِي تَكْذِيبٍ",
    "وَاللَّهُ مِن وَرَائِهِم مُّحِيطٌ",
    "بَلْ هُوَ قُرْآنٌ مَّجِيدٌ",
    "فِي لَوْحٍ مَّحْفُوظٍ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", ""};

    String [] english_verses = {"By the sky containing great stars",
    "And [by] the promised Day",
    "And [by] the witness and what is witnessed,",
    "Cursed were the companions of the trench",
    "[Containing] the fire full of fuel,",
    "When they were sitting near it",
    "And they, to what they were doing against the believers, were witnesses.",
    "And they resented them not except because they believed in Allah, the Exalted in Might, the Praiseworthy,",
    "To whom belongs the dominion of the heavens and the earth. And Allah, over all things, is Witness.",
    "Indeed, those who have tortured the believing men and believing women and then have not repented will have the punishment of Hell, and they will have the punishment of the Burning Fire.",
    "Indeed, those who have believed and done righteous deeds will have gardens beneath which rivers flow. That is the great attainment.",
    "Indeed, the vengeance of your Lord is severe.",
    "Indeed, it is He who originates [creation] and repeats.",
    "And He is the Forgiving, the Affectionate,",
    "Honorable Owner of the Throne,",
    "Effecter of what He intends.",
    "Has there reached you the story of the soldiers -",
    "[Those of] Pharaoh and Thamud?",
    "But they who disbelieve are in [persistent] denial,",
    "While Allah encompasses them from behind.",
    "But this is an honored Qur'an",
    "[Inscribed] in a Preserved Slate.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__buruj);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_buruj);
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
