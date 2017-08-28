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

public class At_Taghabun extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"64:1", "64:2", "64:3", "64:4", "64:5", "64:6", "64:7", "64:8", "64:9", "64:10", "64:11", "64:12", "64:13", "64:14", "64:15", "64:16",
            "64:17", "64:18", ""};

    String [] arabic_verses = {"يُسَبِّحُ لِلَّهِ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۖ لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ ۖ وَهُوَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "هُوَ الَّذِي خَلَقَكُمْ فَمِنكُمْ كَافِرٌ وَمِنكُم مُّؤْمِنٌ ۚ وَاللَّهُ بِمَا تَعْمَلُونَ بَصِيرٌ",
    "خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ بِالْحَقِّ وَصَوَّرَكُمْ فَأَحْسَنَ صُوَرَكُمْ ۖ وَإِلَيْهِ الْمَصِيرُ",
    "يَعْلَمُ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ وَيَعْلَمُ مَا تُسِرُّونَ وَمَا تُعْلِنُونَ ۚ وَاللَّهُ عَلِيمٌ بِذَاتِ الصُّدُورِ",
    "أَلَمْ يَأْتِكُمْ نَبَأُ الَّذِينَ كَفَرُوا مِن قَبْلُ فَذَاقُوا وَبَالَ أَمْرِهِمْ وَلَهُمْ عَذَابٌ أَلِيمٌ",
    "ذَٰلِكَ بِأَنَّهُ كَانَت تَّأْتِيهِمْ رُسُلُهُم بِالْبَيِّنَاتِ فَقَالُوا أَبَشَرٌ يَهْدُونَنَا فَكَفَرُوا وَتَوَلَّوا ۚ وَّاسْتَغْنَى اللَّهُ ۚ وَاللَّهُ غَنِيٌّ حَمِيدٌ",
    "زَعَمَ الَّذِينَ كَفَرُوا أَن لَّن يُبْعَثُوا ۚ قُلْ بَلَىٰ وَرَبِّي لَتُبْعَثُنَّ ثُمَّ لَتُنَبَّؤُنَّ بِمَا عَمِلْتُمْ ۚ وَذَٰلِكَ عَلَى اللَّهِ يَسِيرٌ",
    "فَآمِنُوا بِاللَّهِ وَرَسُولِهِ وَالنُّورِ الَّذِي أَنزَلْنَا ۚ وَاللَّهُ بِمَا تَعْمَلُونَ خَبِيرٌ",
    "يَوْمَ يَجْمَعُكُمْ لِيَوْمِ الْجَمْعِ ۖ ذَٰلِكَ يَوْمُ التَّغَابُنِ ۗ وَمَن يُؤْمِن بِاللَّهِ وَيَعْمَلْ صَالِحًا يُكَفِّرْ عَنْهُ سَيِّئَاتِهِ وَيُدْخِلْهُ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا أَبَدًا ۚ ذَٰلِكَ الْفَوْزُ الْعَظِيمُ",
    "وَالَّذِينَ كَفَرُوا وَكَذَّبُوا بِآيَاتِنَا أُولَٰئِكَ أَصْحَابُ النَّارِ خَالِدِينَ فِيهَا ۖ وَبِئْسَ الْمَصِيرُ",
    "مَا أَصَابَ مِن مُّصِيبَةٍ إِلَّا بِإِذْنِ اللَّهِ ۗ وَمَن يُؤْمِن بِاللَّهِ يَهْدِ قَلْبَهُ ۚ وَاللَّهُ بِكُلِّ شَيْءٍ عَلِيمٌ",
    "وَأَطِيعُوا اللَّهَ وَأَطِيعُوا الرَّسُولَ ۚ فَإِن تَوَلَّيْتُمْ فَإِنَّمَا عَلَىٰ رَسُولِنَا الْبَلَاغُ الْمُبِينُ",
    "اللَّهُ لَا إِلَٰهَ إِلَّا هُوَ ۚ وَعَلَى اللَّهِ فَلْيَتَوَكَّلِ الْمُؤْمِنُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِنَّ مِنْ أَزْوَاجِكُمْ وَأَوْلَادِكُمْ عَدُوًّا لَّكُمْ فَاحْذَرُوهُمْ ۚ وَإِن تَعْفُوا وَتَصْفَحُوا وَتَغْفِرُوا فَإِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ",
    "إِنَّمَا أَمْوَالُكُمْ وَأَوْلَادُكُمْ فِتْنَةٌ ۚ وَاللَّهُ عِندَهُ أَجْرٌ عَظِيمٌ",
    "فَاتَّقُوا اللَّهَ مَا اسْتَطَعْتُمْ وَاسْمَعُوا وَأَطِيعُوا وَأَنفِقُوا خَيْرًا لِّأَنفُسِكُمْ ۗ وَمَن يُوقَ شُحَّ نَفْسِهِ فَأُولَٰئِكَ هُمُ الْمُفْلِحُونَ",
    "إِن تُقْرِضُوا اللَّهَ قَرْضًا حَسَنًا يُضَاعِفْهُ لَكُمْ وَيَغْفِرْ لَكُمْ ۚ وَاللَّهُ شَكُورٌ حَلِيمٌ",
    "عَالِمُ الْغَيْبِ وَالشَّهَادَةِ الْعَزِيزُ الْحَكِيمُ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Whatever is in the heavens and whatever is on the earth is exalting Allah. To Him belongs dominion, and to Him belongs [all] praise, and He is over all things competent.",
    "It is He who created you, and among you is the disbeliever, and among you is the believer. And Allah, of what you do, is Seeing.",
    "He created the heavens and earth in truth and formed you and perfected your forms; and to Him is the [final] destination.",
    "He knows what is within the heavens and earth and knows what you conceal and what you declare. And Allah is Knowing of that within the breasts.",
    "Has there not come to you the news of those who disbelieved before? So they tasted the bad consequence of their affair, and they will have a painful punishment.",
    "That is because their messengers used to come to them with clear evidences, but they said, \"Shall human beings guide us?\" and disbelieved and turned away. And Allah dispensed [with them]; and Allah is Free of need and Praiseworthy.",
    "Those who disbelieve have claimed that they will never be resurrected. Say, \"Yes, by my Lord, you will surely be resurrected; then you will surely be informed of what you did. And that, for Allah, is easy.\"",
    "So believe in Allah and His Messenger and the Qur'an which We have sent down. And Allah is Acquainted with what you do.",
    "The Day He will assemble you for the Day of Assembly - that is the Day of Deprivation. And whoever believes in Allah and does righteousness - He will remove from him his misdeeds and admit him to gardens beneath which rivers flow, wherein they will abide forever. That is the great attainment.",
    "But the ones who disbelieved and denied Our verses - those are the companions of the Fire, abiding eternally therein; and wretched is the destination.",
    "No disaster strikes except by permission of Allah. And whoever believes in Allah - He will guide his heart. And Allah is Knowing of all things.",
    "And obey Allah and obey the Messenger; but if you turn away - then upon Our Messenger is only [the duty of] clear notification.",
    "Allah - there is no deity except Him. And upon Allah let the believers rely.",
    "O you who have believed, indeed, among your wives and your children are enemies to you, so beware of them. But if you pardon and overlook and forgive - then indeed, Allah is Forgiving and Merciful.",
    "Your wealth and your children are but a trial, and Allah has with Him a great reward.",
    "So fear Allah as much as you are able and listen and obey and spend [in the way of Allah]; it is better for your selves. And whoever is protected from the stinginess of his soul - it is those who will be the successful.",
    "If you loan Allah a goodly loan, He will multiply it for you and forgive you. And Allah is Most Appreciative and Forbearing.",
    "Knower of the unseen and the witnessed, the Exalted in Might, the Wise.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at__taghabun);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_at_taghabun);
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
