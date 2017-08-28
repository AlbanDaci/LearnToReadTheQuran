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

public class Al_Kahf extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"18:1", "18:2", "18:3", "18:4", "18:5", "18:6", "18:7", "18:8", "18:9", "18:10", "18:11", "18:12", "18:13", "18:14", "18:15", "18:16",
            "18:17", "18:18", "18:19", "18:20", "18:21", "18:22", "18:23", "18:24", "18:25", "18:26", "18:27", "18:28", "18:29", "18:30", "18:31", "18:32",
            "18:33", "18:34", "18:35", "18:36", "18:37", "18:38", "18:39", "18:40", "18:41", "18:42", "18:43", "18:44", "18:45", "18:46", "18:47", "18:48",
            "18:49", "18:50", "18:51", "18:52", "18:53", "18:54", "18:55", "18:56", "18:57", "18:58", "18:59", "18:60", "18:61", "18:62", "18:63", "18:64",
            "18:65", "18:66", "18:67", "18:68", "18:69", "18:70", "18:71", "18:72", "18:73", "18:74", "18:75", "18:76", "18:77", "18:78", "18:79", "18:80",
            "18:81", "18:82", "18:83", "18:84", "18:85", "18:86", "18:87", "18:88", "18:89", "18:90", "18:91", "18:92", "18:93", "18:94", "18:95", "18:96",
            "18:97", "18:98", "18:99", "18:100", "18:101", "18:102", "18:103", "18:104", "18:105", "18:106", "18:107", "18:108", "18:109", "18:110", ""};

    String [] arabic_verses = {"الْحَمْدُ لِلَّهِ الَّذِي أَنزَلَ عَلَىٰ عَبْدِهِ الْكِتَابَ وَلَمْ يَجْعَل لَّهُ عِوَجًا ۜ",
    "قَيِّمًا لِّيُنذِرَ بَأْسًا شَدِيدًا مِّن لَّدُنْهُ وَيُبَشِّرَ الْمُؤْمِنِينَ الَّذِينَ يَعْمَلُونَ الصَّالِحَاتِ أَنَّ لَهُمْ أَجْرًا حَسَنًا",
    "مَّاكِثِينَ فِيهِ أَبَدًا",
    "وَيُنذِرَ الَّذِينَ قَالُوا اتَّخَذَ اللَّهُ وَلَدًا",
    "مَّا لَهُم بِهِ مِنْ عِلْمٍ وَلَا لِآبَائِهِمْ ۚ كَبُرَتْ كَلِمَةً تَخْرُجُ مِنْ أَفْوَاهِهِمْ ۚ إِن يَقُولُونَ إِلَّا كَذِبًا",
    "فَلَعَلَّكَ بَاخِعٌ نَّفْسَكَ عَلَىٰ آثَارِهِمْ إِن لَّمْ يُؤْمِنُوا بِهَٰذَا الْحَدِيثِ أَسَفًا",
    "إِنَّا جَعَلْنَا مَا عَلَى الْأَرْضِ زِينَةً لَّهَا لِنَبْلُوَهُمْ أَيُّهُمْ أَحْسَنُ عَمَلًا",
    "وَإِنَّا لَجَاعِلُونَ مَا عَلَيْهَا صَعِيدًا جُرُزًا",
    "أَمْ حَسِبْتَ أَنَّ أَصْحَابَ الْكَهْفِ وَالرَّقِيمِ كَانُوا مِنْ آيَاتِنَا عَجَبًا",
    "إِذْ أَوَى الْفِتْيَةُ إِلَى الْكَهْفِ فَقَالُوا رَبَّنَا آتِنَا مِن لَّدُنكَ رَحْمَةً وَهَيِّئْ لَنَا مِنْ أَمْرِنَا رَشَدًا",
    "فَضَرَبْنَا عَلَىٰ آذَانِهِمْ فِي الْكَهْفِ سِنِينَ عَدَدًا",
    "ثُمَّ بَعَثْنَاهُمْ لِنَعْلَمَ أَيُّ الْحِزْبَيْنِ أَحْصَىٰ لِمَا لَبِثُوا أَمَدًا",
    "نَّحْنُ نَقُصُّ عَلَيْكَ نَبَأَهُم بِالْحَقِّ ۚ إِنَّهُمْ فِتْيَةٌ آمَنُوا بِرَبِّهِمْ وَزِدْنَاهُمْ هُدًى",
    "وَرَبَطْنَا عَلَىٰ قُلُوبِهِمْ إِذْ قَامُوا فَقَالُوا رَبُّنَا رَبُّ السَّمَاوَاتِ وَالْأَرْضِ لَن نَّدْعُوَ مِن دُونِهِ إِلَٰهًا ۖ لَّقَدْ قُلْنَا إِذًا شَطَطًا",
    "هَٰؤُلَاءِ قَوْمُنَا اتَّخَذُوا مِن دُونِهِ آلِهَةً ۖ لَّوْلَا يَأْتُونَ عَلَيْهِم بِسُلْطَانٍ بَيِّنٍ ۖ فَمَنْ أَظْلَمُ مِمَّنِ افْتَرَىٰ عَلَى اللَّهِ كَذِبًا",
    "وَإِذِ اعْتَزَلْتُمُوهُمْ وَمَا يَعْبُدُونَ إِلَّا اللَّهَ فَأْوُوا إِلَى الْكَهْفِ يَنشُرْ لَكُمْ رَبُّكُم مِّن رَّحْمَتِهِ وَيُهَيِّئْ لَكُم مِّنْ أَمْرِكُم مِّرْفَقًا",
    "وَتَرَى الشَّمْسَ إِذَا طَلَعَت تَّزَاوَرُ عَن كَهْفِهِمْ ذَاتَ الْيَمِينِ وَإِذَا غَرَبَت تَّقْرِضُهُمْ ذَاتَ الشِّمَالِ وَهُمْ فِي فَجْوَةٍ مِّنْهُ ۚ ذَٰلِكَ مِنْ آيَاتِ اللَّهِ ۗ مَن يَهْدِ اللَّهُ فَهُوَ الْمُهْتَدِ ۖ وَمَن يُضْلِلْ فَلَن تَجِدَ لَهُ وَلِيًّا مُّرْشِدًا",
    "وَتَحْسَبُهُمْ أَيْقَاظًا وَهُمْ رُقُودٌ ۚ وَنُقَلِّبُهُمْ ذَاتَ الْيَمِينِ وَذَاتَ الشِّمَالِ ۖ وَكَلْبُهُم بَاسِطٌ ذِرَاعَيْهِ بِالْوَصِيدِ ۚ لَوِ اطَّلَعْتَ عَلَيْهِمْ لَوَلَّيْتَ مِنْهُمْ فِرَارًا وَلَمُلِئْتَ مِنْهُمْ رُعْبًا",
    "وَكَذَٰلِكَ بَعَثْنَاهُمْ لِيَتَسَاءَلُوا بَيْنَهُمْ ۚ قَالَ قَائِلٌ مِّنْهُمْ كَمْ لَبِثْتُمْ ۖ قَالُوا لَبِثْنَا يَوْمًا أَوْ بَعْضَ يَوْمٍ ۚ قَالُوا رَبُّكُمْ أَعْلَمُ بِمَا لَبِثْتُمْ فَابْعَثُوا أَحَدَكُم بِوَرِقِكُمْ هَٰذِهِ إِلَى الْمَدِينَةِ فَلْيَنظُرْ أَيُّهَا أَزْكَىٰ طَعَامًا فَلْيَأْتِكُم بِرِزْقٍ مِّنْهُ وَلْيَتَلَطَّفْ وَلَا يُشْعِرَنَّ بِكُمْ أَحَدًا",
    "إِنَّهُمْ إِن يَظْهَرُوا عَلَيْكُمْ يَرْجُمُوكُمْ أَوْ يُعِيدُوكُمْ فِي مِلَّتِهِمْ وَلَن تُفْلِحُوا إِذًا أَبَدًا",
    "وَكَذَٰلِكَ أَعْثَرْنَا عَلَيْهِمْ لِيَعْلَمُوا أَنَّ وَعْدَ اللَّهِ حَقٌّ وَأَنَّ السَّاعَةَ لَا رَيْبَ فِيهَا إِذْ يَتَنَازَعُونَ بَيْنَهُمْ أَمْرَهُمْ ۖ فَقَالُوا ابْنُوا عَلَيْهِم بُنْيَانًا ۖ رَّبُّهُمْ أَعْلَمُ بِهِمْ ۚ قَالَ الَّذِينَ غَلَبُوا عَلَىٰ أَمْرِهِمْ لَنَتَّخِذَنَّ عَلَيْهِم مَّسْجِدًا",
    "سَيَقُولُونَ ثَلَاثَةٌ رَّابِعُهُمْ كَلْبُهُمْ وَيَقُولُونَ خَمْسَةٌ سَادِسُهُمْ كَلْبُهُمْ رَجْمًا بِالْغَيْبِ ۖ وَيَقُولُونَ سَبْعَةٌ وَثَامِنُهُمْ كَلْبُهُمْ ۚ قُل رَّبِّي أَعْلَمُ بِعِدَّتِهِم مَّا يَعْلَمُهُمْ إِلَّا قَلِيلٌ ۗ فَلَا تُمَارِ فِيهِمْ إِلَّا مِرَاءً ظَاهِرًا وَلَا تَسْتَفْتِ فِيهِم مِّنْهُمْ أَحَدًا",
    "وَلَا تَقُولَنَّ لِشَيْءٍ إِنِّي فَاعِلٌ ذَٰلِكَ غَدًا",
    "إِلَّا أَن يَشَاءَ اللَّهُ ۚ وَاذْكُر رَّبَّكَ إِذَا نَسِيتَ وَقُلْ عَسَىٰ أَن يَهْدِيَنِ رَبِّي لِأَقْرَبَ مِنْ هَٰذَا رَشَدًا",
    "وَلَبِثُوا فِي كَهْفِهِمْ ثَلَاثَ مِائَةٍ سِنِينَ وَازْدَادُوا تِسْعًا",
    "قُلِ اللَّهُ أَعْلَمُ بِمَا لَبِثُوا ۖ لَهُ غَيْبُ السَّمَاوَاتِ وَالْأَرْضِ ۖ أَبْصِرْ بِهِ وَأَسْمِعْ ۚ مَا لَهُم مِّن دُونِهِ مِن وَلِيٍّ وَلَا يُشْرِكُ فِي حُكْمِهِ أَحَدًا",
    "وَاتْلُ مَا أُوحِيَ إِلَيْكَ مِن كِتَابِ رَبِّكَ ۖ لَا مُبَدِّلَ لِكَلِمَاتِهِ وَلَن تَجِدَ مِن دُونِهِ مُلْتَحَدًا",
    "وَاصْبِرْ نَفْسَكَ مَعَ الَّذِينَ يَدْعُونَ رَبَّهُم بِالْغَدَاةِ وَالْعَشِيِّ يُرِيدُونَ وَجْهَهُ ۖ وَلَا تَعْدُ عَيْنَاكَ عَنْهُمْ تُرِيدُ زِينَةَ الْحَيَاةِ الدُّنْيَا ۖ وَلَا تُطِعْ مَنْ أَغْفَلْنَا قَلْبَهُ عَن ذِكْرِنَا وَاتَّبَعَ هَوَاهُ وَكَانَ أَمْرُهُ فُرُطًا",
    "وَقُلِ الْحَقُّ مِن رَّبِّكُمْ ۖ فَمَن شَاءَ فَلْيُؤْمِن وَمَن شَاءَ فَلْيَكْفُرْ ۚ إِنَّا أَعْتَدْنَا لِلظَّالِمِينَ نَارًا أَحَاطَ بِهِمْ سُرَادِقُهَا ۚ وَإِن يَسْتَغِيثُوا يُغَاثُوا بِمَاءٍ كَالْمُهْلِ يَشْوِي الْوُجُوهَ ۚ بِئْسَ الشَّرَابُ وَسَاءَتْ مُرْتَفَقًا",
    "إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ إِنَّا لَا نُضِيعُ أَجْرَ مَنْ أَحْسَنَ عَمَلًا",
    "أُولَٰئِكَ لَهُمْ جَنَّاتُ عَدْنٍ تَجْرِي مِن تَحْتِهِمُ الْأَنْهَارُ يُحَلَّوْنَ فِيهَا مِنْ أَسَاوِرَ مِن ذَهَبٍ وَيَلْبَسُونَ ثِيَابًا خُضْرًا مِّن سُندُسٍ وَإِسْتَبْرَقٍ مُّتَّكِئِينَ فِيهَا عَلَى الْأَرَائِكِ ۚ نِعْمَ الثَّوَابُ وَحَسُنَتْ مُرْتَفَقًا",
    "وَاضْرِبْ لَهُم مَّثَلًا رَّجُلَيْنِ جَعَلْنَا لِأَحَدِهِمَا جَنَّتَيْنِ مِنْ أَعْنَابٍ وَحَفَفْنَاهُمَا بِنَخْلٍ وَجَعَلْنَا بَيْنَهُمَا زَرْعًا",
    "كِلْتَا الْجَنَّتَيْنِ آتَتْ أُكُلَهَا وَلَمْ تَظْلِم مِّنْهُ شَيْئًا ۚ وَفَجَّرْنَا خِلَالَهُمَا نَهَرًا",
    "وَكَانَ لَهُ ثَمَرٌ فَقَالَ لِصَاحِبِهِ وَهُوَ يُحَاوِرُهُ أَنَا أَكْثَرُ مِنكَ مَالًا وَأَعَزُّ نَفَرًا",
    "وَدَخَلَ جَنَّتَهُ وَهُوَ ظَالِمٌ لِّنَفْسِهِ قَالَ مَا أَظُنُّ أَن تَبِيدَ هَٰذِهِ أَبَدًا",
    "وَمَا أَظُنُّ السَّاعَةَ قَائِمَةً وَلَئِن رُّدِدتُّ إِلَىٰ رَبِّي لَأَجِدَنَّ خَيْرًا مِّنْهَا مُنقَلَبًا",
    "قَالَ لَهُ صَاحِبُهُ وَهُوَ يُحَاوِرُهُ أَكَفَرْتَ بِالَّذِي خَلَقَكَ مِن تُرَابٍ ثُمَّ مِن نُّطْفَةٍ ثُمَّ سَوَّاكَ رَجُلًا",
    "لَّٰكِنَّا هُوَ اللَّهُ رَبِّي وَلَا أُشْرِكُ بِرَبِّي أَحَدًا",
    "وَلَوْلَا إِذْ دَخَلْتَ جَنَّتَكَ قُلْتَ مَا شَاءَ اللَّهُ لَا قُوَّةَ إِلَّا بِاللَّهِ ۚ إِن تَرَنِ أَنَا أَقَلَّ مِنكَ مَالًا وَوَلَدًا",
    "فَعَسَىٰ رَبِّي أَن يُؤْتِيَنِ خَيْرًا مِّن جَنَّتِكَ وَيُرْسِلَ عَلَيْهَا حُسْبَانًا مِّنَ السَّمَاءِ فَتُصْبِحَ صَعِيدًا زَلَقًا",
    "أَوْ يُصْبِحَ مَاؤُهَا غَوْرًا فَلَن تَسْتَطِيعَ لَهُ طَلَبًا",
    "وَأُحِيطَ بِثَمَرِهِ فَأَصْبَحَ يُقَلِّبُ كَفَّيْهِ عَلَىٰ مَا أَنفَقَ فِيهَا وَهِيَ خَاوِيَةٌ عَلَىٰ عُرُوشِهَا وَيَقُولُ يَا لَيْتَنِي لَمْ أُشْرِكْ بِرَبِّي أَحَدًا",
    "وَلَمْ تَكُن لَّهُ فِئَةٌ يَنصُرُونَهُ مِن دُونِ اللَّهِ وَمَا كَانَ مُنتَصِرًا",
    "هُنَالِكَ الْوَلَايَةُ لِلَّهِ الْحَقِّ ۚ هُوَ خَيْرٌ ثَوَابًا وَخَيْرٌ عُقْبًا",
    "وَاضْرِبْ لَهُم مَّثَلَ الْحَيَاةِ الدُّنْيَا كَمَاءٍ أَنزَلْنَاهُ مِنَ السَّمَاءِ فَاخْتَلَطَ بِهِ نَبَاتُ الْأَرْضِ فَأَصْبَحَ هَشِيمًا تَذْرُوهُ الرِّيَاحُ ۗ وَكَانَ اللَّهُ عَلَىٰ كُلِّ شَيْءٍ مُّقْتَدِرًا",
    "الْمَالُ وَالْبَنُونَ زِينَةُ الْحَيَاةِ الدُّنْيَا ۖ وَالْبَاقِيَاتُ الصَّالِحَاتُ خَيْرٌ عِندَ رَبِّكَ ثَوَابًا وَخَيْرٌ أَمَلًا",
    "وَيَوْمَ نُسَيِّرُ الْجِبَالَ وَتَرَى الْأَرْضَ بَارِزَةً وَحَشَرْنَاهُمْ فَلَمْ نُغَادِرْ مِنْهُمْ أَحَدًا",
    "وَعُرِضُوا عَلَىٰ رَبِّكَ صَفًّا لَّقَدْ جِئْتُمُونَا كَمَا خَلَقْنَاكُمْ أَوَّلَ مَرَّةٍ ۚ بَلْ زَعَمْتُمْ أَلَّن نَّجْعَلَ لَكُم مَّوْعِدًا",
    "وَوُضِعَ الْكِتَابُ فَتَرَى الْمُجْرِمِينَ مُشْفِقِينَ مِمَّا فِيهِ وَيَقُولُونَ يَا وَيْلَتَنَا مَالِ هَٰذَا الْكِتَابِ لَا يُغَادِرُ صَغِيرَةً وَلَا كَبِيرَةً إِلَّا أَحْصَاهَا ۚ وَوَجَدُوا مَا عَمِلُوا حَاضِرًا ۗ وَلَا يَظْلِمُ رَبُّكَ أَحَدًا",
    "وَإِذْ قُلْنَا لِلْمَلَائِكَةِ اسْجُدُوا لِآدَمَ فَسَجَدُوا إِلَّا إِبْلِيسَ كَانَ مِنَ الْجِنِّ فَفَسَقَ عَنْ أَمْرِ رَبِّهِ ۗ أَفَتَتَّخِذُونَهُ وَذُرِّيَّتَهُ أَوْلِيَاءَ مِن دُونِي وَهُمْ لَكُمْ عَدُوٌّ ۚ بِئْسَ لِلظَّالِمِينَ بَدَلًا",
    "مَّا أَشْهَدتُّهُمْ خَلْقَ السَّمَاوَاتِ وَالْأَرْضِ وَلَا خَلْقَ أَنفُسِهِمْ وَمَا كُنتُ مُتَّخِذَ الْمُضِلِّينَ عَضُدًا",
    "وَيَوْمَ يَقُولُ نَادُوا شُرَكَائِيَ الَّذِينَ زَعَمْتُمْ فَدَعَوْهُمْ فَلَمْ يَسْتَجِيبُوا لَهُمْ وَجَعَلْنَا بَيْنَهُم مَّوْبِقًا",
    "وَرَأَى الْمُجْرِمُونَ النَّارَ فَظَنُّوا أَنَّهُم مُّوَاقِعُوهَا وَلَمْ يَجِدُوا عَنْهَا مَصْرِفًا",
    "وَلَقَدْ صَرَّفْنَا فِي هَٰذَا الْقُرْآنِ لِلنَّاسِ مِن كُلِّ مَثَلٍ ۚ وَكَانَ الْإِنسَانُ أَكْثَرَ شَيْءٍ جَدَلًا",
    "وَمَا مَنَعَ النَّاسَ أَن يُؤْمِنُوا إِذْ جَاءَهُمُ الْهُدَىٰ وَيَسْتَغْفِرُوا رَبَّهُمْ إِلَّا أَن تَأْتِيَهُمْ سُنَّةُ الْأَوَّلِينَ أَوْ يَأْتِيَهُمُ الْعَذَابُ قُبُلًا",
    "وَمَا نُرْسِلُ الْمُرْسَلِينَ إِلَّا مُبَشِّرِينَ وَمُنذِرِينَ ۚ وَيُجَادِلُ الَّذِينَ كَفَرُوا بِالْبَاطِلِ لِيُدْحِضُوا بِهِ الْحَقَّ ۖ وَاتَّخَذُوا آيَاتِي وَمَا أُنذِرُوا هُزُوًا",
    "وَمَنْ أَظْلَمُ مِمَّن ذُكِّرَ بِآيَاتِ رَبِّهِ فَأَعْرَضَ عَنْهَا وَنَسِيَ مَا قَدَّمَتْ يَدَاهُ ۚ إِنَّا جَعَلْنَا عَلَىٰ قُلُوبِهِمْ أَكِنَّةً أَن يَفْقَهُوهُ وَفِي آذَانِهِمْ وَقْرًا ۖ وَإِن تَدْعُهُمْ إِلَى الْهُدَىٰ فَلَن يَهْتَدُوا إِذًا أَبَدًا",
    "وَرَبُّكَ الْغَفُورُ ذُو الرَّحْمَةِ ۖ لَوْ يُؤَاخِذُهُم بِمَا كَسَبُوا لَعَجَّلَ لَهُمُ الْعَذَابَ ۚ بَل لَّهُم مَّوْعِدٌ لَّن يَجِدُوا مِن دُونِهِ مَوْئِلًا",
    "وَتِلْكَ الْقُرَىٰ أَهْلَكْنَاهُمْ لَمَّا ظَلَمُوا وَجَعَلْنَا لِمَهْلِكِهِم مَّوْعِدًا",
    "وَإِذْ قَالَ مُوسَىٰ لِفَتَاهُ لَا أَبْرَحُ حَتَّىٰ أَبْلُغَ مَجْمَعَ الْبَحْرَيْنِ أَوْ أَمْضِيَ حُقُبًا",
    "فَلَمَّا بَلَغَا مَجْمَعَ بَيْنِهِمَا نَسِيَا حُوتَهُمَا فَاتَّخَذَ سَبِيلَهُ فِي الْبَحْرِ سَرَبًا",
    "فَلَمَّا جَاوَزَا قَالَ لِفَتَاهُ آتِنَا غَدَاءَنَا لَقَدْ لَقِينَا مِن سَفَرِنَا هَٰذَا نَصَبًا",
    "قَالَ أَرَأَيْتَ إِذْ أَوَيْنَا إِلَى الصَّخْرَةِ فَإِنِّي نَسِيتُ الْحُوتَ وَمَا أَنسَانِيهُ إِلَّا الشَّيْطَانُ أَنْ أَذْكُرَهُ ۚ وَاتَّخَذَ سَبِيلَهُ فِي الْبَحْرِ عَجَبًا",
    "قَالَ ذَٰلِكَ مَا كُنَّا نَبْغِ ۚ فَارْتَدَّا عَلَىٰ آثَارِهِمَا قَصَصًا",
    "فَوَجَدَا عَبْدًا مِّنْ عِبَادِنَا آتَيْنَاهُ رَحْمَةً مِّنْ عِندِنَا وَعَلَّمْنَاهُ مِن لَّدُنَّا عِلْمًا",
    "قَالَ لَهُ مُوسَىٰ هَلْ أَتَّبِعُكَ عَلَىٰ أَن تُعَلِّمَنِ مِمَّا عُلِّمْتَ رُشْدًا",
    "قَالَ إِنَّكَ لَن تَسْتَطِيعَ مَعِيَ صَبْرًا",
    "وَكَيْفَ تَصْبِرُ عَلَىٰ مَا لَمْ تُحِطْ بِهِ خُبْرًا",
    "قَالَ سَتَجِدُنِي إِن شَاءَ اللَّهُ صَابِرًا وَلَا أَعْصِي لَكَ أَمْرًا",
    "قَالَ فَإِنِ اتَّبَعْتَنِي فَلَا تَسْأَلْنِي عَن شَيْءٍ حَتَّىٰ أُحْدِثَ لَكَ مِنْهُ ذِكْرًا",
    "فَانطَلَقَا حَتَّىٰ إِذَا رَكِبَا فِي السَّفِينَةِ خَرَقَهَا ۖ قَالَ أَخَرَقْتَهَا لِتُغْرِقَ أَهْلَهَا لَقَدْ جِئْتَ شَيْئًا إِمْرًا",
    "قَالَ أَلَمْ أَقُلْ إِنَّكَ لَن تَسْتَطِيعَ مَعِيَ صَبْرًا",
    "قَالَ لَا تُؤَاخِذْنِي بِمَا نَسِيتُ وَلَا تُرْهِقْنِي مِنْ أَمْرِي عُسْرًا",
    "فَانطَلَقَا حَتَّىٰ إِذَا لَقِيَا غُلَامًا فَقَتَلَهُ قَالَ أَقَتَلْتَ نَفْسًا زَكِيَّةً بِغَيْرِ نَفْسٍ لَّقَدْ جِئْتَ شَيْئًا نُّكْرًا",
    "قَالَ أَلَمْ أَقُل لَّكَ إِنَّكَ لَن تَسْتَطِيعَ مَعِيَ صَبْرًا",
    "قَالَ إِن سَأَلْتُكَ عَن شَيْءٍ بَعْدَهَا فَلَا تُصَاحِبْنِي ۖ قَدْ بَلَغْتَ مِن لَّدُنِّي عُذْرًا",
    "فَانطَلَقَا حَتَّىٰ إِذَا أَتَيَا أَهْلَ قَرْيَةٍ اسْتَطْعَمَا أَهْلَهَا فَأَبَوْا أَن يُضَيِّفُوهُمَا فَوَجَدَا فِيهَا جِدَارًا يُرِيدُ أَن يَنقَضَّ فَأَقَامَهُ ۖ قَالَ لَوْ شِئْتَ لَاتَّخَذْتَ عَلَيْهِ أَجْرًا",
    "قَالَ هَٰذَا فِرَاقُ بَيْنِي وَبَيْنِكَ ۚ سَأُنَبِّئُكَ بِتَأْوِيلِ مَا لَمْ تَسْتَطِع عَّلَيْهِ صَبْرًا",
    "أَمَّا السَّفِينَةُ فَكَانَتْ لِمَسَاكِينَ يَعْمَلُونَ فِي الْبَحْرِ فَأَرَدتُّ أَنْ أَعِيبَهَا وَكَانَ وَرَاءَهُم مَّلِكٌ يَأْخُذُ كُلَّ سَفِينَةٍ غَصْبًا",
    "وَأَمَّا الْغُلَامُ فَكَانَ أَبَوَاهُ مُؤْمِنَيْنِ فَخَشِينَا أَن يُرْهِقَهُمَا طُغْيَانًا وَكُفْرًا",
    "فَأَرَدْنَا أَن يُبْدِلَهُمَا رَبُّهُمَا خَيْرًا مِّنْهُ زَكَاةً وَأَقْرَبَ رُحْمًا",
    "وَأَمَّا الْجِدَارُ فَكَانَ لِغُلَامَيْنِ يَتِيمَيْنِ فِي الْمَدِينَةِ وَكَانَ تَحْتَهُ كَنزٌ لَّهُمَا وَكَانَ أَبُوهُمَا صَالِحًا فَأَرَادَ رَبُّكَ أَن يَبْلُغَا أَشُدَّهُمَا وَيَسْتَخْرِجَا كَنزَهُمَا رَحْمَةً مِّن رَّبِّكَ ۚ وَمَا فَعَلْتُهُ عَنْ أَمْرِي ۚ ذَٰلِكَ تَأْوِيلُ مَا لَمْ تَسْطِع عَّلَيْهِ صَبْرًا",
    "وَيَسْأَلُونَكَ عَن ذِي الْقَرْنَيْنِ ۖ قُلْ سَأَتْلُو عَلَيْكُم مِّنْهُ ذِكْرًا",
    "إِنَّا مَكَّنَّا لَهُ فِي الْأَرْضِ وَآتَيْنَاهُ مِن كُلِّ شَيْءٍ سَبَبًا",
    "فَأَتْبَعَ سَبَبًا",
    "حَتَّىٰ إِذَا بَلَغَ مَغْرِبَ الشَّمْسِ وَجَدَهَا تَغْرُبُ فِي عَيْنٍ حَمِئَةٍ وَوَجَدَ عِندَهَا قَوْمًا ۗ قُلْنَا يَا ذَا الْقَرْنَيْنِ إِمَّا أَن تُعَذِّبَ وَإِمَّا أَن تَتَّخِذَ فِيهِمْ حُسْنًا",
    "قَالَ أَمَّا مَن ظَلَمَ فَسَوْفَ نُعَذِّبُهُ ثُمَّ يُرَدُّ إِلَىٰ رَبِّهِ فَيُعَذِّبُهُ عَذَابًا نُّكْرًا",
    "وَأَمَّا مَنْ آمَنَ وَعَمِلَ صَالِحًا فَلَهُ جَزَاءً الْحُسْنَىٰ ۖ وَسَنَقُولُ لَهُ مِنْ أَمْرِنَا يُسْرًا",
    "ثُمَّ أَتْبَعَ سَبَبًا",
    "حَتَّىٰ إِذَا بَلَغَ مَطْلِعَ الشَّمْسِ وَجَدَهَا تَطْلُعُ عَلَىٰ قَوْمٍ لَّمْ نَجْعَل لَّهُم مِّن دُونِهَا سِتْرًا",
    "كَذَٰلِكَ وَقَدْ أَحَطْنَا بِمَا لَدَيْهِ خُبْرًا",
    "ثُمَّ أَتْبَعَ سَبَبًا",
    "حَتَّىٰ إِذَا بَلَغَ بَيْنَ السَّدَّيْنِ وَجَدَ مِن دُونِهِمَا قَوْمًا لَّا يَكَادُونَ يَفْقَهُونَ قَوْلًا",
    "قَالُوا يَا ذَا الْقَرْنَيْنِ إِنَّ يَأْجُوجَ وَمَأْجُوجَ مُفْسِدُونَ فِي الْأَرْضِ فَهَلْ نَجْعَلُ لَكَ خَرْجًا عَلَىٰ أَن تَجْعَلَ بَيْنَنَا وَبَيْنَهُمْ سَدًّا",
    "قَالَ مَا مَكَّنِّي فِيهِ رَبِّي خَيْرٌ فَأَعِينُونِي بِقُوَّةٍ أَجْعَلْ بَيْنَكُمْ وَبَيْنَهُمْ رَدْمًا",
    "آتُونِي زُبَرَ الْحَدِيدِ ۖ حَتَّىٰ إِذَا سَاوَىٰ بَيْنَ الصَّدَفَيْنِ قَالَ انفُخُوا ۖ حَتَّىٰ إِذَا جَعَلَهُ نَارًا قَالَ آتُونِي أُفْرِغْ عَلَيْهِ قِطْرًا",
    "فَمَا اسْطَاعُوا أَن يَظْهَرُوهُ وَمَا اسْتَطَاعُوا لَهُ نَقْبًا",
    "قَالَ هَٰذَا رَحْمَةٌ مِّن رَّبِّي ۖ فَإِذَا جَاءَ وَعْدُ رَبِّي جَعَلَهُ دَكَّاءَ ۖ وَكَانَ وَعْدُ رَبِّي حَقًّا",
    "وَتَرَكْنَا بَعْضَهُمْ يَوْمَئِذٍ يَمُوجُ فِي بَعْضٍ ۖ وَنُفِخَ فِي الصُّورِ فَجَمَعْنَاهُمْ جَمْعًا",
    "وَعَرَضْنَا جَهَنَّمَ يَوْمَئِذٍ لِّلْكَافِرِينَ عَرْضًا",
    "الَّذِينَ كَانَتْ أَعْيُنُهُمْ فِي غِطَاءٍ عَن ذِكْرِي وَكَانُوا لَا يَسْتَطِيعُونَ سَمْعًا",
    "أَفَحَسِبَ الَّذِينَ كَفَرُوا أَن يَتَّخِذُوا عِبَادِي مِن دُونِي أَوْلِيَاءَ ۚ إِنَّا أَعْتَدْنَا جَهَنَّمَ لِلْكَافِرِينَ نُزُلًا",
    "قُلْ هَلْ نُنَبِّئُكُم بِالْأَخْسَرِينَ أَعْمَالًا",
    "الَّذِينَ ضَلَّ سَعْيُهُمْ فِي الْحَيَاةِ الدُّنْيَا وَهُمْ يَحْسَبُونَ أَنَّهُمْ يُحْسِنُونَ صُنْعًا",
    "أُولَٰئِكَ الَّذِينَ كَفَرُوا بِآيَاتِ رَبِّهِمْ وَلِقَائِهِ فَحَبِطَتْ أَعْمَالُهُمْ فَلَا نُقِيمُ لَهُمْ يَوْمَ الْقِيَامَةِ وَزْنًا",
    "ذَٰلِكَ جَزَاؤُهُمْ جَهَنَّمُ بِمَا كَفَرُوا وَاتَّخَذُوا آيَاتِي وَرُسُلِي هُزُوًا",
    "إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ كَانَتْ لَهُمْ جَنَّاتُ الْفِرْدَوْسِ نُزُلًا",
    "خَالِدِينَ فِيهَا لَا يَبْغُونَ عَنْهَا حِوَلًا",
    "قُل لَّوْ كَانَ الْبَحْرُ مِدَادًا لِّكَلِمَاتِ رَبِّي لَنَفِدَ الْبَحْرُ قَبْلَ أَن تَنفَدَ كَلِمَاتُ رَبِّي وَلَوْ جِئْنَا بِمِثْلِهِ مَدَدًا",
    "قُلْ إِنَّمَا أَنَا بَشَرٌ مِّثْلُكُمْ يُوحَىٰ إِلَيَّ أَنَّمَا إِلَٰهُكُمْ إِلَٰهٌ وَاحِدٌ ۖ فَمَن كَانَ يَرْجُو لِقَاءَ رَبِّهِ فَلْيَعْمَلْ عَمَلًا صَالِحًا وَلَا يُشْرِكْ بِعِبَادَةِ رَبِّهِ أَحَدًا",
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
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"[All] praise is [due] to Allah, who has sent down upon His Servant the Book and has not made therein any deviance.",
    "[He has made it] straight, to warn of severe punishment from Him and to give good tidings to the believers who do righteous deeds that they will have a good reward",
    "In which they will remain forever",
    "And to warn those who say, \"Allah has taken a son.\"",
    "They have no knowledge of it, nor had their fathers. Grave is the word that comes out of their mouths; they speak not except a lie.",
    "Then perhaps you would kill yourself through grief over them, [O Muhammad], if they do not believe in this message, [and] out of sorrow.",
    "Indeed, We have made that which is on the earth adornment for it that We may test them [as to] which of them is best in deed.",
    "And indeed, We will make that which is upon it [into] a barren ground.",
    "Or have you thought that the companions of the cave and the inscription were, among Our signs, a wonder?",
    "[Mention] when the youths retreated to the cave and said, \"Our Lord, grant us from Yourself mercy and prepare for us from our affair right guidance.\"",
    "So We cast [a cover of sleep] over their ears within the cave for a number of years.",
    "Then We awakened them that We might show which of the two factions was most precise in calculating what [extent] they had remained in time.",
    "It is We who relate to you, [O Muhammad], their story in truth. Indeed, they were youths who believed in their Lord, and We increased them in guidance.",
    "And We made firm their hearts when they stood up and said, \"Our Lord is the Lord of the heavens and the earth. Never will we invoke besides Him any deity. We would have certainly spoken, then, an excessive transgression.",
    "These, our people, have taken besides Him deities. Why do they not bring for [worship of] them a clear authority? And who is more unjust than one who invents about Allah a lie?\"",
    "[The youths said to one another], \"And when you have withdrawn from them and that which they worship other than Allah, retreat to the cave. Your Lord will spread out for you of His mercy and will prepare for you from your affair facility.\"",
    "And [had you been present], you would see the sun when it rose, inclining away from their cave on the right, and when it set, passing away from them on the left, while they were [laying] within an open space thereof. That was from the signs of Allah. He whom Allah guides is the [rightly] guided, but he whom He leaves astray - never will you find for him a protecting guide.",
    "And you would think them awake, while they were asleep. And We turned them to the right and to the left, while their dog stretched his forelegs at the entrance. If you had looked at them, you would have turned from them in flight and been filled by them with terror.",
    "And similarly, We awakened them that they might question one another. Said a speaker from among them, \"How long have you remained [here]?\" They said, \"We have remained a day or part of a day.\" They said, \"Your Lord is most knowing of how long you remained. So send one of you with this silver coin of yours to the city and let him look to which is the best of food and bring you provision from it and let him be cautious. And let no one be aware of you.",
    "Indeed, if they come to know of you, they will stone you or return you to their religion. And never would you succeed, then - ever.\"",
    "And similarly, We caused them to be found that they [who found them] would know that the promise of Allah is truth and that of the Hour there is no doubt. [That was] when they disputed among themselves about their affair and [then] said, \"Construct over them a structure. Their Lord is most knowing about them.\" Said those who prevailed in the matter, \"We will surely take [for ourselves] over them a masjid.\"",
    "They will say there were three, the fourth of them being their dog; and they will say there were five, the sixth of them being their dog - guessing at the unseen; and they will say there were seven, and the eighth of them was their dog. Say, [O Muhammad], \"My Lord is most knowing of their number. None knows them except a few. So do not argue about them except with an obvious argument and do not inquire about them among [the speculators] from anyone.\"",
    "And never say of anything, \"Indeed, I will do that tomorrow,\"",
    "Except [when adding], \"If Allah wills.\" And remember your Lord when you forget [it] and say, \"Perhaps my Lord will guide me to what is nearer than this to right conduct.\"",
    "And they remained in their cave for three hundred years and exceeded by nine.",
    "Say, \"Allah is most knowing of how long they remained. He has [knowledge of] the unseen [aspects] of the heavens and the earth. How Seeing is He and how Hearing! They have not besides Him any protector, and He shares not His legislation with anyone.\"",
    "And recite, [O Muhammad], what has been revealed to you of the Book of your Lord. There is no changer of His words, and never will you find in other than Him a refuge.",
    "And keep yourself patient [by being] with those who call upon their Lord in the morning and the evening, seeking His countenance. And let not your eyes pass beyond them, desiring adornments of the worldly life, and do not obey one whose heart We have made heedless of Our remembrance and who follows his desire and whose affair is ever [in] neglect.",
    "And say, \"The truth is from your Lord, so whoever wills - let him believe; and whoever wills - let him disbelieve.\" Indeed, We have prepared for the wrongdoers a fire whose walls will surround them. And if they call for relief, they will be relieved with water like murky oil, which scalds [their] faces. Wretched is the drink, and evil is the resting place.",
    "Indeed, those who have believed and done righteous deeds - indeed, We will not allow to be lost the reward of any who did well in deeds.",
    "Those will have gardens of perpetual residence; beneath them rivers will flow. They will be adorned therein with bracelets of gold and will wear green garments of fine silk and brocade, reclining therein on adorned couches. Excellent is the reward, and good is the resting place.",
    "And present to them an example of two men: We granted to one of them two gardens of grapevines, and We bordered them with palm trees and placed between them [fields of] crops.",
    "Each of the two gardens produced its fruit and did not fall short thereof in anything. And We caused to gush forth within them a river.",
    "And he had fruit, so he said to his companion while he was conversing with him, \"I am greater than you in wealth and mightier in [numbers of] men.\"",
    "And he entered his garden while he was unjust to himself. He said, \"I do not think that this will perish - ever.",
    "And I do not think the Hour will occur. And even if I should be brought back to my Lord, I will surely find better than this as a return.\"",
    "His companion said to him while he was conversing with him, \"Have you disbelieved in He who created you from dust and then from a sperm-drop and then proportioned you [as] a man?",
    "But as for me, He is Allah, my Lord, and I do not associate with my Lord anyone.",
    "And why did you, when you entered your garden, not say, 'What Allah willed [has occurred]; there is no power except in Allah'? Although you see me less than you in wealth and children,",
    "It may be that my Lord will give me [something] better than your garden and will send upon it a calamity from the sky, and it will become a smooth, dusty ground,",
    "Or its water will become sunken [into the earth], so you would never be able to seek it.\"",
    "And his fruits were encompassed [by ruin], so he began to turn his hands about [in dismay] over what he had spent on it, while it had collapsed upon its trellises, and said, \"Oh, I wish I had not associated with my Lord anyone.\"",
    "And there was for him no company to aid him other than Allah, nor could he defend himself.",
    "There the authority is [completely] for Allah, the Truth. He is best in reward and best in outcome.",
    "And present to them the example of the life of this world, [its being] like rain which We send down from the sky, and the vegetation of the earth mingles with it and [then] it becomes dry remnants, scattered by the winds. And Allah is ever, over all things, Perfect in Ability.",
    "Wealth and children are [but] adornment of the worldly life. But the enduring good deeds are better to your Lord for reward and better for [one's] hope.",
    "And [warn of] the Day when We will remove the mountains and you will see the earth prominent, and We will gather them and not leave behind from them anyone.",
    "And they will be presented before your Lord in rows, [and He will say], \"You have certainly come to Us just as We created you the first time. But you claimed that We would never make for you an appointment.\"",
    "And the record [of deeds] will be placed [open], and you will see the criminals fearful of that within it, and they will say, \"Oh, woe to us! What is this book that leaves nothing small or great except that it has enumerated it?\" And they will find what they did present [before them]. And your Lord does injustice to no one.",
    "And [mention] when We said to the angels, \"Prostrate to Adam,\" and they prostrated, except for Iblees. He was of the jinn and departed from the command of his Lord. Then will you take him and his descendants as allies other than Me while they are enemies to you? Wretched it is for the wrongdoers as an exchange.",
    "I did not make them witness to the creation of the heavens and the earth or to the creation of themselves, and I would not have taken the misguiders as assistants.",
    "And [warn of] the Day when He will say, \"Call 'My partners' whom you claimed,\" and they will invoke them, but they will not respond to them. And We will put between them [a valley of] destruction.",
    "And the criminals will see the Fire and will be certain that they are to fall therein. And they will not find from it a way elsewhere.",
    "And We have certainly diversified in this Qur'an for the people from every [kind of] example; but man has ever been, most of anything, [prone to] dispute.",
    "And nothing has prevented the people from believing when guidance came to them and from asking forgiveness of their Lord except that there [must] befall them the [accustomed] precedent of the former peoples or that the punishment should come [directly] before them.",
    "And We send not the messengers except as bringers of good tidings and warners. And those who disbelieve dispute by [using] falsehood to [attempt to] invalidate thereby the truth and have taken My verses, and that of which they are warned, in ridicule.",
    "And who is more unjust than one who is reminded of the verses of his Lord but turns away from them and forgets what his hands have put forth? Indeed, We have placed over their hearts coverings, lest they understand it, and in their ears deafness. And if you invite them to guidance - they will never be guided, then - ever.",
    "And your Lord is the Forgiving, full of mercy. If He were to impose blame upon them for what they earned, He would have hastened for them the punishment. Rather, for them is an appointment from which they will never find an escape.",
    "And those cities - We destroyed them when they wronged, and We made for their destruction an appointed time.",
    "And [mention] when Moses said to his servant, \"I will not cease [traveling] until I reach the junction of the two seas or continue for a long period.\"",
    "But when they reached the junction between them, they forgot their fish, and it took its course into the sea, slipping away.",
    "So when they had passed beyond it, [Moses] said to his boy, \"Bring us our morning meal. We have certainly suffered in this, our journey, [much] fatigue.\"",
    "He said, \"Did you see when we retired to the rock? Indeed, I forgot [there] the fish. And none made me forget it except Satan - that I should mention it. And it took its course into the sea amazingly\".",
    "[Moses] said, \"That is what we were seeking.\" So they returned, following their footprints.",
    "And they found a servant from among Our servants to whom we had given mercy from us and had taught him from Us a [certain] knowledge.",
    "Moses said to him, \"May I follow you on [the condition] that you teach me from what you have been taught of sound judgement?\"",
    "He said, \"Indeed, with me you will never be able to have patience.",
    "And how can you have patience for what you do not encompass in knowledge?\"",
    "[Moses] said, \"You will find me, if Allah wills, patient, and I will not disobey you in [any] order.\"",
    "He said, \"Then if you follow me, do not ask me about anything until I make to you about it mention.\"",
    "So they set out, until when they had embarked on the ship, al-Khidh r tore it open. [Moses] said, \"Have you torn it open to drown its people? You have certainly done a grave thing.\"",
    "[Al-Khidh r] said, \"Did I not say that with me you would never be able to have patience?\"",
    "[Moses] said, \"Do not blame me for what I forgot and do not cover me in my matter with difficulty.\"",
    "So they set out, until when they met a boy, al-Khidh r killed him. [Moses] said, \"Have you killed a pure soul for other than [having killed] a soul? You have certainly done a deplorable thing.\"",
    "[Al-Khidh r] said, \"Did I not tell you that with me you would never be able to have patience?\"",
    "[Moses] said, \"If I should ask you about anything after this, then do not keep me as a companion. You have obtained from me an excuse.\"",
    "So they set out, until when they came to the people of a town, they asked its people for food, but they refused to offer them hospitality. And they found therein a wall about to collapse, so al-Khidh r restored it. [Moses] said, \"If you wished, you could have taken for it a payment.\"",
    "[Al-Khidh r] said, \"This is parting between me and you. I will inform you of the interpretation of that about which you could not have patience.",
    "As for the ship, it belonged to poor people working at sea. So I intended to cause defect in it as there was after them a king who seized every [good] ship by force.",
    "And as for the boy, his parents were believers, and we feared that he would overburden them by transgression and disbelief.",
    "So we intended that their Lord should substitute for them one better than him in purity and nearer to mercy.",
    "And as for the wall, it belonged to two orphan boys in the city, and there was beneath it a treasure for them, and their father had been righteous. So your Lord intended that they reach maturity and extract their treasure, as a mercy from your Lord. And I did it not of my own accord. That is the interpretation of that about which you could not have patience.\"",
    "And they ask you, [O Muhammad], about Dhul-Qarnayn. Say, \"I will recite to you about him a report.\"",
    "Indeed We established him upon the earth, and We gave him to everything a way.",
    "So he followed a way",
    "Until, when he reached the setting of the sun, he found it [as if] setting in a spring of dark mud, and he found near it a people. Allah said, \"O Dhul-Qarnayn, either you punish [them] or else adopt among them [a way of] goodness.\"",
    "He said, \"As for one who wrongs, we will punish him. Then he will be returned to his Lord, and He will punish him with a terrible punishment.",
    "But as for one who believes and does righteousness, he will have a reward of Paradise, and we will speak to him from our command with ease.\"",
    "Then he followed a way",
    "Until, when he came to the rising of the sun, he found it rising on a people for whom We had not made against it any shield.",
    "Thus. And We had encompassed [all] that he had in knowledge.",
    "Then he followed a way",
    "Until, when he reached [a pass] between two mountains, he found beside them a people who could hardly understand [his] speech.",
    "They said, \"O Dhul-Qarnayn, indeed Gog and Magog are [great] corrupters in the land. So may we assign for you an expenditure that you might make between us and them a barrier?\"",
    "He said, \"That in which my Lord has established me is better [than what you offer], but assist me with strength; I will make between you and them a dam.",
    "Bring me sheets of iron\" - until, when he had leveled [them] between the two mountain walls, he said, \"Blow [with bellows],\" until when he had made it [like] fire, he said, \"Bring me, that I may pour over it molten copper.\"",
    "So Gog and Magog were unable to pass over it, nor were they able [to effect] in it any penetration.",
    "[Dhul-Qarnayn] said, \"This is a mercy from my Lord; but when the promise of my Lord comes, He will make it level, and ever is the promise of my Lord true.\"",
    "And We will leave them that day surging over each other, and [then] the Horn will be blown, and We will assemble them in [one] assembly.",
    "And We will present Hell that Day to the Disbelievers, on display -",
    "Those whose eyes had been within a cover [removed] from My remembrance, and they were not able to hear.",
    "Then do those who disbelieve think that they can take My servants instead of Me as allies? Indeed, We have prepared Hell for the disbelievers as a lodging.",
    "Say, [O Muhammad], \"Shall we [believers] inform you of the greatest losers as to [their] deeds?",
    "[They are] those whose effort is lost in worldly life, while they think that they are doing well in work.\"",
    "Those are the ones who disbelieve in the verses of their Lord and in [their] meeting Him, so their deeds have become worthless; and We will not assign to them on the Day of Resurrection any importance.",
    "That is their recompense - Hell - for what they denied and [because] they took My signs and My messengers in ridicule.",
    "Indeed, those who have believed and done righteous deeds - they will have the Gardens of Paradise as a lodging,",
    "Wherein they abide eternally. They will not desire from it any transfer.",
    "Say, \"If the sea were ink for [writing] the words of my Lord, the sea would be exhausted before the words of my Lord were exhausted, even if We brought the like of it as a supplement.\"",
    "Say, \"I am only a man like you, to whom has been revealed that your god is one God. So whoever would hope for the meeting with his Lord - let him do righteous work and not associate in the worship of his Lord anyone.\"",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__kahf);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_kahf);
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
