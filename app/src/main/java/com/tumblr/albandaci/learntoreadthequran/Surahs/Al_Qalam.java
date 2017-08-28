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

public class Al_Qalam extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"68:1", "68:2", "68:3", "68:4", "68:5", "68:6", "68:7", "68:8", "68:9", "68:10", "68:11", "68:12", "68:13", "68:14", "68:15", "68:16",
            "68:17", "68:18", "68:19", "68:20", "68:21", "68:22", "68:23", "68:24", "68:25", "68:26", "68:27", "68:28", "68:29", "68:30", "68:31", "68:32",
            "68:33", "68:34", "68:35", "68:36", "68:37", "68:38", "68:39", "68:40", "68:41", "68:42", "68:43", "68:44", "68:45", "68:46", "68:47", "68:48",
            "68:49", "68:50", "68:51", "68:52", ""};

    String [] arabic_verses = {"ن ۚ وَالْقَلَمِ وَمَا يَسْطُرُونَ",
    "مَا أَنتَ بِنِعْمَةِ رَبِّكَ بِمَجْنُونٍ",
    "وَإِنَّ لَكَ لَأَجْرًا غَيْرَ مَمْنُونٍ",
    "وَإِنَّكَ لَعَلَىٰ خُلُقٍ عَظِيمٍ",
    "فَسَتُبْصِرُ وَيُبْصِرُونَ",
    "بِأَييِّكُمُ الْمَفْتُونُ",
    "إِنَّ رَبَّكَ هُوَ أَعْلَمُ بِمَن ضَلَّ عَن سَبِيلِهِ وَهُوَ أَعْلَمُ بِالْمُهْتَدِينَ",
    "فَلَا تُطِعِ الْمُكَذِّبِينَ",
    "وَدُّوا لَوْ تُدْهِنُ فَيُدْهِنُونَ",
    "وَلَا تُطِعْ كُلَّ حَلَّافٍ مَّهِينٍ",
    "هَمَّازٍ مَّشَّاءٍ بِنَمِيمٍ",
    "مَّنَّاعٍ لِّلْخَيْرِ مُعْتَدٍ أَثِيمٍ",
    "عُتُلٍّ بَعْدَ ذَٰلِكَ زَنِيمٍ",
    "أَن كَانَ ذَا مَالٍ وَبَنِينَ",
    "إِذَا تُتْلَىٰ عَلَيْهِ آيَاتُنَا قَالَ أَسَاطِيرُ الْأَوَّلِينَ",
    "سَنَسِمُهُ عَلَى الْخُرْطُومِ",
    "إِنَّا بَلَوْنَاهُمْ كَمَا بَلَوْنَا أَصْحَابَ الْجَنَّةِ إِذْ أَقْسَمُوا لَيَصْرِمُنَّهَا مُصْبِحِينَ",
    "وَلَا يَسْتَثْنُونَ",
    "فَطَافَ عَلَيْهَا طَائِفٌ مِّن رَّبِّكَ وَهُمْ نَائِمُونَ",
    "فَأَصْبَحَتْ كَالصَّرِيمِ",
    "فَتَنَادَوْا مُصْبِحِينَ",
    "أَنِ اغْدُوا عَلَىٰ حَرْثِكُمْ إِن كُنتُمْ صَارِمِينَ",
    "فَانطَلَقُوا وَهُمْ يَتَخَافَتُونَ",
    "أَن لَّا يَدْخُلَنَّهَا الْيَوْمَ عَلَيْكُم مِّسْكِينٌ",
    "وَغَدَوْا عَلَىٰ حَرْدٍ قَادِرِينَ",
    "فَلَمَّا رَأَوْهَا قَالُوا إِنَّا لَضَالُّونَ",
    "بَلْ نَحْنُ مَحْرُومُونَ",
    "قَالَ أَوْسَطُهُمْ أَلَمْ أَقُل لَّكُمْ لَوْلَا تُسَبِّحُونَ",
    "قَالُوا سُبْحَانَ رَبِّنَا إِنَّا كُنَّا ظَالِمِينَ",
    "فَأَقْبَلَ بَعْضُهُمْ عَلَىٰ بَعْضٍ يَتَلَاوَمُونَ",
    "قَالُوا يَا وَيْلَنَا إِنَّا كُنَّا طَاغِينَ",
    "عَسَىٰ رَبُّنَا أَن يُبْدِلَنَا خَيْرًا مِّنْهَا إِنَّا إِلَىٰ رَبِّنَا رَاغِبُونَ",
    "كَذَٰلِكَ الْعَذَابُ ۖ وَلَعَذَابُ الْآخِرَةِ أَكْبَرُ ۚ لَوْ كَانُوا يَعْلَمُونَ",
    "إِنَّ لِلْمُتَّقِينَ عِندَ رَبِّهِمْ جَنَّاتِ النَّعِيمِ",
    "أَفَنَجْعَلُ الْمُسْلِمِينَ كَالْمُجْرِمِينَ",
    "مَا لَكُمْ كَيْفَ تَحْكُمُونَ",
    "أَمْ لَكُمْ كِتَابٌ فِيهِ تَدْرُسُونَ",
    "إِنَّ لَكُمْ فِيهِ لَمَا تَخَيَّرُونَ",
    "أَمْ لَكُمْ أَيْمَانٌ عَلَيْنَا بَالِغَةٌ إِلَىٰ يَوْمِ الْقِيَامَةِ ۙ إِنَّ لَكُمْ لَمَا تَحْكُمُونَ",
    "سَلْهُمْ أَيُّهُم بِذَٰلِكَ زَعِيمٌ",
    "أَمْ لَهُمْ شُرَكَاءُ فَلْيَأْتُوا بِشُرَكَائِهِمْ إِن كَانُوا صَادِقِينَ",
    "يَوْمَ يُكْشَفُ عَن سَاقٍ وَيُدْعَوْنَ إِلَى السُّجُودِ فَلَا يَسْتَطِيعُونَ",
    "خَاشِعَةً أَبْصَارُهُمْ تَرْهَقُهُمْ ذِلَّةٌ ۖ وَقَدْ كَانُوا يُدْعَوْنَ إِلَى السُّجُودِ وَهُمْ سَالِمُونَ",
    "فَذَرْنِي وَمَن يُكَذِّبُ بِهَٰذَا الْحَدِيثِ ۖ سَنَسْتَدْرِجُهُم مِّنْ حَيْثُ لَا يَعْلَمُونَ",
    "وَأُمْلِي لَهُمْ ۚ إِنَّ كَيْدِي مَتِينٌ",
    "أَمْ تَسْأَلُهُمْ أَجْرًا فَهُم مِّن مَّغْرَمٍ مُّثْقَلُونَ",
    "أَمْ عِندَهُمُ الْغَيْبُ فَهُمْ يَكْتُبُونَ",
    "فَاصْبِرْ لِحُكْمِ رَبِّكَ وَلَا تَكُن كَصَاحِبِ الْحُوتِ إِذْ نَادَىٰ وَهُوَ مَكْظُومٌ",
    "لَّوْلَا أَن تَدَارَكَهُ نِعْمَةٌ مِّن رَّبِّهِ لَنُبِذَ بِالْعَرَاءِ وَهُوَ مَذْمُومٌ",
    "فَاجْتَبَاهُ رَبُّهُ فَجَعَلَهُ مِنَ الصَّالِحِينَ",
    "وَإِن يَكَادُ الَّذِينَ كَفَرُوا لَيُزْلِقُونَكَ بِأَبْصَارِهِمْ لَمَّا سَمِعُوا الذِّكْرَ وَيَقُولُونَ إِنَّهُ لَمَجْنُونٌ",
    "وَمَا هُوَ إِلَّا ذِكْرٌ لِّلْعَالَمِينَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Nun. By the pen and what they inscribe,",
    "You are not, [O Muhammad], by the favor of your Lord, a madman.",
    "And indeed, for you is a reward uninterrupted.",
    "And indeed, you are of a great moral character.",
    "So you will see and they will see",
    "Which of you is the afflicted [by a devil].",
    "Indeed, your Lord is most knowing of who has gone astray from His way, and He is most knowing of the [rightly] guided.",
    "Then do not obey the deniers.",
    "They wish that you would soften [in your position], so they would soften [toward you].",
    "And do not obey every worthless habitual swearer",
    "[And] scorner, going about with malicious gossip -",
    "A preventer of good, transgressing and sinful,",
    "Cruel, moreover, and an illegitimate pretender.",
    "Because he is a possessor of wealth and children,",
    "When Our verses are recited to him, he says, \"Legends of the former peoples.\"",
    "We will brand him upon the snout.",
    "Indeed, We have tried them as We tried the companions of the garden, when they swore to cut its fruit in the [early] morning",
    "Without making exception.",
    "So there came upon the garden an affliction from your Lord while they were asleep.",
    "And it became as though reaped.",
    "And they called one another at morning,",
    "[Saying], \"Go early to your crop if you would cut the fruit.\"",
    "So they set out, while lowering their voices,",
    "[Saying], \"There will surely not enter it today upon you [any] poor person.\"",
    "And they went early in determination, [assuming themselves] able.",
    "But when they saw it, they said, \"Indeed, we are lost;",
    "Rather, we have been deprived.\"",
    "The most moderate of them said, \"Did I not say to you, 'Why do you not exalt [Allah]?' \"",
    "They said, \"Exalted is our Lord! Indeed, we were wrongdoers.\"",
    "Then they approached one another, blaming each other.",
    "They said, \"O woe to us; indeed we were transgressors.",
    "Perhaps our Lord will substitute for us [one] better than it. Indeed, we are toward our Lord desirous.\"",
    "Such is the punishment [of this world]. And the punishment of the Hereafter is greater, if they only knew.",
    "Indeed, for the righteous with their Lord are the Gardens of Pleasure.",
    "Then will We treat the Muslims like the criminals?",
    "What is [the matter] with you? How do you judge?",
    "Or do you have a scripture in which you learn",
    "That indeed for you is whatever you choose?",
    "Or do you have oaths [binding] upon Us, extending until the Day of Resurrection, that indeed for you is whatever you judge?",
    "Ask them which of them, for that [claim], is responsible.",
    "Or do they have partners? Then let them bring their partners, if they should be truthful.",
    "The Day the shin will be uncovered and they are invited to prostration but the disbelievers will not be able,",
    "Their eyes humbled, humiliation will cover them. And they used to be invited to prostration while they were sound.",
    "So leave Me, [O Muhammad], with [the matter of] whoever denies the Qur'an. We will progressively lead them [to punishment] from where they do not know.",
    "And I will give them time. Indeed, My plan is firm.",
    "Or do you ask of them a payment, so they are by debt burdened down?",
    "Or have they [knowledge of] the unseen, so they write [it] down?",
    "Then be patient for the decision of your Lord, [O Muhammad], and be not like the companion of the fish when he called out while he was distressed.",
    "If not that a favor from his Lord overtook him, he would have been thrown onto the naked shore while he was censured.",
    "And his Lord chose him and made him of the righteous.",
    "And indeed, those who disbelieve would almost make you slip with their eyes when they hear the message, and they say, \"Indeed, he is mad.\"",
    "But it is not except a reminder to the worlds.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__qalam);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_qalam);
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
