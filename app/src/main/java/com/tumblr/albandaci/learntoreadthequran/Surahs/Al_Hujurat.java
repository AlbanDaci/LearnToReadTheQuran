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

public class Al_Hujurat extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"49:1", "49:2", "49:3", "49:4", "49:5", "49:6", "49:7", "49:8", "49:9", "49:10", "49:11", "49:12", "49:13", "49:14", "49:15", "49:16",
            "49:17", "49:18", ""};

    String [] arabic_verses = {"يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تُقَدِّمُوا بَيْنَ يَدَيِ اللَّهِ وَرَسُولِهِ ۖ وَاتَّقُوا اللَّهَ ۚ إِنَّ اللَّهَ سَمِيعٌ عَلِيمٌ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تَرْفَعُوا أَصْوَاتَكُمْ فَوْقَ صَوْتِ النَّبِيِّ وَلَا تَجْهَرُوا لَهُ بِالْقَوْلِ كَجَهْرِ بَعْضِكُمْ لِبَعْضٍ أَن تَحْبَطَ أَعْمَالُكُمْ وَأَنتُمْ لَا تَشْعُرُونَ",
    "إِنَّ الَّذِينَ يَغُضُّونَ أَصْوَاتَهُمْ عِندَ رَسُولِ اللَّهِ أُولَٰئِكَ الَّذِينَ امْتَحَنَ اللَّهُ قُلُوبَهُمْ لِلتَّقْوَىٰ ۚ لَهُم مَّغْفِرَةٌ وَأَجْرٌ عَظِيمٌ",
    "إِنَّ الَّذِينَ يُنَادُونَكَ مِن وَرَاءِ الْحُجُرَاتِ أَكْثَرُهُمْ لَا يَعْقِلُونَ",
    "وَلَوْ أَنَّهُمْ صَبَرُوا حَتَّىٰ تَخْرُجَ إِلَيْهِمْ لَكَانَ خَيْرًا لَّهُمْ ۚ وَاللَّهُ غَفُورٌ رَّحِيمٌ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِن جَاءَكُمْ فَاسِقٌ بِنَبَإٍ فَتَبَيَّنُوا أَن تُصِيبُوا قَوْمًا بِجَهَالَةٍ فَتُصْبِحُوا عَلَىٰ مَا فَعَلْتُمْ نَادِمِينَ",
    "وَاعْلَمُوا أَنَّ فِيكُمْ رَسُولَ اللَّهِ ۚ لَوْ يُطِيعُكُمْ فِي كَثِيرٍ مِّنَ الْأَمْرِ لَعَنِتُّمْ وَلَٰكِنَّ اللَّهَ حَبَّبَ إِلَيْكُمُ الْإِيمَانَ وَزَيَّنَهُ فِي قُلُوبِكُمْ وَكَرَّهَ إِلَيْكُمُ الْكُفْرَ وَالْفُسُوقَ وَالْعِصْيَانَ ۚ أُولَٰئِكَ هُمُ الرَّاشِدُونَ",
    "فَضْلًا مِّنَ اللَّهِ وَنِعْمَةً ۚ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "وَإِن طَائِفَتَانِ مِنَ الْمُؤْمِنِينَ اقْتَتَلُوا فَأَصْلِحُوا بَيْنَهُمَا ۖ فَإِن بَغَتْ إِحْدَاهُمَا عَلَى الْأُخْرَىٰ فَقَاتِلُوا الَّتِي تَبْغِي حَتَّىٰ تَفِيءَ إِلَىٰ أَمْرِ اللَّهِ ۚ فَإِن فَاءَتْ فَأَصْلِحُوا بَيْنَهُمَا بِالْعَدْلِ وَأَقْسِطُوا ۖ إِنَّ اللَّهَ يُحِبُّ الْمُقْسِطِينَ",
    "إِنَّمَا الْمُؤْمِنُونَ إِخْوَةٌ فَأَصْلِحُوا بَيْنَ أَخَوَيْكُمْ ۚ وَاتَّقُوا اللَّهَ لَعَلَّكُمْ تُرْحَمُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا يَسْخَرْ قَوْمٌ مِّن قَوْمٍ عَسَىٰ أَن يَكُونُوا خَيْرًا مِّنْهُمْ وَلَا نِسَاءٌ مِّن نِّسَاءٍ عَسَىٰ أَن يَكُنَّ خَيْرًا مِّنْهُنَّ ۖ وَلَا تَلْمِزُوا أَنفُسَكُمْ وَلَا تَنَابَزُوا بِالْأَلْقَابِ ۖ بِئْسَ الِاسْمُ الْفُسُوقُ بَعْدَ الْإِيمَانِ ۚ وَمَن لَّمْ يَتُبْ فَأُولَٰئِكَ هُمُ الظَّالِمُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا اجْتَنِبُوا كَثِيرًا مِّنَ الظَّنِّ إِنَّ بَعْضَ الظَّنِّ إِثْمٌ ۖ وَلَا تَجَسَّسُوا وَلَا يَغْتَب بَّعْضُكُم بَعْضًا ۚ أَيُحِبُّ أَحَدُكُمْ أَن يَأْكُلَ لَحْمَ أَخِيهِ مَيْتًا فَكَرِهْتُمُوهُ ۚ وَاتَّقُوا اللَّهَ ۚ إِنَّ اللَّهَ تَوَّابٌ رَّحِيمٌ",
    "يَا أَيُّهَا النَّاسُ إِنَّا خَلَقْنَاكُم مِّن ذَكَرٍ وَأُنثَىٰ وَجَعَلْنَاكُمْ شُعُوبًا وَقَبَائِلَ لِتَعَارَفُوا ۚ إِنَّ أَكْرَمَكُمْ عِندَ اللَّهِ أَتْقَاكُمْ ۚ إِنَّ اللَّهَ عَلِيمٌ خَبِيرٌ",
    "قَالَتِ الْأَعْرَابُ آمَنَّا ۖ قُل لَّمْ تُؤْمِنُوا وَلَٰكِن قُولُوا أَسْلَمْنَا وَلَمَّا يَدْخُلِ الْإِيمَانُ فِي قُلُوبِكُمْ ۖ وَإِن تُطِيعُوا اللَّهَ وَرَسُولَهُ لَا يَلِتْكُم مِّنْ أَعْمَالِكُمْ شَيْئًا ۚ إِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ",
    "إِنَّمَا الْمُؤْمِنُونَ الَّذِينَ آمَنُوا بِاللَّهِ وَرَسُولِهِ ثُمَّ لَمْ يَرْتَابُوا وَجَاهَدُوا بِأَمْوَالِهِمْ وَأَنفُسِهِمْ فِي سَبِيلِ اللَّهِ ۚ أُولَٰئِكَ هُمُ الصَّادِقُونَ",
    "قُلْ أَتُعَلِّمُونَ اللَّهَ بِدِينِكُمْ وَاللَّهُ يَعْلَمُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۚ وَاللَّهُ بِكُلِّ شَيْءٍ عَلِيمٌ",
    "يَمُنُّونَ عَلَيْكَ أَنْ أَسْلَمُوا ۖ قُل لَّا تَمُنُّوا عَلَيَّ إِسْلَامَكُم ۖ بَلِ اللَّهُ يَمُنُّ عَلَيْكُمْ أَنْ هَدَاكُمْ لِلْإِيمَانِ إِن كُنتُمْ صَادِقِينَ",
    "إِنَّ اللَّهَ يَعْلَمُ غَيْبَ السَّمَاوَاتِ وَالْأَرْضِ ۚ وَاللَّهُ بَصِيرٌ بِمَا تَعْمَلُونَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"O you who have believed, do not put [yourselves] before Allah and His Messenger but fear Allah. Indeed, Allah is Hearing and Knowing.",
    "O you who have believed, do not raise your voices above the voice of the Prophet or be loud to him in speech like the loudness of some of you to others, lest your deeds become worthless while you perceive not.",
    "Indeed, those who lower their voices before the Messenger of Allah - they are the ones whose hearts Allah has tested for righteousness. For them is forgiveness and great reward.",
    "Indeed, those who call you, [O Muhammad], from behind the chambers - most of them do not use reason.",
    "And if they had been patient until you [could] come out to them, it would have been better for them. But Allah is Forgiving and Merciful.",
    "O you who have believed, if there comes to you a disobedient one with information, investigate, lest you harm a people out of ignorance and become, over what you have done, regretful.",
    "And know that among you is the Messenger of Allah. If he were to obey you in much of the matter, you would be in difficulty, but Allah has endeared to you the faith and has made it pleasing in your hearts and has made hateful to you disbelief, defiance and disobedience. Those are the [rightly] guided.",
    "[It is] as bounty from Allah and favor. And Allah is Knowing and Wise.",
    "And if two factions among the believers should fight, then make settlement between the two. But if one of them oppresses the other, then fight against the one that oppresses until it returns to the ordinance of Allah. And if it returns, then make settlement between them in justice and act justly. Indeed, Allah loves those who act justly.",
    "The believers are but brothers, so make settlement between your brothers. And fear Allah that you may receive mercy.",
    "O you who have believed, let not a people ridicule [another] people; perhaps they may be better than them; nor let women ridicule [other] women; perhaps they may be better than them. And do not insult one another and do not call each other by [offensive] nicknames. Wretched is the name of disobedience after [one's] faith. And whoever does not repent - then it is those who are the wrongdoers.",
    "O you who have believed, avoid much [negative] assumption. Indeed, some assumption is sin. And do not spy or backbite each other. Would one of you like to eat the flesh of his brother when dead? You would detest it. And fear Allah; indeed, Allah is Accepting of repentance and Merciful.",
    "O mankind, indeed We have created you from male and female and made you peoples and tribes that you may know one another. Indeed, the most noble of you in the sight of Allah is the most righteous of you. Indeed, Allah is Knowing and Acquainted.",
    "The bedouins say, \"We have believed.\" Say, \"You have not [yet] believed; but say [instead], 'We have submitted,' for faith has not yet entered your hearts. And if you obey Allah and His Messenger, He will not deprive you from your deeds of anything. Indeed, Allah is Forgiving and Merciful.\"",
    "The believers are only the ones who have believed in Allah and His Messenger and then doubt not but strive with their properties and their lives in the cause of Allah. It is those who are the truthful.",
    "Say, \"Would you acquaint Allah with your religion while Allah knows whatever is in the heavens and whatever is on the earth, and Allah is Knowing of all things?\"",
    "They consider it a favor to you that they have accepted Islam. Say, \"Do not consider your Islam a favor to me. Rather, Allah has conferred favor upon you that He has guided you to the faith, if you should be truthful.\"",
    "Indeed, Allah knows the unseen [aspects] of the heavens and the earth. And Allah is Seeing of what you do.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__hujurat);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_hujurat);
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
