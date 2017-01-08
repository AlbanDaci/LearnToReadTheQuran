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

public class An_Nur extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"24:1", "24:2", "24:3", "24:4", "24:5", "24:6", "24:7", "24:8", "24:9", "24:10", "24:11", "24:12", "24:13", "24:14", "24:15", "24:16",
            "24:17", "24:18", "24:19", "24:20", "24:21", "24:22", "24:23", "24:24", "24:25", "24:26", "24:27", "24:28", "24:29", "24:30", "24:31", "24:32",
            "24:33", "24:34", "24:35", "24:36", "24:37", "24:38", "24:39", "24:40", "24:41", "24:42", "24:43", "24:44", "24:45", "24:46", "24:47", "24:48",
            "24:49", "24:50", "24:51", "24:52", "24:53", "24:54", "24:55", "24:56", "24:57", "24:58", "24:59", "24:60", "24:61", "24:62", "24:63", "24:64"};

    String [] arabic_verses = {"سُورَةٌ أَنزَلْنَاهَا وَفَرَضْنَاهَا وَأَنزَلْنَا فِيهَا آيَاتٍ بَيِّنَاتٍ لَّعَلَّكُمْ تَذَكَّرُونَ",
    "الزَّانِيَةُ وَالزَّانِي فَاجْلِدُوا كُلَّ وَاحِدٍ مِّنْهُمَا مِائَةَ جَلْدَةٍ ۖ وَلَا تَأْخُذْكُم بِهِمَا رَأْفَةٌ فِي دِينِ اللَّهِ إِن كُنتُمْ تُؤْمِنُونَ بِاللَّهِ وَالْيَوْمِ الْآخِرِ ۖ وَلْيَشْهَدْ عَذَابَهُمَا طَائِفَةٌ مِّنَ الْمُؤْمِنِينَ",
    "الزَّانِي لَا يَنكِحُ إِلَّا زَانِيَةً أَوْ مُشْرِكَةً وَالزَّانِيَةُ لَا يَنكِحُهَا إِلَّا زَانٍ أَوْ مُشْرِكٌ ۚ وَحُرِّمَ ذَٰلِكَ عَلَى الْمُؤْمِنِينَ",
    "وَالَّذِينَ يَرْمُونَ الْمُحْصَنَاتِ ثُمَّ لَمْ يَأْتُوا بِأَرْبَعَةِ شُهَدَاءَ فَاجْلِدُوهُمْ ثَمَانِينَ جَلْدَةً وَلَا تَقْبَلُوا لَهُمْ شَهَادَةً أَبَدًا ۚ وَأُولَٰئِكَ هُمُ الْفَاسِقُونَ",
    "إِلَّا الَّذِينَ تَابُوا مِن بَعْدِ ذَٰلِكَ وَأَصْلَحُوا فَإِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ",
    "وَالَّذِينَ يَرْمُونَ أَزْوَاجَهُمْ وَلَمْ يَكُن لَّهُمْ شُهَدَاءُ إِلَّا أَنفُسُهُمْ فَشَهَادَةُ أَحَدِهِمْ أَرْبَعُ شَهَادَاتٍ بِاللَّهِ ۙ إِنَّهُ لَمِنَ الصَّادِقِينَ",
    "وَالْخَامِسَةُ أَنَّ لَعْنَتَ اللَّهِ عَلَيْهِ إِن كَانَ مِنَ الْكَاذِبِينَ",
    "وَيَدْرَأُ عَنْهَا الْعَذَابَ أَن تَشْهَدَ أَرْبَعَ شَهَادَاتٍ بِاللَّهِ ۙ إِنَّهُ لَمِنَ الْكَاذِبِينَ",
    "وَالْخَامِسَةَ أَنَّ غَضَبَ اللَّهِ عَلَيْهَا إِن كَانَ مِنَ الصَّادِقِينَ",
    "وَلَوْلَا فَضْلُ اللَّهِ عَلَيْكُمْ وَرَحْمَتُهُ وَأَنَّ اللَّهَ تَوَّابٌ حَكِيمٌ",
    "إِنَّ الَّذِينَ جَاءُوا بِالْإِفْكِ عُصْبَةٌ مِّنكُمْ ۚ لَا تَحْسَبُوهُ شَرًّا لَّكُم ۖ بَلْ هُوَ خَيْرٌ لَّكُمْ ۚ لِكُلِّ امْرِئٍ مِّنْهُم مَّا اكْتَسَبَ مِنَ الْإِثْمِ ۚ وَالَّذِي تَوَلَّىٰ كِبْرَهُ مِنْهُمْ لَهُ عَذَابٌ عَظِيمٌ",
    "لَّوْلَا إِذْ سَمِعْتُمُوهُ ظَنَّ الْمُؤْمِنُونَ وَالْمُؤْمِنَاتُ بِأَنفُسِهِمْ خَيْرًا وَقَالُوا هَٰذَا إِفْكٌ مُّبِينٌ",
    "لَّوْلَا جَاءُوا عَلَيْهِ بِأَرْبَعَةِ شُهَدَاءَ ۚ فَإِذْ لَمْ يَأْتُوا بِالشُّهَدَاءِ فَأُولَٰئِكَ عِندَ اللَّهِ هُمُ الْكَاذِبُونَ",
    "وَلَوْلَا فَضْلُ اللَّهِ عَلَيْكُمْ وَرَحْمَتُهُ فِي الدُّنْيَا وَالْآخِرَةِ لَمَسَّكُمْ فِي مَا أَفَضْتُمْ فِيهِ عَذَابٌ عَظِيمٌ",
    "إِذْ تَلَقَّوْنَهُ بِأَلْسِنَتِكُمْ وَتَقُولُونَ بِأَفْوَاهِكُم مَّا لَيْسَ لَكُم بِهِ عِلْمٌ وَتَحْسَبُونَهُ هَيِّنًا وَهُوَ عِندَ اللَّهِ عَظِيمٌ",
    "وَلَوْلَا إِذْ سَمِعْتُمُوهُ قُلْتُم مَّا يَكُونُ لَنَا أَن نَّتَكَلَّمَ بِهَٰذَا سُبْحَانَكَ هَٰذَا بُهْتَانٌ عَظِيمٌ",
    "يَعِظُكُمُ اللَّهُ أَن تَعُودُوا لِمِثْلِهِ أَبَدًا إِن كُنتُم مُّؤْمِنِينَ",
    "وَيُبَيِّنُ اللَّهُ لَكُمُ الْآيَاتِ ۚ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "إِنَّ الَّذِينَ يُحِبُّونَ أَن تَشِيعَ الْفَاحِشَةُ فِي الَّذِينَ آمَنُوا لَهُمْ عَذَابٌ أَلِيمٌ فِي الدُّنْيَا وَالْآخِرَةِ ۚ وَاللَّهُ يَعْلَمُ وَأَنتُمْ لَا تَعْلَمُونَ",
    "وَلَوْلَا فَضْلُ اللَّهِ عَلَيْكُمْ وَرَحْمَتُهُ وَأَنَّ اللَّهَ رَءُوفٌ رَّحِيمٌ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تَتَّبِعُوا خُطُوَاتِ الشَّيْطَانِ ۚ وَمَن يَتَّبِعْ خُطُوَاتِ الشَّيْطَانِ فَإِنَّهُ يَأْمُرُ بِالْفَحْشَاءِ وَالْمُنكَرِ ۚ وَلَوْلَا فَضْلُ اللَّهِ عَلَيْكُمْ وَرَحْمَتُهُ مَا زَكَىٰ مِنكُم مِّنْ أَحَدٍ أَبَدًا وَلَٰكِنَّ اللَّهَ يُزَكِّي مَن يَشَاءُ ۗ وَاللَّهُ سَمِيعٌ عَلِيمٌ",
    "وَلَا يَأْتَلِ أُولُو الْفَضْلِ مِنكُمْ وَالسَّعَةِ أَن يُؤْتُوا أُولِي الْقُرْبَىٰ وَالْمَسَاكِينَ وَالْمُهَاجِرِينَ فِي سَبِيلِ اللَّهِ ۖ وَلْيَعْفُوا وَلْيَصْفَحُوا ۗ أَلَا تُحِبُّونَ أَن يَغْفِرَ اللَّهُ لَكُمْ ۗ وَاللَّهُ غَفُورٌ رَّحِيمٌ",
    "إِنَّ الَّذِينَ يَرْمُونَ الْمُحْصَنَاتِ الْغَافِلَاتِ الْمُؤْمِنَاتِ لُعِنُوا فِي الدُّنْيَا وَالْآخِرَةِ وَلَهُمْ عَذَابٌ عَظِيمٌ",
    "يَوْمَ تَشْهَدُ عَلَيْهِمْ أَلْسِنَتُهُمْ وَأَيْدِيهِمْ وَأَرْجُلُهُم بِمَا كَانُوا يَعْمَلُونَ",
    "يَوْمَئِذٍ يُوَفِّيهِمُ اللَّهُ دِينَهُمُ الْحَقَّ وَيَعْلَمُونَ أَنَّ اللَّهَ هُوَ الْحَقُّ الْمُبِينُ",
    "الْخَبِيثَاتُ لِلْخَبِيثِينَ وَالْخَبِيثُونَ لِلْخَبِيثَاتِ ۖ وَالطَّيِّبَاتُ لِلطَّيِّبِينَ وَالطَّيِّبُونَ لِلطَّيِّبَاتِ ۚ أُولَٰئِكَ مُبَرَّءُونَ مِمَّا يَقُولُونَ ۖ لَهُم مَّغْفِرَةٌ وَرِزْقٌ كَرِيمٌ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تَدْخُلُوا بُيُوتًا غَيْرَ بُيُوتِكُمْ حَتَّىٰ تَسْتَأْنِسُوا وَتُسَلِّمُوا عَلَىٰ أَهْلِهَا ۚ ذَٰلِكُمْ خَيْرٌ لَّكُمْ لَعَلَّكُمْ تَذَكَّرُونَ",
    "فَإِن لَّمْ تَجِدُوا فِيهَا أَحَدًا فَلَا تَدْخُلُوهَا حَتَّىٰ يُؤْذَنَ لَكُمْ ۖ وَإِن قِيلَ لَكُمُ ارْجِعُوا فَارْجِعُوا ۖ هُوَ أَزْكَىٰ لَكُمْ ۚ وَاللَّهُ بِمَا تَعْمَلُونَ عَلِيمٌ",
    "لَّيْسَ عَلَيْكُمْ جُنَاحٌ أَن تَدْخُلُوا بُيُوتًا غَيْرَ مَسْكُونَةٍ فِيهَا مَتَاعٌ لَّكُمْ ۚ وَاللَّهُ يَعْلَمُ مَا تُبْدُونَ وَمَا تَكْتُمُونَ",
    "قُل لِّلْمُؤْمِنِينَ يَغُضُّوا مِنْ أَبْصَارِهِمْ وَيَحْفَظُوا فُرُوجَهُمْ ۚ ذَٰلِكَ أَزْكَىٰ لَهُمْ ۗ إِنَّ اللَّهَ خَبِيرٌ بِمَا يَصْنَعُونَ",
    "وَقُل لِّلْمُؤْمِنَاتِ يَغْضُضْنَ مِنْ أَبْصَارِهِنَّ وَيَحْفَظْنَ فُرُوجَهُنَّ وَلَا يُبْدِينَ زِينَتَهُنَّ إِلَّا مَا ظَهَرَ مِنْهَا ۖ وَلْيَضْرِبْنَ بِخُمُرِهِنَّ عَلَىٰ جُيُوبِهِنَّ ۖ وَلَا يُبْدِينَ زِينَتَهُنَّ إِلَّا لِبُعُولَتِهِنَّ أَوْ آبَائِهِنَّ أَوْ آبَاءِ بُعُولَتِهِنَّ أَوْ أَبْنَائِهِنَّ أَوْ أَبْنَاءِ بُعُولَتِهِنَّ أَوْ إِخْوَانِهِنَّ أَوْ بَنِي إِخْوَانِهِنَّ أَوْ بَنِي أَخَوَاتِهِنَّ أَوْ نِسَائِهِنَّ أَوْ مَا مَلَكَتْ أَيْمَانُهُنَّ أَوِ التَّابِعِينَ غَيْرِ أُولِي الْإِرْبَةِ مِنَ الرِّجَالِ أَوِ الطِّفْلِ الَّذِينَ لَمْ يَظْهَرُوا عَلَىٰ عَوْرَاتِ النِّسَاءِ ۖ وَلَا يَضْرِبْنَ بِأَرْجُلِهِنَّ لِيُعْلَمَ مَا يُخْفِينَ مِن زِينَتِهِنَّ ۚ وَتُوبُوا إِلَى اللَّهِ جَمِيعًا أَيُّهَ الْمُؤْمِنُونَ لَعَلَّكُمْ تُفْلِحُونَ",
    "وَأَنكِحُوا الْأَيَامَىٰ مِنكُمْ وَالصَّالِحِينَ مِنْ عِبَادِكُمْ وَإِمَائِكُمْ ۚ إِن يَكُونُوا فُقَرَاءَ يُغْنِهِمُ اللَّهُ مِن فَضْلِهِ ۗ وَاللَّهُ وَاسِعٌ عَلِيمٌ",
    "وَلْيَسْتَعْفِفِ الَّذِينَ لَا يَجِدُونَ نِكَاحًا حَتَّىٰ يُغْنِيَهُمُ اللَّهُ مِن فَضْلِهِ ۗ وَالَّذِينَ يَبْتَغُونَ الْكِتَابَ مِمَّا مَلَكَتْ أَيْمَانُكُمْ فَكَاتِبُوهُمْ إِنْ عَلِمْتُمْ فِيهِمْ خَيْرًا ۖ وَآتُوهُم مِّن مَّالِ اللَّهِ الَّذِي آتَاكُمْ ۚ وَلَا تُكْرِهُوا فَتَيَاتِكُمْ عَلَى الْبِغَاءِ إِنْ أَرَدْنَ تَحَصُّنًا لِّتَبْتَغُوا عَرَضَ الْحَيَاةِ الدُّنْيَا ۚ وَمَن يُكْرِههُّنَّ فَإِنَّ اللَّهَ مِن بَعْدِ إِكْرَاهِهِنَّ غَفُورٌ رَّحِيمٌ",
    "وَلَقَدْ أَنزَلْنَا إِلَيْكُمْ آيَاتٍ مُّبَيِّنَاتٍ وَمَثَلًا مِّنَ الَّذِينَ خَلَوْا مِن قَبْلِكُمْ وَمَوْعِظَةً لِّلْمُتَّقِينَ",
    "اللَّهُ نُورُ السَّمَاوَاتِ وَالْأَرْضِ ۚ مَثَلُ نُورِهِ كَمِشْكَاةٍ فِيهَا مِصْبَاحٌ ۖ الْمِصْبَاحُ فِي زُجَاجَةٍ ۖ الزُّجَاجَةُ كَأَنَّهَا كَوْكَبٌ دُرِّيٌّ يُوقَدُ مِن شَجَرَةٍ مُّبَارَكَةٍ زَيْتُونَةٍ لَّا شَرْقِيَّةٍ وَلَا غَرْبِيَّةٍ يَكَادُ زَيْتُهَا يُضِيءُ وَلَوْ لَمْ تَمْسَسْهُ نَارٌ ۚ نُّورٌ عَلَىٰ نُورٍ ۗ يَهْدِي اللَّهُ لِنُورِهِ مَن يَشَاءُ ۚ وَيَضْرِبُ اللَّهُ الْأَمْثَالَ لِلنَّاسِ ۗ وَاللَّهُ بِكُلِّ شَيْءٍ عَلِيمٌ",
    "فِي بُيُوتٍ أَذِنَ اللَّهُ أَن تُرْفَعَ وَيُذْكَرَ فِيهَا اسْمُهُ يُسَبِّحُ لَهُ فِيهَا بِالْغُدُوِّ وَالْآصَالِ",
    "رِجَالٌ لَّا تُلْهِيهِمْ تِجَارَةٌ وَلَا بَيْعٌ عَن ذِكْرِ اللَّهِ وَإِقَامِ الصَّلَاةِ وَإِيتَاءِ الزَّكَاةِ ۙ يَخَافُونَ يَوْمًا تَتَقَلَّبُ فِيهِ الْقُلُوبُ وَالْأَبْصَارُ",
    "لِيَجْزِيَهُمُ اللَّهُ أَحْسَنَ مَا عَمِلُوا وَيَزِيدَهُم مِّن فَضْلِهِ ۗ وَاللَّهُ يَرْزُقُ مَن يَشَاءُ بِغَيْرِ حِسَابٍ",
    "وَالَّذِينَ كَفَرُوا أَعْمَالُهُمْ كَسَرَابٍ بِقِيعَةٍ يَحْسَبُهُ الظَّمْآنُ مَاءً حَتَّىٰ إِذَا جَاءَهُ لَمْ يَجِدْهُ شَيْئًا وَوَجَدَ اللَّهَ عِندَهُ فَوَفَّاهُ حِسَابَهُ ۗ وَاللَّهُ سَرِيعُ الْحِسَابِ",
    "أَوْ كَظُلُمَاتٍ فِي بَحْرٍ لُّجِّيٍّ يَغْشَاهُ مَوْجٌ مِّن فَوْقِهِ مَوْجٌ مِّن فَوْقِهِ سَحَابٌ ۚ ظُلُمَاتٌ بَعْضُهَا فَوْقَ بَعْضٍ إِذَا أَخْرَجَ يَدَهُ لَمْ يَكَدْ يَرَاهَا ۗ وَمَن لَّمْ يَجْعَلِ اللَّهُ لَهُ نُورًا فَمَا لَهُ مِن نُّورٍ",
    "أَلَمْ تَرَ أَنَّ اللَّهَ يُسَبِّحُ لَهُ مَن فِي السَّمَاوَاتِ وَالْأَرْضِ وَالطَّيْرُ صَافَّاتٍ ۖ كُلٌّ قَدْ عَلِمَ صَلَاتَهُ وَتَسْبِيحَهُ ۗ وَاللَّهُ عَلِيمٌ بِمَا يَفْعَلُونَ",
    "وَلِلَّهِ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ ۖ وَإِلَى اللَّهِ الْمَصِيرُ",
    "أَلَمْ تَرَ أَنَّ اللَّهَ يُزْجِي سَحَابًا ثُمَّ يُؤَلِّفُ بَيْنَهُ ثُمَّ يَجْعَلُهُ رُكَامًا فَتَرَى الْوَدْقَ يَخْرُجُ مِنْ خِلَالِهِ وَيُنَزِّلُ مِنَ السَّمَاءِ مِن جِبَالٍ فِيهَا مِن بَرَدٍ فَيُصِيبُ بِهِ مَن يَشَاءُ وَيَصْرِفُهُ عَن مَّن يَشَاءُ ۖ يَكَادُ سَنَا بَرْقِهِ يَذْهَبُ بِالْأَبْصَارِ",
    "يُقَلِّبُ اللَّهُ اللَّيْلَ وَالنَّهَارَ ۚ إِنَّ فِي ذَٰلِكَ لَعِبْرَةً لِّأُولِي الْأَبْصَارِ",
    "وَاللَّهُ خَلَقَ كُلَّ دَابَّةٍ مِّن مَّاءٍ ۖ فَمِنْهُم مَّن يَمْشِي عَلَىٰ بَطْنِهِ وَمِنْهُم مَّن يَمْشِي عَلَىٰ رِجْلَيْنِ وَمِنْهُم مَّن يَمْشِي عَلَىٰ أَرْبَعٍ ۚ يَخْلُقُ اللَّهُ مَا يَشَاءُ ۚ إِنَّ اللَّهَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "لَّقَدْ أَنزَلْنَا آيَاتٍ مُّبَيِّنَاتٍ ۚ وَاللَّهُ يَهْدِي مَن يَشَاءُ إِلَىٰ صِرَاطٍ مُّسْتَقِيمٍ",
    "وَيَقُولُونَ آمَنَّا بِاللَّهِ وَبِالرَّسُولِ وَأَطَعْنَا ثُمَّ يَتَوَلَّىٰ فَرِيقٌ مِّنْهُم مِّن بَعْدِ ذَٰلِكَ ۚ وَمَا أُولَٰئِكَ بِالْمُؤْمِنِينَ",
    "وَإِذَا دُعُوا إِلَى اللَّهِ وَرَسُولِهِ لِيَحْكُمَ بَيْنَهُمْ إِذَا فَرِيقٌ مِّنْهُم مُّعْرِضُونَ",
    "وَإِن يَكُن لَّهُمُ الْحَقُّ يَأْتُوا إِلَيْهِ مُذْعِنِينَ",
    "أَفِي قُلُوبِهِم مَّرَضٌ أَمِ ارْتَابُوا أَمْ يَخَافُونَ أَن يَحِيفَ اللَّهُ عَلَيْهِمْ وَرَسُولُهُ ۚ بَلْ أُولَٰئِكَ هُمُ الظَّالِمُونَ",
    "إِنَّمَا كَانَ قَوْلَ الْمُؤْمِنِينَ إِذَا دُعُوا إِلَى اللَّهِ وَرَسُولِهِ لِيَحْكُمَ بَيْنَهُمْ أَن يَقُولُوا سَمِعْنَا وَأَطَعْنَا ۚ وَأُولَٰئِكَ هُمُ الْمُفْلِحُونَ",
    "وَمَن يُطِعِ اللَّهَ وَرَسُولَهُ وَيَخْشَ اللَّهَ وَيَتَّقْهِ فَأُولَٰئِكَ هُمُ الْفَائِزُونَ",
    "وَأَقْسَمُوا بِاللَّهِ جَهْدَ أَيْمَانِهِمْ لَئِنْ أَمَرْتَهُمْ لَيَخْرُجُنَّ ۖ قُل لَّا تُقْسِمُوا ۖ طَاعَةٌ مَّعْرُوفَةٌ ۚ إِنَّ اللَّهَ خَبِيرٌ بِمَا تَعْمَلُونَ",
    "قُلْ أَطِيعُوا اللَّهَ وَأَطِيعُوا الرَّسُولَ ۖ فَإِن تَوَلَّوْا فَإِنَّمَا عَلَيْهِ مَا حُمِّلَ وَعَلَيْكُم مَّا حُمِّلْتُمْ ۖ وَإِن تُطِيعُوهُ تَهْتَدُوا ۚ وَمَا عَلَى الرَّسُولِ إِلَّا الْبَلَاغُ الْمُبِينُ",
    "وَعَدَ اللَّهُ الَّذِينَ آمَنُوا مِنكُمْ وَعَمِلُوا الصَّالِحَاتِ لَيَسْتَخْلِفَنَّهُمْ فِي الْأَرْضِ كَمَا اسْتَخْلَفَ الَّذِينَ مِن قَبْلِهِمْ وَلَيُمَكِّنَنَّ لَهُمْ دِينَهُمُ الَّذِي ارْتَضَىٰ لَهُمْ وَلَيُبَدِّلَنَّهُم مِّن بَعْدِ خَوْفِهِمْ أَمْنًا ۚ يَعْبُدُونَنِي لَا يُشْرِكُونَ بِي شَيْئًا ۚ وَمَن كَفَرَ بَعْدَ ذَٰلِكَ فَأُولَٰئِكَ هُمُ الْفَاسِقُونَ",
    "وَأَقِيمُوا الصَّلَاةَ وَآتُوا الزَّكَاةَ وَأَطِيعُوا الرَّسُولَ لَعَلَّكُمْ تُرْحَمُونَ",
    "لَا تَحْسَبَنَّ الَّذِينَ كَفَرُوا مُعْجِزِينَ فِي الْأَرْضِ ۚ وَمَأْوَاهُمُ النَّارُ ۖ وَلَبِئْسَ الْمَصِيرُ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لِيَسْتَأْذِنكُمُ الَّذِينَ مَلَكَتْ أَيْمَانُكُمْ وَالَّذِينَ لَمْ يَبْلُغُوا الْحُلُمَ مِنكُمْ ثَلَاثَ مَرَّاتٍ ۚ مِّن قَبْلِ صَلَاةِ الْفَجْرِ وَحِينَ تَضَعُونَ ثِيَابَكُم مِّنَ الظَّهِيرَةِ وَمِن بَعْدِ صَلَاةِ الْعِشَاءِ ۚ ثَلَاثُ عَوْرَاتٍ لَّكُمْ ۚ لَيْسَ عَلَيْكُمْ وَلَا عَلَيْهِمْ جُنَاحٌ بَعْدَهُنَّ ۚ طَوَّافُونَ عَلَيْكُم بَعْضُكُمْ عَلَىٰ بَعْضٍ ۚ كَذَٰلِكَ يُبَيِّنُ اللَّهُ لَكُمُ الْآيَاتِ ۗ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "وَإِذَا بَلَغَ الْأَطْفَالُ مِنكُمُ الْحُلُمَ فَلْيَسْتَأْذِنُوا كَمَا اسْتَأْذَنَ الَّذِينَ مِن قَبْلِهِمْ ۚ كَذَٰلِكَ يُبَيِّنُ اللَّهُ لَكُمْ آيَاتِهِ ۗ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "وَالْقَوَاعِدُ مِنَ النِّسَاءِ اللَّاتِي لَا يَرْجُونَ نِكَاحًا فَلَيْسَ عَلَيْهِنَّ جُنَاحٌ أَن يَضَعْنَ ثِيَابَهُنَّ غَيْرَ مُتَبَرِّجَاتٍ بِزِينَةٍ ۖ وَأَن يَسْتَعْفِفْنَ خَيْرٌ لَّهُنَّ ۗ وَاللَّهُ سَمِيعٌ عَلِيمٌ",
    "لَّيْسَ عَلَى الْأَعْمَىٰ حَرَجٌ وَلَا عَلَى الْأَعْرَجِ حَرَجٌ وَلَا عَلَى الْمَرِيضِ حَرَجٌ وَلَا عَلَىٰ أَنفُسِكُمْ أَن تَأْكُلُوا مِن بُيُوتِكُمْ أَوْ بُيُوتِ آبَائِكُمْ أَوْ بُيُوتِ أُمَّهَاتِكُمْ أَوْ بُيُوتِ إِخْوَانِكُمْ أَوْ بُيُوتِ أَخَوَاتِكُمْ أَوْ بُيُوتِ أَعْمَامِكُمْ أَوْ بُيُوتِ عَمَّاتِكُمْ أَوْ بُيُوتِ أَخْوَالِكُمْ أَوْ بُيُوتِ خَالَاتِكُمْ أَوْ مَا مَلَكْتُم مَّفَاتِحَهُ أَوْ صَدِيقِكُمْ ۚ لَيْسَ عَلَيْكُمْ جُنَاحٌ أَن تَأْكُلُوا جَمِيعًا أَوْ أَشْتَاتًا ۚ فَإِذَا دَخَلْتُم بُيُوتًا فَسَلِّمُوا عَلَىٰ أَنفُسِكُمْ تَحِيَّةً مِّنْ عِندِ اللَّهِ مُبَارَكَةً طَيِّبَةً ۚ كَذَٰلِكَ يُبَيِّنُ اللَّهُ لَكُمُ الْآيَاتِ لَعَلَّكُمْ تَعْقِلُونَ",
    "إِنَّمَا الْمُؤْمِنُونَ الَّذِينَ آمَنُوا بِاللَّهِ وَرَسُولِهِ وَإِذَا كَانُوا مَعَهُ عَلَىٰ أَمْرٍ جَامِعٍ لَّمْ يَذْهَبُوا حَتَّىٰ يَسْتَأْذِنُوهُ ۚ إِنَّ الَّذِينَ يَسْتَأْذِنُونَكَ أُولَٰئِكَ الَّذِينَ يُؤْمِنُونَ بِاللَّهِ وَرَسُولِهِ ۚ فَإِذَا اسْتَأْذَنُوكَ لِبَعْضِ شَأْنِهِمْ فَأْذَن لِّمَن شِئْتَ مِنْهُمْ وَاسْتَغْفِرْ لَهُمُ اللَّهَ ۚ إِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ",
    "لَّا تَجْعَلُوا دُعَاءَ الرَّسُولِ بَيْنَكُمْ كَدُعَاءِ بَعْضِكُم بَعْضًا ۚ قَدْ يَعْلَمُ اللَّهُ الَّذِينَ يَتَسَلَّلُونَ مِنكُمْ لِوَاذًا ۚ فَلْيَحْذَرِ الَّذِينَ يُخَالِفُونَ عَنْ أَمْرِهِ أَن تُصِيبَهُمْ فِتْنَةٌ أَوْ يُصِيبَهُمْ عَذَابٌ أَلِيمٌ",
    "أَلَا إِنَّ لِلَّهِ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ ۖ قَدْ يَعْلَمُ مَا أَنتُمْ عَلَيْهِ وَيَوْمَ يُرْجَعُونَ إِلَيْهِ فَيُنَبِّئُهُم بِمَا عَمِلُوا ۗ وَاللَّهُ بِكُلِّ شَيْءٍ عَلِيمٌ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"[This is] a surah which We have sent down and made [that within it] obligatory and revealed therein verses of clear evidence that you might remember.",
    "The [unmarried] woman or [unmarried] man found guilty of sexual intercourse - lash each one of them with a hundred lashes, and do not be taken by pity for them in the religion of Allah, if you should believe in Allah and the Last Day. And let a group of the believers witness their punishment.",
    "The fornicator does not marry except a [female] fornicator or polytheist, and none marries her except a fornicator or a polytheist, and that has been made unlawful to the believers.",
    "And those who accuse chaste women and then do not produce four witnesses - lash them with eighty lashes and do not accept from them testimony ever after. And those are the defiantly disobedient,",
    "Except for those who repent thereafter and reform, for indeed, Allah is Forgiving and Merciful.",
    "And those who accuse their wives [of adultery] and have no witnesses except themselves - then the witness of one of them [shall be] four testimonies [swearing] by Allah that indeed, he is of the truthful.",
    "And the fifth [oath will be] that the curse of Allah be upon him if he should be among the liars.",
    "But it will prevent punishment from her if she gives four testimonies [swearing] by Allah that indeed, he is of the liars.",
    "And the fifth [oath will be] that the wrath of Allah be upon her if he was of the truthful.",
    "And if not for the favor of Allah upon you and His mercy... and because Allah is Accepting of repentance and Wise.",
    "Indeed, those who came with falsehood are a group among you. Do not think it bad for you; rather it is good for you. For every person among them is what [punishment] he has earned from the sin, and he who took upon himself the greater portion thereof - for him is a great punishment.",
    "Why, when you heard it, did not the believing men and believing women think good of one another and say, \"This is an obvious falsehood\"?",
    "Why did they [who slandered] not produce for it four witnesses? And when they do not produce the witnesses, then it is they, in the sight of Allah, who are the liars.",
    "And if it had not been for the favor of Allah upon you and His mercy in this world and the Hereafter, you would have been touched for that [lie] in which you were involved by a great punishment",
    "When you received it with your tongues and said with your mouths that of which you had no knowledge and thought it was insignificant while it was, in the sight of Allah, tremendous.",
    "And why, when you heard it, did you not say, \"It is not for us to speak of this. Exalted are You, [O Allah]; this is a great slander\"?",
    "Allah warns you against returning to the likes of this [conduct], ever, if you should be believers.",
    "And Allah makes clear to you the verses, and Allah is Knowing and Wise.",
    "Indeed, those who like that immorality should be spread [or publicized] among those who have believed will have a painful punishment in this world and the Hereafter. And Allah knows and you do not know.",
    "And if it had not been for the favor of Allah upon you and His mercy... and because Allah is Kind and Merciful.",
    "O you who have believed, do not follow the footsteps of Satan. And whoever follows the footsteps of Satan - indeed, he enjoins immorality and wrongdoing. And if not for the favor of Allah upon you and His mercy, not one of you would have been pure, ever, but Allah purifies whom He wills, and Allah is Hearing and Knowing.",
    "And let not those of virtue among you and wealth swear not to give [aid] to their relatives and the needy and the emigrants for the cause of Allah, and let them pardon and overlook. Would you not like that Allah should forgive you? And Allah is Forgiving and Merciful.",
    "Indeed, those who [falsely] accuse chaste, unaware and believing women are cursed in this world and the Hereafter; and they will have a great punishment",
    "On a Day when their tongues, their hands and their feet will bear witness against them as to what they used to do.",
    "That Day, Allah will pay them in full their deserved recompense, and they will know that it is Allah who is the perfect in justice.",
    "Evil words are for evil men, and evil men are [subjected] to evil words. And good words are for good men, and good men are [an object] of good words. Those [good people] are declared innocent of what the slanderers say. For them is forgiveness and noble provision.",
    "O you who have believed, do not enter houses other than your own houses until you ascertain welcome and greet their inhabitants. That is best for you; perhaps you will be reminded.",
    "And if you do not find anyone therein, do not enter them until permission has been given you. And if it is said to you, \"Go back,\" then go back; it is purer for you. And Allah is Knowing of what you do.",
    "There is no blame upon you for entering houses not inhabited in which there is convenience for you. And Allah knows what you reveal and what you conceal.",
    "Tell the believing men to reduce [some] of their vision and guard their private parts. That is purer for them. Indeed, Allah is Acquainted with what they do.",
    "And tell the believing women to reduce [some] of their vision and guard their private parts and not expose their adornment except that which [necessarily] appears thereof and to wrap [a portion of] their headcovers over their chests and not expose their adornment except to their husbands, their fathers, their husbands' fathers, their sons, their husbands' sons, their brothers, their brothers' sons, their sisters' sons, their women, that which their right hands possess, or those male attendants having no physical desire, or children who are not yet aware of the private aspects of women. And let them not stamp their feet to make known what they conceal of their adornment. And turn to Allah in repentance, all of you, O believers, that you might succeed.",
    "And marry the unmarried among you and the righteous among your male slaves and female slaves. If they should be poor, Allah will enrich them from His bounty, and Allah is all-Encompassing and Knowing.",
    "But let them who find not [the means for] marriage abstain [from sexual relations] until Allah enriches them from His bounty. And those who seek a contract [for eventual emancipation] from among whom your right hands possess - then make a contract with them if you know there is within them goodness and give them from the wealth of Allah which He has given you. And do not compel your slave girls to prostitution, if they desire chastity, to seek [thereby] the temporary interests of worldly life. And if someone should compel them, then indeed, Allah is [to them], after their compulsion, Forgiving and Merciful.",
    "And We have certainly sent down to you distinct verses and examples from those who passed on before you and an admonition for those who fear Allah.",
    "Allah is the Light of the heavens and the earth. The example of His light is like a niche within which is a lamp, the lamp is within glass, the glass as if it were a pearly [white] star lit from [the oil of] a blessed olive tree, neither of the east nor of the west, whose oil would almost glow even if untouched by fire. Light upon light. Allah guides to His light whom He wills. And Allah presents examples for the people, and Allah is Knowing of all things.",
    "[Such niches are] in mosques which Allah has ordered to be raised and that His name be mentioned therein; exalting Him within them in the morning and the evenings",
    "[Are] men whom neither commerce nor sale distracts from the remembrance of Allah and performance of prayer and giving of zakah. They fear a Day in which the hearts and eyes will [fearfully] turn about -",
    "That Allah may reward them [according to] the best of what they did and increase them from His bounty. And Allah gives provision to whom He wills without account.",
    "But those who disbelieved - their deeds are like a mirage in a lowland which a thirsty one thinks is water until, when he comes to it, he finds it is nothing but finds Allah before Him, and He will pay him in full his due; and Allah is swift in account.",
    "Or [they are] like darknesses within an unfathomable sea which is covered by waves, upon which are waves, over which are clouds - darknesses, some of them upon others. When one puts out his hand [therein], he can hardly see it. And he to whom Allah has not granted light - for him there is no light.",
    "Do you not see that Allah is exalted by whomever is within the heavens and the earth and [by] the birds with wings spread [in flight]? Each [of them] has known his [means of] prayer and exalting [Him], and Allah is Knowing of what they do.",
    "And to Allah belongs the dominion of the heavens and the earth, and to Allah is the destination.",
    "Do you not see that Allah drives clouds? Then He brings them together, then He makes them into a mass, and you see the rain emerge from within it. And He sends down from the sky, mountains [of clouds] within which is hail, and He strikes with it whom He wills and averts it from whom He wills. The flash of its lightening almost takes away the eyesight.",
    "Allah alternates the night and the day. Indeed in that is a lesson for those who have vision.",
    "Allah has created every [living] creature from water. And of them are those that move on their bellies, and of them are those that walk on two legs, and of them are those that walk on four. Allah creates what He wills. Indeed, Allah is over all things competent.",
    "We have certainly sent down distinct verses. And Allah guides whom He wills to a straight path.",
    "But the hypocrites say, \"We have believed in Allah and in the Messenger, and we obey\"; then a party of them turns away after that. And those are not believers.",
    "And when they are called to [the words of] Allah and His Messenger to judge between them, at once a party of them turns aside [in refusal].",
    "But if the right is theirs, they come to him in prompt obedience.",
    "Is there disease in their hearts? Or have they doubted? Or do they fear that Allah will be unjust to them, or His Messenger? Rather, it is they who are the wrongdoers.",
    "The only statement of the [true] believers when they are called to Allah and His Messenger to judge between them is that they say, \"We hear and we obey.\" And those are the successful.",
    "And whoever obeys Allah and His Messenger and fears Allah and is conscious of Him - it is those who are the attainers.",
    "And they swear by Allah their strongest oaths that if you ordered them, they would go forth [in Allah's cause]. Say, \"Do not swear. [Such] obedience is known. Indeed, Allah is Acquainted with that which you do.\"",
    "Say, \"Obey Allah and obey the Messenger; but if you turn away - then upon him is only that [duty] with which he has been charged, and upon you is that with which you have been charged. And if you obey him, you will be [rightly] guided. And there is not upon the Messenger except the [responsibility for] clear notification.\"",
    "Allah has promised those who have believed among you and done righteous deeds that He will surely grant them succession [to authority] upon the earth just as He granted it to those before them and that He will surely establish for them [therein] their religion which He has preferred for them and that He will surely substitute for them, after their fear, security, [for] they worship Me, not associating anything with Me. But whoever disbelieves after that - then those are the defiantly disobedient.",
    "And establish prayer and give zakah and obey the Messenger - that you may receive mercy.",
    "Never think that the disbelievers are causing failure [to Allah] upon the earth. Their refuge will be the Fire - and how wretched the destination.",
    "O you who have believed, let those whom your right hands possess and those who have not [yet] reached puberty among you ask permission of you [before entering] at three times: before the dawn prayer and when you put aside your clothing [for rest] at noon and after the night prayer. [These are] three times of privacy for you. There is no blame upon you nor upon them beyond these [periods], for they continually circulate among you - some of you, among others. Thus does Allah make clear to you the verses; and Allah is Knowing and Wise.",
    "And when the children among you reach puberty, let them ask permission [at all times] as those before them have done. Thus does Allah make clear to you His verses; and Allah is Knowing and Wise.",
    "And women of post-menstrual age who have no desire for marriage - there is no blame upon them for putting aside their outer garments [but] not displaying adornment. But to modestly refrain [from that] is better for them. And Allah is Hearing and Knowing.",
    "There is not upon the blind [any] constraint nor upon the lame constraint nor upon the ill constraint nor upon yourselves when you eat from your [own] houses or the houses of your fathers or the houses of your mothers or the houses of your brothers or the houses of your sisters or the houses of your father's brothers or the houses of your father's sisters or the houses of your mother's brothers or the houses of your mother's sisters or [from houses] whose keys you possess or [from the house] of your friend. There is no blame upon you whether you eat together or separately. But when you enter houses, give greetings of peace upon each other - a greeting from Allah, blessed and good. Thus does Allah make clear to you the verses [of ordinance] that you may understand.",
    "The believers are only those who believe in Allah and His Messenger and, when they are [meeting] with him for a matter of common interest, do not depart until they have asked his permission. Indeed, those who ask your permission, [O Muhammad] - those are the ones who believe in Allah and His Messenger. So when they ask your permission for something of their affairs, then give permission to whom you will among them and ask forgiveness for them of Allah. Indeed, Allah is Forgiving and Merciful.",
    "Do not make [your] calling of the Messenger among yourselves as the call of one of you to another. Already Allah knows those of you who slip away, concealed by others. So let those beware who dissent from the Prophet's order, lest fitnah strike them or a painful punishment.",
    "Unquestionably, to Allah belongs whatever is in the heavens and earth. Already He knows that upon which you [stand] and [knows] the Day when they will be returned to Him and He will inform them of what they have done. And Allah is Knowing of all things."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an__nur);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_an_nur);
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
