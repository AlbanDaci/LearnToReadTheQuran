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

public class Al_Furqan extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"25:1", "25:2", "25:3", "25:4", "25:5", "25:6", "25:7", "25:8", "25:9", "25:10", "25:11", "25:12", "25:13", "25:14", "25:15", "25:16",
            "25:17", "25:18", "25:19", "25:20", "25:21", "25:22", "25:23", "25:24", "25:25", "25:26", "25:27", "25:28", "25:29", "25:30", "25:31", "25:32",
            "25:33", "25:34", "25:35", "25:36", "25:37", "25:38", "25:39", "25:40", "25:41", "25:42", "25:43", "25:44", "25:45", "25:46", "25:47", "25:48",
            "25:49", "25:50", "25:51", "25:52", "25:53", "25:54", "25:55", "25:56", "25:57", "25:58", "25:59", "25:60", "25:61", "25:62", "25:63", "25:64",
            "25:65", "25:66", "25:67", "25:68", "25:69", "25:70", "25:71", "25:72", "25:73", "25:74", "25:75", "25:76", "25:77"};

    String [] arabic_verses = {"تَبَارَكَ الَّذِي نَزَّلَ الْفُرْقَانَ عَلَىٰ عَبْدِهِ لِيَكُونَ لِلْعَالَمِينَ نَذِيرًا",
    "الَّذِي لَهُ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ وَلَمْ يَتَّخِذْ وَلَدًا وَلَمْ يَكُن لَّهُ شَرِيكٌ فِي الْمُلْكِ وَخَلَقَ كُلَّ شَيْءٍ فَقَدَّرَهُ تَقْدِيرًا",
    "وَاتَّخَذُوا مِن دُونِهِ آلِهَةً لَّا يَخْلُقُونَ شَيْئًا وَهُمْ يُخْلَقُونَ وَلَا يَمْلِكُونَ لِأَنفُسِهِمْ ضَرًّا وَلَا نَفْعًا وَلَا يَمْلِكُونَ مَوْتًا وَلَا حَيَاةً وَلَا نُشُورًا",
    "وَقَالَ الَّذِينَ كَفَرُوا إِنْ هَٰذَا إِلَّا إِفْكٌ افْتَرَاهُ وَأَعَانَهُ عَلَيْهِ قَوْمٌ آخَرُونَ ۖ فَقَدْ جَاءُوا ظُلْمًا وَزُورًا",
    "وَقَالُوا أَسَاطِيرُ الْأَوَّلِينَ اكْتَتَبَهَا فَهِيَ تُمْلَىٰ عَلَيْهِ بُكْرَةً وَأَصِيلًا",
    "قُلْ أَنزَلَهُ الَّذِي يَعْلَمُ السِّرَّ فِي السَّمَاوَاتِ وَالْأَرْضِ ۚ إِنَّهُ كَانَ غَفُورًا رَّحِيمًا",
    "وَقَالُوا مَالِ هَٰذَا الرَّسُولِ يَأْكُلُ الطَّعَامَ وَيَمْشِي فِي الْأَسْوَاقِ ۙ لَوْلَا أُنزِلَ إِلَيْهِ مَلَكٌ فَيَكُونَ مَعَهُ نَذِيرًا",
    "أَوْ يُلْقَىٰ إِلَيْهِ كَنزٌ أَوْ تَكُونُ لَهُ جَنَّةٌ يَأْكُلُ مِنْهَا ۚ وَقَالَ الظَّالِمُونَ إِن تَتَّبِعُونَ إِلَّا رَجُلًا مَّسْحُورًا",
    "انظُرْ كَيْفَ ضَرَبُوا لَكَ الْأَمْثَالَ فَضَلُّوا فَلَا يَسْتَطِيعُونَ سَبِيلًا",
    "تَبَارَكَ الَّذِي إِن شَاءَ جَعَلَ لَكَ خَيْرًا مِّن ذَٰلِكَ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ وَيَجْعَل لَّكَ قُصُورًا",
    "بَلْ كَذَّبُوا بِالسَّاعَةِ ۖ وَأَعْتَدْنَا لِمَن كَذَّبَ بِالسَّاعَةِ سَعِيرًا",
    "إِذَا رَأَتْهُم مِّن مَّكَانٍ بَعِيدٍ سَمِعُوا لَهَا تَغَيُّظًا وَزَفِيرًا",
    "وَإِذَا أُلْقُوا مِنْهَا مَكَانًا ضَيِّقًا مُّقَرَّنِينَ دَعَوْا هُنَالِكَ ثُبُورًا",
    "لَّا تَدْعُوا الْيَوْمَ ثُبُورًا وَاحِدًا وَادْعُوا ثُبُورًا كَثِيرًا",
    "قُلْ أَذَٰلِكَ خَيْرٌ أَمْ جَنَّةُ الْخُلْدِ الَّتِي وُعِدَ الْمُتَّقُونَ ۚ كَانَتْ لَهُمْ جَزَاءً وَمَصِيرًا",
    "لَّهُمْ فِيهَا مَا يَشَاءُونَ خَالِدِينَ ۚ كَانَ عَلَىٰ رَبِّكَ وَعْدًا مَّسْئُولًا",
    "وَيَوْمَ يَحْشُرُهُمْ وَمَا يَعْبُدُونَ مِن دُونِ اللَّهِ فَيَقُولُ أَأَنتُمْ أَضْلَلْتُمْ عِبَادِي هَٰؤُلَاءِ أَمْ هُمْ ضَلُّوا السَّبِيلَ",
    "قَالُوا سُبْحَانَكَ مَا كَانَ يَنبَغِي لَنَا أَن نَّتَّخِذَ مِن دُونِكَ مِنْ أَوْلِيَاءَ وَلَٰكِن مَّتَّعْتَهُمْ وَآبَاءَهُمْ حَتَّىٰ نَسُوا الذِّكْرَ وَكَانُوا قَوْمًا بُورًا",
    "فَقَدْ كَذَّبُوكُم بِمَا تَقُولُونَ فَمَا تَسْتَطِيعُونَ صَرْفًا وَلَا نَصْرًا ۚ وَمَن يَظْلِم مِّنكُمْ نُذِقْهُ عَذَابًا كَبِيرًا",
    "وَمَا أَرْسَلْنَا قَبْلَكَ مِنَ الْمُرْسَلِينَ إِلَّا إِنَّهُمْ لَيَأْكُلُونَ الطَّعَامَ وَيَمْشُونَ فِي الْأَسْوَاقِ ۗ وَجَعَلْنَا بَعْضَكُمْ لِبَعْضٍ فِتْنَةً أَتَصْبِرُونَ ۗ وَكَانَ رَبُّكَ بَصِيرًا",
    "وَقَالَ الَّذِينَ لَا يَرْجُونَ لِقَاءَنَا لَوْلَا أُنزِلَ عَلَيْنَا الْمَلَائِكَةُ أَوْ نَرَىٰ رَبَّنَا ۗ لَقَدِ اسْتَكْبَرُوا فِي أَنفُسِهِمْ وَعَتَوْا عُتُوًّا كَبِيرًا",
    "يَوْمَ يَرَوْنَ الْمَلَائِكَةَ لَا بُشْرَىٰ يَوْمَئِذٍ لِّلْمُجْرِمِينَ وَيَقُولُونَ حِجْرًا مَّحْجُورًا",
    "وَقَدِمْنَا إِلَىٰ مَا عَمِلُوا مِنْ عَمَلٍ فَجَعَلْنَاهُ هَبَاءً مَّنثُورًا",
    "أَصْحَابُ الْجَنَّةِ يَوْمَئِذٍ خَيْرٌ مُّسْتَقَرًّا وَأَحْسَنُ مَقِيلًا",
    "وَيَوْمَ تَشَقَّقُ السَّمَاءُ بِالْغَمَامِ وَنُزِّلَ الْمَلَائِكَةُ تَنزِيلًا",
    "الْمُلْكُ يَوْمَئِذٍ الْحَقُّ لِلرَّحْمَٰنِ ۚ وَكَانَ يَوْمًا عَلَى الْكَافِرِينَ عَسِيرًا",
    "وَيَوْمَ يَعَضُّ الظَّالِمُ عَلَىٰ يَدَيْهِ يَقُولُ يَا لَيْتَنِي اتَّخَذْتُ مَعَ الرَّسُولِ سَبِيلًا",
    "يَا وَيْلَتَىٰ لَيْتَنِي لَمْ أَتَّخِذْ فُلَانًا خَلِيلًا",
    "لَّقَدْ أَضَلَّنِي عَنِ الذِّكْرِ بَعْدَ إِذْ جَاءَنِي ۗ وَكَانَ الشَّيْطَانُ لِلْإِنسَانِ خَذُولًا",
    "وَقَالَ الرَّسُولُ يَا رَبِّ إِنَّ قَوْمِي اتَّخَذُوا هَٰذَا الْقُرْآنَ مَهْجُورًا",
    "وَكَذَٰلِكَ جَعَلْنَا لِكُلِّ نَبِيٍّ عَدُوًّا مِّنَ الْمُجْرِمِينَ ۗ وَكَفَىٰ بِرَبِّكَ هَادِيًا وَنَصِيرًا",
    "وَقَالَ الَّذِينَ كَفَرُوا لَوْلَا نُزِّلَ عَلَيْهِ الْقُرْآنُ جُمْلَةً وَاحِدَةً ۚ كَذَٰلِكَ لِنُثَبِّتَ بِهِ فُؤَادَكَ ۖ وَرَتَّلْنَاهُ تَرْتِيلًا",
    "وَلَا يَأْتُونَكَ بِمَثَلٍ إِلَّا جِئْنَاكَ بِالْحَقِّ وَأَحْسَنَ تَفْسِيرًا",
    "الَّذِينَ يُحْشَرُونَ عَلَىٰ وُجُوهِهِمْ إِلَىٰ جَهَنَّمَ أُولَٰئِكَ شَرٌّ مَّكَانًا وَأَضَلُّ سَبِيلًا",
    "وَلَقَدْ آتَيْنَا مُوسَى الْكِتَابَ وَجَعَلْنَا مَعَهُ أَخَاهُ هَارُونَ وَزِيرًا",
    "فَقُلْنَا اذْهَبَا إِلَى الْقَوْمِ الَّذِينَ كَذَّبُوا بِآيَاتِنَا فَدَمَّرْنَاهُمْ تَدْمِيرًا",
    "وَقَوْمَ نُوحٍ لَّمَّا كَذَّبُوا الرُّسُلَ أَغْرَقْنَاهُمْ وَجَعَلْنَاهُمْ لِلنَّاسِ آيَةً ۖ وَأَعْتَدْنَا لِلظَّالِمِينَ عَذَابًا أَلِيمًا",
    "وَعَادًا وَثَمُودَ وَأَصْحَابَ الرَّسِّ وَقُرُونًا بَيْنَ ذَٰلِكَ كَثِيرًا",
    "وَكُلًّا ضَرَبْنَا لَهُ الْأَمْثَالَ ۖ وَكُلًّا تَبَّرْنَا تَتْبِيرًا",
    "وَلَقَدْ أَتَوْا عَلَى الْقَرْيَةِ الَّتِي أُمْطِرَتْ مَطَرَ السَّوْءِ ۚ أَفَلَمْ يَكُونُوا يَرَوْنَهَا ۚ بَلْ كَانُوا لَا يَرْجُونَ نُشُورًا",
    "وَإِذَا رَأَوْكَ إِن يَتَّخِذُونَكَ إِلَّا هُزُوًا أَهَٰذَا الَّذِي بَعَثَ اللَّهُ رَسُولًا",
    "إِن كَادَ لَيُضِلُّنَا عَنْ آلِهَتِنَا لَوْلَا أَن صَبَرْنَا عَلَيْهَا ۚ وَسَوْفَ يَعْلَمُونَ حِينَ يَرَوْنَ الْعَذَابَ مَنْ أَضَلُّ سَبِيلًا",
    "أَرَأَيْتَ مَنِ اتَّخَذَ إِلَٰهَهُ هَوَاهُ أَفَأَنتَ تَكُونُ عَلَيْهِ وَكِيلًا",
    "أَمْ تَحْسَبُ أَنَّ أَكْثَرَهُمْ يَسْمَعُونَ أَوْ يَعْقِلُونَ ۚ إِنْ هُمْ إِلَّا كَالْأَنْعَامِ ۖ بَلْ هُمْ أَضَلُّ سَبِيلًا",
    "أَلَمْ تَرَ إِلَىٰ رَبِّكَ كَيْفَ مَدَّ الظِّلَّ وَلَوْ شَاءَ لَجَعَلَهُ سَاكِنًا ثُمَّ جَعَلْنَا الشَّمْسَ عَلَيْهِ دَلِيلًا",
    "ثُمَّ قَبَضْنَاهُ إِلَيْنَا قَبْضًا يَسِيرًا",
    "وَهُوَ الَّذِي جَعَلَ لَكُمُ اللَّيْلَ لِبَاسًا وَالنَّوْمَ سُبَاتًا وَجَعَلَ النَّهَارَ نُشُورًا",
    "وَهُوَ الَّذِي أَرْسَلَ الرِّيَاحَ بُشْرًا بَيْنَ يَدَيْ رَحْمَتِهِ ۚ وَأَنزَلْنَا مِنَ السَّمَاءِ مَاءً طَهُورًا",
    "لِّنُحْيِيَ بِهِ بَلْدَةً مَّيْتًا وَنُسْقِيَهُ مِمَّا خَلَقْنَا أَنْعَامًا وَأَنَاسِيَّ كَثِيرًا",
    "وَلَقَدْ صَرَّفْنَاهُ بَيْنَهُمْ لِيَذَّكَّرُوا فَأَبَىٰ أَكْثَرُ النَّاسِ إِلَّا كُفُورًا",
    "وَلَوْ شِئْنَا لَبَعَثْنَا فِي كُلِّ قَرْيَةٍ نَّذِيرًا",
    "فَلَا تُطِعِ الْكَافِرِينَ وَجَاهِدْهُم بِهِ جِهَادًا كَبِيرًا",
    "وَهُوَ الَّذِي مَرَجَ الْبَحْرَيْنِ هَٰذَا عَذْبٌ فُرَاتٌ وَهَٰذَا مِلْحٌ أُجَاجٌ وَجَعَلَ بَيْنَهُمَا بَرْزَخًا وَحِجْرًا مَّحْجُورًا",
    "وَهُوَ الَّذِي خَلَقَ مِنَ الْمَاءِ بَشَرًا فَجَعَلَهُ نَسَبًا وَصِهْرًا ۗ وَكَانَ رَبُّكَ قَدِيرًا",
    "وَيَعْبُدُونَ مِن دُونِ اللَّهِ مَا لَا يَنفَعُهُمْ وَلَا يَضُرُّهُمْ ۗ وَكَانَ الْكَافِرُ عَلَىٰ رَبِّهِ ظَهِيرًا",
    "وَمَا أَرْسَلْنَاكَ إِلَّا مُبَشِّرًا وَنَذِيرًا",
    "قُلْ مَا أَسْأَلُكُمْ عَلَيْهِ مِنْ أَجْرٍ إِلَّا مَن شَاءَ أَن يَتَّخِذَ إِلَىٰ رَبِّهِ سَبِيلًا",
    "وَتَوَكَّلْ عَلَى الْحَيِّ الَّذِي لَا يَمُوتُ وَسَبِّحْ بِحَمْدِهِ ۚ وَكَفَىٰ بِهِ بِذُنُوبِ عِبَادِهِ خَبِيرًا",
    "الَّذِي خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا فِي سِتَّةِ أَيَّامٍ ثُمَّ اسْتَوَىٰ عَلَى الْعَرْشِ ۚ الرَّحْمَٰنُ فَاسْأَلْ بِهِ خَبِيرًا",
    "وَإِذَا قِيلَ لَهُمُ اسْجُدُوا لِلرَّحْمَٰنِ قَالُوا وَمَا الرَّحْمَٰنُ أَنَسْجُدُ لِمَا تَأْمُرُنَا وَزَادَهُمْ نُفُورًا ۩",
    "تَبَارَكَ الَّذِي جَعَلَ فِي السَّمَاءِ بُرُوجًا وَجَعَلَ فِيهَا سِرَاجًا وَقَمَرًا مُّنِيرًا",
    "وَهُوَ الَّذِي جَعَلَ اللَّيْلَ وَالنَّهَارَ خِلْفَةً لِّمَنْ أَرَادَ أَن يَذَّكَّرَ أَوْ أَرَادَ شُكُورًا",
    "وَعِبَادُ الرَّحْمَٰنِ الَّذِينَ يَمْشُونَ عَلَى الْأَرْضِ هَوْنًا وَإِذَا خَاطَبَهُمُ الْجَاهِلُونَ قَالُوا سَلَامًا",
    "وَالَّذِينَ يَبِيتُونَ لِرَبِّهِمْ سُجَّدًا وَقِيَامًا",
    "وَالَّذِينَ يَقُولُونَ رَبَّنَا اصْرِفْ عَنَّا عَذَابَ جَهَنَّمَ ۖ إِنَّ عَذَابَهَا كَانَ غَرَامًا",
    "إِنَّهَا سَاءَتْ مُسْتَقَرًّا وَمُقَامًا",
    "وَالَّذِينَ إِذَا أَنفَقُوا لَمْ يُسْرِفُوا وَلَمْ يَقْتُرُوا وَكَانَ بَيْنَ ذَٰلِكَ قَوَامًا",
    "وَالَّذِينَ لَا يَدْعُونَ مَعَ اللَّهِ إِلَٰهًا آخَرَ وَلَا يَقْتُلُونَ النَّفْسَ الَّتِي حَرَّمَ اللَّهُ إِلَّا بِالْحَقِّ وَلَا يَزْنُونَ ۚ وَمَن يَفْعَلْ ذَٰلِكَ يَلْقَ أَثَامًا",
    "يُضَاعَفْ لَهُ الْعَذَابُ يَوْمَ الْقِيَامَةِ وَيَخْلُدْ فِيهِ مُهَانًا",
    "إِلَّا مَن تَابَ وَآمَنَ وَعَمِلَ عَمَلًا صَالِحًا فَأُولَٰئِكَ يُبَدِّلُ اللَّهُ سَيِّئَاتِهِمْ حَسَنَاتٍ ۗ وَكَانَ اللَّهُ غَفُورًا رَّحِيمًا",
    "وَمَن تَابَ وَعَمِلَ صَالِحًا فَإِنَّهُ يَتُوبُ إِلَى اللَّهِ مَتَابًا",
    "وَالَّذِينَ لَا يَشْهَدُونَ الزُّورَ وَإِذَا مَرُّوا بِاللَّغْوِ مَرُّوا كِرَامًا",
    "وَالَّذِينَ إِذَا ذُكِّرُوا بِآيَاتِ رَبِّهِمْ لَمْ يَخِرُّوا عَلَيْهَا صُمًّا وَعُمْيَانًا",
    "وَالَّذِينَ يَقُولُونَ رَبَّنَا هَبْ لَنَا مِنْ أَزْوَاجِنَا وَذُرِّيَّاتِنَا قُرَّةَ أَعْيُنٍ وَاجْعَلْنَا لِلْمُتَّقِينَ إِمَامًا",
    "أُولَٰئِكَ يُجْزَوْنَ الْغُرْفَةَ بِمَا صَبَرُوا وَيُلَقَّوْنَ فِيهَا تَحِيَّةً وَسَلَامًا",
    "خَالِدِينَ فِيهَا ۚ حَسُنَتْ مُسْتَقَرًّا وَمُقَامًا",
    "قُلْ مَا يَعْبَأُ بِكُمْ رَبِّي لَوْلَا دُعَاؤُكُمْ ۖ فَقَدْ كَذَّبْتُمْ فَسَوْفَ يَكُونُ لِزَامًا"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"Blessed is He who sent down the Criterion upon His Servant that he may be to the worlds a warner -",
    "He to whom belongs the dominion of the heavens and the earth and who has not taken a son and has not had a partner in dominion and has created each thing and determined it with [precise] determination.",
    "But they have taken besides Him gods which create nothing, while they are created, and possess not for themselves any harm or benefit and possess not [power to cause] death or life or resurrection.",
    "And those who disbelieve say, \"This [Qur'an] is not except a falsehood he invented, and another people assisted him in it.\" But they have committed an injustice and a lie.",
    "And they say, \"Legends of the former peoples which he has written down, and they are dictated to him morning and afternoon.\"",
    "Say, [O Muhammad], \"It has been revealed by He who knows [every] secret within the heavens and the earth. Indeed, He is ever Forgiving and Merciful.\"",
    "And they say, \"What is this messenger that eats food and walks in the markets? Why was there not sent down to him an angel so he would be with him a warner?",
    "Or [why is not] a treasure presented to him [from heaven], or does he [not] have a garden from which he eats?\" And the wrongdoers say, \"You follow not but a man affected by magic.\"",
    "Look how they strike for you comparisons; but they have strayed, so they cannot [find] a way.",
    "Blessed is He who, if He willed, could have made for you [something] better than that - gardens beneath which rivers flow - and could make for you palaces.",
    "But they have denied the Hour, and We have prepared for those who deny the Hour a Blaze.",
    "When the Hellfire sees them from a distant place, they will hear its fury and roaring.",
    "And when they are thrown into a narrow place therein bound in chains, they will cry out thereupon for destruction.",
    "[They will be told], \"Do not cry this Day for one destruction but cry for much destruction.\"",
    "Say, \"Is that better or the Garden of Eternity which is promised to the righteous? It will be for them a reward and destination.",
    "For them therein is whatever they wish, [while] abiding eternally. It is ever upon your Lord a promise [worthy to be] requested.",
    "And [mention] the Day He will gather them and that which they worship besides Allah and will say, \"Did you mislead these, My servants, or did they [themselves] stray from the way?\"",
    "They will say, \"Exalted are You! It was not for us to take besides You any allies. But You provided comforts for them and their fathers until they forgot the message and became a people ruined.\"",
    "So they will deny you, [disbelievers], in what you say, and you cannot avert [punishment] or [find] help. And whoever commits injustice among you - We will make him taste a great punishment.",
    "And We did not send before you, [O Muhammad], any of the messengers except that they ate food and walked in the markets. And We have made some of you [people] as trial for others - will you have patience? And ever is your Lord, Seeing.",
    "And those who do not expect the meeting with Us say, \"Why were not angels sent down to us, or [why] do we [not] see our Lord?\" They have certainly become arrogant within themselves and [become] insolent with great insolence.",
    "The day they see the angels - no good tidings will there be that day for the criminals, and [the angels] will say, \"Prevented and inaccessible.\"",
    "And We will regard what they have done of deeds and make them as dust dispersed.",
    "The companions of Paradise, that Day, are [in] a better settlement and better resting place.",
    "And [mention] the Day when the heaven will split open with [emerging] clouds, and the angels will be sent down in successive descent.",
    "True sovereignty, that Day, is for the Most Merciful. And it will be upon the disbelievers a difficult Day.",
    "And the Day the wrongdoer will bite on his hands [in regret] he will say, \"Oh, I wish I had taken with the Messenger a way.",
    "Oh, woe to me! I wish I had not taken that one as a friend.",
    "He led me away from the remembrance after it had come to me. And ever is Satan, to man, a deserter.\"",
    "And the Messenger has said, \"O my Lord, indeed my people have taken this Qur'an as [a thing] abandoned.\"",
    "And thus have We made for every prophet an enemy from among the criminals. But sufficient is your Lord as a guide and a helper.",
    "And those who disbelieve say, \"Why was the Qur'an not revealed to him all at once?\" Thus [it is] that We may strengthen thereby your heart. And We have spaced it distinctly.",
    "And they do not come to you with an argument except that We bring you the truth and the best explanation.",
    "The ones who are gathered on their faces to Hell - those are the worst in position and farthest astray in [their] way.",
    "And We had certainly given Moses the Scripture and appointed with him his brother Aaron as an assistant.",
    "And We said, \"Go both of you to the people who have denied Our signs.\" Then We destroyed them with [complete] destruction.",
    "And the people of Noah - when they denied the messengers, We drowned them, and We made them for mankind a sign. And We have prepared for the wrongdoers a painful punishment.",
    "And [We destroyed] 'Aad and Thamud and the companions of the well and many generations between them.",
    "And for each We presented examples [as warnings], and each We destroyed with [total] destruction.",
    "And they have already come upon the town which was showered with a rain of evil. So have they not seen it? But they are not expecting resurrection.",
    "And when they see you, [O Muhammad], they take you not except in ridicule, [saying], \"Is this the one whom Allah has sent as a messenger?",
    "He almost would have misled us from our gods had we not been steadfast in [worship of] them.\" But they are going to know, when they see the punishment, who is farthest astray in [his] way.",
    "Have you seen the one who takes as his god his own desire? Then would you be responsible for him?",
    "Or do you think that most of them hear or reason? They are not except like livestock. Rather, they are [even] more astray in [their] way.",
    "Have you not considered your Lord - how He extends the shadow, and if He willed, He could have made it stationary? Then We made the sun for it an indication.",
    "Then We hold it in hand for a brief grasp.",
    "And it is He who has made the night for you as clothing and sleep [a means for] rest and has made the day a resurrection.",
    "And it is He who sends the winds as good tidings before His mercy, and We send down from the sky pure water",
    "That We may bring to life thereby a dead land and give it as drink to those We created of numerous livestock and men.",
    "And We have certainly distributed it among them that they might be reminded, but most of the people refuse except disbelief.",
    "And if We had willed, We could have sent into every city a warner.",
    "So do not obey the disbelievers, and strive against them with the Qur'an a great striving.",
    "And it is He who has released [simultaneously] the two seas, one fresh and sweet and one salty and bitter, and He placed between them a barrier and prohibiting partition.",
    "And it is He who has created from water a human being and made him [a relative by] lineage and marriage. And ever is your Lord competent [concerning creation].",
    "But they worship rather than Allah that which does not benefit them or harm them, and the disbeliever is ever, against his Lord, an assistant [to Satan].",
    "And We have not sent you, [O Muhammad], except as a bringer of good tidings and a warner.",
    "Say, \"I do not ask of you for it any payment - only that whoever wills might take to his Lord a way.\"",
    "And rely upon the Ever-Living who does not die, and exalt [Allah] with His praise. And sufficient is He to be, with the sins of His servants, Acquainted -",
    "He who created the heavens and the earth and what is between them in six days and then established Himself above the Throne - the Most Merciful, so ask about Him one well informed.",
    "And when it is said to them, \"Prostrate to the Most Merciful,\" they say, \"And what is the Most Merciful? Should we prostrate to that which you order us?\" And it increases them in aversion.",
    "Blessed is He who has placed in the sky great stars and placed therein a [burning] lamp and luminous moon.",
    "And it is He who has made the night and the day in succession for whoever desires to remember or desires gratitude.",
    "And the servants of the Most Merciful are those who walk upon the earth easily, and when the ignorant address them [harshly], they say [words of] peace,",
    "And those who spend [part of] the night to their Lord prostrating and standing [in prayer]",
    "And those who say, \"Our Lord, avert from us the punishment of Hell. Indeed, its punishment is ever adhering;",
    "Indeed, it is evil as a settlement and residence.\"",
    "And [they are] those who, when they spend, do so not excessively or sparingly but are ever, between that, [justly] moderate",
    "And those who do not invoke with Allah another deity or kill the soul which Allah has forbidden [to be killed], except by right, and do not commit unlawful sexual intercourse. And whoever should do that will meet a penalty.",
    "Multiplied for him is the punishment on the Day of Resurrection, and he will abide therein humiliated -",
    "Except for those who repent, believe and do righteous work. For them Allah will replace their evil deeds with good. And ever is Allah Forgiving and Merciful.",
    "And he who repents and does righteousness does indeed turn to Allah with [accepted] repentance.",
    "And [they are] those who do not testify to falsehood, and when they pass near ill speech, they pass by with dignity.",
    "And those who, when reminded of the verses of their Lord, do not fall upon them deaf and blind.",
    "And those who say, \"Our Lord, grant us from among our wives and offspring comfort to our eyes and make us an example for the righteous.\"",
    "Those will be awarded the Chamber for what they patiently endured, and they will be received therein with greetings and [words of] peace.",
    "Abiding eternally therein. Good is the settlement and residence.",
    "Say, \"What would my Lord care for you if not for your supplication?\" For you [disbelievers] have denied, so your denial is going to be adherent."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__furqan);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_furqan);
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
