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

public class An_Naba extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"78:1", "78:2", "78:3", "78:4", "78:5", "78:6", "78:7", "78:8", "78:9", "78:10", "78:11", "78:12", "78:13", "78:14", "78:15", "78:16",
            "78:17", "78:18", "78:19", "78:20", "78:21", "78:22", "78:23", "78:24", "78:25", "78:26", "78:27", "78:28", "78:29", "78:30", "78:31", "78:32",
            "78:33", "78:34", "78:35", "78:36", "78:37", "78:38", "78:39", "78:40", ""};

    String [] arabic_verses = {"عَمَّ يَتَسَاءَلُونَ",
    "عَنِ النَّبَإِ الْعَظِيمِ",
    "الَّذِي هُمْ فِيهِ مُخْتَلِفُونَ",
    "كَلَّا سَيَعْلَمُونَ",
    "ثُمَّ كَلَّا سَيَعْلَمُونَ",
    "أَلَمْ نَجْعَلِ الْأَرْضَ مِهَادًا",
    "وَالْجِبَالَ أَوْتَادًا",
    "وَخَلَقْنَاكُمْ أَزْوَاجًا",
    "وَجَعَلْنَا نَوْمَكُمْ سُبَاتًا",
    "وَجَعَلْنَا اللَّيْلَ لِبَاسًا",
    "وَجَعَلْنَا النَّهَارَ مَعَاشًا",
    "وَبَنَيْنَا فَوْقَكُمْ سَبْعًا شِدَادًا",
    "وَجَعَلْنَا سِرَاجًا وَهَّاجًا",
    "وَأَنزَلْنَا مِنَ الْمُعْصِرَاتِ مَاءً ثَجَّاجًا",
    "لِّنُخْرِجَ بِهِ حَبًّا وَنَبَاتًا",
    "وَجَنَّاتٍ أَلْفَافًا",
    "إِنَّ يَوْمَ الْفَصْلِ كَانَ مِيقَاتًا",
    "يَوْمَ يُنفَخُ فِي الصُّورِ فَتَأْتُونَ أَفْوَاجًا",
    "وَفُتِحَتِ السَّمَاءُ فَكَانَتْ أَبْوَابًا",
    "وَسُيِّرَتِ الْجِبَالُ فَكَانَتْ سَرَابًا",
    "إِنَّ جَهَنَّمَ كَانَتْ مِرْصَادًا",
    "لِّلطَّاغِينَ مَآبًا",
    "لَّابِثِينَ فِيهَا أَحْقَابًا",
    "لَّا يَذُوقُونَ فِيهَا بَرْدًا وَلَا شَرَابًا",
    "إِلَّا حَمِيمًا وَغَسَّاقًا",
    "جَزَاءً وِفَاقًا",
    "إِنَّهُمْ كَانُوا لَا يَرْجُونَ حِسَابًا",
    "وَكَذَّبُوا بِآيَاتِنَا كِذَّابًا",
    "وَكُلَّ شَيْءٍ أَحْصَيْنَاهُ كِتَابًا",
    "فَذُوقُوا فَلَن نَّزِيدَكُمْ إِلَّا عَذَابًا",
    "إِنَّ لِلْمُتَّقِينَ مَفَازًا",
    "حَدَائِقَ وَأَعْنَابًا",
    "وَكَوَاعِبَ أَتْرَابًا",
    "وَكَأْسًا دِهَاقًا",
    "لَّا يَسْمَعُونَ فِيهَا لَغْوًا وَلَا كِذَّابًا",
    "جَزَاءً مِّن رَّبِّكَ عَطَاءً حِسَابًا",
    "رَّبِّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا الرَّحْمَٰنِ ۖ لَا يَمْلِكُونَ مِنْهُ خِطَابًا",
    "يَوْمَ يَقُومُ الرُّوحُ وَالْمَلَائِكَةُ صَفًّا ۖ لَّا يَتَكَلَّمُونَ إِلَّا مَنْ أَذِنَ لَهُ الرَّحْمَٰنُ وَقَالَ صَوَابًا",
    "ذَٰلِكَ الْيَوْمُ الْحَقُّ ۖ فَمَن شَاءَ اتَّخَذَ إِلَىٰ رَبِّهِ مَآبًا",
    "إِنَّا أَنذَرْنَاكُمْ عَذَابًا قَرِيبًا يَوْمَ يَنظُرُ الْمَرْءُ مَا قَدَّمَتْ يَدَاهُ وَيَقُولُ الْكَافِرُ يَا لَيْتَنِي كُنتُ تُرَابًا",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"About what are they asking one another?",
    "About the great news -",
    "That over which they are in disagreement.",
    "No! They are going to know.",
    "Then, no! They are going to know.",
    "Have We not made the earth a resting place?",
    "And the mountains as stakes?",
    "And We created you in pairs",
    "And made your sleep [a means for] rest",
    "And made the night as clothing",
    "And made the day for livelihood",
    "And constructed above you seven strong [heavens]",
    "And made [therein] a burning lamp",
    "And sent down, from the rain clouds, pouring water",
    "That We may bring forth thereby grain and vegetation",
    "And gardens of entwined growth.",
    "Indeed, the Day of Judgement is an appointed time -",
    "The Day the Horn is blown and you will come forth in multitudes",
    "And the heaven is opened and will become gateways",
    "And the mountains are removed and will be [but] a mirage.",
    "Indeed, Hell has been lying in wait",
    "For the transgressors, a place of return,",
    "In which they will remain for ages [unending].",
    "They will not taste therein [any] coolness or drink",
    "Except scalding water and [foul] purulence -",
    "An appropriate recompense.",
    "Indeed, they were not expecting an account",
    "And denied Our verses with [emphatic] denial.",
    "But all things We have enumerated in writing.",
    "\"So taste [the penalty], and never will We increase you except in torment.\"",
    "Indeed, for the righteous is attainment -",
    "Gardens and grapevines",
    "And full-breasted [companions] of equal age",
    "And a full cup.",
    "No ill speech will they hear therein or any falsehood -",
    "[As] reward from your Lord, [a generous] gift [made due by] account,",
    "[From] the Lord of the heavens and the earth and whatever is between them, the Most Merciful. They possess not from Him [authority for] speech.",
    "The Day that the Spirit and the angels will stand in rows, they will not speak except for one whom the Most Merciful permits, and he will say what is correct.",
    "That is the True Day; so he who wills may take to his Lord a [way of] return.",
    "Indeed, We have warned you of a near punishment on the Day when a man will observe what his hands have put forth and the disbeliever will say, \"Oh, I wish that I were dust!\"",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an__naba);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_an_naba);
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
