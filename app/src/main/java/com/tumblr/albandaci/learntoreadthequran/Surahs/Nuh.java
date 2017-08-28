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

public class Nuh extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"71:1", "71:2", "71:3", "71:4", "71:5", "71:6", "71:7", "71:8", "71:9", "71:10", "71:11", "71:12", "71:13", "71:14", "71:15", "71:16",
            "71:17", "71:18", "71:19", "71:20", "71:21", "71:22", "71:23", "71:24", "71:25", "71:26", "71:27", "71:28", ""};

    String [] arabic_verses = {"إِنَّا أَرْسَلْنَا نُوحًا إِلَىٰ قَوْمِهِ أَنْ أَنذِرْ قَوْمَكَ مِن قَبْلِ أَن يَأْتِيَهُمْ عَذَابٌ أَلِيمٌ",
    "قَالَ يَا قَوْمِ إِنِّي لَكُمْ نَذِيرٌ مُّبِينٌ",
    "أَنِ اعْبُدُوا اللَّهَ وَاتَّقُوهُ وَأَطِيعُونِ",
    "يَغْفِرْ لَكُم مِّن ذُنُوبِكُمْ وَيُؤَخِّرْكُمْ إِلَىٰ أَجَلٍ مُّسَمًّى ۚ إِنَّ أَجَلَ اللَّهِ إِذَا جَاءَ لَا يُؤَخَّرُ ۖ لَوْ كُنتُمْ تَعْلَمُونَ",
    "قَالَ رَبِّ إِنِّي دَعَوْتُ قَوْمِي لَيْلًا وَنَهَارًا",
    "فَلَمْ يَزِدْهُمْ دُعَائِي إِلَّا فِرَارًا",
    "وَإِنِّي كُلَّمَا دَعَوْتُهُمْ لِتَغْفِرَ لَهُمْ جَعَلُوا أَصَابِعَهُمْ فِي آذَانِهِمْ وَاسْتَغْشَوْا ثِيَابَهُمْ وَأَصَرُّوا وَاسْتَكْبَرُوا اسْتِكْبَارًا",
    "ثُمَّ إِنِّي دَعَوْتُهُمْ جِهَارًا",
    "ثُمَّ إِنِّي أَعْلَنتُ لَهُمْ وَأَسْرَرْتُ لَهُمْ إِسْرَارًا",
    "فَقُلْتُ اسْتَغْفِرُوا رَبَّكُمْ إِنَّهُ كَانَ غَفَّارًا",
    "يُرْسِلِ السَّمَاءَ عَلَيْكُم مِّدْرَارًا",
    "وَيُمْدِدْكُم بِأَمْوَالٍ وَبَنِينَ وَيَجْعَل لَّكُمْ جَنَّاتٍ وَيَجْعَل لَّكُمْ أَنْهَارًا",
    "مَّا لَكُمْ لَا تَرْجُونَ لِلَّهِ وَقَارًا",
    "وَقَدْ خَلَقَكُمْ أَطْوَارًا",
    "أَلَمْ تَرَوْا كَيْفَ خَلَقَ اللَّهُ سَبْعَ سَمَاوَاتٍ طِبَاقًا",
    "وَجَعَلَ الْقَمَرَ فِيهِنَّ نُورًا وَجَعَلَ الشَّمْسَ سِرَاجًا",
    "وَاللَّهُ أَنبَتَكُم مِّنَ الْأَرْضِ نَبَاتًا",
    "ثُمَّ يُعِيدُكُمْ فِيهَا وَيُخْرِجُكُمْ إِخْرَاجًا",
    "وَاللَّهُ جَعَلَ لَكُمُ الْأَرْضَ بِسَاطًا",
    "لِّتَسْلُكُوا مِنْهَا سُبُلًا فِجَاجًا",
    "قَالَ نُوحٌ رَّبِّ إِنَّهُمْ عَصَوْنِي وَاتَّبَعُوا مَن لَّمْ يَزِدْهُ مَالُهُ وَوَلَدُهُ إِلَّا خَسَارًا",
    "وَمَكَرُوا مَكْرًا كُبَّارًا",
    "وَقَالُوا لَا تَذَرُنَّ آلِهَتَكُمْ وَلَا تَذَرُنَّ وَدًّا وَلَا سُوَاعًا وَلَا يَغُوثَ وَيَعُوقَ وَنَسْرًا",
    "وَقَدْ أَضَلُّوا كَثِيرًا ۖ وَلَا تَزِدِ الظَّالِمِينَ إِلَّا ضَلَالًا",
    "مِّمَّا خَطِيئَاتِهِمْ أُغْرِقُوا فَأُدْخِلُوا نَارًا فَلَمْ يَجِدُوا لَهُم مِّن دُونِ اللَّهِ أَنصَارًا",
    "وَقَالَ نُوحٌ رَّبِّ لَا تَذَرْ عَلَى الْأَرْضِ مِنَ الْكَافِرِينَ دَيَّارًا",
    "إِنَّكَ إِن تَذَرْهُمْ يُضِلُّوا عِبَادَكَ وَلَا يَلِدُوا إِلَّا فَاجِرًا كَفَّارًا",
    "رَّبِّ اغْفِرْ لِي وَلِوَالِدَيَّ وَلِمَن دَخَلَ بَيْتِيَ مُؤْمِنًا وَلِلْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ وَلَا تَزِدِ الظَّالِمِينَ إِلَّا تَبَارًا",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Indeed, We sent Noah to his people, [saying], \"Warn your people before there comes to them a painful punishment.\"",
    "He said, \"O my people, indeed I am to you a clear warner,",
    "[Saying], 'Worship Allah, fear Him and obey me.",
    "Allah will forgive you of your sins and delay you for a specified term. Indeed, the time [set by] Allah, when it comes, will not be delayed, if you only knew.' \"",
    "He said, \"My Lord, indeed I invited my people [to truth] night and day.",
    "But my invitation increased them not except in flight.",
    "And indeed, every time I invited them that You may forgive them, they put their fingers in their ears, covered themselves with their garments, persisted, and were arrogant with [great] arrogance.",
    "Then I invited them publicly.",
    "Then I announced to them and [also] confided to them secretly",
    "And said, 'Ask forgiveness of your Lord. Indeed, He is ever a Perpetual Forgiver.",
    "He will send [rain from] the sky upon you in [continuing] showers",
    "And give you increase in wealth and children and provide for you gardens and provide for you rivers.",
    "What is [the matter] with you that you do not attribute to Allah [due] grandeur",
    "While He has created you in stages?",
    "Do you not consider how Allah has created seven heavens in layers",
    "And made the moon therein a [reflected] light and made the sun a burning lamp?",
    "And Allah has caused you to grow from the earth a [progressive] growth.",
    "Then He will return you into it and extract you [another] extraction.",
    "And Allah has made for you the earth an expanse",
    "That you may follow therein roads of passage.' \"",
    "Noah said, \"My Lord, indeed they have disobeyed me and followed him whose wealth and children will not increase him except in loss.",
    "And they conspired an immense conspiracy.",
    "And said, 'Never leave your gods and never leave Wadd or Suwa' or Yaghuth and Ya'uq and Nasr.",
    "And already they have misled many. And, [my Lord], do not increase the wrongdoers except in error.\"",
    "Because of their sins they were drowned and put into the Fire, and they found not for themselves besides Allah [any] helpers.",
    "And Noah said, \"My Lord, do not leave upon the earth from among the disbelievers an inhabitant.",
    "Indeed, if You leave them, they will mislead Your servants and not beget except [every] wicked one and [confirmed] disbeliever.",
    "My Lord, forgive me and my parents and whoever enters my house a believer and the believing men and believing women. And do not increase the wrongdoers except in destruction.\"",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuh);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_nuh);
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
