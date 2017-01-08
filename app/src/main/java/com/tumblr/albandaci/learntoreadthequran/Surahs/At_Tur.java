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

public class At_Tur extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"52:1", "52:2", "52:3", "52:4", "52:5", "52:6", "52:7", "52:8", "52:9", "52:10", "52:11", "52:12", "52:13", "52:14", "52:15", "52:16",
            "52:17", "52:18", "52:19", "52:20", "52:21", "52:22", "52:23", "52:24", "52:25", "52:26", "52:27", "52:28", "52:29", "52:30", "52:31", "52:32",
            "52:33", "52:34", "52:35", "52:36", "52:37", "52:38", "52:39", "52:40", "52:41", "52:42", "52:43", "52:44", "52:45", "52:46", "52:47", "52:48",
            "52:49"};

    String [] arabic_verses = {"وَالطُّورِ",
    "وَكِتَابٍ مَّسْطُورٍ",
    "فِي رَقٍّ مَّنشُورٍ",
    "وَالْبَيْتِ الْمَعْمُورِ",
    "وَالسَّقْفِ الْمَرْفُوعِ",
    "وَالْبَحْرِ الْمَسْجُورِ",
    "إِنَّ عَذَابَ رَبِّكَ لَوَاقِعٌ",
    "مَّا لَهُ مِن دَافِعٍ",
    "يَوْمَ تَمُورُ السَّمَاءُ مَوْرًا",
    "وَتَسِيرُ الْجِبَالُ سَيْرًا",
    "فَوَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ",
    "الَّذِينَ هُمْ فِي خَوْضٍ يَلْعَبُونَ",
    "يَوْمَ يُدَعُّونَ إِلَىٰ نَارِ جَهَنَّمَ دَعًّا",
    "هَٰذِهِ النَّارُ الَّتِي كُنتُم بِهَا تُكَذِّبُونَ",
    "أَفَسِحْرٌ هَٰذَا أَمْ أَنتُمْ لَا تُبْصِرُونَ",
    "اصْلَوْهَا فَاصْبِرُوا أَوْ لَا تَصْبِرُوا سَوَاءٌ عَلَيْكُمْ ۖ إِنَّمَا تُجْزَوْنَ مَا كُنتُمْ تَعْمَلُونَ",
    "إِنَّ الْمُتَّقِينَ فِي جَنَّاتٍ وَنَعِيمٍ",
    "فَاكِهِينَ بِمَا آتَاهُمْ رَبُّهُمْ وَوَقَاهُمْ رَبُّهُمْ عَذَابَ الْجَحِيمِ",
    "كُلُوا وَاشْرَبُوا هَنِيئًا بِمَا كُنتُمْ تَعْمَلُونَ",
    "مُتَّكِئِينَ عَلَىٰ سُرُرٍ مَّصْفُوفَةٍ ۖ وَزَوَّجْنَاهُم بِحُورٍ عِينٍ",
    "وَالَّذِينَ آمَنُوا وَاتَّبَعَتْهُمْ ذُرِّيَّتُهُم بِإِيمَانٍ أَلْحَقْنَا بِهِمْ ذُرِّيَّتَهُمْ وَمَا أَلَتْنَاهُم مِّنْ عَمَلِهِم مِّن شَيْءٍ ۚ كُلُّ امْرِئٍ بِمَا كَسَبَ رَهِينٌ",
    "وَأَمْدَدْنَاهُم بِفَاكِهَةٍ وَلَحْمٍ مِّمَّا يَشْتَهُونَ",
    "يَتَنَازَعُونَ فِيهَا كَأْسًا لَّا لَغْوٌ فِيهَا وَلَا تَأْثِيمٌ",
    "وَيَطُوفُ عَلَيْهِمْ غِلْمَانٌ لَّهُمْ كَأَنَّهُمْ لُؤْلُؤٌ مَّكْنُونٌ",
    "وَأَقْبَلَ بَعْضُهُمْ عَلَىٰ بَعْضٍ يَتَسَاءَلُونَ",
    "قَالُوا إِنَّا كُنَّا قَبْلُ فِي أَهْلِنَا مُشْفِقِينَ",
    "فَمَنَّ اللَّهُ عَلَيْنَا وَوَقَانَا عَذَابَ السَّمُومِ",
    "إِنَّا كُنَّا مِن قَبْلُ نَدْعُوهُ ۖ إِنَّهُ هُوَ الْبَرُّ الرَّحِيمُ",
    "فَذَكِّرْ فَمَا أَنتَ بِنِعْمَتِ رَبِّكَ بِكَاهِنٍ وَلَا مَجْنُونٍ",
    "أَمْ يَقُولُونَ شَاعِرٌ نَّتَرَبَّصُ بِهِ رَيْبَ الْمَنُونِ",
    "قُلْ تَرَبَّصُوا فَإِنِّي مَعَكُم مِّنَ الْمُتَرَبِّصِينَ",
    "أَمْ تَأْمُرُهُمْ أَحْلَامُهُم بِهَٰذَا ۚ أَمْ هُمْ قَوْمٌ طَاغُونَ",
    "أَمْ يَقُولُونَ تَقَوَّلَهُ ۚ بَل لَّا يُؤْمِنُونَ",
    "فَلْيَأْتُوا بِحَدِيثٍ مِّثْلِهِ إِن كَانُوا صَادِقِينَ",
    "أَمْ خُلِقُوا مِنْ غَيْرِ شَيْءٍ أَمْ هُمُ الْخَالِقُونَ",
    "أَمْ خَلَقُوا السَّمَاوَاتِ وَالْأَرْضَ ۚ بَل لَّا يُوقِنُونَ",
    "أَمْ عِندَهُمْ خَزَائِنُ رَبِّكَ أَمْ هُمُ الْمُصَيْطِرُونَ",
    "أَمْ لَهُمْ سُلَّمٌ يَسْتَمِعُونَ فِيهِ ۖ فَلْيَأْتِ مُسْتَمِعُهُم بِسُلْطَانٍ مُّبِينٍ",
    "أَمْ لَهُ الْبَنَاتُ وَلَكُمُ الْبَنُونَ",
    "أَمْ تَسْأَلُهُمْ أَجْرًا فَهُم مِّن مَّغْرَمٍ مُّثْقَلُونَ",
    "أَمْ عِندَهُمُ الْغَيْبُ فَهُمْ يَكْتُبُونَ",
    "أَمْ يُرِيدُونَ كَيْدًا ۖ فَالَّذِينَ كَفَرُوا هُمُ الْمَكِيدُونَ",
    "أَمْ لَهُمْ إِلَٰهٌ غَيْرُ اللَّهِ ۚ سُبْحَانَ اللَّهِ عَمَّا يُشْرِكُونَ",
    "وَإِن يَرَوْا كِسْفًا مِّنَ السَّمَاءِ سَاقِطًا يَقُولُوا سَحَابٌ مَّرْكُومٌ",
    "فَذَرْهُمْ حَتَّىٰ يُلَاقُوا يَوْمَهُمُ الَّذِي فِيهِ يُصْعَقُونَ",
    "يَوْمَ لَا يُغْنِي عَنْهُمْ كَيْدُهُمْ شَيْئًا وَلَا هُمْ يُنصَرُونَ",
    "وَإِنَّ لِلَّذِينَ ظَلَمُوا عَذَابًا دُونَ ذَٰلِكَ وَلَٰكِنَّ أَكْثَرَهُمْ لَا يَعْلَمُونَ",
    "وَاصْبِرْ لِحُكْمِ رَبِّكَ فَإِنَّكَ بِأَعْيُنِنَا ۖ وَسَبِّحْ بِحَمْدِ رَبِّكَ حِينَ تَقُومُ",
    "وَمِنَ اللَّيْلِ فَسَبِّحْهُ وَإِدْبَارَ النُّجُومِ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"By the mount",
    "And [by] a Book inscribed",
    "In parchment spread open",
    "And [by] the frequented House",
    "And [by] the heaven raised high",
    "And [by] the sea filled [with fire],",
    "Indeed, the punishment of your Lord will occur.",
    "Of it there is no preventer.",
    "On the Day the heaven will sway with circular motion",
    "And the mountains will pass on, departing -",
    "Then woe, that Day, to the deniers,",
    "Who are in [empty] discourse amusing themselves.",
    "The Day they are thrust toward the fire of Hell with a [violent] thrust, [its angels will say],",
    "\"This is the Fire which you used to deny.",
    "Then is this magic, or do you not see?",
    "[Enter to] burn therein; then be patient or impatient - it is all the same for you. You are only being recompensed [for] what you used to do.\"",
    "Indeed, the righteous will be in gardens and pleasure,",
    "Enjoying what their Lord has given them, and their Lord protected them from the punishment of Hellfire.",
    "[They will be told], \"Eat and drink in satisfaction for what you used to do.\"",
    "They will be reclining on thrones lined up, and We will marry them to fair women with large, [beautiful] eyes.",
    "And those who believed and whose descendants followed them in faith - We will join with them their descendants, and We will not deprive them of anything of their deeds. Every person, for what he earned, is retained.",
    "And We will provide them with fruit and meat from whatever they desire.",
    "They will exchange with one another a cup [of wine] wherein [results] no ill speech or commission of sin.",
    "There will circulate among them [servant] boys [especially] for them, as if they were pearls well-protected.",
    "And they will approach one another, inquiring of each other.",
    "They will say, \"Indeed, we were previously among our people fearful [of displeasing Allah].",
    "So Allah conferred favor upon us and protected us from the punishment of the Scorching Fire.",
    "Indeed, we used to supplicate Him before. Indeed, it is He who is the Beneficent, the Merciful.\"",
    "So remind [O Muhammad], for you are not, by the favor of your Lord, a soothsayer or a madman.",
    "Or do they say [of you], \"A poet for whom we await a misfortune of time?\"",
    "Say, \"Wait, for indeed I am, with you, among the waiters.\"",
    "Or do their minds command them to [say] this, or are they a transgressing people?",
    "Or do they say, \"He has made it up\"? Rather, they do not believe.",
    "Then let them produce a statement like it, if they should be truthful.",
    "Or were they created by nothing, or were they the creators [of themselves]?",
    "Or did they create the heavens and the earth? Rather, they are not certain.",
    "Or have they the depositories [containing the provision] of your Lord? Or are they the controllers [of them]?",
    "Or have they a stairway [into the heaven] upon which they listen? Then let their listener produce a clear authority.",
    "Or has He daughters while you have sons?",
    "Or do you, [O Muhammad], ask of them a payment, so they are by debt burdened down?",
    "Or have they [knowledge of] the unseen, so they write [it] down?",
    "Or do they intend a plan? But those who disbelieve - they are the object of a plan.",
    "Or have they a deity other than Allah? Exalted is Allah above whatever they associate with Him.",
    "And if they were to see a fragment from the sky falling, they would say, \"[It is merely] clouds heaped up.\"",
    "So leave them until they meet their Day in which they will be struck insensible -",
    "The Day their plan will not avail them at all, nor will they be helped.",
    "And indeed, for those who have wronged is a punishment before that, but most of them do not know.",
    "And be patient, [O Muhammad], for the decision of your Lord, for indeed, you are in Our eyes. And exalt [Allah] with praise of your Lord when you arise.",
    "And in a part of the night exalt Him and after [the setting of] the stars."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at__tur);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_at_tur);
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
