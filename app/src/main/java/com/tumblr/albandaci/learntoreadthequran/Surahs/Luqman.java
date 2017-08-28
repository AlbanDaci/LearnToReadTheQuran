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

public class Luqman extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"31:1", "31:2", "31:3", "31:4", "31:5", "31:6", "31:7", "31:8", "31:9", "31:10", "31:11", "31:12", "31:13", "31:14", "31:15", "31:16",
            "31:17", "31:18", "31:19", "31:20", "31:21", "31:22", "31:23", "31:24", "31:25", "31:26", "31:27", "31:28", "31:29", "31:30", "31:31", "31:32",
            "31:33", "31:34", ""};

    String [] arabic_verses = {"الم",
    "تِلْكَ آيَاتُ الْكِتَابِ الْحَكِيمِ",
    "هُدًى وَرَحْمَةً لِّلْمُحْسِنِينَ",
    "الَّذِينَ يُقِيمُونَ الصَّلَاةَ وَيُؤْتُونَ الزَّكَاةَ وَهُم بِالْآخِرَةِ هُمْ يُوقِنُونَ",
    "أُولَٰئِكَ عَلَىٰ هُدًى مِّن رَّبِّهِمْ ۖ وَأُولَٰئِكَ هُمُ الْمُفْلِحُونَ",
    "وَمِنَ النَّاسِ مَن يَشْتَرِي لَهْوَ الْحَدِيثِ لِيُضِلَّ عَن سَبِيلِ اللَّهِ بِغَيْرِ عِلْمٍ وَيَتَّخِذَهَا هُزُوًا ۚ أُولَٰئِكَ لَهُمْ عَذَابٌ مُّهِينٌ",
    "وَإِذَا تُتْلَىٰ عَلَيْهِ آيَاتُنَا وَلَّىٰ مُسْتَكْبِرًا كَأَن لَّمْ يَسْمَعْهَا كَأَنَّ فِي أُذُنَيْهِ وَقْرًا ۖ فَبَشِّرْهُ بِعَذَابٍ أَلِيمٍ",
    "إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ جَنَّاتُ النَّعِيمِ",
    "خَالِدِينَ فِيهَا ۖ وَعْدَ اللَّهِ حَقًّا ۚ وَهُوَ الْعَزِيزُ الْحَكِيمُ",
    "خَلَقَ السَّمَاوَاتِ بِغَيْرِ عَمَدٍ تَرَوْنَهَا ۖ وَأَلْقَىٰ فِي الْأَرْضِ رَوَاسِيَ أَن تَمِيدَ بِكُمْ وَبَثَّ فِيهَا مِن كُلِّ دَابَّةٍ ۚ وَأَنزَلْنَا مِنَ السَّمَاءِ مَاءً فَأَنبَتْنَا فِيهَا مِن كُلِّ زَوْجٍ كَرِيمٍ",
    "هَٰذَا خَلْقُ اللَّهِ فَأَرُونِي مَاذَا خَلَقَ الَّذِينَ مِن دُونِهِ ۚ بَلِ الظَّالِمُونَ فِي ضَلَالٍ مُّبِينٍ",
    "وَلَقَدْ آتَيْنَا لُقْمَانَ الْحِكْمَةَ أَنِ اشْكُرْ لِلَّهِ ۚ وَمَن يَشْكُرْ فَإِنَّمَا يَشْكُرُ لِنَفْسِهِ ۖ وَمَن كَفَرَ فَإِنَّ اللَّهَ غَنِيٌّ حَمِيدٌ",
    "وَإِذْ قَالَ لُقْمَانُ لِابْنِهِ وَهُوَ يَعِظُهُ يَا بُنَيَّ لَا تُشْرِكْ بِاللَّهِ ۖ إِنَّ الشِّرْكَ لَظُلْمٌ عَظِيمٌ",
    "وَوَصَّيْنَا الْإِنسَانَ بِوَالِدَيْهِ حَمَلَتْهُ أُمُّهُ وَهْنًا عَلَىٰ وَهْنٍ وَفِصَالُهُ فِي عَامَيْنِ أَنِ اشْكُرْ لِي وَلِوَالِدَيْكَ إِلَيَّ الْمَصِيرُ",
    "وَإِن جَاهَدَاكَ عَلَىٰ أَن تُشْرِكَ بِي مَا لَيْسَ لَكَ بِهِ عِلْمٌ فَلَا تُطِعْهُمَا ۖ وَصَاحِبْهُمَا فِي الدُّنْيَا مَعْرُوفًا ۖ وَاتَّبِعْ سَبِيلَ مَنْ أَنَابَ إِلَيَّ ۚ ثُمَّ إِلَيَّ مَرْجِعُكُمْ فَأُنَبِّئُكُم بِمَا كُنتُمْ تَعْمَلُونَ",
    "يَا بُنَيَّ إِنَّهَا إِن تَكُ مِثْقَالَ حَبَّةٍ مِّنْ خَرْدَلٍ فَتَكُن فِي صَخْرَةٍ أَوْ فِي السَّمَاوَاتِ أَوْ فِي الْأَرْضِ يَأْتِ بِهَا اللَّهُ ۚ إِنَّ اللَّهَ لَطِيفٌ خَبِيرٌ",
    "يَا بُنَيَّ أَقِمِ الصَّلَاةَ وَأْمُرْ بِالْمَعْرُوفِ وَانْهَ عَنِ الْمُنكَرِ وَاصْبِرْ عَلَىٰ مَا أَصَابَكَ ۖ إِنَّ ذَٰلِكَ مِنْ عَزْمِ الْأُمُورِ",
    "وَلَا تُصَعِّرْ خَدَّكَ لِلنَّاسِ وَلَا تَمْشِ فِي الْأَرْضِ مَرَحًا ۖ إِنَّ اللَّهَ لَا يُحِبُّ كُلَّ مُخْتَالٍ فَخُورٍ",
    "وَاقْصِدْ فِي مَشْيِكَ وَاغْضُضْ مِن صَوْتِكَ ۚ إِنَّ أَنكَرَ الْأَصْوَاتِ لَصَوْتُ الْحَمِيرِ",
    "أَلَمْ تَرَوْا أَنَّ اللَّهَ سَخَّرَ لَكُم مَّا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَأَسْبَغَ عَلَيْكُمْ نِعَمَهُ ظَاهِرَةً وَبَاطِنَةً ۗ وَمِنَ النَّاسِ مَن يُجَادِلُ فِي اللَّهِ بِغَيْرِ عِلْمٍ وَلَا هُدًى وَلَا كِتَابٍ مُّنِيرٍ",
    "وَإِذَا قِيلَ لَهُمُ اتَّبِعُوا مَا أَنزَلَ اللَّهُ قَالُوا بَلْ نَتَّبِعُ مَا وَجَدْنَا عَلَيْهِ آبَاءَنَا ۚ أَوَلَوْ كَانَ الشَّيْطَانُ يَدْعُوهُمْ إِلَىٰ عَذَابِ السَّعِيرِ",
    "وَمَن يُسْلِمْ وَجْهَهُ إِلَى اللَّهِ وَهُوَ مُحْسِنٌ فَقَدِ اسْتَمْسَكَ بِالْعُرْوَةِ الْوُثْقَىٰ ۗ وَإِلَى اللَّهِ عَاقِبَةُ الْأُمُورِ",
    "وَمَن كَفَرَ فَلَا يَحْزُنكَ كُفْرُهُ ۚ إِلَيْنَا مَرْجِعُهُمْ فَنُنَبِّئُهُم بِمَا عَمِلُوا ۚ إِنَّ اللَّهَ عَلِيمٌ بِذَاتِ الصُّدُورِ",
    "نُمَتِّعُهُمْ قَلِيلًا ثُمَّ نَضْطَرُّهُمْ إِلَىٰ عَذَابٍ غَلِيظٍ",
    "وَلَئِن سَأَلْتَهُم مَّنْ خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ لَيَقُولُنَّ اللَّهُ ۚ قُلِ الْحَمْدُ لِلَّهِ ۚ بَلْ أَكْثَرُهُمْ لَا يَعْلَمُونَ",
    "لِلَّهِ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ ۚ إِنَّ اللَّهَ هُوَ الْغَنِيُّ الْحَمِيدُ",
    "وَلَوْ أَنَّمَا فِي الْأَرْضِ مِن شَجَرَةٍ أَقْلَامٌ وَالْبَحْرُ يَمُدُّهُ مِن بَعْدِهِ سَبْعَةُ أَبْحُرٍ مَّا نَفِدَتْ كَلِمَاتُ اللَّهِ ۗ إِنَّ اللَّهَ عَزِيزٌ حَكِيمٌ",
    "مَّا خَلْقُكُمْ وَلَا بَعْثُكُمْ إِلَّا كَنَفْسٍ وَاحِدَةٍ ۗ إِنَّ اللَّهَ سَمِيعٌ بَصِيرٌ",
    "أَلَمْ تَرَ أَنَّ اللَّهَ يُولِجُ اللَّيْلَ فِي النَّهَارِ وَيُولِجُ النَّهَارَ فِي اللَّيْلِ وَسَخَّرَ الشَّمْسَ وَالْقَمَرَ كُلٌّ يَجْرِي إِلَىٰ أَجَلٍ مُّسَمًّى وَأَنَّ اللَّهَ بِمَا تَعْمَلُونَ خَبِيرٌ",
    "ذَٰلِكَ بِأَنَّ اللَّهَ هُوَ الْحَقُّ وَأَنَّ مَا يَدْعُونَ مِن دُونِهِ الْبَاطِلُ وَأَنَّ اللَّهَ هُوَ الْعَلِيُّ الْكَبِيرُ",
    "أَلَمْ تَرَ أَنَّ الْفُلْكَ تَجْرِي فِي الْبَحْرِ بِنِعْمَتِ اللَّهِ لِيُرِيَكُم مِّنْ آيَاتِهِ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّكُلِّ صَبَّارٍ شَكُورٍ",
    "وَإِذَا غَشِيَهُم مَّوْجٌ كَالظُّلَلِ دَعَوُا اللَّهَ مُخْلِصِينَ لَهُ الدِّينَ فَلَمَّا نَجَّاهُمْ إِلَى الْبَرِّ فَمِنْهُم مُّقْتَصِدٌ ۚ وَمَا يَجْحَدُ بِآيَاتِنَا إِلَّا كُلُّ خَتَّارٍ كَفُورٍ",
    "يَا أَيُّهَا النَّاسُ اتَّقُوا رَبَّكُمْ وَاخْشَوْا يَوْمًا لَّا يَجْزِي وَالِدٌ عَن وَلَدِهِ وَلَا مَوْلُودٌ هُوَ جَازٍ عَن وَالِدِهِ شَيْئًا ۚ إِنَّ وَعْدَ اللَّهِ حَقٌّ ۖ فَلَا تَغُرَّنَّكُمُ الْحَيَاةُ الدُّنْيَا وَلَا يَغُرَّنَّكُم بِاللَّهِ الْغَرُورُ",
    "إِنَّ اللَّهَ عِندَهُ عِلْمُ السَّاعَةِ وَيُنَزِّلُ الْغَيْثَ وَيَعْلَمُ مَا فِي الْأَرْحَامِ ۖ وَمَا تَدْرِي نَفْسٌ مَّاذَا تَكْسِبُ غَدًا ۖ وَمَا تَدْرِي نَفْسٌ بِأَيِّ أَرْضٍ تَمُوتُ ۚ إِنَّ اللَّهَ عَلِيمٌ خَبِيرٌ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Alif, Lam, Meem.",
    "These are verses of the wise Book,",
    "As guidance and mercy for the doers of good",
    "Who establish prayer and give zakah, and they, of the Hereafter, are certain [in faith].",
    "Those are on [right] guidance from their Lord, and it is those who are the successful.",
    "And of the people is he who buys the amusement of speech to mislead [others] from the way of Allah without knowledge and who takes it in ridicule. Those will have a humiliating punishment.",
    "And when our verses are recited to him, he turns away arrogantly as if he had not heard them, as if there was in his ears deafness. So give him tidings of a painful punishment.",
    "Indeed, those who believe and do righteous deeds - for them are the Gardens of Pleasure.",
    "Wherein they abide eternally; [it is] the promise of Allah [which is] truth. And He is the Exalted in Might, the Wise.",
    "He created the heavens without pillars that you see and has cast into the earth firmly set mountains, lest it should shift with you, and dispersed therein from every creature. And We sent down rain from the sky and made grow therein [plants] of every noble kind.",
    "This is the creation of Allah. So show Me what those other than Him have created. Rather, the wrongdoers are in clear error.",
    "And We had certainly given Luqman wisdom [and said], \"Be grateful to Allah.\" And whoever is grateful is grateful for [the benefit of] himself. And whoever denies [His favor] - then indeed, Allah is Free of need and Praiseworthy.",
    "And [mention, O Muhammad], when Luqman said to his son while he was instructing him, \"O my son, do not associate [anything] with Allah. Indeed, association [with him] is great injustice.\"",
    "And We have enjoined upon man [care] for his parents. His mother carried him, [increasing her] in weakness upon weakness, and his weaning is in two years. Be grateful to Me and to your parents; to Me is the [final] destination.",
    "But if they endeavor to make you associate with Me that of which you have no knowledge, do not obey them but accompany them in [this] world with appropriate kindness and follow the way of those who turn back to Me [in repentance]. Then to Me will be your return, and I will inform you about what you used to do.",
    "[And Luqman said], \"O my son, indeed if wrong should be the weight of a mustard seed and should be within a rock or [anywhere] in the heavens or in the earth, Allah will bring it forth. Indeed, Allah is Subtle and Acquainted.",
    "O my son, establish prayer, enjoin what is right, forbid what is wrong, and be patient over what befalls you. Indeed, [all] that is of the matters [requiring] determination.",
    "And do not turn your cheek [in contempt] toward people and do not walk through the earth exultantly. Indeed, Allah does not like everyone self-deluded and boastful.",
    "And be moderate in your pace and lower your voice; indeed, the most disagreeable of sounds is the voice of donkeys.\"",
    "Do you not see that Allah has made subject to you whatever is in the heavens and whatever is in the earth and amply bestowed upon you His favors, [both] apparent and unapparent? But of the people is he who disputes about Allah without knowledge or guidance or an enlightening Book [from Him].",
    "And when it is said to them, \"Follow what Allah has revealed,\" they say, \"Rather, we will follow that upon which we found our fathers.\" Even if Satan was inviting them to the punishment of the Blaze?",
    "And whoever submits his face to Allah while he is a doer of good - then he has grasped the most trustworthy handhold. And to Allah will be the outcome of [all] matters.",
    "And whoever has disbelieved - let not his disbelief grieve you. To Us is their return, and We will inform them of what they did. Indeed, Allah is Knowing of that within the breasts.",
    "We grant them enjoyment for a little; then We will force them to a massive punishment.",
    "And if you asked them, \"Who created the heavens and earth?\" they would surely say, \"Allah.\" Say, \"[All] praise is [due] to Allah\"; but most of them do not know.",
    "To Allah belongs whatever is in the heavens and earth. Indeed, Allah is the Free of need, the Praiseworthy.",
    "And if whatever trees upon the earth were pens and the sea [was ink], replenished thereafter by seven [more] seas, the words of Allah would not be exhausted. Indeed, Allah is Exalted in Might and Wise.",
    "Your creation and your resurrection will not be but as that of a single soul. Indeed, Allah is Hearing and Seeing.",
    "Do you not see that Allah causes the night to enter the day and causes the day to enter the night and has subjected the sun and the moon, each running [its course] for a specified term, and that Allah, with whatever you do, is Acquainted?",
    "That is because Allah is the Truth, and that what they call upon other than Him is falsehood, and because Allah is the Most High, the Grand.",
    "Do you not see that ships sail through the sea by the favor of Allah that He may show you of His signs? Indeed in that are signs for everyone patient and grateful.",
    "And when waves come over them like canopies, they supplicate Allah, sincere to Him in religion. But when He delivers them to the land, there are [some] of them who are moderate [in faith]. And none rejects Our signs except everyone treacherous and ungrateful.",
    "O mankind, fear your Lord and fear a Day when no father will avail his son, nor will a son avail his father at all. Indeed, the promise of Allah is truth, so let not the worldly life delude you and be not deceived about Allah by the Deceiver.",
    "Indeed, Allah [alone] has knowledge of the Hour and sends down the rain and knows what is in the wombs. And no soul perceives what it will earn tomorrow, and no soul perceives in what land it will die. Indeed, Allah is Knowing and Acquainted.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luqman);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_luqman);
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
