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

public class Al_Munafiqun extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"63:1", "63:2", "63:3", "63:4", "63:5", "63:6", "63:7", "63:8", "63:9", "63:10", "63:11"};

    String [] arabic_verses = {"إِذَا جَاءَكَ الْمُنَافِقُونَ قَالُوا نَشْهَدُ إِنَّكَ لَرَسُولُ اللَّهِ ۗ وَاللَّهُ يَعْلَمُ إِنَّكَ لَرَسُولُهُ وَاللَّهُ يَشْهَدُ إِنَّ الْمُنَافِقِينَ لَكَاذِبُونَ",
    "اتَّخَذُوا أَيْمَانَهُمْ جُنَّةً فَصَدُّوا عَن سَبِيلِ اللَّهِ ۚ إِنَّهُمْ سَاءَ مَا كَانُوا يَعْمَلُونَ",
    "ذَٰلِكَ بِأَنَّهُمْ آمَنُوا ثُمَّ كَفَرُوا فَطُبِعَ عَلَىٰ قُلُوبِهِمْ فَهُمْ لَا يَفْقَهُونَ",
    "وَإِذَا رَأَيْتَهُمْ تُعْجِبُكَ أَجْسَامُهُمْ ۖ وَإِن يَقُولُوا تَسْمَعْ لِقَوْلِهِمْ ۖ كَأَنَّهُمْ خُشُبٌ مُّسَنَّدَةٌ ۖ يَحْسَبُونَ كُلَّ صَيْحَةٍ عَلَيْهِمْ ۚ هُمُ الْعَدُوُّ فَاحْذَرْهُمْ ۚ قَاتَلَهُمُ اللَّهُ ۖ أَنَّىٰ يُؤْفَكُونَ",
    "وَإِذَا قِيلَ لَهُمْ تَعَالَوْا يَسْتَغْفِرْ لَكُمْ رَسُولُ اللَّهِ لَوَّوْا رُءُوسَهُمْ وَرَأَيْتَهُمْ يَصُدُّونَ وَهُم مُّسْتَكْبِرُونَ",
    "سَوَاءٌ عَلَيْهِمْ أَسْتَغْفَرْتَ لَهُمْ أَمْ لَمْ تَسْتَغْفِرْ لَهُمْ لَن يَغْفِرَ اللَّهُ لَهُمْ ۚ إِنَّ اللَّهَ لَا يَهْدِي الْقَوْمَ الْفَاسِقِينَ",
    "هُمُ الَّذِينَ يَقُولُونَ لَا تُنفِقُوا عَلَىٰ مَنْ عِندَ رَسُولِ اللَّهِ حَتَّىٰ يَنفَضُّوا ۗ وَلِلَّهِ خَزَائِنُ السَّمَاوَاتِ وَالْأَرْضِ وَلَٰكِنَّ الْمُنَافِقِينَ لَا يَفْقَهُونَ",
    "يَقُولُونَ لَئِن رَّجَعْنَا إِلَى الْمَدِينَةِ لَيُخْرِجَنَّ الْأَعَزُّ مِنْهَا الْأَذَلَّ ۚ وَلِلَّهِ الْعِزَّةُ وَلِرَسُولِهِ وَلِلْمُؤْمِنِينَ وَلَٰكِنَّ الْمُنَافِقِينَ لَا يَعْلَمُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تُلْهِكُمْ أَمْوَالُكُمْ وَلَا أَوْلَادُكُمْ عَن ذِكْرِ اللَّهِ ۚ وَمَن يَفْعَلْ ذَٰلِكَ فَأُولَٰئِكَ هُمُ الْخَاسِرُونَ",
    "وَأَنفِقُوا مِن مَّا رَزَقْنَاكُم مِّن قَبْلِ أَن يَأْتِيَ أَحَدَكُمُ الْمَوْتُ فَيَقُولَ رَبِّ لَوْلَا أَخَّرْتَنِي إِلَىٰ أَجَلٍ قَرِيبٍ فَأَصَّدَّقَ وَأَكُن مِّنَ الصَّالِحِينَ",
    "وَلَن يُؤَخِّرَ اللَّهُ نَفْسًا إِذَا جَاءَ أَجَلُهَا ۚ وَاللَّهُ خَبِيرٌ بِمَا تَعْمَلُونَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International"};

    String [] english_verses = {"When the hypocrites come to you, [O Muhammad], they say, \"We testify that you are the Messenger of Allah.\" And Allah knows that you are His Messenger, and Allah testifies that the hypocrites are liars.",
    "They have taken their oaths as a cover, so they averted [people] from the way of Allah. Indeed, it was evil that they were doing.",
    "That is because they believed, and then they disbelieved; so their hearts were sealed over, and they do not understand.",
    "And when you see them, their forms please you, and if they speak, you listen to their speech. [They are] as if they were pieces of wood propped up - they think that every shout is against them. They are the enemy, so beware of them. May Allah destroy them; how are they deluded?",
    "And when it is said to them, \"Come, the Messenger of Allah will ask forgiveness for you,\" they turn their heads aside and you see them evading while they are arrogant.",
    "It is all the same for them whether you ask forgiveness for them or do not ask forgiveness for them; never will Allah forgive them. Indeed, Allah does not guide the defiantly disobedient people.",
    "They are the ones who say, \"Do not spend on those who are with the Messenger of Allah until they disband.\" And to Allah belongs the depositories of the heavens and the earth, but the hypocrites do not understand.",
    "They say, \"If we return to al-Madinah, the more honored [for power] will surely expel therefrom the more humble.\" And to Allah belongs [all] honor, and to His Messenger, and to the believers, but the hypocrites do not know.",
    "O you who have believed, let not your wealth and your children divert you from remembrance of Allah. And whoever does that - then those are the losers.",
    "And spend [in the way of Allah] from what We have provided you before death approaches one of you and he says, \"My Lord, if only You would delay me for a brief term so I would give charity and be among the righteous.\"",
    "But never will Allah delay a soul when its time has come. And Allah is Acquainted with what you do."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__munafiqun);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_munafiqun);
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
