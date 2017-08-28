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

public class Qaf extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"50:1", "50:2", "50:3", "50:4", "50:5", "50:6", "50:7", "50:8", "50:9", "50:10", "50:11", "50:12", "50:13", "50:14", "50:15", "50:16",
            "50:17", "50:18", "50:19", "50:20", "50:21", "50:22", "50:23", "50:24", "50:25", "50:26", "50:27", "50:28", "50:29", "50:30", "50:31", "50:32",
            "50:33", "50:34", "50:35", "50:36", "50:37", "50:38", "50:39", "50:40", "50:41", "50:42", "50:43", "50:44", "50:45", ""};

    String [] arabic_verses = {"ق ۚ وَالْقُرْآنِ الْمَجِيدِ",
    "بَلْ عَجِبُوا أَن جَاءَهُم مُّنذِرٌ مِّنْهُمْ فَقَالَ الْكَافِرُونَ هَٰذَا شَيْءٌ عَجِيبٌ",
    "أَإِذَا مِتْنَا وَكُنَّا تُرَابًا ۖ ذَٰلِكَ رَجْعٌ بَعِيدٌ",
    "قَدْ عَلِمْنَا مَا تَنقُصُ الْأَرْضُ مِنْهُمْ ۖ وَعِندَنَا كِتَابٌ حَفِيظٌ",
    "بَلْ كَذَّبُوا بِالْحَقِّ لَمَّا جَاءَهُمْ فَهُمْ فِي أَمْرٍ مَّرِيجٍ",
    "أَفَلَمْ يَنظُرُوا إِلَى السَّمَاءِ فَوْقَهُمْ كَيْفَ بَنَيْنَاهَا وَزَيَّنَّاهَا وَمَا لَهَا مِن فُرُوجٍ",
    "وَالْأَرْضَ مَدَدْنَاهَا وَأَلْقَيْنَا فِيهَا رَوَاسِيَ وَأَنبَتْنَا فِيهَا مِن كُلِّ زَوْجٍ بَهِيجٍ",
    "تَبْصِرَةً وَذِكْرَىٰ لِكُلِّ عَبْدٍ مُّنِيبٍ",
    "وَنَزَّلْنَا مِنَ السَّمَاءِ مَاءً مُّبَارَكًا فَأَنبَتْنَا بِهِ جَنَّاتٍ وَحَبَّ الْحَصِيدِ",
    "وَالنَّخْلَ بَاسِقَاتٍ لَّهَا طَلْعٌ نَّضِيدٌ",
    "رِّزْقًا لِّلْعِبَادِ ۖ وَأَحْيَيْنَا بِهِ بَلْدَةً مَّيْتًا ۚ كَذَٰلِكَ الْخُرُوجُ",
    "كَذَّبَتْ قَبْلَهُمْ قَوْمُ نُوحٍ وَأَصْحَابُ الرَّسِّ وَثَمُودُ",
    "وَعَادٌ وَفِرْعَوْنُ وَإِخْوَانُ لُوطٍ",
    "وَأَصْحَابُ الْأَيْكَةِ وَقَوْمُ تُبَّعٍ ۚ كُلٌّ كَذَّبَ الرُّسُلَ فَحَقَّ وَعِيدِ",
    "أَفَعَيِينَا بِالْخَلْقِ الْأَوَّلِ ۚ بَلْ هُمْ فِي لَبْسٍ مِّنْ خَلْقٍ جَدِيدٍ",
    "وَلَقَدْ خَلَقْنَا الْإِنسَانَ وَنَعْلَمُ مَا تُوَسْوِسُ بِهِ نَفْسُهُ ۖ وَنَحْنُ أَقْرَبُ إِلَيْهِ مِنْ حَبْلِ الْوَرِيدِ",
    "إِذْ يَتَلَقَّى الْمُتَلَقِّيَانِ عَنِ الْيَمِينِ وَعَنِ الشِّمَالِ قَعِيدٌ",
    "مَّا يَلْفِظُ مِن قَوْلٍ إِلَّا لَدَيْهِ رَقِيبٌ عَتِيدٌ",
    "وَجَاءَتْ سَكْرَةُ الْمَوْتِ بِالْحَقِّ ۖ ذَٰلِكَ مَا كُنتَ مِنْهُ تَحِيدُ",
    "وَنُفِخَ فِي الصُّورِ ۚ ذَٰلِكَ يَوْمُ الْوَعِيدِ",
    "وَجَاءَتْ كُلُّ نَفْسٍ مَّعَهَا سَائِقٌ وَشَهِيدٌ",
    "لَّقَدْ كُنتَ فِي غَفْلَةٍ مِّنْ هَٰذَا فَكَشَفْنَا عَنكَ غِطَاءَكَ فَبَصَرُكَ الْيَوْمَ حَدِيدٌ",
    "وَقَالَ قَرِينُهُ هَٰذَا مَا لَدَيَّ عَتِيدٌ",
    "أَلْقِيَا فِي جَهَنَّمَ كُلَّ كَفَّارٍ عَنِيدٍ",
    "مَّنَّاعٍ لِّلْخَيْرِ مُعْتَدٍ مُّرِيبٍ",
    "الَّذِي جَعَلَ مَعَ اللَّهِ إِلَٰهًا آخَرَ فَأَلْقِيَاهُ فِي الْعَذَابِ الشَّدِيدِ",
    "قَالَ قَرِينُهُ رَبَّنَا مَا أَطْغَيْتُهُ وَلَٰكِن كَانَ فِي ضَلَالٍ بَعِيدٍ",
    "قَالَ لَا تَخْتَصِمُوا لَدَيَّ وَقَدْ قَدَّمْتُ إِلَيْكُم بِالْوَعِيدِ",
    "مَا يُبَدَّلُ الْقَوْلُ لَدَيَّ وَمَا أَنَا بِظَلَّامٍ لِّلْعَبِيدِ",
    "يَوْمَ نَقُولُ لِجَهَنَّمَ هَلِ امْتَلَأْتِ وَتَقُولُ هَلْ مِن مَّزِيدٍ",
    "وَأُزْلِفَتِ الْجَنَّةُ لِلْمُتَّقِينَ غَيْرَ بَعِيدٍ",
    "هَٰذَا مَا تُوعَدُونَ لِكُلِّ أَوَّابٍ حَفِيظٍ",
    "مَّنْ خَشِيَ الرَّحْمَٰنَ بِالْغَيْبِ وَجَاءَ بِقَلْبٍ مُّنِيبٍ",
    "ادْخُلُوهَا بِسَلَامٍ ۖ ذَٰلِكَ يَوْمُ الْخُلُودِ",
    "لَهُم مَّا يَشَاءُونَ فِيهَا وَلَدَيْنَا مَزِيدٌ",
    "وَكَمْ أَهْلَكْنَا قَبْلَهُم مِّن قَرْنٍ هُمْ أَشَدُّ مِنْهُم بَطْشًا فَنَقَّبُوا فِي الْبِلَادِ هَلْ مِن مَّحِيصٍ",
    "إِنَّ فِي ذَٰلِكَ لَذِكْرَىٰ لِمَن كَانَ لَهُ قَلْبٌ أَوْ أَلْقَى السَّمْعَ وَهُوَ شَهِيدٌ",
    "وَلَقَدْ خَلَقْنَا السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا فِي سِتَّةِ أَيَّامٍ وَمَا مَسَّنَا مِن لُّغُوبٍ",
    "فَاصْبِرْ عَلَىٰ مَا يَقُولُونَ وَسَبِّحْ بِحَمْدِ رَبِّكَ قَبْلَ طُلُوعِ الشَّمْسِ وَقَبْلَ الْغُرُوبِ",
    "وَمِنَ اللَّيْلِ فَسَبِّحْهُ وَأَدْبَارَ السُّجُودِ",
    "وَاسْتَمِعْ يَوْمَ يُنَادِ الْمُنَادِ مِن مَّكَانٍ قَرِيبٍ",
    "يَوْمَ يَسْمَعُونَ الصَّيْحَةَ بِالْحَقِّ ۚ ذَٰلِكَ يَوْمُ الْخُرُوجِ",
    "إِنَّا نَحْنُ نُحْيِي وَنُمِيتُ وَإِلَيْنَا الْمَصِيرُ",
    "يَوْمَ تَشَقَّقُ الْأَرْضُ عَنْهُمْ سِرَاعًا ۚ ذَٰلِكَ حَشْرٌ عَلَيْنَا يَسِيرٌ",
    "نَّحْنُ أَعْلَمُ بِمَا يَقُولُونَ ۖ وَمَا أَنتَ عَلَيْهِم بِجَبَّارٍ ۖ فَذَكِّرْ بِالْقُرْآنِ مَن يَخَافُ وَعِيدِ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Qaf. By the honored Qur'an...",
    "But they wonder that there has come to them a warner from among themselves, and the disbelievers say, \"This is an amazing thing.",
    "When we have died and have become dust, [we will return to life]? That is a distant return.\"",
    "We know what the earth diminishes of them, and with Us is a retaining record.",
    "But they denied the truth when it came to them, so they are in a confused condition.",
    "Have they not looked at the heaven above them - how We structured it and adorned it and [how] it has no rifts?",
    "And the earth - We spread it out and cast therein firmly set mountains and made grow therein [something] of every beautiful kind,",
    "Giving insight and a reminder for every servant who turns [to Allah].",
    "And We have sent down blessed rain from the sky and made grow thereby gardens and grain from the harvest",
    "And lofty palm trees having fruit arranged in layers -",
    "As provision for the servants, and We have given life thereby to a dead land. Thus is the resurrection.",
    "The people of Noah denied before them, and the companions of the well and Thamud",
    "And 'Aad and Pharaoh and the brothers of Lot",
    "And the companions of the thicket and the people of Tubba'. All denied the messengers, so My threat was justly fulfilled.",
    "Did We fail in the first creation? But they are in confusion over a new creation.",
    "And We have already created man and know what his soul whispers to him, and We are closer to him than [his] jugular vein",
    "When the two receivers receive, seated on the right and on the left.",
    "Man does not utter any word except that with him is an observer prepared [to record].",
    "And the intoxication of death will bring the truth; that is what you were trying to avoid.",
    "And the Horn will be blown. That is the Day of [carrying out] the threat.",
    "And every soul will come, with it a driver and a witness.",
    "[It will be said], \"You were certainly in unmindfulness of this, and We have removed from you your cover, so your sight, this Day, is sharp.\"",
    "And his companion, [the angel], will say, \"This [record] is what is with me, prepared.\"",
    "[Allah will say], \"Throw into Hell every obstinate disbeliever,",
    "Preventer of good, aggressor, and doubter,",
    "Who made [as equal] with Allah another deity; then throw him into the severe punishment.\"",
    "His [devil] companion will say, \"Our Lord, I did not make him transgress, but he [himself] was in extreme error.\"",
    "[Allah] will say, \"Do not dispute before Me, while I had already presented to you the warning.",
    "The word will not be changed with Me, and never will I be unjust to the servants.\"",
    "On the Day We will say to Hell, \"Have you been filled?\" and it will say, \"Are there some more,\"",
    "And Paradise will be brought near to the righteous, not far,",
    "[It will be said], \"This is what you were promised - for every returner [to Allah] and keeper [of His covenant]",
    "Who feared the Most Merciful unseen and came with a heart returning [in repentance].",
    "Enter it in peace. This is the Day of Eternity.\"",
    "They will have whatever they wish therein, and with Us is more.",
    "And how many a generation before them did We destroy who were greater than them in [striking] power and had explored throughout the lands. Is there any place of escape?",
    "Indeed in that is a reminder for whoever has a heart or who listens while he is present [in mind].",
    "And We did certainly create the heavens and earth and what is between them in six days, and there touched Us no weariness.",
    "So be patient, [O Muhammad], over what they say and exalt [Allah] with praise of your Lord before the rising of the sun and before its setting,",
    "And [in part] of the night exalt Him and after prostration.",
    "And listen on the Day when the Caller will call out from a place that is near -",
    "The Day they will hear the blast [of the Horn] in truth. That is the Day of Emergence [from the graves].",
    "Indeed, it is We who give life and cause death, and to Us is the destination",
    "On the Day the earth breaks away from them [and they emerge] rapidly; that is a gathering easy for Us.",
    "We are most knowing of what they say, and you are not over them a tyrant. But remind by the Qur'an whoever fears My threat.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qaf);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_qaf);
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
