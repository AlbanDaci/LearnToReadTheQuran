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

public class Al_Jinn extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"72:1", "72:2", "72:3", "72:4", "72:5", "72:6", "72:7", "72:8", "72:9", "72:10", "72:11", "72:12", "72:13", "72:14", "72:15", "72:16",
            "72:17", "72:18", "72:19", "72:20", "72:21", "72:22", "72:23", "72:24", "72:25", "72:26", "72:27", "72:28", ""};

    String [] arabic_verses = {"قُلْ أُوحِيَ إِلَيَّ أَنَّهُ اسْتَمَعَ نَفَرٌ مِّنَ الْجِنِّ فَقَالُوا إِنَّا سَمِعْنَا قُرْآنًا عَجَبًا",
    "يَهْدِي إِلَى الرُّشْدِ فَآمَنَّا بِهِ ۖ وَلَن نُّشْرِكَ بِرَبِّنَا أَحَدًا",
    "وَأَنَّهُ تَعَالَىٰ جَدُّ رَبِّنَا مَا اتَّخَذَ صَاحِبَةً وَلَا وَلَدًا",
    "وَأَنَّهُ كَانَ يَقُولُ سَفِيهُنَا عَلَى اللَّهِ شَطَطًا",
    "وَأَنَّا ظَنَنَّا أَن لَّن تَقُولَ الْإِنسُ وَالْجِنُّ عَلَى اللَّهِ كَذِبًا",
    "وَأَنَّهُ كَانَ رِجَالٌ مِّنَ الْإِنسِ يَعُوذُونَ بِرِجَالٍ مِّنَ الْجِنِّ فَزَادُوهُمْ رَهَقًا",
    "وَأَنَّهُمْ ظَنُّوا كَمَا ظَنَنتُمْ أَن لَّن يَبْعَثَ اللَّهُ أَحَدًا",
    "وَأَنَّا لَمَسْنَا السَّمَاءَ فَوَجَدْنَاهَا مُلِئَتْ حَرَسًا شَدِيدًا وَشُهُبًا",
    "وَأَنَّا كُنَّا نَقْعُدُ مِنْهَا مَقَاعِدَ لِلسَّمْعِ ۖ فَمَن يَسْتَمِعِ الْآنَ يَجِدْ لَهُ شِهَابًا رَّصَدًا",
    "وَأَنَّا لَا نَدْرِي أَشَرٌّ أُرِيدَ بِمَن فِي الْأَرْضِ أَمْ أَرَادَ بِهِمْ رَبُّهُمْ رَشَدًا",
    "وَأَنَّا مِنَّا الصَّالِحُونَ وَمِنَّا دُونَ ذَٰلِكَ ۖ كُنَّا طَرَائِقَ قِدَدًا",
    "وَأَنَّا ظَنَنَّا أَن لَّن نُّعْجِزَ اللَّهَ فِي الْأَرْضِ وَلَن نُّعْجِزَهُ هَرَبًا",
    "وَأَنَّا لَمَّا سَمِعْنَا الْهُدَىٰ آمَنَّا بِهِ ۖ فَمَن يُؤْمِن بِرَبِّهِ فَلَا يَخَافُ بَخْسًا وَلَا رَهَقًا",
    "وَأَنَّا مِنَّا الْمُسْلِمُونَ وَمِنَّا الْقَاسِطُونَ ۖ فَمَنْ أَسْلَمَ فَأُولَٰئِكَ تَحَرَّوْا رَشَدًا",
    "وَأَمَّا الْقَاسِطُونَ فَكَانُوا لِجَهَنَّمَ حَطَبًا",
    "وَأَن لَّوِ اسْتَقَامُوا عَلَى الطَّرِيقَةِ لَأَسْقَيْنَاهُم مَّاءً غَدَقًا",
    "لِّنَفْتِنَهُمْ فِيهِ ۚ وَمَن يُعْرِضْ عَن ذِكْرِ رَبِّهِ يَسْلُكْهُ عَذَابًا صَعَدًا",
    "وَأَنَّ الْمَسَاجِدَ لِلَّهِ فَلَا تَدْعُوا مَعَ اللَّهِ أَحَدًا",
    "وَأَنَّهُ لَمَّا قَامَ عَبْدُ اللَّهِ يَدْعُوهُ كَادُوا يَكُونُونَ عَلَيْهِ لِبَدًا",
    "قُلْ إِنَّمَا أَدْعُو رَبِّي وَلَا أُشْرِكُ بِهِ أَحَدًا",
    "قُلْ إِنِّي لَا أَمْلِكُ لَكُمْ ضَرًّا وَلَا رَشَدًا",
    "قُلْ إِنِّي لَن يُجِيرَنِي مِنَ اللَّهِ أَحَدٌ وَلَنْ أَجِدَ مِن دُونِهِ مُلْتَحَدًا",
    "إِلَّا بَلَاغًا مِّنَ اللَّهِ وَرِسَالَاتِهِ ۚ وَمَن يَعْصِ اللَّهَ وَرَسُولَهُ فَإِنَّ لَهُ نَارَ جَهَنَّمَ خَالِدِينَ فِيهَا أَبَدًا",
    "حَتَّىٰ إِذَا رَأَوْا مَا يُوعَدُونَ فَسَيَعْلَمُونَ مَنْ أَضْعَفُ نَاصِرًا وَأَقَلُّ عَدَدًا",
    "قُلْ إِنْ أَدْرِي أَقَرِيبٌ مَّا تُوعَدُونَ أَمْ يَجْعَلُ لَهُ رَبِّي أَمَدًا",
    "عَالِمُ الْغَيْبِ فَلَا يُظْهِرُ عَلَىٰ غَيْبِهِ أَحَدًا",
    "إِلَّا مَنِ ارْتَضَىٰ مِن رَّسُولٍ فَإِنَّهُ يَسْلُكُ مِن بَيْنِ يَدَيْهِ وَمِنْ خَلْفِهِ رَصَدًا",
    "لِّيَعْلَمَ أَن قَدْ أَبْلَغُوا رِسَالَاتِ رَبِّهِمْ وَأَحَاطَ بِمَا لَدَيْهِمْ وَأَحْصَىٰ كُلَّ شَيْءٍ عَدَدًا",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Say, [O Muhammad], \"It has been revealed to me that a group of the jinn listened and said, 'Indeed, we have heard an amazing Qur'an.",
    "It guides to the right course, and we have believed in it. And we will never associate with our Lord anyone.",
    "And [it teaches] that exalted is the nobleness of our Lord; He has not taken a wife or a son",
    "And that our foolish one has been saying about Allah an excessive transgression.",
    "And we had thought that mankind and the jinn would never speak about Allah a lie.",
    "And there were men from mankind who sought refuge in men from the jinn, so they [only] increased them in burden.",
    "And they had thought, as you thought, that Allah would never send anyone [as a messenger].",
    "And we have sought [to reach] the heaven but found it filled with powerful guards and burning flames.",
    "And we used to sit therein in positions for hearing, but whoever listens now will find a burning flame lying in wait for him.",
    "And we do not know [therefore] whether evil is intended for those on earth or whether their Lord intends for them a right course.",
    "And among us are the righteous, and among us are [others] not so; we were [of] divided ways.",
    "And we have become certain that we will never cause failure to Allah upon earth, nor can we escape Him by flight.",
    "And when we heard the guidance, we believed in it. And whoever believes in his Lord will not fear deprivation or burden.",
    "And among us are Muslims [in submission to Allah], and among us are the unjust. And whoever has become Muslim - those have sought out the right course.",
    "But as for the unjust, they will be, for Hell, firewood.'",
    "And [Allah revealed] that if they had remained straight on the way, We would have given them abundant provision",
    "So We might test them therein. And whoever turns away from the remembrance of his Lord He will put into arduous punishment.",
    "And [He revealed] that the masjids are for Allah, so do not invoke with Allah anyone.",
    "And that when the Servant of Allah stood up supplicating Him, they almost became about him a compacted mass.\"",
    "Say, [O Muhammad], \"I only invoke my Lord and do not associate with Him anyone.\"",
    "Say, \"Indeed, I do not possess for you [the power of] harm or right direction.\"",
    "Say, \"Indeed, there will never protect me from Allah anyone [if I should disobey], nor will I find in other than Him a refuge.",
    "But [I have for you] only notification from Allah, and His messages.\" And whoever disobeys Allah and His Messenger - then indeed, for him is the fire of Hell; they will abide therein forever.",
    "[The disbelievers continue] until, when they see that which they are promised, then they will know who is weaker in helpers and less in number.",
    "Say, \"I do not know if what you are promised is near or if my Lord will grant for it a [long] period.\"",
    "[He is] Knower of the unseen, and He does not disclose His [knowledge of the] unseen to anyone",
    "Except whom He has approved of messengers, and indeed, He sends before each messenger and behind him observers",
    "That he may know that they have conveyed the messages of their Lord; and He has encompassed whatever is with them and has enumerated all things in number.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__jinn);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_jinn);
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
