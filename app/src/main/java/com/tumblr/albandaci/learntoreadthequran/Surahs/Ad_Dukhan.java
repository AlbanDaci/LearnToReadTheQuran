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

public class Ad_Dukhan extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"44:1", "44:2", "44:3", "44:4", "44:5", "44:6", "44:7", "44:8", "44:9", "44:10", "44:11", "44:12", "44:13", "44:14", "44:15", "44:16",
            "44:17", "44:18", "44:19", "44:20", "44:21", "44:22", "44:23", "44:24", "44:25", "44:26", "44:27", "44:28", "44:29", "44:30", "44:31", "44:32",
            "44:33", "44:34", "44:35", "44:36", "44:37", "44:38", "44:39", "44:40", "44:41", "44:42", "44:43", "44:44", "44:45", "44:46", "44:47", "44:48",
            "44:49", "44:50", "44:51", "44:52", "44:53", "44:54", "44:55", "44:56", "44:57", "44:58", "44:59", ""};

    String [] arabic_verses = {"حم",
    "وَالْكِتَابِ الْمُبِينِ",
    "إِنَّا أَنزَلْنَاهُ فِي لَيْلَةٍ مُّبَارَكَةٍ ۚ إِنَّا كُنَّا مُنذِرِينَ",
    "فِيهَا يُفْرَقُ كُلُّ أَمْرٍ حَكِيمٍ",
    "أَمْرًا مِّنْ عِندِنَا ۚ إِنَّا كُنَّا مُرْسِلِينَ",
    "رَحْمَةً مِّن رَّبِّكَ ۚ إِنَّهُ هُوَ السَّمِيعُ الْعَلِيمُ",
    "رَبِّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا ۖ إِن كُنتُم مُّوقِنِينَ",
    "لَا إِلَٰهَ إِلَّا هُوَ يُحْيِي وَيُمِيتُ ۖ رَبُّكُمْ وَرَبُّ آبَائِكُمُ الْأَوَّلِينَ",
    "بَلْ هُمْ فِي شَكٍّ يَلْعَبُونَ",
    "فَارْتَقِبْ يَوْمَ تَأْتِي السَّمَاءُ بِدُخَانٍ مُّبِينٍ",
    "يَغْشَى النَّاسَ ۖ هَٰذَا عَذَابٌ أَلِيمٌ",
    "رَّبَّنَا اكْشِفْ عَنَّا الْعَذَابَ إِنَّا مُؤْمِنُونَ",
    "أَنَّىٰ لَهُمُ الذِّكْرَىٰ وَقَدْ جَاءَهُمْ رَسُولٌ مُّبِينٌ",
    "ثُمَّ تَوَلَّوْا عَنْهُ وَقَالُوا مُعَلَّمٌ مَّجْنُونٌ",
    "إِنَّا كَاشِفُو الْعَذَابِ قَلِيلًا ۚ إِنَّكُمْ عَائِدُونَ",
    "يَوْمَ نَبْطِشُ الْبَطْشَةَ الْكُبْرَىٰ إِنَّا مُنتَقِمُونَ",
    "وَلَقَدْ فَتَنَّا قَبْلَهُمْ قَوْمَ فِرْعَوْنَ وَجَاءَهُمْ رَسُولٌ كَرِيمٌ",
    "أَنْ أَدُّوا إِلَيَّ عِبَادَ اللَّهِ ۖ إِنِّي لَكُمْ رَسُولٌ أَمِينٌ",
    "وَأَن لَّا تَعْلُوا عَلَى اللَّهِ ۖ إِنِّي آتِيكُم بِسُلْطَانٍ مُّبِينٍ",
    "وَإِنِّي عُذْتُ بِرَبِّي وَرَبِّكُمْ أَن تَرْجُمُونِ",
    "وَإِن لَّمْ تُؤْمِنُوا لِي فَاعْتَزِلُونِ",
    "فَدَعَا رَبَّهُ أَنَّ هَٰؤُلَاءِ قَوْمٌ مُّجْرِمُونَ",
    "فَأَسْرِ بِعِبَادِي لَيْلًا إِنَّكُم مُّتَّبَعُونَ",
    "وَاتْرُكِ الْبَحْرَ رَهْوًا ۖ إِنَّهُمْ جُندٌ مُّغْرَقُونَ",
    "كَمْ تَرَكُوا مِن جَنَّاتٍ وَعُيُونٍ",
    "وَزُرُوعٍ وَمَقَامٍ كَرِيمٍ",
    "وَنَعْمَةٍ كَانُوا فِيهَا فَاكِهِينَ",
    "كَذَٰلِكَ ۖ وَأَوْرَثْنَاهَا قَوْمًا آخَرِينَ",
    "فَمَا بَكَتْ عَلَيْهِمُ السَّمَاءُ وَالْأَرْضُ وَمَا كَانُوا مُنظَرِينَ",
    "وَلَقَدْ نَجَّيْنَا بَنِي إِسْرَائِيلَ مِنَ الْعَذَابِ الْمُهِينِ",
    "مِن فِرْعَوْنَ ۚ إِنَّهُ كَانَ عَالِيًا مِّنَ الْمُسْرِفِينَ",
    "وَلَقَدِ اخْتَرْنَاهُمْ عَلَىٰ عِلْمٍ عَلَى الْعَالَمِينَ",
    "وَآتَيْنَاهُم مِّنَ الْآيَاتِ مَا فِيهِ بَلَاءٌ مُّبِينٌ",
    "إِنَّ هَٰؤُلَاءِ لَيَقُولُونَ",
    "إِنْ هِيَ إِلَّا مَوْتَتُنَا الْأُولَىٰ وَمَا نَحْنُ بِمُنشَرِينَ",
    "فَأْتُوا بِآبَائِنَا إِن كُنتُمْ صَادِقِينَ",
    "أَهُمْ خَيْرٌ أَمْ قَوْمُ تُبَّعٍ وَالَّذِينَ مِن قَبْلِهِمْ ۚ أَهْلَكْنَاهُمْ ۖ إِنَّهُمْ كَانُوا مُجْرِمِينَ",
    "وَمَا خَلَقْنَا السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا لَاعِبِينَ",
    "مَا خَلَقْنَاهُمَا إِلَّا بِالْحَقِّ وَلَٰكِنَّ أَكْثَرَهُمْ لَا يَعْلَمُونَ",
    "إِنَّ يَوْمَ الْفَصْلِ مِيقَاتُهُمْ أَجْمَعِينَ",
    "يَوْمَ لَا يُغْنِي مَوْلًى عَن مَّوْلًى شَيْئًا وَلَا هُمْ يُنصَرُونَ",
    "إِلَّا مَن رَّحِمَ اللَّهُ ۚ إِنَّهُ هُوَ الْعَزِيزُ الرَّحِيمُ",
    "إِنَّ شَجَرَتَ الزَّقُّومِ",
    "طَعَامُ الْأَثِيمِ",
    "كَالْمُهْلِ يَغْلِي فِي الْبُطُونِ",
    "كَغَلْيِ الْحَمِيمِ",
    "خُذُوهُ فَاعْتِلُوهُ إِلَىٰ سَوَاءِ الْجَحِيمِ",
    "ثُمَّ صُبُّوا فَوْقَ رَأْسِهِ مِنْ عَذَابِ الْحَمِيمِ",
    "ذُقْ إِنَّكَ أَنتَ الْعَزِيزُ الْكَرِيمُ",
    "إِنَّ هَٰذَا مَا كُنتُم بِهِ تَمْتَرُونَ",
    "إِنَّ الْمُتَّقِينَ فِي مَقَامٍ أَمِينٍ",
    "فِي جَنَّاتٍ وَعُيُونٍ",
    "يَلْبَسُونَ مِن سُندُسٍ وَإِسْتَبْرَقٍ مُّتَقَابِلِينَ",
    "كَذَٰلِكَ وَزَوَّجْنَاهُم بِحُورٍ عِينٍ",
    "يَدْعُونَ فِيهَا بِكُلِّ فَاكِهَةٍ آمِنِينَ",
    "لَا يَذُوقُونَ فِيهَا الْمَوْتَ إِلَّا الْمَوْتَةَ الْأُولَىٰ ۖ وَوَقَاهُمْ عَذَابَ الْجَحِيمِ",
    "فَضْلًا مِّن رَّبِّكَ ۚ ذَٰلِكَ هُوَ الْفَوْزُ الْعَظِيمُ",
    "فَإِنَّمَا يَسَّرْنَاهُ بِلِسَانِكَ لَعَلَّهُمْ يَتَذَكَّرُونَ",
    "فَارْتَقِبْ إِنَّهُم مُّرْتَقِبُونَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Ha, Meem.",
    "By the clear Book,",
    "Indeed, We sent it down during a blessed night. Indeed, We were to warn [mankind].",
    "On that night is made distinct every precise matter -",
    "[Every] matter [proceeding] from Us. Indeed, We were to send [a messenger]",
    "As mercy from your Lord. Indeed, He is the Hearing, the Knowing.",
    "Lord of the heavens and the earth and that between them, if you would be certain.",
    "There is no deity except Him; He gives life and causes death. [He is] your Lord and the Lord of your first forefathers.",
    "But they are in doubt, amusing themselves.",
    "Then watch for the Day when the sky will bring a visible smoke.",
    "Covering the people; this is a painful torment.",
    "[They will say], \"Our Lord, remove from us the torment; indeed, we are believers.\"",
    "How will there be for them a reminder [at that time]? And there had come to them a clear Messenger.",
    "Then they turned away from him and said, \"[He was] taught [and is] a madman.\"",
    "Indeed, We will remove the torment for a little. Indeed, you [disbelievers] will return [to disbelief].",
    "The Day We will strike with the greatest assault, indeed, We will take retribution.",
    "And We had already tried before them the people of Pharaoh, and there came to them a noble messenger,",
    "[Saying], \"Render to me the servants of Allah. Indeed, I am to you a trustworthy messenger,\"",
    "And [saying], \"Be not haughty with Allah. Indeed, I have come to you with clear authority.",
    "And indeed, I have sought refuge in my Lord and your Lord, lest you stone me.",
    "But if you do not believe me, then leave me alone.\"",
    "And [finally] he called to his Lord that these were a criminal people.",
    "[Allah said], \"Then set out with My servants by night. Indeed, you are to be pursued.",
    "And leave the sea in stillness. Indeed, they are an army to be drowned.\"",
    "How much they left behind of gardens and springs",
    "And crops and noble sites",
    "And comfort wherein they were amused.",
    "Thus. And We caused to inherit it another people.",
    "And the heaven and earth wept not for them, nor were they reprieved.",
    "And We certainly saved the Children of Israel from the humiliating torment -",
    "From Pharaoh. Indeed, he was a haughty one among the transgressors.",
    "And We certainly chose them by knowledge over [all] the worlds.",
    "And We gave them of signs that in which there was a clear trial.",
    "Indeed, these [disbelievers] are saying,",
    "\"There is not but our first death, and we will not be resurrected.",
    "Then bring [back] our forefathers, if you should be truthful.\"",
    "Are they better or the people of Tubba' and those before them? We destroyed them, [for] indeed, they were criminals.",
    "And We did not create the heavens and earth and that between them in play.",
    "We did not create them except in truth, but most of them do not know.",
    "Indeed, the Day of Judgement is the appointed time for them all -",
    "The Day when no relation will avail a relation at all, nor will they be helped -",
    "Except those [believers] on whom Allah has mercy. Indeed, He is the Exalted in Might, the Merciful.",
    "Indeed, the tree of zaqqum",
    "Is food for the sinful.",
    "Like murky oil, it boils within bellies",
    "Like the boiling of scalding water.",
    "[It will be commanded], \"Seize him and drag him into the midst of the Hellfire,",
    "Then pour over his head from the torment of scalding water.\"",
    "[It will be said], \"Taste! Indeed, you are the honored, the noble!",
    "Indeed, this is what you used to dispute.\"",
    "Indeed, the righteous will be in a secure place;",
    "Within gardens and springs,",
    "Wearing [garments of] fine silk and brocade, facing each other.",
    "Thus. And We will marry them to fair women with large, [beautiful] eyes.",
    "They will call therein for every [kind of] fruit - safe and secure.",
    "They will not taste death therein except the first death, and He will have protected them from the punishment of Hellfire",
    "As bounty from your Lord. That is what is the great attainment.",
    "And indeed, We have eased the Qur'an in your tongue that they might be reminded.",
    "So watch, [O Muhammad]; indeed, they are watching [for your end].",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad__dukhan);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ad_dukhan);
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
