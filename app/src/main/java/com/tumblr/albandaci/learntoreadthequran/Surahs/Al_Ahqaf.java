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

public class Al_Ahqaf extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"46:1", "46:2", "46:3", "46:4", "46:5", "46:6", "46:7", "46:8", "46:9", "46:10", "46:11", "46:12", "46:13", "46:14", "46:15", "46:16",
            "46:17", "46:18", "46:19", "46:20", "46:21", "46:22", "46:23", "46:24", "46:25", "46:26", "46:27", "46:28", "46:29", "46:30", "46:31", "46:32",
            "46:33", "46:34", "46:35", ""};

    String [] arabic_verses = {"حم",
    "تَنزِيلُ الْكِتَابِ مِنَ اللَّهِ الْعَزِيزِ الْحَكِيمِ",
    "مَا خَلَقْنَا السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا إِلَّا بِالْحَقِّ وَأَجَلٍ مُّسَمًّى ۚ وَالَّذِينَ كَفَرُوا عَمَّا أُنذِرُوا مُعْرِضُونَ",
    "قُلْ أَرَأَيْتُم مَّا تَدْعُونَ مِن دُونِ اللَّهِ أَرُونِي مَاذَا خَلَقُوا مِنَ الْأَرْضِ أَمْ لَهُمْ شِرْكٌ فِي السَّمَاوَاتِ ۖ ائْتُونِي بِكِتَابٍ مِّن قَبْلِ هَٰذَا أَوْ أَثَارَةٍ مِّنْ عِلْمٍ إِن كُنتُمْ صَادِقِينَ",
    "وَمَنْ أَضَلُّ مِمَّن يَدْعُو مِن دُونِ اللَّهِ مَن لَّا يَسْتَجِيبُ لَهُ إِلَىٰ يَوْمِ الْقِيَامَةِ وَهُمْ عَن دُعَائِهِمْ غَافِلُونَ",
    "وَإِذَا حُشِرَ النَّاسُ كَانُوا لَهُمْ أَعْدَاءً وَكَانُوا بِعِبَادَتِهِمْ كَافِرِينَ",
    "وَإِذَا تُتْلَىٰ عَلَيْهِمْ آيَاتُنَا بَيِّنَاتٍ قَالَ الَّذِينَ كَفَرُوا لِلْحَقِّ لَمَّا جَاءَهُمْ هَٰذَا سِحْرٌ مُّبِينٌ",
    "أَمْ يَقُولُونَ افْتَرَاهُ ۖ قُلْ إِنِ افْتَرَيْتُهُ فَلَا تَمْلِكُونَ لِي مِنَ اللَّهِ شَيْئًا ۖ هُوَ أَعْلَمُ بِمَا تُفِيضُونَ فِيهِ ۖ كَفَىٰ بِهِ شَهِيدًا بَيْنِي وَبَيْنَكُمْ ۖ وَهُوَ الْغَفُورُ الرَّحِيمُ",
    "قُلْ مَا كُنتُ بِدْعًا مِّنَ الرُّسُلِ وَمَا أَدْرِي مَا يُفْعَلُ بِي وَلَا بِكُمْ ۖ إِنْ أَتَّبِعُ إِلَّا مَا يُوحَىٰ إِلَيَّ وَمَا أَنَا إِلَّا نَذِيرٌ مُّبِينٌ",
    "قُلْ أَرَأَيْتُمْ إِن كَانَ مِنْ عِندِ اللَّهِ وَكَفَرْتُم بِهِ وَشَهِدَ شَاهِدٌ مِّن بَنِي إِسْرَائِيلَ عَلَىٰ مِثْلِهِ فَآمَنَ وَاسْتَكْبَرْتُمْ ۖ إِنَّ اللَّهَ لَا يَهْدِي الْقَوْمَ الظَّالِمِينَ",
    "وَقَالَ الَّذِينَ كَفَرُوا لِلَّذِينَ آمَنُوا لَوْ كَانَ خَيْرًا مَّا سَبَقُونَا إِلَيْهِ ۚ وَإِذْ لَمْ يَهْتَدُوا بِهِ فَسَيَقُولُونَ هَٰذَا إِفْكٌ قَدِيمٌ",
    "وَمِن قَبْلِهِ كِتَابُ مُوسَىٰ إِمَامًا وَرَحْمَةً ۚ وَهَٰذَا كِتَابٌ مُّصَدِّقٌ لِّسَانًا عَرَبِيًّا لِّيُنذِرَ الَّذِينَ ظَلَمُوا وَبُشْرَىٰ لِلْمُحْسِنِينَ",
    "إِنَّ الَّذِينَ قَالُوا رَبُّنَا اللَّهُ ثُمَّ اسْتَقَامُوا فَلَا خَوْفٌ عَلَيْهِمْ وَلَا هُمْ يَحْزَنُونَ",
    "أُولَٰئِكَ أَصْحَابُ الْجَنَّةِ خَالِدِينَ فِيهَا جَزَاءً بِمَا كَانُوا يَعْمَلُونَ",
    "وَوَصَّيْنَا الْإِنسَانَ بِوَالِدَيْهِ إِحْسَانًا ۖ حَمَلَتْهُ أُمُّهُ كُرْهًا وَوَضَعَتْهُ كُرْهًا ۖ وَحَمْلُهُ وَفِصَالُهُ ثَلَاثُونَ شَهْرًا ۚ حَتَّىٰ إِذَا بَلَغَ أَشُدَّهُ وَبَلَغَ أَرْبَعِينَ سَنَةً قَالَ رَبِّ أَوْزِعْنِي أَنْ أَشْكُرَ نِعْمَتَكَ الَّتِي أَنْعَمْتَ عَلَيَّ وَعَلَىٰ وَالِدَيَّ وَأَنْ أَعْمَلَ صَالِحًا تَرْضَاهُ وَأَصْلِحْ لِي فِي ذُرِّيَّتِي ۖ إِنِّي تُبْتُ إِلَيْكَ وَإِنِّي مِنَ الْمُسْلِمِينَ",
    "أُولَٰئِكَ الَّذِينَ نَتَقَبَّلُ عَنْهُمْ أَحْسَنَ مَا عَمِلُوا وَنَتَجَاوَزُ عَن سَيِّئَاتِهِمْ فِي أَصْحَابِ الْجَنَّةِ ۖ وَعْدَ الصِّدْقِ الَّذِي كَانُوا يُوعَدُونَ",
    "وَالَّذِي قَالَ لِوَالِدَيْهِ أُفٍّ لَّكُمَا أَتَعِدَانِنِي أَنْ أُخْرَجَ وَقَدْ خَلَتِ الْقُرُونُ مِن قَبْلِي وَهُمَا يَسْتَغِيثَانِ اللَّهَ وَيْلَكَ آمِنْ إِنَّ وَعْدَ اللَّهِ حَقٌّ فَيَقُولُ مَا هَٰذَا إِلَّا أَسَاطِيرُ الْأَوَّلِينَ",
    "أُولَٰئِكَ الَّذِينَ حَقَّ عَلَيْهِمُ الْقَوْلُ فِي أُمَمٍ قَدْ خَلَتْ مِن قَبْلِهِم مِّنَ الْجِنِّ وَالْإِنسِ ۖ إِنَّهُمْ كَانُوا خَاسِرِينَ",
    "وَلِكُلٍّ دَرَجَاتٌ مِّمَّا عَمِلُوا ۖ وَلِيُوَفِّيَهُمْ أَعْمَالَهُمْ وَهُمْ لَا يُظْلَمُونَ",
    "وَيَوْمَ يُعْرَضُ الَّذِينَ كَفَرُوا عَلَى النَّارِ أَذْهَبْتُمْ طَيِّبَاتِكُمْ فِي حَيَاتِكُمُ الدُّنْيَا وَاسْتَمْتَعْتُم بِهَا فَالْيَوْمَ تُجْزَوْنَ عَذَابَ الْهُونِ بِمَا كُنتُمْ تَسْتَكْبِرُونَ فِي الْأَرْضِ بِغَيْرِ الْحَقِّ وَبِمَا كُنتُمْ تَفْسُقُونَ",
    "وَاذْكُرْ أَخَا عَادٍ إِذْ أَنذَرَ قَوْمَهُ بِالْأَحْقَافِ وَقَدْ خَلَتِ النُّذُرُ مِن بَيْنِ يَدَيْهِ وَمِنْ خَلْفِهِ أَلَّا تَعْبُدُوا إِلَّا اللَّهَ إِنِّي أَخَافُ عَلَيْكُمْ عَذَابَ يَوْمٍ عَظِيمٍ",
    "قَالُوا أَجِئْتَنَا لِتَأْفِكَنَا عَنْ آلِهَتِنَا فَأْتِنَا بِمَا تَعِدُنَا إِن كُنتَ مِنَ الصَّادِقِينَ",
    "قَالَ إِنَّمَا الْعِلْمُ عِندَ اللَّهِ وَأُبَلِّغُكُم مَّا أُرْسِلْتُ بِهِ وَلَٰكِنِّي أَرَاكُمْ قَوْمًا تَجْهَلُونَ",
    "فَلَمَّا رَأَوْهُ عَارِضًا مُّسْتَقْبِلَ أَوْدِيَتِهِمْ قَالُوا هَٰذَا عَارِضٌ مُّمْطِرُنَا ۚ بَلْ هُوَ مَا اسْتَعْجَلْتُم بِهِ ۖ رِيحٌ فِيهَا عَذَابٌ أَلِيمٌ",
    "تُدَمِّرُ كُلَّ شَيْءٍ بِأَمْرِ رَبِّهَا فَأَصْبَحُوا لَا يُرَىٰ إِلَّا مَسَاكِنُهُمْ ۚ كَذَٰلِكَ نَجْزِي الْقَوْمَ الْمُجْرِمِينَ",
    "وَلَقَدْ مَكَّنَّاهُمْ فِيمَا إِن مَّكَّنَّاكُمْ فِيهِ وَجَعَلْنَا لَهُمْ سَمْعًا وَأَبْصَارًا وَأَفْئِدَةً فَمَا أَغْنَىٰ عَنْهُمْ سَمْعُهُمْ وَلَا أَبْصَارُهُمْ وَلَا أَفْئِدَتُهُم مِّن شَيْءٍ إِذْ كَانُوا يَجْحَدُونَ بِآيَاتِ اللَّهِ وَحَاقَ بِهِم مَّا كَانُوا بِهِ يَسْتَهْزِئُونَ",
    "وَلَقَدْ أَهْلَكْنَا مَا حَوْلَكُم مِّنَ الْقُرَىٰ وَصَرَّفْنَا الْآيَاتِ لَعَلَّهُمْ يَرْجِعُونَ",
    "فَلَوْلَا نَصَرَهُمُ الَّذِينَ اتَّخَذُوا مِن دُونِ اللَّهِ قُرْبَانًا آلِهَةً ۖ بَلْ ضَلُّوا عَنْهُمْ ۚ وَذَٰلِكَ إِفْكُهُمْ وَمَا كَانُوا يَفْتَرُونَ",
    "وَإِذْ صَرَفْنَا إِلَيْكَ نَفَرًا مِّنَ الْجِنِّ يَسْتَمِعُونَ الْقُرْآنَ فَلَمَّا حَضَرُوهُ قَالُوا أَنصِتُوا ۖ فَلَمَّا قُضِيَ وَلَّوْا إِلَىٰ قَوْمِهِم مُّنذِرِينَ",
    "قَالُوا يَا قَوْمَنَا إِنَّا سَمِعْنَا كِتَابًا أُنزِلَ مِن بَعْدِ مُوسَىٰ مُصَدِّقًا لِّمَا بَيْنَ يَدَيْهِ يَهْدِي إِلَى الْحَقِّ وَإِلَىٰ طَرِيقٍ مُّسْتَقِيمٍ",
    "يَا قَوْمَنَا أَجِيبُوا دَاعِيَ اللَّهِ وَآمِنُوا بِهِ يَغْفِرْ لَكُم مِّن ذُنُوبِكُمْ وَيُجِرْكُم مِّنْ عَذَابٍ أَلِيمٍ",
    "وَمَن لَّا يُجِبْ دَاعِيَ اللَّهِ فَلَيْسَ بِمُعْجِزٍ فِي الْأَرْضِ وَلَيْسَ لَهُ مِن دُونِهِ أَوْلِيَاءُ ۚ أُولَٰئِكَ فِي ضَلَالٍ مُّبِينٍ",
    "أَوَلَمْ يَرَوْا أَنَّ اللَّهَ الَّذِي خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ وَلَمْ يَعْيَ بِخَلْقِهِنَّ بِقَادِرٍ عَلَىٰ أَن يُحْيِيَ الْمَوْتَىٰ ۚ بَلَىٰ إِنَّهُ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "وَيَوْمَ يُعْرَضُ الَّذِينَ كَفَرُوا عَلَى النَّارِ أَلَيْسَ هَٰذَا بِالْحَقِّ ۖ قَالُوا بَلَىٰ وَرَبِّنَا ۚ قَالَ فَذُوقُوا الْعَذَابَ بِمَا كُنتُمْ تَكْفُرُونَ",
    "فَاصْبِرْ كَمَا صَبَرَ أُولُو الْعَزْمِ مِنَ الرُّسُلِ وَلَا تَسْتَعْجِل لَّهُمْ ۚ كَأَنَّهُمْ يَوْمَ يَرَوْنَ مَا يُوعَدُونَ لَمْ يَلْبَثُوا إِلَّا سَاعَةً مِّن نَّهَارٍ ۚ بَلَاغٌ ۚ فَهَلْ يُهْلَكُ إِلَّا الْقَوْمُ الْفَاسِقُونَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Ha, Meem.",
    "The revelation of the Book is from Allah, the Exalted in Might, the Wise.",
    "We did not create the heavens and earth and what is between them except in truth and [for] a specified term. But those who disbelieve, from that of which they are warned, are turning away.",
    "Say, [O Muhammad], \"Have you considered that which you invoke besides Allah? Show me what they have created of the earth; or did they have partnership in [creation of] the heavens? Bring me a scripture [revealed] before this or a [remaining] trace of knowledge, if you should be truthful.\"",
    "And who is more astray than he who invokes besides Allah those who will not respond to him until the Day of Resurrection, and they, of their invocation, are unaware.",
    "And when the people are gathered [that Day], they [who were invoked] will be enemies to them, and they will be deniers of their worship.",
    "And when Our verses are recited to them as clear evidences, those who disbelieve say of the truth when it has come to them, \"This is obvious magic.\"",
    "Or do they say, \"He has invented it?\" Say, \"If I have invented it, you will not possess for me [the power of protection] from Allah at all. He is most knowing of that in which you are involved. Sufficient is He as Witness between me and you, and He is the Forgiving the Merciful.\"",
    "Say, \"I am not something original among the messengers, nor do I know what will be done with me or with you. I only follow that which is revealed to me, and I am not but a clear warner.\"",
    "Say, \"Have you considered: if the Qur'an was from Allah, and you disbelieved in it while a witness from the Children of Israel has testified to something similar and believed while you were arrogant... ?\" Indeed, Allah does not guide the wrongdoing people.",
    "And those who disbelieve say of those who believe, \"If it had [truly] been good, they would not have preceded us to it.\" And when they are not guided by it, they will say, \"This is an ancient falsehood.\"",
    "And before it was the scripture of Moses to lead and as a mercy. And this is a confirming Book in an Arabic tongue to warn those who have wronged and as good tidings to the doers of good.",
    "Indeed, those who have said, \"Our Lord is Allah,\" and then remained on a right course - there will be no fear concerning them, nor will they grieve.",
    "Those are the companions of Paradise, abiding eternally therein as reward for what they used to do.",
    "And We have enjoined upon man, to his parents, good treatment. His mother carried him with hardship and gave birth to him with hardship, and his gestation and weaning [period] is thirty months. [He grows] until, when he reaches maturity and reaches [the age of] forty years, he says, \"My Lord, enable me to be grateful for Your favor which You have bestowed upon me and upon my parents and to work righteousness of which You will approve and make righteous for me my offspring. Indeed, I have repented to You, and indeed, I am of the Muslims.\"",
    "Those are the ones from whom We will accept the best of what they did and overlook their misdeeds, [their being] among the companions of Paradise. [That is] the promise of truth which they had been promised.",
    "But one who says to his parents, \"Uff to you; do you promise me that I will be brought forth [from the earth] when generations before me have already passed on [into oblivion]?\" while they call to Allah for help [and to their son], \"Woe to you! Believe! Indeed, the promise of Allah is truth.\" But he says, \"This is not but legends of the former people\" -",
    "Those are the ones upon whom the word has come into effect, [who will be] among nations which had passed on before them of jinn and men. Indeed, they [all] were losers.",
    "And for all there are degrees [of reward and punishment] for what they have done, and [it is] so that He may fully compensate them for their deeds, and they will not be wronged.",
    "And the Day those who disbelieved are exposed to the Fire [it will be said], \"You exhausted your pleasures during your worldly life and enjoyed them, so this Day you will be awarded the punishment of [extreme] humiliation because you were arrogant upon the earth without right and because you were defiantly disobedient.\"",
    "And mention, [O Muhammad], the brother of 'Aad, when he warned his people in the [region of] al-Ahqaf - and warners had already passed on before him and after him - [saying], \"Do not worship except Allah. Indeed, I fear for you the punishment of a terrible day.\"",
    "They said, \"Have you come to delude us away from our gods? Then bring us what you promise us, if you should be of the truthful.\"",
    "He said, \"Knowledge [of its time] is only with Allah, and I convey to you that with which I was sent; but I see you [to be] a people behaving ignorantly.\"",
    "And when they saw it as a cloud approaching their valleys, they said, \"This is a cloud bringing us rain!\" Rather, it is that for which you were impatient: a wind, within it a painful punishment,",
    "Destroying everything by command of its Lord. And they became so that nothing was seen [of them] except their dwellings. Thus do We recompense the criminal people.",
    "And We had certainly established them in such as We have not established you, and We made for them hearing and vision and hearts. But their hearing and vision and hearts availed them not from anything [of the punishment] when they were [continually] rejecting the signs of Allah; and they were enveloped by what they used to ridicule.",
    "And We have already destroyed what surrounds you of [those] cities, and We have diversified the signs [or verses] that perhaps they might return [from disbelief].",
    "Then why did those they took besides Allah as deities by which to approach [Him] not aid them? But they had strayed from them. And that was their falsehood and what they were inventing.",
    "And [mention, O Muhammad], when We directed to you a few of the jinn, listening to the Qur'an. And when they attended it, they said, \"Listen quietly.\" And when it was concluded, they went back to their people as warners.",
    "They said, \"O our people, indeed we have heard a [recited] Book revealed after Moses confirming what was before it which guides to the truth and to a straight path.",
    "O our people, respond to the Messenger of Allah and believe in him; Allah will forgive for you your sins and protect you from a painful punishment.",
    "But he who does not respond to the Caller of Allah will not cause failure [to Him] upon earth, and he will not have besides Him any protectors. Those are in manifest error.\"",
    "Do they not see that Allah, who created the heavens and earth and did not fail in their creation, is able to give life to the dead? Yes. Indeed, He is over all things competent.",
    "And the Day those who disbelieved are exposed to the Fire [it will be said], \"Is this not the truth?\" They will say, \"Yes, by our Lord.\" He will say, \"Then taste the punishment because you used to disbelieve.\"",
    "So be patient, [O Muhammad], as were those of determination among the messengers and do not be impatient for them. It will be - on the Day they see that which they are promised - as though they had not remained [in the world] except an hour of a day. [This is] notification. And will [any] be destroyed except the defiantly disobedient people?",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__ahqaf);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_ahqaf);
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
