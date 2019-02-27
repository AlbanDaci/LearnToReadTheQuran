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

public class At_Tawbah extends AppCompatActivity implements RewardedVideoAdListener {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private String URL1 = "https://www.al-hamdoulillah.com/coran/mp3/files/mohammed-siddiq-minshawi/009.mp3";
    private MediaPlayer mediaPlayer;
    private RewardedVideoAd mAd;

    String [] verses = {"9:1", "9:2", "9:3", "9:4", "9:5", "9:6", "9:7", "9:8", "9:9", "9:10", "9:11", "9:12", "9:13", "9:14", "9:15", "9:16",
            "9:17", "9:18", "9:19", "9:20", "9:21", "9:22", "9:23", "9:24", "9:25", "9:26", "9:27", "9:28", "9:29", "9:30", "9:31", "9:32",
            "9:33", "9:34", "9:35", "9:36", "9:37", "9:38", "9:39", "9:40", "9:41", "9:42", "9:43", "9:44", "9:45", "9:46", "9:47", "9:48",
            "9:49", "9:50", "9:51", "9:52", "9:53", "9:54", "9:55", "9:56", "9:57", "9:58", "9:59", "9:60", "9:61", "9:62", "9:63", "9:64",
            "9:65", "9:66", "9:67", "9:68", "9:69", "9:70", "9:71", "9:72", "9:73", "9:74", "9:75", "9:76", "9:77", "9:78", "9:79", "9:80",
            "9:81", "9:82", "9:83", "9:84", "9:85", "9:86", "9:87", "9:88", "9:89", "9:90", "9:91", "9:92", "9:93", "9:94", "9:95", "9:96",
            "9:97", "9:98", "9:99", "9:100", "9:101", "9:102", "9:103", "9:104", "9:105", "9:106", "9:107", "9:108", "9:109", "9:110", "9:111", "9:112",
            "9:113", "9:114", "9:115", "9:116", "9:117", "9:118", "9:119", "9:120", "9:121", "9:122", "9:123", "9:124", "9:125", "9:126", "9:127", "9:128",
            "9:129", ""};

