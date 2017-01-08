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

public class Al_Fajr extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"89:1", "89:2", "89:3", "89:4", "89:5", "89:6", "89:7", "89:8", "89:9", "89:10", "89:11", "89:12", "89:13", "89:14", "89:15", "89:16",
            "89:17", "89:18", "89:19", "89:20", "89:21", "89:22", "89:23", "89:24", "89:25", "89:26", "89:27", "89:28", "89:29", "89:30"};

    String [] arabic_verses = {"وَالْفَجْرِ",
    "وَلَيَالٍ عَشْرٍ",
    "وَالشَّفْعِ وَالْوَتْرِ",
    "وَاللَّيْلِ إِذَا يَسْرِ",
    "هَلْ فِي ذَٰلِكَ قَسَمٌ لِّذِي حِجْرٍ",
    "أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِعَادٍ",
    "إِرَمَ ذَاتِ الْعِمَادِ",
    "الَّتِي لَمْ يُخْلَقْ مِثْلُهَا فِي الْبِلَادِ",
    "وَثَمُودَ الَّذِينَ جَابُوا الصَّخْرَ بِالْوَادِ",
    "وَفِرْعَوْنَ ذِي الْأَوْتَادِ",
    "الَّذِينَ طَغَوْا فِي الْبِلَادِ",
    "فَأَكْثَرُوا فِيهَا الْفَسَادَ",
    "فَصَبَّ عَلَيْهِمْ رَبُّكَ سَوْطَ عَذَابٍ",
    "إِنَّ رَبَّكَ لَبِالْمِرْصَادِ",
    "فَأَمَّا الْإِنسَانُ إِذَا مَا ابْتَلَاهُ رَبُّهُ فَأَكْرَمَهُ وَنَعَّمَهُ فَيَقُولُ رَبِّي أَكْرَمَنِ",
    "وَأَمَّا إِذَا مَا ابْتَلَاهُ فَقَدَرَ عَلَيْهِ رِزْقَهُ فَيَقُولُ رَبِّي أَهَانَنِ",
    "كَلَّا ۖ بَل لَّا تُكْرِمُونَ الْيَتِيمَ",
    "وَلَا تَحَاضُّونَ عَلَىٰ طَعَامِ الْمِسْكِينِ",
    "وَتَأْكُلُونَ التُّرَاثَ أَكْلًا لَّمًّا",
    "وَتُحِبُّونَ الْمَالَ حُبًّا جَمًّا",
    "كَلَّا إِذَا دُكَّتِ الْأَرْضُ دَكًّا دَكًّا",
    "وَجَاءَ رَبُّكَ وَالْمَلَكُ صَفًّا صَفًّا",
    "وَجِيءَ يَوْمَئِذٍ بِجَهَنَّمَ ۚ يَوْمَئِذٍ يَتَذَكَّرُ الْإِنسَانُ وَأَنَّىٰ لَهُ الذِّكْرَىٰ",
    "يَقُولُ يَا لَيْتَنِي قَدَّمْتُ لِحَيَاتِي",
    "فَيَوْمَئِذٍ لَّا يُعَذِّبُ عَذَابَهُ أَحَدٌ",
    "وَلَا يُوثِقُ وَثَاقَهُ أَحَدٌ",
    "يَا أَيَّتُهَا النَّفْسُ الْمُطْمَئِنَّةُ",
    "ارْجِعِي إِلَىٰ رَبِّكِ رَاضِيَةً مَّرْضِيَّةً",
    "فَادْخُلِي فِي عِبَادِي",
    "وَادْخُلِي جَنَّتِي"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"By the dawn",
    "And [by] ten nights",
    "And [by] the even [number] and the odd",
    "And [by] the night when it passes,",
    "Is there [not] in [all] that an oath [sufficient] for one of perception?",
    "Have you not considered how your Lord dealt with 'Aad -",
    "[With] Iram - who had lofty pillars,",
    "The likes of whom had never been created in the land?",
    "And [with] Thamud, who carved out the rocks in the valley?",
    "And [with] Pharaoh, owner of the stakes? -",
    "[All of] whom oppressed within the lands",
    "And increased therein the corruption.",
    "So your Lord poured upon them a scourge of punishment.",
    "Indeed, your Lord is in observation.",
    "And as for man, when his Lord tries him and [thus] is generous to him and favors him, he says, \"My Lord has honored me.\"",
    "But when He tries him and restricts his provision, he says, \"My Lord has humiliated me.\"",
    "No! But you do not honor the orphan",
    "And you do not encourage one another to feed the poor.",
    "And you consume inheritance, devouring [it] altogether,",
    "And you love wealth with immense love.",
    "No! When the earth has been leveled - pounded and crushed -",
    "And your Lord has come and the angels, rank upon rank,",
    "And brought [within view], that Day, is Hell - that Day, man will remember, but what good to him will be the remembrance?",
    "He will say, \"Oh, I wish I had sent ahead [some good] for my life.\"",
    "So on that Day, none will punish [as severely] as His punishment,",
    "And none will bind [as severely] as His binding [of the evildoers].",
    "[To the righteous it will be said], \"O reassured soul,",
    "Return to your Lord, well-pleased and pleasing [to Him],",
    "And enter among My [righteous] servants",
    "And enter My Paradise.\""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__fajr);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_fajr);
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
