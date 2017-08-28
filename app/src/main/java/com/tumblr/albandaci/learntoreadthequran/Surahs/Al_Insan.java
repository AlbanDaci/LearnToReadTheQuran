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

public class Al_Insan extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"76:1", "76:2", "76:3", "76:4", "76:5", "76:6", "76:7", "76:8", "76:9", "76:10", "76:11", "76:12", "76:13", "76:14", "76:15", "76:16",
            "76:17", "76:18", "76:19", "76:20", "76:21", "76:22", "76:23", "76:24", "76:25", "76:26", "76:27", "76:28", "76:29", "76:30", "76:31", ""};

    String [] arabic_verses = {"هَلْ أَتَىٰ عَلَى الْإِنسَانِ حِينٌ مِّنَ الدَّهْرِ لَمْ يَكُن شَيْئًا مَّذْكُورًا",
    "إِنَّا خَلَقْنَا الْإِنسَانَ مِن نُّطْفَةٍ أَمْشَاجٍ نَّبْتَلِيهِ فَجَعَلْنَاهُ سَمِيعًا بَصِيرًا",
    "إِنَّا هَدَيْنَاهُ السَّبِيلَ إِمَّا شَاكِرًا وَإِمَّا كَفُورًا",
    "إِنَّا أَعْتَدْنَا لِلْكَافِرِينَ سَلَاسِلَ وَأَغْلَالًا وَسَعِيرًا",
    "إِنَّ الْأَبْرَارَ يَشْرَبُونَ مِن كَأْسٍ كَانَ مِزَاجُهَا كَافُورًا",
    "عَيْنًا يَشْرَبُ بِهَا عِبَادُ اللَّهِ يُفَجِّرُونَهَا تَفْجِيرًا",
    "يُوفُونَ بِالنَّذْرِ وَيَخَافُونَ يَوْمًا كَانَ شَرُّهُ مُسْتَطِيرًا",
    "وَيُطْعِمُونَ الطَّعَامَ عَلَىٰ حُبِّهِ مِسْكِينًا وَيَتِيمًا وَأَسِيرًا",
    "إِنَّمَا نُطْعِمُكُمْ لِوَجْهِ اللَّهِ لَا نُرِيدُ مِنكُمْ جَزَاءً وَلَا شُكُورًا",
    "إِنَّا نَخَافُ مِن رَّبِّنَا يَوْمًا عَبُوسًا قَمْطَرِيرًا",
    "فَوَقَاهُمُ اللَّهُ شَرَّ ذَٰلِكَ الْيَوْمِ وَلَقَّاهُمْ نَضْرَةً وَسُرُورًا",
    "وَجَزَاهُم بِمَا صَبَرُوا جَنَّةً وَحَرِيرًا",
    "مُّتَّكِئِينَ فِيهَا عَلَى الْأَرَائِكِ ۖ لَا يَرَوْنَ فِيهَا شَمْسًا وَلَا زَمْهَرِيرًا",
    "وَدَانِيَةً عَلَيْهِمْ ظِلَالُهَا وَذُلِّلَتْ قُطُوفُهَا تَذْلِيلًا",
    "وَيُطَافُ عَلَيْهِم بِآنِيَةٍ مِّن فِضَّةٍ وَأَكْوَابٍ كَانَتْ قَوَارِيرَا",
    "قَوَارِيرَ مِن فِضَّةٍ قَدَّرُوهَا تَقْدِيرًا",
    "وَيُسْقَوْنَ فِيهَا كَأْسًا كَانَ مِزَاجُهَا زَنجَبِيلًا",
    "عَيْنًا فِيهَا تُسَمَّىٰ سَلْسَبِيلًا",
    "وَيَطُوفُ عَلَيْهِمْ وِلْدَانٌ مُّخَلَّدُونَ إِذَا رَأَيْتَهُمْ حَسِبْتَهُمْ لُؤْلُؤًا مَّنثُورًا",
    "وَإِذَا رَأَيْتَ ثَمَّ رَأَيْتَ نَعِيمًا وَمُلْكًا كَبِيرًا",
    "عَالِيَهُمْ ثِيَابُ سُندُسٍ خُضْرٌ وَإِسْتَبْرَقٌ ۖ وَحُلُّوا أَسَاوِرَ مِن فِضَّةٍ وَسَقَاهُمْ رَبُّهُمْ شَرَابًا طَهُورًا",
    "إِنَّ هَٰذَا كَانَ لَكُمْ جَزَاءً وَكَانَ سَعْيُكُم مَّشْكُورًا",
    "إِنَّا نَحْنُ نَزَّلْنَا عَلَيْكَ الْقُرْآنَ تَنزِيلًا",
    "فَاصْبِرْ لِحُكْمِ رَبِّكَ وَلَا تُطِعْ مِنْهُمْ آثِمًا أَوْ كَفُورًا",
    "وَاذْكُرِ اسْمَ رَبِّكَ بُكْرَةً وَأَصِيلًا",
    "وَمِنَ اللَّيْلِ فَاسْجُدْ لَهُ وَسَبِّحْهُ لَيْلًا طَوِيلًا",
    "إِنَّ هَٰؤُلَاءِ يُحِبُّونَ الْعَاجِلَةَ وَيَذَرُونَ وَرَاءَهُمْ يَوْمًا ثَقِيلًا",
    "نَّحْنُ خَلَقْنَاهُمْ وَشَدَدْنَا أَسْرَهُمْ ۖ وَإِذَا شِئْنَا بَدَّلْنَا أَمْثَالَهُمْ تَبْدِيلًا",
    "إِنَّ هَٰذِهِ تَذْكِرَةٌ ۖ فَمَن شَاءَ اتَّخَذَ إِلَىٰ رَبِّهِ سَبِيلًا",
    "وَمَا تَشَاءُونَ إِلَّا أَن يَشَاءَ اللَّهُ ۚ إِنَّ اللَّهَ كَانَ عَلِيمًا حَكِيمًا",
    "يُدْخِلُ مَن يَشَاءُ فِي رَحْمَتِهِ ۚ وَالظَّالِمِينَ أَعَدَّ لَهُمْ عَذَابًا أَلِيمًا",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", ""};

    String [] english_verses = {"Has there [not] come upon man a period of time when he was not a thing [even] mentioned?",
    "Indeed, We created man from a sperm-drop mixture that We may try him; and We made him hearing and seeing.",
    "Indeed, We guided him to the way, be he grateful or be he ungrateful.",
    "Indeed, We have prepared for the disbelievers chains and shackles and a blaze.",
    "Indeed, the righteous will drink from a cup [of wine] whose mixture is of Kafur,",
    "A spring of which the [righteous] servants of Allah will drink; they will make it gush forth in force [and abundance].",
    "They [are those who] fulfill [their] vows and fear a Day whose evil will be widespread.",
    "And they give food in spite of love for it to the needy, the orphan, and the captive,",
    "[Saying], \"We feed you only for the countenance of Allah. We wish not from you reward or gratitude.",
    "Indeed, We fear from our Lord a Day austere and distressful.\"",
    "So Allah will protect them from the evil of that Day and give them radiance and happiness",
    "And will reward them for what they patiently endured [with] a garden [in Paradise] and silk [garments].",
    "[They will be] reclining therein on adorned couches. They will not see therein any [burning] sun or [freezing] cold.",
    "And near above them are its shades, and its [fruit] to be picked will be lowered in compliance.",
    "And there will be circulated among them vessels of silver and cups having been [created] clear [as glass],",
    "Clear glasses [made] from silver of which they have determined the measure.",
    "And they will be given to drink a cup [of wine] whose mixture is of ginger",
    "[From] a fountain within Paradise named Salsabeel.",
    "There will circulate among them young boys made eternal. When you see them, you would think them [as beautiful as] scattered pearls.",
    "And when you look there [in Paradise], you will see pleasure and great dominion.",
    "Upon the inhabitants will be green garments of fine silk and brocade. And they will be adorned with bracelets of silver, and their Lord will give them a purifying drink.",
    "[And it will be said], \"Indeed, this is for you a reward, and your effort has been appreciated.\"",
    "Indeed, it is We who have sent down to you, [O Muhammad], the Qur'an progressively.",
    "So be patient for the decision of your Lord and do not obey from among them a sinner or ungrateful [disbeliever].",
    "And mention the name of your Lord [in prayer] morning and evening",
    "And during the night prostrate to Him and exalt Him a long [part of the] night.",
    "Indeed, these [disbelievers] love the immediate and leave behind them a grave Day.",
    "We have created them and strengthened their forms, and when We will, We can change their likenesses with [complete] alteration.",
    "Indeed, this is a reminder, so he who wills may take to his Lord a way.",
    "And you do not will except that Allah wills. Indeed, Allah is ever Knowing and Wise.",
    "He admits whom He wills into His mercy; but the wrongdoers - He has prepared for them a painful punishment.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__insan);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_insan);
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
