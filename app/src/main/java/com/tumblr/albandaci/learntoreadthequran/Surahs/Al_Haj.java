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

public class Al_Haj extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"22:1", "22:2", "22:3", "22:4", "22:5", "22:6", "22:7", "22:8", "22:9", "22:10", "22:11", "22:12", "22:13", "22:14", "22:15", "22:16",
            "22:17", "22:18", "22:19", "22:20", "22:21", "22:22", "22:23", "22:24", "22:25", "22:26", "22:27", "22:28", "22:29", "22:30", "22:31", "22:32",
            "22:33", "22:34", "22:35", "22:36", "22:37", "22:38", "22:39", "22:40", "22:41", "22:42", "22:43", "22:44", "22:45", "22:46", "22:47", "22:48",
            "22:49", "22:50", "22:51", "22:52", "22:53", "22:54", "22:55", "22:56", "22:57", "22:58", "22:59", "22:60", "22:61", "22:62", "22:63", "22:64",
            "22:65", "22:66", "22:67", "22:68", "22:69", "22:70", "22:71", "22:72", "22:73", "22:74", "22:75", "22:76", "22:77", "22:78", ""};

    String [] arabic_verses = {"يَا أَيُّهَا النَّاسُ اتَّقُوا رَبَّكُمْ ۚ إِنَّ زَلْزَلَةَ السَّاعَةِ شَيْءٌ عَظِيمٌ",
    "يَوْمَ تَرَوْنَهَا تَذْهَلُ كُلُّ مُرْضِعَةٍ عَمَّا أَرْضَعَتْ وَتَضَعُ كُلُّ ذَاتِ حَمْلٍ حَمْلَهَا وَتَرَى النَّاسَ سُكَارَىٰ وَمَا هُم بِسُكَارَىٰ وَلَٰكِنَّ عَذَابَ اللَّهِ شَدِيدٌ",
    "وَمِنَ النَّاسِ مَن يُجَادِلُ فِي اللَّهِ بِغَيْرِ عِلْمٍ وَيَتَّبِعُ كُلَّ شَيْطَانٍ مَّرِيدٍ",
    "كُتِبَ عَلَيْهِ أَنَّهُ مَن تَوَلَّاهُ فَأَنَّهُ يُضِلُّهُ وَيَهْدِيهِ إِلَىٰ عَذَابِ السَّعِيرِ",
    "يَا أَيُّهَا النَّاسُ إِن كُنتُمْ فِي رَيْبٍ مِّنَ الْبَعْثِ فَإِنَّا خَلَقْنَاكُم مِّن تُرَابٍ ثُمَّ مِن نُّطْفَةٍ ثُمَّ مِنْ عَلَقَةٍ ثُمَّ مِن مُّضْغَةٍ مُّخَلَّقَةٍ وَغَيْرِ مُخَلَّقَةٍ لِّنُبَيِّنَ لَكُمْ ۚ وَنُقِرُّ فِي الْأَرْحَامِ مَا نَشَاءُ إِلَىٰ أَجَلٍ مُّسَمًّى ثُمَّ نُخْرِجُكُمْ طِفْلًا ثُمَّ لِتَبْلُغُوا أَشُدَّكُمْ ۖ وَمِنكُم مَّن يُتَوَفَّىٰ وَمِنكُم مَّن يُرَدُّ إِلَىٰ أَرْذَلِ الْعُمُرِ لِكَيْلَا يَعْلَمَ مِن بَعْدِ عِلْمٍ شَيْئًا ۚ وَتَرَى الْأَرْضَ هَامِدَةً فَإِذَا أَنزَلْنَا عَلَيْهَا الْمَاءَ اهْتَزَّتْ وَرَبَتْ وَأَنبَتَتْ مِن كُلِّ زَوْجٍ بَهِيجٍ",
    "ذَٰلِكَ بِأَنَّ اللَّهَ هُوَ الْحَقُّ وَأَنَّهُ يُحْيِي الْمَوْتَىٰ وَأَنَّهُ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "وَأَنَّ السَّاعَةَ آتِيَةٌ لَّا رَيْبَ فِيهَا وَأَنَّ اللَّهَ يَبْعَثُ مَن فِي الْقُبُورِ",
    "وَمِنَ النَّاسِ مَن يُجَادِلُ فِي اللَّهِ بِغَيْرِ عِلْمٍ وَلَا هُدًى وَلَا كِتَابٍ مُّنِيرٍ",
    "ثَانِيَ عِطْفِهِ لِيُضِلَّ عَن سَبِيلِ اللَّهِ ۖ لَهُ فِي الدُّنْيَا خِزْيٌ ۖ وَنُذِيقُهُ يَوْمَ الْقِيَامَةِ عَذَابَ الْحَرِيقِ",
    "ذَٰلِكَ بِمَا قَدَّمَتْ يَدَاكَ وَأَنَّ اللَّهَ لَيْسَ بِظَلَّامٍ لِّلْعَبِيدِ",
    "وَمِنَ النَّاسِ مَن يَعْبُدُ اللَّهَ عَلَىٰ حَرْفٍ ۖ فَإِنْ أَصَابَهُ خَيْرٌ اطْمَأَنَّ بِهِ ۖ وَإِنْ أَصَابَتْهُ فِتْنَةٌ انقَلَبَ عَلَىٰ وَجْهِهِ خَسِرَ الدُّنْيَا وَالْآخِرَةَ ۚ ذَٰلِكَ هُوَ الْخُسْرَانُ الْمُبِينُ",
    "يَدْعُو مِن دُونِ اللَّهِ مَا لَا يَضُرُّهُ وَمَا لَا يَنفَعُهُ ۚ ذَٰلِكَ هُوَ الضَّلَالُ الْبَعِيدُ",
    "يَدْعُو لَمَن ضَرُّهُ أَقْرَبُ مِن نَّفْعِهِ ۚ لَبِئْسَ الْمَوْلَىٰ وَلَبِئْسَ الْعَشِيرُ",
    "إِنَّ اللَّهَ يُدْخِلُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ ۚ إِنَّ اللَّهَ يَفْعَلُ مَا يُرِيدُ",
    "مَن كَانَ يَظُنُّ أَن لَّن يَنصُرَهُ اللَّهُ فِي الدُّنْيَا وَالْآخِرَةِ فَلْيَمْدُدْ بِسَبَبٍ إِلَى السَّمَاءِ ثُمَّ لْيَقْطَعْ فَلْيَنظُرْ هَلْ يُذْهِبَنَّ كَيْدُهُ مَا يَغِيظُ",
    "وَكَذَٰلِكَ أَنزَلْنَاهُ آيَاتٍ بَيِّنَاتٍ وَأَنَّ اللَّهَ يَهْدِي مَن يُرِيدُ",
    "إِنَّ الَّذِينَ آمَنُوا وَالَّذِينَ هَادُوا وَالصَّابِئِينَ وَالنَّصَارَىٰ وَالْمَجُوسَ وَالَّذِينَ أَشْرَكُوا إِنَّ اللَّهَ يَفْصِلُ بَيْنَهُمْ يَوْمَ الْقِيَامَةِ ۚ إِنَّ اللَّهَ عَلَىٰ كُلِّ شَيْءٍ شَهِيدٌ",
    "أَلَمْ تَرَ أَنَّ اللَّهَ يَسْجُدُ لَهُ مَن فِي السَّمَاوَاتِ وَمَن فِي الْأَرْضِ وَالشَّمْسُ وَالْقَمَرُ وَالنُّجُومُ وَالْجِبَالُ وَالشَّجَرُ وَالدَّوَابُّ وَكَثِيرٌ مِّنَ النَّاسِ ۖ وَكَثِيرٌ حَقَّ عَلَيْهِ الْعَذَابُ ۗ وَمَن يُهِنِ اللَّهُ فَمَا لَهُ مِن مُّكْرِمٍ ۚ إِنَّ اللَّهَ يَفْعَلُ مَا يَشَاءُ ۩",
    "هَٰذَانِ خَصْمَانِ اخْتَصَمُوا فِي رَبِّهِمْ ۖ فَالَّذِينَ كَفَرُوا قُطِّعَتْ لَهُمْ ثِيَابٌ مِّن نَّارٍ يُصَبُّ مِن فَوْقِ رُءُوسِهِمُ الْحَمِيمُ",
    "يُصْهَرُ بِهِ مَا فِي بُطُونِهِمْ وَالْجُلُودُ",
    "وَلَهُم مَّقَامِعُ مِنْ حَدِيدٍ",
    "كُلَّمَا أَرَادُوا أَن يَخْرُجُوا مِنْهَا مِنْ غَمٍّ أُعِيدُوا فِيهَا وَذُوقُوا عَذَابَ الْحَرِيقِ",
    "إِنَّ اللَّهَ يُدْخِلُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ يُحَلَّوْنَ فِيهَا مِنْ أَسَاوِرَ مِن ذَهَبٍ وَلُؤْلُؤًا ۖ وَلِبَاسُهُمْ فِيهَا حَرِيرٌ",
    "وَهُدُوا إِلَى الطَّيِّبِ مِنَ الْقَوْلِ وَهُدُوا إِلَىٰ صِرَاطِ الْحَمِيدِ",
    "إِنَّ الَّذِينَ كَفَرُوا وَيَصُدُّونَ عَن سَبِيلِ اللَّهِ وَالْمَسْجِدِ الْحَرَامِ الَّذِي جَعَلْنَاهُ لِلنَّاسِ سَوَاءً الْعَاكِفُ فِيهِ وَالْبَادِ ۚ وَمَن يُرِدْ فِيهِ بِإِلْحَادٍ بِظُلْمٍ نُّذِقْهُ مِنْ عَذَابٍ أَلِيمٍ",
    "وَإِذْ بَوَّأْنَا لِإِبْرَاهِيمَ مَكَانَ الْبَيْتِ أَن لَّا تُشْرِكْ بِي شَيْئًا وَطَهِّرْ بَيْتِيَ لِلطَّائِفِينَ وَالْقَائِمِينَ وَالرُّكَّعِ السُّجُودِ",
    "وَأَذِّن فِي النَّاسِ بِالْحَجِّ يَأْتُوكَ رِجَالًا وَعَلَىٰ كُلِّ ضَامِرٍ يَأْتِينَ مِن كُلِّ فَجٍّ عَمِيقٍ",
    "لِّيَشْهَدُوا مَنَافِعَ لَهُمْ وَيَذْكُرُوا اسْمَ اللَّهِ فِي أَيَّامٍ مَّعْلُومَاتٍ عَلَىٰ مَا رَزَقَهُم مِّن بَهِيمَةِ الْأَنْعَامِ ۖ فَكُلُوا مِنْهَا وَأَطْعِمُوا الْبَائِسَ الْفَقِيرَ",
    "ثُمَّ لْيَقْضُوا تَفَثَهُمْ وَلْيُوفُوا نُذُورَهُمْ وَلْيَطَّوَّفُوا بِالْبَيْتِ الْعَتِيقِ",
    "ذَٰلِكَ وَمَن يُعَظِّمْ حُرُمَاتِ اللَّهِ فَهُوَ خَيْرٌ لَّهُ عِندَ رَبِّهِ ۗ وَأُحِلَّتْ لَكُمُ الْأَنْعَامُ إِلَّا مَا يُتْلَىٰ عَلَيْكُمْ ۖ فَاجْتَنِبُوا الرِّجْسَ مِنَ الْأَوْثَانِ وَاجْتَنِبُوا قَوْلَ الزُّورِ",
    "حُنَفَاءَ لِلَّهِ غَيْرَ مُشْرِكِينَ بِهِ ۚ وَمَن يُشْرِكْ بِاللَّهِ فَكَأَنَّمَا خَرَّ مِنَ السَّمَاءِ فَتَخْطَفُهُ الطَّيْرُ أَوْ تَهْوِي بِهِ الرِّيحُ فِي مَكَانٍ سَحِيقٍ",
    "ذَٰلِكَ وَمَن يُعَظِّمْ شَعَائِرَ اللَّهِ فَإِنَّهَا مِن تَقْوَى الْقُلُوبِ",
    "لَكُمْ فِيهَا مَنَافِعُ إِلَىٰ أَجَلٍ مُّسَمًّى ثُمَّ مَحِلُّهَا إِلَى الْبَيْتِ الْعَتِيقِ",
    "وَلِكُلِّ أُمَّةٍ جَعَلْنَا مَنسَكًا لِّيَذْكُرُوا اسْمَ اللَّهِ عَلَىٰ مَا رَزَقَهُم مِّن بَهِيمَةِ الْأَنْعَامِ ۗ فَإِلَٰهُكُمْ إِلَٰهٌ وَاحِدٌ فَلَهُ أَسْلِمُوا ۗ وَبَشِّرِ الْمُخْبِتِينَ",
    "الَّذِينَ إِذَا ذُكِرَ اللَّهُ وَجِلَتْ قُلُوبُهُمْ وَالصَّابِرِينَ عَلَىٰ مَا أَصَابَهُمْ وَالْمُقِيمِي الصَّلَاةِ وَمِمَّا رَزَقْنَاهُمْ يُنفِقُونَ",
    "وَالْبُدْنَ جَعَلْنَاهَا لَكُم مِّن شَعَائِرِ اللَّهِ لَكُمْ فِيهَا خَيْرٌ ۖ فَاذْكُرُوا اسْمَ اللَّهِ عَلَيْهَا صَوَافَّ ۖ فَإِذَا وَجَبَتْ جُنُوبُهَا فَكُلُوا مِنْهَا وَأَطْعِمُوا الْقَانِعَ وَالْمُعْتَرَّ ۚ كَذَٰلِكَ سَخَّرْنَاهَا لَكُمْ لَعَلَّكُمْ تَشْكُرُونَ",
    "لَن يَنَالَ اللَّهَ لُحُومُهَا وَلَا دِمَاؤُهَا وَلَٰكِن يَنَالُهُ التَّقْوَىٰ مِنكُمْ ۚ كَذَٰلِكَ سَخَّرَهَا لَكُمْ لِتُكَبِّرُوا اللَّهَ عَلَىٰ مَا هَدَاكُمْ ۗ وَبَشِّرِ الْمُحْسِنِينَ",
    "إِنَّ اللَّهَ يُدَافِعُ عَنِ الَّذِينَ آمَنُوا ۗ إِنَّ اللَّهَ لَا يُحِبُّ كُلَّ خَوَّانٍ كَفُورٍ",
    "أُذِنَ لِلَّذِينَ يُقَاتَلُونَ بِأَنَّهُمْ ظُلِمُوا ۚ وَإِنَّ اللَّهَ عَلَىٰ نَصْرِهِمْ لَقَدِيرٌ",
    "الَّذِينَ أُخْرِجُوا مِن دِيَارِهِم بِغَيْرِ حَقٍّ إِلَّا أَن يَقُولُوا رَبُّنَا اللَّهُ ۗ وَلَوْلَا دَفْعُ اللَّهِ النَّاسَ بَعْضَهُم بِبَعْضٍ لَّهُدِّمَتْ صَوَامِعُ وَبِيَعٌ وَصَلَوَاتٌ وَمَسَاجِدُ يُذْكَرُ فِيهَا اسْمُ اللَّهِ كَثِيرًا ۗ وَلَيَنصُرَنَّ اللَّهُ مَن يَنصُرُهُ ۗ إِنَّ اللَّهَ لَقَوِيٌّ عَزِيزٌ",
    "الَّذِينَ إِن مَّكَّنَّاهُمْ فِي الْأَرْضِ أَقَامُوا الصَّلَاةَ وَآتَوُا الزَّكَاةَ وَأَمَرُوا بِالْمَعْرُوفِ وَنَهَوْا عَنِ الْمُنكَرِ ۗ وَلِلَّهِ عَاقِبَةُ الْأُمُورِ",
    "وَإِن يُكَذِّبُوكَ فَقَدْ كَذَّبَتْ قَبْلَهُمْ قَوْمُ نُوحٍ وَعَادٌ وَثَمُودُ",
    "وَقَوْمُ إِبْرَاهِيمَ وَقَوْمُ لُوطٍ",
    "وَأَصْحَابُ مَدْيَنَ ۖ وَكُذِّبَ مُوسَىٰ فَأَمْلَيْتُ لِلْكَافِرِينَ ثُمَّ أَخَذْتُهُمْ ۖ فَكَيْفَ كَانَ نَكِيرِ",
    "فَكَأَيِّن مِّن قَرْيَةٍ أَهْلَكْنَاهَا وَهِيَ ظَالِمَةٌ فَهِيَ خَاوِيَةٌ عَلَىٰ عُرُوشِهَا وَبِئْرٍ مُّعَطَّلَةٍ وَقَصْرٍ مَّشِيدٍ",
    "أَفَلَمْ يَسِيرُوا فِي الْأَرْضِ فَتَكُونَ لَهُمْ قُلُوبٌ يَعْقِلُونَ بِهَا أَوْ آذَانٌ يَسْمَعُونَ بِهَا ۖ فَإِنَّهَا لَا تَعْمَى الْأَبْصَارُ وَلَٰكِن تَعْمَى الْقُلُوبُ الَّتِي فِي الصُّدُورِ",
    "وَيَسْتَعْجِلُونَكَ بِالْعَذَابِ وَلَن يُخْلِفَ اللَّهُ وَعْدَهُ ۚ وَإِنَّ يَوْمًا عِندَ رَبِّكَ كَأَلْفِ سَنَةٍ مِّمَّا تَعُدُّونَ",
    "وَكَأَيِّن مِّن قَرْيَةٍ أَمْلَيْتُ لَهَا وَهِيَ ظَالِمَةٌ ثُمَّ أَخَذْتُهَا وَإِلَيَّ الْمَصِيرُ",
    "قُلْ يَا أَيُّهَا النَّاسُ إِنَّمَا أَنَا لَكُمْ نَذِيرٌ مُّبِينٌ",
    "فَالَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُم مَّغْفِرَةٌ وَرِزْقٌ كَرِيمٌ",
    "وَالَّذِينَ سَعَوْا فِي آيَاتِنَا مُعَاجِزِينَ أُولَٰئِكَ أَصْحَابُ الْجَحِيمِ",
    "وَمَا أَرْسَلْنَا مِن قَبْلِكَ مِن رَّسُولٍ وَلَا نَبِيٍّ إِلَّا إِذَا تَمَنَّىٰ أَلْقَى الشَّيْطَانُ فِي أُمْنِيَّتِهِ فَيَنسَخُ اللَّهُ مَا يُلْقِي الشَّيْطَانُ ثُمَّ يُحْكِمُ اللَّهُ آيَاتِهِ ۗ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "لِّيَجْعَلَ مَا يُلْقِي الشَّيْطَانُ فِتْنَةً لِّلَّذِينَ فِي قُلُوبِهِم مَّرَضٌ وَالْقَاسِيَةِ قُلُوبُهُمْ ۗ وَإِنَّ الظَّالِمِينَ لَفِي شِقَاقٍ بَعِيدٍ",
    "وَلِيَعْلَمَ الَّذِينَ أُوتُوا الْعِلْمَ أَنَّهُ الْحَقُّ مِن رَّبِّكَ فَيُؤْمِنُوا بِهِ فَتُخْبِتَ لَهُ قُلُوبُهُمْ ۗ وَإِنَّ اللَّهَ لَهَادِ الَّذِينَ آمَنُوا إِلَىٰ صِرَاطٍ مُّسْتَقِيمٍ",
    "وَلَا يَزَالُ الَّذِينَ كَفَرُوا فِي مِرْيَةٍ مِّنْهُ حَتَّىٰ تَأْتِيَهُمُ السَّاعَةُ بَغْتَةً أَوْ يَأْتِيَهُمْ عَذَابُ يَوْمٍ عَقِيمٍ",
    "الْمُلْكُ يَوْمَئِذٍ لِّلَّهِ يَحْكُمُ بَيْنَهُمْ ۚ فَالَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ فِي جَنَّاتِ النَّعِيمِ",
    "وَالَّذِينَ كَفَرُوا وَكَذَّبُوا بِآيَاتِنَا فَأُولَٰئِكَ لَهُمْ عَذَابٌ مُّهِينٌ",
    "وَالَّذِينَ هَاجَرُوا فِي سَبِيلِ اللَّهِ ثُمَّ قُتِلُوا أَوْ مَاتُوا لَيَرْزُقَنَّهُمُ اللَّهُ رِزْقًا حَسَنًا ۚ وَإِنَّ اللَّهَ لَهُوَ خَيْرُ الرَّازِقِينَ",
    "لَيُدْخِلَنَّهُم مُّدْخَلًا يَرْضَوْنَهُ ۗ وَإِنَّ اللَّهَ لَعَلِيمٌ حَلِيمٌ",
    "ذَٰلِكَ وَمَنْ عَاقَبَ بِمِثْلِ مَا عُوقِبَ بِهِ ثُمَّ بُغِيَ عَلَيْهِ لَيَنصُرَنَّهُ اللَّهُ ۗ إِنَّ اللَّهَ لَعَفُوٌّ غَفُورٌ",
    "ذَٰلِكَ بِأَنَّ اللَّهَ يُولِجُ اللَّيْلَ فِي النَّهَارِ وَيُولِجُ النَّهَارَ فِي اللَّيْلِ وَأَنَّ اللَّهَ سَمِيعٌ بَصِيرٌ",
    "ذَٰلِكَ بِأَنَّ اللَّهَ هُوَ الْحَقُّ وَأَنَّ مَا يَدْعُونَ مِن دُونِهِ هُوَ الْبَاطِلُ وَأَنَّ اللَّهَ هُوَ الْعَلِيُّ الْكَبِيرُ",
    "أَلَمْ تَرَ أَنَّ اللَّهَ أَنزَلَ مِنَ السَّمَاءِ مَاءً فَتُصْبِحُ الْأَرْضُ مُخْضَرَّةً ۗ إِنَّ اللَّهَ لَطِيفٌ خَبِيرٌ",
    "لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۗ وَإِنَّ اللَّهَ لَهُوَ الْغَنِيُّ الْحَمِيدُ",
    "أَلَمْ تَرَ أَنَّ اللَّهَ سَخَّرَ لَكُم مَّا فِي الْأَرْضِ وَالْفُلْكَ تَجْرِي فِي الْبَحْرِ بِأَمْرِهِ وَيُمْسِكُ السَّمَاءَ أَن تَقَعَ عَلَى الْأَرْضِ إِلَّا بِإِذْنِهِ ۗ إِنَّ اللَّهَ بِالنَّاسِ لَرَءُوفٌ رَّحِيمٌ",
    "وَهُوَ الَّذِي أَحْيَاكُمْ ثُمَّ يُمِيتُكُمْ ثُمَّ يُحْيِيكُمْ ۗ إِنَّ الْإِنسَانَ لَكَفُورٌ",
    "لِّكُلِّ أُمَّةٍ جَعَلْنَا مَنسَكًا هُمْ نَاسِكُوهُ ۖ فَلَا يُنَازِعُنَّكَ فِي الْأَمْرِ ۚ وَادْعُ إِلَىٰ رَبِّكَ ۖ إِنَّكَ لَعَلَىٰ هُدًى مُّسْتَقِيمٍ",
    "وَإِن جَادَلُوكَ فَقُلِ اللَّهُ أَعْلَمُ بِمَا تَعْمَلُونَ",
    "اللَّهُ يَحْكُمُ بَيْنَكُمْ يَوْمَ الْقِيَامَةِ فِيمَا كُنتُمْ فِيهِ تَخْتَلِفُونَ",
    "أَلَمْ تَعْلَمْ أَنَّ اللَّهَ يَعْلَمُ مَا فِي السَّمَاءِ وَالْأَرْضِ ۗ إِنَّ ذَٰلِكَ فِي كِتَابٍ ۚ إِنَّ ذَٰلِكَ عَلَى اللَّهِ يَسِيرٌ",
    "وَيَعْبُدُونَ مِن دُونِ اللَّهِ مَا لَمْ يُنَزِّلْ بِهِ سُلْطَانًا وَمَا لَيْسَ لَهُم بِهِ عِلْمٌ ۗ وَمَا لِلظَّالِمِينَ مِن نَّصِيرٍ",
    "وَإِذَا تُتْلَىٰ عَلَيْهِمْ آيَاتُنَا بَيِّنَاتٍ تَعْرِفُ فِي وُجُوهِ الَّذِينَ كَفَرُوا الْمُنكَرَ ۖ يَكَادُونَ يَسْطُونَ بِالَّذِينَ يَتْلُونَ عَلَيْهِمْ آيَاتِنَا ۗ قُلْ أَفَأُنَبِّئُكُم بِشَرٍّ مِّن ذَٰلِكُمُ ۗ النَّارُ وَعَدَهَا اللَّهُ الَّذِينَ كَفَرُوا ۖ وَبِئْسَ الْمَصِيرُ",
    "يَا أَيُّهَا النَّاسُ ضُرِبَ مَثَلٌ فَاسْتَمِعُوا لَهُ ۚ إِنَّ الَّذِينَ تَدْعُونَ مِن دُونِ اللَّهِ لَن يَخْلُقُوا ذُبَابًا وَلَوِ اجْتَمَعُوا لَهُ ۖ وَإِن يَسْلُبْهُمُ الذُّبَابُ شَيْئًا لَّا يَسْتَنقِذُوهُ مِنْهُ ۚ ضَعُفَ الطَّالِبُ وَالْمَطْلُوبُ",
    "مَا قَدَرُوا اللَّهَ حَقَّ قَدْرِهِ ۗ إِنَّ اللَّهَ لَقَوِيٌّ عَزِيزٌ",
    "اللَّهُ يَصْطَفِي مِنَ الْمَلَائِكَةِ رُسُلًا وَمِنَ النَّاسِ ۚ إِنَّ اللَّهَ سَمِيعٌ بَصِيرٌ",
    "يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ ۗ وَإِلَى اللَّهِ تُرْجَعُ الْأُمُورُ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا ارْكَعُوا وَاسْجُدُوا وَاعْبُدُوا رَبَّكُمْ وَافْعَلُوا الْخَيْرَ لَعَلَّكُمْ تُفْلِحُونَ ۩",
    "وَجَاهِدُوا فِي اللَّهِ حَقَّ جِهَادِهِ ۚ هُوَ اجْتَبَاكُمْ وَمَا جَعَلَ عَلَيْكُمْ فِي الدِّينِ مِنْ حَرَجٍ ۚ مِّلَّةَ أَبِيكُمْ إِبْرَاهِيمَ ۚ هُوَ سَمَّاكُمُ الْمُسْلِمِينَ مِن قَبْلُ وَفِي هَٰذَا لِيَكُونَ الرَّسُولُ شَهِيدًا عَلَيْكُمْ وَتَكُونُوا شُهَدَاءَ عَلَى النَّاسِ ۚ فَأَقِيمُوا الصَّلَاةَ وَآتُوا الزَّكَاةَ وَاعْتَصِمُوا بِاللَّهِ هُوَ مَوْلَاكُمْ ۖ فَنِعْمَ الْمَوْلَىٰ وَنِعْمَ النَّصِيرُ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"O mankind, fear your Lord. Indeed, the convulsion of the [final] Hour is a terrible thing.",
    "On the Day you see it every nursing mother will be distracted from that [child] she was nursing, and every pregnant woman will abort her pregnancy, and you will see the people [appearing] intoxicated while they are not intoxicated; but the punishment of Allah is severe.",
    "And of the people is he who disputes about Allah without knowledge and follows every rebellious devil.",
    "It has been decreed for every devil that whoever turns to him - he will misguide him and will lead him to the punishment of the Blaze.",
    "O People, if you should be in doubt about the Resurrection, then [consider that] indeed, We created you from dust, then from a sperm-drop, then from a clinging clot, and then from a lump of flesh, formed and unformed - that We may show you. And We settle in the wombs whom We will for a specified term, then We bring you out as a child, and then [We develop you] that you may reach your [time of] maturity. And among you is he who is taken in [early] death, and among you is he who is returned to the most decrepit [old] age so that he knows, after [once having] knowledge, nothing. And you see the earth barren, but when We send down upon it rain, it quivers and swells and grows [something] of every beautiful kind.",
    "That is because Allah is the Truth and because He gives life to the dead and because He is over all things competent",
    "And [that they may know] that the Hour is coming - no doubt about it - and that Allah will resurrect those in the graves.",
    "And of the people is he who disputes about Allah without knowledge or guidance or an enlightening book [from Him],",
    "Twisting his neck [in arrogance] to mislead [people] from the way of Allah. For him in the world is disgrace, and We will make him taste on the Day of Resurrection the punishment of the Burning Fire [while it is said],",
    "\"That is for what your hands have put forth and because Allah is not ever unjust to [His] servants.\"",
    "And of the people is he who worships Allah on an edge. If he is touched by good, he is reassured by it; but if he is struck by trial, he turns on his face [to the other direction]. He has lost [this] world and the Hereafter. That is what is the manifest loss.",
    "He invokes instead of Allah that which neither harms him nor benefits him. That is what is the extreme error.",
    "He invokes one whose harm is closer than his benefit - how wretched the protector and how wretched the associate.",
    "Indeed, Allah will admit those who believe and do righteous deeds to gardens beneath which rivers flow. Indeed, Allah does what He intends.",
    "Whoever should think that Allah will not support [Prophet Muhammad] in this world and the Hereafter - let him extend a rope to the ceiling, then cut off [his breath], and let him see: will his effort remove that which enrages [him]?",
    "And thus have We sent the Qur'an down as verses of clear evidence and because Allah guides whom He intends.",
    "Indeed, those who have believed and those who were Jews and the Sabeans and the Christians and the Magians and those who associated with Allah - Allah will judge between them on the Day of Resurrection. Indeed Allah is, over all things, Witness.",
    "Do you not see that to Allah prostrates whoever is in the heavens and whoever is on the earth and the sun, the moon, the stars, the mountains, the trees, the moving creatures and many of the people? But upon many the punishment has been justified. And he whom Allah humiliates - for him there is no bestower of honor. Indeed, Allah does what He wills.",
    "These are two adversaries who have disputed over their Lord. But those who disbelieved will have cut out for them garments of fire. Poured upon their heads will be scalding water",
    "By which is melted that within their bellies and [their] skins.",
    "And for [striking] them are maces of iron.",
    "Every time they want to get out of Hellfire from anguish, they will be returned to it, and [it will be said], \"Taste the punishment of the Burning Fire!\"",
    "Indeed, Allah will admit those who believe and do righteous deeds to gardens beneath which rivers flow. They will be adorned therein with bracelets of gold and pearl, and their garments therein will be silk.",
    "And they had been guided [in worldly life] to good speech, and they were guided to the path of the Praiseworthy.",
    "Indeed, those who have disbelieved and avert [people] from the way of Allah and [from] al-Masjid al-Haram, which We made for the people - equal are the resident therein and one from outside; and [also] whoever intends [a deed] therein of deviation [in religion] or wrongdoing - We will make him taste of a painful punishment.",
    "And [mention, O Muhammad], when We designated for Abraham the site of the House, [saying], \"Do not associate anything with Me and purify My House for those who perform Tawaf and those who stand [in prayer] and those who bow and prostrate.",
    "And proclaim to the people the Hajj [pilgrimage]; they will come to you on foot and on every lean camel; they will come from every distant pass -",
    "That they may witness benefits for themselves and mention the name of Allah on known days over what He has provided for them of [sacrificial] animals. So eat of them and feed the miserable and poor.",
    "Then let them end their untidiness and fulfill their vows and perform Tawaf around the ancient House.\"",
    "That [has been commanded], and whoever honors the sacred ordinances of Allah - it is best for him in the sight of his Lord. And permitted to you are the grazing livestock, except what is recited to you. So avoid the uncleanliness of idols and avoid false statement,",
    "Inclining [only] to Allah, not associating [anything] with Him. And he who associates with Allah - it is as though he had fallen from the sky and was snatched by the birds or the wind carried him down into a remote place.",
    "That [is so]. And whoever honors the symbols of Allah - indeed, it is from the piety of hearts.",
    "For you the animals marked for sacrifice are benefits for a specified term; then their place of sacrifice is at the ancient House.",
    "And for all religion We have appointed a rite [of sacrifice] that they may mention the name of Allah over what He has provided for them of [sacrificial] animals. For your god is one God, so to Him submit. And, [O Muhammad], give good tidings to the humble [before their Lord]",
    "Who, when Allah is mentioned, their hearts are fearful, and [to] the patient over what has afflicted them, and the establishers of prayer and those who spend from what We have provided them.",
    "And the camels and cattle We have appointed for you as among the symbols of Allah; for you therein is good. So mention the name of Allah upon them when lined up [for sacrifice]; and when they are [lifeless] on their sides, then eat from them and feed the needy and the beggar. Thus have We subjected them to you that you may be grateful.",
    "Their meat will not reach Allah, nor will their blood, but what reaches Him is piety from you. Thus have We subjected them to you that you may glorify Allah for that [to] which He has guided you; and give good tidings to the doers of good.",
    "Indeed, Allah defends those who have believed. Indeed, Allah does not like everyone treacherous and ungrateful.",
    "Permission [to fight] has been given to those who are being fought, because they were wronged. And indeed, Allah is competent to give them victory.",
    "[They are] those who have been evicted from their homes without right - only because they say, \"Our Lord is Allah.\" And were it not that Allah checks the people, some by means of others, there would have been demolished monasteries, churches, synagogues, and mosques in which the name of Allah is much mentioned. And Allah will surely support those who support Him. Indeed, Allah is Powerful and Exalted in Might.",
    "[And they are] those who, if We give them authority in the land, establish prayer and give zakah and enjoin what is right and forbid what is wrong. And to Allah belongs the outcome of [all] matters.",
    "And if they deny you, [O Muhammad] - so, before them, did the people of Noah and 'Aad and Thamud deny [their prophets],",
    "And the people of Abraham and the people of Lot",
    "And the inhabitants of Madyan. And Moses was denied, so I prolonged enjoyment for the disbelievers; then I seized them, and how [terrible] was My reproach.",
    "And how many a city did We destroy while it was committing wrong - so it is [now] fallen into ruin - and [how many] an abandoned well and [how many] a lofty palace.",
    "So have they not traveled through the earth and have hearts by which to reason and ears by which to hear? For indeed, it is not eyes that are blinded, but blinded are the hearts which are within the breasts.",
    "And they urge you to hasten the punishment. But Allah will never fail in His promise. And indeed, a day with your Lord is like a thousand years of those which you count.",
    "And for how many a city did I prolong enjoyment while it was committing wrong. Then I seized it, and to Me is the [final] destination.",
    "Say, \"O people, I am only to you a clear warner.\"",
    "And those who have believed and done righteous deeds - for them is forgiveness and noble provision.",
    "But the ones who strove against Our verses, [seeking] to cause failure - those are the companions of Hellfire.",
    "And We did not send before you any messenger or prophet except that when he spoke [or recited], Satan threw into it [some misunderstanding]. But Allah abolishes that which Satan throws in; then Allah makes precise His verses. And Allah is Knowing and Wise.",
    "[That is] so He may make what Satan throws in a trial for those within whose hearts is disease and those hard of heart. And indeed, the wrongdoers are in extreme dissension.",
    "And so those who were given knowledge may know that it is the truth from your Lord and [therefore] believe in it, and their hearts humbly submit to it. And indeed is Allah the Guide of those who have believed to a straight path.",
    "But those who disbelieve will not cease to be in doubt of it until the Hour comes upon them unexpectedly or there comes to them the punishment of a barren Day.",
    "[All] sovereignty that Day is for Allah; He will judge between them. So they who believed and did righteous deeds will be in the Gardens of Pleasure.",
    "And they who disbelieved and denied Our signs - for those there will be a humiliating punishment.",
    "And those who emigrated for the cause of Allah and then were killed or died - Allah will surely provide for them a good provision. And indeed, it is Allah who is the best of providers.",
    "He will surely cause them to enter an entrance with which they will be pleased, and indeed, Allah is Knowing and Forbearing.",
    "That [is so]. And whoever responds [to injustice] with the equivalent of that with which he was harmed and then is tyrannized - Allah will surely aid him. Indeed, Allah is Pardoning and Forgiving.",
    "That is because Allah causes the night to enter the day and causes the day to enter the night and because Allah is Hearing and Seeing.",
    "That is because Allah is the Truth, and that which they call upon other than Him is falsehood, and because Allah is the Most High, the Grand.",
    "Do you not see that Allah has sent down rain from the sky and the earth becomes green? Indeed, Allah is Subtle and Acquainted.",
    "To Him belongs what is in the heavens and what is on the earth. And indeed, Allah is the Free of need, the Praiseworthy.",
    "Do you not see that Allah has subjected to you whatever is on the earth and the ships which run through the sea by His command? And He restrains the sky from falling upon the earth, unless by His permission. Indeed Allah, to the people, is Kind and Merciful.",
    "And He is the one who gave you life; then He causes you to die and then will [again] give you life. Indeed, mankind is ungrateful.",
    "For every religion We have appointed rites which they perform. So, [O Muhammad], let the disbelievers not contend with you over the matter but invite them to your Lord. Indeed, you are upon straight guidance.",
    "And if they dispute with you, then say, \"Allah is most knowing of what you do.",
    "Allah will judge between you on the Day of Resurrection concerning that over which you used to differ.\"",
    "Do you not know that Allah knows what is in the heaven and earth? Indeed, that is in a Record. Indeed that, for Allah, is easy.",
    "And they worship besides Allah that for which He has not sent down authority and that of which they have no knowledge. And there will not be for the wrongdoers any helper.",
    "And when Our verses are recited to them as clear evidences, you recognize in the faces of those who disbelieve disapproval. They are almost on the verge of assaulting those who recite to them Our verses. Say, \"Then shall I inform you of [what is] worse than that? [It is] the Fire which Allah has promised those who disbelieve, and wretched is the destination.\"",
    "O people, an example is presented, so listen to it. Indeed, those you invoke besides Allah will never create [as much as] a fly, even if they gathered together for that purpose. And if the fly should steal away from them a [tiny] thing, they could not recover it from him. Weak are the pursuer and pursued.",
    "They have not appraised Allah with true appraisal. Indeed, Allah is Powerful and Exalted in Might.",
    "Allah chooses from the angels messengers and from the people. Indeed, Allah is Hearing and Seeing.",
    "He knows what is [presently] before them and what will be after them. And to Allah will be returned [all] matters.",
    "O you who have believed, bow and prostrate and worship your Lord and do good - that you may succeed.",
    "And strive for Allah with the striving due to Him. He has chosen you and has not placed upon you in the religion any difficulty. [It is] the religion of your father, Abraham. Allah named you \"Muslims\" before [in former scriptures] and in this [revelation] that the Messenger may be a witness over you and you may be witnesses over the people. So establish prayer and give zakah and hold fast to Allah. He is your protector; and excellent is the protector, and excellent is the helper.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__haj);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_haj);
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
