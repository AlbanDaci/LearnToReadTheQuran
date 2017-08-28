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

public class Al_Maarij extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"70:1", "70:2", "70:3", "70:4", "70:5", "70:6", "70:7", "70:8", "70:9", "70:10", "70:11", "70:12", "70:13", "70:14", "70:15", "70:16",
            "70:17", "70:18", "70:19", "70:20", "70:21", "70:22", "70:23", "70:24", "70:25", "70:26", "70:27", "70:28", "70:29", "70:30", "70:31", "70:32",
            "70:33", "70:34", "70:35", "70:36", "70:37", "70:38", "70:39", "70:40", "70:41", "70:42", "70:43", "70:44", ""};

    String [] arabic_verses = {"سَأَلَ سَائِلٌ بِعَذَابٍ وَاقِعٍ",
    "لِّلْكَافِرِينَ لَيْسَ لَهُ دَافِعٌ",
    "مِّنَ اللَّهِ ذِي الْمَعَارِجِ",
    "تَعْرُجُ الْمَلَائِكَةُ وَالرُّوحُ إِلَيْهِ فِي يَوْمٍ كَانَ مِقْدَارُهُ خَمْسِينَ أَلْفَ سَنَةٍ",
    "فَاصْبِرْ صَبْرًا جَمِيلًا",
    "إِنَّهُمْ يَرَوْنَهُ بَعِيدًا",
    "وَنَرَاهُ قَرِيبًا",
    "يَوْمَ تَكُونُ السَّمَاءُ كَالْمُهْلِ",
    "وَتَكُونُ الْجِبَالُ كَالْعِهْنِ",
    "وَلَا يَسْأَلُ حَمِيمٌ حَمِيمًا",
    "يُبَصَّرُونَهُمْ ۚ يَوَدُّ الْمُجْرِمُ لَوْ يَفْتَدِي مِنْ عَذَابِ يَوْمِئِذٍ بِبَنِيهِ",
    "وَصَاحِبَتِهِ وَأَخِيهِ",
    "وَفَصِيلَتِهِ الَّتِي تُؤْوِيهِ",
    "وَمَن فِي الْأَرْضِ جَمِيعًا ثُمَّ يُنجِيهِ",
    "كَلَّا ۖ إِنَّهَا لَظَىٰ",
    "نَزَّاعَةً لِّلشَّوَىٰ",
    "تَدْعُو مَنْ أَدْبَرَ وَتَوَلَّىٰ",
    "وَجَمَعَ فَأَوْعَىٰ",
    "إِنَّ الْإِنسَانَ خُلِقَ هَلُوعًا",
    "إِذَا مَسَّهُ الشَّرُّ جَزُوعًا",
    "وَإِذَا مَسَّهُ الْخَيْرُ مَنُوعًا",
    "إِلَّا الْمُصَلِّينَ",
    "الَّذِينَ هُمْ عَلَىٰ صَلَاتِهِمْ دَائِمُونَ",
    "وَالَّذِينَ فِي أَمْوَالِهِمْ حَقٌّ مَّعْلُومٌ",
    "لِّلسَّائِلِ وَالْمَحْرُومِ",
    "وَالَّذِينَ يُصَدِّقُونَ بِيَوْمِ الدِّينِ",
    "وَالَّذِينَ هُم مِّنْ عَذَابِ رَبِّهِم مُّشْفِقُونَ",
    "إِنَّ عَذَابَ رَبِّهِمْ غَيْرُ مَأْمُونٍ",
    "وَالَّذِينَ هُمْ لِفُرُوجِهِمْ حَافِظُونَ",
    "إِلَّا عَلَىٰ أَزْوَاجِهِمْ أَوْ مَا مَلَكَتْ أَيْمَانُهُمْ فَإِنَّهُمْ غَيْرُ مَلُومِينَ",
    "فَمَنِ ابْتَغَىٰ وَرَاءَ ذَٰلِكَ فَأُولَٰئِكَ هُمُ الْعَادُونَ",
    "وَالَّذِينَ هُمْ لِأَمَانَاتِهِمْ وَعَهْدِهِمْ رَاعُونَ",
    "وَالَّذِينَ هُم بِشَهَادَاتِهِمْ قَائِمُونَ",
    "وَالَّذِينَ هُمْ عَلَىٰ صَلَاتِهِمْ يُحَافِظُونَ",
    "أُولَٰئِكَ فِي جَنَّاتٍ مُّكْرَمُونَ",
    "فَمَالِ الَّذِينَ كَفَرُوا قِبَلَكَ مُهْطِعِينَ",
    "عَنِ الْيَمِينِ وَعَنِ الشِّمَالِ عِزِينَ",
    "أَيَطْمَعُ كُلُّ امْرِئٍ مِّنْهُمْ أَن يُدْخَلَ جَنَّةَ نَعِيمٍ",
    "كَلَّا ۖ إِنَّا خَلَقْنَاهُم مِّمَّا يَعْلَمُونَ",
    "فَلَا أُقْسِمُ بِرَبِّ الْمَشَارِقِ وَالْمَغَارِبِ إِنَّا لَقَادِرُونَ",
    "عَلَىٰ أَن نُّبَدِّلَ خَيْرًا مِّنْهُمْ وَمَا نَحْنُ بِمَسْبُوقِينَ",
    "فَذَرْهُمْ يَخُوضُوا وَيَلْعَبُوا حَتَّىٰ يُلَاقُوا يَوْمَهُمُ الَّذِي يُوعَدُونَ",
    "يَوْمَ يَخْرُجُونَ مِنَ الْأَجْدَاثِ سِرَاعًا كَأَنَّهُمْ إِلَىٰ نُصُبٍ يُوفِضُونَ",
    "خَاشِعَةً أَبْصَارُهُمْ تَرْهَقُهُمْ ذِلَّةٌ ۚ ذَٰلِكَ الْيَوْمُ الَّذِي كَانُوا يُوعَدُونَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"A supplicant asked for a punishment bound to happen",
    "To the disbelievers; of it there is no preventer.",
    "[It is] from Allah, owner of the ways of ascent.",
    "The angels and the Spirit will ascend to Him during a Day the extent of which is fifty thousand years.",
    "So be patient with gracious patience.",
    "Indeed, they see it [as] distant,",
    "But We see it [as] near.",
    "On the Day the sky will be like murky oil,",
    "And the mountains will be like wool,",
    "And no friend will ask [anything of] a friend,",
    "They will be shown each other. The criminal will wish that he could be ransomed from the punishment of that Day by his children",
    "And his wife and his brother",
    "And his nearest kindred who shelter him",
    "And whoever is on earth entirely [so] then it could save him.",
    "No! Indeed, it is the Flame [of Hell],",
    "A remover of exteriors.",
    "It invites he who turned his back [on truth] and went away [from obedience]",
    "And collected [wealth] and hoarded.",
    "Indeed, mankind was created anxious:",
    "When evil touches him, impatient,",
    "And when good touches him, withholding [of it],",
    "Except the observers of prayer -",
    "Those who are constant in their prayer",
    "And those within whose wealth is a known right",
    "For the petitioner and the deprived -",
    "And those who believe in the Day of Recompense",
    "And those who are fearful of the punishment of their Lord -",
    "Indeed, the punishment of their Lord is not that from which one is safe -",
    "And those who guard their private parts",
    "Except from their wives or those their right hands possess, for indeed, they are not to be blamed -",
    "But whoever seeks beyond that, then they are the transgressors -",
    "And those who are to their trusts and promises attentive",
    "And those who are in their testimonies upright",
    "And those who [carefully] maintain their prayer:",
    "They will be in gardens, honored.",
    "So what is [the matter] with those who disbelieve, hastening [from] before you, [O Muhammad],",
    "[To sit] on [your] right and [your] left in separate groups?",
    "Does every person among them aspire to enter a garden of pleasure?",
    "No! Indeed, We have created them from that which they know.",
    "So I swear by the Lord of [all] risings and settings that indeed We are able",
    "To replace them with better than them; and We are not to be outdone.",
    "So leave them to converse vainly and amuse themselves until they meet their Day which they are promised -",
    "The Day they will emerge from the graves rapidly as if they were, toward an erected idol, hastening.",
    "Their eyes humbled, humiliation will cover them. That is the Day which they had been promised.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__maarij);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_maarij);
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
