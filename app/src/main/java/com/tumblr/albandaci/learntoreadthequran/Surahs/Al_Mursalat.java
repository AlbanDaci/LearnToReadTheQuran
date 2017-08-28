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

public class Al_Mursalat extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"77:1", "77:2", "77:3", "77:4", "77:5", "77:6", "77:7", "77:8", "77:9", "77:10", "77:11", "77:12", "77:13", "77:14", "77:15", "77:16",
            "77:17", "77:18", "77:19", "77:20", "77:21", "77:22", "77:23", "77:24", "77:25", "77:26", "77:27", "77:28", "77:29", "77:30", "77:31", "77:32",
            "77:33", "77:34", "77:35", "77:36", "77:37", "77:38", "77:39", "77:40", "77:41", "77:42", "77:43", "77:44", "77:45", "77:46", "77:47", "77:48",
            "77:49", "77:50", ""};

    String [] arabic_verses = {"وَالْمُرْسَلَاتِ عُرْفًا",
    "فَالْعَاصِفَاتِ عَصْفًا",
    "وَالنَّاشِرَاتِ نَشْرًا",
    "فَالْفَارِقَاتِ فَرْقًا",
    "فَالْمُلْقِيَاتِ ذِكْرًا",
    "عُذْرًا أَوْ نُذْرًا",
    "إِنَّمَا تُوعَدُونَ لَوَاقِعٌ",
    "فَإِذَا النُّجُومُ طُمِسَتْ",
    "وَإِذَا السَّمَاءُ فُرِجَتْ",
    "وَإِذَا الْجِبَالُ نُسِفَتْ",
    "وَإِذَا الرُّسُلُ أُقِّتَتْ",
    "لِأَيِّ يَوْمٍ أُجِّلَتْ",
    "لِيَوْمِ الْفَصْلِ",
    "وَمَا أَدْرَاكَ مَا يَوْمُ الْفَصْلِ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "أَلَمْ نُهْلِكِ الْأَوَّلِينَ",
    "ثُمَّ نُتْبِعُهُمُ الْآخِرِينَ",
    "كَذَٰلِكَ نَفْعَلُ بِالْمُجْرِمِينَ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "أَلَمْ نَخْلُقكُّم مِّن مَّاءٍ مَّهِينٍ",
    "فَجَعَلْنَاهُ فِي قَرَارٍ مَّكِينٍ",
    "إِلَىٰ قَدَرٍ مَّعْلُومٍ",
    "فَقَدَرْنَا فَنِعْمَ الْقَادِرُونَ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "أَلَمْ نَجْعَلِ الْأَرْضَ كِفَاتًا",
    "أَحْيَاءً وَأَمْوَاتًا",
    "وَجَعَلْنَا فِيهَا رَوَاسِيَ شَامِخَاتٍ وَأَسْقَيْنَاكُم مَّاءً فُرَاتًا",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "انطَلِقُوا إِلَىٰ مَا كُنتُم بِهِ تُكَذِّبُونَ",
    "انطَلِقُوا إِلَىٰ ظِلٍّ ذِي ثَلَاثِ شُعَبٍ",
    "لَّا ظَلِيلٍ وَلَا يُغْنِي مِنَ اللَّهَبِ",
    "إِنَّهَا تَرْمِي بِشَرَرٍ كَالْقَصْرِ",
    "كَأَنَّهُ جِمَالَتٌ صُفْرٌ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "هَٰذَا يَوْمُ لَا يَنطِقُونَ",
    "وَلَا يُؤْذَنُ لَهُمْ فَيَعْتَذِرُونَ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "هَٰذَا يَوْمُ الْفَصْلِ ۖ جَمَعْنَاكُمْ وَالْأَوَّلِينَ",
    "فَإِن كَانَ لَكُمْ كَيْدٌ فَكِيدُونِ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "إِنَّ الْمُتَّقِينَ فِي ظِلَالٍ وَعُيُونٍ",
    "وَفَوَاكِهَ مِمَّا يَشْتَهُونَ",
    "كُلُوا وَاشْرَبُوا هَنِيئًا بِمَا كُنتُمْ تَعْمَلُونَ",
    "إِنَّا كَذَٰلِكَ نَجْزِي الْمُحْسِنِينَ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "كُلُوا وَتَمَتَّعُوا قَلِيلًا إِنَّكُم مُّجْرِمُونَ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "وَإِذَا قِيلَ لَهُمُ ارْكَعُوا لَا يَرْكَعُونَ",
    "وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "فَبِأَيِّ حَدِيثٍ بَعْدَهُ يُؤْمِنُونَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"By those [winds] sent forth in gusts",
    "And the winds that blow violently",
    "And [by] the winds that spread [clouds]",
    "And those [angels] who bring criterion",
    "And those [angels] who deliver a message",
    "As justification or warning,",
    "Indeed, what you are promised is to occur.",
    "So when the stars are obliterated",
    "And when the heaven is opened",
    "And when the mountains are blown away",
    "And when the messengers' time has come...",
    "For what Day was it postponed?",
    "For the Day of Judgement.",
    "And what can make you know what is the Day of Judgement?",
    "Woe, that Day, to the deniers.",
    "Did We not destroy the former peoples?",
    "Then We will follow them with the later ones.",
    "Thus do We deal with the criminals.",
    "Woe, that Day, to the deniers.",
    "Did We not create you from a liquid disdained?",
    "And We placed it in a firm lodging",
    "For a known extent.",
    "And We determined [it], and excellent [are We] to determine.",
    "Woe, that Day, to the deniers.",
    "Have We not made the earth a container",
    "Of the living and the dead?",
    "And We placed therein lofty, firmly set mountains and have given you to drink sweet water.",
    "Woe, that Day, to the deniers.",
    "[They will be told], \"Proceed to that which you used to deny.",
    "Proceed to a shadow [of smoke] having three columns",
    "[But having] no cool shade and availing not against the flame.\"",
    "Indeed, it throws sparks [as huge] as a fortress,",
    "As if they were yellowish [black] camels.",
    "Woe, that Day, to the deniers.",
    "This is a Day they will not speak,",
    "Nor will it be permitted for them to make an excuse.",
    "Woe, that Day, to the deniers.",
    "This is the Day of Judgement; We will have assembled you and the former peoples.",
    "So if you have a plan, then plan against Me.",
    "Woe, that Day, to the deniers.",
    "Indeed, the righteous will be among shades and springs",
    "And fruits from whatever they desire,",
    "[Being told], \"Eat and drink in satisfaction for what you used to do.\"",
    "Indeed, We thus reward the doers of good.",
    "Woe, that Day, to the deniers.",
    "[O disbelievers], eat and enjoy yourselves a little; indeed, you are criminals.",
    "Woe, that Day, to the deniers.",
    "And when it is said to them, \"Bow [in prayer],\" they do not bow.",
    "Woe, that Day, to the deniers.",
    "Then in what statement after the Qur'an will they believe?",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__mursalat);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_mursalat);
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
