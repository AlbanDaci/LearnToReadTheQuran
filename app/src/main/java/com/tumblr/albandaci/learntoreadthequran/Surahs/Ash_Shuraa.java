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

public class Ash_Shuraa extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"42:1", "42:2", "42:3", "42:4", "42:5", "42:6", "42:7", "42:8", "42:9", "42:10", "42:11", "42:12", "42:13", "42:14", "42:15", "42:16",
            "42:17", "42:18", "42:19", "42:20", "42:21", "42:22", "42:23", "42:24", "42:25", "42:26", "42:27", "42:28", "42:29", "42:30", "42:31", "42:32",
            "42:33", "42:34", "42:35", "42:36", "42:37", "42:38", "42:39", "42:40", "42:41", "42:42", "42:43", "42:44", "42:45", "42:46", "42:47", "42:48",
            "42:49", "42:50", "42:51", "42:52", "42:53", ""};

    String [] arabic_verses = {"حم",
    "عسق",
    "كَذَٰلِكَ يُوحِي إِلَيْكَ وَإِلَى الَّذِينَ مِن قَبْلِكَ اللَّهُ الْعَزِيزُ الْحَكِيمُ",
    "لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۖ وَهُوَ الْعَلِيُّ الْعَظِيمُ",
    "تَكَادُ السَّمَاوَاتُ يَتَفَطَّرْنَ مِن فَوْقِهِنَّ ۚ وَالْمَلَائِكَةُ يُسَبِّحُونَ بِحَمْدِ رَبِّهِمْ وَيَسْتَغْفِرُونَ لِمَن فِي الْأَرْضِ ۗ أَلَا إِنَّ اللَّهَ هُوَ الْغَفُورُ الرَّحِيمُ",
    "وَالَّذِينَ اتَّخَذُوا مِن دُونِهِ أَوْلِيَاءَ اللَّهُ حَفِيظٌ عَلَيْهِمْ وَمَا أَنتَ عَلَيْهِم بِوَكِيلٍ",
    "وَكَذَٰلِكَ أَوْحَيْنَا إِلَيْكَ قُرْآنًا عَرَبِيًّا لِّتُنذِرَ أُمَّ الْقُرَىٰ وَمَنْ حَوْلَهَا وَتُنذِرَ يَوْمَ الْجَمْعِ لَا رَيْبَ فِيهِ ۚ فَرِيقٌ فِي الْجَنَّةِ وَفَرِيقٌ فِي السَّعِيرِ",
    "وَلَوْ شَاءَ اللَّهُ لَجَعَلَهُمْ أُمَّةً وَاحِدَةً وَلَٰكِن يُدْخِلُ مَن يَشَاءُ فِي رَحْمَتِهِ ۚ وَالظَّالِمُونَ مَا لَهُم مِّن وَلِيٍّ وَلَا نَصِيرٍ",
    "أَمِ اتَّخَذُوا مِن دُونِهِ أَوْلِيَاءَ ۖ فَاللَّهُ هُوَ الْوَلِيُّ وَهُوَ يُحْيِي الْمَوْتَىٰ وَهُوَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "وَمَا اخْتَلَفْتُمْ فِيهِ مِن شَيْءٍ فَحُكْمُهُ إِلَى اللَّهِ ۚ ذَٰلِكُمُ اللَّهُ رَبِّي عَلَيْهِ تَوَكَّلْتُ وَإِلَيْهِ أُنِيبُ",
    "فَاطِرُ السَّمَاوَاتِ وَالْأَرْضِ ۚ جَعَلَ لَكُم مِّنْ أَنفُسِكُمْ أَزْوَاجًا وَمِنَ الْأَنْعَامِ أَزْوَاجًا ۖ يَذْرَؤُكُمْ فِيهِ ۚ لَيْسَ كَمِثْلِهِ شَيْءٌ ۖ وَهُوَ السَّمِيعُ الْبَصِيرُ",
    "لَهُ مَقَالِيدُ السَّمَاوَاتِ وَالْأَرْضِ ۖ يَبْسُطُ الرِّزْقَ لِمَن يَشَاءُ وَيَقْدِرُ ۚ إِنَّهُ بِكُلِّ شَيْءٍ عَلِيمٌ",
    "شَرَعَ لَكُم مِّنَ الدِّينِ مَا وَصَّىٰ بِهِ نُوحًا وَالَّذِي أَوْحَيْنَا إِلَيْكَ وَمَا وَصَّيْنَا بِهِ إِبْرَاهِيمَ وَمُوسَىٰ وَعِيسَىٰ ۖ أَنْ أَقِيمُوا الدِّينَ وَلَا تَتَفَرَّقُوا فِيهِ ۚ كَبُرَ عَلَى الْمُشْرِكِينَ مَا تَدْعُوهُمْ إِلَيْهِ ۚ اللَّهُ يَجْتَبِي إِلَيْهِ مَن يَشَاءُ وَيَهْدِي إِلَيْهِ مَن يُنِيبُ",
    "وَمَا تَفَرَّقُوا إِلَّا مِن بَعْدِ مَا جَاءَهُمُ الْعِلْمُ بَغْيًا بَيْنَهُمْ ۚ وَلَوْلَا كَلِمَةٌ سَبَقَتْ مِن رَّبِّكَ إِلَىٰ أَجَلٍ مُّسَمًّى لَّقُضِيَ بَيْنَهُمْ ۚ وَإِنَّ الَّذِينَ أُورِثُوا الْكِتَابَ مِن بَعْدِهِمْ لَفِي شَكٍّ مِّنْهُ مُرِيبٍ",
    "فَلِذَٰلِكَ فَادْعُ ۖ وَاسْتَقِمْ كَمَا أُمِرْتَ ۖ وَلَا تَتَّبِعْ أَهْوَاءَهُمْ ۖ وَقُلْ آمَنتُ بِمَا أَنزَلَ اللَّهُ مِن كِتَابٍ ۖ وَأُمِرْتُ لِأَعْدِلَ بَيْنَكُمُ ۖ اللَّهُ رَبُّنَا وَرَبُّكُمْ ۖ لَنَا أَعْمَالُنَا وَلَكُمْ أَعْمَالُكُمْ ۖ لَا حُجَّةَ بَيْنَنَا وَبَيْنَكُمُ ۖ اللَّهُ يَجْمَعُ بَيْنَنَا ۖ وَإِلَيْهِ الْمَصِيرُ",
    "وَالَّذِينَ يُحَاجُّونَ فِي اللَّهِ مِن بَعْدِ مَا اسْتُجِيبَ لَهُ حُجَّتُهُمْ دَاحِضَةٌ عِندَ رَبِّهِمْ وَعَلَيْهِمْ غَضَبٌ وَلَهُمْ عَذَابٌ شَدِيدٌ",
    "اللَّهُ الَّذِي أَنزَلَ الْكِتَابَ بِالْحَقِّ وَالْمِيزَانَ ۗ وَمَا يُدْرِيكَ لَعَلَّ السَّاعَةَ قَرِيبٌ",
    "يَسْتَعْجِلُ بِهَا الَّذِينَ لَا يُؤْمِنُونَ بِهَا ۖ وَالَّذِينَ آمَنُوا مُشْفِقُونَ مِنْهَا وَيَعْلَمُونَ أَنَّهَا الْحَقُّ ۗ أَلَا إِنَّ الَّذِينَ يُمَارُونَ فِي السَّاعَةِ لَفِي ضَلَالٍ بَعِيدٍ",
    "اللَّهُ لَطِيفٌ بِعِبَادِهِ يَرْزُقُ مَن يَشَاءُ ۖ وَهُوَ الْقَوِيُّ الْعَزِيزُ",
    "مَن كَانَ يُرِيدُ حَرْثَ الْآخِرَةِ نَزِدْ لَهُ فِي حَرْثِهِ ۖ وَمَن كَانَ يُرِيدُ حَرْثَ الدُّنْيَا نُؤْتِهِ مِنْهَا وَمَا لَهُ فِي الْآخِرَةِ مِن نَّصِيبٍ",
    "أَمْ لَهُمْ شُرَكَاءُ شَرَعُوا لَهُم مِّنَ الدِّينِ مَا لَمْ يَأْذَن بِهِ اللَّهُ ۚ وَلَوْلَا كَلِمَةُ الْفَصْلِ لَقُضِيَ بَيْنَهُمْ ۗ وَإِنَّ الظَّالِمِينَ لَهُمْ عَذَابٌ أَلِيمٌ",
    "تَرَى الظَّالِمِينَ مُشْفِقِينَ مِمَّا كَسَبُوا وَهُوَ وَاقِعٌ بِهِمْ ۗ وَالَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ فِي رَوْضَاتِ الْجَنَّاتِ ۖ لَهُم مَّا يَشَاءُونَ عِندَ رَبِّهِمْ ۚ ذَٰلِكَ هُوَ الْفَضْلُ الْكَبِيرُ",
    "ذَٰلِكَ الَّذِي يُبَشِّرُ اللَّهُ عِبَادَهُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ ۗ قُل لَّا أَسْأَلُكُمْ عَلَيْهِ أَجْرًا إِلَّا الْمَوَدَّةَ فِي الْقُرْبَىٰ ۗ وَمَن يَقْتَرِفْ حَسَنَةً نَّزِدْ لَهُ فِيهَا حُسْنًا ۚ إِنَّ اللَّهَ غَفُورٌ شَكُورٌ",
    "أَمْ يَقُولُونَ افْتَرَىٰ عَلَى اللَّهِ كَذِبًا ۖ فَإِن يَشَإِ اللَّهُ يَخْتِمْ عَلَىٰ قَلْبِكَ ۗ وَيَمْحُ اللَّهُ الْبَاطِلَ وَيُحِقُّ الْحَقَّ بِكَلِمَاتِهِ ۚ إِنَّهُ عَلِيمٌ بِذَاتِ الصُّدُورِ",
    "وَهُوَ الَّذِي يَقْبَلُ التَّوْبَةَ عَنْ عِبَادِهِ وَيَعْفُو عَنِ السَّيِّئَاتِ وَيَعْلَمُ مَا تَفْعَلُونَ",
    "وَيَسْتَجِيبُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ وَيَزِيدُهُم مِّن فَضْلِهِ ۚ وَالْكَافِرُونَ لَهُمْ عَذَابٌ شَدِيدٌ",
    "وَلَوْ بَسَطَ اللَّهُ الرِّزْقَ لِعِبَادِهِ لَبَغَوْا فِي الْأَرْضِ وَلَٰكِن يُنَزِّلُ بِقَدَرٍ مَّا يَشَاءُ ۚ إِنَّهُ بِعِبَادِهِ خَبِيرٌ بَصِيرٌ",
    "وَهُوَ الَّذِي يُنَزِّلُ الْغَيْثَ مِن بَعْدِ مَا قَنَطُوا وَيَنشُرُ رَحْمَتَهُ ۚ وَهُوَ الْوَلِيُّ الْحَمِيدُ",
    "وَمِنْ آيَاتِهِ خَلْقُ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَثَّ فِيهِمَا مِن دَابَّةٍ ۚ وَهُوَ عَلَىٰ جَمْعِهِمْ إِذَا يَشَاءُ قَدِيرٌ",
    "وَمَا أَصَابَكُم مِّن مُّصِيبَةٍ فَبِمَا كَسَبَتْ أَيْدِيكُمْ وَيَعْفُو عَن كَثِيرٍ",
    "وَمَا أَنتُم بِمُعْجِزِينَ فِي الْأَرْضِ ۖ وَمَا لَكُم مِّن دُونِ اللَّهِ مِن وَلِيٍّ وَلَا نَصِيرٍ",
    "وَمِنْ آيَاتِهِ الْجَوَارِ فِي الْبَحْرِ كَالْأَعْلَامِ",
    "إِن يَشَأْ يُسْكِنِ الرِّيحَ فَيَظْلَلْنَ رَوَاكِدَ عَلَىٰ ظَهْرِهِ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّكُلِّ صَبَّارٍ شَكُورٍ",
    "أَوْ يُوبِقْهُنَّ بِمَا كَسَبُوا وَيَعْفُ عَن كَثِيرٍ",
    "وَيَعْلَمَ الَّذِينَ يُجَادِلُونَ فِي آيَاتِنَا مَا لَهُم مِّن مَّحِيصٍ",
    "فَمَا أُوتِيتُم مِّن شَيْءٍ فَمَتَاعُ الْحَيَاةِ الدُّنْيَا ۖ وَمَا عِندَ اللَّهِ خَيْرٌ وَأَبْقَىٰ لِلَّذِينَ آمَنُوا وَعَلَىٰ رَبِّهِمْ يَتَوَكَّلُونَ",
    "وَالَّذِينَ يَجْتَنِبُونَ كَبَائِرَ الْإِثْمِ وَالْفَوَاحِشَ وَإِذَا مَا غَضِبُوا هُمْ يَغْفِرُونَ",
    "وَالَّذِينَ اسْتَجَابُوا لِرَبِّهِمْ وَأَقَامُوا الصَّلَاةَ وَأَمْرُهُمْ شُورَىٰ بَيْنَهُمْ وَمِمَّا رَزَقْنَاهُمْ يُنفِقُونَ",
    "وَالَّذِينَ إِذَا أَصَابَهُمُ الْبَغْيُ هُمْ يَنتَصِرُونَ",
    "وَجَزَاءُ سَيِّئَةٍ سَيِّئَةٌ مِّثْلُهَا ۖ فَمَنْ عَفَا وَأَصْلَحَ فَأَجْرُهُ عَلَى اللَّهِ ۚ إِنَّهُ لَا يُحِبُّ الظَّالِمِينَ",
    "وَلَمَنِ انتَصَرَ بَعْدَ ظُلْمِهِ فَأُولَٰئِكَ مَا عَلَيْهِم مِّن سَبِيلٍ",
    "إِنَّمَا السَّبِيلُ عَلَى الَّذِينَ يَظْلِمُونَ النَّاسَ وَيَبْغُونَ فِي الْأَرْضِ بِغَيْرِ الْحَقِّ ۚ أُولَٰئِكَ لَهُمْ عَذَابٌ أَلِيمٌ",
    "وَلَمَن صَبَرَ وَغَفَرَ إِنَّ ذَٰلِكَ لَمِنْ عَزْمِ الْأُمُورِ",
    "وَمَن يُضْلِلِ اللَّهُ فَمَا لَهُ مِن وَلِيٍّ مِّن بَعْدِهِ ۗ وَتَرَى الظَّالِمِينَ لَمَّا رَأَوُا الْعَذَابَ يَقُولُونَ هَلْ إِلَىٰ مَرَدٍّ مِّن سَبِيلٍ",
    "وَتَرَاهُمْ يُعْرَضُونَ عَلَيْهَا خَاشِعِينَ مِنَ الذُّلِّ يَنظُرُونَ مِن طَرْفٍ خَفِيٍّ ۗ وَقَالَ الَّذِينَ آمَنُوا إِنَّ الْخَاسِرِينَ الَّذِينَ خَسِرُوا أَنفُسَهُمْ وَأَهْلِيهِمْ يَوْمَ الْقِيَامَةِ ۗ أَلَا إِنَّ الظَّالِمِينَ فِي عَذَابٍ مُّقِيمٍ",
    "وَمَا كَانَ لَهُم مِّنْ أَوْلِيَاءَ يَنصُرُونَهُم مِّن دُونِ اللَّهِ ۗ وَمَن يُضْلِلِ اللَّهُ فَمَا لَهُ مِن سَبِيلٍ",
    "اسْتَجِيبُوا لِرَبِّكُم مِّن قَبْلِ أَن يَأْتِيَ يَوْمٌ لَّا مَرَدَّ لَهُ مِنَ اللَّهِ ۚ مَا لَكُم مِّن مَّلْجَإٍ يَوْمَئِذٍ وَمَا لَكُم مِّن نَّكِيرٍ",
    "فَإِنْ أَعْرَضُوا فَمَا أَرْسَلْنَاكَ عَلَيْهِمْ حَفِيظًا ۖ إِنْ عَلَيْكَ إِلَّا الْبَلَاغُ ۗ وَإِنَّا إِذَا أَذَقْنَا الْإِنسَانَ مِنَّا رَحْمَةً فَرِحَ بِهَا ۖ وَإِن تُصِبْهُمْ سَيِّئَةٌ بِمَا قَدَّمَتْ أَيْدِيهِمْ فَإِنَّ الْإِنسَانَ كَفُورٌ",
    "لِّلَّهِ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ ۚ يَخْلُقُ مَا يَشَاءُ ۚ يَهَبُ لِمَن يَشَاءُ إِنَاثًا وَيَهَبُ لِمَن يَشَاءُ الذُّكُورَ",
    "أَوْ يُزَوِّجُهُمْ ذُكْرَانًا وَإِنَاثًا ۖ وَيَجْعَلُ مَن يَشَاءُ عَقِيمًا ۚ إِنَّهُ عَلِيمٌ قَدِيرٌ",
    "وَمَا كَانَ لِبَشَرٍ أَن يُكَلِّمَهُ اللَّهُ إِلَّا وَحْيًا أَوْ مِن وَرَاءِ حِجَابٍ أَوْ يُرْسِلَ رَسُولًا فَيُوحِيَ بِإِذْنِهِ مَا يَشَاءُ ۚ إِنَّهُ عَلِيٌّ حَكِيمٌ",
    "وَكَذَٰلِكَ أَوْحَيْنَا إِلَيْكَ رُوحًا مِّنْ أَمْرِنَا ۚ مَا كُنتَ تَدْرِي مَا الْكِتَابُ وَلَا الْإِيمَانُ وَلَٰكِن جَعَلْنَاهُ نُورًا نَّهْدِي بِهِ مَن نَّشَاءُ مِنْ عِبَادِنَا ۚ وَإِنَّكَ لَتَهْدِي إِلَىٰ صِرَاطٍ مُّسْتَقِيمٍ",
    "صِرَاطِ اللَّهِ الَّذِي لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۗ أَلَا إِلَى اللَّهِ تَصِيرُ الْأُمُورُ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Ha, Meem.",
    "'Ayn, Seen, Qaf.",
    "Thus has He revealed to you, [O Muhammad], and to those before you - Allah, the Exalted in Might, the Wise.",
    "To Him belongs whatever is in the heavens and whatever is in the earth, and He is the Most High, the Most Great.",
    "The heavens almost break from above them, and the angels exalt [Allah] with praise of their Lord and ask forgiveness for those on earth. Unquestionably, it is Allah who is the Forgiving, the Merciful.",
    "And those who take as allies other than Him - Allah is [yet] Guardian over them; and you, [O Muhammad], are not over them a manager.",
    "And thus We have revealed to you an Arabic Qur'an that you may warn the Mother of Cities [Makkah] and those around it and warn of the Day of Assembly, about which there is no doubt. A party will be in Paradise and a party in the Blaze.",
    "And if Allah willed, He could have made them [of] one religion, but He admits whom He wills into His mercy. And the wrongdoers have not any protector or helper.",
    "Or have they taken protectors [or allies] besides him? But Allah - He is the Protector, and He gives life to the dead, and He is over all things competent.",
    "And in anything over which you disagree - its ruling is [to be referred] to Allah. [Say], \"That is Allah, my Lord; upon Him I have relied, and to Him I turn back.\"",
    "[He is] Creator of the heavens and the earth. He has made for you from yourselves, mates, and among the cattle, mates; He multiplies you thereby. There is nothing like unto Him, and He is the Hearing, the Seeing.",
    "To Him belong the keys of the heavens and the earth. He extends provision for whom He wills and restricts [it]. Indeed He is, of all things, Knowing.",
    "He has ordained for you of religion what He enjoined upon Noah and that which We have revealed to you, [O Muhammad], and what We enjoined upon Abraham and Moses and Jesus - to establish the religion and not be divided therein. Difficult for those who associate others with Allah is that to which you invite them. Allah chooses for Himself whom He wills and guides to Himself whoever turns back [to Him].",
    "And they did not become divided until after knowledge had come to them - out of jealous animosity between themselves. And if not for a word that preceded from your Lord [postponing the penalty] until a specified time, it would have been concluded between them. And indeed, those who were granted inheritance of the Scripture after them are, concerning it, in disquieting doubt.",
    "So to that [religion of Allah] invite, [O Muhammad], and remain on a right course as you are commanded and do not follow their inclinations but say, \"I have believed in what Allah has revealed of the Qur'an, and I have been commanded to do justice among you. Allah is our Lord and your Lord. For us are our deeds, and for you your deeds. There is no [need for] argument between us and you. Allah will bring us together, and to Him is the [final] destination.\"",
    "And those who argue concerning Allah after He has been responded to - their argument is invalid with their Lord, and upon them is [His] wrath, and for them is a severe punishment.",
    "It is Allah who has sent down the Book in truth and [also] the balance. And what will make you perceive? Perhaps the Hour is near.",
    "Those who do not believe in it are impatient for it, but those who believe are fearful of it and know that it is the truth. Unquestionably, those who dispute concerning the Hour are in extreme error.",
    "Allah is Subtle with His servants; He gives provisions to whom He wills. And He is the Powerful, the Exalted in Might.",
    "Whoever desires the harvest of the Hereafter - We increase for him in his harvest. And whoever desires the harvest of this world - We give him thereof, but there is not for him in the Hereafter any share.",
    "Or have they other deities who have ordained for them a religion to which Allah has not consented? But if not for the decisive word, it would have been concluded between them. And indeed, the wrongdoers will have a painful punishment.",
    "You will see the wrongdoers fearful of what they have earned, and it will [certainly] befall them. And those who have believed and done righteous deeds will be in lush regions of the gardens [in Paradise] having whatever they will in the presence of their Lord. That is what is the great bounty.",
    "It is that of which Allah gives good tidings to His servants who believe and do righteous deeds. Say, [O Muhammad], \"I do not ask you for this message any payment [but] only good will through kinship.\" And whoever commits a good deed - We will increase for him good therein. Indeed, Allah is Forgiving and Appreciative.",
    "Or do they say, \"He has invented about Allah a lie\"? But if Allah willed, He could seal over your heart. And Allah eliminates falsehood and establishes the truth by His words. Indeed, He is Knowing of that within the breasts.",
    "And it is He who accepts repentance from his servants and pardons misdeeds, and He knows what you do.",
    "And He answers [the supplication of] those who have believed and done righteous deeds and increases [for] them from His bounty. But the disbelievers will have a severe punishment.",
    "And if Allah had extended [excessively] provision for His servants, they would have committed tyranny throughout the earth. But He sends [it] down in an amount which He wills. Indeed He is, of His servants, Acquainted and Seeing.",
    "And it is He who sends down the rain after they had despaired and spreads His mercy. And He is the Protector, the Praiseworthy.",
    "And of his signs is the creation of the heavens and earth and what He has dispersed throughout them of creatures. And He, for gathering them when He wills, is competent.",
    "And whatever strikes you of disaster - it is for what your hands have earned; but He pardons much.",
    "And you will not cause failure [to Allah] upon the earth. And you have not besides Allah any protector or helper.",
    "And of His signs are the ships in the sea, like mountains.",
    "If He willed, He could still the wind, and they would remain motionless on its surface. Indeed in that are signs for everyone patient and grateful.",
    "Or He could destroy them for what they earned; but He pardons much.",
    "And [that is so] those who dispute concerning Our signs may know that for them there is no place of escape.",
    "So whatever thing you have been given - it is but [for] enjoyment of the worldly life. But what is with Allah is better and more lasting for those who have believed and upon their Lord rely",
    "And those who avoid the major sins and immoralities, and when they are angry, they forgive,",
    "And those who have responded to their lord and established prayer and whose affair is [determined by] consultation among themselves, and from what We have provided them, they spend.",
    "And those who, when tyranny strikes them, they defend themselves,",
    "And the retribution for an evil act is an evil one like it, but whoever pardons and makes reconciliation - his reward is [due] from Allah. Indeed, He does not like wrongdoers.",
    "And whoever avenges himself after having been wronged - those have not upon them any cause [for blame].",
    "The cause is only against the ones who wrong the people and tyrannize upon the earth without right. Those will have a painful punishment.",
    "And whoever is patient and forgives - indeed, that is of the matters [requiring] determination.",
    "And he whom Allah sends astray - for him there is no protector beyond Him. And you will see the wrongdoers, when they see the punishment, saying, \"Is there for return [to the former world] any way?\"",
    "And you will see them being exposed to the Fire, humbled from humiliation, looking from [behind] a covert glance. And those who had believed will say, \"Indeed, the [true] losers are the ones who lost themselves and their families on the Day of Resurrection. Unquestionably, the wrongdoers are in an enduring punishment.\"",
    "And there will not be for them any allies to aid them other than Allah. And whoever Allah sends astray - for him there is no way.",
    "Respond to your Lord before a Day comes from Allah of which there is no repelling. No refuge will you have that day, nor for you will there be any denial.",
    "But if they turn away - then We have not sent you, [O Muhammad], over them as a guardian; upon you is only [the duty of] notification. And indeed, when We let man taste mercy from us, he rejoices in it; but if evil afflicts him for what his hands have put forth, then indeed, man is ungrateful.",
    "To Allah belongs the dominion of the heavens and the earth; He creates what he wills. He gives to whom He wills female [children], and He gives to whom He wills males.",
    "Or He makes them [both] males and females, and He renders whom He wills barren. Indeed, He is Knowing and Competent.",
    "And it is not for any human being that Allah should speak to him except by revelation or from behind a partition or that He sends a messenger to reveal, by His permission, what He wills. Indeed, He is Most High and Wise.",
    "And thus We have revealed to you an inspiration of Our command. You did not know what is the Book or [what is] faith, but We have made it a light by which We guide whom We will of Our servants. And indeed, [O Muhammad], you guide to a straight path -",
    "The path of Allah, to whom belongs whatever is in the heavens and whatever is on the earth. Unquestionably, to Allah do [all] matters evolve.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ash__shuraa);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ash_shuraa);
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
