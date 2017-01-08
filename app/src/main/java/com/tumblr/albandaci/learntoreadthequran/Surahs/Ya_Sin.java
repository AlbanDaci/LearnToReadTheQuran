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

public class Ya_Sin extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"36:1", "36:2", "36:3", "36:4", "36:5", "36:6", "36:7", "36:8", "36:9", "36:10", "36:11", "36:12", "36:13", "36:14", "36:15", "36:16",
            "36:17", "36:18", "36:19", "36:20", "36:21", "36:22", "36:23", "36:24", "36:25", "36:26", "36:27", "36:28", "36:29", "36:30", "36:31", "36:32",
            "36:33", "36:34", "36:35", "36:36", "36:37", "36:38", "36:39", "36:40", "36:41", "36:42", "36:43", "36:44", "36:45", "36:46", "36:47", "36:48",
            "36:49", "36:50", "36:51", "36:52", "36:53", "36:54", "36:55", "36:56", "36:57", "36:58", "36:59", "36:60", "36:61", "36:62", "36:63", "36:64",
            "36:65", "36:66", "36:67", "36:68", "36:69", "36:70", "36:71", "36:72", "36:73", "36:74", "36:75", "36:76", "36:77", "36:78", "36:79", "36:80",
            "36:81", "36:82", "36:83"};

    String [] arabic_verses = {"يس",
    "وَالْقُرْآنِ الْحَكِيمِ",
    "إِنَّكَ لَمِنَ الْمُرْسَلِينَ",
    "عَلَىٰ صِرَاطٍ مُّسْتَقِيمٍ",
    "تَنزِيلَ الْعَزِيزِ الرَّحِيمِ",
    "لِتُنذِرَ قَوْمًا مَّا أُنذِرَ آبَاؤُهُمْ فَهُمْ غَافِلُونَ",
    "لَقَدْ حَقَّ الْقَوْلُ عَلَىٰ أَكْثَرِهِمْ فَهُمْ لَا يُؤْمِنُونَ",
    "إِنَّا جَعَلْنَا فِي أَعْنَاقِهِمْ أَغْلَالًا فَهِيَ إِلَى الْأَذْقَانِ فَهُم مُّقْمَحُونَ",
    "وَجَعَلْنَا مِن بَيْنِ أَيْدِيهِمْ سَدًّا وَمِنْ خَلْفِهِمْ سَدًّا فَأَغْشَيْنَاهُمْ فَهُمْ لَا يُبْصِرُونَ",
    "وَسَوَاءٌ عَلَيْهِمْ أَأَنذَرْتَهُمْ أَمْ لَمْ تُنذِرْهُمْ لَا يُؤْمِنُونَ",
    "إِنَّمَا تُنذِرُ مَنِ اتَّبَعَ الذِّكْرَ وَخَشِيَ الرَّحْمَٰنَ بِالْغَيْبِ ۖ فَبَشِّرْهُ بِمَغْفِرَةٍ وَأَجْرٍ كَرِيمٍ",
    "إِنَّا نَحْنُ نُحْيِي الْمَوْتَىٰ وَنَكْتُبُ مَا قَدَّمُوا وَآثَارَهُمْ ۚ وَكُلَّ شَيْءٍ أَحْصَيْنَاهُ فِي إِمَامٍ مُّبِينٍ",
    "وَاضْرِبْ لَهُم مَّثَلًا أَصْحَابَ الْقَرْيَةِ إِذْ جَاءَهَا الْمُرْسَلُونَ",
    "إِذْ أَرْسَلْنَا إِلَيْهِمُ اثْنَيْنِ فَكَذَّبُوهُمَا فَعَزَّزْنَا بِثَالِثٍ فَقَالُوا إِنَّا إِلَيْكُم مُّرْسَلُونَ",
    "قَالُوا مَا أَنتُمْ إِلَّا بَشَرٌ مِّثْلُنَا وَمَا أَنزَلَ الرَّحْمَٰنُ مِن شَيْءٍ إِنْ أَنتُمْ إِلَّا تَكْذِبُونَ",
    "قَالُوا رَبُّنَا يَعْلَمُ إِنَّا إِلَيْكُمْ لَمُرْسَلُونَ",
    "وَمَا عَلَيْنَا إِلَّا الْبَلَاغُ الْمُبِينُ",
    "قَالُوا إِنَّا تَطَيَّرْنَا بِكُمْ ۖ لَئِن لَّمْ تَنتَهُوا لَنَرْجُمَنَّكُمْ وَلَيَمَسَّنَّكُم مِّنَّا عَذَابٌ أَلِيمٌ",
    "قَالُوا طَائِرُكُم مَّعَكُمْ ۚ أَئِن ذُكِّرْتُم ۚ بَلْ أَنتُمْ قَوْمٌ مُّسْرِفُونَ",
    "وَجَاءَ مِنْ أَقْصَى الْمَدِينَةِ رَجُلٌ يَسْعَىٰ قَالَ يَا قَوْمِ اتَّبِعُوا الْمُرْسَلِينَ",
    "اتَّبِعُوا مَن لَّا يَسْأَلُكُمْ أَجْرًا وَهُم مُّهْتَدُونَ",
    "وَمَا لِيَ لَا أَعْبُدُ الَّذِي فَطَرَنِي وَإِلَيْهِ تُرْجَعُونَ",
    "أَأَتَّخِذُ مِن دُونِهِ آلِهَةً إِن يُرِدْنِ الرَّحْمَٰنُ بِضُرٍّ لَّا تُغْنِ عَنِّي شَفَاعَتُهُمْ شَيْئًا وَلَا يُنقِذُونِ",
    "إِنِّي إِذًا لَّفِي ضَلَالٍ مُّبِينٍ",
    "إِنِّي آمَنتُ بِرَبِّكُمْ فَاسْمَعُونِ",
    "قِيلَ ادْخُلِ الْجَنَّةَ ۖ قَالَ يَا لَيْتَ قَوْمِي يَعْلَمُونَ",
    "بِمَا غَفَرَ لِي رَبِّي وَجَعَلَنِي مِنَ الْمُكْرَمِينَ",
    "وَمَا أَنزَلْنَا عَلَىٰ قَوْمِهِ مِن بَعْدِهِ مِن جُندٍ مِّنَ السَّمَاءِ وَمَا كُنَّا مُنزِلِينَ",
    "إِن كَانَتْ إِلَّا صَيْحَةً وَاحِدَةً فَإِذَا هُمْ خَامِدُونَ",
    "يَا حَسْرَةً عَلَى الْعِبَادِ ۚ مَا يَأْتِيهِم مِّن رَّسُولٍ إِلَّا كَانُوا بِهِ يَسْتَهْزِئُونَ",
    "أَلَمْ يَرَوْا كَمْ أَهْلَكْنَا قَبْلَهُم مِّنَ الْقُرُونِ أَنَّهُمْ إِلَيْهِمْ لَا يَرْجِعُونَ",
    "وَإِن كُلٌّ لَّمَّا جَمِيعٌ لَّدَيْنَا مُحْضَرُونَ",
    "وَآيَةٌ لَّهُمُ الْأَرْضُ الْمَيْتَةُ أَحْيَيْنَاهَا وَأَخْرَجْنَا مِنْهَا حَبًّا فَمِنْهُ يَأْكُلُونَ",
    "وَجَعَلْنَا فِيهَا جَنَّاتٍ مِّن نَّخِيلٍ وَأَعْنَابٍ وَفَجَّرْنَا فِيهَا مِنَ الْعُيُونِ",
    "لِيَأْكُلُوا مِن ثَمَرِهِ وَمَا عَمِلَتْهُ أَيْدِيهِمْ ۖ أَفَلَا يَشْكُرُونَ",
    "سُبْحَانَ الَّذِي خَلَقَ الْأَزْوَاجَ كُلَّهَا مِمَّا تُنبِتُ الْأَرْضُ وَمِنْ أَنفُسِهِمْ وَمِمَّا لَا يَعْلَمُونَ",
    "وَآيَةٌ لَّهُمُ اللَّيْلُ نَسْلَخُ مِنْهُ النَّهَارَ فَإِذَا هُم مُّظْلِمُونَ",
    "وَالشَّمْسُ تَجْرِي لِمُسْتَقَرٍّ لَّهَا ۚ ذَٰلِكَ تَقْدِيرُ الْعَزِيزِ الْعَلِيمِ",
    "وَالْقَمَرَ قَدَّرْنَاهُ مَنَازِلَ حَتَّىٰ عَادَ كَالْعُرْجُونِ الْقَدِيمِ",
    "لَا الشَّمْسُ يَنبَغِي لَهَا أَن تُدْرِكَ الْقَمَرَ وَلَا اللَّيْلُ سَابِقُ النَّهَارِ ۚ وَكُلٌّ فِي فَلَكٍ يَسْبَحُونَ",
    "وَآيَةٌ لَّهُمْ أَنَّا حَمَلْنَا ذُرِّيَّتَهُمْ فِي الْفُلْكِ الْمَشْحُونِ",
    "وَخَلَقْنَا لَهُم مِّن مِّثْلِهِ مَا يَرْكَبُونَ",
    "وَإِن نَّشَأْ نُغْرِقْهُمْ فَلَا صَرِيخَ لَهُمْ وَلَا هُمْ يُنقَذُونَ",
    "إِلَّا رَحْمَةً مِّنَّا وَمَتَاعًا إِلَىٰ حِينٍ",
    "وَإِذَا قِيلَ لَهُمُ اتَّقُوا مَا بَيْنَ أَيْدِيكُمْ وَمَا خَلْفَكُمْ لَعَلَّكُمْ تُرْحَمُونَ",
    "وَمَا تَأْتِيهِم مِّنْ آيَةٍ مِّنْ آيَاتِ رَبِّهِمْ إِلَّا كَانُوا عَنْهَا مُعْرِضِينَ",
    "وَإِذَا قِيلَ لَهُمْ أَنفِقُوا مِمَّا رَزَقَكُمُ اللَّهُ قَالَ الَّذِينَ كَفَرُوا لِلَّذِينَ آمَنُوا أَنُطْعِمُ مَن لَّوْ يَشَاءُ اللَّهُ أَطْعَمَهُ إِنْ أَنتُمْ إِلَّا فِي ضَلَالٍ مُّبِينٍ",
    "وَيَقُولُونَ مَتَىٰ هَٰذَا الْوَعْدُ إِن كُنتُمْ صَادِقِينَ",
    "مَا يَنظُرُونَ إِلَّا صَيْحَةً وَاحِدَةً تَأْخُذُهُمْ وَهُمْ يَخِصِّمُونَ",
    "فَلَا يَسْتَطِيعُونَ تَوْصِيَةً وَلَا إِلَىٰ أَهْلِهِمْ يَرْجِعُونَ",
    "وَنُفِخَ فِي الصُّورِ فَإِذَا هُم مِّنَ الْأَجْدَاثِ إِلَىٰ رَبِّهِمْ يَنسِلُونَ",
    "قَالُوا يَا وَيْلَنَا مَن بَعَثَنَا مِن مَّرْقَدِنَا ۜ ۗ هَٰذَا مَا وَعَدَ الرَّحْمَٰنُ وَصَدَقَ الْمُرْسَلُونَ",
    "إِن كَانَتْ إِلَّا صَيْحَةً وَاحِدَةً فَإِذَا هُمْ جَمِيعٌ لَّدَيْنَا مُحْضَرُونَ",
    "فَالْيَوْمَ لَا تُظْلَمُ نَفْسٌ شَيْئًا وَلَا تُجْزَوْنَ إِلَّا مَا كُنتُمْ تَعْمَلُونَ",
    "إِنَّ أَصْحَابَ الْجَنَّةِ الْيَوْمَ فِي شُغُلٍ فَاكِهُونَ",
    "هُمْ وَأَزْوَاجُهُمْ فِي ظِلَالٍ عَلَى الْأَرَائِكِ مُتَّكِئُونَ",
    "لَهُمْ فِيهَا فَاكِهَةٌ وَلَهُم مَّا يَدَّعُونَ",
    "سَلَامٌ قَوْلًا مِّن رَّبٍّ رَّحِيمٍ",
    "وَامْتَازُوا الْيَوْمَ أَيُّهَا الْمُجْرِمُونَ",
    "أَلَمْ أَعْهَدْ إِلَيْكُمْ يَا بَنِي آدَمَ أَن لَّا تَعْبُدُوا الشَّيْطَانَ ۖ إِنَّهُ لَكُمْ عَدُوٌّ مُّبِينٌ",
    "وَأَنِ اعْبُدُونِي ۚ هَٰذَا صِرَاطٌ مُّسْتَقِيمٌ",
    "وَلَقَدْ أَضَلَّ مِنكُمْ جِبِلًّا كَثِيرًا ۖ أَفَلَمْ تَكُونُوا تَعْقِلُونَ",
    "هَٰذِهِ جَهَنَّمُ الَّتِي كُنتُمْ تُوعَدُونَ",
    "اصْلَوْهَا الْيَوْمَ بِمَا كُنتُمْ تَكْفُرُونَ",
    "الْيَوْمَ نَخْتِمُ عَلَىٰ أَفْوَاهِهِمْ وَتُكَلِّمُنَا أَيْدِيهِمْ وَتَشْهَدُ أَرْجُلُهُم بِمَا كَانُوا يَكْسِبُونَ",
    "وَلَوْ نَشَاءُ لَطَمَسْنَا عَلَىٰ أَعْيُنِهِمْ فَاسْتَبَقُوا الصِّرَاطَ فَأَنَّىٰ يُبْصِرُونَ",
    "وَلَوْ نَشَاءُ لَمَسَخْنَاهُمْ عَلَىٰ مَكَانَتِهِمْ فَمَا اسْتَطَاعُوا مُضِيًّا وَلَا يَرْجِعُونَ",
    "وَمَن نُّعَمِّرْهُ نُنَكِّسْهُ فِي الْخَلْقِ ۖ أَفَلَا يَعْقِلُونَ",
    "وَمَا عَلَّمْنَاهُ الشِّعْرَ وَمَا يَنبَغِي لَهُ ۚ إِنْ هُوَ إِلَّا ذِكْرٌ وَقُرْآنٌ مُّبِينٌ",
    "لِّيُنذِرَ مَن كَانَ حَيًّا وَيَحِقَّ الْقَوْلُ عَلَى الْكَافِرِينَ",
    "أَوَلَمْ يَرَوْا أَنَّا خَلَقْنَا لَهُم مِّمَّا عَمِلَتْ أَيْدِينَا أَنْعَامًا فَهُمْ لَهَا مَالِكُونَ",
    "وَذَلَّلْنَاهَا لَهُمْ فَمِنْهَا رَكُوبُهُمْ وَمِنْهَا يَأْكُلُونَ",
    "وَلَهُمْ فِيهَا مَنَافِعُ وَمَشَارِبُ ۖ أَفَلَا يَشْكُرُونَ",
    "وَاتَّخَذُوا مِن دُونِ اللَّهِ آلِهَةً لَّعَلَّهُمْ يُنصَرُونَ",
    "لَا يَسْتَطِيعُونَ نَصْرَهُمْ وَهُمْ لَهُمْ جُندٌ مُّحْضَرُونَ",
    "فَلَا يَحْزُنكَ قَوْلُهُمْ ۘ إِنَّا نَعْلَمُ مَا يُسِرُّونَ وَمَا يُعْلِنُونَ",
    "أَوَلَمْ يَرَ الْإِنسَانُ أَنَّا خَلَقْنَاهُ مِن نُّطْفَةٍ فَإِذَا هُوَ خَصِيمٌ مُّبِينٌ",
    "وَضَرَبَ لَنَا مَثَلًا وَنَسِيَ خَلْقَهُ ۖ قَالَ مَن يُحْيِي الْعِظَامَ وَهِيَ رَمِيمٌ",
    "قُلْ يُحْيِيهَا الَّذِي أَنشَأَهَا أَوَّلَ مَرَّةٍ ۖ وَهُوَ بِكُلِّ خَلْقٍ عَلِيمٌ",
    "الَّذِي جَعَلَ لَكُم مِّنَ الشَّجَرِ الْأَخْضَرِ نَارًا فَإِذَا أَنتُم مِّنْهُ تُوقِدُونَ",
    "أَوَلَيْسَ الَّذِي خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ بِقَادِرٍ عَلَىٰ أَن يَخْلُقَ مِثْلَهُم ۚ بَلَىٰ وَهُوَ الْخَلَّاقُ الْعَلِيمُ",
    "إِنَّمَا أَمْرُهُ إِذَا أَرَادَ شَيْئًا أَن يَقُولَ لَهُ كُن فَيَكُونُ",
    "فَسُبْحَانَ الَّذِي بِيَدِهِ مَلَكُوتُ كُلِّ شَيْءٍ وَإِلَيْهِ تُرْجَعُونَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"Ya, Seen.",
    "By the wise Qur'an.",
    "Indeed you, [O Muhammad], are from among the messengers,",
    "On a straight path.",
    "[This is] a revelation of the Exalted in Might, the Merciful,",
    "That you may warn a people whose forefathers were not warned, so they are unaware.",
    "Already the word has come into effect upon most of them, so they do not believe.",
    "Indeed, We have put shackles on their necks, and they are to their chins, so they are with heads [kept] aloft.",
    "And We have put before them a barrier and behind them a barrier and covered them, so they do not see.",
    "And it is all the same for them whether you warn them or do not warn them - they will not believe.",
    "You can only warn one who follows the message and fears the Most Merciful unseen. So give him good tidings of forgiveness and noble reward.",
    "Indeed, it is We who bring the dead to life and record what they have put forth and what they left behind, and all things We have enumerated in a clear register.",
    "And present to them an example: the people of the city, when the messengers came to it -",
    "When We sent to them two but they denied them, so We strengthened them with a third, and they said, \"Indeed, we are messengers to you.\"",
    "They said, \"You are not but human beings like us, and the Most Merciful has not revealed a thing. You are only telling lies.\"",
    "They said, \"Our Lord knows that we are messengers to you,",
    "And we are not responsible except for clear notification.\"",
    "They said, \"Indeed, we consider you a bad omen. If you do not desist, we will surely stone you, and there will surely touch you, from us, a painful punishment.\"",
    "They said, \"Your omen is with yourselves. Is it because you were reminded? Rather, you are a transgressing people.\"",
    "And there came from the farthest end of the city a man, running. He said, \"O my people, follow the messengers.",
    "Follow those who do not ask of you [any] payment, and they are [rightly] guided.",
    "And why should I not worship He who created me and to whom you will be returned?",
    "Should I take other than Him [false] deities [while], if the Most Merciful intends for me some adversity, their intercession will not avail me at all, nor can they save me?",
    "Indeed, I would then be in manifest error.",
    "Indeed, I have believed in your Lord, so listen to me.\"",
    "It was said, \"Enter Paradise.\" He said, \"I wish my people could know",
    "Of how my Lord has forgiven me and placed me among the honored.\"",
    "And We did not send down upon his people after him any soldiers from the heaven, nor would We have done so.",
    "It was not but one shout, and immediately they were extinguished.",
    "How regretful for the servants. There did not come to them any messenger except that they used to ridicule him.",
    "Have they not considered how many generations We destroyed before them - that they to them will not return?",
    "And indeed, all of them will yet be brought present before Us.",
    "And a sign for them is the dead earth. We have brought it to life and brought forth from it grain, and from it they eat.",
    "And We placed therein gardens of palm trees and grapevines and caused to burst forth therefrom some springs -",
    "That they may eat of His fruit. And their hands have not produced it, so will they not be grateful?",
    "Exalted is He who created all pairs - from what the earth grows and from themselves and from that which they do not know.",
    "And a sign for them is the night. We remove from it [the light of] day, so they are [left] in darkness.",
    "And the sun runs [on course] toward its stopping point. That is the determination of the Exalted in Might, the Knowing.",
    "And the moon - We have determined for it phases, until it returns [appearing] like the old date stalk.",
    "It is not allowable for the sun to reach the moon, nor does the night overtake the day, but each, in an orbit, is swimming.",
    "And a sign for them is that We carried their forefathers in a laden ship.",
    "And We created for them from the likes of it that which they ride.",
    "And if We should will, We could drown them; then no one responding to a cry would there be for them, nor would they be saved",
    "Except as a mercy from Us and provision for a time.",
    "But when it is said to them, \"Beware of what is before you and what is behind you; perhaps you will receive mercy... \"",
    "And no sign comes to them from the signs of their Lord except that they are from it turning away.",
    "And when it is said to them, \"Spend from that which Allah has provided for you,\" those who disbelieve say to those who believe, \"Should we feed one whom, if Allah had willed, He would have fed? You are not but in clear error.\"",
    "And they say, \"When is this promise, if you should be truthful?\"",
    "They do not await except one blast which will seize them while they are disputing.",
    "And they will not be able [to give] any instruction, nor to their people can they return.",
    "And the Horn will be blown; and at once from the graves to their Lord they will hasten.",
    "They will say, \"O woe to us! Who has raised us up from our sleeping place?\" [The reply will be], \"This is what the Most Merciful had promised, and the messengers told the truth.\"",
    "It will not be but one blast, and at once they are all brought present before Us.",
    "So today no soul will be wronged at all, and you will not be recompensed except for what you used to do.",
    "Indeed the companions of Paradise, that Day, will be amused in [joyful] occupation -",
    "They and their spouses - in shade, reclining on adorned couches.",
    "For them therein is fruit, and for them is whatever they request [or wish]",
    "[And] \"Peace,\" a word from a Merciful Lord.",
    "[Then He will say], \"But stand apart today, you criminals.",
    "Did I not enjoin upon you, O children of Adam, that you not worship Satan - [for] indeed, he is to you a clear enemy -",
    "And that you worship [only] Me? This is a straight path.",
    "And he had already led astray from among you much of creation, so did you not use reason?",
    "This is the Hellfire which you were promised.",
    "[Enter to] burn therein today for what you used to deny.\"",
    "That Day, We will seal over their mouths, and their hands will speak to Us, and their feet will testify about what they used to earn.",
    "And if We willed, We could have obliterated their eyes, and they would race to [find] the path, and how could they see?",
    "And if We willed, We could have deformed them, [paralyzing them] in their places so they would not be able to proceed, nor could they return.",
    "And he to whom We grant long life We reverse in creation; so will they not understand?",
    "And We did not give Prophet Muhammad, knowledge of poetry, nor is it befitting for him. It is not but a message and a clear Qur'an",
    "To warn whoever is alive and justify the word against the disbelievers.",
    "Do they not see that We have created for them from what Our hands have made, grazing livestock, and [then] they are their owners?",
    "And We have tamed them for them, so some of them they ride, and some of them they eat.",
    "And for them therein are [other] benefits and drinks, so will they not be grateful?",
    "But they have taken besides Allah [false] deities that perhaps they would be helped.",
    "They are not able to help them, and they [themselves] are for them soldiers in attendance.",
    "So let not their speech grieve you. Indeed, We know what they conceal and what they declare.",
    "Does man not consider that We created him from a [mere] sperm-drop - then at once he is a clear adversary?",
    "And he presents for Us an example and forgets his [own] creation. He says, \"Who will give life to bones while they are disintegrated?\"",
    "Say, \"He will give them life who produced them the first time; and He is, of all creation, Knowing.\"",
    "[It is] He who made for you from the green tree, fire, and then from it you ignite.",
    "Is not He who created the heavens and the earth Able to create the likes of them? Yes, [it is so]; and He is the Knowing Creator.",
    "His command is only when He intends a thing that He says to it, \"Be,\" and it is.",
    "So exalted is He in whose hand is the realm of all things, and to Him you will be returned."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ya__sin);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ya_sin);
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
