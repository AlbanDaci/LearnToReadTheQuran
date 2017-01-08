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

public class Abasa extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"80:1", "80:2", "80:3", "80:4", "80:5", "80:6", "80:7", "80:8", "80:9", "80:10", "80:11", "80:12", "80:13", "80:14", "80:15", "80:16",
            "80:17", "80:18", "80:19", "80:20", "80:21", "80:22", "80:23", "80:24", "80:25", "80:26", "80:27", "80:28", "80:29", "80:30", "80:31", "80:32",
            "80:33", "80:34", "80:35", "80:36", "80:37", "80:38", "80:39", "80:40", "80:41", "80:42"};

    String [] arabic_verses = {"عَبَسَ وَتَوَلَّىٰ",
    "أَن جَاءَهُ الْأَعْمَىٰ",
    "وَمَا يُدْرِيكَ لَعَلَّهُ يَزَّكَّىٰ",
    "أَوْ يَذَّكَّرُ فَتَنفَعَهُ الذِّكْرَىٰ",
    "أَمَّا مَنِ اسْتَغْنَىٰ",
    "فَأَنتَ لَهُ تَصَدَّىٰ",
    "وَمَا عَلَيْكَ أَلَّا يَزَّكَّىٰ",
    "وَأَمَّا مَن جَاءَكَ يَسْعَىٰ",
    "وَهُوَ يَخْشَىٰ",
    "فَأَنتَ عَنْهُ تَلَهَّىٰ",
    "كَلَّا إِنَّهَا تَذْكِرَةٌ",
    "فَمَن شَاءَ ذَكَرَهُ",
    "فِي صُحُفٍ مُّكَرَّمَةٍ",
    "مَّرْفُوعَةٍ مُّطَهَّرَةٍ",
    "بِأَيْدِي سَفَرَةٍ",
    "كِرَامٍ بَرَرَةٍ",
    "قُتِلَ الْإِنسَانُ مَا أَكْفَرَهُ",
    "مِنْ أَيِّ شَيْءٍ خَلَقَهُ",
    "مِن نُّطْفَةٍ خَلَقَهُ فَقَدَّرَهُ",
    "ثُمَّ السَّبِيلَ يَسَّرَهُ",
    "ثُمَّ أَمَاتَهُ فَأَقْبَرَهُ",
    "ثُمَّ إِذَا شَاءَ أَنشَرَهُ",
    "كَلَّا لَمَّا يَقْضِ مَا أَمَرَهُ",
    "فَلْيَنظُرِ الْإِنسَانُ إِلَىٰ طَعَامِهِ",
    "أَنَّا صَبَبْنَا الْمَاءَ صَبًّا",
    "ثُمَّ شَقَقْنَا الْأَرْضَ شَقًّا",
    "فَأَنبَتْنَا فِيهَا حَبًّا",
    "وَعِنَبًا وَقَضْبًا",
    "وَزَيْتُونًا وَنَخْلًا",
    "وَحَدَائِقَ غُلْبًا",
    "وَفَاكِهَةً وَأَبًّا",
    "مَّتَاعًا لَّكُمْ وَلِأَنْعَامِكُمْ",
    "فَإِذَا جَاءَتِ الصَّاخَّةُ",
    "يَوْمَ يَفِرُّ الْمَرْءُ مِنْ أَخِيهِ",
    "وَأُمِّهِ وَأَبِيهِ",
    "وَصَاحِبَتِهِ وَبَنِيهِ",
    "لِكُلِّ امْرِئٍ مِّنْهُمْ يَوْمَئِذٍ شَأْنٌ يُغْنِيهِ",
    "وُجُوهٌ يَوْمَئِذٍ مُّسْفِرَةٌ",
    "ضَاحِكَةٌ مُّسْتَبْشِرَةٌ",
    "وَوُجُوهٌ يَوْمَئِذٍ عَلَيْهَا غَبَرَةٌ",
    "تَرْهَقُهَا قَتَرَةٌ",
    "أُولَٰئِكَ هُمُ الْكَفَرَةُ الْفَجَرَةُ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International"};

    String [] english_verses = {"The Prophet frowned and turned away",
    "Because there came to him the blind man, [interrupting].",
    "But what would make you perceive, [O Muhammad], that perhaps he might be purified",
    "Or be reminded and the remembrance would benefit him?",
    "As for he who thinks himself without need,",
    "To him you give attention.",
    "And not upon you [is any blame] if he will not be purified.",
    "But as for he who came to you striving [for knowledge]",
    "While he fears [Allah],",
    "From him you are distracted.",
    "No! Indeed, these verses are a reminder;",
    "So whoever wills may remember it.",
    "[It is recorded] in honored sheets,",
    "Exalted and purified,",
    "[Carried] by the hands of messenger-angels,",
    "Noble and dutiful.",
    "Cursed is man; how disbelieving is he.",
    "From what substance did He create him?",
    "From a sperm-drop He created him and destined for him;",
    "Then He eased the way for him;",
    "Then He causes his death and provides a grave for him.",
    "Then when He wills, He will resurrect him.",
    "No! Man has not yet accomplished what He commanded him.",
    "Then let mankind look at his food -",
    "How We poured down water in torrents,",
    "Then We broke open the earth, splitting [it with sprouts],",
    "And caused to grow within it grain",
    "And grapes and herbage",
    "And olive and palm trees",
    "And gardens of dense shrubbery",
    "And fruit and grass -",
    "[As] enjoyment for you and your grazing livestock.",
    "But when there comes the Deafening Blast",
    "On the Day a man will flee from his brother",
    "And his mother and his father",
    "And his wife and his children,",
    "For every man, that Day, will be a matter adequate for him.",
    "[Some] faces, that Day, will be bright -",
    "Laughing, rejoicing at good news.",
    "And [other] faces, that Day, will have upon them dust.",
    "Blackness will cover them.",
    "Those are the disbelievers, the wicked ones."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abasa);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_abasa);
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
