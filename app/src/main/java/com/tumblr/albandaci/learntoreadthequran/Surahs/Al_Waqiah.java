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

public class Al_Waqiah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"56:1", "56:2", "56:3", "56:4", "56:5", "56:6", "56:7", "56:8", "56:9", "56:10", "56:11", "56:12", "56:13", "56:14", "56:15", "56:16",
            "56:17", "56:18", "56:19", "56:20", "56:21", "56:22", "56:23", "56:24", "56:25", "56:26", "56:27", "56:28", "56:29", "56:30", "56:31", "56:32",
            "56:33", "56:34", "56:35", "56:36", "56:37", "56:38", "56:39", "56:40", "56:41", "56:42", "56:43", "56:44", "56:45", "56:46", "56:47", "56:48",
            "56:49", "56:50", "56:51", "56:52", "56:53", "56:54", "56:55", "56:56", "56:57", "56:58", "56:59", "56:60", "56:61", "56:62", "56:63", "56:64",
            "56:65", "56:66", "56:67", "56:68", "56:69", "56:70", "56:71", "56:72", "56:73", "56:74", "56:75", "56:76", "56:77", "56:78", "56:79", "56:80",
            "56:81", "56:82", "56:83", "56:84", "56:85", "56:86", "56:87", "56:88", "56:89", "56:90", "56:91", "56:92", "56:93", "56:94", "56:95", "56:96"};

    String [] arabic_verses = {"إِذَا وَقَعَتِ الْوَاقِعَةُ",
    "لَيْسَ لِوَقْعَتِهَا كَاذِبَةٌ",
    "خَافِضَةٌ رَّافِعَةٌ",
    "إِذَا رُجَّتِ الْأَرْضُ رَجًّا",
    "وَبُسَّتِ الْجِبَالُ بَسًّا",
    "فَكَانَتْ هَبَاءً مُّنبَثًّا",
    "وَكُنتُمْ أَزْوَاجًا ثَلَاثَةً",
    "فَأَصْحَابُ الْمَيْمَنَةِ مَا أَصْحَابُ الْمَيْمَنَةِ",
    "وَأَصْحَابُ الْمَشْأَمَةِ مَا أَصْحَابُ الْمَشْأَمَةِ",
    "وَالسَّابِقُونَ السَّابِقُونَ",
    "أُولَٰئِكَ الْمُقَرَّبُونَ",
    "فِي جَنَّاتِ النَّعِيمِ",
    "ثُلَّةٌ مِّنَ الْأَوَّلِينَ",
    "وَقَلِيلٌ مِّنَ الْآخِرِينَ",
    "عَلَىٰ سُرُرٍ مَّوْضُونَةٍ",
    "مُّتَّكِئِينَ عَلَيْهَا مُتَقَابِلِينَ",
    "يَطُوفُ عَلَيْهِمْ وِلْدَانٌ مُّخَلَّدُونَ",
    "بِأَكْوَابٍ وَأَبَارِيقَ وَكَأْسٍ مِّن مَّعِينٍ",
    "لَّا يُصَدَّعُونَ عَنْهَا وَلَا يُنزِفُونَ",
    "وَفَاكِهَةٍ مِّمَّا يَتَخَيَّرُونَ",
    "وَلَحْمِ طَيْرٍ مِّمَّا يَشْتَهُونَ",
    "وَحُورٌ عِينٌ",
    "كَأَمْثَالِ اللُّؤْلُؤِ الْمَكْنُونِ",
    "جَزَاءً بِمَا كَانُوا يَعْمَلُونَ",
    "لَا يَسْمَعُونَ فِيهَا لَغْوًا وَلَا تَأْثِيمًا",
    "إِلَّا قِيلًا سَلَامًا سَلَامًا",
    "وَأَصْحَابُ الْيَمِينِ مَا أَصْحَابُ الْيَمِينِ",
    "فِي سِدْرٍ مَّخْضُودٍ",
    "وَطَلْحٍ مَّنضُودٍ",
    "وَظِلٍّ مَّمْدُودٍ",
    "وَمَاءٍ مَّسْكُوبٍ",
    "وَفَاكِهَةٍ كَثِيرَةٍ",
    "لَّا مَقْطُوعَةٍ وَلَا مَمْنُوعَةٍ",
    "وَفُرُشٍ مَّرْفُوعَةٍ",
    "إِنَّا أَنشَأْنَاهُنَّ إِنشَاءً",
    "فَجَعَلْنَاهُنَّ أَبْكَارًا",
    "عُرُبًا أَتْرَابًا",
    "لِّأَصْحَابِ الْيَمِينِ",
    "ثُلَّةٌ مِّنَ الْأَوَّلِينَ",
    "وَثُلَّةٌ مِّنَ الْآخِرِينَ",
    "وَأَصْحَابُ الشِّمَالِ مَا أَصْحَابُ الشِّمَالِ",
    "فِي سَمُومٍ وَحَمِيمٍ",
    "وَظِلٍّ مِّن يَحْمُومٍ",
    "لَّا بَارِدٍ وَلَا كَرِيمٍ",
    "إِنَّهُمْ كَانُوا قَبْلَ ذَٰلِكَ مُتْرَفِينَ",
    "وَكَانُوا يُصِرُّونَ عَلَى الْحِنثِ الْعَظِيمِ",
    "وَكَانُوا يَقُولُونَ أَئِذَا مِتْنَا وَكُنَّا تُرَابًا وَعِظَامًا أَإِنَّا لَمَبْعُوثُونَ",
    "أَوَآبَاؤُنَا الْأَوَّلُونَ",
    "قُلْ إِنَّ الْأَوَّلِينَ وَالْآخِرِينَ",
    "لَمَجْمُوعُونَ إِلَىٰ مِيقَاتِ يَوْمٍ مَّعْلُومٍ",
    "ثُمَّ إِنَّكُمْ أَيُّهَا الضَّالُّونَ الْمُكَذِّبُونَ",
    "لَآكِلُونَ مِن شَجَرٍ مِّن زَقُّومٍ",
    "فَمَالِئُونَ مِنْهَا الْبُطُونَ",
    "فَشَارِبُونَ عَلَيْهِ مِنَ الْحَمِيمِ",
    "فَشَارِبُونَ شُرْبَ الْهِيمِ",
    "هَٰذَا نُزُلُهُمْ يَوْمَ الدِّينِ",
    "نَحْنُ خَلَقْنَاكُمْ فَلَوْلَا تُصَدِّقُونَ",
    "أَفَرَأَيْتُم مَّا تُمْنُونَ",
    "أَأَنتُمْ تَخْلُقُونَهُ أَمْ نَحْنُ الْخَالِقُونَ",
    "نَحْنُ قَدَّرْنَا بَيْنَكُمُ الْمَوْتَ وَمَا نَحْنُ بِمَسْبُوقِينَ",
    "عَلَىٰ أَن نُّبَدِّلَ أَمْثَالَكُمْ وَنُنشِئَكُمْ فِي مَا لَا تَعْلَمُونَ",
    "وَلَقَدْ عَلِمْتُمُ النَّشْأَةَ الْأُولَىٰ فَلَوْلَا تَذَكَّرُونَ",
    "أَفَرَأَيْتُم مَّا تَحْرُثُونَ",
    "أَأَنتُمْ تَزْرَعُونَهُ أَمْ نَحْنُ الزَّارِعُونَ",
    "لَوْ نَشَاءُ لَجَعَلْنَاهُ حُطَامًا فَظَلْتُمْ تَفَكَّهُونَ",
    "إِنَّا لَمُغْرَمُونَ",
    "بَلْ نَحْنُ مَحْرُومُونَ",
    "أَفَرَأَيْتُمُ الْمَاءَ الَّذِي تَشْرَبُونَ",
    "أَأَنتُمْ أَنزَلْتُمُوهُ مِنَ الْمُزْنِ أَمْ نَحْنُ الْمُنزِلُونَ",
    "لَوْ نَشَاءُ جَعَلْنَاهُ أُجَاجًا فَلَوْلَا تَشْكُرُونَ",
    "أَفَرَأَيْتُمُ النَّارَ الَّتِي تُورُونَ",
    "أَأَنتُمْ أَنشَأْتُمْ شَجَرَتَهَا أَمْ نَحْنُ الْمُنشِئُونَ",
    "نَحْنُ جَعَلْنَاهَا تَذْكِرَةً وَمَتَاعًا لِّلْمُقْوِينَ",
    "فَسَبِّحْ بِاسْمِ رَبِّكَ الْعَظِيمِ",
    "فَلَا أُقْسِمُ بِمَوَاقِعِ النُّجُومِ",
    "وَإِنَّهُ لَقَسَمٌ لَّوْ تَعْلَمُونَ عَظِيمٌ",
    "إِنَّهُ لَقُرْآنٌ كَرِيمٌ",
    "فِي كِتَابٍ مَّكْنُونٍ",
    "لَّا يَمَسُّهُ إِلَّا الْمُطَهَّرُونَ",
    "تَنزِيلٌ مِّن رَّبِّ الْعَالَمِينَ",
    "أَفَبِهَٰذَا الْحَدِيثِ أَنتُم مُّدْهِنُونَ",
    "وَتَجْعَلُونَ رِزْقَكُمْ أَنَّكُمْ تُكَذِّبُونَ",
    "فَلَوْلَا إِذَا بَلَغَتِ الْحُلْقُومَ",
    "وَأَنتُمْ حِينَئِذٍ تَنظُرُونَ",
    "وَنَحْنُ أَقْرَبُ إِلَيْهِ مِنكُمْ وَلَٰكِن لَّا تُبْصِرُونَ",
    "فَلَوْلَا إِن كُنتُمْ غَيْرَ مَدِينِينَ",
    "تَرْجِعُونَهَا إِن كُنتُمْ صَادِقِينَ",
    "فَأَمَّا إِن كَانَ مِنَ الْمُقَرَّبِينَ",
    "فَرَوْحٌ وَرَيْحَانٌ وَجَنَّتُ نَعِيمٍ",
    "وَأَمَّا إِن كَانَ مِنْ أَصْحَابِ الْيَمِينِ",
    "فَسَلَامٌ لَّكَ مِنْ أَصْحَابِ الْيَمِينِ",
    "وَأَمَّا إِن كَانَ مِنَ الْمُكَذِّبِينَ الضَّالِّينَ",
    "فَنُزُلٌ مِّنْ حَمِيمٍ",
    "وَتَصْلِيَةُ جَحِيمٍ",
    "إِنَّ هَٰذَا لَهُوَ حَقُّ الْيَقِينِ",
    "فَسَبِّحْ بِاسْمِ رَبِّكَ الْعَظِيمِ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"When the Occurrence occurs,",
    "There is, at its occurrence, no denial.",
    "It will bring down [some] and raise up [others].",
    "When the earth is shaken with convulsion",
    "And the mountains are broken down, crumbling",
    "And become dust dispersing.",
    "And you become [of] three kinds:",
    "Then the companions of the right - what are the companions of the right?",
    "And the companions of the left - what are the companions of the left?",
    "And the forerunners, the forerunners -",
    "Those are the ones brought near [to Allah]",
    "In the Gardens of Pleasure,",
    "A [large] company of the former peoples",
    "And a few of the later peoples,",
    "On thrones woven [with ornament],",
    "Reclining on them, facing each other.",
    "There will circulate among them young boys made eternal",
    "With vessels, pitchers and a cup [of wine] from a flowing spring -",
    "No headache will they have therefrom, nor will they be intoxicated -",
    "And fruit of what they select",
    "And the meat of fowl, from whatever they desire.",
    "And [for them are] fair women with large, [beautiful] eyes,",
    "The likenesses of pearls well-protected,",
    "As reward for what they used to do.",
    "They will not hear therein ill speech or commission of sin -",
    "Only a saying: \"Peace, peace.\"",
    "The companions of the right - what are the companions of the right?",
    "[They will be] among lote trees with thorns removed",
    "And [banana] trees layered [with fruit]",
    "And shade extended",
    "And water poured out",
    "And fruit, abundant [and varied],",
    "Neither limited [to season] nor forbidden,",
    "And [upon] beds raised high.",
    "Indeed, We have produced the women of Paradise in a [new] creation",
    "And made them virgins,",
    "Devoted [to their husbands] and of equal age,",
    "For the companions of the right [who are]",
    "A company of the former peoples",
    "And a company of the later peoples.",
    "And the companions of the left - what are the companions of the left?",
    "[They will be] in scorching fire and scalding water",
    "And a shade of black smoke,",
    "Neither cool nor beneficial.",
    "Indeed they were, before that, indulging in affluence,",
    "And they used to persist in the great violation,",
    "And they used to say, \"When we die and become dust and bones, are we indeed to be resurrected?",
    "And our forefathers [as well]?\"",
    "Say, [O Muhammad], \"Indeed, the former and the later peoples",
    "Are to be gathered together for the appointment of a known Day.\"",
    "Then indeed you, O those astray [who are] deniers,",
    "Will be eating from trees of zaqqum",
    "And filling with it your bellies",
    "And drinking on top of it from scalding water",
    "And will drink as the drinking of thirsty camels.",
    "That is their accommodation on the Day of Recompense.",
    "We have created you, so why do you not believe?",
    "Have you seen that which you emit?",
    "Is it you who creates it, or are We the Creator?",
    "We have decreed death among you, and We are not to be outdone",
    "In that We will change your likenesses and produce you in that [form] which you do not know.",
    "And you have already known the first creation, so will you not remember?",
    "And have you seen that [seed] which you sow?",
    "Is it you who makes it grow, or are We the grower?",
    "If We willed, We could make it [dry] debris, and you would remain in wonder,",
    "[Saying], \"Indeed, we are [now] in debt;",
    "Rather, we have been deprived.\"",
    "And have you seen the water that you drink?",
    "Is it you who brought it down from the clouds, or is it We who bring it down?",
    "If We willed, We could make it bitter, so why are you not grateful?",
    "And have you seen the fire that you ignite?",
    "Is it you who produced its tree, or are We the producer?",
    "We have made it a reminder and provision for the travelers,",
    "So exalt the name of your Lord, the Most Great.",
    "Then I swear by the setting of the stars,",
    "And indeed, it is an oath - if you could know - [most] great.",
    "Indeed, it is a noble Qur'an",
    "In a Register well-protected;",
    "None touch it except the purified.",
    "[It is] a revelation from the Lord of the worlds.",
    "Then is it to this statement that you are indifferent",
    "And make [the thanks for] your provision that you deny [the Provider]?",
    "Then why, when the soul at death reaches the throat",
    "And you are at that time looking on -",
    "And Our angels are nearer to him than you, but you do not see -",
    "Then why do you not, if you are not to be recompensed,",
    "Bring it back, if you should be truthful?",
    "And if the deceased was of those brought near to Allah,",
    "Then [for him is] rest and bounty and a garden of pleasure.",
    "And if he was of the companions of the right,",
    "Then [the angels will say], \"Peace for you; [you are] from the companions of the right.\"",
    "But if he was of the deniers [who were] astray,",
    "Then [for him is] accommodation of scalding water",
    "And burning in Hellfire",
    "Indeed, this is the true certainty,",
    "So exalt the name of your Lord, the Most Great."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__waqiah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_waqiah);
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
