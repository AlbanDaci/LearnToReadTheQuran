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

public class As_Sajdah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"32:1", "32:2", "32:3", "32:4", "32:5", "32:6", "32:7", "32:8", "32:9", "32:10", "32:11", "32:12", "32:13", "32:14", "32:15", "32:16",
            "32:17", "32:18", "32:19", "32:20", "32:21", "32:22", "32:23", "32:24", "32:25", "32:26", "32:27", "32:28", "32:29", "32:30"};

    String [] arabic_verses = {"الم",
    "تَنزِيلُ الْكِتَابِ لَا رَيْبَ فِيهِ مِن رَّبِّ الْعَالَمِينَ",
    "أَمْ يَقُولُونَ افْتَرَاهُ ۚ بَلْ هُوَ الْحَقُّ مِن رَّبِّكَ لِتُنذِرَ قَوْمًا مَّا أَتَاهُم مِّن نَّذِيرٍ مِّن قَبْلِكَ لَعَلَّهُمْ يَهْتَدُونَ",
    "اللَّهُ الَّذِي خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا فِي سِتَّةِ أَيَّامٍ ثُمَّ اسْتَوَىٰ عَلَى الْعَرْشِ ۖ مَا لَكُم مِّن دُونِهِ مِن وَلِيٍّ وَلَا شَفِيعٍ ۚ أَفَلَا تَتَذَكَّرُونَ",
    "يُدَبِّرُ الْأَمْرَ مِنَ السَّمَاءِ إِلَى الْأَرْضِ ثُمَّ يَعْرُجُ إِلَيْهِ فِي يَوْمٍ كَانَ مِقْدَارُهُ أَلْفَ سَنَةٍ مِّمَّا تَعُدُّونَ",
    "ذَٰلِكَ عَالِمُ الْغَيْبِ وَالشَّهَادَةِ الْعَزِيزُ الرَّحِيمُ",
    "الَّذِي أَحْسَنَ كُلَّ شَيْءٍ خَلَقَهُ ۖ وَبَدَأَ خَلْقَ الْإِنسَانِ مِن طِينٍ",
    "ثُمَّ جَعَلَ نَسْلَهُ مِن سُلَالَةٍ مِّن مَّاءٍ مَّهِينٍ",
    "ثُمَّ سَوَّاهُ وَنَفَخَ فِيهِ مِن رُّوحِهِ ۖ وَجَعَلَ لَكُمُ السَّمْعَ وَالْأَبْصَارَ وَالْأَفْئِدَةَ ۚ قَلِيلًا مَّا تَشْكُرُونَ",
    "وَقَالُوا أَإِذَا ضَلَلْنَا فِي الْأَرْضِ أَإِنَّا لَفِي خَلْقٍ جَدِيدٍ ۚ بَلْ هُم بِلِقَاءِ رَبِّهِمْ كَافِرُونَ",
    "قُلْ يَتَوَفَّاكُم مَّلَكُ الْمَوْتِ الَّذِي وُكِّلَ بِكُمْ ثُمَّ إِلَىٰ رَبِّكُمْ تُرْجَعُونَ",
    "وَلَوْ تَرَىٰ إِذِ الْمُجْرِمُونَ نَاكِسُو رُءُوسِهِمْ عِندَ رَبِّهِمْ رَبَّنَا أَبْصَرْنَا وَسَمِعْنَا فَارْجِعْنَا نَعْمَلْ صَالِحًا إِنَّا مُوقِنُونَ",
    "وَلَوْ شِئْنَا لَآتَيْنَا كُلَّ نَفْسٍ هُدَاهَا وَلَٰكِنْ حَقَّ الْقَوْلُ مِنِّي لَأَمْلَأَنَّ جَهَنَّمَ مِنَ الْجِنَّةِ وَالنَّاسِ أَجْمَعِينَ",
    "فَذُوقُوا بِمَا نَسِيتُمْ لِقَاءَ يَوْمِكُمْ هَٰذَا إِنَّا نَسِينَاكُمْ ۖ وَذُوقُوا عَذَابَ الْخُلْدِ بِمَا كُنتُمْ تَعْمَلُونَ",
    "إِنَّمَا يُؤْمِنُ بِآيَاتِنَا الَّذِينَ إِذَا ذُكِّرُوا بِهَا خَرُّوا سُجَّدًا وَسَبَّحُوا بِحَمْدِ رَبِّهِمْ وَهُمْ لَا يَسْتَكْبِرُونَ ۩",
    "تَتَجَافَىٰ جُنُوبُهُمْ عَنِ الْمَضَاجِعِ يَدْعُونَ رَبَّهُمْ خَوْفًا وَطَمَعًا وَمِمَّا رَزَقْنَاهُمْ يُنفِقُونَ",
    "فَلَا تَعْلَمُ نَفْسٌ مَّا أُخْفِيَ لَهُم مِّن قُرَّةِ أَعْيُنٍ جَزَاءً بِمَا كَانُوا يَعْمَلُونَ",
    "أَفَمَن كَانَ مُؤْمِنًا كَمَن كَانَ فَاسِقًا ۚ لَّا يَسْتَوُونَ",
    "أَمَّا الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ فَلَهُمْ جَنَّاتُ الْمَأْوَىٰ نُزُلًا بِمَا كَانُوا يَعْمَلُونَ",
    "وَأَمَّا الَّذِينَ فَسَقُوا فَمَأْوَاهُمُ النَّارُ ۖ كُلَّمَا أَرَادُوا أَن يَخْرُجُوا مِنْهَا أُعِيدُوا فِيهَا وَقِيلَ لَهُمْ ذُوقُوا عَذَابَ النَّارِ الَّذِي كُنتُم بِهِ تُكَذِّبُونَ",
    "وَلَنُذِيقَنَّهُم مِّنَ الْعَذَابِ الْأَدْنَىٰ دُونَ الْعَذَابِ الْأَكْبَرِ لَعَلَّهُمْ يَرْجِعُونَ",
    "وَمَنْ أَظْلَمُ مِمَّن ذُكِّرَ بِآيَاتِ رَبِّهِ ثُمَّ أَعْرَضَ عَنْهَا ۚ إِنَّا مِنَ الْمُجْرِمِينَ مُنتَقِمُونَ",
    "وَلَقَدْ آتَيْنَا مُوسَى الْكِتَابَ فَلَا تَكُن فِي مِرْيَةٍ مِّن لِّقَائِهِ ۖ وَجَعَلْنَاهُ هُدًى لِّبَنِي إِسْرَائِيلَ",
    "وَجَعَلْنَا مِنْهُمْ أَئِمَّةً يَهْدُونَ بِأَمْرِنَا لَمَّا صَبَرُوا ۖ وَكَانُوا بِآيَاتِنَا يُوقِنُونَ",
    "إِنَّ رَبَّكَ هُوَ يَفْصِلُ بَيْنَهُمْ يَوْمَ الْقِيَامَةِ فِيمَا كَانُوا فِيهِ يَخْتَلِفُونَ",
    "أَوَلَمْ يَهْدِ لَهُمْ كَمْ أَهْلَكْنَا مِن قَبْلِهِم مِّنَ الْقُرُونِ يَمْشُونَ فِي مَسَاكِنِهِمْ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ ۖ أَفَلَا يَسْمَعُونَ",
    "أَوَلَمْ يَرَوْا أَنَّا نَسُوقُ الْمَاءَ إِلَى الْأَرْضِ الْجُرُزِ فَنُخْرِجُ بِهِ زَرْعًا تَأْكُلُ مِنْهُ أَنْعَامُهُمْ وَأَنفُسُهُمْ ۖ أَفَلَا يُبْصِرُونَ",
    "وَيَقُولُونَ مَتَىٰ هَٰذَا الْفَتْحُ إِن كُنتُمْ صَادِقِينَ",
    "قُلْ يَوْمَ الْفَتْحِ لَا يَنفَعُ الَّذِينَ كَفَرُوا إِيمَانُهُمْ وَلَا هُمْ يُنظَرُونَ",
    "فَأَعْرِضْ عَنْهُمْ وَانتَظِرْ إِنَّهُم مُّنتَظِرُونَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"Alif, Lam, Meem.",
    "[This is] the revelation of the Book about which there is no doubt from the Lord of the worlds.",
    "Or do they say, \"He invented it\"? Rather, it is the truth from your Lord, [O Muhammad], that you may warn a people to whom no warner has come before you [so] perhaps they will be guided.",
    "It is Allah who created the heavens and the earth and whatever is between them in six days; then He established Himself above the Throne. You have not besides Him any protector or any intercessor; so will you not be reminded?",
    "He arranges [each] matter from the heaven to the earth; then it will ascend to Him in a Day, the extent of which is a thousand years of those which you count.",
    "That is the Knower of the unseen and the witnessed, the Exalted in Might, the Merciful,",
    "Who perfected everything which He created and began the creation of man from clay.",
    "Then He made his posterity out of the extract of a liquid disdained.",
    "Then He proportioned him and breathed into him from His [created] soul and made for you hearing and vision and hearts; little are you grateful.",
    "And they say, \"When we are lost within the earth, will we indeed be [recreated] in a new creation?\" Rather, they are, in [the matter of] the meeting with their Lord, disbelievers.",
    "Say, \"The angel of death will take you who has been entrusted with you. Then to your Lord you will be returned.\"",
    "If you could but see when the criminals are hanging their heads before their Lord, [saying], \"Our Lord, we have seen and heard, so return us [to the world]; we will work righteousness. Indeed, we are [now] certain.\"",
    "And if we had willed, We could have given every soul its guidance, but the word from Me will come into effect [that] \"I will surely fill Hell with jinn and people all together.",
    "So taste [punishment] because you forgot the meeting of this, your Day; indeed, We have [accordingly] forgotten you. And taste the punishment of eternity for what you used to do.\"",
    "Only those believe in Our verses who, when they are reminded by them, fall down in prostration and exalt [Allah] with praise of their Lord, and they are not arrogant.",
    "They arise from [their] beds; they supplicate their Lord in fear and aspiration, and from what We have provided them, they spend.",
    "And no soul knows what has been hidden for them of comfort for eyes as reward for what they used to do.",
    "Then is one who was a believer like one who was defiantly disobedient? They are not equal.",
    "As for those who believed and did righteous deeds, for them will be the Gardens of Refuge as accommodation for what they used to do.",
    "But as for those who defiantly disobeyed, their refuge is the Fire. Every time they wish to emerge from it, they will be returned to it while it is said to them, \"Taste the punishment of the Fire which you used to deny.\"",
    "And we will surely let them taste the nearer punishment short of the greater punishment that perhaps they will repent.",
    "And who is more unjust than one who is reminded of the verses of his Lord; then he turns away from them? Indeed We, from the criminals, will take retribution.",
    "And We certainly gave Moses the Scripture, so do not be in doubt over his meeting. And we made the Torah guidance for the Children of Israel.",
    "And We made from among them leaders guiding by Our command when they were patient and [when] they were certain of Our signs.",
    "Indeed, your Lord will judge between them on the Day of Resurrection concerning that over which they used to differ.",
    "Has it not become clear to them how many generations We destroyed before them, [as] they walk among their dwellings? Indeed in that are signs; then do they not hear?",
    "Have they not seen that We drive the water [in clouds] to barren land and bring forth thereby crops from which their livestock eat and [they] themselves? Then do they not see?",
    "And they say, \"When will be this conquest, if you should be truthful?\"",
    "Say, [O Muhammad], \"On the Day of Conquest the belief of those who had disbelieved will not benefit them, nor will they be reprieved.\"",
    "So turn away from them and wait. Indeed, they are waiting."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_as__sajdah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_as_sajdah);
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
