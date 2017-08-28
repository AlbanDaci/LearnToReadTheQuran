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

public class Al_Fath extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"48:1", "48:2", "48:3", "48:4", "48:5", "48:6", "48:7", "48:8", "48:9", "48:10", "48:11", "48:12", "48:13", "48:14", "48:15", "48:16",
            "48:17", "48:18", "48:19", "48:20", "48:21", "48:22", "48:23", "48:24", "48:25", "48:26", "48:27", "48:28", "48:29", ""};

    String [] arabic_verses = {"إِنَّا فَتَحْنَا لَكَ فَتْحًا مُّبِينًا",
    "لِّيَغْفِرَ لَكَ اللَّهُ مَا تَقَدَّمَ مِن ذَنبِكَ وَمَا تَأَخَّرَ وَيُتِمَّ نِعْمَتَهُ عَلَيْكَ وَيَهْدِيَكَ صِرَاطًا مُّسْتَقِيمًا",
    "وَيَنصُرَكَ اللَّهُ نَصْرًا عَزِيزًا",
    "هُوَ الَّذِي أَنزَلَ السَّكِينَةَ فِي قُلُوبِ الْمُؤْمِنِينَ لِيَزْدَادُوا إِيمَانًا مَّعَ إِيمَانِهِمْ ۗ وَلِلَّهِ جُنُودُ السَّمَاوَاتِ وَالْأَرْضِ ۚ وَكَانَ اللَّهُ عَلِيمًا حَكِيمًا",
    "لِّيُدْخِلَ الْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا وَيُكَفِّرَ عَنْهُمْ سَيِّئَاتِهِمْ ۚ وَكَانَ ذَٰلِكَ عِندَ اللَّهِ فَوْزًا عَظِيمًا",
    "وَيُعَذِّبَ الْمُنَافِقِينَ وَالْمُنَافِقَاتِ وَالْمُشْرِكِينَ وَالْمُشْرِكَاتِ الظَّانِّينَ بِاللَّهِ ظَنَّ السَّوْءِ ۚ عَلَيْهِمْ دَائِرَةُ السَّوْءِ ۖ وَغَضِبَ اللَّهُ عَلَيْهِمْ وَلَعَنَهُمْ وَأَعَدَّ لَهُمْ جَهَنَّمَ ۖ وَسَاءَتْ مَصِيرًا",
    "وَلِلَّهِ جُنُودُ السَّمَاوَاتِ وَالْأَرْضِ ۚ وَكَانَ اللَّهُ عَزِيزًا حَكِيمًا",
    "إِنَّا أَرْسَلْنَاكَ شَاهِدًا وَمُبَشِّرًا وَنَذِيرًا",
    "لِّتُؤْمِنُوا بِاللَّهِ وَرَسُولِهِ وَتُعَزِّرُوهُ وَتُوَقِّرُوهُ وَتُسَبِّحُوهُ بُكْرَةً وَأَصِيلًا",
    "إِنَّ الَّذِينَ يُبَايِعُونَكَ إِنَّمَا يُبَايِعُونَ اللَّهَ يَدُ اللَّهِ فَوْقَ أَيْدِيهِمْ ۚ فَمَن نَّكَثَ فَإِنَّمَا يَنكُثُ عَلَىٰ نَفْسِهِ ۖ وَمَنْ أَوْفَىٰ بِمَا عَاهَدَ عَلَيْهُ اللَّهَ فَسَيُؤْتِيهِ أَجْرًا عَظِيمًا",
    "سَيَقُولُ لَكَ الْمُخَلَّفُونَ مِنَ الْأَعْرَابِ شَغَلَتْنَا أَمْوَالُنَا وَأَهْلُونَا فَاسْتَغْفِرْ لَنَا ۚ يَقُولُونَ بِأَلْسِنَتِهِم مَّا لَيْسَ فِي قُلُوبِهِمْ ۚ قُلْ فَمَن يَمْلِكُ لَكُم مِّنَ اللَّهِ شَيْئًا إِنْ أَرَادَ بِكُمْ ضَرًّا أَوْ أَرَادَ بِكُمْ نَفْعًا ۚ بَلْ كَانَ اللَّهُ بِمَا تَعْمَلُونَ خَبِيرًا",
    "بَلْ ظَنَنتُمْ أَن لَّن يَنقَلِبَ الرَّسُولُ وَالْمُؤْمِنُونَ إِلَىٰ أَهْلِيهِمْ أَبَدًا وَزُيِّنَ ذَٰلِكَ فِي قُلُوبِكُمْ وَظَنَنتُمْ ظَنَّ السَّوْءِ وَكُنتُمْ قَوْمًا بُورًا",
    "وَمَن لَّمْ يُؤْمِن بِاللَّهِ وَرَسُولِهِ فَإِنَّا أَعْتَدْنَا لِلْكَافِرِينَ سَعِيرًا",
    "وَلِلَّهِ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ ۚ يَغْفِرُ لِمَن يَشَاءُ وَيُعَذِّبُ مَن يَشَاءُ ۚ وَكَانَ اللَّهُ غَفُورًا رَّحِيمًا",
    "سَيَقُولُ الْمُخَلَّفُونَ إِذَا انطَلَقْتُمْ إِلَىٰ مَغَانِمَ لِتَأْخُذُوهَا ذَرُونَا نَتَّبِعْكُمْ ۖ يُرِيدُونَ أَن يُبَدِّلُوا كَلَامَ اللَّهِ ۚ قُل لَّن تَتَّبِعُونَا كَذَٰلِكُمْ قَالَ اللَّهُ مِن قَبْلُ ۖ فَسَيَقُولُونَ بَلْ تَحْسُدُونَنَا ۚ بَلْ كَانُوا لَا يَفْقَهُونَ إِلَّا قَلِيلًا",
    "قُل لِّلْمُخَلَّفِينَ مِنَ الْأَعْرَابِ سَتُدْعَوْنَ إِلَىٰ قَوْمٍ أُولِي بَأْسٍ شَدِيدٍ تُقَاتِلُونَهُمْ أَوْ يُسْلِمُونَ ۖ فَإِن تُطِيعُوا يُؤْتِكُمُ اللَّهُ أَجْرًا حَسَنًا ۖ وَإِن تَتَوَلَّوْا كَمَا تَوَلَّيْتُم مِّن قَبْلُ يُعَذِّبْكُمْ عَذَابًا أَلِيمًا",
    "لَّيْسَ عَلَى الْأَعْمَىٰ حَرَجٌ وَلَا عَلَى الْأَعْرَجِ حَرَجٌ وَلَا عَلَى الْمَرِيضِ حَرَجٌ ۗ وَمَن يُطِعِ اللَّهَ وَرَسُولَهُ يُدْخِلْهُ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ ۖ وَمَن يَتَوَلَّ يُعَذِّبْهُ عَذَابًا أَلِيمًا",
    "لَّقَدْ رَضِيَ اللَّهُ عَنِ الْمُؤْمِنِينَ إِذْ يُبَايِعُونَكَ تَحْتَ الشَّجَرَةِ فَعَلِمَ مَا فِي قُلُوبِهِمْ فَأَنزَلَ السَّكِينَةَ عَلَيْهِمْ وَأَثَابَهُمْ فَتْحًا قَرِيبًا",
    "وَمَغَانِمَ كَثِيرَةً يَأْخُذُونَهَا ۗ وَكَانَ اللَّهُ عَزِيزًا حَكِيمًا",
    "وَعَدَكُمُ اللَّهُ مَغَانِمَ كَثِيرَةً تَأْخُذُونَهَا فَعَجَّلَ لَكُمْ هَٰذِهِ وَكَفَّ أَيْدِيَ النَّاسِ عَنكُمْ وَلِتَكُونَ آيَةً لِّلْمُؤْمِنِينَ وَيَهْدِيَكُمْ صِرَاطًا مُّسْتَقِيمًا",
    "وَأُخْرَىٰ لَمْ تَقْدِرُوا عَلَيْهَا قَدْ أَحَاطَ اللَّهُ بِهَا ۚ وَكَانَ اللَّهُ عَلَىٰ كُلِّ شَيْءٍ قَدِيرًا",
    "وَلَوْ قَاتَلَكُمُ الَّذِينَ كَفَرُوا لَوَلَّوُا الْأَدْبَارَ ثُمَّ لَا يَجِدُونَ وَلِيًّا وَلَا نَصِيرًا",
    "سُنَّةَ اللَّهِ الَّتِي قَدْ خَلَتْ مِن قَبْلُ ۖ وَلَن تَجِدَ لِسُنَّةِ اللَّهِ تَبْدِيلًا",
    "وَهُوَ الَّذِي كَفَّ أَيْدِيَهُمْ عَنكُمْ وَأَيْدِيَكُمْ عَنْهُم بِبَطْنِ مَكَّةَ مِن بَعْدِ أَنْ أَظْفَرَكُمْ عَلَيْهِمْ ۚ وَكَانَ اللَّهُ بِمَا تَعْمَلُونَ بَصِيرًا",
    "هُمُ الَّذِينَ كَفَرُوا وَصَدُّوكُمْ عَنِ الْمَسْجِدِ الْحَرَامِ وَالْهَدْيَ مَعْكُوفًا أَن يَبْلُغَ مَحِلَّهُ ۚ وَلَوْلَا رِجَالٌ مُّؤْمِنُونَ وَنِسَاءٌ مُّؤْمِنَاتٌ لَّمْ تَعْلَمُوهُمْ أَن تَطَئُوهُمْ فَتُصِيبَكُم مِّنْهُم مَّعَرَّةٌ بِغَيْرِ عِلْمٍ ۖ لِّيُدْخِلَ اللَّهُ فِي رَحْمَتِهِ مَن يَشَاءُ ۚ لَوْ تَزَيَّلُوا لَعَذَّبْنَا الَّذِينَ كَفَرُوا مِنْهُمْ عَذَابًا أَلِيمًا",
    "إِذْ جَعَلَ الَّذِينَ كَفَرُوا فِي قُلُوبِهِمُ الْحَمِيَّةَ حَمِيَّةَ الْجَاهِلِيَّةِ فَأَنزَلَ اللَّهُ سَكِينَتَهُ عَلَىٰ رَسُولِهِ وَعَلَى الْمُؤْمِنِينَ وَأَلْزَمَهُمْ كَلِمَةَ التَّقْوَىٰ وَكَانُوا أَحَقَّ بِهَا وَأَهْلَهَا ۚ وَكَانَ اللَّهُ بِكُلِّ شَيْءٍ عَلِيمًا",
    "لَّقَدْ صَدَقَ اللَّهُ رَسُولَهُ الرُّؤْيَا بِالْحَقِّ ۖ لَتَدْخُلُنَّ الْمَسْجِدَ الْحَرَامَ إِن شَاءَ اللَّهُ آمِنِينَ مُحَلِّقِينَ رُءُوسَكُمْ وَمُقَصِّرِينَ لَا تَخَافُونَ ۖ فَعَلِمَ مَا لَمْ تَعْلَمُوا فَجَعَلَ مِن دُونِ ذَٰلِكَ فَتْحًا قَرِيبًا",
    "هُوَ الَّذِي أَرْسَلَ رَسُولَهُ بِالْهُدَىٰ وَدِينِ الْحَقِّ لِيُظْهِرَهُ عَلَى الدِّينِ كُلِّهِ ۚ وَكَفَىٰ بِاللَّهِ شَهِيدًا",
    "مُّحَمَّدٌ رَّسُولُ اللَّهِ ۚ وَالَّذِينَ مَعَهُ أَشِدَّاءُ عَلَى الْكُفَّارِ رُحَمَاءُ بَيْنَهُمْ ۖ تَرَاهُمْ رُكَّعًا سُجَّدًا يَبْتَغُونَ فَضْلًا مِّنَ اللَّهِ وَرِضْوَانًا ۖ سِيمَاهُمْ فِي وُجُوهِهِم مِّنْ أَثَرِ السُّجُودِ ۚ ذَٰلِكَ مَثَلُهُمْ فِي التَّوْرَاةِ ۚ وَمَثَلُهُمْ فِي الْإِنجِيلِ كَزَرْعٍ أَخْرَجَ شَطْأَهُ فَآزَرَهُ فَاسْتَغْلَظَ فَاسْتَوَىٰ عَلَىٰ سُوقِهِ يُعْجِبُ الزُّرَّاعَ لِيَغِيظَ بِهِمُ الْكُفَّارَ ۗ وَعَدَ اللَّهُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ مِنْهُم مَّغْفِرَةً وَأَجْرًا عَظِيمًا",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Indeed, We have given you, [O Muhammad], a clear conquest",
    "That Allah may forgive for you what preceded of your sin and what will follow and complete His favor upon you and guide you to a straight path",
    "And [that] Allah may aid you with a mighty victory.",
    "It is He who sent down tranquillity into the hearts of the believers that they would increase in faith along with their [present] faith. And to Allah belong the soldiers of the heavens and the earth, and ever is Allah Knowing and Wise.",
    "[And] that He may admit the believing men and the believing women to gardens beneath which rivers flow to abide therein eternally and remove from them their misdeeds - and ever is that, in the sight of Allah, a great attainment -",
    "And [that] He may punish the hypocrite men and hypocrite women, and the polytheist men and polytheist women - those who assume about Allah an assumption of evil nature. Upon them is a misfortune of evil nature; and Allah has become angry with them and has cursed them and prepared for them Hell, and evil it is as a destination.",
    "And to Allah belong the soldiers of the heavens and the earth. And ever is Allah Exalted in Might and Wise.",
    "Indeed, We have sent you as a witness and a bringer of good tidings and a warner",
    "That you [people] may believe in Allah and His Messenger and honor him and respect the Prophet and exalt Allah morning and afternoon.",
    "Indeed, those who pledge allegiance to you, [O Muhammad] - they are actually pledging allegiance to Allah. The hand of Allah is over their hands. So he who breaks his word only breaks it to the detriment of himself. And he who fulfills that which he has promised Allah - He will give him a great reward.",
    "Those who remained behind of the bedouins will say to you, \"Our properties and our families occupied us, so ask forgiveness for us.\" They say with their tongues what is not within their hearts. Say, \"Then who could prevent Allah at all if He intended for you harm or intended for you benefit? Rather, ever is Allah, with what you do, Acquainted.",
    "But you thought that the Messenger and the believers would never return to their families, ever, and that was made pleasing in your hearts. And you assumed an assumption of evil and became a people ruined.\"",
    "And whoever has not believed in Allah and His Messenger - then indeed, We have prepared for the disbelievers a Blaze.",
    "And to Allah belongs the dominion of the heavens and the earth. He forgives whom He wills and punishes whom He wills. And ever is Allah Forgiving and Merciful.",
    "Those who remained behind will say when you set out toward the war booty to take it, \"Let us follow you.\" They wish to change the words of Allah. Say, \"Never will you follow us. Thus did Allah say before.\" So they will say, \"Rather, you envy us.\" But [in fact] they were not understanding except a little.",
    "Say to those who remained behind of the bedouins, \"You will be called to [face] a people of great military might; you may fight them, or they will submit. So if you obey, Allah will give you a good reward; but if you turn away as you turned away before, He will punish you with a painful punishment.\"",
    "There is not upon the blind any guilt or upon the lame any guilt or upon the ill any guilt [for remaining behind]. And whoever obeys Allah and His Messenger - He will admit him to gardens beneath which rivers flow; but whoever turns away - He will punish him with a painful punishment.",
    "Certainly was Allah pleased with the believers when they pledged allegiance to you, [O Muhammad], under the tree, and He knew what was in their hearts, so He sent down tranquillity upon them and rewarded them with an imminent conquest",
    "And much war booty which they will take. And ever is Allah Exalted in Might and Wise.",
    "Allah has promised you much booty that you will take [in the future] and has hastened for you this [victory] and withheld the hands of people from you - that it may be a sign for the believers and [that] He may guide you to a straight path.",
    "And [He promises] other [victories] that you were [so far] unable to [realize] which Allah has already encompassed. And ever is Allah, over all things, competent.",
    "And if those [Makkans] who disbelieve had fought you, they would have turned their backs [in flight]. Then they would not find a protector or a helper.",
    "[This is] the established way of Allah which has occurred before. And never will you find in the way of Allah any change.",
    "And it is He who withheld their hands from you and your hands from them within [the area of] Makkah after He caused you to overcome them. And ever is Allah of what you do, Seeing.",
    "They are the ones who disbelieved and obstructed you from al-Masjid al-Haram while the offering was prevented from reaching its place of sacrifice. And if not for believing men and believing women whom you did not know - that you might trample them and there would befall you because of them dishonor without [your] knowledge - [you would have been permitted to enter Makkah]. [This was so] that Allah might admit to His mercy whom He willed. If they had been apart [from them], We would have punished those who disbelieved among them with painful punishment",
    "When those who disbelieved had put into their hearts chauvinism - the chauvinism of the time of ignorance. But Allah sent down His tranquillity upon His Messenger and upon the believers and imposed upon them the word of righteousness, and they were more deserving of it and worthy of it. And ever is Allah, of all things, Knowing.",
    "Certainly has Allah showed to His Messenger the vision in truth. You will surely enter al-Masjid al-Haram, if Allah wills, in safety, with your heads shaved and [hair] shortened, not fearing [anyone]. He knew what you did not know and has arranged before that a conquest near [at hand].",
    "It is He who sent His Messenger with guidance and the religion of truth to manifest it over all religion. And sufficient is Allah as Witness.",
    "Muhammad is the Messenger of Allah; and those with him are forceful against the disbelievers, merciful among themselves. You see them bowing and prostrating [in prayer], seeking bounty from Allah and [His] pleasure. Their mark is on their faces from the trace of prostration. That is their description in the Torah. And their description in the Gospel is as a plant which produces its offshoots and strengthens them so they grow firm and stand upon their stalks, delighting the sowers - so that Allah may enrage by them the disbelievers. Allah has promised those who believe and do righteous deeds among them forgiveness and a great reward.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__fath);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_fath);
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
