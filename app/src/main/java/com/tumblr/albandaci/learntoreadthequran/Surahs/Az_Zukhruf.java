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

public class Az_Zukhruf extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"43:1", "43:2", "43:3", "43:4", "43:5", "43:6", "43:7", "43:8", "43:9", "43:10", "43:11", "43:12", "43:13", "43:14", "43:15", "43:16",
            "43:17", "43:18", "43:19", "43:20", "43:21", "43:22", "43:23", "43:24", "43:25", "43:26", "43:27", "43:28", "43:29", "43:30", "43:31", "43:32",
            "43:33", "43:34", "43:35", "43:36", "43:37", "43:38", "43:39", "43:40", "43:41", "43:42", "43:43", "43:44", "43:45", "43:46", "43:47", "43:48",
            "43:49", "43:50", "43:51", "43:52", "43:53", "43:54", "43:55", "43:56", "43:57", "43:58", "43:59", "43:60", "43:61", "43:62", "43:63", "43:64",
            "43:65", "43:66", "43:67", "43:68", "43:69", "43:70", "43:71", "43:72", "43:73", "43:74", "43:75", "43:76", "43:77", "43:78", "43:79", "43:80",
            "43:81", "43:82", "43:83", "43:84", "43:85", "43:86", "43:87", "43:88", "43:89"};

    String [] arabic_verses = {"حم",
    "وَالْكِتَابِ الْمُبِينِ",
    "إِنَّا جَعَلْنَاهُ قُرْآنًا عَرَبِيًّا لَّعَلَّكُمْ تَعْقِلُونَ",
    "وَإِنَّهُ فِي أُمِّ الْكِتَابِ لَدَيْنَا لَعَلِيٌّ حَكِيمٌ",
    "أَفَنَضْرِبُ عَنكُمُ الذِّكْرَ صَفْحًا أَن كُنتُمْ قَوْمًا مُّسْرِفِينَ",
    "وَكَمْ أَرْسَلْنَا مِن نَّبِيٍّ فِي الْأَوَّلِينَ",
    "وَمَا يَأْتِيهِم مِّن نَّبِيٍّ إِلَّا كَانُوا بِهِ يَسْتَهْزِئُونَ",
    "فَأَهْلَكْنَا أَشَدَّ مِنْهُم بَطْشًا وَمَضَىٰ مَثَلُ الْأَوَّلِينَ",
    "وَلَئِن سَأَلْتَهُم مَّنْ خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ لَيَقُولُنَّ خَلَقَهُنَّ الْعَزِيزُ الْعَلِيمُ",
    "الَّذِي جَعَلَ لَكُمُ الْأَرْضَ مَهْدًا وَجَعَلَ لَكُمْ فِيهَا سُبُلًا لَّعَلَّكُمْ تَهْتَدُونَ",
    "وَالَّذِي نَزَّلَ مِنَ السَّمَاءِ مَاءً بِقَدَرٍ فَأَنشَرْنَا بِهِ بَلْدَةً مَّيْتًا ۚ كَذَٰلِكَ تُخْرَجُونَ",
    "وَالَّذِي خَلَقَ الْأَزْوَاجَ كُلَّهَا وَجَعَلَ لَكُم مِّنَ الْفُلْكِ وَالْأَنْعَامِ مَا تَرْكَبُونَ",
    "لِتَسْتَوُوا عَلَىٰ ظُهُورِهِ ثُمَّ تَذْكُرُوا نِعْمَةَ رَبِّكُمْ إِذَا اسْتَوَيْتُمْ عَلَيْهِ وَتَقُولُوا سُبْحَانَ الَّذِي سَخَّرَ لَنَا هَٰذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ",
    "وَإِنَّا إِلَىٰ رَبِّنَا لَمُنقَلِبُونَ",
    "وَجَعَلُوا لَهُ مِنْ عِبَادِهِ جُزْءًا ۚ إِنَّ الْإِنسَانَ لَكَفُورٌ مُّبِينٌ",
    "أَمِ اتَّخَذَ مِمَّا يَخْلُقُ بَنَاتٍ وَأَصْفَاكُم بِالْبَنِينَ",
    "وَإِذَا بُشِّرَ أَحَدُهُم بِمَا ضَرَبَ لِلرَّحْمَٰنِ مَثَلًا ظَلَّ وَجْهُهُ مُسْوَدًّا وَهُوَ كَظِيمٌ",
    "أَوَمَن يُنَشَّأُ فِي الْحِلْيَةِ وَهُوَ فِي الْخِصَامِ غَيْرُ مُبِينٍ",
    "وَجَعَلُوا الْمَلَائِكَةَ الَّذِينَ هُمْ عِبَادُ الرَّحْمَٰنِ إِنَاثًا ۚ أَشَهِدُوا خَلْقَهُمْ ۚ سَتُكْتَبُ شَهَادَتُهُمْ وَيُسْأَلُونَ",
    "وَقَالُوا لَوْ شَاءَ الرَّحْمَٰنُ مَا عَبَدْنَاهُم ۗ مَّا لَهُم بِذَٰلِكَ مِنْ عِلْمٍ ۖ إِنْ هُمْ إِلَّا يَخْرُصُونَ",
    "أَمْ آتَيْنَاهُمْ كِتَابًا مِّن قَبْلِهِ فَهُم بِهِ مُسْتَمْسِكُونَ",
    "بَلْ قَالُوا إِنَّا وَجَدْنَا آبَاءَنَا عَلَىٰ أُمَّةٍ وَإِنَّا عَلَىٰ آثَارِهِم مُّهْتَدُونَ",
    "وَكَذَٰلِكَ مَا أَرْسَلْنَا مِن قَبْلِكَ فِي قَرْيَةٍ مِّن نَّذِيرٍ إِلَّا قَالَ مُتْرَفُوهَا إِنَّا وَجَدْنَا آبَاءَنَا عَلَىٰ أُمَّةٍ وَإِنَّا عَلَىٰ آثَارِهِم مُّقْتَدُونَ",
    "قَالَ أَوَلَوْ جِئْتُكُم بِأَهْدَىٰ مِمَّا وَجَدتُّمْ عَلَيْهِ آبَاءَكُمْ ۖ قَالُوا إِنَّا بِمَا أُرْسِلْتُم بِهِ كَافِرُونَ",
    "فَانتَقَمْنَا مِنْهُمْ ۖ فَانظُرْ كَيْفَ كَانَ عَاقِبَةُ الْمُكَذِّبِينَ",
    "وَإِذْ قَالَ إِبْرَاهِيمُ لِأَبِيهِ وَقَوْمِهِ إِنَّنِي بَرَاءٌ مِّمَّا تَعْبُدُونَ",
    "إِلَّا الَّذِي فَطَرَنِي فَإِنَّهُ سَيَهْدِينِ",
    "وَجَعَلَهَا كَلِمَةً بَاقِيَةً فِي عَقِبِهِ لَعَلَّهُمْ يَرْجِعُونَ",
    "بَلْ مَتَّعْتُ هَٰؤُلَاءِ وَآبَاءَهُمْ حَتَّىٰ جَاءَهُمُ الْحَقُّ وَرَسُولٌ مُّبِينٌ",
    "وَلَمَّا جَاءَهُمُ الْحَقُّ قَالُوا هَٰذَا سِحْرٌ وَإِنَّا بِهِ كَافِرُونَ",
    "وَقَالُوا لَوْلَا نُزِّلَ هَٰذَا الْقُرْآنُ عَلَىٰ رَجُلٍ مِّنَ الْقَرْيَتَيْنِ عَظِيمٍ",
    "أَهُمْ يَقْسِمُونَ رَحْمَتَ رَبِّكَ ۚ نَحْنُ قَسَمْنَا بَيْنَهُم مَّعِيشَتَهُمْ فِي الْحَيَاةِ الدُّنْيَا ۚ وَرَفَعْنَا بَعْضَهُمْ فَوْقَ بَعْضٍ دَرَجَاتٍ لِّيَتَّخِذَ بَعْضُهُم بَعْضًا سُخْرِيًّا ۗ وَرَحْمَتُ رَبِّكَ خَيْرٌ مِّمَّا يَجْمَعُونَ",
    "وَلَوْلَا أَن يَكُونَ النَّاسُ أُمَّةً وَاحِدَةً لَّجَعَلْنَا لِمَن يَكْفُرُ بِالرَّحْمَٰنِ لِبُيُوتِهِمْ سُقُفًا مِّن فِضَّةٍ وَمَعَارِجَ عَلَيْهَا يَظْهَرُونَ",
    "وَلِبُيُوتِهِمْ أَبْوَابًا وَسُرُرًا عَلَيْهَا يَتَّكِئُونَ",
    "وَزُخْرُفًا ۚ وَإِن كُلُّ ذَٰلِكَ لَمَّا مَتَاعُ الْحَيَاةِ الدُّنْيَا ۚ وَالْآخِرَةُ عِندَ رَبِّكَ لِلْمُتَّقِينَ",
    "وَمَن يَعْشُ عَن ذِكْرِ الرَّحْمَٰنِ نُقَيِّضْ لَهُ شَيْطَانًا فَهُوَ لَهُ قَرِينٌ",
    "وَإِنَّهُمْ لَيَصُدُّونَهُمْ عَنِ السَّبِيلِ وَيَحْسَبُونَ أَنَّهُم مُّهْتَدُونَ",
    "حَتَّىٰ إِذَا جَاءَنَا قَالَ يَا لَيْتَ بَيْنِي وَبَيْنَكَ بُعْدَ الْمَشْرِقَيْنِ فَبِئْسَ الْقَرِينُ",
    "وَلَن يَنفَعَكُمُ الْيَوْمَ إِذ ظَّلَمْتُمْ أَنَّكُمْ فِي الْعَذَابِ مُشْتَرِكُونَ",
    "أَفَأَنتَ تُسْمِعُ الصُّمَّ أَوْ تَهْدِي الْعُمْيَ وَمَن كَانَ فِي ضَلَالٍ مُّبِينٍ",
    "فَإِمَّا نَذْهَبَنَّ بِكَ فَإِنَّا مِنْهُم مُّنتَقِمُونَ",
    "أَوْ نُرِيَنَّكَ الَّذِي وَعَدْنَاهُمْ فَإِنَّا عَلَيْهِم مُّقْتَدِرُونَ",
    "فَاسْتَمْسِكْ بِالَّذِي أُوحِيَ إِلَيْكَ ۖ إِنَّكَ عَلَىٰ صِرَاطٍ مُّسْتَقِيمٍ",
    "وَإِنَّهُ لَذِكْرٌ لَّكَ وَلِقَوْمِكَ ۖ وَسَوْفَ تُسْأَلُونَ",
    "وَاسْأَلْ مَنْ أَرْسَلْنَا مِن قَبْلِكَ مِن رُّسُلِنَا أَجَعَلْنَا مِن دُونِ الرَّحْمَٰنِ آلِهَةً يُعْبَدُونَ",
    "وَلَقَدْ أَرْسَلْنَا مُوسَىٰ بِآيَاتِنَا إِلَىٰ فِرْعَوْنَ وَمَلَئِهِ فَقَالَ إِنِّي رَسُولُ رَبِّ الْعَالَمِينَ",
    "فَلَمَّا جَاءَهُم بِآيَاتِنَا إِذَا هُم مِّنْهَا يَضْحَكُونَ",
    "وَمَا نُرِيهِم مِّنْ آيَةٍ إِلَّا هِيَ أَكْبَرُ مِنْ أُخْتِهَا ۖ وَأَخَذْنَاهُم بِالْعَذَابِ لَعَلَّهُمْ يَرْجِعُونَ",
    "وَقَالُوا يَا أَيُّهَ السَّاحِرُ ادْعُ لَنَا رَبَّكَ بِمَا عَهِدَ عِندَكَ إِنَّنَا لَمُهْتَدُونَ",
    "فَلَمَّا كَشَفْنَا عَنْهُمُ الْعَذَابَ إِذَا هُمْ يَنكُثُونَ",
    "وَنَادَىٰ فِرْعَوْنُ فِي قَوْمِهِ قَالَ يَا قَوْمِ أَلَيْسَ لِي مُلْكُ مِصْرَ وَهَٰذِهِ الْأَنْهَارُ تَجْرِي مِن تَحْتِي ۖ أَفَلَا تُبْصِرُونَ",
    "أَمْ أَنَا خَيْرٌ مِّنْ هَٰذَا الَّذِي هُوَ مَهِينٌ وَلَا يَكَادُ يُبِينُ",
    "فَلَوْلَا أُلْقِيَ عَلَيْهِ أَسْوِرَةٌ مِّن ذَهَبٍ أَوْ جَاءَ مَعَهُ الْمَلَائِكَةُ مُقْتَرِنِينَ",
    "فَاسْتَخَفَّ قَوْمَهُ فَأَطَاعُوهُ ۚ إِنَّهُمْ كَانُوا قَوْمًا فَاسِقِينَ",
    "فَلَمَّا آسَفُونَا انتَقَمْنَا مِنْهُمْ فَأَغْرَقْنَاهُمْ أَجْمَعِينَ",
    "فَجَعَلْنَاهُمْ سَلَفًا وَمَثَلًا لِّلْآخِرِينَ",
    "وَلَمَّا ضُرِبَ ابْنُ مَرْيَمَ مَثَلًا إِذَا قَوْمُكَ مِنْهُ يَصِدُّونَ",
    "وَقَالُوا أَآلِهَتُنَا خَيْرٌ أَمْ هُوَ ۚ مَا ضَرَبُوهُ لَكَ إِلَّا جَدَلًا ۚ بَلْ هُمْ قَوْمٌ خَصِمُونَ",
    "إِنْ هُوَ إِلَّا عَبْدٌ أَنْعَمْنَا عَلَيْهِ وَجَعَلْنَاهُ مَثَلًا لِّبَنِي إِسْرَائِيلَ",
    "وَلَوْ نَشَاءُ لَجَعَلْنَا مِنكُم مَّلَائِكَةً فِي الْأَرْضِ يَخْلُفُونَ",
    "وَإِنَّهُ لَعِلْمٌ لِّلسَّاعَةِ فَلَا تَمْتَرُنَّ بِهَا وَاتَّبِعُونِ ۚ هَٰذَا صِرَاطٌ مُّسْتَقِيمٌ",
    "وَلَا يَصُدَّنَّكُمُ الشَّيْطَانُ ۖ إِنَّهُ لَكُمْ عَدُوٌّ مُّبِينٌ",
    "وَلَمَّا جَاءَ عِيسَىٰ بِالْبَيِّنَاتِ قَالَ قَدْ جِئْتُكُم بِالْحِكْمَةِ وَلِأُبَيِّنَ لَكُم بَعْضَ الَّذِي تَخْتَلِفُونَ فِيهِ ۖ فَاتَّقُوا اللَّهَ وَأَطِيعُونِ",
    "إِنَّ اللَّهَ هُوَ رَبِّي وَرَبُّكُمْ فَاعْبُدُوهُ ۚ هَٰذَا صِرَاطٌ مُّسْتَقِيمٌ",
    "فَاخْتَلَفَ الْأَحْزَابُ مِن بَيْنِهِمْ ۖ فَوَيْلٌ لِّلَّذِينَ ظَلَمُوا مِنْ عَذَابِ يَوْمٍ أَلِيمٍ",
    "هَلْ يَنظُرُونَ إِلَّا السَّاعَةَ أَن تَأْتِيَهُم بَغْتَةً وَهُمْ لَا يَشْعُرُونَ",
    "الْأَخِلَّاءُ يَوْمَئِذٍ بَعْضُهُمْ لِبَعْضٍ عَدُوٌّ إِلَّا الْمُتَّقِينَ",
    "يَا عِبَادِ لَا خَوْفٌ عَلَيْكُمُ الْيَوْمَ وَلَا أَنتُمْ تَحْزَنُونَ",
    "الَّذِينَ آمَنُوا بِآيَاتِنَا وَكَانُوا مُسْلِمِينَ",
    "ادْخُلُوا الْجَنَّةَ أَنتُمْ وَأَزْوَاجُكُمْ تُحْبَرُونَ",
    "يُطَافُ عَلَيْهِم بِصِحَافٍ مِّن ذَهَبٍ وَأَكْوَابٍ ۖ وَفِيهَا مَا تَشْتَهِيهِ الْأَنفُسُ وَتَلَذُّ الْأَعْيُنُ ۖ وَأَنتُمْ فِيهَا خَالِدُونَ",
    "وَتِلْكَ الْجَنَّةُ الَّتِي أُورِثْتُمُوهَا بِمَا كُنتُمْ تَعْمَلُونَ",
    "لَكُمْ فِيهَا فَاكِهَةٌ كَثِيرَةٌ مِّنْهَا تَأْكُلُونَ",
    "إِنَّ الْمُجْرِمِينَ فِي عَذَابِ جَهَنَّمَ خَالِدُونَ",
    "لَا يُفَتَّرُ عَنْهُمْ وَهُمْ فِيهِ مُبْلِسُونَ",
    "وَمَا ظَلَمْنَاهُمْ وَلَٰكِن كَانُوا هُمُ الظَّالِمِينَ",
    "وَنَادَوْا يَا مَالِكُ لِيَقْضِ عَلَيْنَا رَبُّكَ ۖ قَالَ إِنَّكُم مَّاكِثُونَ",
    "لَقَدْ جِئْنَاكُم بِالْحَقِّ وَلَٰكِنَّ أَكْثَرَكُمْ لِلْحَقِّ كَارِهُونَ",
    "أَمْ أَبْرَمُوا أَمْرًا فَإِنَّا مُبْرِمُونَ",
    "أَمْ يَحْسَبُونَ أَنَّا لَا نَسْمَعُ سِرَّهُمْ وَنَجْوَاهُم ۚ بَلَىٰ وَرُسُلُنَا لَدَيْهِمْ يَكْتُبُونَ",
    "قُلْ إِن كَانَ لِلرَّحْمَٰنِ وَلَدٌ فَأَنَا أَوَّلُ الْعَابِدِينَ",
    "سُبْحَانَ رَبِّ السَّمَاوَاتِ وَالْأَرْضِ رَبِّ الْعَرْشِ عَمَّا يَصِفُونَ",
    "فَذَرْهُمْ يَخُوضُوا وَيَلْعَبُوا حَتَّىٰ يُلَاقُوا يَوْمَهُمُ الَّذِي يُوعَدُونَ",
    "وَهُوَ الَّذِي فِي السَّمَاءِ إِلَٰهٌ وَفِي الْأَرْضِ إِلَٰهٌ ۚ وَهُوَ الْحَكِيمُ الْعَلِيمُ",
    "وَتَبَارَكَ الَّذِي لَهُ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا وَعِندَهُ عِلْمُ السَّاعَةِ وَإِلَيْهِ تُرْجَعُونَ",
    "وَلَا يَمْلِكُ الَّذِينَ يَدْعُونَ مِن دُونِهِ الشَّفَاعَةَ إِلَّا مَن شَهِدَ بِالْحَقِّ وَهُمْ يَعْلَمُونَ",
    "وَلَئِن سَأَلْتَهُم مَّنْ خَلَقَهُمْ لَيَقُولُنَّ اللَّهُ ۖ فَأَنَّىٰ يُؤْفَكُونَ",
    "وَقِيلِهِ يَا رَبِّ إِنَّ هَٰؤُلَاءِ قَوْمٌ لَّا يُؤْمِنُونَ",
    "فَاصْفَحْ عَنْهُمْ وَقُلْ سَلَامٌ ۚ فَسَوْفَ يَعْلَمُونَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"Ha, Meem.",
    "By the clear Book,",
    "Indeed, We have made it an Arabic Qur'an that you might understand.",
    "And indeed it is, in the Mother of the Book with Us, exalted and full of wisdom.",
    "Then should We turn the message away, disregarding you, because you are a transgressing people?",
    "And how many a prophet We sent among the former peoples,",
    "But there would not come to them a prophet except that they used to ridicule him.",
    "And We destroyed greater than them in [striking] power, and the example of the former peoples has preceded.",
    "And if you should ask them, \"Who has created the heavens and the earth?\" they would surely say, \"They were created by the Exalted in Might, the Knowing.\"",
    "[The one] who has made for you the earth a bed and made for you upon it roads that you might be guided",
    "And who sends down rain from the sky in measured amounts, and We revive thereby a dead land - thus will you be brought forth -",
    "And who created the species, all of them, and has made for you of ships and animals those which you mount.",
    "That you may settle yourselves upon their backs and then remember the favor of your Lord when you have settled upon them and say. \"Exalted is He who has subjected this to us, and we could not have [otherwise] subdued it.",
    "And indeed we, to our Lord, will [surely] return.\"",
    "But they have attributed to Him from His servants a portion. Indeed, man is clearly ungrateful.",
    "Or has He taken, out of what He has created, daughters and chosen you for [having] sons?",
    "And when one of them is given good tidings of that which he attributes to the Most Merciful in comparison, his face becomes dark, and he suppresses grief.",
    "So is one brought up in ornaments while being during conflict unevident [attributed to Allah]?",
    "And they have made the angels, who are servants of the Most Merciful, females. Did they witness their creation? Their testimony will be recorded, and they will be questioned.",
    "And they said, \"If the Most Merciful had willed, we would not have worshipped them.\" They have of that no knowledge. They are not but falsifying.",
    "Or have We given them a book before the Qur'an to which they are adhering?",
    "Rather, they say, \"Indeed, we found our fathers upon a religion, and we are in their footsteps [rightly] guided.\"",
    "And similarly, We did not send before you any warner into a city except that its affluent said, \"Indeed, we found our fathers upon a religion, and we are, in their footsteps, following.\"",
    "[Each warner] said, \"Even if I brought you better guidance than that [religion] upon which you found your fathers?\" They said, \"Indeed we, in that with which you were sent, are disbelievers.\"",
    "So we took retribution from them; then see how was the end of the deniers.",
    "And [mention, O Muhammad], when Abraham said to his father and his people, \"Indeed, I am disassociated from that which you worship",
    "Except for He who created me; and indeed, He will guide me.\"",
    "And he made it a word remaining among his descendants that they might return [to it].",
    "However, I gave enjoyment to these [people of Makkah] and their fathers until there came to them the truth and a clear Messenger.",
    "But when the truth came to them, they said, \"This is magic, and indeed we are, concerning it, disbelievers.\"",
    "And they said, \"Why was this Qur'an not sent down upon a great man from [one of] the two cities?\"",
    "Do they distribute the mercy of your Lord? It is We who have apportioned among them their livelihood in the life of this world and have raised some of them above others in degrees [of rank] that they may make use of one another for service. But the mercy of your Lord is better than whatever they accumulate.",
    "And if it were not that the people would become one community [of disbelievers], We would have made for those who disbelieve in the Most Merciful - for their houses - ceilings and stairways of silver upon which to mount",
    "And for their houses - doors and couches [of silver] upon which to recline",
    "And gold ornament. But all that is not but the enjoyment of worldly life. And the Hereafter with your Lord is for the righteous.",
    "And whoever is blinded from remembrance of the Most Merciful - We appoint for him a devil, and he is to him a companion.",
    "And indeed, the devils avert them from the way [of guidance] while they think that they are [rightly] guided",
    "Until, when he comes to Us [at Judgement], he says [to his companion], \"Oh, I wish there was between me and you the distance between the east and west - how wretched a companion.\"",
    "And never will it benefit you that Day, when you have wronged, that you are [all] sharing in the punishment.",
    "Then will you make the deaf hear, [O Muhammad], or guide the blind or he who is in clear error?",
    "And whether [or not] We take you away [in death], indeed, We will take retribution upon them.",
    "Or whether [or not] We show you that which We have promised them, indeed, We are Perfect in Ability.",
    "So adhere to that which is revealed to you. Indeed, you are on a straight path.",
    "And indeed, it is a remembrance for you and your people, and you [all] are going to be questioned.",
    "And ask those We sent before you of Our messengers; have We made besides the Most Merciful deities to be worshipped?",
    "And certainly did We send Moses with Our signs to Pharaoh and his establishment, and he said, \"Indeed, I am the messenger of the Lord of the worlds.\"",
    "But when he brought them Our signs, at once they laughed at them.",
    "And We showed them not a sign except that it was greater than its sister, and We seized them with affliction that perhaps they might return [to faith].",
    "And they said [to Moses], \"O magician, invoke for us your Lord by what He has promised you. Indeed, we will be guided.\"",
    "But when We removed from them the affliction, at once they broke their word.",
    "And Pharaoh called out among his people; he said, \"O my people, does not the kingdom of Egypt belong to me, and these rivers flowing beneath me; then do you not see?",
    "Or am I [not] better than this one who is insignificant and hardly makes himself clear?",
    "Then why have there not been placed upon him bracelets of gold or come with him the angels in conjunction?\"",
    "So he bluffed his people, and they obeyed him. Indeed, they were [themselves] a people defiantly disobedient [of Allah].",
    "And when they angered Us, We took retribution from them and drowned them all.",
    "And We made them a precedent and an example for the later peoples.",
    "And when the son of Mary was presented as an example, immediately your people laughed aloud.",
    "And they said, \"Are our gods better, or is he?\" They did not present the comparison except for [mere] argument. But, [in fact], they are a people prone to dispute.",
    "Jesus was not but a servant upon whom We bestowed favor, and We made him an example for the Children of Israel.",
    "And if We willed, We could have made [instead] of you angels succeeding [one another] on the earth.",
    "And indeed, Jesus will be [a sign for] knowledge of the Hour, so be not in doubt of it, and follow Me. This is a straight path.",
    "And never let Satan avert you. Indeed, he is to you a clear enemy.",
    "And when Jesus brought clear proofs, he said, \"I have come to you with wisdom and to make clear to you some of that over which you differ, so fear Allah and obey me.",
    "Indeed, Allah is my Lord and your Lord, so worship Him. This is a straight path.\"",
    "But the denominations from among them differed [and separated], so woe to those who have wronged from the punishment of a painful Day.",
    "Are they waiting except for the Hour to come upon them suddenly while they perceive not?",
    "Close friends, that Day, will be enemies to each other, except for the righteous",
    "[To whom Allah will say], \"O My servants, no fear will there be concerning you this Day, nor will you grieve,",
    "[You] who believed in Our verses and were Muslims.",
    "Enter Paradise, you and your kinds, delighted.\"",
    "Circulated among them will be plates and vessels of gold. And therein is whatever the souls desire and [what] delights the eyes, and you will abide therein eternally.",
    "And that is Paradise which you are made to inherit for what you used to do.",
    "For you therein is much fruit from which you will eat.",
    "Indeed, the criminals will be in the punishment of Hell, abiding eternally.",
    "It will not be allowed to subside for them, and they, therein, are in despair.",
    "And We did not wrong them, but it was they who were the wrongdoers.",
    "And they will call, \"O Malik, let your Lord put an end to us!\" He will say, \"Indeed, you will remain.\"",
    "We had certainly brought you the truth, but most of you, to the truth, were averse.",
    "Or have they devised [some] affair? But indeed, We are devising [a plan].",
    "Or do they think that We hear not their secrets and their private conversations? Yes, [We do], and Our messengers are with them recording.",
    "Say, [O Muhammad], \"If the Most Merciful had a son, then I would be the first of [his] worshippers.\"",
    "Exalted is the Lord of the heavens and the earth, Lord of the Throne, above what they describe.",
    "So leave them to converse vainly and amuse themselves until they meet their Day which they are promised.",
    "And it is Allah who is [the only] deity in the heaven, and on the earth [the only] deity. And He is the Wise, the Knowing.",
    "And blessed is He to whom belongs the dominion of the heavens and the earth and whatever is between them and with whom is knowledge of the Hour and to whom you will be returned.",
    "And those they invoke besides Him do not possess [power of] intercession; but only those who testify to the truth [can benefit], and they know.",
    "And if you asked them who created them, they would surely say, \"Allah.\" So how are they deluded?",
    "And [Allah acknowledges] his saying, \"O my Lord, indeed these are a people who do not believe.\"",
    "So turn aside from them and say, \"Peace.\" But they are going to know."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az__zukhruf);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_az_zukhruf);
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
