package com.tumblr.albandaci.learntoreadthequran.Surahs;

import android.media.MediaPlayer;
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
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.tumblr.albandaci.learntoreadthequran.Adapter.Al_Fatihah_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

import java.io.IOException;

public class Yunus extends AppCompatActivity implements RewardedVideoAdListener {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private String URL1 = "https://www.al-hamdoulillah.com/coran/mp3/files/mohammed-siddiq-minshawi/010.mp3";
    private MediaPlayer mediaPlayer;
    private RewardedVideoAd mAd;

    String [] verses = {"10:1", "10:2", "10:3", "10:4", "10:5", "10:6", "10:7", "10:8", "10:9", "10:10", "10:11", "10:12", "10:13", "10:14", "10:15", "10:16",
            "10:17", "10:18", "10:19", "10:20", "10:21", "10:22", "10:23", "10:24", "10:25", "10:26", "10:27", "10:28", "10:29", "10:30", "10:31", "10:32",
            "10:33", "10:34", "10:35", "10:36", "10:37", "10:38", "10:39", "10:40", "10:41", "10:42", "10:43", "10:44", "10:45", "10:46", "10:47", "10:48",
            "10:49", "10:50", "10:51", "10:52", "10:53", "10:54", "10:55", "10:56", "10:57", "10:58", "10:59", "10:60", "10:61", "10:62", "10:63", "10:64",
            "10:65", "10:66", "10:67", "10:68", "10:69", "10:70", "10:71", "10:72", "10:73", "10:74", "10:75", "10:76", "10:77", "10:78", "10:79", "10:80",
            "10:81", "10:82", "10:83", "10:84", "10:85", "10:86", "10:87", "10:88", "10:89", "10:90", "10:91", "10:92", "10:93", "10:94", "10:95", "10:96",
            "10:97", "10:98", "10:99", "10:100", "10:101", "10:102", "10:103", "10:104", "10:105", "10:106", "10:107", "10:108", "10:109", ""};

