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

public class Al_Mutaffifin extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"83:1", "83:2", "83:3", "83:4", "83:5", "83:6", "83:7", "83:8", "83:9", "83:10", "83:11", "83:12", "83:13", "83:14", "83:15", "83:16",
            "83:17", "83:18", "83:19", "83:20", "83:21", "83:22", "83:23", "83:24", "83:25", "83:26", "83:27", "83:28", "83:29", "83:30", "83:31", "83:32",
            "83:33", "83:34", "83:35", "83:36", ""};

    String [] arabic_verses = {"وَيْلٌ لِّلْمُطَفِّفِينَ",
    "الَّذِينَ إِذَا اكْتَالُوا عَلَى النَّاسِ يَسْتَوْفُونَ",
    "وَإِذَا كَالُوهُمْ أَو وَّزَنُوهُمْ يُخْسِرُونَ",
    "أَلَا يَظُنُّ أُولَٰئِكَ أَنَّهُم مَّبْعُوثُونَ",
    "لِيَوْمٍ عَظِيمٍ",
    "يَوْمَ يَقُومُ النَّاسُ لِرَبِّ الْعَالَمِينَ",
    "كَلَّا إِنَّ كِتَابَ الْفُجَّارِ لَفِي سِجِّينٍ",
    "وَمَا أَدْرَاكَ مَا سِجِّينٌ",
    "كِتَابٌ مَّرْقُومٌ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "الَّذِينَ يُكَذِّبُونَ بِيَوْمِ الدِّينِ",
    "وَمَا يُكَذِّبُ بِهِ إِلَّا كُلُّ مُعْتَدٍ أَثِيمٍ",
    "إِذَا تُتْلَىٰ عَلَيْهِ آيَاتُنَا قَالَ أَسَاطِيرُ الْأَوَّلِينَ",
    "كَلَّا ۖ بَلْ ۜ رَانَ عَلَىٰ قُلُوبِهِم مَّا كَانُوا يَكْسِبُونَ",
    "كَلَّا إِنَّهُمْ عَن رَّبِّهِمْ يَوْمَئِذٍ لَّمَحْجُوبُونَ",
    "ثُمَّ إِنَّهُمْ لَصَالُو الْجَحِيمِ",
    "ثُمَّ يُقَالُ هَٰذَا الَّذِي كُنتُم بِهِ تُكَذِّبُونَ",
    "كَلَّا إِنَّ كِتَابَ الْأَبْرَارِ لَفِي عِلِّيِّينَ",
    "وَمَا أَدْرَاكَ مَا عِلِّيُّونَ",
    "كِتَابٌ مَّرْقُومٌ",
    "يَشْهَدُهُ الْمُقَرَّبُونَ",
    "إِنَّ الْأَبْرَارَ لَفِي نَعِيمٍ",
    "عَلَى الْأَرَائِكِ يَنظُرُونَ",
    "تَعْرِفُ فِي وُجُوهِهِمْ نَضْرَةَ النَّعِيمِ",
    "يُسْقَوْنَ مِن رَّحِيقٍ مَّخْتُومٍ",
    "خِتَامُهُ مِسْكٌ ۚ وَفِي ذَٰلِكَ فَلْيَتَنَافَسِ الْمُتَنَافِسُونَ",
    "وَمِزَاجُهُ مِن تَسْنِيمٍ",
    "عَيْنًا يَشْرَبُ بِهَا الْمُقَرَّبُونَ",
    "إِنَّ الَّذِينَ أَجْرَمُوا كَانُوا مِنَ الَّذِينَ آمَنُوا يَضْحَكُونَ",
    "وَإِذَا مَرُّوا بِهِمْ يَتَغَامَزُونَ",
    "وَإِذَا انقَلَبُوا إِلَىٰ أَهْلِهِمُ انقَلَبُوا فَكِهِينَ",
    "وَإِذَا رَأَوْهُمْ قَالُوا إِنَّ هَٰؤُلَاءِ لَضَالُّونَ",
    "وَمَا أُرْسِلُوا عَلَيْهِمْ حَافِظِينَ",
    "فَالْيَوْمَ الَّذِينَ آمَنُوا مِنَ الْكُفَّارِ يَضْحَكُونَ",
    "عَلَى الْأَرَائِكِ يَنظُرُونَ",
    "هَلْ ثُوِّبَ الْكُفَّارُ مَا كَانُوا يَفْعَلُونَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Woe to those who give less [than due],",
    "Who, when they take a measure from people, take in full.",
    "But if they give by measure or by weight to them, they cause loss.",
    "Do they not think that they will be resurrected",
    "For a tremendous Day -",
    "The Day when mankind will stand before the Lord of the worlds?",
    "No! Indeed, the record of the wicked is in sijjeen.",
    "And what can make you know what is sijjeen?",
    "It is [their destination recorded in] a register inscribed.",
    "Woe, that Day, to the deniers,",
    "Who deny the Day of Recompense.",
    "And none deny it except every sinful transgressor.",
    "When Our verses are recited to him, he says, \"Legends of the former peoples.\"",
    "No! Rather, the stain has covered their hearts of that which they were earning.",
    "No! Indeed, from their Lord, that Day, they will be partitioned.",
    "Then indeed, they will [enter and] burn in Hellfire.",
    "Then it will be said [to them], \"This is what you used to deny.\"",
    "No! Indeed, the record of the righteous is in 'illiyyun.",
    "And what can make you know what is 'illiyyun?",
    "It is [their destination recorded in] a register inscribed",
    "Which is witnessed by those brought near [to Allah].",
    "Indeed, the righteous will be in pleasure",
    "On adorned couches, observing.",
    "You will recognize in their faces the radiance of pleasure.",
    "They will be given to drink [pure] wine [which was] sealed.",
    "The last of it is musk. So for this let the competitors compete.",
    "And its mixture is of Tasneem,",
    "A spring from which those near [to Allah] drink.",
    "Indeed, those who committed crimes used to laugh at those who believed.",
    "And when they passed by them, they would exchange derisive glances.",
    "And when they returned to their people, they would return jesting.",
    "And when they saw them, they would say, \"Indeed, those are truly lost.\"",
    "But they had not been sent as guardians over them.",
    "So Today those who believed are laughing at the disbelievers,",
    "On adorned couches, observing.",
    "Have the disbelievers [not] been rewarded [this Day] for what they used to do?",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__mutaffifin);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_mutaffifin);
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
