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

public class Ar_Rahman extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"55:1", "55:2", "55:3", "55:4", "55:5", "55:6", "55:7", "55:8", "55:9", "55:10", "55:11", "55:12", "55:13", "55:14", "55:15", "55:16",
            "55:17", "55:18", "55:19", "55:20", "55:21", "55:22", "55:23", "55:24", "55:25", "55:26", "55:27", "55:28", "55:29", "55:30", "55:31", "55:32",
            "55:33", "55:34", "55:35", "55:36", "55:37", "55:38", "55:39", "55:40", "55:41", "55:42", "55:43", "55:44", "55:45", "55:46", "55:47", "55:48",
            "55:49", "55:50", "55:51", "55:52", "55:53", "55:54", "55:55", "55:56", "55:57", "55:58", "55:59", "55:60", "55:61", "55:62", "55:63", "55:64",
            "55:65", "55:66", "55:67", "55:68", "55:69", "55:70", "55:71", "55:72", "55:73", "55:74", "55:75", "55:76", "55:77", "55:78", ""};

    String [] arabic_verses= {"الرَّحْمَٰنُ",
    "عَلَّمَ الْقُرْآنَ",
    "خَلَقَ الْإِنسَانَ",
    "عَلَّمَهُ الْبَيَانَ",
    "الشَّمْسُ وَالْقَمَرُ بِحُسْبَانٍ",
    "وَالنَّجْمُ وَالشَّجَرُ يَسْجُدَانِ",
    "وَالسَّمَاءَ رَفَعَهَا وَوَضَعَ الْمِيزَانَ",
    "أَلَّا تَطْغَوْا فِي الْمِيزَانِ",
    "وَأَقِيمُوا الْوَزْنَ بِالْقِسْطِ وَلَا تُخْسِرُوا الْمِيزَانَ",
    "وَالْأَرْضَ وَضَعَهَا لِلْأَنَامِ",
    "فِيهَا فَاكِهَةٌ وَالنَّخْلُ ذَاتُ الْأَكْمَامِ",
    "وَالْحَبُّ ذُو الْعَصْفِ وَالرَّيْحَانُ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "خَلَقَ الْإِنسَانَ مِن صَلْصَالٍ كَالْفَخَّارِ",
    "وَخَلَقَ الْجَانَّ مِن مَّارِجٍ مِّن نَّارٍ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "رَبُّ الْمَشْرِقَيْنِ وَرَبُّ الْمَغْرِبَيْنِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "مَرَجَ الْبَحْرَيْنِ يَلْتَقِيَانِ",
    "بَيْنَهُمَا بَرْزَخٌ لَّا يَبْغِيَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "يَخْرُجُ مِنْهُمَا اللُّؤْلُؤُ وَالْمَرْجَانُ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "وَلَهُ الْجَوَارِ الْمُنشَآتُ فِي الْبَحْرِ كَالْأَعْلَامِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "كُلُّ مَنْ عَلَيْهَا فَانٍ",
    "وَيَبْقَىٰ وَجْهُ رَبِّكَ ذُو الْجَلَالِ وَالْإِكْرَامِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "يَسْأَلُهُ مَن فِي السَّمَاوَاتِ وَالْأَرْضِ ۚ كُلَّ يَوْمٍ هُوَ فِي شَأْنٍ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "سَنَفْرُغُ لَكُمْ أَيُّهَ الثَّقَلَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "يَا مَعْشَرَ الْجِنِّ وَالْإِنسِ إِنِ اسْتَطَعْتُمْ أَن تَنفُذُوا مِنْ أَقْطَارِ السَّمَاوَاتِ وَالْأَرْضِ فَانفُذُوا ۚ لَا تَنفُذُونَ إِلَّا بِسُلْطَانٍ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "يُرْسَلُ عَلَيْكُمَا شُوَاظٌ مِّن نَّارٍ وَنُحَاسٌ فَلَا تَنتَصِرَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "فَإِذَا انشَقَّتِ السَّمَاءُ فَكَانَتْ وَرْدَةً كَالدِّهَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "فَيَوْمَئِذٍ لَّا يُسْأَلُ عَن ذَنبِهِ إِنسٌ وَلَا جَانٌّ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "يُعْرَفُ الْمُجْرِمُونَ بِسِيمَاهُمْ فَيُؤْخَذُ بِالنَّوَاصِي وَالْأَقْدَامِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "هَٰذِهِ جَهَنَّمُ الَّتِي يُكَذِّبُ بِهَا الْمُجْرِمُونَ",
    "يَطُوفُونَ بَيْنَهَا وَبَيْنَ حَمِيمٍ آنٍ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "وَلِمَنْ خَافَ مَقَامَ رَبِّهِ جَنَّتَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "ذَوَاتَا أَفْنَانٍ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "فِيهِمَا عَيْنَانِ تَجْرِيَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "فِيهِمَا مِن كُلِّ فَاكِهَةٍ زَوْجَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "مُتَّكِئِينَ عَلَىٰ فُرُشٍ بَطَائِنُهَا مِنْ إِسْتَبْرَقٍ ۚ وَجَنَى الْجَنَّتَيْنِ دَانٍ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "فِيهِنَّ قَاصِرَاتُ الطَّرْفِ لَمْ يَطْمِثْهُنَّ إِنسٌ قَبْلَهُمْ وَلَا جَانٌّ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "كَأَنَّهُنَّ الْيَاقُوتُ وَالْمَرْجَانُ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "هَلْ جَزَاءُ الْإِحْسَانِ إِلَّا الْإِحْسَانُ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "وَمِن دُونِهِمَا جَنَّتَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "مُدْهَامَّتَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "فِيهِمَا عَيْنَانِ نَضَّاخَتَانِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "فِيهِمَا فَاكِهَةٌ وَنَخْلٌ وَرُمَّانٌ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "فِيهِنَّ خَيْرَاتٌ حِسَانٌ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "حُورٌ مَّقْصُورَاتٌ فِي الْخِيَامِ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "لَمْ يَطْمِثْهُنَّ إِنسٌ قَبْلَهُمْ وَلَا جَانٌّ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "مُتَّكِئِينَ عَلَىٰ رَفْرَفٍ خُضْرٍ وَعَبْقَرِيٍّ حِسَانٍ",
    "فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ",
    "تَبَارَكَ اسْمُ رَبِّكَ ذِي الْجَلَالِ وَالْإِكْرَامِ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"The Most Merciful",
    "Taught the Qur'an,",
    "Created man,",
    "[And] taught him eloquence.",
    "The sun and the moon [move] by precise calculation,",
    "And the stars and trees prostrate.",
    "And the heaven He raised and imposed the balance",
    "That you not transgress within the balance.",
    "And establish weight in justice and do not make deficient the balance.",
    "And the earth He laid [out] for the creatures.",
    "Therein is fruit and palm trees having sheaths [of dates]",
    "And grain having husks and scented plants.",
    "So which of the favors of your Lord would you deny?",
    "He created man from clay like [that of] pottery.",
    "And He created the jinn from a smokeless flame of fire.",
    "So which of the favors of your Lord would you deny?",
    "[He is] Lord of the two sunrises and Lord of the two sunsets.",
    "So which of the favors of your Lord would you deny?",
    "He released the two seas, meeting [side by side];",
    "Between them is a barrier [so] neither of them transgresses.",
    "So which of the favors of your Lord would you deny?",
    "From both of them emerge pearl and coral.",
    "So which of the favors of your Lord would you deny?",
    "And to Him belong the ships [with sails] elevated in the sea like mountains.",
    "So which of the favors of your Lord would you deny?",
    "Everyone upon the earth will perish,",
    "And there will remain the Face of your Lord, Owner of Majesty and Honor.",
    "So which of the favors of your Lord would you deny?",
    "Whoever is within the heavens and earth asks Him; every day He is bringing about a matter.",
    "So which of the favors of your Lord would you deny?",
    "We will attend to you, O prominent beings.",
    "So which of the favors of your Lord would you deny?",
    "O company of jinn and mankind, if you are able to pass beyond the regions of the heavens and the earth, then pass. You will not pass except by authority [from Allah].",
    "So which of the favors of your Lord would you deny?",
    "There will be sent upon you a flame of fire and smoke, and you will not defend yourselves.",
    "So which of the favors of your Lord would you deny?",
    "And when the heaven is split open and becomes rose-colored like oil -",
    "So which of the favors of your Lord would you deny? -",
    "Then on that Day none will be asked about his sin among men or jinn.",
    "So which of the favors of your Lord would you deny?",
    "The criminals will be known by their marks, and they will be seized by the forelocks and the feet.",
    "So which of the favors of your Lord would you deny?",
    "This is Hell, which the criminals deny.",
    "They will go around between it and scalding water, heated [to the utmost degree].",
    "So which of the favors of your Lord would you deny?",
    "But for he who has feared the position of his Lord are two gardens -",
    "So which of the favors of your Lord would you deny? -",
    "Having [spreading] branches.",
    "So which of the favors of your Lord would you deny?",
    "In both of them are two springs, flowing.",
    "So which of the favors of your Lord would you deny?",
    "In both of them are of every fruit, two kinds.",
    "So which of the favors of your Lord would you deny?",
    "[They are] reclining on beds whose linings are of silk brocade, and the fruit of the two gardens is hanging low.",
    "So which of the favors of your Lord would you deny?",
    "In them are women limiting [their] glances, untouched before them by man or jinni -",
    "So which of the favors of your Lord would you deny? -",
    "As if they were rubies and coral.",
    "So which of the favors of your Lord would you deny?",
    "Is the reward for good [anything] but good?",
    "So which of the favors of your Lord would you deny?",
    "And below them both [in excellence] are two [other] gardens -",
    "So which of the favors of your Lord would you deny? -",
    "Dark green [in color].",
    "So which of the favors of your Lord would you deny?",
    "In both of them are two springs, spouting.",
    "So which of the favors of your Lord would you deny?",
    "In both of them are fruit and palm trees and pomegranates.",
    "So which of the favors of your Lord would you deny?",
    "In them are good and beautiful women -",
    "So which of the favors of your Lord would you deny? -",
    "Fair ones reserved in pavilions -",
    "So which of the favors of your Lord would you deny? -",
    "Untouched before them by man or jinni -",
    "So which of the favors of your Lord would you deny? -",
    "Reclining on green cushions and beautiful fine carpets.",
    "So which of the favors of your Lord would you deny?",
    "Blessed is the name of your Lord, Owner of Majesty and Honor.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar__rahman);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ar_rahman);
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
