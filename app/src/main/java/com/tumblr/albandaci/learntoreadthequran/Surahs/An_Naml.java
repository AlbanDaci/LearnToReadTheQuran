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

public class An_Naml extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"27:1", "27:2", "27:3", "27:4", "27:5", "27:6", "27:7", "27:8", "27:9", "27:10", "27:11", "27:12", "27:13", "27:14", "27:15", "27:16",
            "27:17", "27:18", "27:19", "27:20", "27:21", "27:22", "27:23", "27:24", "27:25", "27:26", "27:27", "27:28", "27:29", "27:30", "27:31", "27:32",
            "27:33", "27:34", "27:35", "27:36", "27:37", "27:38", "27:39", "27:40", "27:41", "27:42", "27:43", "27:44", "27:45", "27:46", "27:47", "27:48",
            "27:49", "27:50", "27:51", "27:52", "27:53", "27:54", "27:55", "27:56", "27:57", "27:58", "27:59", "27:60", "27:61", "27:62", "27:63", "27:64",
            "27:65", "27:66", "27:67", "27:68", "27:69", "27:70", "27:71", "27:72", "27:73", "27:74", "27:75", "27:76", "27:77", "27:78", "27:79", "27:80",
            "27:81", "27:82", "27:83", "27:84", "27:85", "27:86", "27:87", "27:88", "27:89", "27:90", "27:91", "27:92", "27:93"};

    String [] arabic_verses = {"طس ۚ تِلْكَ آيَاتُ الْقُرْآنِ وَكِتَابٍ مُّبِينٍ",
    "هُدًى وَبُشْرَىٰ لِلْمُؤْمِنِينَ",
    "الَّذِينَ يُقِيمُونَ الصَّلَاةَ وَيُؤْتُونَ الزَّكَاةَ وَهُم بِالْآخِرَةِ هُمْ يُوقِنُونَ",
    "إِنَّ الَّذِينَ لَا يُؤْمِنُونَ بِالْآخِرَةِ زَيَّنَّا لَهُمْ أَعْمَالَهُمْ فَهُمْ يَعْمَهُونَ",
    "أُولَٰئِكَ الَّذِينَ لَهُمْ سُوءُ الْعَذَابِ وَهُمْ فِي الْآخِرَةِ هُمُ الْأَخْسَرُونَ",
    "وَإِنَّكَ لَتُلَقَّى الْقُرْآنَ مِن لَّدُنْ حَكِيمٍ عَلِيمٍ",
    "إِذْ قَالَ مُوسَىٰ لِأَهْلِهِ إِنِّي آنَسْتُ نَارًا سَآتِيكُم مِّنْهَا بِخَبَرٍ أَوْ آتِيكُم بِشِهَابٍ قَبَسٍ لَّعَلَّكُمْ تَصْطَلُونَ",
    "فَلَمَّا جَاءَهَا نُودِيَ أَن بُورِكَ مَن فِي النَّارِ وَمَنْ حَوْلَهَا وَسُبْحَانَ اللَّهِ رَبِّ الْعَالَمِينَ",
    "يَا مُوسَىٰ إِنَّهُ أَنَا اللَّهُ الْعَزِيزُ الْحَكِيمُ",
    "وَأَلْقِ عَصَاكَ ۚ فَلَمَّا رَآهَا تَهْتَزُّ كَأَنَّهَا جَانٌّ وَلَّىٰ مُدْبِرًا وَلَمْ يُعَقِّبْ ۚ يَا مُوسَىٰ لَا تَخَفْ إِنِّي لَا يَخَافُ لَدَيَّ الْمُرْسَلُونَ",
    "إِلَّا مَن ظَلَمَ ثُمَّ بَدَّلَ حُسْنًا بَعْدَ سُوءٍ فَإِنِّي غَفُورٌ رَّحِيمٌ",
    "وَأَدْخِلْ يَدَكَ فِي جَيْبِكَ تَخْرُجْ بَيْضَاءَ مِنْ غَيْرِ سُوءٍ ۖ فِي تِسْعِ آيَاتٍ إِلَىٰ فِرْعَوْنَ وَقَوْمِهِ ۚ إِنَّهُمْ كَانُوا قَوْمًا فَاسِقِينَ",
    "فَلَمَّا جَاءَتْهُمْ آيَاتُنَا مُبْصِرَةً قَالُوا هَٰذَا سِحْرٌ مُّبِينٌ",
    "وَجَحَدُوا بِهَا وَاسْتَيْقَنَتْهَا أَنفُسُهُمْ ظُلْمًا وَعُلُوًّا ۚ فَانظُرْ كَيْفَ كَانَ عَاقِبَةُ الْمُفْسِدِينَ",
    "وَلَقَدْ آتَيْنَا دَاوُودَ وَسُلَيْمَانَ عِلْمًا ۖ وَقَالَا الْحَمْدُ لِلَّهِ الَّذِي فَضَّلَنَا عَلَىٰ كَثِيرٍ مِّنْ عِبَادِهِ الْمُؤْمِنِينَ",
    "وَوَرِثَ سُلَيْمَانُ دَاوُودَ ۖ وَقَالَ يَا أَيُّهَا النَّاسُ عُلِّمْنَا مَنطِقَ الطَّيْرِ وَأُوتِينَا مِن كُلِّ شَيْءٍ ۖ إِنَّ هَٰذَا لَهُوَ الْفَضْلُ الْمُبِينُ",
    "وَحُشِرَ لِسُلَيْمَانَ جُنُودُهُ مِنَ الْجِنِّ وَالْإِنسِ وَالطَّيْرِ فَهُمْ يُوزَعُونَ",
    "حَتَّىٰ إِذَا أَتَوْا عَلَىٰ وَادِ النَّمْلِ قَالَتْ نَمْلَةٌ يَا أَيُّهَا النَّمْلُ ادْخُلُوا مَسَاكِنَكُمْ لَا يَحْطِمَنَّكُمْ سُلَيْمَانُ وَجُنُودُهُ وَهُمْ لَا يَشْعُرُونَ",
    "فَتَبَسَّمَ ضَاحِكًا مِّن قَوْلِهَا وَقَالَ رَبِّ أَوْزِعْنِي أَنْ أَشْكُرَ نِعْمَتَكَ الَّتِي أَنْعَمْتَ عَلَيَّ وَعَلَىٰ وَالِدَيَّ وَأَنْ أَعْمَلَ صَالِحًا تَرْضَاهُ وَأَدْخِلْنِي بِرَحْمَتِكَ فِي عِبَادِكَ الصَّالِحِينَ",
    "وَتَفَقَّدَ الطَّيْرَ فَقَالَ مَا لِيَ لَا أَرَى الْهُدْهُدَ أَمْ كَانَ مِنَ الْغَائِبِينَ",
    "لَأُعَذِّبَنَّهُ عَذَابًا شَدِيدًا أَوْ لَأَذْبَحَنَّهُ أَوْ لَيَأْتِيَنِّي بِسُلْطَانٍ مُّبِينٍ",
    "فَمَكَثَ غَيْرَ بَعِيدٍ فَقَالَ أَحَطتُ بِمَا لَمْ تُحِطْ بِهِ وَجِئْتُكَ مِن سَبَإٍ بِنَبَإٍ يَقِينٍ",
    "إِنِّي وَجَدتُّ امْرَأَةً تَمْلِكُهُمْ وَأُوتِيَتْ مِن كُلِّ شَيْءٍ وَلَهَا عَرْشٌ عَظِيمٌ",
    "وَجَدتُّهَا وَقَوْمَهَا يَسْجُدُونَ لِلشَّمْسِ مِن دُونِ اللَّهِ وَزَيَّنَ لَهُمُ الشَّيْطَانُ أَعْمَالَهُمْ فَصَدَّهُمْ عَنِ السَّبِيلِ فَهُمْ لَا يَهْتَدُونَ",
    "أَلَّا يَسْجُدُوا لِلَّهِ الَّذِي يُخْرِجُ الْخَبْءَ فِي السَّمَاوَاتِ وَالْأَرْضِ وَيَعْلَمُ مَا تُخْفُونَ وَمَا تُعْلِنُونَ",
    "اللَّهُ لَا إِلَٰهَ إِلَّا هُوَ رَبُّ الْعَرْشِ الْعَظِيمِ ۩",
    "قَالَ سَنَنظُرُ أَصَدَقْتَ أَمْ كُنتَ مِنَ الْكَاذِبِينَ",
    "اذْهَب بِّكِتَابِي هَٰذَا فَأَلْقِهْ إِلَيْهِمْ ثُمَّ تَوَلَّ عَنْهُمْ فَانظُرْ مَاذَا يَرْجِعُونَ",
    "قَالَتْ يَا أَيُّهَا الْمَلَأُ إِنِّي أُلْقِيَ إِلَيَّ كِتَابٌ كَرِيمٌ",
    "إِنَّهُ مِن سُلَيْمَانَ وَإِنَّهُ بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ",
    "أَلَّا تَعْلُوا عَلَيَّ وَأْتُونِي مُسْلِمِينَ",
    "قَالَتْ يَا أَيُّهَا الْمَلَأُ أَفْتُونِي فِي أَمْرِي مَا كُنتُ قَاطِعَةً أَمْرًا حَتَّىٰ تَشْهَدُونِ",
    "قَالُوا نَحْنُ أُولُو قُوَّةٍ وَأُولُو بَأْسٍ شَدِيدٍ وَالْأَمْرُ إِلَيْكِ فَانظُرِي مَاذَا تَأْمُرِينَ",
    "قَالَتْ إِنَّ الْمُلُوكَ إِذَا دَخَلُوا قَرْيَةً أَفْسَدُوهَا وَجَعَلُوا أَعِزَّةَ أَهْلِهَا أَذِلَّةً ۖ وَكَذَٰلِكَ يَفْعَلُونَ",
    "وَإِنِّي مُرْسِلَةٌ إِلَيْهِم بِهَدِيَّةٍ فَنَاظِرَةٌ بِمَ يَرْجِعُ الْمُرْسَلُونَ",
    "فَلَمَّا جَاءَ سُلَيْمَانَ قَالَ أَتُمِدُّونَنِ بِمَالٍ فَمَا آتَانِيَ اللَّهُ خَيْرٌ مِّمَّا آتَاكُم بَلْ أَنتُم بِهَدِيَّتِكُمْ تَفْرَحُونَ",
    "ارْجِعْ إِلَيْهِمْ فَلَنَأْتِيَنَّهُم بِجُنُودٍ لَّا قِبَلَ لَهُم بِهَا وَلَنُخْرِجَنَّهُم مِّنْهَا أَذِلَّةً وَهُمْ صَاغِرُونَ",
    "قَالَ يَا أَيُّهَا الْمَلَأُ أَيُّكُمْ يَأْتِينِي بِعَرْشِهَا قَبْلَ أَن يَأْتُونِي مُسْلِمِينَ",
    "قَالَ عِفْرِيتٌ مِّنَ الْجِنِّ أَنَا آتِيكَ بِهِ قَبْلَ أَن تَقُومَ مِن مَّقَامِكَ ۖ وَإِنِّي عَلَيْهِ لَقَوِيٌّ أَمِينٌ",
    "قَالَ الَّذِي عِندَهُ عِلْمٌ مِّنَ الْكِتَابِ أَنَا آتِيكَ بِهِ قَبْلَ أَن يَرْتَدَّ إِلَيْكَ طَرْفُكَ ۚ فَلَمَّا رَآهُ مُسْتَقِرًّا عِندَهُ قَالَ هَٰذَا مِن فَضْلِ رَبِّي لِيَبْلُوَنِي أَأَشْكُرُ أَمْ أَكْفُرُ ۖ وَمَن شَكَرَ فَإِنَّمَا يَشْكُرُ لِنَفْسِهِ ۖ وَمَن كَفَرَ فَإِنَّ رَبِّي غَنِيٌّ كَرِيمٌ",
    "قَالَ نَكِّرُوا لَهَا عَرْشَهَا نَنظُرْ أَتَهْتَدِي أَمْ تَكُونُ مِنَ الَّذِينَ لَا يَهْتَدُونَ",
    "فَلَمَّا جَاءَتْ قِيلَ أَهَٰكَذَا عَرْشُكِ ۖ قَالَتْ كَأَنَّهُ هُوَ ۚ وَأُوتِينَا الْعِلْمَ مِن قَبْلِهَا وَكُنَّا مُسْلِمِينَ",
    "وَصَدَّهَا مَا كَانَت تَّعْبُدُ مِن دُونِ اللَّهِ ۖ إِنَّهَا كَانَتْ مِن قَوْمٍ كَافِرِينَ",
    "قِيلَ لَهَا ادْخُلِي الصَّرْحَ ۖ فَلَمَّا رَأَتْهُ حَسِبَتْهُ لُجَّةً وَكَشَفَتْ عَن سَاقَيْهَا ۚ قَالَ إِنَّهُ صَرْحٌ مُّمَرَّدٌ مِّن قَوَارِيرَ ۗ قَالَتْ رَبِّ إِنِّي ظَلَمْتُ نَفْسِي وَأَسْلَمْتُ مَعَ سُلَيْمَانَ لِلَّهِ رَبِّ الْعَالَمِينَ",
    "وَلَقَدْ أَرْسَلْنَا إِلَىٰ ثَمُودَ أَخَاهُمْ صَالِحًا أَنِ اعْبُدُوا اللَّهَ فَإِذَا هُمْ فَرِيقَانِ يَخْتَصِمُونَ",
    "قَالَ يَا قَوْمِ لِمَ تَسْتَعْجِلُونَ بِالسَّيِّئَةِ قَبْلَ الْحَسَنَةِ ۖ لَوْلَا تَسْتَغْفِرُونَ اللَّهَ لَعَلَّكُمْ تُرْحَمُونَ",
    "قَالُوا اطَّيَّرْنَا بِكَ وَبِمَن مَّعَكَ ۚ قَالَ طَائِرُكُمْ عِندَ اللَّهِ ۖ بَلْ أَنتُمْ قَوْمٌ تُفْتَنُونَ",
    "وَكَانَ فِي الْمَدِينَةِ تِسْعَةُ رَهْطٍ يُفْسِدُونَ فِي الْأَرْضِ وَلَا يُصْلِحُونَ",
    "قَالُوا تَقَاسَمُوا بِاللَّهِ لَنُبَيِّتَنَّهُ وَأَهْلَهُ ثُمَّ لَنَقُولَنَّ لِوَلِيِّهِ مَا شَهِدْنَا مَهْلِكَ أَهْلِهِ وَإِنَّا لَصَادِقُونَ",
    "وَمَكَرُوا مَكْرًا وَمَكَرْنَا مَكْرًا وَهُمْ لَا يَشْعُرُونَ",
    "فَانظُرْ كَيْفَ كَانَ عَاقِبَةُ مَكْرِهِمْ أَنَّا دَمَّرْنَاهُمْ وَقَوْمَهُمْ أَجْمَعِينَ",
    "فَتِلْكَ بُيُوتُهُمْ خَاوِيَةً بِمَا ظَلَمُوا ۗ إِنَّ فِي ذَٰلِكَ لَآيَةً لِّقَوْمٍ يَعْلَمُونَ",
    "وَأَنجَيْنَا الَّذِينَ آمَنُوا وَكَانُوا يَتَّقُونَ",
    "وَلُوطًا إِذْ قَالَ لِقَوْمِهِ أَتَأْتُونَ الْفَاحِشَةَ وَأَنتُمْ تُبْصِرُونَ",
    "أَئِنَّكُمْ لَتَأْتُونَ الرِّجَالَ شَهْوَةً مِّن دُونِ النِّسَاءِ ۚ بَلْ أَنتُمْ قَوْمٌ تَجْهَلُونَ",
    "فَمَا كَانَ جَوَابَ قَوْمِهِ إِلَّا أَن قَالُوا أَخْرِجُوا آلَ لُوطٍ مِّن قَرْيَتِكُمْ ۖ إِنَّهُمْ أُنَاسٌ يَتَطَهَّرُونَ",
    "فَأَنجَيْنَاهُ وَأَهْلَهُ إِلَّا امْرَأَتَهُ قَدَّرْنَاهَا مِنَ الْغَابِرِينَ",
    "وَأَمْطَرْنَا عَلَيْهِم مَّطَرًا ۖ فَسَاءَ مَطَرُ الْمُنذَرِينَ",
    "قُلِ الْحَمْدُ لِلَّهِ وَسَلَامٌ عَلَىٰ عِبَادِهِ الَّذِينَ اصْطَفَىٰ ۗ آللَّهُ خَيْرٌ أَمَّا يُشْرِكُونَ",
    "أَمَّنْ خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ وَأَنزَلَ لَكُم مِّنَ السَّمَاءِ مَاءً فَأَنبَتْنَا بِهِ حَدَائِقَ ذَاتَ بَهْجَةٍ مَّا كَانَ لَكُمْ أَن تُنبِتُوا شَجَرَهَا ۗ أَإِلَٰهٌ مَّعَ اللَّهِ ۚ بَلْ هُمْ قَوْمٌ يَعْدِلُونَ",
    "أَمَّن جَعَلَ الْأَرْضَ قَرَارًا وَجَعَلَ خِلَالَهَا أَنْهَارًا وَجَعَلَ لَهَا رَوَاسِيَ وَجَعَلَ بَيْنَ الْبَحْرَيْنِ حَاجِزًا ۗ أَإِلَٰهٌ مَّعَ اللَّهِ ۚ بَلْ أَكْثَرُهُمْ لَا يَعْلَمُونَ",
    "أَمَّن يُجِيبُ الْمُضْطَرَّ إِذَا دَعَاهُ وَيَكْشِفُ السُّوءَ وَيَجْعَلُكُمْ خُلَفَاءَ الْأَرْضِ ۗ أَإِلَٰهٌ مَّعَ اللَّهِ ۚ قَلِيلًا مَّا تَذَكَّرُونَ",
    "أَمَّن يَهْدِيكُمْ فِي ظُلُمَاتِ الْبَرِّ وَالْبَحْرِ وَمَن يُرْسِلُ الرِّيَاحَ بُشْرًا بَيْنَ يَدَيْ رَحْمَتِهِ ۗ أَإِلَٰهٌ مَّعَ اللَّهِ ۚ تَعَالَى اللَّهُ عَمَّا يُشْرِكُونَ",
    "أَمَّن يَبْدَأُ الْخَلْقَ ثُمَّ يُعِيدُهُ وَمَن يَرْزُقُكُم مِّنَ السَّمَاءِ وَالْأَرْضِ ۗ أَإِلَٰهٌ مَّعَ اللَّهِ ۚ قُلْ هَاتُوا بُرْهَانَكُمْ إِن كُنتُمْ صَادِقِينَ",
    "قُل لَّا يَعْلَمُ مَن فِي السَّمَاوَاتِ وَالْأَرْضِ الْغَيْبَ إِلَّا اللَّهُ ۚ وَمَا يَشْعُرُونَ أَيَّانَ يُبْعَثُونَ",
    "بَلِ ادَّارَكَ عِلْمُهُمْ فِي الْآخِرَةِ ۚ بَلْ هُمْ فِي شَكٍّ مِّنْهَا ۖ بَلْ هُم مِّنْهَا عَمُونَ",
    "وَقَالَ الَّذِينَ كَفَرُوا أَإِذَا كُنَّا تُرَابًا وَآبَاؤُنَا أَئِنَّا لَمُخْرَجُونَ",
    "لَقَدْ وُعِدْنَا هَٰذَا نَحْنُ وَآبَاؤُنَا مِن قَبْلُ إِنْ هَٰذَا إِلَّا أَسَاطِيرُ الْأَوَّلِينَ",
    "قُلْ سِيرُوا فِي الْأَرْضِ فَانظُرُوا كَيْفَ كَانَ عَاقِبَةُ الْمُجْرِمِينَ",
    "وَلَا تَحْزَنْ عَلَيْهِمْ وَلَا تَكُن فِي ضَيْقٍ مِّمَّا يَمْكُرُونَ",
    "وَيَقُولُونَ مَتَىٰ هَٰذَا الْوَعْدُ إِن كُنتُمْ صَادِقِينَ",
    "قُلْ عَسَىٰ أَن يَكُونَ رَدِفَ لَكُم بَعْضُ الَّذِي تَسْتَعْجِلُونَ",
    "وَإِنَّ رَبَّكَ لَذُو فَضْلٍ عَلَى النَّاسِ وَلَٰكِنَّ أَكْثَرَهُمْ لَا يَشْكُرُونَ",
    "وَإِنَّ رَبَّكَ لَيَعْلَمُ مَا تُكِنُّ صُدُورُهُمْ وَمَا يُعْلِنُونَ",
    "وَمَا مِنْ غَائِبَةٍ فِي السَّمَاءِ وَالْأَرْضِ إِلَّا فِي كِتَابٍ مُّبِينٍ",
    "إِنَّ هَٰذَا الْقُرْآنَ يَقُصُّ عَلَىٰ بَنِي إِسْرَائِيلَ أَكْثَرَ الَّذِي هُمْ فِيهِ يَخْتَلِفُونَ",
    "وَإِنَّهُ لَهُدًى وَرَحْمَةٌ لِّلْمُؤْمِنِينَ",
    "إِنَّ رَبَّكَ يَقْضِي بَيْنَهُم بِحُكْمِهِ ۚ وَهُوَ الْعَزِيزُ الْعَلِيمُ",
    "فَتَوَكَّلْ عَلَى اللَّهِ ۖ إِنَّكَ عَلَى الْحَقِّ الْمُبِينِ",
    "إِنَّكَ لَا تُسْمِعُ الْمَوْتَىٰ وَلَا تُسْمِعُ الصُّمَّ الدُّعَاءَ إِذَا وَلَّوْا مُدْبِرِينَ",
    "وَمَا أَنتَ بِهَادِي الْعُمْيِ عَن ضَلَالَتِهِمْ ۖ إِن تُسْمِعُ إِلَّا مَن يُؤْمِنُ بِآيَاتِنَا فَهُم مُّسْلِمُونَ",
    "وَإِذَا وَقَعَ الْقَوْلُ عَلَيْهِمْ أَخْرَجْنَا لَهُمْ دَابَّةً مِّنَ الْأَرْضِ تُكَلِّمُهُمْ أَنَّ النَّاسَ كَانُوا بِآيَاتِنَا لَا يُوقِنُونَ",
    "وَيَوْمَ نَحْشُرُ مِن كُلِّ أُمَّةٍ فَوْجًا مِّمَّن يُكَذِّبُ بِآيَاتِنَا فَهُمْ يُوزَعُونَ",
    "حَتَّىٰ إِذَا جَاءُوا قَالَ أَكَذَّبْتُم بِآيَاتِي وَلَمْ تُحِيطُوا بِهَا عِلْمًا أَمَّاذَا كُنتُمْ تَعْمَلُونَ",
    "وَوَقَعَ الْقَوْلُ عَلَيْهِم بِمَا ظَلَمُوا فَهُمْ لَا يَنطِقُونَ",
    "أَلَمْ يَرَوْا أَنَّا جَعَلْنَا اللَّيْلَ لِيَسْكُنُوا فِيهِ وَالنَّهَارَ مُبْصِرًا ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يُؤْمِنُونَ",
    "وَيَوْمَ يُنفَخُ فِي الصُّورِ فَفَزِعَ مَن فِي السَّمَاوَاتِ وَمَن فِي الْأَرْضِ إِلَّا مَن شَاءَ اللَّهُ ۚ وَكُلٌّ أَتَوْهُ دَاخِرِينَ",
    "وَتَرَى الْجِبَالَ تَحْسَبُهَا جَامِدَةً وَهِيَ تَمُرُّ مَرَّ السَّحَابِ ۚ صُنْعَ اللَّهِ الَّذِي أَتْقَنَ كُلَّ شَيْءٍ ۚ إِنَّهُ خَبِيرٌ بِمَا تَفْعَلُونَ",
    "مَن جَاءَ بِالْحَسَنَةِ فَلَهُ خَيْرٌ مِّنْهَا وَهُم مِّن فَزَعٍ يَوْمَئِذٍ آمِنُونَ",
    "وَمَن جَاءَ بِالسَّيِّئَةِ فَكُبَّتْ وُجُوهُهُمْ فِي النَّارِ هَلْ تُجْزَوْنَ إِلَّا مَا كُنتُمْ تَعْمَلُونَ",
    "إِنَّمَا أُمِرْتُ أَنْ أَعْبُدَ رَبَّ هَٰذِهِ الْبَلْدَةِ الَّذِي حَرَّمَهَا وَلَهُ كُلُّ شَيْءٍ ۖ وَأُمِرْتُ أَنْ أَكُونَ مِنَ الْمُسْلِمِينَ",
    "وَأَنْ أَتْلُوَ الْقُرْآنَ ۖ فَمَنِ اهْتَدَىٰ فَإِنَّمَا يَهْتَدِي لِنَفْسِهِ ۖ وَمَن ضَلَّ فَقُلْ إِنَّمَا أَنَا مِنَ الْمُنذِرِينَ",
    "وَقُلِ الْحَمْدُ لِلَّهِ سَيُرِيكُمْ آيَاتِهِ فَتَعْرِفُونَهَا ۚ وَمَا رَبُّكَ بِغَافِلٍ عَمَّا تَعْمَلُونَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"Ta, Seen. These are the verses of the Qur'an and a clear Book",
    "As guidance and good tidings for the believers",
    "Who establish prayer and give zakah, and of the Hereafter they are certain [in faith].",
    "Indeed, for those who do not believe in the Hereafter, We have made pleasing to them their deeds, so they wander blindly.",
    "Those are the ones for whom there will be the worst of punishment, and in the Hereafter they are the greatest losers.",
    "And indeed, [O Muhammad], you receive the Qur'an from one Wise and Knowing.",
    "[Mention] when Moses said to his family, \"Indeed, I have perceived a fire. I will bring you from there information or will bring you a burning torch that you may warm yourselves.\"",
    "But when he came to it, he was called, \"Blessed is whoever is at the fire and whoever is around it. And exalted is Allah, Lord of the worlds.",
    "O Moses, indeed it is I - Allah, the Exalted in Might, the Wise.\"",
    "And [he was told], \"Throw down your staff.\" But when he saw it writhing as if it were a snake, he turned in flight and did not return. [Allah said], \"O Moses, fear not. Indeed, in My presence the messengers do not fear.",
    "Otherwise, he who wrongs, then substitutes good after evil - indeed, I am Forgiving and Merciful.",
    "And put your hand into the opening of your garment [at the breast]; it will come out white without disease. [These are] among the nine signs [you will take] to Pharaoh and his people. Indeed, they have been a people defiantly disobedient.\"",
    "But when there came to them Our visible signs, they said, \"This is obvious magic.\"",
    "And they rejected them, while their [inner] selves were convinced thereof, out of injustice and haughtiness. So see how was the end of the corrupters.",
    "And We had certainly given to David and Solomon knowledge, and they said, \"Praise [is due] to Allah, who has favored us over many of His believing servants.\"",
    "And Solomon inherited David. He said, \"O people, we have been taught the language of birds, and we have been given from all things. Indeed, this is evident bounty.\"",
    "And gathered for Solomon were his soldiers of the jinn and men and birds, and they were [marching] in rows.",
    "Until, when they came upon the valley of the ants, an ant said, \"O ants, enter your dwellings that you not be crushed by Solomon and his soldiers while they perceive not.\"",
    "So [Solomon] smiled, amused at her speech, and said, \"My Lord, enable me to be grateful for Your favor which You have bestowed upon me and upon my parents and to do righteousness of which You approve. And admit me by Your mercy into [the ranks of] Your righteous servants.\"",
    "And he took attendance of the birds and said, \"Why do I not see the hoopoe - or is he among the absent?",
    "I will surely punish him with a severe punishment or slaughter him unless he brings me clear authorization.\"",
    "But the hoopoe stayed not long and said, \"I have encompassed [in knowledge] that which you have not encompassed, and I have come to you from Sheba with certain news.",
    "Indeed, I found [there] a woman ruling them, and she has been given of all things, and she has a great throne.",
    "I found her and her people prostrating to the sun instead of Allah, and Satan has made their deeds pleasing to them and averted them from [His] way, so they are not guided,",
    "[And] so they do not prostrate to Allah, who brings forth what is hidden within the heavens and the earth and knows what you conceal and what you declare -",
    "Allah - there is no deity except Him, Lord of the Great Throne.\"",
    "[Solomon] said, \"We will see whether you were truthful or were of the liars.",
    "Take this letter of mine and deliver it to them. Then leave them and see what [answer] they will return.\"",
    "She said, \"O eminent ones, indeed, to me has been delivered a noble letter.",
    "Indeed, it is from Solomon, and indeed, it reads: 'In the name of Allah, the Entirely Merciful, the Especially Merciful,",
    "Be not haughty with me but come to me in submission [as Muslims].' \"",
    "She said, \"O eminent ones, advise me in my affair. I would not decide a matter until you witness [for] me.\"",
    "They said, \"We are men of strength and of great military might, but the command is yours, so see what you will command.\"",
    "She said, \"Indeed kings - when they enter a city, they ruin it and render the honored of its people humbled. And thus do they do.",
    "But indeed, I will send to them a gift and see with what [reply] the messengers will return.\"",
    "So when they came to Solomon, he said, \"Do you provide me with wealth? But what Allah has given me is better than what He has given you. Rather, it is you who rejoice in your gift.",
    "Return to them, for we will surely come to them with soldiers that they will be powerless to encounter, and we will surely expel them therefrom in humiliation, and they will be debased.\"",
    "[Solomon] said, \"O assembly [of jinn], which of you will bring me her throne before they come to me in submission?\"",
    "A powerful one from among the jinn said, \"I will bring it to you before you rise from your place, and indeed, I am for this [task] strong and trustworthy.\"",
    "Said one who had knowledge from the Scripture, \"I will bring it to you before your glance returns to you.\" And when [Solomon] saw it placed before him, he said, \"This is from the favor of my Lord to test me whether I will be grateful or ungrateful. And whoever is grateful - his gratitude is only for [the benefit of] himself. And whoever is ungrateful - then indeed, my Lord is Free of need and Generous.\"",
    "He said, \"Disguise for her her throne; we will see whether she will be guided [to truth] or will be of those who is not guided.\"",
    "So when she arrived, it was said [to her], \"Is your throne like this?\" She said, \"[It is] as though it was it.\" [Solomon said], \"And we were given knowledge before her, and we have been Muslims [in submission to Allah].",
    "And that which she was worshipping other than Allah had averted her [from submission to Him]. Indeed, she was from a disbelieving people.\"",
    "She was told, \"Enter the palace.\" But when she saw it, she thought it was a body of water and uncovered her shins [to wade through]. He said, \"Indeed, it is a palace [whose floor is] made smooth with glass.\" She said, \"My Lord, indeed I have wronged myself, and I submit with Solomon to Allah, Lord of the worlds.\"",
    "And We had certainly sent to Thamud their brother Salih, [saying], \"Worship Allah,\" and at once they were two parties conflicting.",
    "He said, \"O my people, why are you impatient for evil instead of good? Why do you not seek forgiveness of Allah that you may receive mercy?\"",
    "They said, \"We consider you a bad omen, you and those with you.\" He said, \"Your omen is with Allah. Rather, you are a people being tested.\"",
    "And there were in the city nine family heads causing corruption in the land and not amending [its affairs].",
    "They said, \"Take a mutual oath by Allah that we will kill him by night, he and his family. Then we will say to his executor, 'We did not witness the destruction of his family, and indeed, we are truthful.' \"",
    "And they planned a plan, and We planned a plan, while they perceived not.",
    "Then look how was the outcome of their plan - that We destroyed them and their people, all.",
    "So those are their houses, desolate because of the wrong they had done. Indeed in that is a sign for people who know.",
    "And We saved those who believed and used to fear Allah.",
    "And [mention] Lot, when he said to his people, \"Do you commit immorality while you are seeing?",
    "Do you indeed approach men with desire instead of women? Rather, you are a people behaving ignorantly.\"",
    "But the answer of his people was not except that they said, \"Expel the family of Lot from your city. Indeed, they are people who keep themselves pure.\"",
    "So We saved him and his family, except for his wife; We destined her to be of those who remained behind.",
    "And We rained upon them a rain [of stones], and evil was the rain of those who were warned.",
    "Say, [O Muhammad], \"Praise be to Allah, and peace upon His servants whom He has chosen. Is Allah better or what they associate with Him?\"",
    "[More precisely], is He [not best] who created the heavens and the earth and sent down for you rain from the sky, causing to grow thereby gardens of joyful beauty which you could not [otherwise] have grown the trees thereof? Is there a deity with Allah? [No], but they are a people who ascribe equals [to Him].",
    "Is He [not best] who made the earth a stable ground and placed within it rivers and made for it firmly set mountains and placed between the two seas a barrier? Is there a deity with Allah? [No], but most of them do not know.",
    "Is He [not best] who responds to the desperate one when he calls upon Him and removes evil and makes you inheritors of the earth? Is there a deity with Allah? Little do you remember.",
    "Is He [not best] who guides you through the darknesses of the land and sea and who sends the winds as good tidings before His mercy? Is there a deity with Allah? High is Allah above whatever they associate with Him.",
    "Is He [not best] who begins creation and then repeats it and who provides for you from the heaven and earth? Is there a deity with Allah? Say, \"Produce your proof, if you should be truthful.\"",
    "Say, \"None in the heavens and earth knows the unseen except Allah, and they do not perceive when they will be resurrected.\"",
    "Rather, their knowledge is arrested concerning the Hereafter. Rather, they are in doubt about it. Rather, they are, concerning it, blind.",
    "And those who disbelieve say, \"When we have become dust as well as our forefathers, will we indeed be brought out [of the graves]?",
    "We have been promised this, we and our forefathers, before. This is not but legends of the former peoples.\"",
    "Say, [O Muhammad], \"Travel through the land and observe how was the end of the criminals.\"",
    "And grieve not over them or be in distress from what they conspire.",
    "And they say, \"When is [the fulfillment of] this promise, if you should be truthful?\"",
    "Say, \"Perhaps it is close behind you - some of that for which you are impatient.",
    "And indeed, your Lord is full of bounty for the people, but most of them do not show gratitude.\"",
    "And indeed, your Lord knows what their breasts conceal and what they declare.",
    "And there is nothing concealed within the heaven and the earth except that it is in a clear Register.",
    "Indeed, this Qur'an relates to the Children of Israel most of that over which they disagree.",
    "And indeed, it is guidance and mercy for the believers.",
    "Indeed, your Lord will judge between them by His [wise] judgement. And He is the Exalted in Might, the Knowing.",
    "So rely upon Allah; indeed, you are upon the clear truth.",
    "Indeed, you will not make the dead hear, nor will you make the deaf hear the call when they have turned their backs retreating.",
    "And you cannot guide the blind away from their error. You will only make hear those who believe in Our verses so they are Muslims [submitting to Allah].",
    "And when the word befalls them, We will bring forth for them a creature from the earth speaking to them, [saying] that the people were, of Our verses, not certain [in faith].",
    "And [warn of] the Day when We will gather from every nation a company of those who deny Our signs, and they will be [driven] in rows",
    "Until, when they arrive [at the place of Judgement], He will say, \"Did you deny My signs while you encompassed them not in knowledge, or what [was it that] you were doing?\"",
    "And the decree will befall them for the wrong they did, and they will not [be able to] speak.",
    "Do they not see that We made the night that they may rest therein and the day giving sight? Indeed in that are signs for a people who believe.",
    "And [warn of] the Day the Horn will be blown, and whoever is in the heavens and whoever is on the earth will be terrified except whom Allah wills. And all will come to Him humbled.",
    "And you see the mountains, thinking them rigid, while they will pass as the passing of clouds. [It is] the work of Allah, who perfected all things. Indeed, He is Acquainted with that which you do.",
    "Whoever comes [at Judgement] with a good deed will have better than it, and they, from the terror of that Day, will be safe.",
    "And whoever comes with an evil deed - their faces will be overturned into the Fire, [and it will be said], \"Are you recompensed except for what you used to do?\"",
    "[Say, O Muhammad], \"I have only been commanded to worship the Lord of this city, who made it sacred and to whom [belongs] all things. And I am commanded to be of the Muslims [those who submit to Allah]",
    "And to recite the Qur'an.\" And whoever is guided is only guided for [the benefit of] himself; and whoever strays - say, \"I am only [one] of the warners.\"",
    "And say, \"[All] praise is [due] to Allah. He will show you His signs, and you will recognize them. And your Lord is not unaware of what you do.\""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an__naml);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_an_naml);
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
