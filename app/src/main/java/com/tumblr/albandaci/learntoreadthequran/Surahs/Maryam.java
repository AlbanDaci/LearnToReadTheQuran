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

public class Maryam extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"19:1", "19:2", "19:3", "19:4", "19:5", "19:6", "19:7", "19:8", "19:9", "19:10", "19:11", "19:12", "19:13", "19:14", "19:15", "19:16",
            "19:17", "19:18", "19:19", "19:20", "19:21", "19:22", "19:23", "19:24", "19:25", "19:26", "19:27", "19:28", "19:29", "19:30", "19:31", "19:32",
            "19:33", "19:34", "19:35", "19:36", "19:37", "19:38", "19:39", "19:40", "19:41", "19:42", "19:43", "19:44", "19:45", "19:46", "19:47", "19:48",
            "19:49", "19:50", "19:51", "19:52", "19:53", "19:54", "19:55", "19:56", "19:57", "19:58", "19:59", "19:60", "19:61", "19:62", "19:63", "19:64",
            "19:65", "19:66", "19:67", "19:68", "19:69", "19:70", "19:71", "19:72", "19:73", "19:74", "19:75", "19:76", "19:77", "19:78", "19:79", "19:80",
            "19:81", "19:82", "19:83", "19:84", "19:85", "19:86", "19:87", "19:88", "19:89", "19:90", "19:91", "19:92", "19:93", "19:94", "19:95", "19:96",
            "19:97", "19:98", ""};

    String [] arabic_verses = {"كهيعص",
    "ذِكْرُ رَحْمَتِ رَبِّكَ عَبْدَهُ زَكَرِيَّا",
    "إِذْ نَادَىٰ رَبَّهُ نِدَاءً خَفِيًّا",
    "قَالَ رَبِّ إِنِّي وَهَنَ الْعَظْمُ مِنِّي وَاشْتَعَلَ الرَّأْسُ شَيْبًا وَلَمْ أَكُن بِدُعَائِكَ رَبِّ شَقِيًّا",
    "وَإِنِّي خِفْتُ الْمَوَالِيَ مِن وَرَائِي وَكَانَتِ امْرَأَتِي عَاقِرًا فَهَبْ لِي مِن لَّدُنكَ وَلِيًّا",
    "يَرِثُنِي وَيَرِثُ مِنْ آلِ يَعْقُوبَ ۖ وَاجْعَلْهُ رَبِّ رَضِيًّا",
    "يَا زَكَرِيَّا إِنَّا نُبَشِّرُكَ بِغُلَامٍ اسْمُهُ يَحْيَىٰ لَمْ نَجْعَل لَّهُ مِن قَبْلُ سَمِيًّا",
    "قَالَ رَبِّ أَنَّىٰ يَكُونُ لِي غُلَامٌ وَكَانَتِ امْرَأَتِي عَاقِرًا وَقَدْ بَلَغْتُ مِنَ الْكِبَرِ عِتِيًّا",
    "قَالَ كَذَٰلِكَ قَالَ رَبُّكَ هُوَ عَلَيَّ هَيِّنٌ وَقَدْ خَلَقْتُكَ مِن قَبْلُ وَلَمْ تَكُ شَيْئًا",
    "قَالَ رَبِّ اجْعَل لِّي آيَةً ۚ قَالَ آيَتُكَ أَلَّا تُكَلِّمَ النَّاسَ ثَلَاثَ لَيَالٍ سَوِيًّا",
    "فَخَرَجَ عَلَىٰ قَوْمِهِ مِنَ الْمِحْرَابِ فَأَوْحَىٰ إِلَيْهِمْ أَن سَبِّحُوا بُكْرَةً وَعَشِيًّا",
    "يَا يَحْيَىٰ خُذِ الْكِتَابَ بِقُوَّةٍ ۖ وَآتَيْنَاهُ الْحُكْمَ صَبِيًّا",
    "وَحَنَانًا مِّن لَّدُنَّا وَزَكَاةً ۖ وَكَانَ تَقِيًّا",
    "وَبَرًّا بِوَالِدَيْهِ وَلَمْ يَكُن جَبَّارًا عَصِيًّا",
    "وَسَلَامٌ عَلَيْهِ يَوْمَ وُلِدَ وَيَوْمَ يَمُوتُ وَيَوْمَ يُبْعَثُ حَيًّا",
    "وَاذْكُرْ فِي الْكِتَابِ مَرْيَمَ إِذِ انتَبَذَتْ مِنْ أَهْلِهَا مَكَانًا شَرْقِيًّا",
    "فَاتَّخَذَتْ مِن دُونِهِمْ حِجَابًا فَأَرْسَلْنَا إِلَيْهَا رُوحَنَا فَتَمَثَّلَ لَهَا بَشَرًا سَوِيًّا",
    "قَالَتْ إِنِّي أَعُوذُ بِالرَّحْمَٰنِ مِنكَ إِن كُنتَ تَقِيًّا",
    "قَالَ إِنَّمَا أَنَا رَسُولُ رَبِّكِ لِأَهَبَ لَكِ غُلَامًا زَكِيًّا",
    "قَالَتْ أَنَّىٰ يَكُونُ لِي غُلَامٌ وَلَمْ يَمْسَسْنِي بَشَرٌ وَلَمْ أَكُ بَغِيًّا",
    "قَالَ كَذَٰلِكِ قَالَ رَبُّكِ هُوَ عَلَيَّ هَيِّنٌ ۖ وَلِنَجْعَلَهُ آيَةً لِّلنَّاسِ وَرَحْمَةً مِّنَّا ۚ وَكَانَ أَمْرًا مَّقْضِيًّا",
    "فَحَمَلَتْهُ فَانتَبَذَتْ بِهِ مَكَانًا قَصِيًّا",
    "فَأَجَاءَهَا الْمَخَاضُ إِلَىٰ جِذْعِ النَّخْلَةِ قَالَتْ يَا لَيْتَنِي مِتُّ قَبْلَ هَٰذَا وَكُنتُ نَسْيًا مَّنسِيًّا",
    "فَنَادَاهَا مِن تَحْتِهَا أَلَّا تَحْزَنِي قَدْ جَعَلَ رَبُّكِ تَحْتَكِ سَرِيًّا",
    "وَهُزِّي إِلَيْكِ بِجِذْعِ النَّخْلَةِ تُسَاقِطْ عَلَيْكِ رُطَبًا جَنِيًّا",
    "فَكُلِي وَاشْرَبِي وَقَرِّي عَيْنًا ۖ فَإِمَّا تَرَيِنَّ مِنَ الْبَشَرِ أَحَدًا فَقُولِي إِنِّي نَذَرْتُ لِلرَّحْمَٰنِ صَوْمًا فَلَنْ أُكَلِّمَ الْيَوْمَ إِنسِيًّا",
    "فَأَتَتْ بِهِ قَوْمَهَا تَحْمِلُهُ ۖ قَالُوا يَا مَرْيَمُ لَقَدْ جِئْتِ شَيْئًا فَرِيًّا",
    "يَا أُخْتَ هَارُونَ مَا كَانَ أَبُوكِ امْرَأَ سَوْءٍ وَمَا كَانَتْ أُمُّكِ بَغِيًّا",
    "فَأَشَارَتْ إِلَيْهِ ۖ قَالُوا كَيْفَ نُكَلِّمُ مَن كَانَ فِي الْمَهْدِ صَبِيًّا",
    "قَالَ إِنِّي عَبْدُ اللَّهِ آتَانِيَ الْكِتَابَ وَجَعَلَنِي نَبِيًّا",
    "وَجَعَلَنِي مُبَارَكًا أَيْنَ مَا كُنتُ وَأَوْصَانِي بِالصَّلَاةِ وَالزَّكَاةِ مَا دُمْتُ حَيًّا",
    "وَبَرًّا بِوَالِدَتِي وَلَمْ يَجْعَلْنِي جَبَّارًا شَقِيًّا",
    "وَالسَّلَامُ عَلَيَّ يَوْمَ وُلِدتُّ وَيَوْمَ أَمُوتُ وَيَوْمَ أُبْعَثُ حَيًّا",
    "ذَٰلِكَ عِيسَى ابْنُ مَرْيَمَ ۚ قَوْلَ الْحَقِّ الَّذِي فِيهِ يَمْتَرُونَ",
    "مَا كَانَ لِلَّهِ أَن يَتَّخِذَ مِن وَلَدٍ ۖ سُبْحَانَهُ ۚ إِذَا قَضَىٰ أَمْرًا فَإِنَّمَا يَقُولُ لَهُ كُن فَيَكُونُ",
    "وَإِنَّ اللَّهَ رَبِّي وَرَبُّكُمْ فَاعْبُدُوهُ ۚ هَٰذَا صِرَاطٌ مُّسْتَقِيمٌ",
    "فَاخْتَلَفَ الْأَحْزَابُ مِن بَيْنِهِمْ ۖ فَوَيْلٌ لِّلَّذِينَ كَفَرُوا مِن مَّشْهَدِ يَوْمٍ عَظِيمٍ",
    "أَسْمِعْ بِهِمْ وَأَبْصِرْ يَوْمَ يَأْتُونَنَا ۖ لَٰكِنِ الظَّالِمُونَ الْيَوْمَ فِي ضَلَالٍ مُّبِينٍ",
    "وَأَنذِرْهُمْ يَوْمَ الْحَسْرَةِ إِذْ قُضِيَ الْأَمْرُ وَهُمْ فِي غَفْلَةٍ وَهُمْ لَا يُؤْمِنُونَ",
    "إِنَّا نَحْنُ نَرِثُ الْأَرْضَ وَمَنْ عَلَيْهَا وَإِلَيْنَا يُرْجَعُونَ",
    "وَاذْكُرْ فِي الْكِتَابِ إِبْرَاهِيمَ ۚ إِنَّهُ كَانَ صِدِّيقًا نَّبِيًّا",
    "إِذْ قَالَ لِأَبِيهِ يَا أَبَتِ لِمَ تَعْبُدُ مَا لَا يَسْمَعُ وَلَا يُبْصِرُ وَلَا يُغْنِي عَنكَ شَيْئًا",
    "يَا أَبَتِ إِنِّي قَدْ جَاءَنِي مِنَ الْعِلْمِ مَا لَمْ يَأْتِكَ فَاتَّبِعْنِي أَهْدِكَ صِرَاطًا سَوِيًّا",
    "يَا أَبَتِ لَا تَعْبُدِ الشَّيْطَانَ ۖ إِنَّ الشَّيْطَانَ كَانَ لِلرَّحْمَٰنِ عَصِيًّا",
    "يَا أَبَتِ إِنِّي أَخَافُ أَن يَمَسَّكَ عَذَابٌ مِّنَ الرَّحْمَٰنِ فَتَكُونَ لِلشَّيْطَانِ وَلِيًّا",
    "قَالَ أَرَاغِبٌ أَنتَ عَنْ آلِهَتِي يَا إِبْرَاهِيمُ ۖ لَئِن لَّمْ تَنتَهِ لَأَرْجُمَنَّكَ ۖ وَاهْجُرْنِي مَلِيًّا",
    "قَالَ سَلَامٌ عَلَيْكَ ۖ سَأَسْتَغْفِرُ لَكَ رَبِّي ۖ إِنَّهُ كَانَ بِي حَفِيًّا",
    "وَأَعْتَزِلُكُمْ وَمَا تَدْعُونَ مِن دُونِ اللَّهِ وَأَدْعُو رَبِّي عَسَىٰ أَلَّا أَكُونَ بِدُعَاءِ رَبِّي شَقِيًّا",
    "فَلَمَّا اعْتَزَلَهُمْ وَمَا يَعْبُدُونَ مِن دُونِ اللَّهِ وَهَبْنَا لَهُ إِسْحَاقَ وَيَعْقُوبَ ۖ وَكُلًّا جَعَلْنَا نَبِيًّا",
    "وَوَهَبْنَا لَهُم مِّن رَّحْمَتِنَا وَجَعَلْنَا لَهُمْ لِسَانَ صِدْقٍ عَلِيًّا",
    "وَاذْكُرْ فِي الْكِتَابِ مُوسَىٰ ۚ إِنَّهُ كَانَ مُخْلَصًا وَكَانَ رَسُولًا نَّبِيًّا",
    "وَنَادَيْنَاهُ مِن جَانِبِ الطُّورِ الْأَيْمَنِ وَقَرَّبْنَاهُ نَجِيًّا",
    "وَوَهَبْنَا لَهُ مِن رَّحْمَتِنَا أَخَاهُ هَارُونَ نَبِيًّا",
    "وَاذْكُرْ فِي الْكِتَابِ إِسْمَاعِيلَ ۚ إِنَّهُ كَانَ صَادِقَ الْوَعْدِ وَكَانَ رَسُولًا نَّبِيًّا",
    "وَكَانَ يَأْمُرُ أَهْلَهُ بِالصَّلَاةِ وَالزَّكَاةِ وَكَانَ عِندَ رَبِّهِ مَرْضِيًّا",
    "وَاذْكُرْ فِي الْكِتَابِ إِدْرِيسَ ۚ إِنَّهُ كَانَ صِدِّيقًا نَّبِيًّا",
    "وَرَفَعْنَاهُ مَكَانًا عَلِيًّا",
    "أُولَٰئِكَ الَّذِينَ أَنْعَمَ اللَّهُ عَلَيْهِم مِّنَ النَّبِيِّينَ مِن ذُرِّيَّةِ آدَمَ وَمِمَّنْ حَمَلْنَا مَعَ نُوحٍ وَمِن ذُرِّيَّةِ إِبْرَاهِيمَ وَإِسْرَائِيلَ وَمِمَّنْ هَدَيْنَا وَاجْتَبَيْنَا ۚ إِذَا تُتْلَىٰ عَلَيْهِمْ آيَاتُ الرَّحْمَٰنِ خَرُّوا سُجَّدًا وَبُكِيًّا ۩",
    "فَخَلَفَ مِن بَعْدِهِمْ خَلْفٌ أَضَاعُوا الصَّلَاةَ وَاتَّبَعُوا الشَّهَوَاتِ ۖ فَسَوْفَ يَلْقَوْنَ غَيًّا",
    "إِلَّا مَن تَابَ وَآمَنَ وَعَمِلَ صَالِحًا فَأُولَٰئِكَ يَدْخُلُونَ الْجَنَّةَ وَلَا يُظْلَمُونَ شَيْئًا",
    "جَنَّاتِ عَدْنٍ الَّتِي وَعَدَ الرَّحْمَٰنُ عِبَادَهُ بِالْغَيْبِ ۚ إِنَّهُ كَانَ وَعْدُهُ مَأْتِيًّا",
    "لَّا يَسْمَعُونَ فِيهَا لَغْوًا إِلَّا سَلَامًا ۖ وَلَهُمْ رِزْقُهُمْ فِيهَا بُكْرَةً وَعَشِيًّا",
    "تِلْكَ الْجَنَّةُ الَّتِي نُورِثُ مِنْ عِبَادِنَا مَن كَانَ تَقِيًّا",
    "وَمَا نَتَنَزَّلُ إِلَّا بِأَمْرِ رَبِّكَ ۖ لَهُ مَا بَيْنَ أَيْدِينَا وَمَا خَلْفَنَا وَمَا بَيْنَ ذَٰلِكَ ۚ وَمَا كَانَ رَبُّكَ نَسِيًّا",
    "رَّبُّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا فَاعْبُدْهُ وَاصْطَبِرْ لِعِبَادَتِهِ ۚ هَلْ تَعْلَمُ لَهُ سَمِيًّا",
    "وَيَقُولُ الْإِنسَانُ أَإِذَا مَا مِتُّ لَسَوْفَ أُخْرَجُ حَيًّا",
    "أَوَلَا يَذْكُرُ الْإِنسَانُ أَنَّا خَلَقْنَاهُ مِن قَبْلُ وَلَمْ يَكُ شَيْئًا",
    "فَوَرَبِّكَ لَنَحْشُرَنَّهُمْ وَالشَّيَاطِينَ ثُمَّ لَنُحْضِرَنَّهُمْ حَوْلَ جَهَنَّمَ جِثِيًّا",
    "ثُمَّ لَنَنزِعَنَّ مِن كُلِّ شِيعَةٍ أَيُّهُمْ أَشَدُّ عَلَى الرَّحْمَٰنِ عِتِيًّا",
    "ثُمَّ لَنَحْنُ أَعْلَمُ بِالَّذِينَ هُمْ أَوْلَىٰ بِهَا صِلِيًّا",
    "وَإِن مِّنكُمْ إِلَّا وَارِدُهَا ۚ كَانَ عَلَىٰ رَبِّكَ حَتْمًا مَّقْضِيًّا",
    "ثُمَّ نُنَجِّي الَّذِينَ اتَّقَوا وَّنَذَرُ الظَّالِمِينَ فِيهَا جِثِيًّا",
    "وَإِذَا تُتْلَىٰ عَلَيْهِمْ آيَاتُنَا بَيِّنَاتٍ قَالَ الَّذِينَ كَفَرُوا لِلَّذِينَ آمَنُوا أَيُّ الْفَرِيقَيْنِ خَيْرٌ مَّقَامًا وَأَحْسَنُ نَدِيًّا",
    "وَكَمْ أَهْلَكْنَا قَبْلَهُم مِّن قَرْنٍ هُمْ أَحْسَنُ أَثَاثًا وَرِئْيًا",
    "قُلْ مَن كَانَ فِي الضَّلَالَةِ فَلْيَمْدُدْ لَهُ الرَّحْمَٰنُ مَدًّا ۚ حَتَّىٰ إِذَا رَأَوْا مَا يُوعَدُونَ إِمَّا الْعَذَابَ وَإِمَّا السَّاعَةَ فَسَيَعْلَمُونَ مَنْ هُوَ شَرٌّ مَّكَانًا وَأَضْعَفُ جُندًا",
    "وَيَزِيدُ اللَّهُ الَّذِينَ اهْتَدَوْا هُدًى ۗ وَالْبَاقِيَاتُ الصَّالِحَاتُ خَيْرٌ عِندَ رَبِّكَ ثَوَابًا وَخَيْرٌ مَّرَدًّا",
    "أَفَرَأَيْتَ الَّذِي كَفَرَ بِآيَاتِنَا وَقَالَ لَأُوتَيَنَّ مَالًا وَوَلَدًا",
    "أَطَّلَعَ الْغَيْبَ أَمِ اتَّخَذَ عِندَ الرَّحْمَٰنِ عَهْدًا",
    "كَلَّا ۚ سَنَكْتُبُ مَا يَقُولُ وَنَمُدُّ لَهُ مِنَ الْعَذَابِ مَدًّا",
    "وَنَرِثُهُ مَا يَقُولُ وَيَأْتِينَا فَرْدًا",
    "وَاتَّخَذُوا مِن دُونِ اللَّهِ آلِهَةً لِّيَكُونُوا لَهُمْ عِزًّا",
    "كَلَّا ۚ سَيَكْفُرُونَ بِعِبَادَتِهِمْ وَيَكُونُونَ عَلَيْهِمْ ضِدًّا",
    "أَلَمْ تَرَ أَنَّا أَرْسَلْنَا الشَّيَاطِينَ عَلَى الْكَافِرِينَ تَؤُزُّهُمْ أَزًّا",
    "فَلَا تَعْجَلْ عَلَيْهِمْ ۖ إِنَّمَا نَعُدُّ لَهُمْ عَدًّا",
    "يَوْمَ نَحْشُرُ الْمُتَّقِينَ إِلَى الرَّحْمَٰنِ وَفْدًا",
    "وَنَسُوقُ الْمُجْرِمِينَ إِلَىٰ جَهَنَّمَ وِرْدًا",
    "لَّا يَمْلِكُونَ الشَّفَاعَةَ إِلَّا مَنِ اتَّخَذَ عِندَ الرَّحْمَٰنِ عَهْدًا",
    "وَقَالُوا اتَّخَذَ الرَّحْمَٰنُ وَلَدًا",
    "لَّقَدْ جِئْتُمْ شَيْئًا إِدًّا",
    "تَكَادُ السَّمَاوَاتُ يَتَفَطَّرْنَ مِنْهُ وَتَنشَقُّ الْأَرْضُ وَتَخِرُّ الْجِبَالُ هَدًّا",
    "أَن دَعَوْا لِلرَّحْمَٰنِ وَلَدًا",
    "وَمَا يَنبَغِي لِلرَّحْمَٰنِ أَن يَتَّخِذَ وَلَدًا",
    "إِن كُلُّ مَن فِي السَّمَاوَاتِ وَالْأَرْضِ إِلَّا آتِي الرَّحْمَٰنِ عَبْدًا",
    "لَّقَدْ أَحْصَاهُمْ وَعَدَّهُمْ عَدًّا",
    "وَكُلُّهُمْ آتِيهِ يَوْمَ الْقِيَامَةِ فَرْدًا",
    "إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ سَيَجْعَلُ لَهُمُ الرَّحْمَٰنُ وُدًّا",
    "فَإِنَّمَا يَسَّرْنَاهُ بِلِسَانِكَ لِتُبَشِّرَ بِهِ الْمُتَّقِينَ وَتُنذِرَ بِهِ قَوْمًا لُّدًّا",
    "وَكَمْ أَهْلَكْنَا قَبْلَهُم مِّن قَرْنٍ هَلْ تُحِسُّ مِنْهُم مِّنْ أَحَدٍ أَوْ تَسْمَعُ لَهُمْ رِكْزًا",
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
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Kaf, Ha, Ya, 'Ayn, Sad.",
    "[This is] a mention of the mercy of your Lord to His servant Zechariah",
    "When he called to his Lord a private supplication.",
    "He said, \"My Lord, indeed my bones have weakened, and my head has filled with white, and never have I been in my supplication to You, my Lord, unhappy.",
    "And indeed, I fear the successors after me, and my wife has been barren, so give me from Yourself an heir",
    "Who will inherit me and inherit from the family of Jacob. And make him, my Lord, pleasing [to You].\"",
    "[He was told], \"O Zechariah, indeed We give you good tidings of a boy whose name will be John. We have not assigned to any before [this] name.\"",
    "He said, \"My Lord, how will I have a boy when my wife has been barren and I have reached extreme old age?\"",
    "[An angel] said, \"Thus [it will be]; your Lord says, 'It is easy for Me, for I created you before, while you were nothing.' \"",
    "[Zechariah] said, \"My Lord, make for me a sign.\" He said, \"Your sign is that you will not speak to the people for three nights, [being] sound.\"",
    "So he came out to his people from the prayer chamber and signaled to them to exalt [Allah] in the morning and afternoon.",
    "[Allah] said, \"O John, take the Scripture with determination.\" And We gave him judgement [while yet] a boy",
    "And affection from Us and purity, and he was fearing of Allah",
    "And dutiful to his parents, and he was not a disobedient tyrant.",
    "And peace be upon him the day he was born and the day he dies and the day he is raised alive.",
    "And mention, [O Muhammad], in the Book [the story of] Mary, when she withdrew from her family to a place toward the east.",
    "And she took, in seclusion from them, a screen. Then We sent to her Our Angel, and he represented himself to her as a well-proportioned man.",
    "She said, \"Indeed, I seek refuge in the Most Merciful from you, [so leave me], if you should be fearing of Allah.\"",
    "He said, \"I am only the messenger of your Lord to give you [news of] a pure boy.\"",
    "She said, \"How can I have a boy while no man has touched me and I have not been unchaste?\"",
    "He said, \"Thus [it will be]; your Lord says, 'It is easy for Me, and We will make him a sign to the people and a mercy from Us. And it is a matter [already] decreed.' \"",
    "So she conceived him, and she withdrew with him to a remote place.",
    "And the pains of childbirth drove her to the trunk of a palm tree. She said, \"Oh, I wish I had died before this and was in oblivion, forgotten.\"",
    "But he called her from below her, \"Do not grieve; your Lord has provided beneath you a stream.",
    "And shake toward you the trunk of the palm tree; it will drop upon you ripe, fresh dates.",
    "So eat and drink and be contented. And if you see from among humanity anyone, say, 'Indeed, I have vowed to the Most Merciful abstention, so I will not speak today to [any] man.' \"",
    "Then she brought him to her people, carrying him. They said, \"O Mary, you have certainly done a thing unprecedented.",
    "O sister of Aaron, your father was not a man of evil, nor was your mother unchaste.\"",
    "So she pointed to him. They said, \"How can we speak to one who is in the cradle a child?\"",
    "[Jesus] said, \"Indeed, I am the servant of Allah. He has given me the Scripture and made me a prophet.",
    "And He has made me blessed wherever I am and has enjoined upon me prayer and zakah as long as I remain alive",
    "And [made me] dutiful to my mother, and He has not made me a wretched tyrant.",
    "And peace is on me the day I was born and the day I will die and the day I am raised alive.\"",
    "That is Jesus, the son of Mary - the word of truth about which they are in dispute.",
    "It is not [befitting] for Allah to take a son; exalted is He! When He decrees an affair, He only says to it, \"Be,\" and it is.",
    "[Jesus said], \"And indeed, Allah is my Lord and your Lord, so worship Him. That is a straight path.\"",
    "Then the factions differed [concerning Jesus] from among them, so woe to those who disbelieved - from the scene of a tremendous Day.",
    "How [clearly] they will hear and see the Day they come to Us, but the wrongdoers today are in clear error.",
    "And warn them, [O Muhammad], of the Day of Regret, when the matter will be concluded; and [yet], they are in [a state of] heedlessness, and they do not believe.",
    "Indeed, it is We who will inherit the earth and whoever is on it, and to Us they will be returned.",
    "And mention in the Book [the story of] Abraham. Indeed, he was a man of truth and a prophet.",
    "[Mention] when he said to his father, \"O my father, why do you worship that which does not hear and does not see and will not benefit you at all?",
    "O my father, indeed there has come to me of knowledge that which has not come to you, so follow me; I will guide you to an even path.",
    "O my father, do not worship Satan. Indeed Satan has ever been, to the Most Merciful, disobedient.",
    "O my father, indeed I fear that there will touch you a punishment from the Most Merciful so you would be to Satan a companion [in Hellfire].\"",
    "[His father] said, \"Have you no desire for my gods, O Abraham? If you do not desist, I will surely stone you, so avoid me a prolonged time.\"",
    "[Abraham] said, \"Peace will be upon you. I will ask forgiveness for you of my Lord. Indeed, He is ever gracious to me.",
    "And I will leave you and those you invoke other than Allah and will invoke my Lord. I expect that I will not be in invocation to my Lord unhappy.\"",
    "So when he had left them and those they worshipped other than Allah, We gave him Isaac and Jacob, and each [of them] We made a prophet.",
    "And We gave them of Our mercy, and we made for them a reputation of high honor.",
    "And mention in the Book, Moses. Indeed, he was chosen, and he was a messenger and a prophet.",
    "And We called him from the side of the mount at [his] right and brought him near, confiding [to him].",
    "And We gave him out of Our mercy his brother Aaron as a prophet.",
    "And mention in the Book, Ishmael. Indeed, he was true to his promise, and he was a messenger and a prophet.",
    "And he used to enjoin on his people prayer and zakah and was to his Lord pleasing.",
    "And mention in the Book, Idrees. Indeed, he was a man of truth and a prophet.",
    "And We raised him to a high station.",
    "Those were the ones upon whom Allah bestowed favor from among the prophets of the descendants of Adam and of those We carried [in the ship] with Noah, and of the descendants of Abraham and Israel, and of those whom We guided and chose. When the verses of the Most Merciful were recited to them, they fell in prostration and weeping.",
    "But there came after them successors who neglected prayer and pursued desires; so they are going to meet evil -",
    "Except those who repent, believe and do righteousness; for those will enter Paradise and will not be wronged at all.",
    "[Therein are] gardens of perpetual residence which the Most Merciful has promised His servants in the unseen. Indeed, His promise has ever been coming.",
    "They will not hear therein any ill speech - only [greetings of] peace - and they will have their provision therein, morning and afternoon.",
    "That is Paradise, which We give as inheritance to those of Our servants who were fearing of Allah.",
    "[Gabriel said], \"And we [angels] descend not except by the order of your Lord. To Him belongs that before us and that behind us and what is in between. And never is your Lord forgetful -",
    "Lord of the heavens and the earth and whatever is between them - so worship Him and have patience for His worship. Do you know of any similarity to Him?\"",
    "And the disbeliever says, \"When I have died, am I going to be brought forth alive?\"",
    "Does man not remember that We created him before, while he was nothing?",
    "So by your Lord, We will surely gather them and the devils; then We will bring them to be present around Hell upon their knees.",
    "Then We will surely extract from every sect those of them who were worst against the Most Merciful in insolence.",
    "Then, surely it is We who are most knowing of those most worthy of burning therein.",
    "And there is none of you except he will come to it. This is upon your Lord an inevitability decreed.",
    "Then We will save those who feared Allah and leave the wrongdoers within it, on their knees.",
    "And when Our verses are recited to them as clear evidences, those who disbelieve say to those who believe, \"Which of [our] two parties is best in position and best in association?\"",
    "And how many a generation have We destroyed before them who were better in possessions and [outward] appearance?",
    "Say, \"Whoever is in error - let the Most Merciful extend for him an extension [in wealth and time] until, when they see that which they were promised - either punishment [in this world] or the Hour [of resurrection] - they will come to know who is worst in position and weaker in soldiers.\"",
    "And Allah increases those who were guided, in guidance, and the enduring good deeds are better to your Lord for reward and better for recourse.",
    "Then, have you seen he who disbelieved in Our verses and said, \"I will surely be given wealth and children [in the next life]?\"",
    "Has he looked into the unseen, or has he taken from the Most Merciful a promise?",
    "No! We will record what he says and extend for him from the punishment extensively.",
    "And We will inherit him [in] what he mentions, and he will come to Us alone.",
    "And they have taken besides Allah [false] deities that they would be for them [a source of] honor.",
    "No! Those \"gods\" will deny their worship of them and will be against them opponents [on the Day of Judgement].",
    "Do you not see that We have sent the devils upon the disbelievers, inciting them to [evil] with [constant] incitement?",
    "So be not impatient over them. We only count out to them a [limited] number.",
    "On the Day We will gather the righteous to the Most Merciful as a delegation",
    "And will drive the criminals to Hell in thirst",
    "None will have [power of] intercession except he who had taken from the Most Merciful a covenant.",
    "And they say, \"The Most Merciful has taken [for Himself] a son.\"",
    "You have done an atrocious thing.",
    "The heavens almost rupture therefrom and the earth splits open and the mountains collapse in devastation",
    "That they attribute to the Most Merciful a son.",
    "And it is not appropriate for the Most Merciful that He should take a son.",
    "There is no one in the heavens and earth but that he comes to the Most Merciful as a servant.",
    "He has enumerated them and counted them a [full] counting.",
    "And all of them are coming to Him on the Day of Resurrection alone.",
    "Indeed, those who have believed and done righteous deeds - the Most Merciful will appoint for them affection.",
    "So, [O Muhammad], We have only made Qur'an easy in the Arabic language that you may give good tidings thereby to the righteous and warn thereby a hostile people.",
    "And how many have We destroyed before them of generations? Do you perceive of them anyone or hear from them a sound?",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maryam);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_maryam);
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
