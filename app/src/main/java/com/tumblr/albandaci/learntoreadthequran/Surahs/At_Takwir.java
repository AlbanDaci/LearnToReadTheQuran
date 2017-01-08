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

public class At_Takwir extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"81:1", "81:2", "81:3", "81:4", "81:5", "81:6", "81:7", "81:8", "81:9", "81:10", "81:11", "81:12", "81:13", "81:14", "81:15", "81:16",
            "81:17", "81:18", "81:19", "81:20", "81:21", "81:22", "81:23", "81:24", "81:25", "81:26", "81:27", "81:28", "81:29"};

    String [] arabic_verses = {"إِذَا الشَّمْسُ كُوِّرَتْ",
    "وَإِذَا النُّجُومُ انكَدَرَتْ",
    "وَإِذَا الْجِبَالُ سُيِّرَتْ",
    "وَإِذَا الْعِشَارُ عُطِّلَتْ",
    "وَإِذَا الْوُحُوشُ حُشِرَتْ",
    "وَإِذَا الْبِحَارُ سُجِّرَتْ",
    "وَإِذَا النُّفُوسُ زُوِّجَتْ",
    "وَإِذَا الْمَوْءُودَةُ سُئِلَتْ",
    "بِأَيِّ ذَنبٍ قُتِلَتْ",
    "وَإِذَا الصُّحُفُ نُشِرَتْ",
    "وَإِذَا السَّمَاءُ كُشِطَتْ",
    "وَإِذَا الْجَحِيمُ سُعِّرَتْ",
    "وَإِذَا الْجَنَّةُ أُزْلِفَتْ",
    "عَلِمَتْ نَفْسٌ مَّا أَحْضَرَتْ",
    "فَلَا أُقْسِمُ بِالْخُنَّسِ",
    "الْجَوَارِ الْكُنَّسِ",
    "وَاللَّيْلِ إِذَا عَسْعَسَ",
    "وَالصُّبْحِ إِذَا تَنَفَّسَ",
    "إِنَّهُ لَقَوْلُ رَسُولٍ كَرِيمٍ",
    "ذِي قُوَّةٍ عِندَ ذِي الْعَرْشِ مَكِينٍ",
    "مُّطَاعٍ ثَمَّ أَمِينٍ",
    "وَمَا صَاحِبُكُم بِمَجْنُونٍ",
    "وَلَقَدْ رَآهُ بِالْأُفُقِ الْمُبِينِ",
    "وَمَا هُوَ عَلَى الْغَيْبِ بِضَنِينٍ",
    "وَمَا هُوَ بِقَوْلِ شَيْطَانٍ رَّجِيمٍ",
    "فَأَيْنَ تَذْهَبُونَ",
    "إِنْ هُوَ إِلَّا ذِكْرٌ لِّلْعَالَمِينَ",
    "لِمَن شَاءَ مِنكُمْ أَن يَسْتَقِيمَ",
    "وَمَا تَشَاءُونَ إِلَّا أَن يَشَاءَ اللَّهُ رَبُّ الْعَالَمِينَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"When the sun is wrapped up [in darkness]",
    "And when the stars fall, dispersing,",
    "And when the mountains are removed",
    "And when full-term she-camels are neglected",
    "And when the wild beasts are gathered",
    "And when the seas are filled with flame",
    "And when the souls are paired",
    "And when the girl [who was] buried alive is asked",
    "For what sin she was killed",
    "And when the pages are made public",
    "And when the sky is stripped away",
    "And when Hellfire is set ablaze",
    "And when Paradise is brought near,",
    "A soul will [then] know what it has brought [with it].",
    "So I swear by the retreating stars -",
    "Those that run [their courses] and disappear -",
    "And by the night as it closes in",
    "And by the dawn when it breathes",
    "[That] indeed, the Qur'an is a word [conveyed by] a noble messenger",
    "[Who is] possessed of power and with the Owner of the Throne, secure [in position],",
    "Obeyed there [in the heavens] and trustworthy.",
    "And your companion is not [at all] mad.",
    "And he has already seen Gabriel in the clear horizon.",
    "And Muhammad is not a withholder of [knowledge of] the unseen.",
    "And the Qur'an is not the word of a devil, expelled [from the heavens].",
    "So where are you going?",
    "It is not except a reminder to the worlds",
    "For whoever wills among you to take a right course.",
    "And you do not will except that Allah wills - Lord of the worlds."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at__takwir);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_at_takwir);
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
