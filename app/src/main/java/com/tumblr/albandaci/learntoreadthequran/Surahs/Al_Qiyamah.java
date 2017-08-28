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

public class Al_Qiyamah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"75:1", "75:2", "75:3", "75:4", "75:5", "75:6", "75:7", "75:8", "75:9", "75:10", "75:11", "75:12", "75:13", "75:14", "75:15", "75:16",
            "75:17", "75:18", "75:19", "75:20", "75:21", "75:22", "75:23", "75:24", "75:25", "75:26", "75:27", "75:28", "75:29", "75:30", "75:31", "75:32",
            "75:33", "75:34", "75:35", "75:36", "75:37", "75:38", "75:39", "75:40", ""};

    String [] arabic_verses = {"لَا أُقْسِمُ بِيَوْمِ الْقِيَامَةِ",
    "وَلَا أُقْسِمُ بِالنَّفْسِ اللَّوَّامَةِ",
    "أَيَحْسَبُ الْإِنسَانُ أَلَّن نَّجْمَعَ عِظَامَهُ",
    "بَلَىٰ قَادِرِينَ عَلَىٰ أَن نُّسَوِّيَ بَنَانَهُ",
    "بَلْ يُرِيدُ الْإِنسَانُ لِيَفْجُرَ أَمَامَهُ",
    "يَسْأَلُ أَيَّانَ يَوْمُ الْقِيَامَةِ",
    "فَإِذَا بَرِقَ الْبَصَرُ",
    "وَخَسَفَ الْقَمَرُ",
    "وَجُمِعَ الشَّمْسُ وَالْقَمَرُ",
    "يَقُولُ الْإِنسَانُ يَوْمَئِذٍ أَيْنَ الْمَفَرُّ",
    "كَلَّا لَا وَزَرَ",
    "إِلَىٰ رَبِّكَ يَوْمَئِذٍ الْمُسْتَقَرُّ",
    "يُنَبَّأُ الْإِنسَانُ يَوْمَئِذٍ بِمَا قَدَّمَ وَأَخَّرَ",
    "بَلِ الْإِنسَانُ عَلَىٰ نَفْسِهِ بَصِيرَةٌ",
    "وَلَوْ أَلْقَىٰ مَعَاذِيرَهُ",
    "لَا تُحَرِّكْ بِهِ لِسَانَكَ لِتَعْجَلَ بِهِ",
    "إِنَّ عَلَيْنَا جَمْعَهُ وَقُرْآنَهُ",
    "فَإِذَا قَرَأْنَاهُ فَاتَّبِعْ قُرْآنَهُ",
    "ثُمَّ إِنَّ عَلَيْنَا بَيَانَهُ",
    "كَلَّا بَلْ تُحِبُّونَ الْعَاجِلَةَ",
    "وَتَذَرُونَ الْآخِرَةَ",
    "وُجُوهٌ يَوْمَئِذٍ نَّاضِرَةٌ",
    "إِلَىٰ رَبِّهَا نَاظِرَةٌ",
    "وَوُجُوهٌ يَوْمَئِذٍ بَاسِرَةٌ",
    "تَظُنُّ أَن يُفْعَلَ بِهَا فَاقِرَةٌ",
    "كَلَّا إِذَا بَلَغَتِ التَّرَاقِيَ",
    "وَقِيلَ مَنْ ۜ رَاقٍ",
    "وَظَنَّ أَنَّهُ الْفِرَاقُ",
    "وَالْتَفَّتِ السَّاقُ بِالسَّاقِ",
    "إِلَىٰ رَبِّكَ يَوْمَئِذٍ الْمَسَاقُ",
    "فَلَا صَدَّقَ وَلَا صَلَّىٰ",
    "وَلَٰكِن كَذَّبَ وَتَوَلَّىٰ",
    "ثُمَّ ذَهَبَ إِلَىٰ أَهْلِهِ يَتَمَطَّىٰ",
    "أَوْلَىٰ لَكَ فَأَوْلَىٰ",
    "ثُمَّ أَوْلَىٰ لَكَ فَأَوْلَىٰ",
    "أَيَحْسَبُ الْإِنسَانُ أَن يُتْرَكَ سُدًى",
    "أَلَمْ يَكُ نُطْفَةً مِّن مَّنِيٍّ يُمْنَىٰ",
    "ثُمَّ كَانَ عَلَقَةً فَخَلَقَ فَسَوَّىٰ",
    "فَجَعَلَ مِنْهُ الزَّوْجَيْنِ الذَّكَرَ وَالْأُنثَىٰ",
    "أَلَيْسَ ذَٰلِكَ بِقَادِرٍ عَلَىٰ أَن يُحْيِيَ الْمَوْتَىٰ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"I swear by the Day of Resurrection",
    "And I swear by the reproaching soul [to the certainty of resurrection].",
    "Does man think that We will not assemble his bones?",
    "Yes. [We are] Able [even] to proportion his fingertips.",
    "But man desires to continue in sin.",
    "He asks, \"When is the Day of Resurrection?\"",
    "So when vision is dazzled",
    "And the moon darkens",
    "And the sun and the moon are joined,",
    "Man will say on that Day, \"Where is the [place of] escape?\"",
    "No! There is no refuge.",
    "To your Lord, that Day, is the [place of] permanence.",
    "Man will be informed that Day of what he sent ahead and kept back.",
    "Rather, man, against himself, will be a witness,",
    "Even if he presents his excuses.",
    "Move not your tongue with it, [O Muhammad], to hasten with recitation of the Qur'an.",
    "Indeed, upon Us is its collection [in your heart] and [to make possible] its recitation.",
    "So when We have recited it [through Gabriel], then follow its recitation.",
    "Then upon Us is its clarification [to you].",
    "No! But you love the immediate",
    "And leave the Hereafter.",
    "[Some] faces, that Day, will be radiant,",
    "Looking at their Lord.",
    "And [some] faces, that Day, will be contorted,",
    "Expecting that there will be done to them [something] backbreaking.",
    "No! When the soul has reached the collar bones",
    "And it is said, \"Who will cure [him]?\"",
    "And the dying one is certain that it is the [time of] separation",
    "And the leg is wound about the leg,",
    "To your Lord, that Day, will be the procession.",
    "And the disbeliever had not believed, nor had he prayed.",
    "But [instead], he denied and turned away.",
    "And then he went to his people, swaggering [in pride].",
    "Woe to you, and woe!",
    "Then woe to you, and woe!",
    "Does man think that he will be left neglected?",
    "Had he not been a sperm from semen emitted?",
    "Then he was a clinging clot, and [Allah] created [his form] and proportioned [him]",
    "And made of him two mates, the male and the female.",
    "Is not that [Creator] Able to give life to the dead?",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__qiyamah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_qiyamah);
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