    String [] arabic_verses = {"بَرَاءَةٌ مِّنَ اللَّهِ وَرَسُولِهِ إِلَى الَّذِينَ عَاهَدتُّم مِّنَ الْمُشْرِكِينَ",
    "فَسِيحُوا فِي الْأَرْضِ أَرْبَعَةَ أَشْهُرٍ وَاعْلَمُوا أَنَّكُمْ غَيْرُ مُعْجِزِي اللَّهِ ۙ وَأَنَّ اللَّهَ مُخْزِي الْكَافِرِينَ",
    "وَأَذَانٌ مِّنَ اللَّهِ وَرَسُولِهِ إِلَى النَّاسِ يَوْمَ الْحَجِّ الْأَكْبَرِ أَنَّ اللَّهَ بَرِيءٌ مِّنَ الْمُشْرِكِينَ ۙ وَرَسُولُهُ ۚ فَإِن تُبْتُمْ فَهُوَ خَيْرٌ لَّكُمْ ۖ وَإِن تَوَلَّيْتُمْ فَاعْلَمُوا أَنَّكُمْ غَيْرُ مُعْجِزِي اللَّهِ ۗ وَبَشِّرِ الَّذِينَ كَفَرُوا بِعَذَابٍ أَلِيمٍ",
    "إِلَّا الَّذِينَ عَاهَدتُّم مِّنَ الْمُشْرِكِينَ ثُمَّ لَمْ يَنقُصُوكُمْ شَيْئًا وَلَمْ يُظَاهِرُوا عَلَيْكُمْ أَحَدًا فَأَتِمُّوا إِلَيْهِمْ عَهْدَهُمْ إِلَىٰ مُدَّتِهِمْ ۚ إِنَّ اللَّهَ يُحِبُّ الْمُتَّقِينَ",
    "فَإِذَا انسَلَخَ الْأَشْهُرُ الْحُرُمُ فَاقْتُلُوا الْمُشْرِكِينَ حَيْثُ وَجَدتُّمُوهُمْ وَخُذُوهُمْ وَاحْصُرُوهُمْ وَاقْعُدُوا لَهُمْ كُلَّ مَرْصَدٍ ۚ فَإِن تَابُوا وَأَقَامُوا الصَّلَاةَ وَآتَوُا الزَّكَاةَ فَخَلُّوا سَبِيلَهُمْ ۚ إِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ",
    "وَإِنْ أَحَدٌ مِّنَ الْمُشْرِكِينَ اسْتَجَارَكَ فَأَجِرْهُ حَتَّىٰ يَسْمَعَ كَلَامَ اللَّهِ ثُمَّ أَبْلِغْهُ مَأْمَنَهُ ۚ ذَٰلِكَ بِأَنَّهُمْ قَوْمٌ لَّا يَعْلَمُونَ",
    "كَيْفَ يَكُونُ لِلْمُشْرِكِينَ عَهْدٌ عِندَ اللَّهِ وَعِندَ رَسُولِهِ إِلَّا الَّذِينَ عَاهَدتُّمْ عِندَ الْمَسْجِدِ الْحَرَامِ ۖ فَمَا اسْتَقَامُوا لَكُمْ فَاسْتَقِيمُوا لَهُمْ ۚ إِنَّ اللَّهَ يُحِبُّ الْمُتَّقِينَ",
    "كَيْفَ وَإِن يَظْهَرُوا عَلَيْكُمْ لَا يَرْقُبُوا فِيكُمْ إِلًّا وَلَا ذِمَّةً ۚ يُرْضُونَكُم بِأَفْوَاهِهِمْ وَتَأْبَىٰ قُلُوبُهُمْ وَأَكْثَرُهُمْ فَاسِقُونَ",
    "اشْتَرَوْا بِآيَاتِ اللَّهِ ثَمَنًا قَلِيلًا فَصَدُّوا عَن سَبِيلِهِ ۚ إِنَّهُمْ سَاءَ مَا كَانُوا يَعْمَلُونَ",
    "لَا يَرْقُبُونَ فِي مُؤْمِنٍ إِلًّا وَلَا ذِمَّةً ۚ وَأُولَٰئِكَ هُمُ الْمُعْتَدُونَ",
    "فَإِن تَابُوا وَأَقَامُوا الصَّلَاةَ وَآتَوُا الزَّكَاةَ فَإِخْوَانُكُمْ فِي الدِّينِ ۗ وَنُفَصِّلُ الْآيَاتِ لِقَوْمٍ يَعْلَمُونَ",
    "وَإِن نَّكَثُوا أَيْمَانَهُم مِّن بَعْدِ عَهْدِهِمْ وَطَعَنُوا فِي دِينِكُمْ فَقَاتِلُوا أَئِمَّةَ الْكُفْرِ ۙ إِنَّهُمْ لَا أَيْمَانَ لَهُمْ لَعَلَّهُمْ يَنتَهُونَ",
    "أَلَا تُقَاتِلُونَ قَوْمًا نَّكَثُوا أَيْمَانَهُمْ وَهَمُّوا بِإِخْرَاجِ الرَّسُولِ وَهُم بَدَءُوكُمْ أَوَّلَ مَرَّةٍ ۚ أَتَخْشَوْنَهُمْ ۚ فَاللَّهُ أَحَقُّ أَن تَخْشَوْهُ إِن كُنتُم مُّؤْمِنِينَ",
    "قَاتِلُوهُمْ يُعَذِّبْهُمُ اللَّهُ بِأَيْدِيكُمْ وَيُخْزِهِمْ وَيَنصُرْكُمْ عَلَيْهِمْ وَيَشْفِ صُدُورَ قَوْمٍ مُّؤْمِنِينَ",
    "وَيُذْهِبْ غَيْظَ قُلُوبِهِمْ ۗ وَيَتُوبُ اللَّهُ عَلَىٰ مَن يَشَاءُ ۗ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "أَمْ حَسِبْتُمْ أَن تُتْرَكُوا وَلَمَّا يَعْلَمِ اللَّهُ الَّذِينَ جَاهَدُوا مِنكُمْ وَلَمْ يَتَّخِذُوا مِن دُونِ اللَّهِ وَلَا رَسُولِهِ وَلَا الْمُؤْمِنِينَ وَلِيجَةً ۚ وَاللَّهُ خَبِيرٌ بِمَا تَعْمَلُونَ",
    "مَا كَانَ لِلْمُشْرِكِينَ أَن يَعْمُرُوا مَسَاجِدَ اللَّهِ شَاهِدِينَ عَلَىٰ أَنفُسِهِم بِالْكُفْرِ ۚ أُولَٰئِكَ حَبِطَتْ أَعْمَالُهُمْ وَفِي النَّارِ هُمْ خَالِدُونَ",
    "إِنَّمَا يَعْمُرُ مَسَاجِدَ اللَّهِ مَنْ آمَنَ بِاللَّهِ وَالْيَوْمِ الْآخِرِ وَأَقَامَ الصَّلَاةَ وَآتَى الزَّكَاةَ وَلَمْ يَخْشَ إِلَّا اللَّهَ ۖ فَعَسَىٰ أُولَٰئِكَ أَن يَكُونُوا مِنَ الْمُهْتَدِينَ",
    "أَجَعَلْتُمْ سِقَايَةَ الْحَاجِّ وَعِمَارَةَ الْمَسْجِدِ الْحَرَامِ كَمَنْ آمَنَ بِاللَّهِ وَالْيَوْمِ الْآخِرِ وَجَاهَدَ فِي سَبِيلِ اللَّهِ ۚ لَا يَسْتَوُونَ عِندَ اللَّهِ ۗ وَاللَّهُ لَا يَهْدِي الْقَوْمَ الظَّالِمِينَ",
    "الَّذِينَ آمَنُوا وَهَاجَرُوا وَجَاهَدُوا فِي سَبِيلِ اللَّهِ بِأَمْوَالِهِمْ وَأَنفُسِهِمْ أَعْظَمُ دَرَجَةً عِندَ اللَّهِ ۚ وَأُولَٰئِكَ هُمُ الْفَائِزُونَ",
    "يُبَشِّرُهُمْ رَبُّهُم بِرَحْمَةٍ مِّنْهُ وَرِضْوَانٍ وَجَنَّاتٍ لَّهُمْ فِيهَا نَعِيمٌ مُّقِيمٌ",
    "خَالِدِينَ فِيهَا أَبَدًا ۚ إِنَّ اللَّهَ عِندَهُ أَجْرٌ عَظِيمٌ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تَتَّخِذُوا آبَاءَكُمْ وَإِخْوَانَكُمْ أَوْلِيَاءَ إِنِ اسْتَحَبُّوا الْكُفْرَ عَلَى الْإِيمَانِ ۚ وَمَن يَتَوَلَّهُم مِّنكُمْ فَأُولَٰئِكَ هُمُ الظَّالِمُونَ",
    "قُلْ إِن كَانَ آبَاؤُكُمْ وَأَبْنَاؤُكُمْ وَإِخْوَانُكُمْ وَأَزْوَاجُكُمْ وَعَشِيرَتُكُمْ وَأَمْوَالٌ اقْتَرَفْتُمُوهَا وَتِجَارَةٌ تَخْشَوْنَ كَسَادَهَا وَمَسَاكِنُ تَرْضَوْنَهَا أَحَبَّ إِلَيْكُم مِّنَ اللَّهِ وَرَسُولِهِ وَجِهَادٍ فِي سَبِيلِهِ فَتَرَبَّصُوا حَتَّىٰ يَأْتِيَ اللَّهُ بِأَمْرِهِ ۗ وَاللَّهُ لَا يَهْدِي الْقَوْمَ الْفَاسِقِينَ",
    "لَقَدْ نَصَرَكُمُ اللَّهُ فِي مَوَاطِنَ كَثِيرَةٍ ۙ وَيَوْمَ حُنَيْنٍ ۙ إِذْ أَعْجَبَتْكُمْ كَثْرَتُكُمْ فَلَمْ تُغْنِ عَنكُمْ شَيْئًا وَضَاقَتْ عَلَيْكُمُ الْأَرْضُ بِمَا رَحُبَتْ ثُمَّ وَلَّيْتُم مُّدْبِرِينَ",
    "ثُمَّ أَنزَلَ اللَّهُ سَكِينَتَهُ عَلَىٰ رَسُولِهِ وَعَلَى الْمُؤْمِنِينَ وَأَنزَلَ جُنُودًا لَّمْ تَرَوْهَا وَعَذَّبَ الَّذِينَ كَفَرُوا ۚ وَذَٰلِكَ جَزَاءُ الْكَافِرِينَ",
    "ثُمَّ يَتُوبُ اللَّهُ مِن بَعْدِ ذَٰلِكَ عَلَىٰ مَن يَشَاءُ ۗ وَاللَّهُ غَفُورٌ رَّحِيمٌ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِنَّمَا الْمُشْرِكُونَ نَجَسٌ فَلَا يَقْرَبُوا الْمَسْجِدَ الْحَرَامَ بَعْدَ عَامِهِمْ هَٰذَا ۚ وَإِنْ خِفْتُمْ عَيْلَةً فَسَوْفَ يُغْنِيكُمُ اللَّهُ مِن فَضْلِهِ إِن شَاءَ ۚ إِنَّ اللَّهَ عَلِيمٌ حَكِيمٌ",
    "قَاتِلُوا الَّذِينَ لَا يُؤْمِنُونَ بِاللَّهِ وَلَا بِالْيَوْمِ الْآخِرِ وَلَا يُحَرِّمُونَ مَا حَرَّمَ اللَّهُ وَرَسُولُهُ وَلَا يَدِينُونَ دِينَ الْحَقِّ مِنَ الَّذِينَ أُوتُوا الْكِتَابَ حَتَّىٰ يُعْطُوا الْجِزْيَةَ عَن يَدٍ وَهُمْ صَاغِرُونَ",
    "وَقَالَتِ الْيَهُودُ عُزَيْرٌ ابْنُ اللَّهِ وَقَالَتِ النَّصَارَى الْمَسِيحُ ابْنُ اللَّهِ ۖ ذَٰلِكَ قَوْلُهُم بِأَفْوَاهِهِمْ ۖ يُضَاهِئُونَ قَوْلَ الَّذِينَ كَفَرُوا مِن قَبْلُ ۚ قَاتَلَهُمُ اللَّهُ ۚ أَنَّىٰ يُؤْفَكُونَ",
    "اتَّخَذُوا أَحْبَارَهُمْ وَرُهْبَانَهُمْ أَرْبَابًا مِّن دُونِ اللَّهِ وَالْمَسِيحَ ابْنَ مَرْيَمَ وَمَا أُمِرُوا إِلَّا لِيَعْبُدُوا إِلَٰهًا وَاحِدًا ۖ لَّا إِلَٰهَ إِلَّا هُوَ ۚ سُبْحَانَهُ عَمَّا يُشْرِكُونَ",
    "يُرِيدُونَ أَن يُطْفِئُوا نُورَ اللَّهِ بِأَفْوَاهِهِمْ وَيَأْبَى اللَّهُ إِلَّا أَن يُتِمَّ نُورَهُ وَلَوْ كَرِهَ الْكَافِرُونَ",
    "هُوَ الَّذِي أَرْسَلَ رَسُولَهُ بِالْهُدَىٰ وَدِينِ الْحَقِّ لِيُظْهِرَهُ عَلَى الدِّينِ كُلِّهِ وَلَوْ كَرِهَ الْمُشْرِكُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِنَّ كَثِيرًا مِّنَ الْأَحْبَارِ وَالرُّهْبَانِ لَيَأْكُلُونَ أَمْوَالَ النَّاسِ بِالْبَاطِلِ وَيَصُدُّونَ عَن سَبِيلِ اللَّهِ ۗ وَالَّذِينَ يَكْنِزُونَ الذَّهَبَ وَالْفِضَّةَ وَلَا يُنفِقُونَهَا فِي سَبِيلِ اللَّهِ فَبَشِّرْهُم بِعَذَابٍ أَلِيمٍ",
    "يَوْمَ يُحْمَىٰ عَلَيْهَا فِي نَارِ جَهَنَّمَ فَتُكْوَىٰ بِهَا جِبَاهُهُمْ وَجُنُوبُهُمْ وَظُهُورُهُمْ ۖ هَٰذَا مَا كَنَزْتُمْ لِأَنفُسِكُمْ فَذُوقُوا مَا كُنتُمْ تَكْنِزُونَ",
    "إِنَّ عِدَّةَ الشُّهُورِ عِندَ اللَّهِ اثْنَا عَشَرَ شَهْرًا فِي كِتَابِ اللَّهِ يَوْمَ خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ مِنْهَا أَرْبَعَةٌ حُرُمٌ ۚ ذَٰلِكَ الدِّينُ الْقَيِّمُ ۚ فَلَا تَظْلِمُوا فِيهِنَّ أَنفُسَكُمْ ۚ وَقَاتِلُوا الْمُشْرِكِينَ كَافَّةً كَمَا يُقَاتِلُونَكُمْ كَافَّةً ۚ وَاعْلَمُوا أَنَّ اللَّهَ مَعَ الْمُتَّقِينَ",
    "إِنَّمَا النَّسِيءُ زِيَادَةٌ فِي الْكُفْرِ ۖ يُضَلُّ بِهِ الَّذِينَ كَفَرُوا يُحِلُّونَهُ عَامًا وَيُحَرِّمُونَهُ عَامًا لِّيُوَاطِئُوا عِدَّةَ مَا حَرَّمَ اللَّهُ فَيُحِلُّوا مَا حَرَّمَ اللَّهُ ۚ زُيِّنَ لَهُمْ سُوءُ أَعْمَالِهِمْ ۗ وَاللَّهُ لَا يَهْدِي الْقَوْمَ الْكَافِرِينَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا مَا لَكُمْ إِذَا قِيلَ لَكُمُ انفِرُوا فِي سَبِيلِ اللَّهِ اثَّاقَلْتُمْ إِلَى الْأَرْضِ ۚ أَرَضِيتُم بِالْحَيَاةِ الدُّنْيَا مِنَ الْآخِرَةِ ۚ فَمَا مَتَاعُ الْحَيَاةِ الدُّنْيَا فِي الْآخِرَةِ إِلَّا قَلِيلٌ",
    "إِلَّا تَنفِرُوا يُعَذِّبْكُمْ عَذَابًا أَلِيمًا وَيَسْتَبْدِلْ قَوْمًا غَيْرَكُمْ وَلَا تَضُرُّوهُ شَيْئًا ۗ وَاللَّهُ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "إِلَّا تَنصُرُوهُ فَقَدْ نَصَرَهُ اللَّهُ إِذْ أَخْرَجَهُ الَّذِينَ كَفَرُوا ثَانِيَ اثْنَيْنِ إِذْ هُمَا فِي الْغَارِ إِذْ يَقُولُ لِصَاحِبِهِ لَا تَحْزَنْ إِنَّ اللَّهَ مَعَنَا ۖ فَأَنزَلَ اللَّهُ سَكِينَتَهُ عَلَيْهِ وَأَيَّدَهُ بِجُنُودٍ لَّمْ تَرَوْهَا وَجَعَلَ كَلِمَةَ الَّذِينَ كَفَرُوا السُّفْلَىٰ ۗ وَكَلِمَةُ اللَّهِ هِيَ الْعُلْيَا ۗ وَاللَّهُ عَزِيزٌ حَكِيمٌ",
    "انفِرُوا خِفَافًا وَثِقَالًا وَجَاهِدُوا بِأَمْوَالِكُمْ وَأَنفُسِكُمْ فِي سَبِيلِ اللَّهِ ۚ ذَٰلِكُمْ خَيْرٌ لَّكُمْ إِن كُنتُمْ تَعْلَمُونَ",
    "لَوْ كَانَ عَرَضًا قَرِيبًا وَسَفَرًا قَاصِدًا لَّاتَّبَعُوكَ وَلَٰكِن بَعُدَتْ عَلَيْهِمُ الشُّقَّةُ ۚ وَسَيَحْلِفُونَ بِاللَّهِ لَوِ اسْتَطَعْنَا لَخَرَجْنَا مَعَكُمْ يُهْلِكُونَ أَنفُسَهُمْ وَاللَّهُ يَعْلَمُ إِنَّهُمْ لَكَاذِبُونَ",
    "عَفَا اللَّهُ عَنكَ لِمَ أَذِنتَ لَهُمْ حَتَّىٰ يَتَبَيَّنَ لَكَ الَّذِينَ صَدَقُوا وَتَعْلَمَ الْكَاذِبِينَ",
    "لَا يَسْتَأْذِنُكَ الَّذِينَ يُؤْمِنُونَ بِاللَّهِ وَالْيَوْمِ الْآخِرِ أَن يُجَاهِدُوا بِأَمْوَالِهِمْ وَأَنفُسِهِمْ ۗ وَاللَّهُ عَلِيمٌ بِالْمُتَّقِينَ",
    "إِنَّمَا يَسْتَأْذِنُكَ الَّذِينَ لَا يُؤْمِنُونَ بِاللَّهِ وَالْيَوْمِ الْآخِرِ وَارْتَابَتْ قُلُوبُهُمْ فَهُمْ فِي رَيْبِهِمْ يَتَرَدَّدُونَ",
    "وَلَوْ أَرَادُوا الْخُرُوجَ لَأَعَدُّوا لَهُ عُدَّةً وَلَٰكِن كَرِهَ اللَّهُ انبِعَاثَهُمْ فَثَبَّطَهُمْ وَقِيلَ اقْعُدُوا مَعَ الْقَاعِدِينَ",
    "لَوْ خَرَجُوا فِيكُم مَّا زَادُوكُمْ إِلَّا خَبَالًا وَلَأَوْضَعُوا خِلَالَكُمْ يَبْغُونَكُمُ الْفِتْنَةَ وَفِيكُمْ سَمَّاعُونَ لَهُمْ ۗ وَاللَّهُ عَلِيمٌ بِالظَّالِمِينَ",
    "لَقَدِ ابْتَغَوُا الْفِتْنَةَ مِن قَبْلُ وَقَلَّبُوا لَكَ الْأُمُورَ حَتَّىٰ جَاءَ الْحَقُّ وَظَهَرَ أَمْرُ اللَّهِ وَهُمْ كَارِهُونَ",
    "وَمِنْهُم مَّن يَقُولُ ائْذَن لِّي وَلَا تَفْتِنِّي ۚ أَلَا فِي الْفِتْنَةِ سَقَطُوا ۗ وَإِنَّ جَهَنَّمَ لَمُحِيطَةٌ بِالْكَافِرِينَ",
    "إِن تُصِبْكَ حَسَنَةٌ تَسُؤْهُمْ ۖ وَإِن تُصِبْكَ مُصِيبَةٌ يَقُولُوا قَدْ أَخَذْنَا أَمْرَنَا مِن قَبْلُ وَيَتَوَلَّوا وَّهُمْ فَرِحُونَ",
    "قُل لَّن يُصِيبَنَا إِلَّا مَا كَتَبَ اللَّهُ لَنَا هُوَ مَوْلَانَا ۚ وَعَلَى اللَّهِ فَلْيَتَوَكَّلِ الْمُؤْمِنُونَ",
    "قُلْ هَلْ تَرَبَّصُونَ بِنَا إِلَّا إِحْدَى الْحُسْنَيَيْنِ ۖ وَنَحْنُ نَتَرَبَّصُ بِكُمْ أَن يُصِيبَكُمُ اللَّهُ بِعَذَابٍ مِّنْ عِندِهِ أَوْ بِأَيْدِينَا ۖ فَتَرَبَّصُوا إِنَّا مَعَكُم مُّتَرَبِّصُونَ",
    "قُلْ أَنفِقُوا طَوْعًا أَوْ كَرْهًا لَّن يُتَقَبَّلَ مِنكُمْ ۖ إِنَّكُمْ كُنتُمْ قَوْمًا فَاسِقِينَ",
    "وَمَا مَنَعَهُمْ أَن تُقْبَلَ مِنْهُمْ نَفَقَاتُهُمْ إِلَّا أَنَّهُمْ كَفَرُوا بِاللَّهِ وَبِرَسُولِهِ وَلَا يَأْتُونَ الصَّلَاةَ إِلَّا وَهُمْ كُسَالَىٰ وَلَا يُنفِقُونَ إِلَّا وَهُمْ كَارِهُونَ",
    "فَلَا تُعْجِبْكَ أَمْوَالُهُمْ وَلَا أَوْلَادُهُمْ ۚ إِنَّمَا يُرِيدُ اللَّهُ لِيُعَذِّبَهُم بِهَا فِي الْحَيَاةِ الدُّنْيَا وَتَزْهَقَ أَنفُسُهُمْ وَهُمْ كَافِرُونَ",
    "وَيَحْلِفُونَ بِاللَّهِ إِنَّهُمْ لَمِنكُمْ وَمَا هُم مِّنكُمْ وَلَٰكِنَّهُمْ قَوْمٌ يَفْرَقُونَ",
    "لَوْ يَجِدُونَ مَلْجَأً أَوْ مَغَارَاتٍ أَوْ مُدَّخَلًا لَّوَلَّوْا إِلَيْهِ وَهُمْ يَجْمَحُونَ",
    "وَمِنْهُم مَّن يَلْمِزُكَ فِي الصَّدَقَاتِ فَإِنْ أُعْطُوا مِنْهَا رَضُوا وَإِن لَّمْ يُعْطَوْا مِنْهَا إِذَا هُمْ يَسْخَطُونَ",
    "وَلَوْ أَنَّهُمْ رَضُوا مَا آتَاهُمُ اللَّهُ وَرَسُولُهُ وَقَالُوا حَسْبُنَا اللَّهُ سَيُؤْتِينَا اللَّهُ مِن فَضْلِهِ وَرَسُولُهُ إِنَّا إِلَى اللَّهِ رَاغِبُونَ",
    "إِنَّمَا الصَّدَقَاتُ لِلْفُقَرَاءِ وَالْمَسَاكِينِ وَالْعَامِلِينَ عَلَيْهَا وَالْمُؤَلَّفَةِ قُلُوبُهُمْ وَفِي الرِّقَابِ وَالْغَارِمِينَ وَفِي سَبِيلِ اللَّهِ وَابْنِ السَّبِيلِ ۖ فَرِيضَةً مِّنَ اللَّهِ ۗ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "وَمِنْهُمُ الَّذِينَ يُؤْذُونَ النَّبِيَّ وَيَقُولُونَ هُوَ أُذُنٌ ۚ قُلْ أُذُنُ خَيْرٍ لَّكُمْ يُؤْمِنُ بِاللَّهِ وَيُؤْمِنُ لِلْمُؤْمِنِينَ وَرَحْمَةٌ لِّلَّذِينَ آمَنُوا مِنكُمْ ۚ وَالَّذِينَ يُؤْذُونَ رَسُولَ اللَّهِ لَهُمْ عَذَابٌ أَلِيمٌ",
    "يَحْلِفُونَ بِاللَّهِ لَكُمْ لِيُرْضُوكُمْ وَاللَّهُ وَرَسُولُهُ أَحَقُّ أَن يُرْضُوهُ إِن كَانُوا مُؤْمِنِينَ",
    "أَلَمْ يَعْلَمُوا أَنَّهُ مَن يُحَادِدِ اللَّهَ وَرَسُولَهُ فَأَنَّ لَهُ نَارَ جَهَنَّمَ خَالِدًا فِيهَا ۚ ذَٰلِكَ الْخِزْيُ الْعَظِيمُ",
    "يَحْذَرُ الْمُنَافِقُونَ أَن تُنَزَّلَ عَلَيْهِمْ سُورَةٌ تُنَبِّئُهُم بِمَا فِي قُلُوبِهِمْ ۚ قُلِ اسْتَهْزِئُوا إِنَّ اللَّهَ مُخْرِجٌ مَّا تَحْذَرُونَ",
    "وَلَئِن سَأَلْتَهُمْ لَيَقُولُنَّ إِنَّمَا كُنَّا نَخُوضُ وَنَلْعَبُ ۚ قُلْ أَبِاللَّهِ وَآيَاتِهِ وَرَسُولِهِ كُنتُمْ تَسْتَهْزِئُونَ",
    "لَا تَعْتَذِرُوا قَدْ كَفَرْتُم بَعْدَ إِيمَانِكُمْ ۚ إِن نَّعْفُ عَن طَائِفَةٍ مِّنكُمْ نُعَذِّبْ طَائِفَةً بِأَنَّهُمْ كَانُوا مُجْرِمِينَ",
    "الْمُنَافِقُونَ وَالْمُنَافِقَاتُ بَعْضُهُم مِّن بَعْضٍ ۚ يَأْمُرُونَ بِالْمُنكَرِ وَيَنْهَوْنَ عَنِ الْمَعْرُوفِ وَيَقْبِضُونَ أَيْدِيَهُمْ ۚ نَسُوا اللَّهَ فَنَسِيَهُمْ ۗ إِنَّ الْمُنَافِقِينَ هُمُ الْفَاسِقُونَ",
    "وَعَدَ اللَّهُ الْمُنَافِقِينَ وَالْمُنَافِقَاتِ وَالْكُفَّارَ نَارَ جَهَنَّمَ خَالِدِينَ فِيهَا ۚ هِيَ حَسْبُهُمْ ۚ وَلَعَنَهُمُ اللَّهُ ۖ وَلَهُمْ عَذَابٌ مُّقِيمٌ",
    "كَالَّذِينَ مِن قَبْلِكُمْ كَانُوا أَشَدَّ مِنكُمْ قُوَّةً وَأَكْثَرَ أَمْوَالًا وَأَوْلَادًا فَاسْتَمْتَعُوا بِخَلَاقِهِمْ فَاسْتَمْتَعْتُم بِخَلَاقِكُمْ كَمَا اسْتَمْتَعَ الَّذِينَ مِن قَبْلِكُم بِخَلَاقِهِمْ وَخُضْتُمْ كَالَّذِي خَاضُوا ۚ أُولَٰئِكَ حَبِطَتْ أَعْمَالُهُمْ فِي الدُّنْيَا وَالْآخِرَةِ ۖ وَأُولَٰئِكَ هُمُ الْخَاسِرُونَ",
    "أَلَمْ يَأْتِهِمْ نَبَأُ الَّذِينَ مِن قَبْلِهِمْ قَوْمِ نُوحٍ وَعَادٍ وَثَمُودَ وَقَوْمِ إِبْرَاهِيمَ وَأَصْحَابِ مَدْيَنَ وَالْمُؤْتَفِكَاتِ ۚ أَتَتْهُمْ رُسُلُهُم بِالْبَيِّنَاتِ ۖ فَمَا كَانَ اللَّهُ لِيَظْلِمَهُمْ وَلَٰكِن كَانُوا أَنفُسَهُمْ يَظْلِمُونَ",
    "وَالْمُؤْمِنُونَ وَالْمُؤْمِنَاتُ بَعْضُهُمْ أَوْلِيَاءُ بَعْضٍ ۚ يَأْمُرُونَ بِالْمَعْرُوفِ وَيَنْهَوْنَ عَنِ الْمُنكَرِ وَيُقِيمُونَ الصَّلَاةَ وَيُؤْتُونَ الزَّكَاةَ وَيُطِيعُونَ اللَّهَ وَرَسُولَهُ ۚ أُولَٰئِكَ سَيَرْحَمُهُمُ اللَّهُ ۗ إِنَّ اللَّهَ عَزِيزٌ حَكِيمٌ",
    "وَعَدَ اللَّهُ الْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا وَمَسَاكِنَ طَيِّبَةً فِي جَنَّاتِ عَدْنٍ ۚ وَرِضْوَانٌ مِّنَ اللَّهِ أَكْبَرُ ۚ ذَٰلِكَ هُوَ الْفَوْزُ الْعَظِيمُ",
    "يَا أَيُّهَا النَّبِيُّ جَاهِدِ الْكُفَّارَ وَالْمُنَافِقِينَ وَاغْلُظْ عَلَيْهِمْ ۚ وَمَأْوَاهُمْ جَهَنَّمُ ۖ وَبِئْسَ الْمَصِيرُ",
    "يَحْلِفُونَ بِاللَّهِ مَا قَالُوا وَلَقَدْ قَالُوا كَلِمَةَ الْكُفْرِ وَكَفَرُوا بَعْدَ إِسْلَامِهِمْ وَهَمُّوا بِمَا لَمْ يَنَالُوا ۚ وَمَا نَقَمُوا إِلَّا أَنْ أَغْنَاهُمُ اللَّهُ وَرَسُولُهُ مِن فَضْلِهِ ۚ فَإِن يَتُوبُوا يَكُ خَيْرًا لَّهُمْ ۖ وَإِن يَتَوَلَّوْا يُعَذِّبْهُمُ اللَّهُ عَذَابًا أَلِيمًا فِي الدُّنْيَا وَالْآخِرَةِ ۚ وَمَا لَهُمْ فِي الْأَرْضِ مِن وَلِيٍّ وَلَا نَصِيرٍ",
    "وَمِنْهُم مَّنْ عَاهَدَ اللَّهَ لَئِنْ آتَانَا مِن فَضْلِهِ لَنَصَّدَّقَنَّ وَلَنَكُونَنَّ مِنَ الصَّالِحِينَ",
    "فَلَمَّا آتَاهُم مِّن فَضْلِهِ بَخِلُوا بِهِ وَتَوَلَّوا وَّهُم مُّعْرِضُونَ",
    "فَأَعْقَبَهُمْ نِفَاقًا فِي قُلُوبِهِمْ إِلَىٰ يَوْمِ يَلْقَوْنَهُ بِمَا أَخْلَفُوا اللَّهَ مَا وَعَدُوهُ وَبِمَا كَانُوا يَكْذِبُونَ",
    "أَلَمْ يَعْلَمُوا أَنَّ اللَّهَ يَعْلَمُ سِرَّهُمْ وَنَجْوَاهُمْ وَأَنَّ اللَّهَ عَلَّامُ الْغُيُوبِ",
    "الَّذِينَ يَلْمِزُونَ الْمُطَّوِّعِينَ مِنَ الْمُؤْمِنِينَ فِي الصَّدَقَاتِ وَالَّذِينَ لَا يَجِدُونَ إِلَّا جُهْدَهُمْ فَيَسْخَرُونَ مِنْهُمْ ۙ سَخِرَ اللَّهُ مِنْهُمْ وَلَهُمْ عَذَابٌ أَلِيمٌ",
    "اسْتَغْفِرْ لَهُمْ أَوْ لَا تَسْتَغْفِرْ لَهُمْ إِن تَسْتَغْفِرْ لَهُمْ سَبْعِينَ مَرَّةً فَلَن يَغْفِرَ اللَّهُ لَهُمْ ۚ ذَٰلِكَ بِأَنَّهُمْ كَفَرُوا بِاللَّهِ وَرَسُولِهِ ۗ وَاللَّهُ لَا يَهْدِي الْقَوْمَ الْفَاسِقِينَ",
    "فَرِحَ الْمُخَلَّفُونَ بِمَقْعَدِهِمْ خِلَافَ رَسُولِ اللَّهِ وَكَرِهُوا أَن يُجَاهِدُوا بِأَمْوَالِهِمْ وَأَنفُسِهِمْ فِي سَبِيلِ اللَّهِ وَقَالُوا لَا تَنفِرُوا فِي الْحَرِّ ۗ قُلْ نَارُ جَهَنَّمَ أَشَدُّ حَرًّا ۚ لَّوْ كَانُوا يَفْقَهُونَ",
    "فَلْيَضْحَكُوا قَلِيلًا وَلْيَبْكُوا كَثِيرًا جَزَاءً بِمَا كَانُوا يَكْسِبُونَ",
    "فَإِن رَّجَعَكَ اللَّهُ إِلَىٰ طَائِفَةٍ مِّنْهُمْ فَاسْتَأْذَنُوكَ لِلْخُرُوجِ فَقُل لَّن تَخْرُجُوا مَعِيَ أَبَدًا وَلَن تُقَاتِلُوا مَعِيَ عَدُوًّا ۖ إِنَّكُمْ رَضِيتُم بِالْقُعُودِ أَوَّلَ مَرَّةٍ فَاقْعُدُوا مَعَ الْخَالِفِينَ",
    "وَلَا تُصَلِّ عَلَىٰ أَحَدٍ مِّنْهُم مَّاتَ أَبَدًا وَلَا تَقُمْ عَلَىٰ قَبْرِهِ ۖ إِنَّهُمْ كَفَرُوا بِاللَّهِ وَرَسُولِهِ وَمَاتُوا وَهُمْ فَاسِقُونَ",
    "وَلَا تُعْجِبْكَ أَمْوَالُهُمْ وَأَوْلَادُهُمْ ۚ إِنَّمَا يُرِيدُ اللَّهُ أَن يُعَذِّبَهُم بِهَا فِي الدُّنْيَا وَتَزْهَقَ أَنفُسُهُمْ وَهُمْ كَافِرُونَ",
    "وَإِذَا أُنزِلَتْ سُورَةٌ أَنْ آمِنُوا بِاللَّهِ وَجَاهِدُوا مَعَ رَسُولِهِ اسْتَأْذَنَكَ أُولُو الطَّوْلِ مِنْهُمْ وَقَالُوا ذَرْنَا نَكُن مَّعَ الْقَاعِدِينَ",
    "رَضُوا بِأَن يَكُونُوا مَعَ الْخَوَالِفِ وَطُبِعَ عَلَىٰ قُلُوبِهِمْ فَهُمْ لَا يَفْقَهُونَ",
    "لَٰكِنِ الرَّسُولُ وَالَّذِينَ آمَنُوا مَعَهُ جَاهَدُوا بِأَمْوَالِهِمْ وَأَنفُسِهِمْ ۚ وَأُولَٰئِكَ لَهُمُ الْخَيْرَاتُ ۖ وَأُولَٰئِكَ هُمُ الْمُفْلِحُونَ",
    "أَعَدَّ اللَّهُ لَهُمْ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا ۚ ذَٰلِكَ الْفَوْزُ الْعَظِيمُ",
    "وَجَاءَ الْمُعَذِّرُونَ مِنَ الْأَعْرَابِ لِيُؤْذَنَ لَهُمْ وَقَعَدَ الَّذِينَ كَذَبُوا اللَّهَ وَرَسُولَهُ ۚ سَيُصِيبُ الَّذِينَ كَفَرُوا مِنْهُمْ عَذَابٌ أَلِيمٌ",
    "لَّيْسَ عَلَى الضُّعَفَاءِ وَلَا عَلَى الْمَرْضَىٰ وَلَا عَلَى الَّذِينَ لَا يَجِدُونَ مَا يُنفِقُونَ حَرَجٌ إِذَا نَصَحُوا لِلَّهِ وَرَسُولِهِ ۚ مَا عَلَى الْمُحْسِنِينَ مِن سَبِيلٍ ۚ وَاللَّهُ غَفُورٌ رَّحِيمٌ",
    "وَلَا عَلَى الَّذِينَ إِذَا مَا أَتَوْكَ لِتَحْمِلَهُمْ قُلْتَ لَا أَجِدُ مَا أَحْمِلُكُمْ عَلَيْهِ تَوَلَّوا وَّأَعْيُنُهُمْ تَفِيضُ مِنَ الدَّمْعِ حَزَنًا أَلَّا يَجِدُوا مَا يُنفِقُونَ",
    "إِنَّمَا السَّبِيلُ عَلَى الَّذِينَ يَسْتَأْذِنُونَكَ وَهُمْ أَغْنِيَاءُ ۚ رَضُوا بِأَن يَكُونُوا مَعَ الْخَوَالِفِ وَطَبَعَ اللَّهُ عَلَىٰ قُلُوبِهِمْ فَهُمْ لَا يَعْلَمُونَ",
    "يَعْتَذِرُونَ إِلَيْكُمْ إِذَا رَجَعْتُمْ إِلَيْهِمْ ۚ قُل لَّا تَعْتَذِرُوا لَن نُّؤْمِنَ لَكُمْ قَدْ نَبَّأَنَا اللَّهُ مِنْ أَخْبَارِكُمْ ۚ وَسَيَرَى اللَّهُ عَمَلَكُمْ وَرَسُولُهُ ثُمَّ تُرَدُّونَ إِلَىٰ عَالِمِ الْغَيْبِ وَالشَّهَادَةِ فَيُنَبِّئُكُم بِمَا كُنتُمْ تَعْمَلُونَ",
    "سَيَحْلِفُونَ بِاللَّهِ لَكُمْ إِذَا انقَلَبْتُمْ إِلَيْهِمْ لِتُعْرِضُوا عَنْهُمْ ۖ فَأَعْرِضُوا عَنْهُمْ ۖ إِنَّهُمْ رِجْسٌ ۖ وَمَأْوَاهُمْ جَهَنَّمُ جَزَاءً بِمَا كَانُوا يَكْسِبُونَ",
    "يَحْلِفُونَ لَكُمْ لِتَرْضَوْا عَنْهُمْ ۖ فَإِن تَرْضَوْا عَنْهُمْ فَإِنَّ اللَّهَ لَا يَرْضَىٰ عَنِ الْقَوْمِ الْفَاسِقِينَ",
    "الْأَعْرَابُ أَشَدُّ كُفْرًا وَنِفَاقًا وَأَجْدَرُ أَلَّا يَعْلَمُوا حُدُودَ مَا أَنزَلَ اللَّهُ عَلَىٰ رَسُولِهِ ۗ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "وَمِنَ الْأَعْرَابِ مَن يَتَّخِذُ مَا يُنفِقُ مَغْرَمًا وَيَتَرَبَّصُ بِكُمُ الدَّوَائِرَ ۚ عَلَيْهِمْ دَائِرَةُ السَّوْءِ ۗ وَاللَّهُ سَمِيعٌ عَلِيمٌ",
    "وَمِنَ الْأَعْرَابِ مَن يُؤْمِنُ بِاللَّهِ وَالْيَوْمِ الْآخِرِ وَيَتَّخِذُ مَا يُنفِقُ قُرُبَاتٍ عِندَ اللَّهِ وَصَلَوَاتِ الرَّسُولِ ۚ أَلَا إِنَّهَا قُرْبَةٌ لَّهُمْ ۚ سَيُدْخِلُهُمُ اللَّهُ فِي رَحْمَتِهِ ۗ إِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ",
    "وَالسَّابِقُونَ الْأَوَّلُونَ مِنَ الْمُهَاجِرِينَ وَالْأَنصَارِ وَالَّذِينَ اتَّبَعُوهُم بِإِحْسَانٍ رَّضِيَ اللَّهُ عَنْهُمْ وَرَضُوا عَنْهُ وَأَعَدَّ لَهُمْ جَنَّاتٍ تَجْرِي تَحْتَهَا الْأَنْهَارُ خَالِدِينَ فِيهَا أَبَدًا ۚ ذَٰلِكَ الْفَوْزُ الْعَظِيمُ",
    "وَمِمَّنْ حَوْلَكُم مِّنَ الْأَعْرَابِ مُنَافِقُونَ ۖ وَمِنْ أَهْلِ الْمَدِينَةِ ۖ مَرَدُوا عَلَى النِّفَاقِ لَا تَعْلَمُهُمْ ۖ نَحْنُ نَعْلَمُهُمْ ۚ سَنُعَذِّبُهُم مَّرَّتَيْنِ ثُمَّ يُرَدُّونَ إِلَىٰ عَذَابٍ عَظِيمٍ",
    "وَآخَرُونَ اعْتَرَفُوا بِذُنُوبِهِمْ خَلَطُوا عَمَلًا صَالِحًا وَآخَرَ سَيِّئًا عَسَى اللَّهُ أَن يَتُوبَ عَلَيْهِمْ ۚ إِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ",
    "خُذْ مِنْ أَمْوَالِهِمْ صَدَقَةً تُطَهِّرُهُمْ وَتُزَكِّيهِم بِهَا وَصَلِّ عَلَيْهِمْ ۖ إِنَّ صَلَاتَكَ سَكَنٌ لَّهُمْ ۗ وَاللَّهُ سَمِيعٌ عَلِيمٌ",
    "أَلَمْ يَعْلَمُوا أَنَّ اللَّهَ هُوَ يَقْبَلُ التَّوْبَةَ عَنْ عِبَادِهِ وَيَأْخُذُ الصَّدَقَاتِ وَأَنَّ اللَّهَ هُوَ التَّوَّابُ الرَّحِيمُ",
    "وَقُلِ اعْمَلُوا فَسَيَرَى اللَّهُ عَمَلَكُمْ وَرَسُولُهُ وَالْمُؤْمِنُونَ ۖ وَسَتُرَدُّونَ إِلَىٰ عَالِمِ الْغَيْبِ وَالشَّهَادَةِ فَيُنَبِّئُكُم بِمَا كُنتُمْ تَعْمَلُونَ",
    "وَآخَرُونَ مُرْجَوْنَ لِأَمْرِ اللَّهِ إِمَّا يُعَذِّبُهُمْ وَإِمَّا يَتُوبُ عَلَيْهِمْ ۗ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "وَالَّذِينَ اتَّخَذُوا مَسْجِدًا ضِرَارًا وَكُفْرًا وَتَفْرِيقًا بَيْنَ الْمُؤْمِنِينَ وَإِرْصَادًا لِّمَنْ حَارَبَ اللَّهَ وَرَسُولَهُ مِن قَبْلُ ۚ وَلَيَحْلِفُنَّ إِنْ أَرَدْنَا إِلَّا الْحُسْنَىٰ ۖ وَاللَّهُ يَشْهَدُ إِنَّهُمْ لَكَاذِبُونَ",
    "لَا تَقُمْ فِيهِ أَبَدًا ۚ لَّمَسْجِدٌ أُسِّسَ عَلَى التَّقْوَىٰ مِنْ أَوَّلِ يَوْمٍ أَحَقُّ أَن تَقُومَ فِيهِ ۚ فِيهِ رِجَالٌ يُحِبُّونَ أَن يَتَطَهَّرُوا ۚ وَاللَّهُ يُحِبُّ الْمُطَّهِّرِينَ",
    "أَفَمَنْ أَسَّسَ بُنْيَانَهُ عَلَىٰ تَقْوَىٰ مِنَ اللَّهِ وَرِضْوَانٍ خَيْرٌ أَم مَّنْ أَسَّسَ بُنْيَانَهُ عَلَىٰ شَفَا جُرُفٍ هَارٍ فَانْهَارَ بِهِ فِي نَارِ جَهَنَّمَ ۗ وَاللَّهُ لَا يَهْدِي الْقَوْمَ الظَّالِمِينَ",
    "لَا يَزَالُ بُنْيَانُهُمُ الَّذِي بَنَوْا رِيبَةً فِي قُلُوبِهِمْ إِلَّا أَن تَقَطَّعَ قُلُوبُهُمْ ۗ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "إِنَّ اللَّهَ اشْتَرَىٰ مِنَ الْمُؤْمِنِينَ أَنفُسَهُمْ وَأَمْوَالَهُم بِأَنَّ لَهُمُ الْجَنَّةَ ۚ يُقَاتِلُونَ فِي سَبِيلِ اللَّهِ فَيَقْتُلُونَ وَيُقْتَلُونَ ۖ وَعْدًا عَلَيْهِ حَقًّا فِي التَّوْرَاةِ وَالْإِنجِيلِ وَالْقُرْآنِ ۚ وَمَنْ أَوْفَىٰ بِعَهْدِهِ مِنَ اللَّهِ ۚ فَاسْتَبْشِرُوا بِبَيْعِكُمُ الَّذِي بَايَعْتُم بِهِ ۚ وَذَٰلِكَ هُوَ الْفَوْزُ الْعَظِيمُ",
    "التَّائِبُونَ الْعَابِدُونَ الْحَامِدُونَ السَّائِحُونَ الرَّاكِعُونَ السَّاجِدُونَ الْآمِرُونَ بِالْمَعْرُوفِ وَالنَّاهُونَ عَنِ الْمُنكَرِ وَالْحَافِظُونَ لِحُدُودِ اللَّهِ ۗ وَبَشِّرِ الْمُؤْمِنِينَ",
    "مَا كَانَ لِلنَّبِيِّ وَالَّذِينَ آمَنُوا أَن يَسْتَغْفِرُوا لِلْمُشْرِكِينَ وَلَوْ كَانُوا أُولِي قُرْبَىٰ مِن بَعْدِ مَا تَبَيَّنَ لَهُمْ أَنَّهُمْ أَصْحَابُ الْجَحِيمِ",
    "وَمَا كَانَ اسْتِغْفَارُ إِبْرَاهِيمَ لِأَبِيهِ إِلَّا عَن مَّوْعِدَةٍ وَعَدَهَا إِيَّاهُ فَلَمَّا تَبَيَّنَ لَهُ أَنَّهُ عَدُوٌّ لِّلَّهِ تَبَرَّأَ مِنْهُ ۚ إِنَّ إِبْرَاهِيمَ لَأَوَّاهٌ حَلِيمٌ",
    "وَمَا كَانَ اللَّهُ لِيُضِلَّ قَوْمًا بَعْدَ إِذْ هَدَاهُمْ حَتَّىٰ يُبَيِّنَ لَهُم مَّا يَتَّقُونَ ۚ إِنَّ اللَّهَ بِكُلِّ شَيْءٍ عَلِيمٌ",
    "إِنَّ اللَّهَ لَهُ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ ۖ يُحْيِي وَيُمِيتُ ۚ وَمَا لَكُم مِّن دُونِ اللَّهِ مِن وَلِيٍّ وَلَا نَصِيرٍ",
    "لَّقَد تَّابَ اللَّهُ عَلَى النَّبِيِّ وَالْمُهَاجِرِينَ وَالْأَنصَارِ الَّذِينَ اتَّبَعُوهُ فِي سَاعَةِ الْعُسْرَةِ مِن بَعْدِ مَا كَادَ يَزِيغُ قُلُوبُ فَرِيقٍ مِّنْهُمْ ثُمَّ تَابَ عَلَيْهِمْ ۚ إِنَّهُ بِهِمْ رَءُوفٌ رَّحِيمٌ",
    "وَعَلَى الثَّلَاثَةِ الَّذِينَ خُلِّفُوا حَتَّىٰ إِذَا ضَاقَتْ عَلَيْهِمُ الْأَرْضُ بِمَا رَحُبَتْ وَضَاقَتْ عَلَيْهِمْ أَنفُسُهُمْ وَظَنُّوا أَن لَّا مَلْجَأَ مِنَ اللَّهِ إِلَّا إِلَيْهِ ثُمَّ تَابَ عَلَيْهِمْ لِيَتُوبُوا ۚ إِنَّ اللَّهَ هُوَ التَّوَّابُ الرَّحِيمُ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا اتَّقُوا اللَّهَ وَكُونُوا مَعَ الصَّادِقِينَ",
    "مَا كَانَ لِأَهْلِ الْمَدِينَةِ وَمَنْ حَوْلَهُم مِّنَ الْأَعْرَابِ أَن يَتَخَلَّفُوا عَن رَّسُولِ اللَّهِ وَلَا يَرْغَبُوا بِأَنفُسِهِمْ عَن نَّفْسِهِ ۚ ذَٰلِكَ بِأَنَّهُمْ لَا يُصِيبُهُمْ ظَمَأٌ وَلَا نَصَبٌ وَلَا مَخْمَصَةٌ فِي سَبِيلِ اللَّهِ وَلَا يَطَئُونَ مَوْطِئًا يَغِيظُ الْكُفَّارَ وَلَا يَنَالُونَ مِنْ عَدُوٍّ نَّيْلًا إِلَّا كُتِبَ لَهُم بِهِ عَمَلٌ صَالِحٌ ۚ إِنَّ اللَّهَ لَا يُضِيعُ أَجْرَ الْمُحْسِنِينَ",
    "وَلَا يُنفِقُونَ نَفَقَةً صَغِيرَةً وَلَا كَبِيرَةً وَلَا يَقْطَعُونَ وَادِيًا إِلَّا كُتِبَ لَهُمْ لِيَجْزِيَهُمُ اللَّهُ أَحْسَنَ مَا كَانُوا يَعْمَلُونَ",
    "وَمَا كَانَ الْمُؤْمِنُونَ لِيَنفِرُوا كَافَّةً ۚ فَلَوْلَا نَفَرَ مِن كُلِّ فِرْقَةٍ مِّنْهُمْ طَائِفَةٌ لِّيَتَفَقَّهُوا فِي الدِّينِ وَلِيُنذِرُوا قَوْمَهُمْ إِذَا رَجَعُوا إِلَيْهِمْ لَعَلَّهُمْ يَحْذَرُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا قَاتِلُوا الَّذِينَ يَلُونَكُم مِّنَ الْكُفَّارِ وَلْيَجِدُوا فِيكُمْ غِلْظَةً ۚ وَاعْلَمُوا أَنَّ اللَّهَ مَعَ الْمُتَّقِينَ",
    "وَإِذَا مَا أُنزِلَتْ سُورَةٌ فَمِنْهُم مَّن يَقُولُ أَيُّكُمْ زَادَتْهُ هَٰذِهِ إِيمَانًا ۚ فَأَمَّا الَّذِينَ آمَنُوا فَزَادَتْهُمْ إِيمَانًا وَهُمْ يَسْتَبْشِرُونَ",
    "وَأَمَّا الَّذِينَ فِي قُلُوبِهِم مَّرَضٌ فَزَادَتْهُمْ رِجْسًا إِلَىٰ رِجْسِهِمْ وَمَاتُوا وَهُمْ كَافِرُونَ",
    "أَوَلَا يَرَوْنَ أَنَّهُمْ يُفْتَنُونَ فِي كُلِّ عَامٍ مَّرَّةً أَوْ مَرَّتَيْنِ ثُمَّ لَا يَتُوبُونَ وَلَا هُمْ يَذَّكَّرُونَ",
    "وَإِذَا مَا أُنزِلَتْ سُورَةٌ نَّظَرَ بَعْضُهُمْ إِلَىٰ بَعْضٍ هَلْ يَرَاكُم مِّنْ أَحَدٍ ثُمَّ انصَرَفُوا ۚ صَرَفَ اللَّهُ قُلُوبَهُم بِأَنَّهُمْ قَوْمٌ لَّا يَفْقَهُونَ",
    "لَقَدْ جَاءَكُمْ رَسُولٌ مِّنْ أَنفُسِكُمْ عَزِيزٌ عَلَيْهِ مَا عَنِتُّمْ حَرِيصٌ عَلَيْكُم بِالْمُؤْمِنِينَ رَءُوفٌ رَّحِيمٌ",
    "فَإِن تَوَلَّوْا فَقُلْ حَسْبِيَ اللَّهُ لَا إِلَٰهَ إِلَّا هُوَ ۖ عَلَيْهِ تَوَكَّلْتُ ۖ وَهُوَ رَبُّ الْعَرْشِ الْعَظِيمِ",
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
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"[This is a declaration of] disassociation, from Allah and His Messenger, to those with whom you had made a treaty among the polytheists.",
    "So travel freely, [O disbelievers], throughout the land [during] four months but know that you cannot cause failure to Allah and that Allah will disgrace the disbelievers.",
    "And [it is] an announcement from Allah and His Messenger to the people on the day of the greater pilgrimage that Allah is disassociated from the disbelievers, and [so is] His Messenger. So if you repent, that is best for you; but if you turn away - then know that you will not cause failure to Allah. And give tidings to those who disbelieve of a painful punishment.",
    "Excepted are those with whom you made a treaty among the polytheists and then they have not been deficient toward you in anything or supported anyone against you; so complete for them their treaty until their term [has ended]. Indeed, Allah loves the righteous [who fear Him].",
    "And when the sacred months have passed, then kill the polytheists wherever you find them and capture them and besiege them and sit in wait for them at every place of ambush. But if they should repent, establish prayer, and give zakah, let them [go] on their way. Indeed, Allah is Forgiving and Merciful.",
    "And if any one of the polytheists seeks your protection, then grant him protection so that he may hear the words of Allah. Then deliver him to his place of safety. That is because they are a people who do not know.",
    "How can there be for the polytheists a treaty in the sight of Allah and with His Messenger, except for those with whom you made a treaty at al-Masjid al-Haram? So as long as they are upright toward you, be upright toward them. Indeed, Allah loves the righteous [who fear Him].",
    "How [can there be a treaty] while, if they gain dominance over you, they do not observe concerning you any pact of kinship or covenant of protection? They satisfy you with their mouths, but their hearts refuse [compliance], and most of them are defiantly disobedient.",
    "They have exchanged the signs of Allah for a small price and averted [people] from His way. Indeed, it was evil that they were doing.",
    "They do not observe toward a believer any pact of kinship or covenant of protection. And it is they who are the transgressors.",
    "But if they repent, establish prayer, and give zakah, then they are your brothers in religion; and We detail the verses for a people who know.",
    "And if they break their oaths after their treaty and defame your religion, then fight the leaders of disbelief, for indeed, there are no oaths [sacred] to them; [fight them that] they might cease.",
    "Would you not fight a people who broke their oaths and determined to expel the Messenger, and they had begun [the attack upon] you the first time? Do you fear them? But Allah has more right that you should fear Him, if you are [truly] believers.",
    "Fight them; Allah will punish them by your hands and will disgrace them and give you victory over them and satisfy the breasts of a believing people",
    "And remove the fury in the believers' hearts. And Allah turns in forgiveness to whom He wills; and Allah is Knowing and Wise.",
    "Do you think that you will be left [as you are] while Allah has not yet made evident those among you who strive [for His cause] and do not take other than Allah, His Messenger and the believers as intimates? And Allah is Acquainted with what you do.",
    "It is not for the polytheists to maintain the mosques of Allah [while] witnessing against themselves with disbelief. [For] those, their deeds have become worthless, and in the Fire they will abide eternally.",
    "The mosques of Allah are only to be maintained by those who believe in Allah and the Last Day and establish prayer and give zakah and do not fear except Allah, for it is expected that those will be of the [rightly] guided.",
    "Have you made the providing of water for the pilgrim and the maintenance of al-Masjid al-Haram equal to [the deeds of] one who believes in Allah and the Last Day and strives in the cause of Allah? They are not equal in the sight of Allah. And Allah does not guide the wrongdoing people.",
    "The ones who have believed, emigrated and striven in the cause of Allah with their wealth and their lives are greater in rank in the sight of Allah. And it is those who are the attainers [of success].",
    "Their Lord gives them good tidings of mercy from Him and approval and of gardens for them wherein is enduring pleasure.",
    "[They will be] abiding therein forever. Indeed, Allah has with Him a great reward.",
    "O you who have believed, do not take your fathers or your brothers as allies if they have preferred disbelief over belief. And whoever does so among you - then it is those who are the wrongdoers.",
    "Say, [O Muhammad], \"If your fathers, your sons, your brothers, your wives, your relatives, wealth which you have obtained, commerce wherein you fear decline, and dwellings with which you are pleased are more beloved to you than Allah and His Messenger and jihad in His cause, then wait until Allah executes His command. And Allah does not guide the defiantly disobedient people.\"",
    "Allah has already given you victory in many regions and [even] on the day of Hunayn, when your great number pleased you, but it did not avail you at all, and the earth was confining for you with its vastness; then you turned back, fleeing.",
    "Then Allah sent down His tranquillity upon His Messenger and upon the believers and sent down soldiers angels whom you did not see and punished those who disbelieved. And that is the recompense of the disbelievers.",
    "Then Allah will accept repentance after that for whom He wills; and Allah is Forgiving and Merciful.",
    "O you who have believed, indeed the polytheists are unclean, so let them not approach al-Masjid al-Haram after this, their [final] year. And if you fear privation, Allah will enrich you from His bounty if He wills. Indeed, Allah is Knowing and Wise.",
    "Fight those who do not believe in Allah or in the Last Day and who do not consider unlawful what Allah and His Messenger have made unlawful and who do not adopt the religion of truth from those who were given the Scripture - [fight] until they give the jizyah willingly while they are humbled.",
    "The Jews say, \"Ezra is the son of Allah\"; and the Christians say, \"The Messiah is the son of Allah.\" That is their statement from their mouths; they imitate the saying of those who disbelieved [before them]. May Allah destroy them; how are they deluded?",
    "They have taken their scholars and monks as lords besides Allah, and [also] the Messiah, the son of Mary. And they were not commanded except to worship one God; there is no deity except Him. Exalted is He above whatever they associate with Him.",
    "They want to extinguish the light of Allah with their mouths, but Allah refuses except to perfect His light, although the disbelievers dislike it.",
    "It is He who has sent His Messenger with guidance and the religion of truth to manifest it over all religion, although they who associate others with Allah dislike it.",
    "O you who have believed, indeed many of the scholars and the monks devour the wealth of people unjustly and avert [them] from the way of Allah. And those who hoard gold and silver and spend it not in the way of Allah - give them tidings of a painful punishment.",
    "The Day when it will be heated in the fire of Hell and seared therewith will be their foreheads, their flanks, and their backs, [it will be said], \"This is what you hoarded for yourselves, so taste what you used to hoard.\"",
    "Indeed, the number of months with Allah is twelve [lunar] months in the register of Allah [from] the day He created the heavens and the earth; of these, four are sacred. That is the correct religion, so do not wrong yourselves during them. And fight against the disbelievers collectively as they fight against you collectively. And know that Allah is with the righteous [who fear Him].",
    "Indeed, the postponing [of restriction within sacred months] is an increase in disbelief by which those who have disbelieved are led [further] astray. They make it lawful one year and unlawful another year to correspond to the number made unlawful by Allah and [thus] make lawful what Allah has made unlawful. Made pleasing to them is the evil of their deeds; and Allah does not guide the disbelieving people.",
    "O you who have believed, what is [the matter] with you that, when you are told to go forth in the cause of Allah, you adhere heavily to the earth? Are you satisfied with the life of this world rather than the Hereafter? But what is the enjoyment of worldly life compared to the Hereafter except a [very] little.",
    "If you do not go forth, He will punish you with a painful punishment and will replace you with another people, and you will not harm Him at all. And Allah is over all things competent.",
    "If you do not aid the Prophet - Allah has already aided him when those who disbelieved had driven him out [of Makkah] as one of two, when they were in the cave and he said to his companion, \"Do not grieve; indeed Allah is with us.\" And Allah sent down his tranquillity upon him and supported him with angels you did not see and made the word of those who disbelieved the lowest, while the word of Allah - that is the highest. And Allah is Exalted in Might and Wise.",
    "Go forth, whether light or heavy, and strive with your wealth and your lives in the cause of Allah. That is better for you, if you only knew.",
    "Had it been an easy gain and a moderate trip, the hypocrites would have followed you, but distant to them was the journey. And they will swear by Allah, \"If we were able, we would have gone forth with you,\" destroying themselves [through false oaths], and Allah knows that indeed they are liars.",
    "May Allah pardon you, [O Muhammad]; why did you give them permission [to remain behind]? [You should not have] until it was evident to you who were truthful and you knew [who were] the liars.",
    "Those who believe in Allah and the Last Day would not ask permission of you to be excused from striving with their wealth and their lives. And Allah is Knowing of those who fear Him.",
    "Only those would ask permission of you who do not believe in Allah and the Last Day and whose hearts have doubted, and they, in their doubt, are hesitating.",
    "And if they had intended to go forth, they would have prepared for it [some] preparation. But Allah disliked their being sent, so He kept them back, and they were told, \"Remain [behind] with those who remain.\"",
    "Had they gone forth with you, they would not have increased you except in confusion, and they would have been active among you, seeking [to cause] you fitnah. And among you are avid listeners to them. And Allah is Knowing of the wrongdoers.",
    "They had already desired dissension before and had upset matters for you until the truth came and the ordinance of Allah appeared, while they were averse.",
    "And among them is he who says, \"Permit me [to remain at home] and do not put me to trial.\" Unquestionably, into trial they have fallen. And indeed, Hell will encompass the disbelievers.",
    "If good befalls you, it distresses them; but if disaster strikes you, they say, \"We took our matter [in hand] before,\" and turn away while they are rejoicing.",
    "Say, \"Never will we be struck except by what Allah has decreed for us; He is our protector.\" And upon Allah let the believers rely.",
    "Say, \"Do you await for us except one of the two best things while we await for you that Allah will afflict you with punishment from Himself or at our hands? So wait; indeed we, along with you, are waiting.\"",
    "Say, \"Spend willingly or unwillingly; never will it be accepted from you. Indeed, you have been a defiantly disobedient people.\"",
    "And what prevents their expenditures from being accepted from them but that they have disbelieved in Allah and in His Messenger and that they come not to prayer except while they are lazy and that they do not spend except while they are unwilling.",
    "So let not their wealth or their children impress you. Allah only intends to punish them through them in worldly life and that their souls should depart [at death] while they are disbelievers.",
    "And they swear by Allah that they are from among you while they are not from among you; but they are a people who are afraid.",
    "If they could find a refuge or some caves or any place to enter [and hide], they would turn to it while they run heedlessly.",
    "And among them are some who criticize you concerning the [distribution of] charities. If they are given from them, they approve; but if they are not given from them, at once they become angry.",
    "If only they had been satisfied with what Allah and His Messenger gave them and said, \"Sufficient for us is Allah; Allah will give us of His bounty, and [so will] His Messenger; indeed, we are desirous toward Allah,\" [it would have been better for them].",
    "Zakah expenditures are only for the poor and for the needy and for those employed to collect [zakah] and for bringing hearts together [for Islam] and for freeing captives [or slaves] and for those in debt and for the cause of Allah and for the [stranded] traveler - an obligation [imposed] by Allah. And Allah is Knowing and Wise.",
    "And among them are those who abuse the Prophet and say, \"He is an ear.\" Say, \"[It is] an ear of goodness for you that believes in Allah and believes the believers and [is] a mercy to those who believe among you.\" And those who abuse the Messenger of Allah - for them is a painful punishment.",
    "They swear by Allah to you [Muslims] to satisfy you. But Allah and His Messenger are more worthy for them to satisfy, if they should be believers.",
    "Do they not know that whoever opposes Allah and His Messenger - that for him is the fire of Hell, wherein he will abide eternally? That is the great disgrace.",
    "They hypocrites are apprehensive lest a surah be revealed about them, informing them of what is in their hearts. Say, \"Mock [as you wish]; indeed, Allah will expose that which you fear.\"",
    "And if you ask them, they will surely say, \"We were only conversing and playing.\" Say, \"Is it Allah and His verses and His Messenger that you were mocking?\"",
    "Make no excuse; you have disbelieved after your belief. If We pardon one faction of you - We will punish another faction because they were criminals.",
    "The hypocrite men and hypocrite women are of one another. They enjoin what is wrong and forbid what is right and close their hands. They have forgotten Allah, so He has forgotten them [accordingly]. Indeed, the hypocrites - it is they who are the defiantly disobedient.",
    "Allah has promised the hypocrite men and hypocrite women and the disbelievers the fire of Hell, wherein they will abide eternally. It is sufficient for them. And Allah has cursed them, and for them is an enduring punishment.",
    "[You disbelievers are] like those before you; they were stronger than you in power and more abundant in wealth and children. They enjoyed their portion [of worldly enjoyment], and you have enjoyed your portion as those before you enjoyed their portion, and you have engaged [in vanities] like that in which they engaged. [It is] those whose deeds have become worthless in this world and in the Hereafter, and it is they who are the losers.",
    "Has there not reached them the news of those before them - the people of Noah and [the tribes of] 'Aad and Thamud and the people of Abraham and the companions of Madyan and the towns overturned? Their messengers came to them with clear proofs. And Allah would never have wronged them, but they were wronging themselves.",
    "The believing men and believing women are allies of one another. They enjoin what is right and forbid what is wrong and establish prayer and give zakah and obey Allah and His Messenger. Those - Allah will have mercy upon them. Indeed, Allah is Exalted in Might and Wise.",
    "Allah has promised the believing men and believing women gardens beneath which rivers flow, wherein they abide eternally, and pleasant dwellings in gardens of perpetual residence; but approval from Allah is greater. It is that which is the great attainment.",
    "O Prophet, fight against the disbelievers and the hypocrites and be harsh upon them. And their refuge is Hell, and wretched is the destination.",
    "They swear by Allah that they did not say [anything against the Prophet] while they had said the word of disbelief and disbelieved after their [pretense of] Islam and planned that which they were not to attain. And they were not resentful except [for the fact] that Allah and His Messenger had enriched them of His bounty. So if they repent, it is better for them; but if they turn away, Allah will punish them with a painful punishment in this world and the Hereafter. And there will not be for them on earth any protector or helper.",
    "And among them are those who made a covenant with Allah, [saying], \"If He should give us from His bounty, we will surely spend in charity, and we will surely be among the righteous.\"",
    "But when he gave them from His bounty, they were stingy with it and turned away while they refused.",
    "So He penalized them with hypocrisy in their hearts until the Day they will meet Him - because they failed Allah in what they promised Him and because they [habitually] used to lie.",
    "Did they not know that Allah knows their secrets and their private conversations and that Allah is the Knower of the unseen?",
    "Those who criticize the contributors among the believers concerning [their] charities and [criticize] the ones who find nothing [to spend] except their effort, so they ridicule them - Allah will ridicule them, and they will have a painful punishment.",
    "Ask forgiveness for them, [O Muhammad], or do not ask forgiveness for them. If you should ask forgiveness for them seventy times - never will Allah forgive them. That is because they disbelieved in Allah and His Messenger, and Allah does not guide the defiantly disobedient people.",
    "Those who remained behind rejoiced in their staying [at home] after [the departure of] the Messenger of Allah and disliked to strive with their wealth and their lives in the cause of Allah and said, 'Do not go forth in the heat.\" Say, \"The fire of Hell is more intensive in heat\" - if they would but understand.",
    "So let them laugh a little and [then] weep much as recompense for what they used to earn.",
    "If Allah should return you to a faction of them [after the expedition] and then they ask your permission to go out [to battle], say, \"You will not go out with me, ever, and you will never fight with me an enemy. Indeed, you were satisfied with sitting [at home] the first time, so sit [now] with those who stay behind.\"",
    "And do not pray [the funeral prayer, O Muhammad], over any of them who has died - ever - or stand at his grave. Indeed, they disbelieved in Allah and His Messenger and died while they were defiantly disobedient.",
    "And let not their wealth and their children impress you. Allah only intends to punish them through them in this world and that their souls should depart [at death] while they are disbelievers.",
    "And when a surah was revealed [enjoining them] to believe in Allah and to fight with His Messenger, those of wealth among them asked your permission [to stay back] and said, \"Leave us to be with them who sit [at home].\"",
    "They were satisfied to be with those who stay behind, and their hearts were sealed over, so they do not understand.",
    "But the Messenger and those who believed with him fought with their wealth and their lives. Those will have [all that is] good, and it is those who are the successful.",
    "Allah has prepared for them gardens beneath which rivers flow, wherein they will abide eternally. That is the great attainment.",
    "And those with excuses among the bedouins came to be permitted [to remain], and they who had lied to Allah and His Messenger sat [at home]. There will strike those who disbelieved among them a painful punishment.",
    "There is not upon the weak or upon the ill or upon those who do not find anything to spend any discomfort when they are sincere to Allah and His Messenger. There is not upon the doers of good any cause [for blame]. And Allah is Forgiving and Merciful.",
    "Nor [is there blame] upon those who, when they came to you that you might give them mounts, you said, \"I can find nothing for you to ride upon.\" They turned back while their eyes overflowed with tears out of grief that they could not find something to spend [for the cause of Allah].",
    "The cause [for blame] is only upon those who ask permission of you while they are rich. They are satisfied to be with those who stay behind, and Allah has sealed over their hearts, so they do not know.",
    "They will make excuses to you when you have returned to them. Say, \"Make no excuse - never will we believe you. Allah has already informed us of your news. And Allah will observe your deeds, and [so will] His Messenger; then you will be taken back to the Knower of the unseen and the witnessed, and He will inform you of what you used to do.\"",
    "They will swear by Allah to you when you return to them that you would leave them alone. So leave them alone; indeed they are evil; and their refuge is Hell as recompense for what they had been earning.",
    "They swear to you so that you might be satisfied with them. But if you should be satisfied with them - indeed, Allah is not satisfied with a defiantly disobedient people.",
    "The bedouins are stronger in disbelief and hypocrisy and more likely not to know the limits of what [laws] Allah has revealed to His Messenger. And Allah is Knowing and Wise.",
    "And among the bedouins are some who consider what they spend as a loss and await for you turns of misfortune. Upon them will be a misfortune of evil. And Allah is Hearing and Knowing.",
    "But among the bedouins are some who believe in Allah and the Last Day and consider what they spend as means of nearness to Allah and of [obtaining] invocations of the Messenger. Unquestionably, it is a means of nearness for them. Allah will admit them to His mercy. Indeed, Allah is Forgiving and Merciful.",
    "And the first forerunners [in the faith] among the Muhajireen and the Ansar and those who followed them with good conduct - Allah is pleased with them and they are pleased with Him, and He has prepared for them gardens beneath which rivers flow, wherein they will abide forever. That is the great attainment.",
    "And among those around you of the bedouins are hypocrites, and [also] from the people of Madinah. They have become accustomed to hypocrisy. You, [O Muhammad], do not know them, [but] We know them. We will punish them twice [in this world]; then they will be returned to a great punishment.",
    "And [there are] others who have acknowledged their sins. They had mixed a righteous deed with another that was bad. Perhaps Allah will turn to them in forgiveness. Indeed, Allah is Forgiving and Merciful.",
    "Take, [O, Muhammad], from their wealth a charity by which you purify them and cause them increase, and invoke [Allah's blessings] upon them. Indeed, your invocations are reassurance for them. And Allah is Hearing and Knowing.",
    "Do they not know that it is Allah who accepts repentance from His servants and receives charities and that it is Allah who is the Accepting of repentance, the Merciful?",
    "And say, \"Do [as you will], for Allah will see your deeds, and [so, will] His Messenger and the believers. And you will be returned to the Knower of the unseen and the witnessed, and He will inform you of what you used to do.\"",
    "And [there are] others deferred until the command of Allah - whether He will punish them or whether He will forgive them. And Allah is Knowing and Wise.",
    "And [there are] those [hypocrites] who took for themselves a mosque for causing harm and disbelief and division among the believers and as a station for whoever had warred against Allah and His Messenger before. And they will surely swear, \"We intended only the best.\" And Allah testifies that indeed they are liars.",
    "Do not stand [for prayer] within it - ever. A mosque founded on righteousness from the first day is more worthy for you to stand in. Within it are men who love to purify themselves; and Allah loves those who purify themselves.",
    "Then is one who laid the foundation of his building on righteousness [with fear] from Allah and [seeking] His approval better or one who laid the foundation of his building on the edge of a bank about to collapse, so it collapsed with him into the fire of Hell? And Allah does not guide the wrongdoing people.",
    "Their building which they built will not cease to be a [cause of] skepticism in their hearts until their hearts are stopped. And Allah is Knowing and Wise.",
    "Indeed, Allah has purchased from the believers their lives and their properties [in exchange] for that they will have Paradise. They fight in the cause of Allah, so they kill and are killed. [It is] a true promise [binding] upon Him in the Torah and the Gospel and the Qur'an. And who is truer to his covenant than Allah? So rejoice in your transaction which you have contracted. And it is that which is the great attainment.",
    "[Such believers are] the repentant, the worshippers, the praisers [of Allah], the travelers [for His cause], those who bow and prostrate [in prayer], those who enjoin what is right and forbid what is wrong, and those who observe the limits [set by] Allah. And give good tidings to the believers.",
    "It is not for the Prophet and those who have believed to ask forgiveness for the polytheists, even if they were relatives, after it has become clear to them that they are companions of Hellfire.",
    "And the request of forgiveness of Abraham for his father was only because of a promise he had made to him. But when it became apparent to Abraham that his father was an enemy to Allah, he disassociated himself from him. Indeed was Abraham compassionate and patient.",
    "And Allah would not let a people stray after He has guided them until He makes clear to them what they should avoid. Indeed, Allah is Knowing of all things.",
    "Indeed, to Allah belongs the dominion of the heavens and the earth; He gives life and causes death. And you have not besides Allah any protector or any helper.",
    "Allah has already forgiven the Prophet and the Muhajireen and the Ansar who followed him in the hour of difficulty after the hearts of a party of them had almost inclined [to doubt], and then He forgave them. Indeed, He was to them Kind and Merciful.",
    "And [He also forgave] the three who were left behind [and regretted their error] to the point that the earth closed in on them in spite of its vastness and their souls confined them and they were certain that there is no refuge from Allah except in Him. Then He turned to them so they could repent. Indeed, Allah is the Accepting of repentance, the Merciful.",
    "O you who have believed, fear Allah and be with those who are true.",
    "It was not [proper] for the people of Madinah and those surrounding them of the bedouins that they remain behind after [the departure of] the Messenger of Allah or that they prefer themselves over his self. That is because they are not afflicted by thirst or fatigue or hunger in the cause of Allah, nor do they tread on any ground that enrages the disbelievers, nor do they inflict upon an enemy any infliction but that is registered for them as a righteous deed. Indeed, Allah does not allow to be lost the reward of the doers of good.",
    "Nor do they spend an expenditure, small or large, or cross a valley but that it is registered for them that Allah may reward them for the best of what they were doing.",
    "And it is not for the believers to go forth [to battle] all at once. For there should separate from every division of them a group [remaining] to obtain understanding in the religion and warn their people when they return to them that they might be cautious.",
    "O you who have believed, fight those adjacent to you of the disbelievers and let them find in you harshness. And know that Allah is with the righteous.",
    "And whenever a surah is revealed, there are among the hypocrites those who say, \"Which of you has this increased faith?\" As for those who believed, it has increased them in faith, while they are rejoicing.",
    "But as for those in whose hearts is disease, it has [only] increased them in evil [in addition] to their evil. And they will have died while they are disbelievers.",
    "Do they not see that they are tried every year once or twice but then they do not repent nor do they remember?",
    "And whenever a surah is revealed, they look at each other, [saying], \"Does anyone see you?\" and then they dismiss themselves. Allah has dismissed their hearts because they are a people who do not understand.",
    "There has certainly come to you a Messenger from among yourselves. Grievous to him is what you suffer; [he is] concerned over you and to the believers is kind and merciful.",
    "But if they turn away, [O Muhammad], say, \"Sufficient for me is Allah; there is no deity except Him. On Him I have relied, and He is the Lord of the Great Throne.\"",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at__tawbah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_at_tawbah);
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
