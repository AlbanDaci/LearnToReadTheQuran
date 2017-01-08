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

public class Al_Muzzammil extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"73:1", "73:2", "73:3", "73:4", "73:5", "73:6", "73:7", "73:8", "73:9", "73:10", "73:11", "73:12", "73:13", "73:14", "73:15", "73:16",
            "73:17", "73:18", "73:19", "73:20"};

    String [] arabic_verses = {"يَا أَيُّهَا الْمُزَّمِّلُ",
    "قُمِ اللَّيْلَ إِلَّا قَلِيلًا",
    "نِّصْفَهُ أَوِ انقُصْ مِنْهُ قَلِيلًا",
    "أَوْ زِدْ عَلَيْهِ وَرَتِّلِ الْقُرْآنَ تَرْتِيلًا",
    "إِنَّا سَنُلْقِي عَلَيْكَ قَوْلًا ثَقِيلًا",
    "إِنَّ نَاشِئَةَ اللَّيْلِ هِيَ أَشَدُّ وَطْئًا وَأَقْوَمُ قِيلًا",
    "إِنَّ لَكَ فِي النَّهَارِ سَبْحًا طَوِيلًا",
    "وَاذْكُرِ اسْمَ رَبِّكَ وَتَبَتَّلْ إِلَيْهِ تَبْتِيلًا",
    "رَّبُّ الْمَشْرِقِ وَالْمَغْرِبِ لَا إِلَٰهَ إِلَّا هُوَ فَاتَّخِذْهُ وَكِيلًا",
    "وَاصْبِرْ عَلَىٰ مَا يَقُولُونَ وَاهْجُرْهُمْ هَجْرًا جَمِيلًا",
    "وَذَرْنِي وَالْمُكَذِّبِينَ أُولِي النَّعْمَةِ وَمَهِّلْهُمْ قَلِيلًا",
    "إِنَّ لَدَيْنَا أَنكَالًا وَجَحِيمًا",
    "وَطَعَامًا ذَا غُصَّةٍ وَعَذَابًا أَلِيمًا",
    "يَوْمَ تَرْجُفُ الْأَرْضُ وَالْجِبَالُ وَكَانَتِ الْجِبَالُ كَثِيبًا مَّهِيلًا",
    "إِنَّا أَرْسَلْنَا إِلَيْكُمْ رَسُولًا شَاهِدًا عَلَيْكُمْ كَمَا أَرْسَلْنَا إِلَىٰ فِرْعَوْنَ رَسُولًا",
    "فَعَصَىٰ فِرْعَوْنُ الرَّسُولَ فَأَخَذْنَاهُ أَخْذًا وَبِيلًا",
    "فَكَيْفَ تَتَّقُونَ إِن كَفَرْتُمْ يَوْمًا يَجْعَلُ الْوِلْدَانَ شِيبًا",
    "السَّمَاءُ مُنفَطِرٌ بِهِ ۚ كَانَ وَعْدُهُ مَفْعُولًا",
    "إِنَّ هَٰذِهِ تَذْكِرَةٌ ۖ فَمَن شَاءَ اتَّخَذَ إِلَىٰ رَبِّهِ سَبِيلًا",
    "إِنَّ رَبَّكَ يَعْلَمُ أَنَّكَ تَقُومُ أَدْنَىٰ مِن ثُلُثَيِ اللَّيْلِ وَنِصْفَهُ وَثُلُثَهُ وَطَائِفَةٌ مِّنَ الَّذِينَ مَعَكَ ۚ وَاللَّهُ يُقَدِّرُ اللَّيْلَ وَالنَّهَارَ ۚ عَلِمَ أَن لَّن تُحْصُوهُ فَتَابَ عَلَيْكُمْ ۖ فَاقْرَءُوا مَا تَيَسَّرَ مِنَ الْقُرْآنِ ۚ عَلِمَ أَن سَيَكُونُ مِنكُم مَّرْضَىٰ ۙ وَآخَرُونَ يَضْرِبُونَ فِي الْأَرْضِ يَبْتَغُونَ مِن فَضْلِ اللَّهِ ۙ وَآخَرُونَ يُقَاتِلُونَ فِي سَبِيلِ اللَّهِ ۖ فَاقْرَءُوا مَا تَيَسَّرَ مِنْهُ ۚ وَأَقِيمُوا الصَّلَاةَ وَآتُوا الزَّكَاةَ وَأَقْرِضُوا اللَّهَ قَرْضًا حَسَنًا ۚ وَمَا تُقَدِّمُوا لِأَنفُسِكُم مِّنْ خَيْرٍ تَجِدُوهُ عِندَ اللَّهِ هُوَ خَيْرًا وَأَعْظَمَ أَجْرًا ۚ وَاسْتَغْفِرُوا اللَّهَ ۖ إِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"O you who wraps himself [in clothing],",
    "Arise [to pray] the night, except for a little -",
    "Half of it - or subtract from it a little",
    "Or add to it, and recite the Qur'an with measured recitation.",
    "Indeed, We will cast upon you a heavy word.",
    "Indeed, the hours of the night are more effective for concurrence [of heart and tongue] and more suitable for words.",
    "Indeed, for you by day is prolonged occupation.",
    "And remember the name of your Lord and devote yourself to Him with [complete] devotion.",
    "[He is] the Lord of the East and the West; there is no deity except Him, so take Him as Disposer of [your] affairs.",
    "And be patient over what they say and avoid them with gracious avoidance.",
    "And leave Me with [the matter of] the deniers, those of ease [in life], and allow them respite a little.",
    "Indeed, with Us [for them] are shackles and burning fire",
    "And food that chokes and a painful punishment -",
    "On the Day the earth and the mountains will convulse and the mountains will become a heap of sand pouring down.",
    "Indeed, We have sent to you a Messenger as a witness upon you just as We sent to Pharaoh a messenger.",
    "But Pharaoh disobeyed the messenger, so We seized him with a ruinous seizure.",
    "Then how can you fear, if you disbelieve, a Day that will make the children white- haired?",
    "The heaven will break apart therefrom; ever is His promise fulfilled.",
    "Indeed, this is a reminder, so whoever wills may take to his Lord a way.",
    "Indeed, your Lord knows, [O Muhammad], that you stand [in prayer] almost two thirds of the night or half of it or a third of it, and [so do] a group of those with you. And Allah determines [the extent of] the night and the day. He has known that you [Muslims] will not be able to do it and has turned to you in forgiveness, so recite what is easy [for you] of the Qur'an. He has known that there will be among you those who are ill and others traveling throughout the land seeking [something] of the bounty of Allah and others fighting for the cause of Allah. So recite what is easy from it and establish prayer and give zakah and loan Allah a goodly loan. And whatever good you put forward for yourselves - you will find it with Allah. It is better and greater in reward. And seek forgiveness of Allah. Indeed, Allah is Forgiving and Merciful."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__muzzammil);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_muzzammil);
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
