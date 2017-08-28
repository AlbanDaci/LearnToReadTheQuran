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

public class Ibrahim extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"14:1", "14:2", "14:3", "14:4", "14:5", "14:6", "14:7", "14:8", "14:9", "14:10", "14:11", "14:12", "14:13", "14:14", "14:15", "14:16",
            "14:17", "14:18", "14:19", "14:20", "14:21", "14:22", "14:23", "14:24", "14:25", "14:26", "14:27", "14:28", "14:29", "14:30", "14:31", "14:32",
            "14:33", "14:34", "14:35", "14:36", "14:37", "14:38", "14:39", "14:40", "14:41", "14:42", "14:43", "14:44", "14:45", "14:46", "14:47", "14:48",
            "14:49", "14:50", "14:51", "14:52", ""};

    String [] arabic_verses = {"الر ۚ كِتَابٌ أَنزَلْنَاهُ إِلَيْكَ لِتُخْرِجَ النَّاسَ مِنَ الظُّلُمَاتِ إِلَى النُّورِ بِإِذْنِ رَبِّهِمْ إِلَىٰ صِرَاطِ الْعَزِيزِ الْحَمِيدِ",
    "اللَّهِ الَّذِي لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۗ وَوَيْلٌ لِّلْكَافِرِينَ مِنْ عَذَابٍ شَدِيدٍ",
    "الَّذِينَ يَسْتَحِبُّونَ الْحَيَاةَ الدُّنْيَا عَلَى الْآخِرَةِ وَيَصُدُّونَ عَن سَبِيلِ اللَّهِ وَيَبْغُونَهَا عِوَجًا ۚ أُولَٰئِكَ فِي ضَلَالٍ بَعِيدٍ",
    "وَمَا أَرْسَلْنَا مِن رَّسُولٍ إِلَّا بِلِسَانِ قَوْمِهِ لِيُبَيِّنَ لَهُمْ ۖ فَيُضِلُّ اللَّهُ مَن يَشَاءُ وَيَهْدِي مَن يَشَاءُ ۚ وَهُوَ الْعَزِيزُ الْحَكِيمُ",
    "وَلَقَدْ أَرْسَلْنَا مُوسَىٰ بِآيَاتِنَا أَنْ أَخْرِجْ قَوْمَكَ مِنَ الظُّلُمَاتِ إِلَى النُّورِ وَذَكِّرْهُم بِأَيَّامِ اللَّهِ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّكُلِّ صَبَّارٍ شَكُورٍ",
    "وَإِذْ قَالَ مُوسَىٰ لِقَوْمِهِ اذْكُرُوا نِعْمَةَ اللَّهِ عَلَيْكُمْ إِذْ أَنجَاكُم مِّنْ آلِ فِرْعَوْنَ يَسُومُونَكُمْ سُوءَ الْعَذَابِ وَيُذَبِّحُونَ أَبْنَاءَكُمْ وَيَسْتَحْيُونَ نِسَاءَكُمْ ۚ وَفِي ذَٰلِكُم بَلَاءٌ مِّن رَّبِّكُمْ عَظِيمٌ",
    "وَإِذْ تَأَذَّنَ رَبُّكُمْ لَئِن شَكَرْتُمْ لَأَزِيدَنَّكُمْ ۖ وَلَئِن كَفَرْتُمْ إِنَّ عَذَابِي لَشَدِيدٌ",
    "وَقَالَ مُوسَىٰ إِن تَكْفُرُوا أَنتُمْ وَمَن فِي الْأَرْضِ جَمِيعًا فَإِنَّ اللَّهَ لَغَنِيٌّ حَمِيدٌ",
    "أَلَمْ يَأْتِكُمْ نَبَأُ الَّذِينَ مِن قَبْلِكُمْ قَوْمِ نُوحٍ وَعَادٍ وَثَمُودَ ۛ وَالَّذِينَ مِن بَعْدِهِمْ ۛ لَا يَعْلَمُهُمْ إِلَّا اللَّهُ ۚ جَاءَتْهُمْ رُسُلُهُم بِالْبَيِّنَاتِ فَرَدُّوا أَيْدِيَهُمْ فِي أَفْوَاهِهِمْ وَقَالُوا إِنَّا كَفَرْنَا بِمَا أُرْسِلْتُم بِهِ وَإِنَّا لَفِي شَكٍّ مِّمَّا تَدْعُونَنَا إِلَيْهِ مُرِيبٍ",
    "قَالَتْ رُسُلُهُمْ أَفِي اللَّهِ شَكٌّ فَاطِرِ السَّمَاوَاتِ وَالْأَرْضِ ۖ يَدْعُوكُمْ لِيَغْفِرَ لَكُم مِّن ذُنُوبِكُمْ وَيُؤَخِّرَكُمْ إِلَىٰ أَجَلٍ مُّسَمًّى ۚ قَالُوا إِنْ أَنتُمْ إِلَّا بَشَرٌ مِّثْلُنَا تُرِيدُونَ أَن تَصُدُّونَا عَمَّا كَانَ يَعْبُدُ آبَاؤُنَا فَأْتُونَا بِسُلْطَانٍ مُّبِينٍ",
    "قَالَتْ لَهُمْ رُسُلُهُمْ إِن نَّحْنُ إِلَّا بَشَرٌ مِّثْلُكُمْ وَلَٰكِنَّ اللَّهَ يَمُنُّ عَلَىٰ مَن يَشَاءُ مِنْ عِبَادِهِ ۖ وَمَا كَانَ لَنَا أَن نَّأْتِيَكُم بِسُلْطَانٍ إِلَّا بِإِذْنِ اللَّهِ ۚ وَعَلَى اللَّهِ فَلْيَتَوَكَّلِ الْمُؤْمِنُونَ",
    "وَمَا لَنَا أَلَّا نَتَوَكَّلَ عَلَى اللَّهِ وَقَدْ هَدَانَا سُبُلَنَا ۚ وَلَنَصْبِرَنَّ عَلَىٰ مَا آذَيْتُمُونَا ۚ وَعَلَى اللَّهِ فَلْيَتَوَكَّلِ الْمُتَوَكِّلُونَ",
    "وَقَالَ الَّذِينَ كَفَرُوا لِرُسُلِهِمْ لَنُخْرِجَنَّكُم مِّنْ أَرْضِنَا أَوْ لَتَعُودُنَّ فِي مِلَّتِنَا ۖ فَأَوْحَىٰ إِلَيْهِمْ رَبُّهُمْ لَنُهْلِكَنَّ الظَّالِمِينَ",
    "وَلَنُسْكِنَنَّكُمُ الْأَرْضَ مِن بَعْدِهِمْ ۚ ذَٰلِكَ لِمَنْ خَافَ مَقَامِي وَخَافَ وَعِيدِ",
    "وَاسْتَفْتَحُوا وَخَابَ كُلُّ جَبَّارٍ عَنِيدٍ",
    "مِّن وَرَائِهِ جَهَنَّمُ وَيُسْقَىٰ مِن مَّاءٍ صَدِيدٍ",
    "يَتَجَرَّعُهُ وَلَا يَكَادُ يُسِيغُهُ وَيَأْتِيهِ الْمَوْتُ مِن كُلِّ مَكَانٍ وَمَا هُوَ بِمَيِّتٍ ۖ وَمِن وَرَائِهِ عَذَابٌ غَلِيظٌ",
    "مَّثَلُ الَّذِينَ كَفَرُوا بِرَبِّهِمْ ۖ أَعْمَالُهُمْ كَرَمَادٍ اشْتَدَّتْ بِهِ الرِّيحُ فِي يَوْمٍ عَاصِفٍ ۖ لَّا يَقْدِرُونَ مِمَّا كَسَبُوا عَلَىٰ شَيْءٍ ۚ ذَٰلِكَ هُوَ الضَّلَالُ الْبَعِيدُ",
    "أَلَمْ تَرَ أَنَّ اللَّهَ خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ بِالْحَقِّ ۚ إِن يَشَأْ يُذْهِبْكُمْ وَيَأْتِ بِخَلْقٍ جَدِيدٍ",
    "وَمَا ذَٰلِكَ عَلَى اللَّهِ بِعَزِيزٍ",
    "وَبَرَزُوا لِلَّهِ جَمِيعًا فَقَالَ الضُّعَفَاءُ لِلَّذِينَ اسْتَكْبَرُوا إِنَّا كُنَّا لَكُمْ تَبَعًا فَهَلْ أَنتُم مُّغْنُونَ عَنَّا مِنْ عَذَابِ اللَّهِ مِن شَيْءٍ ۚ قَالُوا لَوْ هَدَانَا اللَّهُ لَهَدَيْنَاكُمْ ۖ سَوَاءٌ عَلَيْنَا أَجَزِعْنَا أَمْ صَبَرْنَا مَا لَنَا مِن مَّحِيصٍ",
    "وَقَالَ الشَّيْطَانُ لَمَّا قُضِيَ الْأَمْرُ إِنَّ اللَّهَ وَعَدَكُمْ وَعْدَ الْحَقِّ وَوَعَدتُّكُمْ فَأَخْلَفْتُكُمْ ۖ وَمَا كَانَ لِيَ عَلَيْكُم مِّن سُلْطَانٍ إِلَّا أَن دَعَوْتُكُمْ فَاسْتَجَبْتُمْ لِي ۖ فَلَا تَلُومُونِي وَلُومُوا أَنفُسَكُم ۖ مَّا أَنَا بِمُصْرِخِكُمْ وَمَا أَنتُم بِمُصْرِخِيَّ ۖ إِنِّي كَفَرْتُ بِمَا أَشْرَكْتُمُونِ مِن قَبْلُ ۗ إِنَّ الظَّالِمِينَ لَهُمْ عَذَابٌ أَلِيمٌ",
    "وَأُدْخِلَ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا بِإِذْنِ رَبِّهِمْ ۖ تَحِيَّتُهُمْ فِيهَا سَلَامٌ",
    "أَلَمْ تَرَ كَيْفَ ضَرَبَ اللَّهُ مَثَلًا كَلِمَةً طَيِّبَةً كَشَجَرَةٍ طَيِّبَةٍ أَصْلُهَا ثَابِتٌ وَفَرْعُهَا فِي السَّمَاءِ",
    "تُؤْتِي أُكُلَهَا كُلَّ حِينٍ بِإِذْنِ رَبِّهَا ۗ وَيَضْرِبُ اللَّهُ الْأَمْثَالَ لِلنَّاسِ لَعَلَّهُمْ يَتَذَكَّرُونَ",
    "وَمَثَلُ كَلِمَةٍ خَبِيثَةٍ كَشَجَرَةٍ خَبِيثَةٍ اجْتُثَّتْ مِن فَوْقِ الْأَرْضِ مَا لَهَا مِن قَرَارٍ",
    "يُثَبِّتُ اللَّهُ الَّذِينَ آمَنُوا بِالْقَوْلِ الثَّابِتِ فِي الْحَيَاةِ الدُّنْيَا وَفِي الْآخِرَةِ ۖ وَيُضِلُّ اللَّهُ الظَّالِمِينَ ۚ وَيَفْعَلُ اللَّهُ مَا يَشَاءُ",
    "أَلَمْ تَرَ إِلَى الَّذِينَ بَدَّلُوا نِعْمَتَ اللَّهِ كُفْرًا وَأَحَلُّوا قَوْمَهُمْ دَارَ الْبَوَارِ",
    "جَهَنَّمَ يَصْلَوْنَهَا ۖ وَبِئْسَ الْقَرَارُ",
    "وَجَعَلُوا لِلَّهِ أَندَادًا لِّيُضِلُّوا عَن سَبِيلِهِ ۗ قُلْ تَمَتَّعُوا فَإِنَّ مَصِيرَكُمْ إِلَى النَّارِ",
    "قُل لِّعِبَادِيَ الَّذِينَ آمَنُوا يُقِيمُوا الصَّلَاةَ وَيُنفِقُوا مِمَّا رَزَقْنَاهُمْ سِرًّا وَعَلَانِيَةً مِّن قَبْلِ أَن يَأْتِيَ يَوْمٌ لَّا بَيْعٌ فِيهِ وَلَا خِلَالٌ",
    "اللَّهُ الَّذِي خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ وَأَنزَلَ مِنَ السَّمَاءِ مَاءً فَأَخْرَجَ بِهِ مِنَ الثَّمَرَاتِ رِزْقًا لَّكُمْ ۖ وَسَخَّرَ لَكُمُ الْفُلْكَ لِتَجْرِيَ فِي الْبَحْرِ بِأَمْرِهِ ۖ وَسَخَّرَ لَكُمُ الْأَنْهَارَ",
    "وَسَخَّرَ لَكُمُ الشَّمْسَ وَالْقَمَرَ دَائِبَيْنِ ۖ وَسَخَّرَ لَكُمُ اللَّيْلَ وَالنَّهَارَ",
    "وَآتَاكُم مِّن كُلِّ مَا سَأَلْتُمُوهُ ۚ وَإِن تَعُدُّوا نِعْمَتَ اللَّهِ لَا تُحْصُوهَا ۗ إِنَّ الْإِنسَانَ لَظَلُومٌ كَفَّارٌ",
    "وَإِذْ قَالَ إِبْرَاهِيمُ رَبِّ اجْعَلْ هَٰذَا الْبَلَدَ آمِنًا وَاجْنُبْنِي وَبَنِيَّ أَن نَّعْبُدَ الْأَصْنَامَ",
    "رَبِّ إِنَّهُنَّ أَضْلَلْنَ كَثِيرًا مِّنَ النَّاسِ ۖ فَمَن تَبِعَنِي فَإِنَّهُ مِنِّي ۖ وَمَنْ عَصَانِي فَإِنَّكَ غَفُورٌ رَّحِيمٌ",
    "رَّبَّنَا إِنِّي أَسْكَنتُ مِن ذُرِّيَّتِي بِوَادٍ غَيْرِ ذِي زَرْعٍ عِندَ بَيْتِكَ الْمُحَرَّمِ رَبَّنَا لِيُقِيمُوا الصَّلَاةَ فَاجْعَلْ أَفْئِدَةً مِّنَ النَّاسِ تَهْوِي إِلَيْهِمْ وَارْزُقْهُم مِّنَ الثَّمَرَاتِ لَعَلَّهُمْ يَشْكُرُونَ",
    "رَبَّنَا إِنَّكَ تَعْلَمُ مَا نُخْفِي وَمَا نُعْلِنُ ۗ وَمَا يَخْفَىٰ عَلَى اللَّهِ مِن شَيْءٍ فِي الْأَرْضِ وَلَا فِي السَّمَاءِ",
    "الْحَمْدُ لِلَّهِ الَّذِي وَهَبَ لِي عَلَى الْكِبَرِ إِسْمَاعِيلَ وَإِسْحَاقَ ۚ إِنَّ رَبِّي لَسَمِيعُ الدُّعَاءِ",
    "رَبِّ اجْعَلْنِي مُقِيمَ الصَّلَاةِ وَمِن ذُرِّيَّتِي ۚ رَبَّنَا وَتَقَبَّلْ دُعَاءِ",
    "رَبَّنَا اغْفِرْ لِي وَلِوَالِدَيَّ وَلِلْمُؤْمِنِينَ يَوْمَ يَقُومُ الْحِسَابُ",
    "وَلَا تَحْسَبَنَّ اللَّهَ غَافِلًا عَمَّا يَعْمَلُ الظَّالِمُونَ ۚ إِنَّمَا يُؤَخِّرُهُمْ لِيَوْمٍ تَشْخَصُ فِيهِ الْأَبْصَارُ",
    "مُهْطِعِينَ مُقْنِعِي رُءُوسِهِمْ لَا يَرْتَدُّ إِلَيْهِمْ طَرْفُهُمْ ۖ وَأَفْئِدَتُهُمْ هَوَاءٌ",
    "وَأَنذِرِ النَّاسَ يَوْمَ يَأْتِيهِمُ الْعَذَابُ فَيَقُولُ الَّذِينَ ظَلَمُوا رَبَّنَا أَخِّرْنَا إِلَىٰ أَجَلٍ قَرِيبٍ نُّجِبْ دَعْوَتَكَ وَنَتَّبِعِ الرُّسُلَ ۗ أَوَلَمْ تَكُونُوا أَقْسَمْتُم مِّن قَبْلُ مَا لَكُم مِّن زَوَالٍ",
    "وَسَكَنتُمْ فِي مَسَاكِنِ الَّذِينَ ظَلَمُوا أَنفُسَهُمْ وَتَبَيَّنَ لَكُمْ كَيْفَ فَعَلْنَا بِهِمْ وَضَرَبْنَا لَكُمُ الْأَمْثَالَ",
    "وَقَدْ مَكَرُوا مَكْرَهُمْ وَعِندَ اللَّهِ مَكْرُهُمْ وَإِن كَانَ مَكْرُهُمْ لِتَزُولَ مِنْهُ الْجِبَالُ",
    "فَلَا تَحْسَبَنَّ اللَّهَ مُخْلِفَ وَعْدِهِ رُسُلَهُ ۗ إِنَّ اللَّهَ عَزِيزٌ ذُو انتِقَامٍ",
    "يَوْمَ تُبَدَّلُ الْأَرْضُ غَيْرَ الْأَرْضِ وَالسَّمَاوَاتُ ۖ وَبَرَزُوا لِلَّهِ الْوَاحِدِ الْقَهَّارِ",
    "وَتَرَى الْمُجْرِمِينَ يَوْمَئِذٍ مُّقَرَّنِينَ فِي الْأَصْفَادِ",
    "سَرَابِيلُهُم مِّن قَطِرَانٍ وَتَغْشَىٰ وُجُوهَهُمُ النَّارُ",
    "لِيَجْزِيَ اللَّهُ كُلَّ نَفْسٍ مَّا كَسَبَتْ ۚ إِنَّ اللَّهَ سَرِيعُ الْحِسَابِ",
    "هَٰذَا بَلَاغٌ لِّلنَّاسِ وَلِيُنذَرُوا بِهِ وَلِيَعْلَمُوا أَنَّمَا هُوَ إِلَٰهٌ وَاحِدٌ وَلِيَذَّكَّرَ أُولُو الْأَلْبَابِ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Alif, Lam, Ra. [This is] a Book which We have revealed to you, [O Muhammad], that you might bring mankind out of darknesses into the light by permission of their Lord - to the path of the Exalted in Might, the Praiseworthy -",
    "Allah, to whom belongs whatever is in the heavens and whatever is on the earth. And woe to the disbelievers from a severe punishment",
    "The ones who prefer the worldly life over the Hereafter and avert [people] from the way of Allah, seeking to make it (seem) deviant. Those are in extreme error.",
    "And We did not send any messenger except [speaking] in the language of his people to state clearly for them, and Allah sends astray [thereby] whom He wills and guides whom He wills. And He is the Exalted in Might, the Wise.",
    "And We certainly sent Moses with Our signs, [saying], \"Bring out your people from darknesses into the light and remind them of the days of Allah.\" Indeed in that are signs for everyone patient and grateful.",
    "And [recall, O Children of Israel], when Moses said to His people, \"Remember the favor of Allah upon you when He saved you from the people of Pharaoh, who were afflicting you with the worst torment and were slaughtering your [newborn] sons and keeping your females alive. And in that was a great trial from your Lord.",
    "And [remember] when your Lord proclaimed, 'If you are grateful, I will surely increase you [in favor]; but if you deny, indeed, My punishment is severe.' \"",
    "And Moses said, \"If you should disbelieve, you and whoever is on the earth entirely - indeed, Allah is Free of need and Praiseworthy.\"",
    "Has there not reached you the news of those before you - the people of Noah and 'Aad and Thamud and those after them? No one knows them but Allah. Their messengers brought them clear proofs, but they returned their hands to their mouths and said, \"Indeed, we disbelieve in that with which you have been sent, and indeed we are, about that to which you invite us, in disquieting doubt.\"",
    "Their messengers said, \"Can there be doubt about Allah, Creator of the heavens and earth? He invites you that He may forgive you of your sins, and He delays your death for a specified term.\" They said, \"You are not but men like us who wish to avert us from what our fathers were worshipping. So bring us a clear authority.\"",
    "Their messengers said to them, \"We are only men like you, but Allah confers favor upon whom He wills of His servants. It has never been for us to bring you evidence except by permission of Allah. And upon Allah let the believers rely.",
    "And why should we not rely upon Allah while He has guided us to our [good] ways. And we will surely be patient against whatever harm you should cause us. And upon Allah let those who would rely [indeed] rely.\"",
    "And those who disbelieved said to their messengers, \"We will surely drive you out of our land, or you must return to our religion.\" So their Lord inspired to them, \"We will surely destroy the wrongdoers.",
    "And We will surely cause you to dwell in the land after them. That is for he who fears My position and fears My threat.\"",
    "And they requested victory from Allah, and disappointed, [therefore], was every obstinate tyrant.",
    "Before him is Hell, and he will be given a drink of purulent water.",
    "He will gulp it but will hardly [be able to] swallow it. And death will come to him from everywhere, but he is not to die. And before him is a massive punishment.",
    "The example of those who disbelieve in their Lord is [that] their deeds are like ashes which the wind blows forcefully on a stormy day; they are unable [to keep] from what they earned a [single] thing. That is what is extreme error.",
    "Have you not seen that Allah created the heavens and the earth in truth? If He wills, He can do away with you and produce a new creation.",
    "And that is not difficult for Allah.",
    "And they will come out [for judgement] before Allah all together, and the weak will say to those who were arrogant, \"Indeed, we were your followers, so can you avail us anything against the punishment of Allah?\" They will say, \"If Allah had guided us, we would have guided you. It is all the same for us whether we show intolerance or are patient: there is for us no place of escape.\"",
    "And Satan will say when the matter has been concluded, \"Indeed, Allah had promised you the promise of truth. And I promised you, but I betrayed you. But I had no authority over you except that I invited you, and you responded to me. So do not blame me; but blame yourselves. I cannot be called to your aid, nor can you be called to my aid. Indeed, I deny your association of me [with Allah] before. Indeed, for the wrongdoers is a painful punishment.\"",
    "And those who believed and did righteous deeds will be admitted to gardens beneath which rivers flow, abiding eternally therein by permission of their Lord; and their greeting therein will be, \"Peace!\"",
    "Have you not considered how Allah presents an example, [making] a good word like a good tree, whose root is firmly fixed and its branches [high] in the sky?",
    "It produces its fruit all the time, by permission of its Lord. And Allah presents examples for the people that perhaps they will be reminded.",
    "And the example of a bad word is like a bad tree, uprooted from the surface of the earth, not having any stability.",
    "Allah keeps firm those who believe, with the firm word, in worldly life and in the Hereafter. And Allah sends astray the wrongdoers. And Allah does what He wills.",
    "Have you not considered those who exchanged the favor of Allah for disbelief and settled their people [in] the home of ruin?",
    "[It is] Hell, which they will [enter to] burn, and wretched is the settlement.",
    "And they have attributed to Allah equals to mislead [people] from His way. Say, \"Enjoy yourselves, for indeed, your destination is the Fire.\"",
    "[O Muhammad], tell My servants who have believed to establish prayer and spend from what We have provided them, secretly and publicly, before a Day comes in which there will be no exchange, nor any friendships.",
    "It is Allah who created the heavens and the earth and sent down rain from the sky and produced thereby some fruits as provision for you and subjected for you the ships to sail through the sea by His command and subjected for you the rivers.",
    "And He subjected for you the sun and the moon, continuous [in orbit], and subjected for you the night and the day.",
    "And He gave you from all you asked of Him. And if you should count the favor of Allah, you could not enumerate them. Indeed, mankind is [generally] most unjust and ungrateful.",
    "And [mention, O Muhammad], when Abraham said, \"My Lord, make this city [Makkah] secure and keep me and my sons away from worshipping idols.",
    "My Lord, indeed they have led astray many among the people. So whoever follows me - then he is of me; and whoever disobeys me - indeed, You are [yet] Forgiving and Merciful.",
    "Our Lord, I have settled some of my descendants in an uncultivated valley near Your sacred House, our Lord, that they may establish prayer. So make hearts among the people incline toward them and provide for them from the fruits that they might be grateful.",
    "Our Lord, indeed You know what we conceal and what we declare, and nothing is hidden from Allah on the earth or in the heaven.",
    "Praise to Allah, who has granted to me in old age Ishmael and Isaac. Indeed, my Lord is the Hearer of supplication.",
    "My Lord, make me an establisher of prayer, and [many] from my descendants. Our Lord, and accept my supplication.",
    "Our Lord, forgive me and my parents and the believers the Day the account is established.\"",
    "And never think that Allah is unaware of what the wrongdoers do. He only delays them for a Day when eyes will stare [in horror].",
    "Racing ahead, their heads raised up, their glance does not come back to them, and their hearts are void.",
    "And, [O Muhammad], warn the people of a Day when the punishment will come to them and those who did wrong will say, \"Our Lord, delay us for a short term; we will answer Your call and follow the messengers.\" [But it will be said], \"Had you not sworn, before, that for you there would be no cessation?",
    "And you lived among the dwellings of those who wronged themselves, and it had become clear to you how We dealt with them. And We presented for you [many] examples.\"",
    "And they had planned their plan, but with Allah is [recorded] their plan, even if their plan had been [sufficient] to do away with the mountains.",
    "So never think that Allah will fail in His promise to His messengers. Indeed, Allah is Exalted in Might and Owner of Retribution.",
    "[It will be] on the Day the earth will be replaced by another earth, and the heavens [as well], and all creatures will come out before Allah, the One, the Prevailing.",
    "And you will see the criminals that Day bound together in shackles,",
    "Their garments of liquid pitch and their faces covered by the Fire.",
    "So that Allah will recompense every soul for what it earned. Indeed, Allah is swift in account.",
    "This [Qur'an] is notification for the people that they may be warned thereby and that they may know that He is but one God and that those of understanding will be reminded.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibrahim);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ibrahim);
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
