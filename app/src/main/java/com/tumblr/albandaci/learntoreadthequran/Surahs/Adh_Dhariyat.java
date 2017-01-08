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

public class Adh_Dhariyat extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"51:1", "51:2", "51:3", "51:4", "51:5", "51:6", "51:7", "51:8", "51:9", "51:10", "51:11", "51:12", "51:13", "51:14", "51:15", "51:16",
            "51:17", "51:18", "51:19", "51:20", "51:21", "51:22", "51:23", "51:24", "51:25", "51:26", "51:27", "51:28", "51:29", "51:30", "51:31", "51:32",
            "51:33", "51:34", "51:35", "51:36", "51:37", "51:38", "51:39", "51:40", "51:41", "51:42", "51:43", "51:44", "51:45", "51:46", "51:47", "51:48",
            "51:49", "51:50", "51:51", "51:52", "51:53", "51:54", "51:55", "51:56", "51:57", "51:58", "51:59", "51:60"};

    String [] arabic_verses = {"وَالذَّارِيَاتِ ذَرْوًا",
    "فَالْحَامِلَاتِ وِقْرًا",
    "فَالْجَارِيَاتِ يُسْرًا",
    "فَالْمُقَسِّمَاتِ أَمْرًا",
    "إِنَّمَا تُوعَدُونَ لَصَادِقٌ",
    "وَإِنَّ الدِّينَ لَوَاقِعٌ",
    "وَالسَّمَاءِ ذَاتِ الْحُبُكِ",
    "إِنَّكُمْ لَفِي قَوْلٍ مُّخْتَلِفٍ",
    "يُؤْفَكُ عَنْهُ مَنْ أُفِكَ",
    "قُتِلَ الْخَرَّاصُونَ",
    "الَّذِينَ هُمْ فِي غَمْرَةٍ سَاهُونَ",
    "يَسْأَلُونَ أَيَّانَ يَوْمُ الدِّينِ",
    "يَوْمَ هُمْ عَلَى النَّارِ يُفْتَنُونَ",
    "ذُوقُوا فِتْنَتَكُمْ هَٰذَا الَّذِي كُنتُم بِهِ تَسْتَعْجِلُونَ",
    "إِنَّ الْمُتَّقِينَ فِي جَنَّاتٍ وَعُيُونٍ",
    "آخِذِينَ مَا آتَاهُمْ رَبُّهُمْ ۚ إِنَّهُمْ كَانُوا قَبْلَ ذَٰلِكَ مُحْسِنِينَ",
    "كَانُوا قَلِيلًا مِّنَ اللَّيْلِ مَا يَهْجَعُونَ",
    "وَبِالْأَسْحَارِ هُمْ يَسْتَغْفِرُونَ",
    "وَفِي أَمْوَالِهِمْ حَقٌّ لِّلسَّائِلِ وَالْمَحْرُومِ",
    "وَفِي الْأَرْضِ آيَاتٌ لِّلْمُوقِنِينَ",
    "وَفِي أَنفُسِكُمْ ۚ أَفَلَا تُبْصِرُونَ",
    "وَفِي السَّمَاءِ رِزْقُكُمْ وَمَا تُوعَدُونَ",
    "فَوَرَبِّ السَّمَاءِ وَالْأَرْضِ إِنَّهُ لَحَقٌّ مِّثْلَ مَا أَنَّكُمْ تَنطِقُونَ",
    "هَلْ أَتَاكَ حَدِيثُ ضَيْفِ إِبْرَاهِيمَ الْمُكْرَمِينَ",
    "إِذْ دَخَلُوا عَلَيْهِ فَقَالُوا سَلَامًا ۖ قَالَ سَلَامٌ قَوْمٌ مُّنكَرُونَ",
    "فَرَاغَ إِلَىٰ أَهْلِهِ فَجَاءَ بِعِجْلٍ سَمِينٍ",
    "فَقَرَّبَهُ إِلَيْهِمْ قَالَ أَلَا تَأْكُلُونَ",
    "فَأَوْجَسَ مِنْهُمْ خِيفَةً ۖ قَالُوا لَا تَخَفْ ۖ وَبَشَّرُوهُ بِغُلَامٍ عَلِيمٍ",
    "فَأَقْبَلَتِ امْرَأَتُهُ فِي صَرَّةٍ فَصَكَّتْ وَجْهَهَا وَقَالَتْ عَجُوزٌ عَقِيمٌ",
    "قَالُوا كَذَٰلِكِ قَالَ رَبُّكِ ۖ إِنَّهُ هُوَ الْحَكِيمُ الْعَلِيمُ",
    "قَالَ فَمَا خَطْبُكُمْ أَيُّهَا الْمُرْسَلُونَ",
    "قَالُوا إِنَّا أُرْسِلْنَا إِلَىٰ قَوْمٍ مُّجْرِمِينَ",
    "لِنُرْسِلَ عَلَيْهِمْ حِجَارَةً مِّن طِينٍ",
    "مُّسَوَّمَةً عِندَ رَبِّكَ لِلْمُسْرِفِينَ",
    "فَأَخْرَجْنَا مَن كَانَ فِيهَا مِنَ الْمُؤْمِنِينَ",
    "فَمَا وَجَدْنَا فِيهَا غَيْرَ بَيْتٍ مِّنَ الْمُسْلِمِينَ",
    "وَتَرَكْنَا فِيهَا آيَةً لِّلَّذِينَ يَخَافُونَ الْعَذَابَ الْأَلِيمَ",
    "وَفِي مُوسَىٰ إِذْ أَرْسَلْنَاهُ إِلَىٰ فِرْعَوْنَ بِسُلْطَانٍ مُّبِينٍ",
    "فَتَوَلَّىٰ بِرُكْنِهِ وَقَالَ سَاحِرٌ أَوْ مَجْنُونٌ",
    "فَأَخَذْنَاهُ وَجُنُودَهُ فَنَبَذْنَاهُمْ فِي الْيَمِّ وَهُوَ مُلِيمٌ",
    "وَفِي عَادٍ إِذْ أَرْسَلْنَا عَلَيْهِمُ الرِّيحَ الْعَقِيمَ",
    "مَا تَذَرُ مِن شَيْءٍ أَتَتْ عَلَيْهِ إِلَّا جَعَلَتْهُ كَالرَّمِيمِ",
    "وَفِي ثَمُودَ إِذْ قِيلَ لَهُمْ تَمَتَّعُوا حَتَّىٰ حِينٍ",
    "فَعَتَوْا عَنْ أَمْرِ رَبِّهِمْ فَأَخَذَتْهُمُ الصَّاعِقَةُ وَهُمْ يَنظُرُونَ",
    "فَمَا اسْتَطَاعُوا مِن قِيَامٍ وَمَا كَانُوا مُنتَصِرِينَ",
    "وَقَوْمَ نُوحٍ مِّن قَبْلُ ۖ إِنَّهُمْ كَانُوا قَوْمًا فَاسِقِينَ",
    "وَالسَّمَاءَ بَنَيْنَاهَا بِأَيْدٍ وَإِنَّا لَمُوسِعُونَ",
    "وَالْأَرْضَ فَرَشْنَاهَا فَنِعْمَ الْمَاهِدُونَ",
    "وَمِن كُلِّ شَيْءٍ خَلَقْنَا زَوْجَيْنِ لَعَلَّكُمْ تَذَكَّرُونَ",
    "فَفِرُّوا إِلَى اللَّهِ ۖ إِنِّي لَكُم مِّنْهُ نَذِيرٌ مُّبِينٌ",
    "وَلَا تَجْعَلُوا مَعَ اللَّهِ إِلَٰهًا آخَرَ ۖ إِنِّي لَكُم مِّنْهُ نَذِيرٌ مُّبِينٌ",
    "كَذَٰلِكَ مَا أَتَى الَّذِينَ مِن قَبْلِهِم مِّن رَّسُولٍ إِلَّا قَالُوا سَاحِرٌ أَوْ مَجْنُونٌ",
    "أَتَوَاصَوْا بِهِ ۚ بَلْ هُمْ قَوْمٌ طَاغُونَ",
    "فَتَوَلَّ عَنْهُمْ فَمَا أَنتَ بِمَلُومٍ",
    "وَذَكِّرْ فَإِنَّ الذِّكْرَىٰ تَنفَعُ الْمُؤْمِنِينَ",
    "وَمَا خَلَقْتُ الْجِنَّ وَالْإِنسَ إِلَّا لِيَعْبُدُونِ",
    "مَا أُرِيدُ مِنْهُم مِّن رِّزْقٍ وَمَا أُرِيدُ أَن يُطْعِمُونِ",
    "إِنَّ اللَّهَ هُوَ الرَّزَّاقُ ذُو الْقُوَّةِ الْمَتِينُ",
    "فَإِنَّ لِلَّذِينَ ظَلَمُوا ذَنُوبًا مِّثْلَ ذَنُوبِ أَصْحَابِهِمْ فَلَا يَسْتَعْجِلُونِ",
    "فَوَيْلٌ لِّلَّذِينَ كَفَرُوا مِن يَوْمِهِمُ الَّذِي يُوعَدُونَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"By those [winds] scattering [dust] dispersing",
    "And those [clouds] carrying a load [of water]",
    "And those [ships] sailing with ease",
    "And those [angels] apportioning [each] matter,",
    "Indeed, what you are promised is true.",
    "And indeed, the recompense is to occur.",
    "By the heaven containing pathways,",
    "Indeed, you are in differing speech.",
    "Deluded away from the Qur'an is he who is deluded.",
    "Destroyed are the falsifiers",
    "Who are within a flood [of confusion] and heedless.",
    "They ask, \"When is the Day of Recompense?\"",
    "[It is] the Day they will be tormented over the Fire",
    "[And will be told], \"Taste your torment. This is that for which you were impatient.\"",
    "Indeed, the righteous will be among gardens and springs,",
    "Accepting what their Lord has given them. Indeed, they were before that doers of good.",
    "They used to sleep but little of the night,",
    "And in the hours before dawn they would ask forgiveness,",
    "And from their properties was [given] the right of the [needy] petitioner and the deprived.",
    "And on the earth are signs for the certain [in faith]",
    "And in yourselves. Then will you not see?",
    "And in the heaven is your provision and whatever you are promised.",
    "Then by the Lord of the heaven and earth, indeed, it is truth - just as [sure as] it is that you are speaking.",
    "Has there reached you the story of the honored guests of Abraham? -",
    "When they entered upon him and said, \"[We greet you with] peace.\" He answered, \"[And upon you] peace, [you are] a people unknown.",
    "Then he went to his family and came with a fat [roasted] calf",
    "And placed it near them; he said, \"Will you not eat?\"",
    "And he felt from them apprehension. They said, \"Fear not,\" and gave him good tidings of a learned boy.",
    "And his wife approached with a cry [of alarm] and struck her face and said, \"[I am] a barren old woman!\"",
    "They said, \"Thus has said your Lord; indeed, He is the Wise, the Knowing.\"",
    "[Abraham] said, \"Then what is your business [here], O messengers?\"",
    "They said, \"Indeed, we have been sent to a people of criminals",
    "To send down upon them stones of clay,",
    "Marked in the presence of your Lord for the transgressors.\"",
    "So We brought out whoever was in the cities of the believers.",
    "And We found not within them other than a [single] house of Muslims.",
    "And We left therein a sign for those who fear the painful punishment.",
    "And in Moses [was a sign], when We sent him to Pharaoh with clear authority.",
    "But he turned away with his supporters and said,\" A magician or a madman.\"",
    "So We took him and his soldiers and cast them into the sea, and he was blameworthy.",
    "And in 'Aad [was a sign], when We sent against them the barren wind.",
    "It left nothing of what it came upon but that it made it like disintegrated ruins.",
    "And in Thamud, when it was said to them, \"Enjoy yourselves for a time.\"",
    "But they were insolent toward the command of their Lord, so the thunderbolt seized them while they were looking on.",
    "And they were unable to arise, nor could they defend themselves.",
    "And [We destroyed] the people of Noah before; indeed, they were a people defiantly disobedient.",
    "And the heaven We constructed with strength, and indeed, We are [its] expander.",
    "And the earth We have spread out, and excellent is the preparer.",
    "And of all things We created two mates; perhaps you will remember.",
    "So flee to Allah. Indeed, I am to you from Him a clear warner.",
    "And do not make [as equal] with Allah another deity. Indeed, I am to you from Him a clear warner.",
    "Similarly, there came not to those before them any messenger except that they said, \"A magician or a madman.\"",
    "Did they suggest it to them? Rather, they [themselves] are a transgressing people.",
    "So leave them, [O Muhammad], for you are not to be blamed.",
    "And remind, for indeed, the reminder benefits the believers.",
    "And I did not create the jinn and mankind except to worship Me.",
    "I do not want from them any provision, nor do I want them to feed Me.",
    "Indeed, it is Allah who is the [continual] Provider, the firm possessor of strength.",
    "And indeed, for those who have wronged is a portion [of punishment] like the portion of their predecessors, so let them not impatiently urge Me.",
    "And woe to those who have disbelieved from their Day which they are promised."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adh__dhariyat);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_adh_dhariyat);
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
