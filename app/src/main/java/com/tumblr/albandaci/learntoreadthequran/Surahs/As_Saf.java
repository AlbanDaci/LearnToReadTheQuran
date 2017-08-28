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

public class As_Saf extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"61:1", "61:2", "61:3", "61:4", "61:5", "61:6", "61:7", "61:8", "61:9", "61:10", "61:11", "61:12", "61:13", "61:14", ""};

    String [] arabic_verses = {"سَبَّحَ لِلَّهِ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۖ وَهُوَ الْعَزِيزُ الْحَكِيمُ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لِمَ تَقُولُونَ مَا لَا تَفْعَلُونَ",
    "كَبُرَ مَقْتًا عِندَ اللَّهِ أَن تَقُولُوا مَا لَا تَفْعَلُونَ",
    "إِنَّ اللَّهَ يُحِبُّ الَّذِينَ يُقَاتِلُونَ فِي سَبِيلِهِ صَفًّا كَأَنَّهُم بُنْيَانٌ مَّرْصُوصٌ",
    "وَإِذْ قَالَ مُوسَىٰ لِقَوْمِهِ يَا قَوْمِ لِمَ تُؤْذُونَنِي وَقَد تَّعْلَمُونَ أَنِّي رَسُولُ اللَّهِ إِلَيْكُمْ ۖ فَلَمَّا زَاغُوا أَزَاغَ اللَّهُ قُلُوبَهُمْ ۚ وَاللَّهُ لَا يَهْدِي الْقَوْمَ الْفَاسِقِينَ",
    "وَإِذْ قَالَ عِيسَى ابْنُ مَرْيَمَ يَا بَنِي إِسْرَائِيلَ إِنِّي رَسُولُ اللَّهِ إِلَيْكُم مُّصَدِّقًا لِّمَا بَيْنَ يَدَيَّ مِنَ التَّوْرَاةِ وَمُبَشِّرًا بِرَسُولٍ يَأْتِي مِن بَعْدِي اسْمُهُ أَحْمَدُ ۖ فَلَمَّا جَاءَهُم بِالْبَيِّنَاتِ قَالُوا هَٰذَا سِحْرٌ مُّبِينٌ",
    "وَمَنْ أَظْلَمُ مِمَّنِ افْتَرَىٰ عَلَى اللَّهِ الْكَذِبَ وَهُوَ يُدْعَىٰ إِلَى الْإِسْلَامِ ۚ وَاللَّهُ لَا يَهْدِي الْقَوْمَ الظَّالِمِينَ",
    "يُرِيدُونَ لِيُطْفِئُوا نُورَ اللَّهِ بِأَفْوَاهِهِمْ وَاللَّهُ مُتِمُّ نُورِهِ وَلَوْ كَرِهَ الْكَافِرُونَ",
    "هُوَ الَّذِي أَرْسَلَ رَسُولَهُ بِالْهُدَىٰ وَدِينِ الْحَقِّ لِيُظْهِرَهُ عَلَى الدِّينِ كُلِّهِ وَلَوْ كَرِهَ الْمُشْرِكُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا هَلْ أَدُلُّكُمْ عَلَىٰ تِجَارَةٍ تُنجِيكُم مِّنْ عَذَابٍ أَلِيمٍ",
    "تُؤْمِنُونَ بِاللَّهِ وَرَسُولِهِ وَتُجَاهِدُونَ فِي سَبِيلِ اللَّهِ بِأَمْوَالِكُمْ وَأَنفُسِكُمْ ۚ ذَٰلِكُمْ خَيْرٌ لَّكُمْ إِن كُنتُمْ تَعْلَمُونَ",
    "يَغْفِرْ لَكُمْ ذُنُوبَكُمْ وَيُدْخِلْكُمْ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ وَمَسَاكِنَ طَيِّبَةً فِي جَنَّاتِ عَدْنٍ ۚ ذَٰلِكَ الْفَوْزُ الْعَظِيمُ",
    "وَأُخْرَىٰ تُحِبُّونَهَا ۖ نَصْرٌ مِّنَ اللَّهِ وَفَتْحٌ قَرِيبٌ ۗ وَبَشِّرِ الْمُؤْمِنِينَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا كُونُوا أَنصَارَ اللَّهِ كَمَا قَالَ عِيسَى ابْنُ مَرْيَمَ لِلْحَوَارِيِّينَ مَنْ أَنصَارِي إِلَى اللَّهِ ۖ قَالَ الْحَوَارِيُّونَ نَحْنُ أَنصَارُ اللَّهِ ۖ فَآمَنَت طَّائِفَةٌ مِّن بَنِي إِسْرَائِيلَ وَكَفَرَت طَّائِفَةٌ ۖ فَأَيَّدْنَا الَّذِينَ آمَنُوا عَلَىٰ عَدُوِّهِمْ فَأَصْبَحُوا ظَاهِرِينَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Whatever is in the heavens and whatever is on the earth exalts Allah, and He is the Exalted in Might, the Wise.",
    "O you who have believed, why do you say what you do not do?",
    "Great is hatred in the sight of Allah that you say what you do not do.",
    "Indeed, Allah loves those who fight in His cause in a row as though they are a [single] structure joined firmly.",
    "And [mention, O Muhammad], when Moses said to his people, \"O my people, why do you harm me while you certainly know that I am the messenger of Allah to you?\" And when they deviated, Allah caused their hearts to deviate. And Allah does not guide the defiantly disobedient people.",
    "And [mention] when Jesus, the son of Mary, said, \"O children of Israel, indeed I am the messenger of Allah to you confirming what came before me of the Torah and bringing good tidings of a messenger to come after me, whose name is Ahmad.\" But when he came to them with clear evidences, they said, \"This is obvious magic.\"",
    "And who is more unjust than one who invents about Allah untruth while he is being invited to Islam. And Allah does not guide the wrongdoing people.",
    "They want to extinguish the light of Allah with their mouths, but Allah will perfect His light, although the disbelievers dislike it.",
    "It is He who sent His Messenger with guidance and the religion of truth to manifest it over all religion, although those who associate others with Allah dislike it.",
    "O you who have believed, shall I guide you to a transaction that will save you from a painful punishment?",
    "[It is that] you believe in Allah and His Messenger and strive in the cause of Allah with your wealth and your lives. That is best for you, if you should know.",
    "He will forgive for you your sins and admit you to gardens beneath which rivers flow and pleasant dwellings in gardens of perpetual residence. That is the great attainment.",
    "And [you will obtain] another [favor] that you love - victory from Allah and an imminent conquest; and give good tidings to the believers.",
    "O you who have believed, be supporters of Allah, as when Jesus, the son of Mary, said to the disciples, \"Who are my supporters for Allah?\" The disciples said, \"We are supporters of Allah.\" And a faction of the Children of Israel believed and a faction disbelieved. So We supported those who believed against their enemy, and they became dominant.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_as__saf);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_as_saf);
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
