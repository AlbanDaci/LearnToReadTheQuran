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

public class Al_Qamar extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"54:1", "54:2", "54:3", "54:4", "54:5", "54:6", "54:7", "54:8", "54:9", "54:10", "54:11", "54:12", "54:13", "54:14", "54:15", "54:16",
            "54:17", "54:18", "54:19", "54:20", "54:21", "54:22", "54:23", "54:24", "54:25", "54:26", "54:27", "54:28", "54:29", "54:30", "54:31", "54:32",
            "54:33", "54:34", "54:35", "54:36", "54:37", "54:38", "54:39", "54:40", "54:41", "54:42", "54:43", "54:44", "54:45", "54:46", "54:47", "54:48",
            "54:49", "54:50", "54:51", "54:52", "54:53", "54:54", "54:55", ""};

    String [] arabic_verses = {"اقْتَرَبَتِ السَّاعَةُ وَانشَقَّ الْقَمَرُ",
    "وَإِن يَرَوْا آيَةً يُعْرِضُوا وَيَقُولُوا سِحْرٌ مُّسْتَمِرٌّ",
    "وَكَذَّبُوا وَاتَّبَعُوا أَهْوَاءَهُمْ ۚ وَكُلُّ أَمْرٍ مُّسْتَقِرٌّ",
    "وَلَقَدْ جَاءَهُم مِّنَ الْأَنبَاءِ مَا فِيهِ مُزْدَجَرٌ",
    "حِكْمَةٌ بَالِغَةٌ ۖ فَمَا تُغْنِ النُّذُرُ",
    "فَتَوَلَّ عَنْهُمْ ۘ يَوْمَ يَدْعُ الدَّاعِ إِلَىٰ شَيْءٍ نُّكُرٍ",
    "خُشَّعًا أَبْصَارُهُمْ يَخْرُجُونَ مِنَ الْأَجْدَاثِ كَأَنَّهُمْ جَرَادٌ مُّنتَشِرٌ",
    "مُّهْطِعِينَ إِلَى الدَّاعِ ۖ يَقُولُ الْكَافِرُونَ هَٰذَا يَوْمٌ عَسِرٌ",
    "كَذَّبَتْ قَبْلَهُمْ قَوْمُ نُوحٍ فَكَذَّبُوا عَبْدَنَا وَقَالُوا مَجْنُونٌ وَازْدُجِرَ",
    "فَدَعَا رَبَّهُ أَنِّي مَغْلُوبٌ فَانتَصِرْ",
    "فَفَتَحْنَا أَبْوَابَ السَّمَاءِ بِمَاءٍ مُّنْهَمِرٍ",
    "وَفَجَّرْنَا الْأَرْضَ عُيُونًا فَالْتَقَى الْمَاءُ عَلَىٰ أَمْرٍ قَدْ قُدِرَ",
    "وَحَمَلْنَاهُ عَلَىٰ ذَاتِ أَلْوَاحٍ وَدُسُرٍ",
    "تَجْرِي بِأَعْيُنِنَا جَزَاءً لِّمَن كَانَ كُفِرَ",
    "وَلَقَد تَّرَكْنَاهَا آيَةً فَهَلْ مِن مُّدَّكِرٍ",
    "فَكَيْفَ كَانَ عَذَابِي وَنُذُرِ",
    "وَلَقَدْ يَسَّرْنَا الْقُرْآنَ لِلذِّكْرِ فَهَلْ مِن مُّدَّكِرٍ",
    "كَذَّبَتْ عَادٌ فَكَيْفَ كَانَ عَذَابِي وَنُذُرِ",
    "إِنَّا أَرْسَلْنَا عَلَيْهِمْ رِيحًا صَرْصَرًا فِي يَوْمِ نَحْسٍ مُّسْتَمِرٍّ",
    "تَنزِعُ النَّاسَ كَأَنَّهُمْ أَعْجَازُ نَخْلٍ مُّنقَعِرٍ",
    "فَكَيْفَ كَانَ عَذَابِي وَنُذُرِ",
    "وَلَقَدْ يَسَّرْنَا الْقُرْآنَ لِلذِّكْرِ فَهَلْ مِن مُّدَّكِرٍ",
    "كَذَّبَتْ ثَمُودُ بِالنُّذُرِ",
    "فَقَالُوا أَبَشَرًا مِّنَّا وَاحِدًا نَّتَّبِعُهُ إِنَّا إِذًا لَّفِي ضَلَالٍ وَسُعُرٍ",
    "أَأُلْقِيَ الذِّكْرُ عَلَيْهِ مِن بَيْنِنَا بَلْ هُوَ كَذَّابٌ أَشِرٌ",
    "سَيَعْلَمُونَ غَدًا مَّنِ الْكَذَّابُ الْأَشِرُ",
    "إِنَّا مُرْسِلُو النَّاقَةِ فِتْنَةً لَّهُمْ فَارْتَقِبْهُمْ وَاصْطَبِرْ",
    "وَنَبِّئْهُمْ أَنَّ الْمَاءَ قِسْمَةٌ بَيْنَهُمْ ۖ كُلُّ شِرْبٍ مُّحْتَضَرٌ",
    "فَنَادَوْا صَاحِبَهُمْ فَتَعَاطَىٰ فَعَقَرَ",
    "فَكَيْفَ كَانَ عَذَابِي وَنُذُرِ",
    "إِنَّا أَرْسَلْنَا عَلَيْهِمْ صَيْحَةً وَاحِدَةً فَكَانُوا كَهَشِيمِ الْمُحْتَظِرِ",
    "وَلَقَدْ يَسَّرْنَا الْقُرْآنَ لِلذِّكْرِ فَهَلْ مِن مُّدَّكِرٍ",
    "كَذَّبَتْ قَوْمُ لُوطٍ بِالنُّذُرِ",
    "إِنَّا أَرْسَلْنَا عَلَيْهِمْ حَاصِبًا إِلَّا آلَ لُوطٍ ۖ نَّجَّيْنَاهُم بِسَحَرٍ",
    "نِّعْمَةً مِّنْ عِندِنَا ۚ كَذَٰلِكَ نَجْزِي مَن شَكَرَ",
    "وَلَقَدْ أَنذَرَهُم بَطْشَتَنَا فَتَمَارَوْا بِالنُّذُرِ",
    "وَلَقَدْ رَاوَدُوهُ عَن ضَيْفِهِ فَطَمَسْنَا أَعْيُنَهُمْ فَذُوقُوا عَذَابِي وَنُذُرِ",
    "وَلَقَدْ صَبَّحَهُم بُكْرَةً عَذَابٌ مُّسْتَقِرٌّ",
    "فَذُوقُوا عَذَابِي وَنُذُرِ",
    "وَلَقَدْ يَسَّرْنَا الْقُرْآنَ لِلذِّكْرِ فَهَلْ مِن مُّدَّكِرٍ",
    "وَلَقَدْ جَاءَ آلَ فِرْعَوْنَ النُّذُرُ",
    "كَذَّبُوا بِآيَاتِنَا كُلِّهَا فَأَخَذْنَاهُمْ أَخْذَ عَزِيزٍ مُّقْتَدِرٍ",
    "أَكُفَّارُكُمْ خَيْرٌ مِّنْ أُولَٰئِكُمْ أَمْ لَكُم بَرَاءَةٌ فِي الزُّبُرِ",
    "أَمْ يَقُولُونَ نَحْنُ جَمِيعٌ مُّنتَصِرٌ",
    "سَيُهْزَمُ الْجَمْعُ وَيُوَلُّونَ الدُّبُرَ",
    "بَلِ السَّاعَةُ مَوْعِدُهُمْ وَالسَّاعَةُ أَدْهَىٰ وَأَمَرُّ",
    "إِنَّ الْمُجْرِمِينَ فِي ضَلَالٍ وَسُعُرٍ",
    "يَوْمَ يُسْحَبُونَ فِي النَّارِ عَلَىٰ وُجُوهِهِمْ ذُوقُوا مَسَّ سَقَرَ",
    "إِنَّا كُلَّ شَيْءٍ خَلَقْنَاهُ بِقَدَرٍ",
    "وَمَا أَمْرُنَا إِلَّا وَاحِدَةٌ كَلَمْحٍ بِالْبَصَرِ",
    "وَلَقَدْ أَهْلَكْنَا أَشْيَاعَكُمْ فَهَلْ مِن مُّدَّكِرٍ",
    "وَكُلُّ شَيْءٍ فَعَلُوهُ فِي الزُّبُرِ",
    "وَكُلُّ صَغِيرٍ وَكَبِيرٍ مُّسْتَطَرٌ",
    "إِنَّ الْمُتَّقِينَ فِي جَنَّاتٍ وَنَهَرٍ",
    "فِي مَقْعَدِ صِدْقٍ عِندَ مَلِيكٍ مُّقْتَدِرٍ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"The Hour has come near, and the moon has split [in two].",
    "And if they see a miracle, they turn away and say, \"Passing magic.\"",
    "And they denied and followed their inclinations. But for every matter is a [time of] settlement.",
    "And there has already come to them of information that in which there is deterrence -",
    "Extensive wisdom - but warning does not avail [them].",
    "So leave them, [O Muhammad]. The Day the Caller calls to something forbidding,",
    "Their eyes humbled, they will emerge from the graves as if they were locusts spreading,",
    "Racing ahead toward the Caller. The disbelievers will say, \"This is a difficult Day.\"",
    "The people of Noah denied before them, and they denied Our servant and said, \"A madman,\" and he was repelled.",
    "So he invoked his Lord, \"Indeed, I am overpowered, so help.\"",
    "Then We opened the gates of the heaven with rain pouring down",
    "And caused the earth to burst with springs, and the waters met for a matter already predestined.",
    "And We carried him on a [construction of] planks and nails,",
    "Sailing under Our observation as reward for he who had been denied.",
    "And We left it as a sign, so is there any who will remember?",
    "And how [severe] were My punishment and warning.",
    "And We have certainly made the Qur'an easy for remembrance, so is there any who will remember?",
    "'Aad denied; and how [severe] were My punishment and warning.",
    "Indeed, We sent upon them a screaming wind on a day of continuous misfortune,",
    "Extracting the people as if they were trunks of palm trees uprooted.",
    "And how [severe] were My punishment and warning.",
    "And We have certainly made the Qur'an easy for remembrance, so is there any who will remember?",
    "Thamud denied the warning",
    "And said, \"Is it one human being among us that we should follow? Indeed, we would then be in error and madness.",
    "Has the message been sent down upon him from among us? Rather, he is an insolent liar.\"",
    "They will know tomorrow who is the insolent liar.",
    "Indeed, We are sending the she-camel as trial for them, so watch them and be patient.",
    "And inform them that the water is shared between them, each [day of] drink attended [by turn].",
    "But they called their companion, and he dared and hamstrung [her].",
    "And how [severe] were My punishment and warning.",
    "Indeed, We sent upon them one blast from the sky, and they became like the dry twig fragments of an [animal] pen.",
    "And We have certainly made the Qur'an easy for remembrance, so is there any who will remember?",
    "The people of Lot denied the warning.",
    "Indeed, We sent upon them a storm of stones, except the family of Lot - We saved them before dawn",
    "As favor from us. Thus do We reward he who is grateful.",
    "And he had already warned them of Our assault, but they disputed the warning.",
    "And they had demanded from him his guests, but We obliterated their eyes, [saying], \"Taste My punishment and warning.\"",
    "And there came upon them by morning an abiding punishment.",
    "So taste My punishment and warning.",
    "And We have certainly made the Qur'an easy for remembrance, so is there any who will remember?",
    "And there certainly came to the people of Pharaoh warning.",
    "They denied Our signs, all of them, so We seized them with a seizure of one Exalted in Might and Perfect in Ability.",
    "Are your disbelievers better than those [former ones], or have you immunity in the scripture?",
    "Or do they say, \"We are an assembly supporting [each other]\"?",
    "[Their] assembly will be defeated, and they will turn their backs [in retreat].",
    "But the Hour is their appointment [for due punishment], and the Hour is more disastrous and more bitter.",
    "Indeed, the criminals are in error and madness.",
    "The Day they are dragged into the Fire on their faces [it will be said], \"Taste the touch of Saqar.\"",
    "Indeed, all things We created with predestination.",
    "And Our command is but one, like a glance of the eye.",
    "And We have already destroyed your kinds, so is there any who will remember?",
    "And everything they did is in written records.",
    "And every small and great [thing] is inscribed.",
    "Indeed, the righteous will be among gardens and rivers,",
    "In a seat of honor near a Sovereign, Perfect in Ability.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__qamar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_qamar);
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
