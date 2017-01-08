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

public class Al_Qariah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses  = {"101:1", "101:2", "101:3", "101:4", "101:5", "101:6", "101:7", "101:8", "101:9", "101:10", "101:11"};

    String [] arabic_verses = {"الْقَارِعَةُ",
    "مَا الْقَارِعَةُ",
    "وَمَا أَدْرَاكَ مَا الْقَارِعَةُ",
    "يَوْمَ يَكُونُ النَّاسُ كَالْفَرَاشِ الْمَبْثُوثِ",
    "وَتَكُونُ الْجِبَالُ كَالْعِهْنِ الْمَنفُوشِ",
    "فَأَمَّا مَن ثَقُلَتْ مَوَازِينُهُ",
    "فَهُوَ فِي عِيشَةٍ رَّاضِيَةٍ",
    "وَأَمَّا مَنْ خَفَّتْ مَوَازِينُهُ",
    "فَأُمُّهُ هَاوِيَةٌ",
    "وَمَا أَدْرَاكَ مَا هِيَهْ",
    "نَارٌ حَامِيَةٌ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International"};

    String [] english_verses = {"The Striking Calamity -",
    "What is the Striking Calamity?",
    "And what can make you know what is the Striking Calamity?",
    "It is the Day when people will be like moths, dispersed,",
    "And the mountains will be like wool, fluffed up.",
    "Then as for one whose scales are heavy [with good deeds],",
    "He will be in a pleasant life.",
    "But as for one whose scales are light,",
    "His refuge will be an abyss.",
    "And what can make you know what that is?",
    "It is a Fire, intensely hot."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__qariah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_qariah);
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
