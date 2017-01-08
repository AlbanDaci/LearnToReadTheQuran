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

public class Ghafir extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"40:1", "40:2", "40:3", "40:4", "40:5", "40:6", "40:7", "40:8", "40:9", "40:10", "40:11", "40:12", "40:13", "40:14", "40:15", "40:16",
            "40:17", "40:18", "40:19", "40:20", "40:21", "40:22", "40:23", "40:24", "40:25", "40:26", "40:27", "40:28", "40:29", "40:30", "40:31", "40:32",
            "40:33", "40:34", "40:35", "40:36", "40:37", "40:38", "40:39", "40:40", "40:41", "40:42", "40:43", "40:44", "40:45", "40:46", "40:47", "40:48",
            "40:49", "40:50", "40:51", "40:52", "40:53", "40:54", "40:55", "40:56", "40:57", "40:58", "40:59", "40:60", "40:61", "40:62", "40:63", "40:64",
            "40:65", "40:66", "40:67", "40:68", "40:69", "40:70", "40:71", "40:72", "40:73", "40:74", "40:75", "40:76", "40:77", "40:78", "40:79", "40:80",
            "40:81", "40:82", "40:83", "40:84", "40:85"};

    String [] arabic_verses = {"حم",
    "تَنزِيلُ الْكِتَابِ مِنَ اللَّهِ الْعَزِيزِ الْعَلِيمِ",
    "غَافِرِ الذَّنبِ وَقَابِلِ التَّوْبِ شَدِيدِ الْعِقَابِ ذِي الطَّوْلِ ۖ لَا إِلَٰهَ إِلَّا هُوَ ۖ إِلَيْهِ الْمَصِيرُ",
    "مَا يُجَادِلُ فِي آيَاتِ اللَّهِ إِلَّا الَّذِينَ كَفَرُوا فَلَا يَغْرُرْكَ تَقَلُّبُهُمْ فِي الْبِلَادِ",
    "كَذَّبَتْ قَبْلَهُمْ قَوْمُ نُوحٍ وَالْأَحْزَابُ مِن بَعْدِهِمْ ۖ وَهَمَّتْ كُلُّ أُمَّةٍ بِرَسُولِهِمْ لِيَأْخُذُوهُ ۖ وَجَادَلُوا بِالْبَاطِلِ لِيُدْحِضُوا بِهِ الْحَقَّ فَأَخَذْتُهُمْ ۖ فَكَيْفَ كَانَ عِقَابِ",
    "وَكَذَٰلِكَ حَقَّتْ كَلِمَتُ رَبِّكَ عَلَى الَّذِينَ كَفَرُوا أَنَّهُمْ أَصْحَابُ النَّارِ",
    "الَّذِينَ يَحْمِلُونَ الْعَرْشَ وَمَنْ حَوْلَهُ يُسَبِّحُونَ بِحَمْدِ رَبِّهِمْ وَيُؤْمِنُونَ بِهِ وَيَسْتَغْفِرُونَ لِلَّذِينَ آمَنُوا رَبَّنَا وَسِعْتَ كُلَّ شَيْءٍ رَّحْمَةً وَعِلْمًا فَاغْفِرْ لِلَّذِينَ تَابُوا وَاتَّبَعُوا سَبِيلَكَ وَقِهِمْ عَذَابَ الْجَحِيمِ",
    "رَبَّنَا وَأَدْخِلْهُمْ جَنَّاتِ عَدْنٍ الَّتِي وَعَدتَّهُمْ وَمَن صَلَحَ مِنْ آبَائِهِمْ وَأَزْوَاجِهِمْ وَذُرِّيَّاتِهِمْ ۚ إِنَّكَ أَنتَ الْعَزِيزُ الْحَكِيمُ",
    "وَقِهِمُ السَّيِّئَاتِ ۚ وَمَن تَقِ السَّيِّئَاتِ يَوْمَئِذٍ فَقَدْ رَحِمْتَهُ ۚ وَذَٰلِكَ هُوَ الْفَوْزُ الْعَظِيمُ",
    "إِنَّ الَّذِينَ كَفَرُوا يُنَادَوْنَ لَمَقْتُ اللَّهِ أَكْبَرُ مِن مَّقْتِكُمْ أَنفُسَكُمْ إِذْ تُدْعَوْنَ إِلَى الْإِيمَانِ فَتَكْفُرُونَ",
    "قَالُوا رَبَّنَا أَمَتَّنَا اثْنَتَيْنِ وَأَحْيَيْتَنَا اثْنَتَيْنِ فَاعْتَرَفْنَا بِذُنُوبِنَا فَهَلْ إِلَىٰ خُرُوجٍ مِّن سَبِيلٍ",
    "ذَٰلِكُم بِأَنَّهُ إِذَا دُعِيَ اللَّهُ وَحْدَهُ كَفَرْتُمْ ۖ وَإِن يُشْرَكْ بِهِ تُؤْمِنُوا ۚ فَالْحُكْمُ لِلَّهِ الْعَلِيِّ الْكَبِيرِ",
    "هُوَ الَّذِي يُرِيكُمْ آيَاتِهِ وَيُنَزِّلُ لَكُم مِّنَ السَّمَاءِ رِزْقًا ۚ وَمَا يَتَذَكَّرُ إِلَّا مَن يُنِيبُ",
    "فَادْعُوا اللَّهَ مُخْلِصِينَ لَهُ الدِّينَ وَلَوْ كَرِهَ الْكَافِرُونَ",
    "رَفِيعُ الدَّرَجَاتِ ذُو الْعَرْشِ يُلْقِي الرُّوحَ مِنْ أَمْرِهِ عَلَىٰ مَن يَشَاءُ مِنْ عِبَادِهِ لِيُنذِرَ يَوْمَ التَّلَاقِ",
    "يَوْمَ هُم بَارِزُونَ ۖ لَا يَخْفَىٰ عَلَى اللَّهِ مِنْهُمْ شَيْءٌ ۚ لِّمَنِ الْمُلْكُ الْيَوْمَ ۖ لِلَّهِ الْوَاحِدِ الْقَهَّارِ",
    "الْيَوْمَ تُجْزَىٰ كُلُّ نَفْسٍ بِمَا كَسَبَتْ ۚ لَا ظُلْمَ الْيَوْمَ ۚ إِنَّ اللَّهَ سَرِيعُ الْحِسَابِ",
    "وَأَنذِرْهُمْ يَوْمَ الْآزِفَةِ إِذِ الْقُلُوبُ لَدَى الْحَنَاجِرِ كَاظِمِينَ ۚ مَا لِلظَّالِمِينَ مِنْ حَمِيمٍ وَلَا شَفِيعٍ يُطَاعُ",
    "يَعْلَمُ خَائِنَةَ الْأَعْيُنِ وَمَا تُخْفِي الصُّدُورُ",
    "وَاللَّهُ يَقْضِي بِالْحَقِّ ۖ وَالَّذِينَ يَدْعُونَ مِن دُونِهِ لَا يَقْضُونَ بِشَيْءٍ ۗ إِنَّ اللَّهَ هُوَ السَّمِيعُ الْبَصِيرُ",
    "أَوَلَمْ يَسِيرُوا فِي الْأَرْضِ فَيَنظُرُوا كَيْفَ كَانَ عَاقِبَةُ الَّذِينَ كَانُوا مِن قَبْلِهِمْ ۚ كَانُوا هُمْ أَشَدَّ مِنْهُمْ قُوَّةً وَآثَارًا فِي الْأَرْضِ فَأَخَذَهُمُ اللَّهُ بِذُنُوبِهِمْ وَمَا كَانَ لَهُم مِّنَ اللَّهِ مِن وَاقٍ",
    "ذَٰلِكَ بِأَنَّهُمْ كَانَت تَّأْتِيهِمْ رُسُلُهُم بِالْبَيِّنَاتِ فَكَفَرُوا فَأَخَذَهُمُ اللَّهُ ۚ إِنَّهُ قَوِيٌّ شَدِيدُ الْعِقَابِ",
    "وَلَقَدْ أَرْسَلْنَا مُوسَىٰ بِآيَاتِنَا وَسُلْطَانٍ مُّبِينٍ",
    "إِلَىٰ فِرْعَوْنَ وَهَامَانَ وَقَارُونَ فَقَالُوا سَاحِرٌ كَذَّابٌ",
    "فَلَمَّا جَاءَهُم بِالْحَقِّ مِنْ عِندِنَا قَالُوا اقْتُلُوا أَبْنَاءَ الَّذِينَ آمَنُوا مَعَهُ وَاسْتَحْيُوا نِسَاءَهُمْ ۚ وَمَا كَيْدُ الْكَافِرِينَ إِلَّا فِي ضَلَالٍ",
    "وَقَالَ فِرْعَوْنُ ذَرُونِي أَقْتُلْ مُوسَىٰ وَلْيَدْعُ رَبَّهُ ۖ إِنِّي أَخَافُ أَن يُبَدِّلَ دِينَكُمْ أَوْ أَن يُظْهِرَ فِي الْأَرْضِ الْفَسَادَ",
    "وَقَالَ مُوسَىٰ إِنِّي عُذْتُ بِرَبِّي وَرَبِّكُم مِّن كُلِّ مُتَكَبِّرٍ لَّا يُؤْمِنُ بِيَوْمِ الْحِسَابِ",
    "وَقَالَ رَجُلٌ مُّؤْمِنٌ مِّنْ آلِ فِرْعَوْنَ يَكْتُمُ إِيمَانَهُ أَتَقْتُلُونَ رَجُلًا أَن يَقُولَ رَبِّيَ اللَّهُ وَقَدْ جَاءَكُم بِالْبَيِّنَاتِ مِن رَّبِّكُمْ ۖ وَإِن يَكُ كَاذِبًا فَعَلَيْهِ كَذِبُهُ ۖ وَإِن يَكُ صَادِقًا يُصِبْكُم بَعْضُ الَّذِي يَعِدُكُمْ ۖ إِنَّ اللَّهَ لَا يَهْدِي مَنْ هُوَ مُسْرِفٌ كَذَّابٌ",
    "يَا قَوْمِ لَكُمُ الْمُلْكُ الْيَوْمَ ظَاهِرِينَ فِي الْأَرْضِ فَمَن يَنصُرُنَا مِن بَأْسِ اللَّهِ إِن جَاءَنَا ۚ قَالَ فِرْعَوْنُ مَا أُرِيكُمْ إِلَّا مَا أَرَىٰ وَمَا أَهْدِيكُمْ إِلَّا سَبِيلَ الرَّشَادِ",
    "وَقَالَ الَّذِي آمَنَ يَا قَوْمِ إِنِّي أَخَافُ عَلَيْكُم مِّثْلَ يَوْمِ الْأَحْزَابِ",
    "مِثْلَ دَأْبِ قَوْمِ نُوحٍ وَعَادٍ وَثَمُودَ وَالَّذِينَ مِن بَعْدِهِمْ ۚ وَمَا اللَّهُ يُرِيدُ ظُلْمًا لِّلْعِبَادِ",
    "وَيَا قَوْمِ إِنِّي أَخَافُ عَلَيْكُمْ يَوْمَ التَّنَادِ",
    "يَوْمَ تُوَلُّونَ مُدْبِرِينَ مَا لَكُم مِّنَ اللَّهِ مِنْ عَاصِمٍ ۗ وَمَن يُضْلِلِ اللَّهُ فَمَا لَهُ مِنْ هَادٍ",
    "وَلَقَدْ جَاءَكُمْ يُوسُفُ مِن قَبْلُ بِالْبَيِّنَاتِ فَمَا زِلْتُمْ فِي شَكٍّ مِّمَّا جَاءَكُم بِهِ ۖ حَتَّىٰ إِذَا هَلَكَ قُلْتُمْ لَن يَبْعَثَ اللَّهُ مِن بَعْدِهِ رَسُولًا ۚ كَذَٰلِكَ يُضِلُّ اللَّهُ مَنْ هُوَ مُسْرِفٌ مُّرْتَابٌ",
    "الَّذِينَ يُجَادِلُونَ فِي آيَاتِ اللَّهِ بِغَيْرِ سُلْطَانٍ أَتَاهُمْ ۖ كَبُرَ مَقْتًا عِندَ اللَّهِ وَعِندَ الَّذِينَ آمَنُوا ۚ كَذَٰلِكَ يَطْبَعُ اللَّهُ عَلَىٰ كُلِّ قَلْبِ مُتَكَبِّرٍ جَبَّارٍ",
    "وَقَالَ فِرْعَوْنُ يَا هَامَانُ ابْنِ لِي صَرْحًا لَّعَلِّي أَبْلُغُ الْأَسْبَابَ",
    "أَسْبَابَ السَّمَاوَاتِ فَأَطَّلِعَ إِلَىٰ إِلَٰهِ مُوسَىٰ وَإِنِّي لَأَظُنُّهُ كَاذِبًا ۚ وَكَذَٰلِكَ زُيِّنَ لِفِرْعَوْنَ سُوءُ عَمَلِهِ وَصُدَّ عَنِ السَّبِيلِ ۚ وَمَا كَيْدُ فِرْعَوْنَ إِلَّا فِي تَبَابٍ",
    "وَقَالَ الَّذِي آمَنَ يَا قَوْمِ اتَّبِعُونِ أَهْدِكُمْ سَبِيلَ الرَّشَادِ",
    "يَا قَوْمِ إِنَّمَا هَٰذِهِ الْحَيَاةُ الدُّنْيَا مَتَاعٌ وَإِنَّ الْآخِرَةَ هِيَ دَارُ الْقَرَارِ",
    "مَنْ عَمِلَ سَيِّئَةً فَلَا يُجْزَىٰ إِلَّا مِثْلَهَا ۖ وَمَنْ عَمِلَ صَالِحًا مِّن ذَكَرٍ أَوْ أُنثَىٰ وَهُوَ مُؤْمِنٌ فَأُولَٰئِكَ يَدْخُلُونَ الْجَنَّةَ يُرْزَقُونَ فِيهَا بِغَيْرِ حِسَابٍ",
    "وَيَا قَوْمِ مَا لِي أَدْعُوكُمْ إِلَى النَّجَاةِ وَتَدْعُونَنِي إِلَى النَّارِ",
    "تَدْعُونَنِي لِأَكْفُرَ بِاللَّهِ وَأُشْرِكَ بِهِ مَا لَيْسَ لِي بِهِ عِلْمٌ وَأَنَا أَدْعُوكُمْ إِلَى الْعَزِيزِ الْغَفَّارِ",
    "لَا جَرَمَ أَنَّمَا تَدْعُونَنِي إِلَيْهِ لَيْسَ لَهُ دَعْوَةٌ فِي الدُّنْيَا وَلَا فِي الْآخِرَةِ وَأَنَّ مَرَدَّنَا إِلَى اللَّهِ وَأَنَّ الْمُسْرِفِينَ هُمْ أَصْحَابُ النَّارِ",
    "فَسَتَذْكُرُونَ مَا أَقُولُ لَكُمْ ۚ وَأُفَوِّضُ أَمْرِي إِلَى اللَّهِ ۚ إِنَّ اللَّهَ بَصِيرٌ بِالْعِبَادِ",
    "فَوَقَاهُ اللَّهُ سَيِّئَاتِ مَا مَكَرُوا ۖ وَحَاقَ بِآلِ فِرْعَوْنَ سُوءُ الْعَذَابِ",
    "النَّارُ يُعْرَضُونَ عَلَيْهَا غُدُوًّا وَعَشِيًّا ۖ وَيَوْمَ تَقُومُ السَّاعَةُ أَدْخِلُوا آلَ فِرْعَوْنَ أَشَدَّ الْعَذَابِ",
    "وَإِذْ يَتَحَاجُّونَ فِي النَّارِ فَيَقُولُ الضُّعَفَاءُ لِلَّذِينَ اسْتَكْبَرُوا إِنَّا كُنَّا لَكُمْ تَبَعًا فَهَلْ أَنتُم مُّغْنُونَ عَنَّا نَصِيبًا مِّنَ النَّارِ",
    "قَالَ الَّذِينَ اسْتَكْبَرُوا إِنَّا كُلٌّ فِيهَا إِنَّ اللَّهَ قَدْ حَكَمَ بَيْنَ الْعِبَادِ",
    "وَقَالَ الَّذِينَ فِي النَّارِ لِخَزَنَةِ جَهَنَّمَ ادْعُوا رَبَّكُمْ يُخَفِّفْ عَنَّا يَوْمًا مِّنَ الْعَذَابِ",
    "قَالُوا أَوَلَمْ تَكُ تَأْتِيكُمْ رُسُلُكُم بِالْبَيِّنَاتِ ۖ قَالُوا بَلَىٰ ۚ قَالُوا فَادْعُوا ۗ وَمَا دُعَاءُ الْكَافِرِينَ إِلَّا فِي ضَلَالٍ",
    "إِنَّا لَنَنصُرُ رُسُلَنَا وَالَّذِينَ آمَنُوا فِي الْحَيَاةِ الدُّنْيَا وَيَوْمَ يَقُومُ الْأَشْهَادُ",
    "يَوْمَ لَا يَنفَعُ الظَّالِمِينَ مَعْذِرَتُهُمْ ۖ وَلَهُمُ اللَّعْنَةُ وَلَهُمْ سُوءُ الدَّارِ",
    "وَلَقَدْ آتَيْنَا مُوسَى الْهُدَىٰ وَأَوْرَثْنَا بَنِي إِسْرَائِيلَ الْكِتَابَ",
    "هُدًى وَذِكْرَىٰ لِأُولِي الْأَلْبَابِ",
    "فَاصْبِرْ إِنَّ وَعْدَ اللَّهِ حَقٌّ وَاسْتَغْفِرْ لِذَنبِكَ وَسَبِّحْ بِحَمْدِ رَبِّكَ بِالْعَشِيِّ وَالْإِبْكَارِ",
    "إِنَّ الَّذِينَ يُجَادِلُونَ فِي آيَاتِ اللَّهِ بِغَيْرِ سُلْطَانٍ أَتَاهُمْ ۙ إِن فِي صُدُورِهِمْ إِلَّا كِبْرٌ مَّا هُم بِبَالِغِيهِ ۚ فَاسْتَعِذْ بِاللَّهِ ۖ إِنَّهُ هُوَ السَّمِيعُ الْبَصِيرُ",
    "لَخَلْقُ السَّمَاوَاتِ وَالْأَرْضِ أَكْبَرُ مِنْ خَلْقِ النَّاسِ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ",
    "وَمَا يَسْتَوِي الْأَعْمَىٰ وَالْبَصِيرُ وَالَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ وَلَا الْمُسِيءُ ۚ قَلِيلًا مَّا تَتَذَكَّرُونَ",
    "إِنَّ السَّاعَةَ لَآتِيَةٌ لَّا رَيْبَ فِيهَا وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يُؤْمِنُونَ",
    "وَقَالَ رَبُّكُمُ ادْعُونِي أَسْتَجِبْ لَكُمْ ۚ إِنَّ الَّذِينَ يَسْتَكْبِرُونَ عَنْ عِبَادَتِي سَيَدْخُلُونَ جَهَنَّمَ دَاخِرِينَ",
    "اللَّهُ الَّذِي جَعَلَ لَكُمُ اللَّيْلَ لِتَسْكُنُوا فِيهِ وَالنَّهَارَ مُبْصِرًا ۚ إِنَّ اللَّهَ لَذُو فَضْلٍ عَلَى النَّاسِ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يَشْكُرُونَ",
    "ذَٰلِكُمُ اللَّهُ رَبُّكُمْ خَالِقُ كُلِّ شَيْءٍ لَّا إِلَٰهَ إِلَّا هُوَ ۖ فَأَنَّىٰ تُؤْفَكُونَ",
    "كَذَٰلِكَ يُؤْفَكُ الَّذِينَ كَانُوا بِآيَاتِ اللَّهِ يَجْحَدُونَ",
    "اللَّهُ الَّذِي جَعَلَ لَكُمُ الْأَرْضَ قَرَارًا وَالسَّمَاءَ بِنَاءً وَصَوَّرَكُمْ فَأَحْسَنَ صُوَرَكُمْ وَرَزَقَكُم مِّنَ الطَّيِّبَاتِ ۚ ذَٰلِكُمُ اللَّهُ رَبُّكُمْ ۖ فَتَبَارَكَ اللَّهُ رَبُّ الْعَالَمِينَ",
    "هُوَ الْحَيُّ لَا إِلَٰهَ إِلَّا هُوَ فَادْعُوهُ مُخْلِصِينَ لَهُ الدِّينَ ۗ الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ",
    "قُلْ إِنِّي نُهِيتُ أَنْ أَعْبُدَ الَّذِينَ تَدْعُونَ مِن دُونِ اللَّهِ لَمَّا جَاءَنِيَ الْبَيِّنَاتُ مِن رَّبِّي وَأُمِرْتُ أَنْ أُسْلِمَ لِرَبِّ الْعَالَمِينَ",
    "هُوَ الَّذِي خَلَقَكُم مِّن تُرَابٍ ثُمَّ مِن نُّطْفَةٍ ثُمَّ مِنْ عَلَقَةٍ ثُمَّ يُخْرِجُكُمْ طِفْلًا ثُمَّ لِتَبْلُغُوا أَشُدَّكُمْ ثُمَّ لِتَكُونُوا شُيُوخًا ۚ وَمِنكُم مَّن يُتَوَفَّىٰ مِن قَبْلُ ۖ وَلِتَبْلُغُوا أَجَلًا مُّسَمًّى وَلَعَلَّكُمْ تَعْقِلُونَ",
    "هُوَ الَّذِي يُحْيِي وَيُمِيتُ ۖ فَإِذَا قَضَىٰ أَمْرًا فَإِنَّمَا يَقُولُ لَهُ كُن فَيَكُونُ",
    "أَلَمْ تَرَ إِلَى الَّذِينَ يُجَادِلُونَ فِي آيَاتِ اللَّهِ أَنَّىٰ يُصْرَفُونَ",
    "الَّذِينَ كَذَّبُوا بِالْكِتَابِ وَبِمَا أَرْسَلْنَا بِهِ رُسُلَنَا ۖ فَسَوْفَ يَعْلَمُونَ",
    "إِذِ الْأَغْلَالُ فِي أَعْنَاقِهِمْ وَالسَّلَاسِلُ يُسْحَبُونَ",
    "فِي الْحَمِيمِ ثُمَّ فِي النَّارِ يُسْجَرُونَ",
    "ثُمَّ قِيلَ لَهُمْ أَيْنَ مَا كُنتُمْ تُشْرِكُونَ",
    "مِن دُونِ اللَّهِ ۖ قَالُوا ضَلُّوا عَنَّا بَل لَّمْ نَكُن نَّدْعُو مِن قَبْلُ شَيْئًا ۚ كَذَٰلِكَ يُضِلُّ اللَّهُ الْكَافِرِينَ",
    "ذَٰلِكُم بِمَا كُنتُمْ تَفْرَحُونَ فِي الْأَرْضِ بِغَيْرِ الْحَقِّ وَبِمَا كُنتُمْ تَمْرَحُونَ",
    "ادْخُلُوا أَبْوَابَ جَهَنَّمَ خَالِدِينَ فِيهَا ۖ فَبِئْسَ مَثْوَى الْمُتَكَبِّرِينَ",
    "فَاصْبِرْ إِنَّ وَعْدَ اللَّهِ حَقٌّ ۚ فَإِمَّا نُرِيَنَّكَ بَعْضَ الَّذِي نَعِدُهُمْ أَوْ نَتَوَفَّيَنَّكَ فَإِلَيْنَا يُرْجَعُونَ",
    "وَلَقَدْ أَرْسَلْنَا رُسُلًا مِّن قَبْلِكَ مِنْهُم مَّن قَصَصْنَا عَلَيْكَ وَمِنْهُم مَّن لَّمْ نَقْصُصْ عَلَيْكَ ۗ وَمَا كَانَ لِرَسُولٍ أَن يَأْتِيَ بِآيَةٍ إِلَّا بِإِذْنِ اللَّهِ ۚ فَإِذَا جَاءَ أَمْرُ اللَّهِ قُضِيَ بِالْحَقِّ وَخَسِرَ هُنَالِكَ الْمُبْطِلُونَ",
    "اللَّهُ الَّذِي جَعَلَ لَكُمُ الْأَنْعَامَ لِتَرْكَبُوا مِنْهَا وَمِنْهَا تَأْكُلُونَ",
    "وَلَكُمْ فِيهَا مَنَافِعُ وَلِتَبْلُغُوا عَلَيْهَا حَاجَةً فِي صُدُورِكُمْ وَعَلَيْهَا وَعَلَى الْفُلْكِ تُحْمَلُونَ",
    "وَيُرِيكُمْ آيَاتِهِ فَأَيَّ آيَاتِ اللَّهِ تُنكِرُونَ",
    "أَفَلَمْ يَسِيرُوا فِي الْأَرْضِ فَيَنظُرُوا كَيْفَ كَانَ عَاقِبَةُ الَّذِينَ مِن قَبْلِهِمْ ۚ كَانُوا أَكْثَرَ مِنْهُمْ وَأَشَدَّ قُوَّةً وَآثَارًا فِي الْأَرْضِ فَمَا أَغْنَىٰ عَنْهُم مَّا كَانُوا يَكْسِبُونَ",
    "فَلَمَّا جَاءَتْهُمْ رُسُلُهُم بِالْبَيِّنَاتِ فَرِحُوا بِمَا عِندَهُم مِّنَ الْعِلْمِ وَحَاقَ بِهِم مَّا كَانُوا بِهِ يَسْتَهْزِئُونَ",
    "فَلَمَّا رَأَوْا بَأْسَنَا قَالُوا آمَنَّا بِاللَّهِ وَحْدَهُ وَكَفَرْنَا بِمَا كُنَّا بِهِ مُشْرِكِينَ",
    "فَلَمْ يَكُ يَنفَعُهُمْ إِيمَانُهُمْ لَمَّا رَأَوْا بَأْسَنَا ۖ سُنَّتَ اللَّهِ الَّتِي قَدْ خَلَتْ فِي عِبَادِهِ ۖ وَخَسِرَ هُنَالِكَ الْكَافِرُونَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"Ha, Meem.",
    "The revelation of the Book is from Allah, the Exalted in Might, the Knowing.",
    "The forgiver of sin, acceptor of repentance, severe in punishment, owner of abundance. There is no deity except Him; to Him is the destination.",
    "No one disputes concerning the signs of Allah except those who disbelieve, so be not deceived by their [uninhibited] movement throughout the land.",
    "The people of Noah denied before them and the [disbelieving] factions after them, and every nation intended [a plot] for their messenger to seize him, and they disputed by [using] falsehood to [attempt to] invalidate thereby the truth. So I seized them, and how [terrible] was My penalty.",
    "And thus has the word of your Lord come into effect upon those who disbelieved that they are companions of the Fire.",
    "Those [angels] who carry the Throne and those around it exalt [Allah] with praise of their Lord and believe in Him and ask forgiveness for those who have believed, [saying], \"Our Lord, You have encompassed all things in mercy and knowledge, so forgive those who have repented and followed Your way and protect them from the punishment of Hellfire.",
    "Our Lord, and admit them to gardens of perpetual residence which You have promised them and whoever was righteous among their fathers, their spouses and their offspring. Indeed, it is You who is the Exalted in Might, the Wise.",
    "And protect them from the evil consequences [of their deeds]. And he whom You protect from evil consequences that Day - You will have given him mercy. And that is the great attainment.\"",
    "Indeed, those who disbelieve will be addressed, \"The hatred of Allah for you was [even] greater than your hatred of yourselves [this Day in Hell] when you were invited to faith, but you refused.\"",
    "They will say, \"Our Lord, You made us lifeless twice and gave us life twice, and we have confessed our sins. So is there to an exit any way?\"",
    "[They will be told], \"That is because, when Allah was called upon alone, you disbelieved; but if others were associated with Him, you believed. So the judgement is with Allah, the Most High, the Grand.\"",
    "It is He who shows you His signs and sends down to you from the sky, provision. But none will remember except he who turns back [in repentance].",
    "So invoke Allah, [being] sincere to Him in religion, although the disbelievers dislike it.",
    "[He is] the Exalted above [all] degrees, Owner of the Throne; He places the inspiration of His command upon whom He wills of His servants to warn of the Day of Meeting.",
    "The Day they come forth nothing concerning them will be concealed from Allah. To whom belongs [all] sovereignty this Day? To Allah, the One, the Prevailing.",
    "This Day every soul will be recompensed for what it earned. No injustice today! Indeed, Allah is swift in account.",
    "And warn them, [O Muhammad], of the Approaching Day, when hearts are at the throats, filled [with distress]. For the wrongdoers there will be no devoted friend and no intercessor [who is] obeyed.",
    "He knows that which deceives the eyes and what the breasts conceal.",
    "And Allah judges with truth, while those they invoke besides Him judge not with anything. Indeed, Allah - He is the Hearing, the Seeing.",
    "Have they not traveled through the land and observed how was the end of those who were before them? They were greater than them in strength and in impression on the land, but Allah seized them for their sins. And they had not from Allah any protector.",
    "That was because their messengers were coming to them with clear proofs, but they disbelieved, so Allah seized them. Indeed, He is Powerful and severe in punishment.",
    "And We did certainly send Moses with Our signs and a clear authority",
    "To Pharaoh, Haman and Qarun; but they said, \"[He is] a magician and a liar.\"",
    "And when he brought them the truth from Us, they said, \"Kill the sons of those who have believed with him and keep their women alive.\" But the plan of the disbelievers is not except in error.",
    "And Pharaoh said, \"Let me kill Moses and let him call upon his Lord. Indeed, I fear that he will change your religion or that he will cause corruption in the land.\"",
    "But Moses said, \"Indeed, I have sought refuge in my Lord and your Lord from every arrogant one who does not believe in the Day of Account.\"",
    "And a believing man from the family of Pharaoh who concealed his faith said, \"Do you kill a man [merely] because he says, 'My Lord is Allah' while he has brought you clear proofs from your Lord? And if he should be lying, then upon him is [the consequence of] his lie; but if he should be truthful, there will strike you some of what he promises you. Indeed, Allah does not guide one who is a transgressor and a liar.",
    "O my people, sovereignty is yours today, [your being] dominant in the land. But who would protect us from the punishment of Allah if it came to us?\" Pharaoh said, \"I do not show you except what I see, and I do not guide you except to the way of right conduct.\"",
    "And he who believed said, \"O my people, indeed I fear for you [a fate] like the day of the companies -",
    "Like the custom of the people of Noah and of 'Aad and Thamud and those after them. And Allah wants no injustice for [His] servants.",
    "And O my people, indeed I fear for you the Day of Calling -",
    "The Day you will turn your backs fleeing; there is not for you from Allah any protector. And whoever Allah leaves astray - there is not for him any guide.",
    "And Joseph had already come to you before with clear proofs, but you remained in doubt of that which he brought to you, until when he died, you said, 'Never will Allah send a messenger after him.' Thus does Allah leave astray he who is a transgressor and skeptic.\"",
    "Those who dispute concerning the signs of Allah without an authority having come to them - great is hatred [of them] in the sight of Allah and in the sight of those who have believed. Thus does Allah seal over every heart [belonging to] an arrogant tyrant.",
    "And Pharaoh said, \"O Haman, construct for me a tower that I might reach the ways -",
    "The ways into the heavens - so that I may look at the deity of Moses; but indeed, I think he is a liar.\" And thus was made attractive to Pharaoh the evil of his deed, and he was averted from the [right] way. And the plan of Pharaoh was not except in ruin.",
    "And he who believed said, \"O my people, follow me, I will guide you to the way of right conduct.",
    "O my people, this worldly life is only [temporary] enjoyment, and indeed, the Hereafter - that is the home of [permanent] settlement.",
    "Whoever does an evil deed will not be recompensed except by the like thereof; but whoever does righteousness, whether male or female, while he is a believer - those will enter Paradise, being given provision therein without account.",
    "And O my people, how is it that I invite you to salvation while you invite me to the Fire?",
    "You invite me to disbelieve in Allah and associate with Him that of which I have no knowledge, and I invite you to the Exalted in Might, the Perpetual Forgiver.",
    "Assuredly, that to which you invite me has no [response to a] supplication in this world or in the Hereafter; and indeed, our return is to Allah, and indeed, the transgressors will be companions of the Fire.",
    "And you will remember what I [now] say to you, and I entrust my affair to Allah. Indeed, Allah is Seeing of [His] servants.\"",
    "So Allah protected him from the evils they plotted, and the people of Pharaoh were enveloped by the worst of punishment -",
    "The Fire, they are exposed to it morning and evening. And the Day the Hour appears [it will be said], \"Make the people of Pharaoh enter the severest punishment.\"",
    "And [mention] when they will argue within the Fire, and the weak will say to those who had been arrogant, \"Indeed, we were [only] your followers, so will you relieve us of a share of the Fire?\"",
    "Those who had been arrogant will say, \"Indeed, all [of us] are in it. Indeed, Allah has judged between the servants.\"",
    "And those in the Fire will say to the keepers of Hell, \"Supplicate your Lord to lighten for us a day from the punishment.\"",
    "They will say, \"Did there not come to you your messengers with clear proofs?\" They will say, \"Yes.\" They will reply, \"Then supplicate [yourselves], but the supplication of the disbelievers is not except in error.\"",
    "Indeed, We will support Our messengers and those who believe during the life of this world and on the Day when the witnesses will stand -",
    "The Day their excuse will not benefit the wrongdoers, and they will have the curse, and they will have the worst home.",
    "And We had certainly given Moses guidance, and We caused the Children of Israel to inherit the Scripture",
    "As guidance and a reminder for those of understanding.",
    "So be patient, [O Muhammad]. Indeed, the promise of Allah is truth. And ask forgiveness for your sin and exalt [Allah] with praise of your Lord in the evening and the morning.",
    "Indeed, those who dispute concerning the signs of Allah without [any] authority having come to them - there is not within their breasts except pride, [the extent of] which they cannot reach. So seek refuge in Allah. Indeed, it is He who is the Hearing, the Seeing.",
    "The creation of the heavens and earth is greater than the creation of mankind, but most of the people do not know.",
    "And not equal are the blind and the seeing, nor are those who believe and do righteous deeds and the evildoer. Little do you remember.",
    "Indeed, the Hour is coming - no doubt about it - but most of the people do not believe.",
    "And your Lord says, \"Call upon Me; I will respond to you.\" Indeed, those who disdain My worship will enter Hell [rendered] contemptible.",
    "It is Allah who made for you the night that you may rest therein and the day giving sight. Indeed, Allah is full of bounty to the people, but most of the people are not grateful.",
    "That is Allah, your Lord, Creator of all things; there is no deity except Him, so how are you deluded?",
    "Thus were those [before you] deluded who were rejecting the signs of Allah.",
    "It is Allah who made for you the earth a place of settlement and the sky a ceiling and formed you and perfected your forms and provided you with good things. That is Allah, your Lord; then blessed is Allah, Lord of the worlds.",
    "He is the Ever-Living; there is no deity except Him, so call upon Him, [being] sincere to Him in religion. [All] praise is [due] to Allah, Lord of the worlds.",
    "Say, [O Muhammad], \"Indeed, I have been forbidden to worship those you call upon besides Allah once the clear proofs have come to me from my Lord, and I have been commanded to submit to the Lord of the worlds.\"",
    "It is He who created you from dust, then from a sperm-drop, then from a clinging clot; then He brings you out as a child; then [He develops you] that you reach your [time of] maturity, then [further] that you become elders. And among you is he who is taken in death before [that], so that you reach a specified term; and perhaps you will use reason.",
    "He it is who gives life and causes death; and when He decrees a matter, He but says to it, \"Be,\" and it is.",
    "Do you not consider those who dispute concerning the signs of Allah - how are they averted?",
    "Those who deny the Book and that with which We sent Our messengers - they are going to know,",
    "When the shackles are around their necks and the chains; they will be dragged",
    "In boiling water; then in the Fire they will be filled [with flame].",
    "Then it will be said to them, \"Where is that which you used to associate [with Him in worship]",
    "Other than Allah?\" They will say, \"They have departed from us; rather, we did not used to invoke previously anything.\" Thus does Allah put astray the disbelievers.",
    "[The angels will say], \"That was because you used to exult upon the earth without right and you used to behave insolently.",
    "Enter the gates of Hell to abide eternally therein, and wretched is the residence of the arrogant.\"",
    "So be patient, [O Muhammad]; indeed, the promise of Allah is truth. And whether We show you some of what We have promised them or We take you in death, it is to Us they will be returned.",
    "And We have already sent messengers before you. Among them are those [whose stories] We have related to you, and among them are those [whose stories] We have not related to you. And it was not for any messenger to bring a sign [or verse] except by permission of Allah. So when the command of Allah comes, it will be concluded in truth, and the falsifiers will thereupon lose [all].",
    "It is Allah who made for you the grazing animals upon which you ride, and some of them you eat.",
    "And for you therein are [other] benefits and that you may realize upon them a need which is in your breasts; and upon them and upon ships you are carried.",
    "And He shows you His signs. So which of the signs of Allah do you deny?",
    "Have they not traveled through the land and observed how was the end of those before them? They were more numerous than themselves and greater in strength and in impression on the land, but they were not availed by what they used to earn.",
    "And when their messengers came to them with clear proofs, they [merely] rejoiced in what they had of knowledge, but they were enveloped by what they used to ridicule.",
    "And when they saw Our punishment, they said,\" We believe in Allah alone and disbelieve in that which we used to associate with Him.\"",
    "But never did their faith benefit them once they saw Our punishment. [It is] the established way of Allah which has preceded among His servants. And the disbelievers thereupon lost [all]."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghafir);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ghafir);
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