    String [] arabic_verses = {"الر ۚ تِلْكَ آيَاتُ الْكِتَابِ الْحَكِيمِ",
    "أَكَانَ لِلنَّاسِ عَجَبًا أَنْ أَوْحَيْنَا إِلَىٰ رَجُلٍ مِّنْهُمْ أَنْ أَنذِرِ النَّاسَ وَبَشِّرِ الَّذِينَ آمَنُوا أَنَّ لَهُمْ قَدَمَ صِدْقٍ عِندَ رَبِّهِمْ ۗ قَالَ الْكَافِرُونَ إِنَّ هَٰذَا لَسَاحِرٌ مُّبِينٌ",
    "إِنَّ رَبَّكُمُ اللَّهُ الَّذِي خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ فِي سِتَّةِ أَيَّامٍ ثُمَّ اسْتَوَىٰ عَلَى الْعَرْشِ ۖ يُدَبِّرُ الْأَمْرَ ۖ مَا مِن شَفِيعٍ إِلَّا مِن بَعْدِ إِذْنِهِ ۚ ذَٰلِكُمُ اللَّهُ رَبُّكُمْ فَاعْبُدُوهُ ۚ أَفَلَا تَذَكَّرُونَ",
    "إِلَيْهِ مَرْجِعُكُمْ جَمِيعًا ۖ وَعْدَ اللَّهِ حَقًّا ۚ إِنَّهُ يَبْدَأُ الْخَلْقَ ثُمَّ يُعِيدُهُ لِيَجْزِيَ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ بِالْقِسْطِ ۚ وَالَّذِينَ كَفَرُوا لَهُمْ شَرَابٌ مِّنْ حَمِيمٍ وَعَذَابٌ أَلِيمٌ بِمَا كَانُوا يَكْفُرُونَ",
    "هُوَ الَّذِي جَعَلَ الشَّمْسَ ضِيَاءً وَالْقَمَرَ نُورًا وَقَدَّرَهُ مَنَازِلَ لِتَعْلَمُوا عَدَدَ السِّنِينَ وَالْحِسَابَ ۚ مَا خَلَقَ اللَّهُ ذَٰلِكَ إِلَّا بِالْحَقِّ ۚ يُفَصِّلُ الْآيَاتِ لِقَوْمٍ يَعْلَمُونَ",
    "إِنَّ فِي اخْتِلَافِ اللَّيْلِ وَالنَّهَارِ وَمَا خَلَقَ اللَّهُ فِي السَّمَاوَاتِ وَالْأَرْضِ لَآيَاتٍ لِّقَوْمٍ يَتَّقُونَ",
    "إِنَّ الَّذِينَ لَا يَرْجُونَ لِقَاءَنَا وَرَضُوا بِالْحَيَاةِ الدُّنْيَا وَاطْمَأَنُّوا بِهَا وَالَّذِينَ هُمْ عَنْ آيَاتِنَا غَافِلُونَ",
    "أُولَٰئِكَ مَأْوَاهُمُ النَّارُ بِمَا كَانُوا يَكْسِبُونَ",
    "إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ يَهْدِيهِمْ رَبُّهُم بِإِيمَانِهِمْ ۖ تَجْرِي مِن تَحْتِهِمُ الْأَنْهَارُ فِي جَنَّاتِ النَّعِيمِ",
    "دَعْوَاهُمْ فِيهَا سُبْحَانَكَ اللَّهُمَّ وَتَحِيَّتُهُمْ فِيهَا سَلَامٌ ۚ وَآخِرُ دَعْوَاهُمْ أَنِ الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ",
    "وَلَوْ يُعَجِّلُ اللَّهُ لِلنَّاسِ الشَّرَّ اسْتِعْجَالَهُم بِالْخَيْرِ لَقُضِيَ إِلَيْهِمْ أَجَلُهُمْ ۖ فَنَذَرُ الَّذِينَ لَا يَرْجُونَ لِقَاءَنَا فِي طُغْيَانِهِمْ يَعْمَهُونَ",
    "وَإِذَا مَسَّ الْإِنسَانَ الضُّرُّ دَعَانَا لِجَنبِهِ أَوْ قَاعِدًا أَوْ قَائِمًا فَلَمَّا كَشَفْنَا عَنْهُ ضُرَّهُ مَرَّ كَأَن لَّمْ يَدْعُنَا إِلَىٰ ضُرٍّ مَّسَّهُ ۚ كَذَٰلِكَ زُيِّنَ لِلْمُسْرِفِينَ مَا كَانُوا يَعْمَلُونَ",
    "وَلَقَدْ أَهْلَكْنَا الْقُرُونَ مِن قَبْلِكُمْ لَمَّا ظَلَمُوا ۙ وَجَاءَتْهُمْ رُسُلُهُم بِالْبَيِّنَاتِ وَمَا كَانُوا لِيُؤْمِنُوا ۚ كَذَٰلِكَ نَجْزِي الْقَوْمَ الْمُجْرِمِينَ",
    "ثُمَّ جَعَلْنَاكُمْ خَلَائِفَ فِي الْأَرْضِ مِن بَعْدِهِمْ لِنَنظُرَ كَيْفَ تَعْمَلُونَ",
    "وَإِذَا تُتْلَىٰ عَلَيْهِمْ آيَاتُنَا بَيِّنَاتٍ ۙ قَالَ الَّذِينَ لَا يَرْجُونَ لِقَاءَنَا ائْتِ بِقُرْآنٍ غَيْرِ هَٰذَا أَوْ بَدِّلْهُ ۚ قُلْ مَا يَكُونُ لِي أَنْ أُبَدِّلَهُ مِن تِلْقَاءِ نَفْسِي ۖ إِنْ أَتَّبِعُ إِلَّا مَا يُوحَىٰ إِلَيَّ ۖ إِنِّي أَخَافُ إِنْ عَصَيْتُ رَبِّي عَذَابَ يَوْمٍ عَظِيمٍ",
    "قُل لَّوْ شَاءَ اللَّهُ مَا تَلَوْتُهُ عَلَيْكُمْ وَلَا أَدْرَاكُم بِهِ ۖ فَقَدْ لَبِثْتُ فِيكُمْ عُمُرًا مِّن قَبْلِهِ ۚ أَفَلَا تَعْقِلُونَ",
    "فَمَنْ أَظْلَمُ مِمَّنِ افْتَرَىٰ عَلَى اللَّهِ كَذِبًا أَوْ كَذَّبَ بِآيَاتِهِ ۚ إِنَّهُ لَا يُفْلِحُ الْمُجْرِمُونَ",
    "وَيَعْبُدُونَ مِن دُونِ اللَّهِ مَا لَا يَضُرُّهُمْ وَلَا يَنفَعُهُمْ وَيَقُولُونَ هَٰؤُلَاءِ شُفَعَاؤُنَا عِندَ اللَّهِ ۚ قُلْ أَتُنَبِّئُونَ اللَّهَ بِمَا لَا يَعْلَمُ فِي السَّمَاوَاتِ وَلَا فِي الْأَرْضِ ۚ سُبْحَانَهُ وَتَعَالَىٰ عَمَّا يُشْرِكُونَ",
    "وَمَا كَانَ النَّاسُ إِلَّا أُمَّةً وَاحِدَةً فَاخْتَلَفُوا ۚ وَلَوْلَا كَلِمَةٌ سَبَقَتْ مِن رَّبِّكَ لَقُضِيَ بَيْنَهُمْ فِيمَا فِيهِ يَخْتَلِفُونَ",
    "وَيَقُولُونَ لَوْلَا أُنزِلَ عَلَيْهِ آيَةٌ مِّن رَّبِّهِ ۖ فَقُلْ إِنَّمَا الْغَيْبُ لِلَّهِ فَانتَظِرُوا إِنِّي مَعَكُم مِّنَ الْمُنتَظِرِينَ",
    "وَإِذَا أَذَقْنَا النَّاسَ رَحْمَةً مِّن بَعْدِ ضَرَّاءَ مَسَّتْهُمْ إِذَا لَهُم مَّكْرٌ فِي آيَاتِنَا ۚ قُلِ اللَّهُ أَسْرَعُ مَكْرًا ۚ إِنَّ رُسُلَنَا يَكْتُبُونَ مَا تَمْكُرُونَ",
    "هُوَ الَّذِي يُسَيِّرُكُمْ فِي الْبَرِّ وَالْبَحْرِ ۖ حَتَّىٰ إِذَا كُنتُمْ فِي الْفُلْكِ وَجَرَيْنَ بِهِم بِرِيحٍ طَيِّبَةٍ وَفَرِحُوا بِهَا جَاءَتْهَا رِيحٌ عَاصِفٌ وَجَاءَهُمُ الْمَوْجُ مِن كُلِّ مَكَانٍ وَظَنُّوا أَنَّهُمْ أُحِيطَ بِهِمْ ۙ دَعَوُا اللَّهَ مُخْلِصِينَ لَهُ الدِّينَ لَئِنْ أَنجَيْتَنَا مِنْ هَٰذِهِ لَنَكُونَنَّ مِنَ الشَّاكِرِينَ",
    "فَلَمَّا أَنجَاهُمْ إِذَا هُمْ يَبْغُونَ فِي الْأَرْضِ بِغَيْرِ الْحَقِّ ۗ يَا أَيُّهَا النَّاسُ إِنَّمَا بَغْيُكُمْ عَلَىٰ أَنفُسِكُم ۖ مَّتَاعَ الْحَيَاةِ الدُّنْيَا ۖ ثُمَّ إِلَيْنَا مَرْجِعُكُمْ فَنُنَبِّئُكُم بِمَا كُنتُمْ تَعْمَلُونَ",
    "إِنَّمَا مَثَلُ الْحَيَاةِ الدُّنْيَا كَمَاءٍ أَنزَلْنَاهُ مِنَ السَّمَاءِ فَاخْتَلَطَ بِهِ نَبَاتُ الْأَرْضِ مِمَّا يَأْكُلُ النَّاسُ وَالْأَنْعَامُ حَتَّىٰ إِذَا أَخَذَتِ الْأَرْضُ زُخْرُفَهَا وَازَّيَّنَتْ وَظَنَّ أَهْلُهَا أَنَّهُمْ قَادِرُونَ عَلَيْهَا أَتَاهَا أَمْرُنَا لَيْلًا أَوْ نَهَارًا فَجَعَلْنَاهَا حَصِيدًا كَأَن لَّمْ تَغْنَ بِالْأَمْسِ ۚ كَذَٰلِكَ نُفَصِّلُ الْآيَاتِ لِقَوْمٍ يَتَفَكَّرُونَ",
    "وَاللَّهُ يَدْعُو إِلَىٰ دَارِ السَّلَامِ وَيَهْدِي مَن يَشَاءُ إِلَىٰ صِرَاطٍ مُّسْتَقِيمٍ",
    "لِّلَّذِينَ أَحْسَنُوا الْحُسْنَىٰ وَزِيَادَةٌ ۖ وَلَا يَرْهَقُ وُجُوهَهُمْ قَتَرٌ وَلَا ذِلَّةٌ ۚ أُولَٰئِكَ أَصْحَابُ الْجَنَّةِ ۖ هُمْ فِيهَا خَالِدُونَ",
    "وَالَّذِينَ كَسَبُوا السَّيِّئَاتِ جَزَاءُ سَيِّئَةٍ بِمِثْلِهَا وَتَرْهَقُهُمْ ذِلَّةٌ ۖ مَّا لَهُم مِّنَ اللَّهِ مِنْ عَاصِمٍ ۖ كَأَنَّمَا أُغْشِيَتْ وُجُوهُهُمْ قِطَعًا مِّنَ اللَّيْلِ مُظْلِمًا ۚ أُولَٰئِكَ أَصْحَابُ النَّارِ ۖ هُمْ فِيهَا خَالِدُونَ",
    "وَيَوْمَ نَحْشُرُهُمْ جَمِيعًا ثُمَّ نَقُولُ لِلَّذِينَ أَشْرَكُوا مَكَانَكُمْ أَنتُمْ وَشُرَكَاؤُكُمْ ۚ فَزَيَّلْنَا بَيْنَهُمْ ۖ وَقَالَ شُرَكَاؤُهُم مَّا كُنتُمْ إِيَّانَا تَعْبُدُونَ",
    "فَكَفَىٰ بِاللَّهِ شَهِيدًا بَيْنَنَا وَبَيْنَكُمْ إِن كُنَّا عَنْ عِبَادَتِكُمْ لَغَافِلِينَ",
    "هُنَالِكَ تَبْلُو كُلُّ نَفْسٍ مَّا أَسْلَفَتْ ۚ وَرُدُّوا إِلَى اللَّهِ مَوْلَاهُمُ الْحَقِّ ۖ وَضَلَّ عَنْهُم مَّا كَانُوا يَفْتَرُونَ",
    "قُلْ مَن يَرْزُقُكُم مِّنَ السَّمَاءِ وَالْأَرْضِ أَمَّن يَمْلِكُ السَّمْعَ وَالْأَبْصَارَ وَمَن يُخْرِجُ الْحَيَّ مِنَ الْمَيِّتِ وَيُخْرِجُ الْمَيِّتَ مِنَ الْحَيِّ وَمَن يُدَبِّرُ الْأَمْرَ ۚ فَسَيَقُولُونَ اللَّهُ ۚ فَقُلْ أَفَلَا تَتَّقُونَ",
    "فَذَٰلِكُمُ اللَّهُ رَبُّكُمُ الْحَقُّ ۖ فَمَاذَا بَعْدَ الْحَقِّ إِلَّا الضَّلَالُ ۖ فَأَنَّىٰ تُصْرَفُونَ",
    "كَذَٰلِكَ حَقَّتْ كَلِمَتُ رَبِّكَ عَلَى الَّذِينَ فَسَقُوا أَنَّهُمْ لَا يُؤْمِنُونَ",
    "قُلْ هَلْ مِن شُرَكَائِكُم مَّن يَبْدَأُ الْخَلْقَ ثُمَّ يُعِيدُهُ ۚ قُلِ اللَّهُ يَبْدَأُ الْخَلْقَ ثُمَّ يُعِيدُهُ ۖ فَأَنَّىٰ تُؤْفَكُونَ",
    "قُلْ هَلْ مِن شُرَكَائِكُم مَّن يَهْدِي إِلَى الْحَقِّ ۚ قُلِ اللَّهُ يَهْدِي لِلْحَقِّ ۗ أَفَمَن يَهْدِي إِلَى الْحَقِّ أَحَقُّ أَن يُتَّبَعَ أَمَّن لَّا يَهِدِّي إِلَّا أَن يُهْدَىٰ ۖ فَمَا لَكُمْ كَيْفَ تَحْكُمُونَ",
    "وَمَا يَتَّبِعُ أَكْثَرُهُمْ إِلَّا ظَنًّا ۚ إِنَّ الظَّنَّ لَا يُغْنِي مِنَ الْحَقِّ شَيْئًا ۚ إِنَّ اللَّهَ عَلِيمٌ بِمَا يَفْعَلُونَ",
    "وَمَا كَانَ هَٰذَا الْقُرْآنُ أَن يُفْتَرَىٰ مِن دُونِ اللَّهِ وَلَٰكِن تَصْدِيقَ الَّذِي بَيْنَ يَدَيْهِ وَتَفْصِيلَ الْكِتَابِ لَا رَيْبَ فِيهِ مِن رَّبِّ الْعَالَمِينَ",
    "أَمْ يَقُولُونَ افْتَرَاهُ ۖ قُلْ فَأْتُوا بِسُورَةٍ مِّثْلِهِ وَادْعُوا مَنِ اسْتَطَعْتُم مِّن دُونِ اللَّهِ إِن كُنتُمْ صَادِقِينَ",
    "بَلْ كَذَّبُوا بِمَا لَمْ يُحِيطُوا بِعِلْمِهِ وَلَمَّا يَأْتِهِمْ تَأْوِيلُهُ ۚ كَذَٰلِكَ كَذَّبَ الَّذِينَ مِن قَبْلِهِمْ ۖ فَانظُرْ كَيْفَ كَانَ عَاقِبَةُ الظَّالِمِينَ",
    "وَمِنْهُم مَّن يُؤْمِنُ بِهِ وَمِنْهُم مَّن لَّا يُؤْمِنُ بِهِ ۚ وَرَبُّكَ أَعْلَمُ بِالْمُفْسِدِينَ",
    "وَإِن كَذَّبُوكَ فَقُل لِّي عَمَلِي وَلَكُمْ عَمَلُكُمْ ۖ أَنتُم بَرِيئُونَ مِمَّا أَعْمَلُ وَأَنَا بَرِيءٌ مِّمَّا تَعْمَلُونَ",
    "وَمِنْهُم مَّن يَسْتَمِعُونَ إِلَيْكَ ۚ أَفَأَنتَ تُسْمِعُ الصُّمَّ وَلَوْ كَانُوا لَا يَعْقِلُونَ",
    "وَمِنْهُم مَّن يَنظُرُ إِلَيْكَ ۚ أَفَأَنتَ تَهْدِي الْعُمْيَ وَلَوْ كَانُوا لَا يُبْصِرُونَ",
    "إِنَّ اللَّهَ لَا يَظْلِمُ النَّاسَ شَيْئًا وَلَٰكِنَّ النَّاسَ أَنفُسَهُمْ يَظْلِمُونَ",
    "وَيَوْمَ يَحْشُرُهُمْ كَأَن لَّمْ يَلْبَثُوا إِلَّا سَاعَةً مِّنَ النَّهَارِ يَتَعَارَفُونَ بَيْنَهُمْ ۚ قَدْ خَسِرَ الَّذِينَ كَذَّبُوا بِلِقَاءِ اللَّهِ وَمَا كَانُوا مُهْتَدِينَ",
    "وَإِمَّا نُرِيَنَّكَ بَعْضَ الَّذِي نَعِدُهُمْ أَوْ نَتَوَفَّيَنَّكَ فَإِلَيْنَا مَرْجِعُهُمْ ثُمَّ اللَّهُ شَهِيدٌ عَلَىٰ مَا يَفْعَلُونَ",
    "وَلِكُلِّ أُمَّةٍ رَّسُولٌ ۖ فَإِذَا جَاءَ رَسُولُهُمْ قُضِيَ بَيْنَهُم بِالْقِسْطِ وَهُمْ لَا يُظْلَمُونَ",
    "وَيَقُولُونَ مَتَىٰ هَٰذَا الْوَعْدُ إِن كُنتُمْ صَادِقِينَ",
    "قُل لَّا أَمْلِكُ لِنَفْسِي ضَرًّا وَلَا نَفْعًا إِلَّا مَا شَاءَ اللَّهُ ۗ لِكُلِّ أُمَّةٍ أَجَلٌ ۚ إِذَا جَاءَ أَجَلُهُمْ فَلَا يَسْتَأْخِرُونَ سَاعَةً ۖ وَلَا يَسْتَقْدِمُونَ",
    "قُلْ أَرَأَيْتُمْ إِنْ أَتَاكُمْ عَذَابُهُ بَيَاتًا أَوْ نَهَارًا مَّاذَا يَسْتَعْجِلُ مِنْهُ الْمُجْرِمُونَ",
    "أَثُمَّ إِذَا مَا وَقَعَ آمَنتُم بِهِ ۚ آلْآنَ وَقَدْ كُنتُم بِهِ تَسْتَعْجِلُونَ",
    "ثُمَّ قِيلَ لِلَّذِينَ ظَلَمُوا ذُوقُوا عَذَابَ الْخُلْدِ هَلْ تُجْزَوْنَ إِلَّا بِمَا كُنتُمْ تَكْسِبُونَ",
    "وَيَسْتَنبِئُونَكَ أَحَقٌّ هُوَ ۖ قُلْ إِي وَرَبِّي إِنَّهُ لَحَقٌّ ۖ وَمَا أَنتُم بِمُعْجِزِينَ",
    "وَلَوْ أَنَّ لِكُلِّ نَفْسٍ ظَلَمَتْ مَا فِي الْأَرْضِ لَافْتَدَتْ بِهِ ۗ وَأَسَرُّوا النَّدَامَةَ لَمَّا رَأَوُا الْعَذَابَ ۖ وَقُضِيَ بَيْنَهُم بِالْقِسْطِ ۚ وَهُمْ لَا يُظْلَمُونَ",
    "أَلَا إِنَّ لِلَّهِ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ ۗ أَلَا إِنَّ وَعْدَ اللَّهِ حَقٌّ وَلَٰكِنَّ أَكْثَرَهُمْ لَا يَعْلَمُونَ",
    "هُوَ يُحْيِي وَيُمِيتُ وَإِلَيْهِ تُرْجَعُونَ",
    "يَا أَيُّهَا النَّاسُ قَدْ جَاءَتْكُم مَّوْعِظَةٌ مِّن رَّبِّكُمْ وَشِفَاءٌ لِّمَا فِي الصُّدُورِ وَهُدًى وَرَحْمَةٌ لِّلْمُؤْمِنِينَ",
    "قُلْ بِفَضْلِ اللَّهِ وَبِرَحْمَتِهِ فَبِذَٰلِكَ فَلْيَفْرَحُوا هُوَ خَيْرٌ مِّمَّا يَجْمَعُونَ",
    "قُلْ أَرَأَيْتُم مَّا أَنزَلَ اللَّهُ لَكُم مِّن رِّزْقٍ فَجَعَلْتُم مِّنْهُ حَرَامًا وَحَلَالًا قُلْ آللَّهُ أَذِنَ لَكُمْ ۖ أَمْ عَلَى اللَّهِ تَفْتَرُونَ",
    "وَمَا ظَنُّ الَّذِينَ يَفْتَرُونَ عَلَى اللَّهِ الْكَذِبَ يَوْمَ الْقِيَامَةِ ۗ إِنَّ اللَّهَ لَذُو فَضْلٍ عَلَى النَّاسِ وَلَٰكِنَّ أَكْثَرَهُمْ لَا يَشْكُرُونَ",
    "وَمَا تَكُونُ فِي شَأْنٍ وَمَا تَتْلُو مِنْهُ مِن قُرْآنٍ وَلَا تَعْمَلُونَ مِنْ عَمَلٍ إِلَّا كُنَّا عَلَيْكُمْ شُهُودًا إِذْ تُفِيضُونَ فِيهِ ۚ وَمَا يَعْزُبُ عَن رَّبِّكَ مِن مِّثْقَالِ ذَرَّةٍ فِي الْأَرْضِ وَلَا فِي السَّمَاءِ وَلَا أَصْغَرَ مِن ذَٰلِكَ وَلَا أَكْبَرَ إِلَّا فِي كِتَابٍ مُّبِينٍ",
    "أَلَا إِنَّ أَوْلِيَاءَ اللَّهِ لَا خَوْفٌ عَلَيْهِمْ وَلَا هُمْ يَحْزَنُونَ",
    "الَّذِينَ آمَنُوا وَكَانُوا يَتَّقُونَ",
    "لَهُمُ الْبُشْرَىٰ فِي الْحَيَاةِ الدُّنْيَا وَفِي الْآخِرَةِ ۚ لَا تَبْدِيلَ لِكَلِمَاتِ اللَّهِ ۚ ذَٰلِكَ هُوَ الْفَوْزُ الْعَظِيمُ",
    "وَلَا يَحْزُنكَ قَوْلُهُمْ ۘ إِنَّ الْعِزَّةَ لِلَّهِ جَمِيعًا ۚ هُوَ السَّمِيعُ الْعَلِيمُ",
    "أَلَا إِنَّ لِلَّهِ مَن فِي السَّمَاوَاتِ وَمَن فِي الْأَرْضِ ۗ وَمَا يَتَّبِعُ الَّذِينَ يَدْعُونَ مِن دُونِ اللَّهِ شُرَكَاءَ ۚ إِن يَتَّبِعُونَ إِلَّا الظَّنَّ وَإِنْ هُمْ إِلَّا يَخْرُصُونَ",
    "هُوَ الَّذِي جَعَلَ لَكُمُ اللَّيْلَ لِتَسْكُنُوا فِيهِ وَالنَّهَارَ مُبْصِرًا ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يَسْمَعُونَ",
    "قَالُوا اتَّخَذَ اللَّهُ وَلَدًا ۗ سُبْحَانَهُ ۖ هُوَ الْغَنِيُّ ۖ لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۚ إِنْ عِندَكُم مِّن سُلْطَانٍ بِهَٰذَا ۚ أَتَقُولُونَ عَلَى اللَّهِ مَا لَا تَعْلَمُونَ",
    "قُلْ إِنَّ الَّذِينَ يَفْتَرُونَ عَلَى اللَّهِ الْكَذِبَ لَا يُفْلِحُونَ",
    "مَتَاعٌ فِي الدُّنْيَا ثُمَّ إِلَيْنَا مَرْجِعُهُمْ ثُمَّ نُذِيقُهُمُ الْعَذَابَ الشَّدِيدَ بِمَا كَانُوا يَكْفُرُونَ",
    "وَاتْلُ عَلَيْهِمْ نَبَأَ نُوحٍ إِذْ قَالَ لِقَوْمِهِ يَا قَوْمِ إِن كَانَ كَبُرَ عَلَيْكُم مَّقَامِي وَتَذْكِيرِي بِآيَاتِ اللَّهِ فَعَلَى اللَّهِ تَوَكَّلْتُ فَأَجْمِعُوا أَمْرَكُمْ وَشُرَكَاءَكُمْ ثُمَّ لَا يَكُنْ أَمْرُكُمْ عَلَيْكُمْ غُمَّةً ثُمَّ اقْضُوا إِلَيَّ وَلَا تُنظِرُونِ",
    "فَإِن تَوَلَّيْتُمْ فَمَا سَأَلْتُكُم مِّنْ أَجْرٍ ۖ إِنْ أَجْرِيَ إِلَّا عَلَى اللَّهِ ۖ وَأُمِرْتُ أَنْ أَكُونَ مِنَ الْمُسْلِمِينَ",
    "فَكَذَّبُوهُ فَنَجَّيْنَاهُ وَمَن مَّعَهُ فِي الْفُلْكِ وَجَعَلْنَاهُمْ خَلَائِفَ وَأَغْرَقْنَا الَّذِينَ كَذَّبُوا بِآيَاتِنَا ۖ فَانظُرْ كَيْفَ كَانَ عَاقِبَةُ الْمُنذَرِينَ",
    "ثُمَّ بَعَثْنَا مِن بَعْدِهِ رُسُلًا إِلَىٰ قَوْمِهِمْ فَجَاءُوهُم بِالْبَيِّنَاتِ فَمَا كَانُوا لِيُؤْمِنُوا بِمَا كَذَّبُوا بِهِ مِن قَبْلُ ۚ كَذَٰلِكَ نَطْبَعُ عَلَىٰ قُلُوبِ الْمُعْتَدِينَ",
    "ثُمَّ بَعَثْنَا مِن بَعْدِهِم مُّوسَىٰ وَهَارُونَ إِلَىٰ فِرْعَوْنَ وَمَلَئِهِ بِآيَاتِنَا فَاسْتَكْبَرُوا وَكَانُوا قَوْمًا مُّجْرِمِينَ",
    "فَلَمَّا جَاءَهُمُ الْحَقُّ مِنْ عِندِنَا قَالُوا إِنَّ هَٰذَا لَسِحْرٌ مُّبِينٌ",
    "قَالَ مُوسَىٰ أَتَقُولُونَ لِلْحَقِّ لَمَّا جَاءَكُمْ ۖ أَسِحْرٌ هَٰذَا وَلَا يُفْلِحُ السَّاحِرُونَ",
    "قَالُوا أَجِئْتَنَا لِتَلْفِتَنَا عَمَّا وَجَدْنَا عَلَيْهِ آبَاءَنَا وَتَكُونَ لَكُمَا الْكِبْرِيَاءُ فِي الْأَرْضِ وَمَا نَحْنُ لَكُمَا بِمُؤْمِنِينَ",
    "وَقَالَ فِرْعَوْنُ ائْتُونِي بِكُلِّ سَاحِرٍ عَلِيمٍ",
    "فَلَمَّا جَاءَ السَّحَرَةُ قَالَ لَهُم مُّوسَىٰ أَلْقُوا مَا أَنتُم مُّلْقُونَ",
    "فَلَمَّا أَلْقَوْا قَالَ مُوسَىٰ مَا جِئْتُم بِهِ السِّحْرُ ۖ إِنَّ اللَّهَ سَيُبْطِلُهُ ۖ إِنَّ اللَّهَ لَا يُصْلِحُ عَمَلَ الْمُفْسِدِينَ",
    "وَيُحِقُّ اللَّهُ الْحَقَّ بِكَلِمَاتِهِ وَلَوْ كَرِهَ الْمُجْرِمُونَ",
    "فَمَا آمَنَ لِمُوسَىٰ إِلَّا ذُرِّيَّةٌ مِّن قَوْمِهِ عَلَىٰ خَوْفٍ مِّن فِرْعَوْنَ وَمَلَئِهِمْ أَن يَفْتِنَهُمْ ۚ وَإِنَّ فِرْعَوْنَ لَعَالٍ فِي الْأَرْضِ وَإِنَّهُ لَمِنَ الْمُسْرِفِينَ",
    "وَقَالَ مُوسَىٰ يَا قَوْمِ إِن كُنتُمْ آمَنتُم بِاللَّهِ فَعَلَيْهِ تَوَكَّلُوا إِن كُنتُم مُّسْلِمِينَ",
    "فَقَالُوا عَلَى اللَّهِ تَوَكَّلْنَا رَبَّنَا لَا تَجْعَلْنَا فِتْنَةً لِّلْقَوْمِ الظَّالِمِينَ",
    "وَنَجِّنَا بِرَحْمَتِكَ مِنَ الْقَوْمِ الْكَافِرِينَ",
    "وَأَوْحَيْنَا إِلَىٰ مُوسَىٰ وَأَخِيهِ أَن تَبَوَّآ لِقَوْمِكُمَا بِمِصْرَ بُيُوتًا وَاجْعَلُوا بُيُوتَكُمْ قِبْلَةً وَأَقِيمُوا الصَّلَاةَ ۗ وَبَشِّرِ الْمُؤْمِنِينَ",
    "وَقَالَ مُوسَىٰ رَبَّنَا إِنَّكَ آتَيْتَ فِرْعَوْنَ وَمَلَأَهُ زِينَةً وَأَمْوَالًا فِي الْحَيَاةِ الدُّنْيَا رَبَّنَا لِيُضِلُّوا عَن سَبِيلِكَ ۖ رَبَّنَا اطْمِسْ عَلَىٰ أَمْوَالِهِمْ وَاشْدُدْ عَلَىٰ قُلُوبِهِمْ فَلَا يُؤْمِنُوا حَتَّىٰ يَرَوُا الْعَذَابَ الْأَلِيمَ",
    "قَالَ قَدْ أُجِيبَت دَّعْوَتُكُمَا فَاسْتَقِيمَا وَلَا تَتَّبِعَانِّ سَبِيلَ الَّذِينَ لَا يَعْلَمُونَ",
    "وَجَاوَزْنَا بِبَنِي إِسْرَائِيلَ الْبَحْرَ فَأَتْبَعَهُمْ فِرْعَوْنُ وَجُنُودُهُ بَغْيًا وَعَدْوًا ۖ حَتَّىٰ إِذَا أَدْرَكَهُ الْغَرَقُ قَالَ آمَنتُ أَنَّهُ لَا إِلَٰهَ إِلَّا الَّذِي آمَنَتْ بِهِ بَنُو إِسْرَائِيلَ وَأَنَا مِنَ الْمُسْلِمِينَ",
    "آلْآنَ وَقَدْ عَصَيْتَ قَبْلُ وَكُنتَ مِنَ الْمُفْسِدِينَ",
    "فَالْيَوْمَ نُنَجِّيكَ بِبَدَنِكَ لِتَكُونَ لِمَنْ خَلْفَكَ آيَةً ۚ وَإِنَّ كَثِيرًا مِّنَ النَّاسِ عَنْ آيَاتِنَا لَغَافِلُونَ",
    "وَلَقَدْ بَوَّأْنَا بَنِي إِسْرَائِيلَ مُبَوَّأَ صِدْقٍ وَرَزَقْنَاهُم مِّنَ الطَّيِّبَاتِ فَمَا اخْتَلَفُوا حَتَّىٰ جَاءَهُمُ الْعِلْمُ ۚ إِنَّ رَبَّكَ يَقْضِي بَيْنَهُمْ يَوْمَ الْقِيَامَةِ فِيمَا كَانُوا فِيهِ يَخْتَلِفُونَ",
    "فَإِن كُنتَ فِي شَكٍّ مِّمَّا أَنزَلْنَا إِلَيْكَ فَاسْأَلِ الَّذِينَ يَقْرَءُونَ الْكِتَابَ مِن قَبْلِكَ ۚ لَقَدْ جَاءَكَ الْحَقُّ مِن رَّبِّكَ فَلَا تَكُونَنَّ مِنَ الْمُمْتَرِينَ",
    "وَلَا تَكُونَنَّ مِنَ الَّذِينَ كَذَّبُوا بِآيَاتِ اللَّهِ فَتَكُونَ مِنَ الْخَاسِرِينَ",
    "إِنَّ الَّذِينَ حَقَّتْ عَلَيْهِمْ كَلِمَتُ رَبِّكَ لَا يُؤْمِنُونَ",
    "وَلَوْ جَاءَتْهُمْ كُلُّ آيَةٍ حَتَّىٰ يَرَوُا الْعَذَابَ الْأَلِيمَ",
    "فَلَوْلَا كَانَتْ قَرْيَةٌ آمَنَتْ فَنَفَعَهَا إِيمَانُهَا إِلَّا قَوْمَ يُونُسَ لَمَّا آمَنُوا كَشَفْنَا عَنْهُمْ عَذَابَ الْخِزْيِ فِي الْحَيَاةِ الدُّنْيَا وَمَتَّعْنَاهُمْ إِلَىٰ حِينٍ",
    "وَلَوْ شَاءَ رَبُّكَ لَآمَنَ مَن فِي الْأَرْضِ كُلُّهُمْ جَمِيعًا ۚ أَفَأَنتَ تُكْرِهُ النَّاسَ حَتَّىٰ يَكُونُوا مُؤْمِنِينَ",
    "وَمَا كَانَ لِنَفْسٍ أَن تُؤْمِنَ إِلَّا بِإِذْنِ اللَّهِ ۚ وَيَجْعَلُ الرِّجْسَ عَلَى الَّذِينَ لَا يَعْقِلُونَ",
    "قُلِ انظُرُوا مَاذَا فِي السَّمَاوَاتِ وَالْأَرْضِ ۚ وَمَا تُغْنِي الْآيَاتُ وَالنُّذُرُ عَن قَوْمٍ لَّا يُؤْمِنُونَ",
    "فَهَلْ يَنتَظِرُونَ إِلَّا مِثْلَ أَيَّامِ الَّذِينَ خَلَوْا مِن قَبْلِهِمْ ۚ قُلْ فَانتَظِرُوا إِنِّي مَعَكُم مِّنَ الْمُنتَظِرِينَ",
    "ثُمَّ نُنَجِّي رُسُلَنَا وَالَّذِينَ آمَنُوا ۚ كَذَٰلِكَ حَقًّا عَلَيْنَا نُنجِ الْمُؤْمِنِينَ",
    "قُلْ يَا أَيُّهَا النَّاسُ إِن كُنتُمْ فِي شَكٍّ مِّن دِينِي فَلَا أَعْبُدُ الَّذِينَ تَعْبُدُونَ مِن دُونِ اللَّهِ وَلَٰكِنْ أَعْبُدُ اللَّهَ الَّذِي يَتَوَفَّاكُمْ ۖ وَأُمِرْتُ أَنْ أَكُونَ مِنَ الْمُؤْمِنِينَ",
    "وَأَنْ أَقِمْ وَجْهَكَ لِلدِّينِ حَنِيفًا وَلَا تَكُونَنَّ مِنَ الْمُشْرِكِينَ",
    "وَلَا تَدْعُ مِن دُونِ اللَّهِ مَا لَا يَنفَعُكَ وَلَا يَضُرُّكَ ۖ فَإِن فَعَلْتَ فَإِنَّكَ إِذًا مِّنَ الظَّالِمِينَ",
    "وَإِن يَمْسَسْكَ اللَّهُ بِضُرٍّ فَلَا كَاشِفَ لَهُ إِلَّا هُوَ ۖ وَإِن يُرِدْكَ بِخَيْرٍ فَلَا رَادَّ لِفَضْلِهِ ۚ يُصِيبُ بِهِ مَن يَشَاءُ مِنْ عِبَادِهِ ۚ وَهُوَ الْغَفُورُ الرَّحِيمُ",
    "قُلْ يَا أَيُّهَا النَّاسُ قَدْ جَاءَكُمُ الْحَقُّ مِن رَّبِّكُمْ ۖ فَمَنِ اهْتَدَىٰ فَإِنَّمَا يَهْتَدِي لِنَفْسِهِ ۖ وَمَن ضَلَّ فَإِنَّمَا يَضِلُّ عَلَيْهَا ۖ وَمَا أَنَا عَلَيْكُم بِوَكِيلٍ",
    "وَاتَّبِعْ مَا يُوحَىٰ إِلَيْكَ وَاصْبِرْ حَتَّىٰ يَحْكُمَ اللَّهُ ۚ وَهُوَ خَيْرُ الْحَاكِمِينَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Alif, Lam, Ra. These are the verses of the wise Book",
    "Have the people been amazed that We revealed [revelation] to a man from among them, [saying], \"Warn mankind and give good tidings to those who believe that they will have a [firm] precedence of honor with their Lord\"? [But] the disbelievers say, \"Indeed, this is an obvious magician.\"",
    "Indeed, your Lord is Allah, who created the heavens and the earth in six days and then established Himself above the Throne, arranging the matter [of His creation]. There is no intercessor except after His permission. That is Allah, your Lord, so worship Him. Then will you not remember?",
    "To Him is your return all together. [It is] the promise of Allah [which is] truth. Indeed, He begins the [process of] creation and then repeats it that He may reward those who have believed and done righteous deeds, in justice. But those who disbelieved will have a drink of scalding water and a painful punishment for what they used to deny.",
    "It is He who made the sun a shining light and the moon a derived light and determined for it phases - that you may know the number of years and account [of time]. Allah has not created this except in truth. He details the signs for a people who know",
    "Indeed, in the alternation of the night and the day and [in] what Allah has created in the heavens and the earth are signs for a people who fear Allah",
    "Indeed, those who do not expect the meeting with Us and are satisfied with the life of this world and feel secure therein and those who are heedless of Our signs",
    "For those their refuge will be the Fire because of what they used to earn.",
    "Indeed, those who have believed and done righteous deeds - their Lord will guide them because of their faith. Beneath them rivers will flow in the Gardens of Pleasure",
    "Their call therein will be, \"Exalted are You, O Allah,\" and their greeting therein will be, \"Peace.\" And the last of their call will be, \"Praise to Allah, Lord of the worlds!\"",
    "And if Allah was to hasten for the people the evil [they invoke] as He hastens for them the good, their term would have been ended for them. But We leave the ones who do not expect the meeting with Us, in their transgression, wandering blindly",
    "And when affliction touches man, he calls upon Us, whether lying on his side or sitting or standing; but when We remove from him his affliction, he continues [in disobedience] as if he had never called upon Us to [remove] an affliction that touched him. Thus is made pleasing to the transgressors that which they have been doing",
    "And We had already destroyed generations before you when they wronged, and their messengers had come to them with clear proofs, but they were not to believe. Thus do We recompense the criminal people",
    "Then We made you successors in the land after them so that We may observe how you will do.",
    "And when Our verses are recited to them as clear evidences, those who do not expect the meeting with Us say, \"Bring us a Qur'an other than this or change it.\" Say, [O Muhammad], \"It is not for me to change it on my own accord. I only follow what is revealed to me. Indeed I fear, if I should disobey my Lord, the punishment of a tremendous Day.\"",
    "Say, \"If Allah had willed, I would not have recited it to you, nor would He have made it known to you, for I had remained among you a lifetime before it. Then will you not reason?\"",
    "So who is more unjust than he who invents a lie about Allah or denies His signs? Indeed, the criminals will not succeed",
    "And they worship other than Allah that which neither harms them nor benefits them, and they say, \"These are our intercessors with Allah\" Say, \"Do you inform Allah of something He does not know in the heavens or on the earth?\" Exalted is He and high above what they associate with Him",
    "And mankind was not but one community [united in religion], but [then] they differed. And if not for a word that preceded from your Lord, it would have been judged between them [immediately] concerning that over which they differ.",
    "And they say, \"Why is a sign not sent down to him from his Lord?\" So say, \"The unseen is only for Allah [to administer], so wait; indeed, I am with you among those who wait.\"",
    "And when We give the people a taste of mercy after adversity has touched them, at once they conspire against Our verses. Say, \"Allah is swifter in strategy.\" Indeed, Our messengers record that which you conspire",
    "It is He who enables you to travel on land and sea until, when you are in ships and they sail with them by a good wind and they rejoice therein, there comes a storm wind and the waves come upon them from everywhere and they assume that they are surrounded, supplicating Allah, sincere to Him in religion, \"If You should save us from this, we will surely be among the thankful.\"",
    "But when He saves them, at once they commit injustice upon the earth without right. O mankind, your injustice is only against yourselves, [being merely] the enjoyment of worldly life. Then to Us is your return, and We will inform you of what you used to do.",
    "The example of [this] worldly life is but like rain which We have sent down from the sky that the plants of the earth absorb - [those] from which men and livestock eat - until, when the earth has taken on its adornment and is beautified and its people suppose that they have capability over it, there comes to it Our command by night or by day, and We make it as a harvest, as if it had not flourished yesterday. Thus do We explain in detail the signs for a people who give thought.",
    "And Allah invites to the Home of Peace and guides whom He wills to a straight path",
    "For them who have done good is the best [reward] and extra. No darkness will cover their faces, nor humiliation. Those are companions of Paradise; they will abide therein eternally",
    "But they who have earned [blame for] evil doings - the recompense of an evil deed is its equivalent, and humiliation will cover them. They will have from Allah no protector. It will be as if their faces are covered with pieces of the night - so dark [are they]. Those are the companions of the Fire; they will abide therein eternally.",
    "And [mention, O Muhammad], the Day We will gather them all together - then We will say to those who associated others with Allah, \"[Remain in] your place, you and your 'partners.' \" Then We will separate them, and their \"partners\" will say, \"You did not used to worship us,",
    "And sufficient is Allah as a witness between us and you that we were of your worship unaware.\"",
    "There, [on that Day], every soul will be put to trial for what it did previously, and they will be returned to Allah, their master, the Truth, and lost from them is whatever they used to invent.",
    "Say, \"Who provides for you from the heaven and the earth? Or who controls hearing and sight and who brings the living out of the dead and brings the dead out of the living and who arranges [every] matter?\" They will say, \"Allah,\" so say, \"Then will you not fear Him?\"",
    "For that is Allah, your Lord, the Truth. And what can be beyond truth except error? So how are you averted?",
    "Thus the word of your Lord has come into effect upon those who defiantly disobeyed - that they will not believe.",
    "Say, \"Are there of your 'partners' any who begins creation and then repeats it?\" Say, \"Allah begins creation and then repeats it, so how are you deluded?\"",
    "Say, \"Are there of your 'partners' any who guides to the truth?\" Say, \"Allah guides to the truth. So is He who guides to the truth more worthy to be followed or he who guides not unless he is guided? Then what is [wrong] with you - how do you judge?\"",
    "And most of them follow not except assumption. Indeed, assumption avails not against the truth at all. Indeed, Allah is Knowing of what they do.",
    "And it was not [possible] for this Qur'an to be produced by other than Allah, but [it is] a confirmation of what was before it and a detailed explanation of the [former] Scripture, about which there is no doubt, from the Lord of the worlds.",
    "Or do they say [about the Prophet], \"He invented it?\" Say, \"Then bring forth a surah like it and call upon [for assistance] whomever you can besides Allah, if you should be truthful.\"",
    "Rather, they have denied that which they encompass not in knowledge and whose interpretation has not yet come to them. Thus did those before them deny. Then observe how was the end of the wrongdoers.",
    "And of them are those who believe in it, and of them are those who do not believe in it. And your Lord is most knowing of the corrupters",
    "And if they deny you, [O Muhammad], then say, \"For me are my deeds, and for you are your deeds. You are disassociated from what I do, and I am disassociated from what you do.\"",
    "And among them are those who listen to you. But can you cause the deaf to hear, although they will not use reason?",
    "And among them are those who look at you. But can you guide the blind although they will not [attempt to] see?",
    "Indeed, Allah does not wrong the people at all, but it is the people who are wronging themselves.",
    "And on the Day when He will gather them, [it will be] as if they had not remained [in the world] but an hour of the day, [and] they will know each other. Those will have lost who denied the meeting with Allah and were not guided",
    "And whether We show you some of what We promise them, [O Muhammad], or We take you in death, to Us is their return; then, [either way], Allah is a witness concerning what they are doing",
    "And for every nation is a messenger. So when their messenger comes, it will be judged between them in justice, and they will not be wronged",
    "And they say, \"When is [the fulfillment of] this promise, if you should be truthful?\"",
    "Say, \"I possess not for myself any harm or benefit except what Allah should will. For every nation is a [specified] term. When their time has come, then they will not remain behind an hour, nor will they precede [it].\"",
    "Say, \"Have you considered: if His punishment should come to you by night or by day - for which [aspect] of it would the criminals be impatient?\"",
    "Then is it that when it has [actually] occurred you will believe in it? Now? And you were [once] for it impatient",
    "Then it will be said to those who had wronged, \"Taste the punishment of eternity; are you being recompensed except for what you used to earn?\"",
    "And they ask information of you, [O Muhammad], \"Is it true?\" Say, \"Yes, by my Lord. Indeed, it is truth; and you will not cause failure [to Allah].\"",
    "And if each soul that wronged had everything on earth, it would offer it in ransom. And they will confide regret when they see the punishment; and they will be judged in justice, and they will not be wronged",
    "Unquestionably, to Allah belongs whatever is in the heavens and the earth. Unquestionably, the promise of Allah is truth, but most of them do not know",
    "He gives life and causes death, and to Him you will be returned",
    "O mankind, there has to come to you instruction from your Lord and healing for what is in the breasts and guidance and mercy for the believers.",
    "Say, \"In the bounty of Allah and in His mercy - in that let them rejoice; it is better than what they accumulate.\"",
    "Say, \"Have you seen what Allah has sent down to you of provision of which you have made [some] lawful and [some] unlawful?\" Say, \"Has Allah permitted you [to do so], or do you invent [something] about Allah?\"",
    "And what will be the supposition of those who invent falsehood about Allah on the Day of Resurrection? Indeed, Allah is full of bounty to the people, but most of them are not grateful.\"",
    "And, [O Muhammad], you are not [engaged] in any matter or recite any of the Qur'an and you [people] do not do any deed except that We are witness over you when you are involved in it. And not absent from your Lord is any [part] of an atom's weight within the earth or within the heaven or [anything] smaller than that or greater but that it is in a clear register.",
    "Unquestionably, [for] the allies of Allah there will be no fear concerning them, nor will they grieve",
    "Those who believed and were fearing Allah",
    "For them are good tidings in the worldly life and in the Hereafter. No change is there in the words of Allah. That is what is the great attainment.",
    "And let not their speech grieve you. Indeed, honor [due to power] belongs to Allah entirely. He is the Hearing, the Knowing.",
    "Unquestionably, to Allah belongs whoever is in the heavens and whoever is on the earth. And those who invoke other than Allah do not [actually] follow [His] \"partners.\" They follow not except assumption, and they are not but falsifying",
    "It is He who made for you the night to rest therein and the day, giving sight. Indeed in that are signs for a people who listen.",
    "They have said, \"Allah has taken a son.\" Exalted is He; He is the [one] Free of need. To Him belongs whatever is in the heavens and whatever is in the earth. You have no authority for this [claim]. Do you say about Allah that which you do not know?",
    "Say, \"Indeed, those who invent falsehood about Allah will not succeed.\"",
    "[For them is brief] enjoyment in this world; then to Us is their return; then We will make them taste the severe punishment because they used to disbelieve",
    "And recite to them the news of Noah, when he said to his people, \"O my people, if my residence and my reminding of the signs of Allah has become burdensome upon you - then I have relied upon Allah. So resolve upon your plan and [call upon] your associates. Then let not your plan be obscure to you. Then carry it out upon me and do not give me respite.",
    "And if you turn away [from my advice] then no payment have I asked of you. My reward is only from Allah, and I have been commanded to be of the Muslims.\"",
    "And they denied him, so We saved him and those with him in the ship and made them successors, and We drowned those who denied Our signs. Then see how was the end of those who were warned.",
    "Then We sent after him messengers to their peoples, and they came to them with clear proofs. But they were not to believe in that which they had denied before. Thus We seal over the hearts of the transgressors",
    "Then We sent after them Moses and Aaron to Pharaoh and his establishment with Our signs, but they behaved arrogantly and were a criminal people",
    "So when there came to them the truth from Us, they said, \"Indeed, this is obvious magic.\"",
    "Moses said, \"Do you say [thus] about the truth when it has come to you? Is this magic? But magicians will not succeed.\"",
    "They said, \"Have you come to us to turn us away from that upon which we found our fathers and so that you two may have grandeur in the land? And we are not believers in you.\"",
    "And Pharaoh said, \"Bring to me every learned magician.\"",
    "So when the magicians came, Moses said to them, \"Throw down whatever you will throw.\"",
    "And when they had thrown, Moses said, \"What you have brought is [only] magic. Indeed, Allah will expose its worthlessness. Indeed, Allah does not amend the work of corrupters.",
    "And Allah will establish the truth by His words, even if the criminals dislike it.\"",
    "But no one believed Moses, except [some] youths among his people, for fear of Pharaoh and his establishment that they would persecute them. And indeed, Pharaoh was haughty within the land, and indeed, he was of the transgressors",
    "And Moses said, \"O my people, if you have believed in Allah, then rely upon Him, if you should be Muslims.\"",
    "So they said, \"Upon Allah do we rely. Our Lord, make us not [objects of] trial for the wrongdoing people",
    "And save us by Your mercy from the disbelieving people.\"",
    "And We inspired to Moses and his brother, \"Settle your people in Egypt in houses and make your houses [facing the] qiblah and establish prayer and give good tidings to the believers.\"",
    "And Moses said, \"Our Lord, indeed You have given Pharaoh and his establishment splendor and wealth in the worldly life, our Lord, that they may lead [men] astray from Your way. Our Lord, obliterate their wealth and harden their hearts so that they will not believe until they see the painful punishment.\"",
    "[Allah] said, \"Your supplication has been answered.\" So remain on a right course and follow not the way of those who do not know.\"",
    "And We took the Children of Israel across the sea, and Pharaoh and his soldiers pursued them in tyranny and enmity until, when drowning overtook him, he said, \"I believe that there is no deity except that in whom the Children of Israel believe, and I am of the Muslims.\"",
    "Now? And you had disobeyed [Him] before and were of the corrupters?",
    "So today We will save you in body that you may be to those who succeed you a sign. And indeed, many among the people, of Our signs, are heedless",
    "And We had certainty settled the Children of Israel in an agreeable settlement and provided them with good things. And they did not differ until [after] knowledge had come to them. Indeed, your Lord will judge between them on the Day of Resurrection concerning that over which they used to differ",
    "So if you are in doubt, [O Muhammad], about that which We have revealed to you, then ask those who have been reading the Scripture before you. The truth has certainly come to you from your Lord, so never be among the doubters.",
    "And never be of those who deny the signs of Allah and [thus] be among the losers.",
    "Indeed, those upon whom the word of your Lord has come into effect will not believe,",
    "Even if every sign should come to them, until they see the painful punishment.",
    "Then has there not been a [single] city that believed so its faith benefited it except the people of Jonah? When they believed, We removed from them the punishment of disgrace in worldly life and gave them enjoyment for a time.",
    "And had your Lord willed, those on earth would have believed - all of them entirely. Then, [O Muhammad], would you compel the people in order that they become believers?",
    "And it is not for a soul to believe except by permission of Allah, and He will place defilement upon those who will not use reason.",
    "Say, \"Observe what is in the heavens and earth.\" But of no avail will be signs or warners to a people who do not believe",
    "So do they wait except for like [what occurred in] the days of those who passed on before them? Say, \"Then wait; indeed, I am with you among those who wait.\"",
    "Then We will save our messengers and those who have believed. Thus, it is an obligation upon Us that We save the believers",
    "Say, [O Muhammad], \"O people, if you are in doubt as to my religion - then I do not worship those which you worship besides Allah; but I worship Allah, who causes your death. And I have been commanded to be of the believers",
    "And [commanded], 'Direct your face toward the religion, inclining to truth, and never be of those who associate others with Allah;",
    "And do not invoke besides Allah that which neither benefits you nor harms you, for if you did, then indeed you would be of the wrongdoers.'\"",
    "And if Allah should touch you with adversity, there is no remover of it except Him; and if He intends for you good, then there is no repeller of His bounty. He causes it to reach whom He wills of His servants. And He is the Forgiving, the Merciful",
    "Say, \"O mankind, the truth has come to you from your Lord, so whoever is guided is only guided for [the benefit of] his soul, and whoever goes astray only goes astray [in violation] against it. And I am not over you a manager.\"",
    "And follow what is revealed to you, [O Muhammad], and be patient until Allah will judge. And He is the best of judges.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yunus);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_yunus);
        adapter = new Al_Fatihah_Adapter(verses, arabic_verses, sahih_international, english_verses);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        mediaPlayer = new MediaPlayer();
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.setRewardedVideoAdListener(this);
        loadAd();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.play_arrow_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mAd.isLoaded()) {
            mAd.show();
        }

        try {
            mediaPlayer.setDataSource(URL1);
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer1) {
                    // mediaPlayer1.start();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.onOptionsItemSelected(item);
    }

    private void loadAd(){
        if(!mAd.isLoaded()) {
            mAd.loadAd("ca-app-pub-7711850653949753/1893084642", new AdRequest.Builder().build());
        }
    }

    @Override
    public void onRewardedVideoAdLoaded() {

        Toast.makeText(this, "Click the Play button and watch the Ad until the end to listen to the audio", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

        mediaPlayer.start();

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

}
