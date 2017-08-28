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

public class Muhammad extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"47:1", "47:2", "47:3", "47:4", "47:5", "47:6", "47:7", "47:8", "47:9", "47:10", "47:11", "47:12", "47:13", "47:14", "47:15", "47:16",
            "47:17", "47:18", "47:19", "47:20", "47:21", "47:22", "47:23", "47:24", "47:25", "47:26", "47:27", "47:28", "47:29", "47:30", "47:31", "47:32",
            "47:33", "47:34", "47:35", "47:36", "47:37", "47:38", ""};

    String [] arabic_verses = {"الَّذِينَ كَفَرُوا وَصَدُّوا عَن سَبِيلِ اللَّهِ أَضَلَّ أَعْمَالَهُمْ",
    "وَالَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ وَآمَنُوا بِمَا نُزِّلَ عَلَىٰ مُحَمَّدٍ وَهُوَ الْحَقُّ مِن رَّبِّهِمْ ۙ كَفَّرَ عَنْهُمْ سَيِّئَاتِهِمْ وَأَصْلَحَ بَالَهُمْ",
    "ذَٰلِكَ بِأَنَّ الَّذِينَ كَفَرُوا اتَّبَعُوا الْبَاطِلَ وَأَنَّ الَّذِينَ آمَنُوا اتَّبَعُوا الْحَقَّ مِن رَّبِّهِمْ ۚ كَذَٰلِكَ يَضْرِبُ اللَّهُ لِلنَّاسِ أَمْثَالَهُمْ",
    "فَإِذَا لَقِيتُمُ الَّذِينَ كَفَرُوا فَضَرْبَ الرِّقَابِ حَتَّىٰ إِذَا أَثْخَنتُمُوهُمْ فَشُدُّوا الْوَثَاقَ فَإِمَّا مَنًّا بَعْدُ وَإِمَّا فِدَاءً حَتَّىٰ تَضَعَ الْحَرْبُ أَوْزَارَهَا ۚ ذَٰلِكَ وَلَوْ يَشَاءُ اللَّهُ لَانتَصَرَ مِنْهُمْ وَلَٰكِن لِّيَبْلُوَ بَعْضَكُم بِبَعْضٍ ۗ وَالَّذِينَ قُتِلُوا فِي سَبِيلِ اللَّهِ فَلَن يُضِلَّ أَعْمَالَهُمْ",
    "سَيَهْدِيهِمْ وَيُصْلِحُ بَالَهُمْ",
    "وَيُدْخِلُهُمُ الْجَنَّةَ عَرَّفَهَا لَهُمْ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِن تَنصُرُوا اللَّهَ يَنصُرْكُمْ وَيُثَبِّتْ أَقْدَامَكُمْ",
    "وَالَّذِينَ كَفَرُوا فَتَعْسًا لَّهُمْ وَأَضَلَّ أَعْمَالَهُمْ",
    "ذَٰلِكَ بِأَنَّهُمْ كَرِهُوا مَا أَنزَلَ اللَّهُ فَأَحْبَطَ أَعْمَالَهُمْ",
    "أَفَلَمْ يَسِيرُوا فِي الْأَرْضِ فَيَنظُرُوا كَيْفَ كَانَ عَاقِبَةُ الَّذِينَ مِن قَبْلِهِمْ ۚ دَمَّرَ اللَّهُ عَلَيْهِمْ ۖ وَلِلْكَافِرِينَ أَمْثَالُهَا",
    "ذَٰلِكَ بِأَنَّ اللَّهَ مَوْلَى الَّذِينَ آمَنُوا وَأَنَّ الْكَافِرِينَ لَا مَوْلَىٰ لَهُمْ",
    "إِنَّ اللَّهَ يُدْخِلُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ ۖ وَالَّذِينَ كَفَرُوا يَتَمَتَّعُونَ وَيَأْكُلُونَ كَمَا تَأْكُلُ الْأَنْعَامُ وَالنَّارُ مَثْوًى لَّهُمْ",
    "وَكَأَيِّن مِّن قَرْيَةٍ هِيَ أَشَدُّ قُوَّةً مِّن قَرْيَتِكَ الَّتِي أَخْرَجَتْكَ أَهْلَكْنَاهُمْ فَلَا نَاصِرَ لَهُمْ",
    "أَفَمَن كَانَ عَلَىٰ بَيِّنَةٍ مِّن رَّبِّهِ كَمَن زُيِّنَ لَهُ سُوءُ عَمَلِهِ وَاتَّبَعُوا أَهْوَاءَهُم",
    "مَّثَلُ الْجَنَّةِ الَّتِي وُعِدَ الْمُتَّقُونَ ۖ فِيهَا أَنْهَارٌ مِّن مَّاءٍ غَيْرِ آسِنٍ وَأَنْهَارٌ مِّن لَّبَنٍ لَّمْ يَتَغَيَّرْ طَعْمُهُ وَأَنْهَارٌ مِّنْ خَمْرٍ لَّذَّةٍ لِّلشَّارِبِينَ وَأَنْهَارٌ مِّنْ عَسَلٍ مُّصَفًّى ۖ وَلَهُمْ فِيهَا مِن كُلِّ الثَّمَرَاتِ وَمَغْفِرَةٌ مِّن رَّبِّهِمْ ۖ كَمَنْ هُوَ خَالِدٌ فِي النَّارِ وَسُقُوا مَاءً حَمِيمًا فَقَطَّعَ أَمْعَاءَهُمْ",
    "وَمِنْهُم مَّن يَسْتَمِعُ إِلَيْكَ حَتَّىٰ إِذَا خَرَجُوا مِنْ عِندِكَ قَالُوا لِلَّذِينَ أُوتُوا الْعِلْمَ مَاذَا قَالَ آنِفًا ۚ أُولَٰئِكَ الَّذِينَ طَبَعَ اللَّهُ عَلَىٰ قُلُوبِهِمْ وَاتَّبَعُوا أَهْوَاءَهُمْ",
    "وَالَّذِينَ اهْتَدَوْا زَادَهُمْ هُدًى وَآتَاهُمْ تَقْوَاهُمْ",
    "فَهَلْ يَنظُرُونَ إِلَّا السَّاعَةَ أَن تَأْتِيَهُم بَغْتَةً ۖ فَقَدْ جَاءَ أَشْرَاطُهَا ۚ فَأَنَّىٰ لَهُمْ إِذَا جَاءَتْهُمْ ذِكْرَاهُمْ",
    "فَاعْلَمْ أَنَّهُ لَا إِلَٰهَ إِلَّا اللَّهُ وَاسْتَغْفِرْ لِذَنبِكَ وَلِلْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ ۗ وَاللَّهُ يَعْلَمُ مُتَقَلَّبَكُمْ وَمَثْوَاكُمْ",
    "وَيَقُولُ الَّذِينَ آمَنُوا لَوْلَا نُزِّلَتْ سُورَةٌ ۖ فَإِذَا أُنزِلَتْ سُورَةٌ مُّحْكَمَةٌ وَذُكِرَ فِيهَا الْقِتَالُ ۙ رَأَيْتَ الَّذِينَ فِي قُلُوبِهِم مَّرَضٌ يَنظُرُونَ إِلَيْكَ نَظَرَ الْمَغْشِيِّ عَلَيْهِ مِنَ الْمَوْتِ ۖ فَأَوْلَىٰ لَهُمْ",
    "طَاعَةٌ وَقَوْلٌ مَّعْرُوفٌ ۚ فَإِذَا عَزَمَ الْأَمْرُ فَلَوْ صَدَقُوا اللَّهَ لَكَانَ خَيْرًا لَّهُمْ",
    "فَهَلْ عَسَيْتُمْ إِن تَوَلَّيْتُمْ أَن تُفْسِدُوا فِي الْأَرْضِ وَتُقَطِّعُوا أَرْحَامَكُمْ",
    "أُولَٰئِكَ الَّذِينَ لَعَنَهُمُ اللَّهُ فَأَصَمَّهُمْ وَأَعْمَىٰ أَبْصَارَهُمْ",
    "أَفَلَا يَتَدَبَّرُونَ الْقُرْآنَ أَمْ عَلَىٰ قُلُوبٍ أَقْفَالُهَا",
    "إِنَّ الَّذِينَ ارْتَدُّوا عَلَىٰ أَدْبَارِهِم مِّن بَعْدِ مَا تَبَيَّنَ لَهُمُ الْهُدَى ۙ الشَّيْطَانُ سَوَّلَ لَهُمْ وَأَمْلَىٰ لَهُمْ",
    "ذَٰلِكَ بِأَنَّهُمْ قَالُوا لِلَّذِينَ كَرِهُوا مَا نَزَّلَ اللَّهُ سَنُطِيعُكُمْ فِي بَعْضِ الْأَمْرِ ۖ وَاللَّهُ يَعْلَمُ إِسْرَارَهُمْ",
    "فَكَيْفَ إِذَا تَوَفَّتْهُمُ الْمَلَائِكَةُ يَضْرِبُونَ وُجُوهَهُمْ وَأَدْبَارَهُمْ",
    "ذَٰلِكَ بِأَنَّهُمُ اتَّبَعُوا مَا أَسْخَطَ اللَّهَ وَكَرِهُوا رِضْوَانَهُ فَأَحْبَطَ أَعْمَالَهُمْ",
    "أَمْ حَسِبَ الَّذِينَ فِي قُلُوبِهِم مَّرَضٌ أَن لَّن يُخْرِجَ اللَّهُ أَضْغَانَهُمْ",
    "وَلَوْ نَشَاءُ لَأَرَيْنَاكَهُمْ فَلَعَرَفْتَهُم بِسِيمَاهُمْ ۚ وَلَتَعْرِفَنَّهُمْ فِي لَحْنِ الْقَوْلِ ۚ وَاللَّهُ يَعْلَمُ أَعْمَالَكُمْ",
    "وَلَنَبْلُوَنَّكُمْ حَتَّىٰ نَعْلَمَ الْمُجَاهِدِينَ مِنكُمْ وَالصَّابِرِينَ وَنَبْلُوَ أَخْبَارَكُمْ",
    "إِنَّ الَّذِينَ كَفَرُوا وَصَدُّوا عَن سَبِيلِ اللَّهِ وَشَاقُّوا الرَّسُولَ مِن بَعْدِ مَا تَبَيَّنَ لَهُمُ الْهُدَىٰ لَن يَضُرُّوا اللَّهَ شَيْئًا وَسَيُحْبِطُ أَعْمَالَهُمْ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا أَطِيعُوا اللَّهَ وَأَطِيعُوا الرَّسُولَ وَلَا تُبْطِلُوا أَعْمَالَكُمْ",
    "إِنَّ الَّذِينَ كَفَرُوا وَصَدُّوا عَن سَبِيلِ اللَّهِ ثُمَّ مَاتُوا وَهُمْ كُفَّارٌ فَلَن يَغْفِرَ اللَّهُ لَهُمْ",
    "فَلَا تَهِنُوا وَتَدْعُوا إِلَى السَّلْمِ وَأَنتُمُ الْأَعْلَوْنَ وَاللَّهُ مَعَكُمْ وَلَن يَتِرَكُمْ أَعْمَالَكُمْ",
    "إِنَّمَا الْحَيَاةُ الدُّنْيَا لَعِبٌ وَلَهْوٌ ۚ وَإِن تُؤْمِنُوا وَتَتَّقُوا يُؤْتِكُمْ أُجُورَكُمْ وَلَا يَسْأَلْكُمْ أَمْوَالَكُمْ",
    "إِن يَسْأَلْكُمُوهَا فَيُحْفِكُمْ تَبْخَلُوا وَيُخْرِجْ أَضْغَانَكُمْ",
    "هَا أَنتُمْ هَٰؤُلَاءِ تُدْعَوْنَ لِتُنفِقُوا فِي سَبِيلِ اللَّهِ فَمِنكُم مَّن يَبْخَلُ ۖ وَمَن يَبْخَلْ فَإِنَّمَا يَبْخَلُ عَن نَّفْسِهِ ۚ وَاللَّهُ الْغَنِيُّ وَأَنتُمُ الْفُقَرَاءُ ۚ وَإِن تَتَوَلَّوْا يَسْتَبْدِلْ قَوْمًا غَيْرَكُمْ ثُمَّ لَا يَكُونُوا أَمْثَالَكُم",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Those who disbelieve and avert [people] from the way of Allah - He will waste their deeds.",
    "And those who believe and do righteous deeds and believe in what has been sent down upon Muhammad - and it is the truth from their Lord - He will remove from them their misdeeds and amend their condition.",
    "That is because those who disbelieve follow falsehood, and those who believe follow the truth from their Lord. Thus does Allah present to the people their comparisons.",
    "So when you meet those who disbelieve [in battle], strike [their] necks until, when you have inflicted slaughter upon them, then secure their bonds, and either [confer] favor afterwards or ransom [them] until the war lays down its burdens. That [is the command]. And if Allah had willed, He could have taken vengeance upon them [Himself], but [He ordered armed struggle] to test some of you by means of others. And those who are killed in the cause of Allah - never will He waste their deeds.",
    "He will guide them and amend their condition",
    "And admit them to Paradise, which He has made known to them.",
    "O you who have believed, if you support Allah, He will support you and plant firmly your feet.",
    "But those who disbelieve - for them is misery, and He will waste their deeds.",
    "That is because they disliked what Allah revealed, so He rendered worthless their deeds.",
    "Have they not traveled through the land and seen how was the end of those before them? Allah destroyed [everything] over them, and for the disbelievers is something comparable.",
    "That is because Allah is the protector of those who have believed and because the disbelievers have no protector.",
    "Indeed, Allah will admit those who have believed and done righteous deeds to gardens beneath which rivers flow, but those who disbelieve enjoy themselves and eat as grazing livestock eat, and the Fire will be a residence for them.",
    "And how many a city was stronger than your city [Makkah] which drove you out? We destroyed them; and there was no helper for them.",
    "So is he who is on clear evidence from his Lord like him to whom the evil of his work has been made attractive and they follow their [own] desires?",
    "Is the description of Paradise, which the righteous are promised, wherein are rivers of water unaltered, rivers of milk the taste of which never changes, rivers of wine delicious to those who drink, and rivers of purified honey, in which they will have from all [kinds of] fruits and forgiveness from their Lord, like [that of] those who abide eternally in the Fire and are given to drink scalding water that will sever their intestines?",
    "And among them, [O Muhammad], are those who listen to you, until when they depart from you, they say to those who were given knowledge, \"What has he said just now?\" Those are the ones of whom Allah has sealed over their hearts and who have followed their [own] desires.",
    "And those who are guided - He increases them in guidance and gives them their righteousness.",
    "Then do they await except that the Hour should come upon them unexpectedly? But already there have come [some of] its indications. Then what good to them, when it has come, will be their remembrance?",
    "So know, [O Muhammad], that there is no deity except Allah and ask forgiveness for your sin and for the believing men and believing women. And Allah knows of your movement and your resting place.",
    "Those who believe say, \"Why has a surah not been sent down? But when a precise surah is revealed and fighting is mentioned therein, you see those in whose hearts is hypocrisy looking at you with a look of one overcome by death. And more appropriate for them [would have been]",
    "Obedience and good words. And when the matter [of fighting] was determined, if they had been true to Allah, it would have been better for them.",
    "So would you perhaps, if you turned away, cause corruption on earth and sever your [ties of] relationship?",
    "Those [who do so] are the ones that Allah has cursed, so He deafened them and blinded their vision.",
    "Then do they not reflect upon the Qur'an, or are there locks upon [their] hearts?",
    "Indeed, those who reverted back [to disbelief] after guidance had become clear to them - Satan enticed them and prolonged hope for them.",
    "That is because they said to those who disliked what Allah sent down, \"We will obey you in part of the matter.\" And Allah knows what they conceal.",
    "Then how [will it be] when the angels take them in death, striking their faces and their backs?",
    "That is because they followed what angered Allah and disliked [what earns] His pleasure, so He rendered worthless their deeds.",
    "Or do those in whose hearts is disease think that Allah would never expose their [feelings of] hatred?",
    "And if We willed, We could show them to you, and you would know them by their mark; but you will surely know them by the tone of [their] speech. And Allah knows your deeds.",
    "And We will surely test you until We make evident those who strive among you [for the cause of Allah] and the patient, and We will test your affairs.",
    "Indeed, those who disbelieved and averted [people] from the path of Allah and opposed the Messenger after guidance had become clear to them - never will they harm Allah at all, and He will render worthless their deeds.",
    "O you who have believed, obey Allah and obey the Messenger and do not invalidate your deeds.",
    "Indeed, those who disbelieved and averted [people] from the path of Allah and then died while they were disbelievers - never will Allah forgive them.",
    "So do not weaken and call for peace while you are superior; and Allah is with you and will never deprive you of [the reward of] your deeds.",
    "[This] worldly life is only amusement and diversion. And if you believe and fear Allah, He will give you your rewards and not ask you for your properties.",
    "If He should ask you for them and press you, you would withhold, and He would expose your unwillingness.",
    "Here you are - those invited to spend in the cause of Allah - but among you are those who withhold [out of greed]. And whoever withholds only withholds [benefit] from himself; and Allah is the Free of need, while you are the needy. And if you turn away, He will replace you with another people; then they will not be the likes of you.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muhammad);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_muhammad);
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
