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

public class Fatir extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"35:1", "35:2", "35:3", "35:4", "35:5", "35:6", "35:7", "35:8", "35:9", "35:10", "35:11", "35:12", "35:13", "35:14", "35:15", "35:16",
            "35:17", "35:18", "35:19", "35:20", "35:21", "35:22", "35:23", "35:24", "35:25", "35:26", "35:27", "35:28", "35:29", "35:30", "35:31", "35:32",
            "35:33", "35:34", "35:35", "35:36", "35:37", "35:38", "35:39", "35:40", "35:41", "35:42", "35:43", "35:44", "35:45", ""};

    String [] arabic_verses = {"الْحَمْدُ لِلَّهِ فَاطِرِ السَّمَاوَاتِ وَالْأَرْضِ جَاعِلِ الْمَلَائِكَةِ رُسُلًا أُولِي أَجْنِحَةٍ مَّثْنَىٰ وَثُلَاثَ وَرُبَاعَ ۚ يَزِيدُ فِي الْخَلْقِ مَا يَشَاءُ ۚ إِنَّ اللَّهَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "مَّا يَفْتَحِ اللَّهُ لِلنَّاسِ مِن رَّحْمَةٍ فَلَا مُمْسِكَ لَهَا ۖ وَمَا يُمْسِكْ فَلَا مُرْسِلَ لَهُ مِن بَعْدِهِ ۚ وَهُوَ الْعَزِيزُ الْحَكِيمُ",
    "يَا أَيُّهَا النَّاسُ اذْكُرُوا نِعْمَتَ اللَّهِ عَلَيْكُمْ ۚ هَلْ مِنْ خَالِقٍ غَيْرُ اللَّهِ يَرْزُقُكُم مِّنَ السَّمَاءِ وَالْأَرْضِ ۚ لَا إِلَٰهَ إِلَّا هُوَ ۖ فَأَنَّىٰ تُؤْفَكُونَ",
    "وَإِن يُكَذِّبُوكَ فَقَدْ كُذِّبَتْ رُسُلٌ مِّن قَبْلِكَ ۚ وَإِلَى اللَّهِ تُرْجَعُ الْأُمُورُ",
    "يَا أَيُّهَا النَّاسُ إِنَّ وَعْدَ اللَّهِ حَقٌّ ۖ فَلَا تَغُرَّنَّكُمُ الْحَيَاةُ الدُّنْيَا ۖ وَلَا يَغُرَّنَّكُم بِاللَّهِ الْغَرُورُ",
    "إِنَّ الشَّيْطَانَ لَكُمْ عَدُوٌّ فَاتَّخِذُوهُ عَدُوًّا ۚ إِنَّمَا يَدْعُو حِزْبَهُ لِيَكُونُوا مِنْ أَصْحَابِ السَّعِيرِ",
    "الَّذِينَ كَفَرُوا لَهُمْ عَذَابٌ شَدِيدٌ ۖ وَالَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُم مَّغْفِرَةٌ وَأَجْرٌ كَبِيرٌ",
    "أَفَمَن زُيِّنَ لَهُ سُوءُ عَمَلِهِ فَرَآهُ حَسَنًا ۖ فَإِنَّ اللَّهَ يُضِلُّ مَن يَشَاءُ وَيَهْدِي مَن يَشَاءُ ۖ فَلَا تَذْهَبْ نَفْسُكَ عَلَيْهِمْ حَسَرَاتٍ ۚ إِنَّ اللَّهَ عَلِيمٌ بِمَا يَصْنَعُونَ",
    "وَاللَّهُ الَّذِي أَرْسَلَ الرِّيَاحَ فَتُثِيرُ سَحَابًا فَسُقْنَاهُ إِلَىٰ بَلَدٍ مَّيِّتٍ فَأَحْيَيْنَا بِهِ الْأَرْضَ بَعْدَ مَوْتِهَا ۚ كَذَٰلِكَ النُّشُورُ",
    "مَن كَانَ يُرِيدُ الْعِزَّةَ فَلِلَّهِ الْعِزَّةُ جَمِيعًا ۚ إِلَيْهِ يَصْعَدُ الْكَلِمُ الطَّيِّبُ وَالْعَمَلُ الصَّالِحُ يَرْفَعُهُ ۚ وَالَّذِينَ يَمْكُرُونَ السَّيِّئَاتِ لَهُمْ عَذَابٌ شَدِيدٌ ۖ وَمَكْرُ أُولَٰئِكَ هُوَ يَبُورُ",
    "وَاللَّهُ خَلَقَكُم مِّن تُرَابٍ ثُمَّ مِن نُّطْفَةٍ ثُمَّ جَعَلَكُمْ أَزْوَاجًا ۚ وَمَا تَحْمِلُ مِنْ أُنثَىٰ وَلَا تَضَعُ إِلَّا بِعِلْمِهِ ۚ وَمَا يُعَمَّرُ مِن مُّعَمَّرٍ وَلَا يُنقَصُ مِنْ عُمُرِهِ إِلَّا فِي كِتَابٍ ۚ إِنَّ ذَٰلِكَ عَلَى اللَّهِ يَسِيرٌ",
    "وَمَا يَسْتَوِي الْبَحْرَانِ هَٰذَا عَذْبٌ فُرَاتٌ سَائِغٌ شَرَابُهُ وَهَٰذَا مِلْحٌ أُجَاجٌ ۖ وَمِن كُلٍّ تَأْكُلُونَ لَحْمًا طَرِيًّا وَتَسْتَخْرِجُونَ حِلْيَةً تَلْبَسُونَهَا ۖ وَتَرَى الْفُلْكَ فِيهِ مَوَاخِرَ لِتَبْتَغُوا مِن فَضْلِهِ وَلَعَلَّكُمْ تَشْكُرُونَ",
    "يُولِجُ اللَّيْلَ فِي النَّهَارِ وَيُولِجُ النَّهَارَ فِي اللَّيْلِ وَسَخَّرَ الشَّمْسَ وَالْقَمَرَ كُلٌّ يَجْرِي لِأَجَلٍ مُّسَمًّى ۚ ذَٰلِكُمُ اللَّهُ رَبُّكُمْ لَهُ الْمُلْكُ ۚ وَالَّذِينَ تَدْعُونَ مِن دُونِهِ مَا يَمْلِكُونَ مِن قِطْمِيرٍ",
    "إِن تَدْعُوهُمْ لَا يَسْمَعُوا دُعَاءَكُمْ وَلَوْ سَمِعُوا مَا اسْتَجَابُوا لَكُمْ ۖ وَيَوْمَ الْقِيَامَةِ يَكْفُرُونَ بِشِرْكِكُمْ ۚ وَلَا يُنَبِّئُكَ مِثْلُ خَبِيرٍ",
    "يَا أَيُّهَا النَّاسُ أَنتُمُ الْفُقَرَاءُ إِلَى اللَّهِ ۖ وَاللَّهُ هُوَ الْغَنِيُّ الْحَمِيدُ",
    "إِن يَشَأْ يُذْهِبْكُمْ وَيَأْتِ بِخَلْقٍ جَدِيدٍ",
    "وَمَا ذَٰلِكَ عَلَى اللَّهِ بِعَزِيزٍ",
    "وَلَا تَزِرُ وَازِرَةٌ وِزْرَ أُخْرَىٰ ۚ وَإِن تَدْعُ مُثْقَلَةٌ إِلَىٰ حِمْلِهَا لَا يُحْمَلْ مِنْهُ شَيْءٌ وَلَوْ كَانَ ذَا قُرْبَىٰ ۗ إِنَّمَا تُنذِرُ الَّذِينَ يَخْشَوْنَ رَبَّهُم بِالْغَيْبِ وَأَقَامُوا الصَّلَاةَ ۚ وَمَن تَزَكَّىٰ فَإِنَّمَا يَتَزَكَّىٰ لِنَفْسِهِ ۚ وَإِلَى اللَّهِ الْمَصِيرُ",
    "وَمَا يَسْتَوِي الْأَعْمَىٰ وَالْبَصِيرُ",
    "وَلَا الظُّلُمَاتُ وَلَا النُّورُ",
    "وَلَا الظِّلُّ وَلَا الْحَرُورُ",
    "وَمَا يَسْتَوِي الْأَحْيَاءُ وَلَا الْأَمْوَاتُ ۚ إِنَّ اللَّهَ يُسْمِعُ مَن يَشَاءُ ۖ وَمَا أَنتَ بِمُسْمِعٍ مَّن فِي الْقُبُورِ",
    "إِنْ أَنتَ إِلَّا نَذِيرٌ",
    "إِنَّا أَرْسَلْنَاكَ بِالْحَقِّ بَشِيرًا وَنَذِيرًا ۚ وَإِن مِّنْ أُمَّةٍ إِلَّا خَلَا فِيهَا نَذِيرٌ",
    "وَإِن يُكَذِّبُوكَ فَقَدْ كَذَّبَ الَّذِينَ مِن قَبْلِهِمْ جَاءَتْهُمْ رُسُلُهُم بِالْبَيِّنَاتِ وَبِالزُّبُرِ وَبِالْكِتَابِ الْمُنِيرِ",
    "ثُمَّ أَخَذْتُ الَّذِينَ كَفَرُوا ۖ فَكَيْفَ كَانَ نَكِيرِ",
    "أَلَمْ تَرَ أَنَّ اللَّهَ أَنزَلَ مِنَ السَّمَاءِ مَاءً فَأَخْرَجْنَا بِهِ ثَمَرَاتٍ مُّخْتَلِفًا أَلْوَانُهَا ۚ وَمِنَ الْجِبَالِ جُدَدٌ بِيضٌ وَحُمْرٌ مُّخْتَلِفٌ أَلْوَانُهَا وَغَرَابِيبُ سُودٌ",
    "وَمِنَ النَّاسِ وَالدَّوَابِّ وَالْأَنْعَامِ مُخْتَلِفٌ أَلْوَانُهُ كَذَٰلِكَ ۗ إِنَّمَا يَخْشَى اللَّهَ مِنْ عِبَادِهِ الْعُلَمَاءُ ۗ إِنَّ اللَّهَ عَزِيزٌ غَفُورٌ",
    "إِنَّ الَّذِينَ يَتْلُونَ كِتَابَ اللَّهِ وَأَقَامُوا الصَّلَاةَ وَأَنفَقُوا مِمَّا رَزَقْنَاهُمْ سِرًّا وَعَلَانِيَةً يَرْجُونَ تِجَارَةً لَّن تَبُورَ",
    "لِيُوَفِّيَهُمْ أُجُورَهُمْ وَيَزِيدَهُم مِّن فَضْلِهِ ۚ إِنَّهُ غَفُورٌ شَكُورٌ",
    "وَالَّذِي أَوْحَيْنَا إِلَيْكَ مِنَ الْكِتَابِ هُوَ الْحَقُّ مُصَدِّقًا لِّمَا بَيْنَ يَدَيْهِ ۗ إِنَّ اللَّهَ بِعِبَادِهِ لَخَبِيرٌ بَصِيرٌ",
    "ثُمَّ أَوْرَثْنَا الْكِتَابَ الَّذِينَ اصْطَفَيْنَا مِنْ عِبَادِنَا ۖ فَمِنْهُمْ ظَالِمٌ لِّنَفْسِهِ وَمِنْهُم مُّقْتَصِدٌ وَمِنْهُمْ سَابِقٌ بِالْخَيْرَاتِ بِإِذْنِ اللَّهِ ۚ ذَٰلِكَ هُوَ الْفَضْلُ الْكَبِيرُ",
    "جَنَّاتُ عَدْنٍ يَدْخُلُونَهَا يُحَلَّوْنَ فِيهَا مِنْ أَسَاوِرَ مِن ذَهَبٍ وَلُؤْلُؤًا ۖ وَلِبَاسُهُمْ فِيهَا حَرِيرٌ",
    "وَقَالُوا الْحَمْدُ لِلَّهِ الَّذِي أَذْهَبَ عَنَّا الْحَزَنَ ۖ إِنَّ رَبَّنَا لَغَفُورٌ شَكُورٌ",
    "الَّذِي أَحَلَّنَا دَارَ الْمُقَامَةِ مِن فَضْلِهِ لَا يَمَسُّنَا فِيهَا نَصَبٌ وَلَا يَمَسُّنَا فِيهَا لُغُوبٌ",
    "وَالَّذِينَ كَفَرُوا لَهُمْ نَارُ جَهَنَّمَ لَا يُقْضَىٰ عَلَيْهِمْ فَيَمُوتُوا وَلَا يُخَفَّفُ عَنْهُم مِّنْ عَذَابِهَا ۚ كَذَٰلِكَ نَجْزِي كُلَّ كَفُورٍ",
    "وَهُمْ يَصْطَرِخُونَ فِيهَا رَبَّنَا أَخْرِجْنَا نَعْمَلْ صَالِحًا غَيْرَ الَّذِي كُنَّا نَعْمَلُ ۚ أَوَلَمْ نُعَمِّرْكُم مَّا يَتَذَكَّرُ فِيهِ مَن تَذَكَّرَ وَجَاءَكُمُ النَّذِيرُ ۖ فَذُوقُوا فَمَا لِلظَّالِمِينَ مِن نَّصِيرٍ",
    "إِنَّ اللَّهَ عَالِمُ غَيْبِ السَّمَاوَاتِ وَالْأَرْضِ ۚ إِنَّهُ عَلِيمٌ بِذَاتِ الصُّدُورِ",
    "هُوَ الَّذِي جَعَلَكُمْ خَلَائِفَ فِي الْأَرْضِ ۚ فَمَن كَفَرَ فَعَلَيْهِ كُفْرُهُ ۖ وَلَا يَزِيدُ الْكَافِرِينَ كُفْرُهُمْ عِندَ رَبِّهِمْ إِلَّا مَقْتًا ۖ وَلَا يَزِيدُ الْكَافِرِينَ كُفْرُهُمْ إِلَّا خَسَارًا",
    "قُلْ أَرَأَيْتُمْ شُرَكَاءَكُمُ الَّذِينَ تَدْعُونَ مِن دُونِ اللَّهِ أَرُونِي مَاذَا خَلَقُوا مِنَ الْأَرْضِ أَمْ لَهُمْ شِرْكٌ فِي السَّمَاوَاتِ أَمْ آتَيْنَاهُمْ كِتَابًا فَهُمْ عَلَىٰ بَيِّنَتٍ مِّنْهُ ۚ بَلْ إِن يَعِدُ الظَّالِمُونَ بَعْضُهُم بَعْضًا إِلَّا غُرُورًا",
    "إِنَّ اللَّهَ يُمْسِكُ السَّمَاوَاتِ وَالْأَرْضَ أَن تَزُولَا ۚ وَلَئِن زَالَتَا إِنْ أَمْسَكَهُمَا مِنْ أَحَدٍ مِّن بَعْدِهِ ۚ إِنَّهُ كَانَ حَلِيمًا غَفُورًا",
    "وَأَقْسَمُوا بِاللَّهِ جَهْدَ أَيْمَانِهِمْ لَئِن جَاءَهُمْ نَذِيرٌ لَّيَكُونُنَّ أَهْدَىٰ مِنْ إِحْدَى الْأُمَمِ ۖ فَلَمَّا جَاءَهُمْ نَذِيرٌ مَّا زَادَهُمْ إِلَّا نُفُورًا",
    "اسْتِكْبَارًا فِي الْأَرْضِ وَمَكْرَ السَّيِّئِ ۚ وَلَا يَحِيقُ الْمَكْرُ السَّيِّئُ إِلَّا بِأَهْلِهِ ۚ فَهَلْ يَنظُرُونَ إِلَّا سُنَّتَ الْأَوَّلِينَ ۚ فَلَن تَجِدَ لِسُنَّتِ اللَّهِ تَبْدِيلًا ۖ وَلَن تَجِدَ لِسُنَّتِ اللَّهِ تَحْوِيلًا",
    "أَوَلَمْ يَسِيرُوا فِي الْأَرْضِ فَيَنظُرُوا كَيْفَ كَانَ عَاقِبَةُ الَّذِينَ مِن قَبْلِهِمْ وَكَانُوا أَشَدَّ مِنْهُمْ قُوَّةً ۚ وَمَا كَانَ اللَّهُ لِيُعْجِزَهُ مِن شَيْءٍ فِي السَّمَاوَاتِ وَلَا فِي الْأَرْضِ ۚ إِنَّهُ كَانَ عَلِيمًا قَدِيرًا",
    "وَلَوْ يُؤَاخِذُ اللَّهُ النَّاسَ بِمَا كَسَبُوا مَا تَرَكَ عَلَىٰ ظَهْرِهَا مِن دَابَّةٍ وَلَٰكِن يُؤَخِّرُهُمْ إِلَىٰ أَجَلٍ مُّسَمًّى ۖ فَإِذَا جَاءَ أَجَلُهُمْ فَإِنَّ اللَّهَ كَانَ بِعِبَادِهِ بَصِيرًا",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"[All] praise is [due] to Allah, Creator of the heavens and the earth, [who] made the angels messengers having wings, two or three or four. He increases in creation what He wills. Indeed, Allah is over all things competent.",
    "Whatever Allah grants to people of mercy - none can withhold it; and whatever He withholds - none can release it thereafter. And He is the Exalted in Might, the Wise.",
    "O mankind, remember the favor of Allah upon you. Is there any creator other than Allah who provides for you from the heaven and earth? There is no deity except Him, so how are you deluded?",
    "And if they deny you, [O Muhammad] - already were messengers denied before you. And to Allah are returned [all] matters.",
    "O mankind, indeed the promise of Allah is truth, so let not the worldly life delude you and be not deceived about Allah by the Deceiver.",
    "Indeed, Satan is an enemy to you; so take him as an enemy. He only invites his party to be among the companions of the Blaze.",
    "Those who disbelieve will have a severe punishment, and those who believe and do righteous deeds will have forgiveness and great reward.",
    "Then is one to whom the evil of his deed has been made attractive so he considers it good [like one rightly guided]? For indeed, Allah sends astray whom He wills and guides whom He wills. So do not let yourself perish over them in regret. Indeed, Allah is Knowing of what they do.",
    "And it is Allah who sends the winds, and they stir the clouds, and We drive them to a dead land and give life thereby to the earth after its lifelessness. Thus is the resurrection.",
    "Whoever desires honor [through power] - then to Allah belongs all honor. To Him ascends good speech, and righteous work raises it. But they who plot evil deeds will have a severe punishment, and the plotting of those - it will perish.",
    "And Allah created you from dust, then from a sperm-drop; then He made you mates. And no female conceives nor does she give birth except with His knowledge. And no aged person is granted [additional] life nor is his lifespan lessened but that it is in a register. Indeed, that for Allah is easy.",
    "And not alike are the two bodies of water. One is fresh and sweet, palatable for drinking, and one is salty and bitter. And from each you eat tender meat and extract ornaments which you wear, and you see the ships plowing through [them] that you might seek of His bounty; and perhaps you will be grateful.",
    "He causes the night to enter the day, and He causes the day to enter the night and has subjected the sun and the moon - each running [its course] for a specified term. That is Allah, your Lord; to Him belongs sovereignty. And those whom you invoke other than Him do not possess [as much as] the membrane of a date seed.",
    "If you invoke them, they do not hear your supplication; and if they heard, they would not respond to you. And on the Day of Resurrection they will deny your association. And none can inform you like [one] Acquainted [with all matters].",
    "O mankind, you are those in need of Allah, while Allah is the Free of need, the Praiseworthy.",
    "If He wills, He can do away with you and bring forth a new creation.",
    "And that is for Allah not difficult.",
    "And no bearer of burdens will bear the burden of another. And if a heavily laden soul calls [another] to [carry some of] its load, nothing of it will be carried, even if he should be a close relative. You can only warn those who fear their Lord unseen and have established prayer. And whoever purifies himself only purifies himself for [the benefit of] his soul. And to Allah is the [final] destination.",
    "Not equal are the blind and the seeing,",
    "Nor are the darknesses and the light,",
    "Nor are the shade and the heat,",
    "And not equal are the living and the dead. Indeed, Allah causes to hear whom He wills, but you cannot make hear those in the graves.",
    "You, [O Muhammad], are not but a warner.",
    "Indeed, We have sent you with the truth as a bringer of good tidings and a warner. And there was no nation but that there had passed within it a warner.",
    "And if they deny you - then already have those before them denied. Their messengers came to them with clear proofs and written ordinances and with the enlightening Scripture.",
    "Then I seized the ones who disbelieved, and how [terrible] was My reproach.",
    "Do you not see that Allah sends down rain from the sky, and We produce thereby fruits of varying colors? And in the mountains are tracts, white and red of varying shades and [some] extremely black.",
    "And among people and moving creatures and grazing livestock are various colors similarly. Only those fear Allah, from among His servants, who have knowledge. Indeed, Allah is Exalted in Might and Forgiving.",
    "Indeed, those who recite the Book of Allah and establish prayer and spend [in His cause] out of what We have provided them, secretly and publicly, [can] expect a profit that will never perish -",
    "That He may give them in full their rewards and increase for them of His bounty. Indeed, He is Forgiving and Appreciative.",
    "And that which We have revealed to you, [O Muhammad], of the Book is the truth, confirming what was before it. Indeed, Allah, of His servants, is Acquainted and Seeing.",
    "Then we caused to inherit the Book those We have chosen of Our servants; and among them is he who wrongs himself, and among them is he who is moderate, and among them is he who is foremost in good deeds by permission of Allah. That [inheritance] is what is the great bounty.",
    "[For them are] gardens of perpetual residence which they will enter. They will be adorned therein with bracelets of gold and pearls, and their garments therein will be silk.",
    "And they will say, \"Praise to Allah, who has removed from us [all] sorrow. Indeed, our Lord is Forgiving and Appreciative -",
    "He who has settled us in the home of duration out of His bounty. There touches us not in it any fatigue, and there touches us not in it weariness [of mind].\"",
    "And for those who disbelieve will be the fire of Hell. [Death] is not decreed for them so they may die, nor will its torment be lightened for them. Thus do we recompense every ungrateful one.",
    "And they will cry out therein, \"Our Lord, remove us; we will do righteousness - other than what we were doing!\" But did We not grant you life enough for whoever would remember therein to remember, and the warner had come to you? So taste [the punishment], for there is not for the wrongdoers any helper.",
    "Indeed, Allah is Knower of the unseen [aspects] of the heavens and earth. Indeed, He is Knowing of that within the breasts.",
    "It is He who has made you successors upon the earth. And whoever disbelieves - upon him will be [the consequence of] his disbelief. And the disbelief of the disbelievers does not increase them in the sight of their Lord except in hatred; and the disbelief of the disbelievers does not increase them except in loss.",
    "Say, \"Have you considered your 'partners' whom you invoke besides Allah? Show me what they have created from the earth, or have they partnership [with Him] in the heavens? Or have We given them a book so they are [standing] on evidence therefrom? [No], rather, the wrongdoers do not promise each other except delusion.\"",
    "Indeed, Allah holds the heavens and the earth, lest they cease. And if they should cease, no one could hold them [in place] after Him. Indeed, He is Forbearing and Forgiving.",
    "And they swore by Allah their strongest oaths that if a warner came to them, they would be more guided than [any] one of the [previous] nations. But when a warner came to them, it did not increase them except in aversion.",
    "[Due to] arrogance in the land and plotting of evil; but the evil plot does not encompass except its own people. Then do they await except the way of the former peoples? But you will never find in the way of Allah any change, and you will never find in the way of Allah any alteration.",
    "Have they not traveled through the land and observed how was the end of those before them? And they were greater than them in power. But Allah is not to be caused failure by anything in the heavens or on the earth. Indeed, He is ever Knowing and Competent.",
    "And if Allah were to impose blame on the people for what they have earned, He would not leave upon the earth any creature. But He defers them for a specified term. And when their time comes, then indeed Allah has ever been, of His servants, Seeing.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatir);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_fatir);
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
