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

public class Yusuf extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"12:1", "12:2", "12:3", "12:4", "12:5", "12:6", "12:7", "12:8", "12:9", "12:10", "12:11", "12:12", "12:13", "12:14", "12:15", "12:16",
            "12:17", "12:18", "12:19", "12:20", "12:21", "12:22", "12:23", "12:24", "12:25", "12:26", "12:27", "12:28", "12:29", "12:30", "12:31", "12:32",
            "12:33", "12:34", "12:35", "12:36", "12:37", "12:38", "12:39", "12:40", "12:41", "12:42", "12:43", "12:44", "12:45", "12:46", "12:47", "12:48",
            "12:49", "12:50", "12:51", "12:52", "12:53", "12:54", "12:55", "12:56", "12:57", "12:58", "12:59", "12:60", "12:61", "12:62", "12:63", "12:64",
            "12:65", "12:66", "12:67", "12:68", "12:69", "12:70", "12:71", "12:72", "12:73", "12:74", "12:75", "12:76", "12:77", "12:78", "12:79", "12:80",
            "12:81", "12:82", "12:83", "12:84", "12:85", "12:86", "12:87", "12:88", "12:89", "12:90", "12:91", "12:92", "12:93", "12:94", "12:95", "12:96",
            "12:97", "12:98", "12:99", "12:100", "12:101", "12:102", "12:103", "12:104", "12:105", "12:106", "12:107", "12:108", "12:109", "12:110", "12:111", ""};

    String [] arabic_verses = {"الر ۚ تِلْكَ آيَاتُ الْكِتَابِ الْمُبِينِ",
    "إِنَّا أَنزَلْنَاهُ قُرْآنًا عَرَبِيًّا لَّعَلَّكُمْ تَعْقِلُونَ",
    "نَحْنُ نَقُصُّ عَلَيْكَ أَحْسَنَ الْقَصَصِ بِمَا أَوْحَيْنَا إِلَيْكَ هَٰذَا الْقُرْآنَ وَإِن كُنتَ مِن قَبْلِهِ لَمِنَ الْغَافِلِينَ",
    "إِذْ قَالَ يُوسُفُ لِأَبِيهِ يَا أَبَتِ إِنِّي رَأَيْتُ أَحَدَ عَشَرَ كَوْكَبًا وَالشَّمْسَ وَالْقَمَرَ رَأَيْتُهُمْ لِي سَاجِدِينَ",
    "قَالَ يَا بُنَيَّ لَا تَقْصُصْ رُؤْيَاكَ عَلَىٰ إِخْوَتِكَ فَيَكِيدُوا لَكَ كَيْدًا ۖ إِنَّ الشَّيْطَانَ لِلْإِنسَانِ عَدُوٌّ مُّبِينٌ",
    "وَكَذَٰلِكَ يَجْتَبِيكَ رَبُّكَ وَيُعَلِّمُكَ مِن تَأْوِيلِ الْأَحَادِيثِ وَيُتِمُّ نِعْمَتَهُ عَلَيْكَ وَعَلَىٰ آلِ يَعْقُوبَ كَمَا أَتَمَّهَا عَلَىٰ أَبَوَيْكَ مِن قَبْلُ إِبْرَاهِيمَ وَإِسْحَاقَ ۚ إِنَّ رَبَّكَ عَلِيمٌ حَكِيمٌ",
    "لَّقَدْ كَانَ فِي يُوسُفَ وَإِخْوَتِهِ آيَاتٌ لِّلسَّائِلِينَ",
    "إِذْ قَالُوا لَيُوسُفُ وَأَخُوهُ أَحَبُّ إِلَىٰ أَبِينَا مِنَّا وَنَحْنُ عُصْبَةٌ إِنَّ أَبَانَا لَفِي ضَلَالٍ مُّبِينٍ",
    "اقْتُلُوا يُوسُفَ أَوِ اطْرَحُوهُ أَرْضًا يَخْلُ لَكُمْ وَجْهُ أَبِيكُمْ وَتَكُونُوا مِن بَعْدِهِ قَوْمًا صَالِحِينَ",
    "قَالَ قَائِلٌ مِّنْهُمْ لَا تَقْتُلُوا يُوسُفَ وَأَلْقُوهُ فِي غَيَابَتِ الْجُبِّ يَلْتَقِطْهُ بَعْضُ السَّيَّارَةِ إِن كُنتُمْ فَاعِلِينَ",
    "قَالُوا يَا أَبَانَا مَا لَكَ لَا تَأْمَنَّا عَلَىٰ يُوسُفَ وَإِنَّا لَهُ لَنَاصِحُونَ",
    "أَرْسِلْهُ مَعَنَا غَدًا يَرْتَعْ وَيَلْعَبْ وَإِنَّا لَهُ لَحَافِظُونَ",
    "قَالَ إِنِّي لَيَحْزُنُنِي أَن تَذْهَبُوا بِهِ وَأَخَافُ أَن يَأْكُلَهُ الذِّئْبُ وَأَنتُمْ عَنْهُ غَافِلُونَ",
    "قَالُوا لَئِنْ أَكَلَهُ الذِّئْبُ وَنَحْنُ عُصْبَةٌ إِنَّا إِذًا لَّخَاسِرُونَ",
    "فَلَمَّا ذَهَبُوا بِهِ وَأَجْمَعُوا أَن يَجْعَلُوهُ فِي غَيَابَتِ الْجُبِّ ۚ وَأَوْحَيْنَا إِلَيْهِ لَتُنَبِّئَنَّهُم بِأَمْرِهِمْ هَٰذَا وَهُمْ لَا يَشْعُرُونَ",
    "وَجَاءُوا أَبَاهُمْ عِشَاءً يَبْكُونَ",
    "قَالُوا يَا أَبَانَا إِنَّا ذَهَبْنَا نَسْتَبِقُ وَتَرَكْنَا يُوسُفَ عِندَ مَتَاعِنَا فَأَكَلَهُ الذِّئْبُ ۖ وَمَا أَنتَ بِمُؤْمِنٍ لَّنَا وَلَوْ كُنَّا صَادِقِينَ",
    "وَجَاءُوا عَلَىٰ قَمِيصِهِ بِدَمٍ كَذِبٍ ۚ قَالَ بَلْ سَوَّلَتْ لَكُمْ أَنفُسُكُمْ أَمْرًا ۖ فَصَبْرٌ جَمِيلٌ ۖ وَاللَّهُ الْمُسْتَعَانُ عَلَىٰ مَا تَصِفُونَ",
    "وَجَاءَتْ سَيَّارَةٌ فَأَرْسَلُوا وَارِدَهُمْ فَأَدْلَىٰ دَلْوَهُ ۖ قَالَ يَا بُشْرَىٰ هَٰذَا غُلَامٌ ۚ وَأَسَرُّوهُ بِضَاعَةً ۚ وَاللَّهُ عَلِيمٌ بِمَا يَعْمَلُونَ",
    "وَشَرَوْهُ بِثَمَنٍ بَخْسٍ دَرَاهِمَ مَعْدُودَةٍ وَكَانُوا فِيهِ مِنَ الزَّاهِدِينَ",
    "وَقَالَ الَّذِي اشْتَرَاهُ مِن مِّصْرَ لِامْرَأَتِهِ أَكْرِمِي مَثْوَاهُ عَسَىٰ أَن يَنفَعَنَا أَوْ نَتَّخِذَهُ وَلَدًا ۚ وَكَذَٰلِكَ مَكَّنَّا لِيُوسُفَ فِي الْأَرْضِ وَلِنُعَلِّمَهُ مِن تَأْوِيلِ الْأَحَادِيثِ ۚ وَاللَّهُ غَالِبٌ عَلَىٰ أَمْرِهِ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ",
    "وَلَمَّا بَلَغَ أَشُدَّهُ آتَيْنَاهُ حُكْمًا وَعِلْمًا ۚ وَكَذَٰلِكَ نَجْزِي الْمُحْسِنِينَ",
    "وَرَاوَدَتْهُ الَّتِي هُوَ فِي بَيْتِهَا عَن نَّفْسِهِ وَغَلَّقَتِ الْأَبْوَابَ وَقَالَتْ هَيْتَ لَكَ ۚ قَالَ مَعَاذَ اللَّهِ ۖ إِنَّهُ رَبِّي أَحْسَنَ مَثْوَايَ ۖ إِنَّهُ لَا يُفْلِحُ الظَّالِمُونَ",
    "وَلَقَدْ هَمَّتْ بِهِ ۖ وَهَمَّ بِهَا لَوْلَا أَن رَّأَىٰ بُرْهَانَ رَبِّهِ ۚ كَذَٰلِكَ لِنَصْرِفَ عَنْهُ السُّوءَ وَالْفَحْشَاءَ ۚ إِنَّهُ مِنْ عِبَادِنَا الْمُخْلَصِينَ",
    "وَاسْتَبَقَا الْبَابَ وَقَدَّتْ قَمِيصَهُ مِن دُبُرٍ وَأَلْفَيَا سَيِّدَهَا لَدَى الْبَابِ ۚ قَالَتْ مَا جَزَاءُ مَنْ أَرَادَ بِأَهْلِكَ سُوءًا إِلَّا أَن يُسْجَنَ أَوْ عَذَابٌ أَلِيمٌ",
    "قَالَ هِيَ رَاوَدَتْنِي عَن نَّفْسِي ۚ وَشَهِدَ شَاهِدٌ مِّنْ أَهْلِهَا إِن كَانَ قَمِيصُهُ قُدَّ مِن قُبُلٍ فَصَدَقَتْ وَهُوَ مِنَ الْكَاذِبِينَ",
    "وَإِن كَانَ قَمِيصُهُ قُدَّ مِن دُبُرٍ فَكَذَبَتْ وَهُوَ مِنَ الصَّادِقِينَ",
    "فَلَمَّا رَأَىٰ قَمِيصَهُ قُدَّ مِن دُبُرٍ قَالَ إِنَّهُ مِن كَيْدِكُنَّ ۖ إِنَّ كَيْدَكُنَّ عَظِيمٌ",
    "يُوسُفُ أَعْرِضْ عَنْ هَٰذَا ۚ وَاسْتَغْفِرِي لِذَنبِكِ ۖ إِنَّكِ كُنتِ مِنَ الْخَاطِئِينَ",
    "وَقَالَ نِسْوَةٌ فِي الْمَدِينَةِ امْرَأَتُ الْعَزِيزِ تُرَاوِدُ فَتَاهَا عَن نَّفْسِهِ ۖ قَدْ شَغَفَهَا حُبًّا ۖ إِنَّا لَنَرَاهَا فِي ضَلَالٍ مُّبِينٍ",
    "فَلَمَّا سَمِعَتْ بِمَكْرِهِنَّ أَرْسَلَتْ إِلَيْهِنَّ وَأَعْتَدَتْ لَهُنَّ مُتَّكَأً وَآتَتْ كُلَّ وَاحِدَةٍ مِّنْهُنَّ سِكِّينًا وَقَالَتِ اخْرُجْ عَلَيْهِنَّ ۖ فَلَمَّا رَأَيْنَهُ أَكْبَرْنَهُ وَقَطَّعْنَ أَيْدِيَهُنَّ وَقُلْنَ حَاشَ لِلَّهِ مَا هَٰذَا بَشَرًا إِنْ هَٰذَا إِلَّا مَلَكٌ كَرِيمٌ",
    "قَالَتْ فَذَٰلِكُنَّ الَّذِي لُمْتُنَّنِي فِيهِ ۖ وَلَقَدْ رَاوَدتُّهُ عَن نَّفْسِهِ فَاسْتَعْصَمَ ۖ وَلَئِن لَّمْ يَفْعَلْ مَا آمُرُهُ لَيُسْجَنَنَّ وَلَيَكُونًا مِّنَ الصَّاغِرِينَ",
    "قَالَ رَبِّ السِّجْنُ أَحَبُّ إِلَيَّ مِمَّا يَدْعُونَنِي إِلَيْهِ ۖ وَإِلَّا تَصْرِفْ عَنِّي كَيْدَهُنَّ أَصْبُ إِلَيْهِنَّ وَأَكُن مِّنَ الْجَاهِلِينَ",
    "فَاسْتَجَابَ لَهُ رَبُّهُ فَصَرَفَ عَنْهُ كَيْدَهُنَّ ۚ إِنَّهُ هُوَ السَّمِيعُ الْعَلِيمُ",
    "ثُمَّ بَدَا لَهُم مِّن بَعْدِ مَا رَأَوُا الْآيَاتِ لَيَسْجُنُنَّهُ حَتَّىٰ حِينٍ",
    "وَدَخَلَ مَعَهُ السِّجْنَ فَتَيَانِ ۖ قَالَ أَحَدُهُمَا إِنِّي أَرَانِي أَعْصِرُ خَمْرًا ۖ وَقَالَ الْآخَرُ إِنِّي أَرَانِي أَحْمِلُ فَوْقَ رَأْسِي خُبْزًا تَأْكُلُ الطَّيْرُ مِنْهُ ۖ نَبِّئْنَا بِتَأْوِيلِهِ ۖ إِنَّا نَرَاكَ مِنَ الْمُحْسِنِينَ",
    "قَالَ لَا يَأْتِيكُمَا طَعَامٌ تُرْزَقَانِهِ إِلَّا نَبَّأْتُكُمَا بِتَأْوِيلِهِ قَبْلَ أَن يَأْتِيَكُمَا ۚ ذَٰلِكُمَا مِمَّا عَلَّمَنِي رَبِّي ۚ إِنِّي تَرَكْتُ مِلَّةَ قَوْمٍ لَّا يُؤْمِنُونَ بِاللَّهِ وَهُم بِالْآخِرَةِ هُمْ كَافِرُونَ",
    "وَاتَّبَعْتُ مِلَّةَ آبَائِي إِبْرَاهِيمَ وَإِسْحَاقَ وَيَعْقُوبَ ۚ مَا كَانَ لَنَا أَن نُّشْرِكَ بِاللَّهِ مِن شَيْءٍ ۚ ذَٰلِكَ مِن فَضْلِ اللَّهِ عَلَيْنَا وَعَلَى النَّاسِ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يَشْكُرُونَ",
    "يَا صَاحِبَيِ السِّجْنِ أَأَرْبَابٌ مُّتَفَرِّقُونَ خَيْرٌ أَمِ اللَّهُ الْوَاحِدُ الْقَهَّارُ",
    "مَا تَعْبُدُونَ مِن دُونِهِ إِلَّا أَسْمَاءً سَمَّيْتُمُوهَا أَنتُمْ وَآبَاؤُكُم مَّا أَنزَلَ اللَّهُ بِهَا مِن سُلْطَانٍ ۚ إِنِ الْحُكْمُ إِلَّا لِلَّهِ ۚ أَمَرَ أَلَّا تَعْبُدُوا إِلَّا إِيَّاهُ ۚ ذَٰلِكَ الدِّينُ الْقَيِّمُ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ",
    "يَا صَاحِبَيِ السِّجْنِ أَمَّا أَحَدُكُمَا فَيَسْقِي رَبَّهُ خَمْرًا ۖ وَأَمَّا الْآخَرُ فَيُصْلَبُ فَتَأْكُلُ الطَّيْرُ مِن رَّأْسِهِ ۚ قُضِيَ الْأَمْرُ الَّذِي فِيهِ تَسْتَفْتِيَانِ",
    "وَقَالَ لِلَّذِي ظَنَّ أَنَّهُ نَاجٍ مِّنْهُمَا اذْكُرْنِي عِندَ رَبِّكَ فَأَنسَاهُ الشَّيْطَانُ ذِكْرَ رَبِّهِ فَلَبِثَ فِي السِّجْنِ بِضْعَ سِنِينَ",
    "وَقَالَ الْمَلِكُ إِنِّي أَرَىٰ سَبْعَ بَقَرَاتٍ سِمَانٍ يَأْكُلُهُنَّ سَبْعٌ عِجَافٌ وَسَبْعَ سُنبُلَاتٍ خُضْرٍ وَأُخَرَ يَابِسَاتٍ ۖ يَا أَيُّهَا الْمَلَأُ أَفْتُونِي فِي رُؤْيَايَ إِن كُنتُمْ لِلرُّؤْيَا تَعْبُرُونَ",
    "قَالُوا أَضْغَاثُ أَحْلَامٍ ۖ وَمَا نَحْنُ بِتَأْوِيلِ الْأَحْلَامِ بِعَالِمِينَ",
    "وَقَالَ الَّذِي نَجَا مِنْهُمَا وَادَّكَرَ بَعْدَ أُمَّةٍ أَنَا أُنَبِّئُكُم بِتَأْوِيلِهِ فَأَرْسِلُونِ",
    "يُوسُفُ أَيُّهَا الصِّدِّيقُ أَفْتِنَا فِي سَبْعِ بَقَرَاتٍ سِمَانٍ يَأْكُلُهُنَّ سَبْعٌ عِجَافٌ وَسَبْعِ سُنبُلَاتٍ خُضْرٍ وَأُخَرَ يَابِسَاتٍ لَّعَلِّي أَرْجِعُ إِلَى النَّاسِ لَعَلَّهُمْ يَعْلَمُونَ",
    "قَالَ تَزْرَعُونَ سَبْعَ سِنِينَ دَأَبًا فَمَا حَصَدتُّمْ فَذَرُوهُ فِي سُنبُلِهِ إِلَّا قَلِيلًا مِّمَّا تَأْكُلُونَ",
    "ثُمَّ يَأْتِي مِن بَعْدِ ذَٰلِكَ سَبْعٌ شِدَادٌ يَأْكُلْنَ مَا قَدَّمْتُمْ لَهُنَّ إِلَّا قَلِيلًا مِّمَّا تُحْصِنُونَ",
    "ثُمَّ يَأْتِي مِن بَعْدِ ذَٰلِكَ عَامٌ فِيهِ يُغَاثُ النَّاسُ وَفِيهِ يَعْصِرُونَ",
    "وَقَالَ الْمَلِكُ ائْتُونِي بِهِ ۖ فَلَمَّا جَاءَهُ الرَّسُولُ قَالَ ارْجِعْ إِلَىٰ رَبِّكَ فَاسْأَلْهُ مَا بَالُ النِّسْوَةِ اللَّاتِي قَطَّعْنَ أَيْدِيَهُنَّ ۚ إِنَّ رَبِّي بِكَيْدِهِنَّ عَلِيمٌ",
    "قَالَ مَا خَطْبُكُنَّ إِذْ رَاوَدتُّنَّ يُوسُفَ عَن نَّفْسِهِ ۚ قُلْنَ حَاشَ لِلَّهِ مَا عَلِمْنَا عَلَيْهِ مِن سُوءٍ ۚ قَالَتِ امْرَأَتُ الْعَزِيزِ الْآنَ حَصْحَصَ الْحَقُّ أَنَا رَاوَدتُّهُ عَن نَّفْسِهِ وَإِنَّهُ لَمِنَ الصَّادِقِينَ",
    "ذَٰلِكَ لِيَعْلَمَ أَنِّي لَمْ أَخُنْهُ بِالْغَيْبِ وَأَنَّ اللَّهَ لَا يَهْدِي كَيْدَ الْخَائِنِينَ",
    "وَمَا أُبَرِّئُ نَفْسِي ۚ إِنَّ النَّفْسَ لَأَمَّارَةٌ بِالسُّوءِ إِلَّا مَا رَحِمَ رَبِّي ۚ إِنَّ رَبِّي غَفُورٌ رَّحِيمٌ",
    "وَقَالَ الْمَلِكُ ائْتُونِي بِهِ أَسْتَخْلِصْهُ لِنَفْسِي ۖ فَلَمَّا كَلَّمَهُ قَالَ إِنَّكَ الْيَوْمَ لَدَيْنَا مَكِينٌ أَمِينٌ",
    "قَالَ اجْعَلْنِي عَلَىٰ خَزَائِنِ الْأَرْضِ ۖ إِنِّي حَفِيظٌ عَلِيمٌ",
    "وَكَذَٰلِكَ مَكَّنَّا لِيُوسُفَ فِي الْأَرْضِ يَتَبَوَّأُ مِنْهَا حَيْثُ يَشَاءُ ۚ نُصِيبُ بِرَحْمَتِنَا مَن نَّشَاءُ ۖ وَلَا نُضِيعُ أَجْرَ الْمُحْسِنِينَ",
    "وَلَأَجْرُ الْآخِرَةِ خَيْرٌ لِّلَّذِينَ آمَنُوا وَكَانُوا يَتَّقُونَ",
    "وَجَاءَ إِخْوَةُ يُوسُفَ فَدَخَلُوا عَلَيْهِ فَعَرَفَهُمْ وَهُمْ لَهُ مُنكِرُونَ",
    "وَلَمَّا جَهَّزَهُم بِجَهَازِهِمْ قَالَ ائْتُونِي بِأَخٍ لَّكُم مِّنْ أَبِيكُمْ ۚ أَلَا تَرَوْنَ أَنِّي أُوفِي الْكَيْلَ وَأَنَا خَيْرُ الْمُنزِلِينَ",
    "فَإِن لَّمْ تَأْتُونِي بِهِ فَلَا كَيْلَ لَكُمْ عِندِي وَلَا تَقْرَبُونِ",
    "قَالُوا سَنُرَاوِدُ عَنْهُ أَبَاهُ وَإِنَّا لَفَاعِلُونَ",
    "وَقَالَ لِفِتْيَانِهِ اجْعَلُوا بِضَاعَتَهُمْ فِي رِحَالِهِمْ لَعَلَّهُمْ يَعْرِفُونَهَا إِذَا انقَلَبُوا إِلَىٰ أَهْلِهِمْ لَعَلَّهُمْ يَرْجِعُونَ",
    "فَلَمَّا رَجَعُوا إِلَىٰ أَبِيهِمْ قَالُوا يَا أَبَانَا مُنِعَ مِنَّا الْكَيْلُ فَأَرْسِلْ مَعَنَا أَخَانَا نَكْتَلْ وَإِنَّا لَهُ لَحَافِظُونَ",
    "قَالَ هَلْ آمَنُكُمْ عَلَيْهِ إِلَّا كَمَا أَمِنتُكُمْ عَلَىٰ أَخِيهِ مِن قَبْلُ ۖ فَاللَّهُ خَيْرٌ حَافِظًا ۖ وَهُوَ أَرْحَمُ الرَّاحِمِينَ",
    "وَلَمَّا فَتَحُوا مَتَاعَهُمْ وَجَدُوا بِضَاعَتَهُمْ رُدَّتْ إِلَيْهِمْ ۖ قَالُوا يَا أَبَانَا مَا نَبْغِي ۖ هَٰذِهِ بِضَاعَتُنَا رُدَّتْ إِلَيْنَا ۖ وَنَمِيرُ أَهْلَنَا وَنَحْفَظُ أَخَانَا وَنَزْدَادُ كَيْلَ بَعِيرٍ ۖ ذَٰلِكَ كَيْلٌ يَسِيرٌ",
    "قَالَ لَنْ أُرْسِلَهُ مَعَكُمْ حَتَّىٰ تُؤْتُونِ مَوْثِقًا مِّنَ اللَّهِ لَتَأْتُنَّنِي بِهِ إِلَّا أَن يُحَاطَ بِكُمْ ۖ فَلَمَّا آتَوْهُ مَوْثِقَهُمْ قَالَ اللَّهُ عَلَىٰ مَا نَقُولُ وَكِيلٌ",
    "وَقَالَ يَا بَنِيَّ لَا تَدْخُلُوا مِن بَابٍ وَاحِدٍ وَادْخُلُوا مِنْ أَبْوَابٍ مُّتَفَرِّقَةٍ ۖ وَمَا أُغْنِي عَنكُم مِّنَ اللَّهِ مِن شَيْءٍ ۖ إِنِ الْحُكْمُ إِلَّا لِلَّهِ ۖ عَلَيْهِ تَوَكَّلْتُ ۖ وَعَلَيْهِ فَلْيَتَوَكَّلِ الْمُتَوَكِّلُونَ",
    "وَلَمَّا دَخَلُوا مِنْ حَيْثُ أَمَرَهُمْ أَبُوهُم مَّا كَانَ يُغْنِي عَنْهُم مِّنَ اللَّهِ مِن شَيْءٍ إِلَّا حَاجَةً فِي نَفْسِ يَعْقُوبَ قَضَاهَا ۚ وَإِنَّهُ لَذُو عِلْمٍ لِّمَا عَلَّمْنَاهُ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ",
    "وَلَمَّا دَخَلُوا عَلَىٰ يُوسُفَ آوَىٰ إِلَيْهِ أَخَاهُ ۖ قَالَ إِنِّي أَنَا أَخُوكَ فَلَا تَبْتَئِسْ بِمَا كَانُوا يَعْمَلُونَ",
    "فَلَمَّا جَهَّزَهُم بِجَهَازِهِمْ جَعَلَ السِّقَايَةَ فِي رَحْلِ أَخِيهِ ثُمَّ أَذَّنَ مُؤَذِّنٌ أَيَّتُهَا الْعِيرُ إِنَّكُمْ لَسَارِقُونَ",
    "قَالُوا وَأَقْبَلُوا عَلَيْهِم مَّاذَا تَفْقِدُونَ",
    "قَالُوا نَفْقِدُ صُوَاعَ الْمَلِكِ وَلِمَن جَاءَ بِهِ حِمْلُ بَعِيرٍ وَأَنَا بِهِ زَعِيمٌ",
    "قَالُوا تَاللَّهِ لَقَدْ عَلِمْتُم مَّا جِئْنَا لِنُفْسِدَ فِي الْأَرْضِ وَمَا كُنَّا سَارِقِينَ",
    "قَالُوا فَمَا جَزَاؤُهُ إِن كُنتُمْ كَاذِبِينَ",
    "قَالُوا جَزَاؤُهُ مَن وُجِدَ فِي رَحْلِهِ فَهُوَ جَزَاؤُهُ ۚ كَذَٰلِكَ نَجْزِي الظَّالِمِينَ",
    "فَبَدَأَ بِأَوْعِيَتِهِمْ قَبْلَ وِعَاءِ أَخِيهِ ثُمَّ اسْتَخْرَجَهَا مِن وِعَاءِ أَخِيهِ ۚ كَذَٰلِكَ كِدْنَا لِيُوسُفَ ۖ مَا كَانَ لِيَأْخُذَ أَخَاهُ فِي دِينِ الْمَلِكِ إِلَّا أَن يَشَاءَ اللَّهُ ۚ نَرْفَعُ دَرَجَاتٍ مَّن نَّشَاءُ ۗ وَفَوْقَ كُلِّ ذِي عِلْمٍ عَلِيمٌ",
    "قَالُوا إِن يَسْرِقْ فَقَدْ سَرَقَ أَخٌ لَّهُ مِن قَبْلُ ۚ فَأَسَرَّهَا يُوسُفُ فِي نَفْسِهِ وَلَمْ يُبْدِهَا لَهُمْ ۚ قَالَ أَنتُمْ شَرٌّ مَّكَانًا ۖ وَاللَّهُ أَعْلَمُ بِمَا تَصِفُونَ",
    "قَالُوا يَا أَيُّهَا الْعَزِيزُ إِنَّ لَهُ أَبًا شَيْخًا كَبِيرًا فَخُذْ أَحَدَنَا مَكَانَهُ ۖ إِنَّا نَرَاكَ مِنَ الْمُحْسِنِينَ",
    "قَالَ مَعَاذَ اللَّهِ أَن نَّأْخُذَ إِلَّا مَن وَجَدْنَا مَتَاعَنَا عِندَهُ إِنَّا إِذًا لَّظَالِمُونَ",
    "فَلَمَّا اسْتَيْأَسُوا مِنْهُ خَلَصُوا نَجِيًّا ۖ قَالَ كَبِيرُهُمْ أَلَمْ تَعْلَمُوا أَنَّ أَبَاكُمْ قَدْ أَخَذَ عَلَيْكُم مَّوْثِقًا مِّنَ اللَّهِ وَمِن قَبْلُ مَا فَرَّطتُمْ فِي يُوسُفَ ۖ فَلَنْ أَبْرَحَ الْأَرْضَ حَتَّىٰ يَأْذَنَ لِي أَبِي أَوْ يَحْكُمَ اللَّهُ لِي ۖ وَهُوَ خَيْرُ الْحَاكِمِينَ",
    "ارْجِعُوا إِلَىٰ أَبِيكُمْ فَقُولُوا يَا أَبَانَا إِنَّ ابْنَكَ سَرَقَ وَمَا شَهِدْنَا إِلَّا بِمَا عَلِمْنَا وَمَا كُنَّا لِلْغَيْبِ حَافِظِينَ",
    "وَاسْأَلِ الْقَرْيَةَ الَّتِي كُنَّا فِيهَا وَالْعِيرَ الَّتِي أَقْبَلْنَا فِيهَا ۖ وَإِنَّا لَصَادِقُونَ",
    "قَالَ بَلْ سَوَّلَتْ لَكُمْ أَنفُسُكُمْ أَمْرًا ۖ فَصَبْرٌ جَمِيلٌ ۖ عَسَى اللَّهُ أَن يَأْتِيَنِي بِهِمْ جَمِيعًا ۚ إِنَّهُ هُوَ الْعَلِيمُ الْحَكِيمُ",
    "وَتَوَلَّىٰ عَنْهُمْ وَقَالَ يَا أَسَفَىٰ عَلَىٰ يُوسُفَ وَابْيَضَّتْ عَيْنَاهُ مِنَ الْحُزْنِ فَهُوَ كَظِيمٌ",
    "قَالُوا تَاللَّهِ تَفْتَأُ تَذْكُرُ يُوسُفَ حَتَّىٰ تَكُونَ حَرَضًا أَوْ تَكُونَ مِنَ الْهَالِكِينَ",
    "قَالَ إِنَّمَا أَشْكُو بَثِّي وَحُزْنِي إِلَى اللَّهِ وَأَعْلَمُ مِنَ اللَّهِ مَا لَا تَعْلَمُونَ",
    "يَا بَنِيَّ اذْهَبُوا فَتَحَسَّسُوا مِن يُوسُفَ وَأَخِيهِ وَلَا تَيْأَسُوا مِن رَّوْحِ اللَّهِ ۖ إِنَّهُ لَا يَيْأَسُ مِن رَّوْحِ اللَّهِ إِلَّا الْقَوْمُ الْكَافِرُونَ",
    "فَلَمَّا دَخَلُوا عَلَيْهِ قَالُوا يَا أَيُّهَا الْعَزِيزُ مَسَّنَا وَأَهْلَنَا الضُّرُّ وَجِئْنَا بِبِضَاعَةٍ مُّزْجَاةٍ فَأَوْفِ لَنَا الْكَيْلَ وَتَصَدَّقْ عَلَيْنَا ۖ إِنَّ اللَّهَ يَجْزِي الْمُتَصَدِّقِينَ",
    "قَالَ هَلْ عَلِمْتُم مَّا فَعَلْتُم بِيُوسُفَ وَأَخِيهِ إِذْ أَنتُمْ جَاهِلُونَ",
    "قَالُوا أَإِنَّكَ لَأَنتَ يُوسُفُ ۖ قَالَ أَنَا يُوسُفُ وَهَٰذَا أَخِي ۖ قَدْ مَنَّ اللَّهُ عَلَيْنَا ۖ إِنَّهُ مَن يَتَّقِ وَيَصْبِرْ فَإِنَّ اللَّهَ لَا يُضِيعُ أَجْرَ الْمُحْسِنِينَ",
    "قَالُوا تَاللَّهِ لَقَدْ آثَرَكَ اللَّهُ عَلَيْنَا وَإِن كُنَّا لَخَاطِئِينَ",
    "قَالَ لَا تَثْرِيبَ عَلَيْكُمُ الْيَوْمَ ۖ يَغْفِرُ اللَّهُ لَكُمْ ۖ وَهُوَ أَرْحَمُ الرَّاحِمِينَ",
    "اذْهَبُوا بِقَمِيصِي هَٰذَا فَأَلْقُوهُ عَلَىٰ وَجْهِ أَبِي يَأْتِ بَصِيرًا وَأْتُونِي بِأَهْلِكُمْ أَجْمَعِينَ",
    "وَلَمَّا فَصَلَتِ الْعِيرُ قَالَ أَبُوهُمْ إِنِّي لَأَجِدُ رِيحَ يُوسُفَ ۖ لَوْلَا أَن تُفَنِّدُونِ",
    "قَالُوا تَاللَّهِ إِنَّكَ لَفِي ضَلَالِكَ الْقَدِيمِ",
    "فَلَمَّا أَن جَاءَ الْبَشِيرُ أَلْقَاهُ عَلَىٰ وَجْهِهِ فَارْتَدَّ بَصِيرًا ۖ قَالَ أَلَمْ أَقُل لَّكُمْ إِنِّي أَعْلَمُ مِنَ اللَّهِ مَا لَا تَعْلَمُونَ",
    "قَالُوا يَا أَبَانَا اسْتَغْفِرْ لَنَا ذُنُوبَنَا إِنَّا كُنَّا خَاطِئِينَ",
    "قَالَ سَوْفَ أَسْتَغْفِرُ لَكُمْ رَبِّي ۖ إِنَّهُ هُوَ الْغَفُورُ الرَّحِيمُ",
    "فَلَمَّا دَخَلُوا عَلَىٰ يُوسُفَ آوَىٰ إِلَيْهِ أَبَوَيْهِ وَقَالَ ادْخُلُوا مِصْرَ إِن شَاءَ اللَّهُ آمِنِينَ",
    "وَرَفَعَ أَبَوَيْهِ عَلَى الْعَرْشِ وَخَرُّوا لَهُ سُجَّدًا ۖ وَقَالَ يَا أَبَتِ هَٰذَا تَأْوِيلُ رُؤْيَايَ مِن قَبْلُ قَدْ جَعَلَهَا رَبِّي حَقًّا ۖ وَقَدْ أَحْسَنَ بِي إِذْ أَخْرَجَنِي مِنَ السِّجْنِ وَجَاءَ بِكُم مِّنَ الْبَدْوِ مِن بَعْدِ أَن نَّزَغَ الشَّيْطَانُ بَيْنِي وَبَيْنَ إِخْوَتِي ۚ إِنَّ رَبِّي لَطِيفٌ لِّمَا يَشَاءُ ۚ إِنَّهُ هُوَ الْعَلِيمُ الْحَكِيمُ",
    "رَبِّ قَدْ آتَيْتَنِي مِنَ الْمُلْكِ وَعَلَّمْتَنِي مِن تَأْوِيلِ الْأَحَادِيثِ ۚ فَاطِرَ السَّمَاوَاتِ وَالْأَرْضِ أَنتَ وَلِيِّي فِي الدُّنْيَا وَالْآخِرَةِ ۖ تَوَفَّنِي مُسْلِمًا وَأَلْحِقْنِي بِالصَّالِحِينَ",
    "ذَٰلِكَ مِنْ أَنبَاءِ الْغَيْبِ نُوحِيهِ إِلَيْكَ ۖ وَمَا كُنتَ لَدَيْهِمْ إِذْ أَجْمَعُوا أَمْرَهُمْ وَهُمْ يَمْكُرُونَ",
    "وَمَا أَكْثَرُ النَّاسِ وَلَوْ حَرَصْتَ بِمُؤْمِنِينَ",
    "وَمَا تَسْأَلُهُمْ عَلَيْهِ مِنْ أَجْرٍ ۚ إِنْ هُوَ إِلَّا ذِكْرٌ لِّلْعَالَمِينَ",
    "وَكَأَيِّن مِّنْ آيَةٍ فِي السَّمَاوَاتِ وَالْأَرْضِ يَمُرُّونَ عَلَيْهَا وَهُمْ عَنْهَا مُعْرِضُونَ",
    "وَمَا يُؤْمِنُ أَكْثَرُهُم بِاللَّهِ إِلَّا وَهُم مُّشْرِكُونَ",
    "أَفَأَمِنُوا أَن تَأْتِيَهُمْ غَاشِيَةٌ مِّنْ عَذَابِ اللَّهِ أَوْ تَأْتِيَهُمُ السَّاعَةُ بَغْتَةً وَهُمْ لَا يَشْعُرُونَ",
    "قُلْ هَٰذِهِ سَبِيلِي أَدْعُو إِلَى اللَّهِ ۚ عَلَىٰ بَصِيرَةٍ أَنَا وَمَنِ اتَّبَعَنِي ۖ وَسُبْحَانَ اللَّهِ وَمَا أَنَا مِنَ الْمُشْرِكِينَ",
    "وَمَا أَرْسَلْنَا مِن قَبْلِكَ إِلَّا رِجَالًا نُّوحِي إِلَيْهِم مِّنْ أَهْلِ الْقُرَىٰ ۗ أَفَلَمْ يَسِيرُوا فِي الْأَرْضِ فَيَنظُرُوا كَيْفَ كَانَ عَاقِبَةُ الَّذِينَ مِن قَبْلِهِمْ ۗ وَلَدَارُ الْآخِرَةِ خَيْرٌ لِّلَّذِينَ اتَّقَوْا ۗ أَفَلَا تَعْقِلُونَ",
    "حَتَّىٰ إِذَا اسْتَيْأَسَ الرُّسُلُ وَظَنُّوا أَنَّهُمْ قَدْ كُذِبُوا جَاءَهُمْ نَصْرُنَا فَنُجِّيَ مَن نَّشَاءُ ۖ وَلَا يُرَدُّ بَأْسُنَا عَنِ الْقَوْمِ الْمُجْرِمِينَ",
    "لَقَدْ كَانَ فِي قَصَصِهِمْ عِبْرَةٌ لِّأُولِي الْأَلْبَابِ ۗ مَا كَانَ حَدِيثًا يُفْتَرَىٰ وَلَٰكِن تَصْدِيقَ الَّذِي بَيْنَ يَدَيْهِ وَتَفْصِيلَ كُلِّ شَيْءٍ وَهُدًى وَرَحْمَةً لِّقَوْمٍ يُؤْمِنُونَ",
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
            "Sahih International", ""};

    String [] english_verses = {"Alif, Lam, Ra. These are the verses of the clear Book.",
    "Indeed, We have sent it down as an Arabic Qur'an that you might understand.",
    "We relate to you, [O Muhammad], the best of stories in what We have revealed to you of this Qur'an although you were, before it, among the unaware.",
    "[Of these stories mention] when Joseph said to his father, \"O my father, indeed I have seen [in a dream] eleven stars and the sun and the moon; I saw them prostrating to me.\"",
    "He said, \"O my son, do not relate your vision to your brothers or they will contrive against you a plan. Indeed Satan, to man, is a manifest enemy.",
    "And thus will your Lord choose you and teach you the interpretation of narratives and complete His favor upon you and upon the family of Jacob, as He completed it upon your fathers before, Abraham and Isaac. Indeed, your Lord is Knowing and Wise.\"",
    "Certainly were there in Joseph and his brothers signs for those who ask,",
    "When they said, \"Joseph and his brother are more beloved to our father than we, while we are a clan. Indeed, our father is in clear error.",
    "Kill Joseph or cast him out to [another] land; the countenance of your father will [then] be only for you, and you will be after that a righteous people.\"",
    "Said a speaker among them, \"Do not kill Joseph but throw him into the bottom of the well; some travelers will pick him up - if you would do [something].\"",
    "They said, \"O our father, why do you not entrust us with Joseph while indeed, we are to him sincere counselors?",
    "Send him with us tomorrow that he may eat well and play. And indeed, we will be his guardians.",
    "[Jacob] said, \"Indeed, it saddens me that you should take him, and I fear that a wolf would eat him while you are of him unaware.\"",
    "They said, \"If a wolf should eat him while we are a [strong] clan, indeed, we would then be losers.\"",
    "So when they took him [out] and agreed to put him into the bottom of the well... But We inspired to him, \"You will surely inform them [someday] about this affair of theirs while they do not perceive [your identity].\"",
    "And they came to their father at night, weeping.",
    "They said, \"O our father, indeed we went racing each other and left Joseph with our possessions, and a wolf ate him. But you would not believe us, even if we were truthful.\"",
    "And they brought upon his shirt false blood. [Jacob] said, \"Rather, your souls have enticed you to something, so patience is most fitting. And Allah is the one sought for help against that which you describe.\"",
    "And there came a company of travelers; then they sent their water drawer, and he let down his bucket. He said, \"Good news! Here is a boy.\" And they concealed him, [taking him] as merchandise; and Allah was knowing of what they did.",
    "And they sold him for a reduced price - a few dirhams - and they were, concerning him, of those content with little.",
    "And the one from Egypt who bought him said to his wife, \"Make his residence comfortable. Perhaps he will benefit us, or we will adopt him as a son.\" And thus, We established Joseph in the land that We might teach him the interpretation of events. And Allah is predominant over His affair, but most of the people do not know.",
    "And when Joseph reached maturity, We gave him judgment and knowledge. And thus We reward the doers of good.",
    "And she, in whose house he was, sought to seduce him. She closed the doors and said, \"Come, you.\" He said, \"[I seek] the refuge of Allah. Indeed, he is my master, who has made good my residence. Indeed, wrongdoers will not succeed.\"",
    "And she certainly determined [to seduce] him, and he would have inclined to her had he not seen the proof of his Lord. And thus [it was] that We should avert from him evil and immorality. Indeed, he was of Our chosen servants.",
    "And they both raced to the door, and she tore his shirt from the back, and they found her husband at the door. She said, \"What is the recompense of one who intended evil for your wife but that he be imprisoned or a painful punishment?\"",
    "[Joseph] said, \"It was she who sought to seduce me.\" And a witness from her family testified. \"If his shirt is torn from the front, then she has told the truth, and he is of the liars.",
    "But if his shirt is torn from the back, then she has lied, and he is of the truthful.\"",
    "So when her husband saw his shirt torn from the back, he said, \"Indeed, it is of the women's plan. Indeed, your plan is great.",
    "Joseph, ignore this. And, [my wife], ask forgiveness for your sin. Indeed, you were of the sinful.\"",
    "And women in the city said, \"The wife of al-'Azeez is seeking to seduce her slave boy; he has impassioned her with love. Indeed, we see her [to be] in clear error.\"",
    "So when she heard of their scheming, she sent for them and prepared for them a banquet and gave each one of them a knife and said [to Joseph], \"Come out before them.\" And when they saw him, they greatly admired him and cut their hands and said, \"Perfect is Allah ! This is not a man; this is none but a noble angel.\"",
    "She said, \"That is the one about whom you blamed me. And I certainly sought to seduce him, but he firmly refused; and if he will not do what I order him, he will surely be imprisoned and will be of those debased.\"",
    "He said, \"My Lord, prison is more to my liking than that to which they invite me. And if You do not avert from me their plan, I might incline toward them and [thus] be of the ignorant.\"",
    "So his Lord responded to him and averted from him their plan. Indeed, He is the Hearing, the Knowing.",
    "Then it appeared to them after they had seen the signs that al-'Azeez should surely imprison him for a time.",
    "And there entered the prison with him two young men. One of them said, \"Indeed, I have seen myself [in a dream] pressing wine.\" The other said, \"Indeed, I have seen myself carrying upon my head [some] bread, from which the birds were eating. Inform us of its interpretation; indeed, we see you to be of those who do good.\"",
    "He said, \"You will not receive food that is provided to you except that I will inform you of its interpretation before it comes to you. That is from what my Lord has taught me. Indeed, I have left the religion of a people who do not believe in Allah, and they, in the Hereafter, are disbelievers.",
    "And I have followed the religion of my fathers, Abraham, Isaac and Jacob. And it was not for us to associate anything with Allah. That is from the favor of Allah upon us and upon the people, but most of the people are not grateful.",
    "O [my] two companions of prison, are separate lords better or Allah, the One, the Prevailing?",
    "You worship not besides Him except [mere] names you have named them, you and your fathers, for which Allah has sent down no authority. Legislation is not but for Allah. He has commanded that you worship not except Him. That is the correct religion, but most of the people do not know.",
    "O two companions of prison, as for one of you, he will give drink to his master of wine; but as for the other, he will be crucified, and the birds will eat from his head. The matter has been decreed about which you both inquire.\"",
    "And he said to the one whom he knew would go free, \"Mention me before your master.\" But Satan made him forget the mention [to] his master, and Joseph remained in prison several years.",
    "And [subsequently] the king said, \"Indeed, I have seen [in a dream] seven fat cows being eaten by seven [that were] lean, and seven green spikes [of grain] and others [that were] dry. O eminent ones, explain to me my vision, if you should interpret visions.\"",
    "They said, \"[It is but] a mixture of false dreams, and we are not learned in the interpretation of dreams.\"",
    "But the one who was freed and remembered after a time said, \"I will inform you of its interpretation, so send me forth.\"",
    "[He said], \"Joseph, O man of truth, explain to us about seven fat cows eaten by seven [that were] lean, and seven green spikes [of grain] and others [that were] dry - that I may return to the people; perhaps they will know [about you].\"",
    "[Joseph] said, \"You will plant for seven years consecutively; and what you harvest leave in its spikes, except a little from which you will eat.",
    "Then will come after that seven difficult [years] which will consume what you saved for them, except a little from which you will store.",
    "Then will come after that a year in which the people will be given rain and in which they will press [olives and grapes].\"",
    "And the king said, \"Bring him to me.\" But when the messenger came to him, [Joseph] said, \"Return to your master and ask him what is the case of the women who cut their hands. Indeed, my Lord is Knowing of their plan.\"",
    "Said [the king to the women], \"What was your condition when you sought to seduce Joseph?\" They said, \"Perfect is Allah ! We know about him no evil.\" The wife of al-'Azeez said, \"Now the truth has become evident. It was I who sought to seduce him, and indeed, he is of the truthful.",
    "That is so al-'Azeez will know that I did not betray him in [his] absence and that Allah does not guide the plan of betrayers.",
    "And I do not acquit myself. Indeed, the soul is a persistent enjoiner of evil, except those upon which my Lord has mercy. Indeed, my Lord is Forgiving and Merciful.\"",
    "And the king said, \"Bring him to me; I will appoint him exclusively for myself.\" And when he spoke to him, he said, \"Indeed, you are today established [in position] and trusted.\"",
    "[Joseph] said, \"Appoint me over the storehouses of the land. Indeed, I will be a knowing guardian.\"",
    "And thus We established Joseph in the land to settle therein wherever he willed. We touch with Our mercy whom We will, and We do not allow to be lost the reward of those who do good.",
    "And the reward of the Hereafter is better for those who believed and were fearing Allah.",
    "And the brothers of Joseph came [seeking food], and they entered upon him; and he recognized them, but he was to them unknown.",
    "And when he had furnished them with their supplies, he said, \"Bring me a brother of yours from your father. Do not you see that I give full measure and that I am the best of accommodators?",
    "But if you do not bring him to me, no measure will there be [hereafter] for you from me, nor will you approach me.\"",
    "They said, \"We will attempt to dissuade his father from [keeping] him, and indeed, we will do [it].\"",
    "And [Joseph] said to his servants, \"Put their merchandise into their saddlebags so they might recognize it when they have gone back to their people that perhaps they will [again] return.\"",
    "So when they returned to their father, they said, \"O our father, [further] measure has been denied to us, so send with us our brother [that] we will be given measure. And indeed, we will be his guardians.\"",
    "He said, \"Should I entrust you with him except [under coercion] as I entrusted you with his brother before? But Allah is the best guardian, and He is the most merciful of the merciful.\"",
    "And when they opened their baggage, they found their merchandise returned to them. They said, \"O our father, what [more] could we desire? This is our merchandise returned to us. And we will obtain supplies for our family and protect our brother and obtain an increase of a camel's load; that is an easy measurement.\"",
    "[Jacob] said, \"Never will I send him with you until you give me a promise by Allah that you will bring him [back] to me, unless you should be surrounded by enemies.\" And when they had given their promise, he said, \"Allah, over what we say, is Witness.\"",
    "And he said, \"O my sons, do not enter from one gate but enter from different gates; and I cannot avail you against [the decree of] Allah at all. The decision is only for Allah; upon Him I have relied, and upon Him let those who would rely [indeed] rely.\"",
    "And when they entered from where their father had ordered them, it did not avail them against Allah at all except [it was] a need within the soul of Jacob, which he satisfied. And indeed, he was a possessor of knowledge because of what We had taught him, but most of the people do not know.",
    "And when they entered upon Joseph, he took his brother to himself; he said, \"Indeed, I am your brother, so do not despair over what they used to do [to me].\"",
    "So when he had furnished them with their supplies, he put the [gold measuring] bowl into the bag of his brother. Then an announcer called out, \"O caravan, indeed you are thieves.\"",
    "They said while approaching them, \"What is it you are missing?\"",
    "They said, \"We are missing the measure of the king. And for he who produces it is [the reward of] a camel's load, and I am responsible for it.\"",
    "They said, \"By Allah, you have certainly known that we did not come to cause corruption in the land, and we have not been thieves.\"",
    "The accusers said, \"Then what would be its recompense if you should be liars?\"",
    "[The brothers] said, \"Its recompense is that he in whose bag it is found - he [himself] will be its recompense. Thus do we recompense the wrongdoers.\"",
    "So he began [the search] with their bags before the bag of his brother; then he extracted it from the bag of his brother. Thus did We plan for Joseph. He could not have taken his brother within the religion of the king except that Allah willed. We raise in degrees whom We will, but over every possessor of knowledge is one [more] knowing.",
    "They said, \"If he steals - a brother of his has stolen before.\" But Joseph kept it within himself and did not reveal it to them. He said, \"You are worse in position, and Allah is most knowing of what you describe.\"",
    "They said, \"O 'Azeez, indeed he has a father [who is] an old man, so take one of us in place of him. Indeed, we see you as a doer of good.\"",
    "He said, \"[I seek] the refuge of Allah [to prevent] that we take except him with whom we found our possession. Indeed, we would then be unjust.\"",
    "So when they had despaired of him, they secluded themselves in private consultation. The eldest of them said, \"Do you not know that your father has taken upon you an oath by Allah and [that] before you failed in [your duty to] Joseph? So I will never leave [this] land until my father permits me or Allah decides for me, and He is the best of judges.",
    "Return to your father and say, \"O our father, indeed your son has stolen, and we did not testify except to what we knew. And we were not witnesses of the unseen,",
    "And ask the city in which we were and the caravan in which we came - and indeed, we are truthful,\"",
    "[Jacob] said, \"Rather, your souls have enticed you to something, so patience is most fitting. Perhaps Allah will bring them to me all together. Indeed it is He who is the Knowing, the Wise.\"",
    "And he turned away from them and said, \"Oh, my sorrow over Joseph,\" and his eyes became white from grief, for he was [of that] a suppressor.",
    "They said, \"By Allah, you will not cease remembering Joseph until you become fatally ill or become of those who perish.\"",
    "He said, \"I only complain of my suffering and my grief to Allah, and I know from Allah that which you do not know.",
    "O my sons, go and find out about Joseph and his brother and despair not of relief from Allah. Indeed, no one despairs of relief from Allah except the disbelieving people.\"",
    "So when they entered upon Joseph, they said, \"O 'Azeez, adversity has touched us and our family, and we have come with goods poor in quality, but give us full measure and be charitable to us. Indeed, Allah rewards the charitable.\"",
    "He said, \"Do you know what you did with Joseph and his brother when you were ignorant?\"",
    "They said, \"Are you indeed Joseph?\" He said \"I am Joseph, and this is my brother. Allah has certainly favored us. Indeed, he who fears Allah and is patient, then indeed, Allah does not allow to be lost the reward of those who do good.\"",
    "They said, \"By Allah, certainly has Allah preferred you over us, and indeed, we have been sinners.\"",
    "He said, \"No blame will there be upon you today. Allah will forgive you; and He is the most merciful of the merciful.\"",
    "Take this, my shirt, and cast it over the face of my father; he will become seeing. And bring me your family, all together.\"",
    "And when the caravan departed [from Egypt], their father said, \"Indeed, I find the smell of Joseph [and would say that he was alive] if you did not think me weakened in mind.\"",
    "They said, \"By Allah, indeed you are in your [same] old error.\"",
    "And when the bearer of good tidings arrived, he cast it over his face, and he returned [once again] seeing. He said, \"Did I not tell you that I know from Allah that which you do not know?\"",
    "They said, \"O our father, ask for us forgiveness of our sins; indeed, we have been sinners.\"",
    "He said, \"I will ask forgiveness for you from my Lord. Indeed, it is He who is the Forgiving, the Merciful.\"",
    "And when they entered upon Joseph, he took his parents to himself and said, \"Enter Egypt, Allah willing, safe [and secure].\"",
    "And he raised his parents upon the throne, and they bowed to him in prostration. And he said, \"O my father, this is the explanation of my vision of before. My Lord has made it reality. And He was certainly good to me when He took me out of prison and brought you [here] from bedouin life after Satan had induced [estrangement] between me and my brothers. Indeed, my Lord is Subtle in what He wills. Indeed, it is He who is the Knowing, the Wise.",
    "My Lord, You have given me [something] of sovereignty and taught me of the interpretation of dreams. Creator of the heavens and earth, You are my protector in this world and in the Hereafter. Cause me to die a Muslim and join me with the righteous.\"",
    "That is from the news of the unseen which We reveal, [O Muhammad], to you. And you were not with them when they put together their plan while they conspired.",
    "And most of the people, although you strive [for it], are not believers.",
    "And you do not ask of them for it any payment. It is not except a reminder to the worlds.",
    "And how many a sign within the heavens and earth do they pass over while they, therefrom, are turning away.",
    "And most of them believe not in Allah except while they associate others with Him.",
    "Then do they feel secure that there will not come to them an overwhelming [aspect] of the punishment of Allah or that the Hour will not come upon them suddenly while they do not perceive?",
    "Say, \"This is my way; I invite to Allah with insight, I and those who follow me. And exalted is Allah; and I am not of those who associate others with Him.\"",
    "And We sent not before you [as messengers] except men to whom We revealed from among the people of cities. So have they not traveled through the earth and observed how was the end of those before them? And the home of the Hereafter is best for those who fear Allah; then will you not reason?",
    "[They continued] until, when the messengers despaired and were certain that they had been denied, there came to them Our victory, and whoever We willed was saved. And Our punishment cannot be repelled from the people who are criminals.",
    "There was certainly in their stories a lesson for those of understanding. Never was the Qur'an a narration invented, but a confirmation of what was before it and a detailed explanation of all things and guidance and mercy for a people who believe.",
    ""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yusuf);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_yusuf);
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
