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

public class Az_Zumar extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"39:1", "39:2", "39:3", "39:4", "39:5", "39:6", "39:7", "39:8", "39:9", "39:10", "39:11", "39:12", "39:13", "39:14", "39:15", "39:16",
            "39:17", "39:18", "39:19", "39:20", "39:21", "39:22", "39:23", "39:24", "39:25", "39:26", "39:27", "39:28", "39:29", "39:30", "39:31", "39:32",
            "39:33", "39:34", "39:35", "39:36", "39:37", "39:38", "39:39", "39:40", "39:41", "39:42", "39:43", "39:44", "39:45", "39:46", "39:47", "39:48",
            "39:49", "39:50", "39:51", "39:52", "39:53", "39:54", "39:55", "39:56", "39:57", "39:58", "39:59", "39:60", "39:61", "39:62", "39:63", "39:64",
            "39:65", "39:66", "39:67", "39:68", "39:69", "39:70", "39:71", "39:72", "39:73", "39:74", "39:75"};

    String [] arabic_verses = {"تَنزِيلُ الْكِتَابِ مِنَ اللَّهِ الْعَزِيزِ الْحَكِيمِ",
    "إِنَّا أَنزَلْنَا إِلَيْكَ الْكِتَابَ بِالْحَقِّ فَاعْبُدِ اللَّهَ مُخْلِصًا لَّهُ الدِّينَ",
    "أَلَا لِلَّهِ الدِّينُ الْخَالِصُ ۚ وَالَّذِينَ اتَّخَذُوا مِن دُونِهِ أَوْلِيَاءَ مَا نَعْبُدُهُمْ إِلَّا لِيُقَرِّبُونَا إِلَى اللَّهِ زُلْفَىٰ إِنَّ اللَّهَ يَحْكُمُ بَيْنَهُمْ فِي مَا هُمْ فِيهِ يَخْتَلِفُونَ ۗ إِنَّ اللَّهَ لَا يَهْدِي مَنْ هُوَ كَاذِبٌ كَفَّارٌ",
    "لَّوْ أَرَادَ اللَّهُ أَن يَتَّخِذَ وَلَدًا لَّاصْطَفَىٰ مِمَّا يَخْلُقُ مَا يَشَاءُ ۚ سُبْحَانَهُ ۖ هُوَ اللَّهُ الْوَاحِدُ الْقَهَّارُ",
    "خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ بِالْحَقِّ ۖ يُكَوِّرُ اللَّيْلَ عَلَى النَّهَارِ وَيُكَوِّرُ النَّهَارَ عَلَى اللَّيْلِ ۖ وَسَخَّرَ الشَّمْسَ وَالْقَمَرَ ۖ كُلٌّ يَجْرِي لِأَجَلٍ مُّسَمًّى ۗ أَلَا هُوَ الْعَزِيزُ الْغَفَّارُ",
    "خَلَقَكُم مِّن نَّفْسٍ وَاحِدَةٍ ثُمَّ جَعَلَ مِنْهَا زَوْجَهَا وَأَنزَلَ لَكُم مِّنَ الْأَنْعَامِ ثَمَانِيَةَ أَزْوَاجٍ ۚ يَخْلُقُكُمْ فِي بُطُونِ أُمَّهَاتِكُمْ خَلْقًا مِّن بَعْدِ خَلْقٍ فِي ظُلُمَاتٍ ثَلَاثٍ ۚ ذَٰلِكُمُ اللَّهُ رَبُّكُمْ لَهُ الْمُلْكُ ۖ لَا إِلَٰهَ إِلَّا هُوَ ۖ فَأَنَّىٰ تُصْرَفُونَ",
    "إِن تَكْفُرُوا فَإِنَّ اللَّهَ غَنِيٌّ عَنكُمْ ۖ وَلَا يَرْضَىٰ لِعِبَادِهِ الْكُفْرَ ۖ وَإِن تَشْكُرُوا يَرْضَهُ لَكُمْ ۗ وَلَا تَزِرُ وَازِرَةٌ وِزْرَ أُخْرَىٰ ۗ ثُمَّ إِلَىٰ رَبِّكُم مَّرْجِعُكُمْ فَيُنَبِّئُكُم بِمَا كُنتُمْ تَعْمَلُونَ ۚ إِنَّهُ عَلِيمٌ بِذَاتِ الصُّدُورِ",
    "وَإِذَا مَسَّ الْإِنسَانَ ضُرٌّ دَعَا رَبَّهُ مُنِيبًا إِلَيْهِ ثُمَّ إِذَا خَوَّلَهُ نِعْمَةً مِّنْهُ نَسِيَ مَا كَانَ يَدْعُو إِلَيْهِ مِن قَبْلُ وَجَعَلَ لِلَّهِ أَندَادًا لِّيُضِلَّ عَن سَبِيلِهِ ۚ قُلْ تَمَتَّعْ بِكُفْرِكَ قَلِيلًا ۖ إِنَّكَ مِنْ أَصْحَابِ النَّارِ",
    "أَمَّنْ هُوَ قَانِتٌ آنَاءَ اللَّيْلِ سَاجِدًا وَقَائِمًا يَحْذَرُ الْآخِرَةَ وَيَرْجُو رَحْمَةَ رَبِّهِ ۗ قُلْ هَلْ يَسْتَوِي الَّذِينَ يَعْلَمُونَ وَالَّذِينَ لَا يَعْلَمُونَ ۗ إِنَّمَا يَتَذَكَّرُ أُولُو الْأَلْبَابِ",
    "قُلْ يَا عِبَادِ الَّذِينَ آمَنُوا اتَّقُوا رَبَّكُمْ ۚ لِلَّذِينَ أَحْسَنُوا فِي هَٰذِهِ الدُّنْيَا حَسَنَةٌ ۗ وَأَرْضُ اللَّهِ وَاسِعَةٌ ۗ إِنَّمَا يُوَفَّى الصَّابِرُونَ أَجْرَهُم بِغَيْرِ حِسَابٍ",
    "قُلْ إِنِّي أُمِرْتُ أَنْ أَعْبُدَ اللَّهَ مُخْلِصًا لَّهُ الدِّينَ",
    "وَأُمِرْتُ لِأَنْ أَكُونَ أَوَّلَ الْمُسْلِمِينَ",
    "قُلْ إِنِّي أَخَافُ إِنْ عَصَيْتُ رَبِّي عَذَابَ يَوْمٍ عَظِيمٍ",
    "قُلِ اللَّهَ أَعْبُدُ مُخْلِصًا لَّهُ دِينِي",
    "فَاعْبُدُوا مَا شِئْتُم مِّن دُونِهِ ۗ قُلْ إِنَّ الْخَاسِرِينَ الَّذِينَ خَسِرُوا أَنفُسَهُمْ وَأَهْلِيهِمْ يَوْمَ الْقِيَامَةِ ۗ أَلَا ذَٰلِكَ هُوَ الْخُسْرَانُ الْمُبِينُ",
    "لَهُم مِّن فَوْقِهِمْ ظُلَلٌ مِّنَ النَّارِ وَمِن تَحْتِهِمْ ظُلَلٌ ۚ ذَٰلِكَ يُخَوِّفُ اللَّهُ بِهِ عِبَادَهُ ۚ يَا عِبَادِ فَاتَّقُونِ",
    "وَالَّذِينَ اجْتَنَبُوا الطَّاغُوتَ أَن يَعْبُدُوهَا وَأَنَابُوا إِلَى اللَّهِ لَهُمُ الْبُشْرَىٰ ۚ فَبَشِّرْ عِبَادِ",
    "الَّذِينَ يَسْتَمِعُونَ الْقَوْلَ فَيَتَّبِعُونَ أَحْسَنَهُ ۚ أُولَٰئِكَ الَّذِينَ هَدَاهُمُ اللَّهُ ۖ وَأُولَٰئِكَ هُمْ أُولُو الْأَلْبَابِ",
    "أَفَمَنْ حَقَّ عَلَيْهِ كَلِمَةُ الْعَذَابِ أَفَأَنتَ تُنقِذُ مَن فِي النَّارِ",
    "لَٰكِنِ الَّذِينَ اتَّقَوْا رَبَّهُمْ لَهُمْ غُرَفٌ مِّن فَوْقِهَا غُرَفٌ مَّبْنِيَّةٌ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ ۖ وَعْدَ اللَّهِ ۖ لَا يُخْلِفُ اللَّهُ الْمِيعَادَ",
    "أَلَمْ تَرَ أَنَّ اللَّهَ أَنزَلَ مِنَ السَّمَاءِ مَاءً فَسَلَكَهُ يَنَابِيعَ فِي الْأَرْضِ ثُمَّ يُخْرِجُ بِهِ زَرْعًا مُّخْتَلِفًا أَلْوَانُهُ ثُمَّ يَهِيجُ فَتَرَاهُ مُصْفَرًّا ثُمَّ يَجْعَلُهُ حُطَامًا ۚ إِنَّ فِي ذَٰلِكَ لَذِكْرَىٰ لِأُولِي الْأَلْبَابِ",
    "أَفَمَن شَرَحَ اللَّهُ صَدْرَهُ لِلْإِسْلَامِ فَهُوَ عَلَىٰ نُورٍ مِّن رَّبِّهِ ۚ فَوَيْلٌ لِّلْقَاسِيَةِ قُلُوبُهُم مِّن ذِكْرِ اللَّهِ ۚ أُولَٰئِكَ فِي ضَلَالٍ مُّبِينٍ",
    "اللَّهُ نَزَّلَ أَحْسَنَ الْحَدِيثِ كِتَابًا مُّتَشَابِهًا مَّثَانِيَ تَقْشَعِرُّ مِنْهُ جُلُودُ الَّذِينَ يَخْشَوْنَ رَبَّهُمْ ثُمَّ تَلِينُ جُلُودُهُمْ وَقُلُوبُهُمْ إِلَىٰ ذِكْرِ اللَّهِ ۚ ذَٰلِكَ هُدَى اللَّهِ يَهْدِي بِهِ مَن يَشَاءُ ۚ وَمَن يُضْلِلِ اللَّهُ فَمَا لَهُ مِنْ هَادٍ",
    "أَفَمَن يَتَّقِي بِوَجْهِهِ سُوءَ الْعَذَابِ يَوْمَ الْقِيَامَةِ ۚ وَقِيلَ لِلظَّالِمِينَ ذُوقُوا مَا كُنتُمْ تَكْسِبُونَ",
    "كَذَّبَ الَّذِينَ مِن قَبْلِهِمْ فَأَتَاهُمُ الْعَذَابُ مِنْ حَيْثُ لَا يَشْعُرُونَ",
    "فَأَذَاقَهُمُ اللَّهُ الْخِزْيَ فِي الْحَيَاةِ الدُّنْيَا ۖ وَلَعَذَابُ الْآخِرَةِ أَكْبَرُ ۚ لَوْ كَانُوا يَعْلَمُونَ",
    "وَلَقَدْ ضَرَبْنَا لِلنَّاسِ فِي هَٰذَا الْقُرْآنِ مِن كُلِّ مَثَلٍ لَّعَلَّهُمْ يَتَذَكَّرُونَ",
    "قُرْآنًا عَرَبِيًّا غَيْرَ ذِي عِوَجٍ لَّعَلَّهُمْ يَتَّقُونَ",
    "ضَرَبَ اللَّهُ مَثَلًا رَّجُلًا فِيهِ شُرَكَاءُ مُتَشَاكِسُونَ وَرَجُلًا سَلَمًا لِّرَجُلٍ هَلْ يَسْتَوِيَانِ مَثَلًا ۚ الْحَمْدُ لِلَّهِ ۚ بَلْ أَكْثَرُهُمْ لَا يَعْلَمُونَ",
    "إِنَّكَ مَيِّتٌ وَإِنَّهُم مَّيِّتُونَ",
    "ثُمَّ إِنَّكُمْ يَوْمَ الْقِيَامَةِ عِندَ رَبِّكُمْ تَخْتَصِمُونَ",
    "فَمَنْ أَظْلَمُ مِمَّن كَذَبَ عَلَى اللَّهِ وَكَذَّبَ بِالصِّدْقِ إِذْ جَاءَهُ ۚ أَلَيْسَ فِي جَهَنَّمَ مَثْوًى لِّلْكَافِرِينَ",
    "وَالَّذِي جَاءَ بِالصِّدْقِ وَصَدَّقَ بِهِ ۙ أُولَٰئِكَ هُمُ الْمُتَّقُونَ",
    "لَهُم مَّا يَشَاءُونَ عِندَ رَبِّهِمْ ۚ ذَٰلِكَ جَزَاءُ الْمُحْسِنِينَ",
    "لِيُكَفِّرَ اللَّهُ عَنْهُمْ أَسْوَأَ الَّذِي عَمِلُوا وَيَجْزِيَهُمْ أَجْرَهُم بِأَحْسَنِ الَّذِي كَانُوا يَعْمَلُونَ",
    "أَلَيْسَ اللَّهُ بِكَافٍ عَبْدَهُ ۖ وَيُخَوِّفُونَكَ بِالَّذِينَ مِن دُونِهِ ۚ وَمَن يُضْلِلِ اللَّهُ فَمَا لَهُ مِنْ هَادٍ",
    "وَمَن يَهْدِ اللَّهُ فَمَا لَهُ مِن مُّضِلٍّ ۗ أَلَيْسَ اللَّهُ بِعَزِيزٍ ذِي انتِقَامٍ",
    "وَلَئِن سَأَلْتَهُم مَّنْ خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ لَيَقُولُنَّ اللَّهُ ۚ قُلْ أَفَرَأَيْتُم مَّا تَدْعُونَ مِن دُونِ اللَّهِ إِنْ أَرَادَنِيَ اللَّهُ بِضُرٍّ هَلْ هُنَّ كَاشِفَاتُ ضُرِّهِ أَوْ أَرَادَنِي بِرَحْمَةٍ هَلْ هُنَّ مُمْسِكَاتُ رَحْمَتِهِ ۚ قُلْ حَسْبِيَ اللَّهُ ۖ عَلَيْهِ يَتَوَكَّلُ الْمُتَوَكِّلُونَ",
    "قُلْ يَا قَوْمِ اعْمَلُوا عَلَىٰ مَكَانَتِكُمْ إِنِّي عَامِلٌ ۖ فَسَوْفَ تَعْلَمُونَ",
    "مَن يَأْتِيهِ عَذَابٌ يُخْزِيهِ وَيَحِلُّ عَلَيْهِ عَذَابٌ مُّقِيمٌ",
    "إِنَّا أَنزَلْنَا عَلَيْكَ الْكِتَابَ لِلنَّاسِ بِالْحَقِّ ۖ فَمَنِ اهْتَدَىٰ فَلِنَفْسِهِ ۖ وَمَن ضَلَّ فَإِنَّمَا يَضِلُّ عَلَيْهَا ۖ وَمَا أَنتَ عَلَيْهِم بِوَكِيلٍ",
    "اللَّهُ يَتَوَفَّى الْأَنفُسَ حِينَ مَوْتِهَا وَالَّتِي لَمْ تَمُتْ فِي مَنَامِهَا ۖ فَيُمْسِكُ الَّتِي قَضَىٰ عَلَيْهَا الْمَوْتَ وَيُرْسِلُ الْأُخْرَىٰ إِلَىٰ أَجَلٍ مُّسَمًّى ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يَتَفَكَّرُونَ",
    "أَمِ اتَّخَذُوا مِن دُونِ اللَّهِ شُفَعَاءَ ۚ قُلْ أَوَلَوْ كَانُوا لَا يَمْلِكُونَ شَيْئًا وَلَا يَعْقِلُونَ",
    "قُل لِّلَّهِ الشَّفَاعَةُ جَمِيعًا ۖ لَّهُ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ ۖ ثُمَّ إِلَيْهِ تُرْجَعُونَ",
    "وَإِذَا ذُكِرَ اللَّهُ وَحْدَهُ اشْمَأَزَّتْ قُلُوبُ الَّذِينَ لَا يُؤْمِنُونَ بِالْآخِرَةِ ۖ وَإِذَا ذُكِرَ الَّذِينَ مِن دُونِهِ إِذَا هُمْ يَسْتَبْشِرُونَ",
    "قُلِ اللَّهُمَّ فَاطِرَ السَّمَاوَاتِ وَالْأَرْضِ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ أَنتَ تَحْكُمُ بَيْنَ عِبَادِكَ فِي مَا كَانُوا فِيهِ يَخْتَلِفُونَ",
    "وَلَوْ أَنَّ لِلَّذِينَ ظَلَمُوا مَا فِي الْأَرْضِ جَمِيعًا وَمِثْلَهُ مَعَهُ لَافْتَدَوْا بِهِ مِن سُوءِ الْعَذَابِ يَوْمَ الْقِيَامَةِ ۚ وَبَدَا لَهُم مِّنَ اللَّهِ مَا لَمْ يَكُونُوا يَحْتَسِبُونَ",
    "وَبَدَا لَهُمْ سَيِّئَاتُ مَا كَسَبُوا وَحَاقَ بِهِم مَّا كَانُوا بِهِ يَسْتَهْزِئُونَ",
    "فَإِذَا مَسَّ الْإِنسَانَ ضُرٌّ دَعَانَا ثُمَّ إِذَا خَوَّلْنَاهُ نِعْمَةً مِّنَّا قَالَ إِنَّمَا أُوتِيتُهُ عَلَىٰ عِلْمٍ ۚ بَلْ هِيَ فِتْنَةٌ وَلَٰكِنَّ أَكْثَرَهُمْ لَا يَعْلَمُونَ",
    "قَدْ قَالَهَا الَّذِينَ مِن قَبْلِهِمْ فَمَا أَغْنَىٰ عَنْهُم مَّا كَانُوا يَكْسِبُونَ",
    "فَأَصَابَهُمْ سَيِّئَاتُ مَا كَسَبُوا ۚ وَالَّذِينَ ظَلَمُوا مِنْ هَٰؤُلَاءِ سَيُصِيبُهُمْ سَيِّئَاتُ مَا كَسَبُوا وَمَا هُم بِمُعْجِزِينَ",
    "أَوَلَمْ يَعْلَمُوا أَنَّ اللَّهَ يَبْسُطُ الرِّزْقَ لِمَن يَشَاءُ وَيَقْدِرُ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يُؤْمِنُونَ",
    "قُلْ يَا عِبَادِيَ الَّذِينَ أَسْرَفُوا عَلَىٰ أَنفُسِهِمْ لَا تَقْنَطُوا مِن رَّحْمَةِ اللَّهِ ۚ إِنَّ اللَّهَ يَغْفِرُ الذُّنُوبَ جَمِيعًا ۚ إِنَّهُ هُوَ الْغَفُورُ الرَّحِيمُ",
    "وَأَنِيبُوا إِلَىٰ رَبِّكُمْ وَأَسْلِمُوا لَهُ مِن قَبْلِ أَن يَأْتِيَكُمُ الْعَذَابُ ثُمَّ لَا تُنصَرُونَ",
    "وَاتَّبِعُوا أَحْسَنَ مَا أُنزِلَ إِلَيْكُم مِّن رَّبِّكُم مِّن قَبْلِ أَن يَأْتِيَكُمُ الْعَذَابُ بَغْتَةً وَأَنتُمْ لَا تَشْعُرُونَ",
    "أَن تَقُولَ نَفْسٌ يَا حَسْرَتَا عَلَىٰ مَا فَرَّطتُ فِي جَنبِ اللَّهِ وَإِن كُنتُ لَمِنَ السَّاخِرِينَ",
    "أَوْ تَقُولَ لَوْ أَنَّ اللَّهَ هَدَانِي لَكُنتُ مِنَ الْمُتَّقِينَ",
    "أَوْ تَقُولَ حِينَ تَرَى الْعَذَابَ لَوْ أَنَّ لِي كَرَّةً فَأَكُونَ مِنَ الْمُحْسِنِينَ",
    "بَلَىٰ قَدْ جَاءَتْكَ آيَاتِي فَكَذَّبْتَ بِهَا وَاسْتَكْبَرْتَ وَكُنتَ مِنَ الْكَافِرِينَ",
    "وَيَوْمَ الْقِيَامَةِ تَرَى الَّذِينَ كَذَبُوا عَلَى اللَّهِ وُجُوهُهُم مُّسْوَدَّةٌ ۚ أَلَيْسَ فِي جَهَنَّمَ مَثْوًى لِّلْمُتَكَبِّرِينَ",
    "وَيُنَجِّي اللَّهُ الَّذِينَ اتَّقَوْا بِمَفَازَتِهِمْ لَا يَمَسُّهُمُ السُّوءُ وَلَا هُمْ يَحْزَنُونَ",
    "اللَّهُ خَالِقُ كُلِّ شَيْءٍ ۖ وَهُوَ عَلَىٰ كُلِّ شَيْءٍ وَكِيلٌ",
    "لَّهُ مَقَالِيدُ السَّمَاوَاتِ وَالْأَرْضِ ۗ وَالَّذِينَ كَفَرُوا بِآيَاتِ اللَّهِ أُولَٰئِكَ هُمُ الْخَاسِرُونَ",
    "قُلْ أَفَغَيْرَ اللَّهِ تَأْمُرُونِّي أَعْبُدُ أَيُّهَا الْجَاهِلُونَ",
    "وَلَقَدْ أُوحِيَ إِلَيْكَ وَإِلَى الَّذِينَ مِن قَبْلِكَ لَئِنْ أَشْرَكْتَ لَيَحْبَطَنَّ عَمَلُكَ وَلَتَكُونَنَّ مِنَ الْخَاسِرِينَ",
    "بَلِ اللَّهَ فَاعْبُدْ وَكُن مِّنَ الشَّاكِرِينَ",
    "وَمَا قَدَرُوا اللَّهَ حَقَّ قَدْرِهِ وَالْأَرْضُ جَمِيعًا قَبْضَتُهُ يَوْمَ الْقِيَامَةِ وَالسَّمَاوَاتُ مَطْوِيَّاتٌ بِيَمِينِهِ ۚ سُبْحَانَهُ وَتَعَالَىٰ عَمَّا يُشْرِكُونَ",
    "وَنُفِخَ فِي الصُّورِ فَصَعِقَ مَن فِي السَّمَاوَاتِ وَمَن فِي الْأَرْضِ إِلَّا مَن شَاءَ اللَّهُ ۖ ثُمَّ نُفِخَ فِيهِ أُخْرَىٰ فَإِذَا هُمْ قِيَامٌ يَنظُرُونَ",
    "وَأَشْرَقَتِ الْأَرْضُ بِنُورِ رَبِّهَا وَوُضِعَ الْكِتَابُ وَجِيءَ بِالنَّبِيِّينَ وَالشُّهَدَاءِ وَقُضِيَ بَيْنَهُم بِالْحَقِّ وَهُمْ لَا يُظْلَمُونَ",
    "وَوُفِّيَتْ كُلُّ نَفْسٍ مَّا عَمِلَتْ وَهُوَ أَعْلَمُ بِمَا يَفْعَلُونَ",
    "وَسِيقَ الَّذِينَ كَفَرُوا إِلَىٰ جَهَنَّمَ زُمَرًا ۖ حَتَّىٰ إِذَا جَاءُوهَا فُتِحَتْ أَبْوَابُهَا وَقَالَ لَهُمْ خَزَنَتُهَا أَلَمْ يَأْتِكُمْ رُسُلٌ مِّنكُمْ يَتْلُونَ عَلَيْكُمْ آيَاتِ رَبِّكُمْ وَيُنذِرُونَكُمْ لِقَاءَ يَوْمِكُمْ هَٰذَا ۚ قَالُوا بَلَىٰ وَلَٰكِنْ حَقَّتْ كَلِمَةُ الْعَذَابِ عَلَى الْكَافِرِينَ",
    "قِيلَ ادْخُلُوا أَبْوَابَ جَهَنَّمَ خَالِدِينَ فِيهَا ۖ فَبِئْسَ مَثْوَى الْمُتَكَبِّرِينَ",
    "وَسِيقَ الَّذِينَ اتَّقَوْا رَبَّهُمْ إِلَى الْجَنَّةِ زُمَرًا ۖ حَتَّىٰ إِذَا جَاءُوهَا وَفُتِحَتْ أَبْوَابُهَا وَقَالَ لَهُمْ خَزَنَتُهَا سَلَامٌ عَلَيْكُمْ طِبْتُمْ فَادْخُلُوهَا خَالِدِينَ",
    "وَقَالُوا الْحَمْدُ لِلَّهِ الَّذِي صَدَقَنَا وَعْدَهُ وَأَوْرَثَنَا الْأَرْضَ نَتَبَوَّأُ مِنَ الْجَنَّةِ حَيْثُ نَشَاءُ ۖ فَنِعْمَ أَجْرُ الْعَامِلِينَ",
    "وَتَرَى الْمَلَائِكَةَ حَافِّينَ مِنْ حَوْلِ الْعَرْشِ يُسَبِّحُونَ بِحَمْدِ رَبِّهِمْ ۖ وَقُضِيَ بَيْنَهُم بِالْحَقِّ وَقِيلَ الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"The revelation of the Qur'an is from Allah, the Exalted in Might, the Wise.",
    "Indeed, We have sent down to you the Book, [O Muhammad], in truth. So worship Allah, [being] sincere to Him in religion.",
    "Unquestionably, for Allah is the pure religion. And those who take protectors besides Him [say], \"We only worship them that they may bring us nearer to Allah in position.\" Indeed, Allah will judge between them concerning that over which they differ. Indeed, Allah does not guide he who is a liar and [confirmed] disbeliever.",
    "If Allah had intended to take a son, He could have chosen from what He creates whatever He willed. Exalted is He; He is Allah, the One, the Prevailing.",
    "He created the heavens and earth in truth. He wraps the night over the day and wraps the day over the night and has subjected the sun and the moon, each running [its course] for a specified term. Unquestionably, He is the Exalted in Might, the Perpetual Forgiver.",
    "He created you from one soul. Then He made from it its mate, and He produced for you from the grazing livestock eight mates. He creates you in the wombs of your mothers, creation after creation, within three darknesses. That is Allah, your Lord; to Him belongs dominion. There is no deity except Him, so how are you averted?",
    "If you disbelieve - indeed, Allah is Free from need of you. And He does not approve for His servants disbelief. And if you are grateful, He approves it for you; and no bearer of burdens will bear the burden of another. Then to your Lord is your return, and He will inform you about what you used to do. Indeed, He is Knowing of that within the breasts.",
    "And when adversity touches man, he calls upon his Lord, turning to Him [alone]; then when He bestows on him a favor from Himself, he forgets Him whom he called upon before, and he attributes to Allah equals to mislead [people] from His way. Say, \"Enjoy your disbelief for a little; indeed, you are of the companions of the Fire.\"",
    "Is one who is devoutly obedient during periods of the night, prostrating and standing [in prayer], fearing the Hereafter and hoping for the mercy of his Lord, [like one who does not]? Say, \"Are those who know equal to those who do not know?\" Only they will remember [who are] people of understanding.",
    "Say, \"O My servants who have believed, fear your Lord. For those who do good in this world is good, and the earth of Allah is spacious. Indeed, the patient will be given their reward without account.\"",
    "Say, [O Muhammad], \"Indeed, I have been commanded to worship Allah, [being] sincere to Him in religion.",
    "And I have been commanded to be the first [among you] of the Muslims.\"",
    "Say, \"Indeed I fear, if I should disobey my Lord, the punishment of a tremendous Day.\"",
    "Say, \"Allah [alone] do I worship, sincere to Him in my religion,",
    "So worship what you will besides Him.\" Say, \"Indeed, the losers are the ones who will lose themselves and their families on the Day of Resurrection. Unquestionably, that is the manifest loss.\"",
    "They will have canopies of fire above them and below them, canopies. By that Allah threatens His servants. O My servants, then fear Me.",
    "But those who have avoided Taghut, lest they worship it, and turned back to Allah - for them are good tidings. So give good tidings to My servants",
    "Who listen to speech and follow the best of it. Those are the ones Allah has guided, and those are people of understanding.",
    "Then, is one who has deserved the decree of punishment [to be guided]? Then, can you save one who is in the Fire?",
    "But those who have feared their Lord - for them are chambers, above them chambers built high, beneath which rivers flow. [This is] the promise of Allah. Allah does not fail in [His] promise.",
    "Do you not see that Allah sends down rain from the sky and makes it flow as springs [and rivers] in the earth; then He produces thereby crops of varying colors; then they dry and you see them turned yellow; then He makes them [scattered] debris. Indeed in that is a reminder for those of understanding.",
    "So is one whose breast Allah has expanded to [accept] Islam and he is upon a light from his Lord [like one whose heart rejects it]? Then woe to those whose hearts are hardened against the remembrance of Allah. Those are in manifest error.",
    "Allah has sent down the best statement: a consistent Book wherein is reiteration. The skins shiver therefrom of those who fear their Lord; then their skins and their hearts relax at the remembrance of Allah. That is the guidance of Allah by which He guides whom He wills. And one whom Allah leaves astray - for him there is no guide.",
    "Then is he who will shield with his face the worst of the punishment on the Day of Resurrection [like one secure from it]? And it will be said to the wrongdoers, \"Taste what you used to earn.\"",
    "Those before them denied, and punishment came upon them from where they did not perceive.",
    "So Allah made them taste disgrace in worldly life. But the punishment of the Hereafter is greater, if they only knew.",
    "And We have certainly presented for the people in this Qur'an from every [kind of] example - that they might remember.",
    "[It is] an Arabic Qur'an, without any deviance that they might become righteous.",
    "Allah presents an example: a slave owned by quarreling partners and another belonging exclusively to one man - are they equal in comparison? Praise be to Allah ! But most of them do not know.",
    "Indeed, you are to die, and indeed, they are to die.",
    "Then indeed you, on the Day of Resurrection, before your Lord, will dispute.",
    "So who is more unjust than one who lies about Allah and denies the truth when it has come to him? Is there not in Hell a residence for the disbelievers?",
    "And the one who has brought the truth and [they who] believed in it - those are the righteous.",
    "They will have whatever they desire with their Lord. That is the reward of the doers of good -",
    "That Allah may remove from them the worst of what they did and reward them their due for the best of what they used to do.",
    "Is not Allah sufficient for His Servant [Prophet Muhammad]? And [yet], they threaten you with those [they worship] other than Him. And whoever Allah leaves astray - for him there is no guide.",
    "And whoever Allah guides - for him there is no misleader. Is not Allah Exalted in Might and Owner of Retribution?",
    "And if you asked them, \"Who created the heavens and the earth?\" they would surely say, \"Allah.\" Say, \"Then have you considered what you invoke besides Allah? If Allah intended me harm, are they removers of His harm; or if He intended me mercy, are they withholders of His mercy?\" Say, \"Sufficient for me is Allah; upon Him [alone] rely the [wise] reliers.\"",
    "Say, \"O my people, work according to your position, [for] indeed, I am working; and you are going to know",
    "To whom will come a torment disgracing him and on whom will descend an enduring punishment.\"",
    "Indeed, We sent down to you the Book for the people in truth. So whoever is guided - it is for [the benefit of] his soul; and whoever goes astray only goes astray to its detriment. And you are not a manager over them.",
    "Allah takes the souls at the time of their death, and those that do not die [He takes] during their sleep. Then He keeps those for which He has decreed death and releases the others for a specified term. Indeed in that are signs for a people who give thought.",
    "Or have they taken other than Allah as intercessors? Say, \"Even though they do not possess [power over] anything, nor do they reason?\"",
    "Say, \"To Allah belongs [the right to allow] intercession entirely. To Him belongs the dominion of the heavens and the earth. Then to Him you will be returned.\"",
    "And when Allah is mentioned alone, the hearts of those who do not believe in the Hereafter shrink with aversion, but when those [worshipped] other than Him are mentioned, immediately they rejoice.",
    "Say, \"O Allah, Creator of the heavens and the earth, Knower of the unseen and the witnessed, You will judge between your servants concerning that over which they used to differ.\"",
    "And if those who did wrong had all that is in the earth entirely and the like of it with it, they would [attempt to] ransom themselves thereby from the worst of the punishment on the Day of Resurrection. And there will appear to them from Allah that which they had not taken into account.",
    "And there will appear to them the evils they had earned, and they will be enveloped by what they used to ridicule.",
    "And when adversity touches man, he calls upon Us; then when We bestow on him a favor from Us, he says, \"I have only been given it because of [my] knowledge.\" Rather, it is a trial, but most of them do not know.",
    "Those before them had already said it, but they were not availed by what they used to earn.",
    "And the evil consequences of what they earned struck them. And those who have wronged of these [people] will be afflicted by the evil consequences of what they earned; and they will not cause failure.",
    "Do they not know that Allah extends provision for whom He wills and restricts [it]? Indeed in that are signs for a people who believe.",
    "Say, \"O My servants who have transgressed against themselves [by sinning], do not despair of the mercy of Allah. Indeed, Allah forgives all sins. Indeed, it is He who is the Forgiving, the Merciful.\"",
    "And return [in repentance] to your Lord and submit to Him before the punishment comes upon you; then you will not be helped.",
    "And follow the best of what was revealed to you from your Lord before the punishment comes upon you suddenly while you do not perceive,",
    "Lest a soul should say, \"Oh [how great is] my regret over what I neglected in regard to Allah and that I was among the mockers.\"",
    "Or [lest] it say, \"If only Allah had guided me, I would have been among the righteous.\"",
    "Or [lest] it say when it sees the punishment, \"If only I had another turn so I could be among the doers of good.\"",
    "But yes, there had come to you My verses, but you denied them and were arrogant, and you were among the disbelievers.",
    "And on the Day of Resurrection you will see those who lied about Allah [with] their faces blackened. Is there not in Hell a residence for the arrogant?",
    "And Allah will save those who feared Him by their attainment; no evil will touch them, nor will they grieve.",
    "Allah is the Creator of all things, and He is, over all things, Disposer of affairs.",
    "To Him belong the keys of the heavens and the earth. And they who disbelieve in the verses of Allah - it is those who are the losers.",
    "Say, [O Muhammad], \"Is it other than Allah that you order me to worship, O ignorant ones?\"",
    "And it was already revealed to you and to those before you that if you should associate [anything] with Allah, your work would surely become worthless, and you would surely be among the losers.\"",
    "Rather, worship [only] Allah and be among the grateful.",
    "They have not appraised Allah with true appraisal, while the earth entirely will be [within] His grip on the Day of Resurrection, and the heavens will be folded in His right hand. Exalted is He and high above what they associate with Him.",
    "And the Horn will be blown, and whoever is in the heavens and whoever is on the earth will fall dead except whom Allah wills. Then it will be blown again, and at once they will be standing, looking on.",
    "And the earth will shine with the light of its Lord, and the record [of deeds] will be placed, and the prophets and the witnesses will be brought, and it will be judged between them in truth, and they will not be wronged.",
    "And every soul will be fully compensated [for] what it did; and He is most knowing of what they do.",
    "And those who disbelieved will be driven to Hell in groups until, when they reach it, its gates are opened and its keepers will say, \"Did there not come to you messengers from yourselves, reciting to you the verses of your Lord and warning you of the meeting of this Day of yours?\" They will say, \"Yes, but the word of punishment has come into effect upon the disbelievers.",
    "[To them] it will be said, \"Enter the gates of Hell to abide eternally therein, and wretched is the residence of the arrogant.\"",
    "But those who feared their Lord will be driven to Paradise in groups until, when they reach it while its gates have been opened and its keepers say, \"Peace be upon you; you have become pure; so enter it to abide eternally therein,\" [they will enter].",
    "And they will say, \"Praise to Allah, who has fulfilled for us His promise and made us inherit the earth [so] we may settle in Paradise wherever we will. And excellent is the reward of [righteous] workers.\"",
    "And you will see the angels surrounding the Throne, exalting [Allah] with praise of their Lord. And it will be judged between them in truth, and it will be said, \"[All] praise to Allah, Lord of the worlds.\""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az__zumar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_az_zumar);
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
