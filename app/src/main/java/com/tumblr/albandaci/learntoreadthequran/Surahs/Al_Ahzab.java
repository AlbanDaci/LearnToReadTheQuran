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

public class Al_Ahzab extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"33:1", "33:2", "33:3", "33:4", "33:5", "33:6", "33:7", "33:8", "33:9", "33:10", "33:11", "33:12", "33:13", "33:14", "33:15", "33:16",
            "33:17", "33:18", "33:19", "33:20", "33:21", "33:22", "33:23", "33:24", "33:25", "33:26", "33:27", "33:28", "33:29", "33:30", "33:31", "33:32",
            "33:33", "33:34", "33:35", "33:36", "33:37", "33:38", "33:39", "33:40", "33:41", "33:42", "33:43", "33:44", "33:45", "33:46", "33:47", "33:48",
            "33:49", "33:50", "33:51", "33:52", "33:53", "33:54", "33:55", "33:56", "33:57", "33:58", "33:59", "33:60", "33:61", "33:62", "33:63", "33:64",
            "33:65", "33:66", "33:67", "33:68", "33:69", "33:70", "33:71", "33:72", "33:73"};

    String [] arabic_verses = {"يَا أَيُّهَا النَّبِيُّ اتَّقِ اللَّهَ وَلَا تُطِعِ الْكَافِرِينَ وَالْمُنَافِقِينَ ۗ إِنَّ اللَّهَ كَانَ عَلِيمًا حَكِيمًا",
    "وَاتَّبِعْ مَا يُوحَىٰ إِلَيْكَ مِن رَّبِّكَ ۚ إِنَّ اللَّهَ كَانَ بِمَا تَعْمَلُونَ خَبِيرًا",
    "وَتَوَكَّلْ عَلَى اللَّهِ ۚ وَكَفَىٰ بِاللَّهِ وَكِيلًا",
    "مَّا جَعَلَ اللَّهُ لِرَجُلٍ مِّن قَلْبَيْنِ فِي جَوْفِهِ ۚ وَمَا جَعَلَ أَزْوَاجَكُمُ اللَّائِي تُظَاهِرُونَ مِنْهُنَّ أُمَّهَاتِكُمْ ۚ وَمَا جَعَلَ أَدْعِيَاءَكُمْ أَبْنَاءَكُمْ ۚ ذَٰلِكُمْ قَوْلُكُم بِأَفْوَاهِكُمْ ۖ وَاللَّهُ يَقُولُ الْحَقَّ وَهُوَ يَهْدِي السَّبِيلَ",
    "ادْعُوهُمْ لِآبَائِهِمْ هُوَ أَقْسَطُ عِندَ اللَّهِ ۚ فَإِن لَّمْ تَعْلَمُوا آبَاءَهُمْ فَإِخْوَانُكُمْ فِي الدِّينِ وَمَوَالِيكُمْ ۚ وَلَيْسَ عَلَيْكُمْ جُنَاحٌ فِيمَا أَخْطَأْتُم بِهِ وَلَٰكِن مَّا تَعَمَّدَتْ قُلُوبُكُمْ ۚ وَكَانَ اللَّهُ غَفُورًا رَّحِيمًا",
    "النَّبِيُّ أَوْلَىٰ بِالْمُؤْمِنِينَ مِنْ أَنفُسِهِمْ ۖ وَأَزْوَاجُهُ أُمَّهَاتُهُمْ ۗ وَأُولُو الْأَرْحَامِ بَعْضُهُمْ أَوْلَىٰ بِبَعْضٍ فِي كِتَابِ اللَّهِ مِنَ الْمُؤْمِنِينَ وَالْمُهَاجِرِينَ إِلَّا أَن تَفْعَلُوا إِلَىٰ أَوْلِيَائِكُم مَّعْرُوفًا ۚ كَانَ ذَٰلِكَ فِي الْكِتَابِ مَسْطُورًا",
    "وَإِذْ أَخَذْنَا مِنَ النَّبِيِّينَ مِيثَاقَهُمْ وَمِنكَ وَمِن نُّوحٍ وَإِبْرَاهِيمَ وَمُوسَىٰ وَعِيسَى ابْنِ مَرْيَمَ ۖ وَأَخَذْنَا مِنْهُم مِّيثَاقًا غَلِيظًا",
    "لِّيَسْأَلَ الصَّادِقِينَ عَن صِدْقِهِمْ ۚ وَأَعَدَّ لِلْكَافِرِينَ عَذَابًا أَلِيمًا",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا اذْكُرُوا نِعْمَةَ اللَّهِ عَلَيْكُمْ إِذْ جَاءَتْكُمْ جُنُودٌ فَأَرْسَلْنَا عَلَيْهِمْ رِيحًا وَجُنُودًا لَّمْ تَرَوْهَا ۚ وَكَانَ اللَّهُ بِمَا تَعْمَلُونَ بَصِيرًا",
    "إِذْ جَاءُوكُم مِّن فَوْقِكُمْ وَمِنْ أَسْفَلَ مِنكُمْ وَإِذْ زَاغَتِ الْأَبْصَارُ وَبَلَغَتِ الْقُلُوبُ الْحَنَاجِرَ وَتَظُنُّونَ بِاللَّهِ الظُّنُونَا",
    "هُنَالِكَ ابْتُلِيَ الْمُؤْمِنُونَ وَزُلْزِلُوا زِلْزَالًا شَدِيدًا",
    "وَإِذْ يَقُولُ الْمُنَافِقُونَ وَالَّذِينَ فِي قُلُوبِهِم مَّرَضٌ مَّا وَعَدَنَا اللَّهُ وَرَسُولُهُ إِلَّا غُرُورًا",
    "وَإِذْ قَالَت طَّائِفَةٌ مِّنْهُمْ يَا أَهْلَ يَثْرِبَ لَا مُقَامَ لَكُمْ فَارْجِعُوا ۚ وَيَسْتَأْذِنُ فَرِيقٌ مِّنْهُمُ النَّبِيَّ يَقُولُونَ إِنَّ بُيُوتَنَا عَوْرَةٌ وَمَا هِيَ بِعَوْرَةٍ ۖ إِن يُرِيدُونَ إِلَّا فِرَارًا",
    "وَلَوْ دُخِلَتْ عَلَيْهِم مِّنْ أَقْطَارِهَا ثُمَّ سُئِلُوا الْفِتْنَةَ لَآتَوْهَا وَمَا تَلَبَّثُوا بِهَا إِلَّا يَسِيرًا",
    "وَلَقَدْ كَانُوا عَاهَدُوا اللَّهَ مِن قَبْلُ لَا يُوَلُّونَ الْأَدْبَارَ ۚ وَكَانَ عَهْدُ اللَّهِ مَسْئُولًا",
    "قُل لَّن يَنفَعَكُمُ الْفِرَارُ إِن فَرَرْتُم مِّنَ الْمَوْتِ أَوِ الْقَتْلِ وَإِذًا لَّا تُمَتَّعُونَ إِلَّا قَلِيلًا",
    "قُلْ مَن ذَا الَّذِي يَعْصِمُكُم مِّنَ اللَّهِ إِنْ أَرَادَ بِكُمْ سُوءًا أَوْ أَرَادَ بِكُمْ رَحْمَةً ۚ وَلَا يَجِدُونَ لَهُم مِّن دُونِ اللَّهِ وَلِيًّا وَلَا نَصِيرًا",
    "قَدْ يَعْلَمُ اللَّهُ الْمُعَوِّقِينَ مِنكُمْ وَالْقَائِلِينَ لِإِخْوَانِهِمْ هَلُمَّ إِلَيْنَا ۖ وَلَا يَأْتُونَ الْبَأْسَ إِلَّا قَلِيلًا",
    "أَشِحَّةً عَلَيْكُمْ ۖ فَإِذَا جَاءَ الْخَوْفُ رَأَيْتَهُمْ يَنظُرُونَ إِلَيْكَ تَدُورُ أَعْيُنُهُمْ كَالَّذِي يُغْشَىٰ عَلَيْهِ مِنَ الْمَوْتِ ۖ فَإِذَا ذَهَبَ الْخَوْفُ سَلَقُوكُم بِأَلْسِنَةٍ حِدَادٍ أَشِحَّةً عَلَى الْخَيْرِ ۚ أُولَٰئِكَ لَمْ يُؤْمِنُوا فَأَحْبَطَ اللَّهُ أَعْمَالَهُمْ ۚ وَكَانَ ذَٰلِكَ عَلَى اللَّهِ يَسِيرًا",
    "يَحْسَبُونَ الْأَحْزَابَ لَمْ يَذْهَبُوا ۖ وَإِن يَأْتِ الْأَحْزَابُ يَوَدُّوا لَوْ أَنَّهُم بَادُونَ فِي الْأَعْرَابِ يَسْأَلُونَ عَنْ أَنبَائِكُمْ ۖ وَلَوْ كَانُوا فِيكُم مَّا قَاتَلُوا إِلَّا قَلِيلًا",
    "لَّقَدْ كَانَ لَكُمْ فِي رَسُولِ اللَّهِ أُسْوَةٌ حَسَنَةٌ لِّمَن كَانَ يَرْجُو اللَّهَ وَالْيَوْمَ الْآخِرَ وَذَكَرَ اللَّهَ كَثِيرًا",
    "وَلَمَّا رَأَى الْمُؤْمِنُونَ الْأَحْزَابَ قَالُوا هَٰذَا مَا وَعَدَنَا اللَّهُ وَرَسُولُهُ وَصَدَقَ اللَّهُ وَرَسُولُهُ ۚ وَمَا زَادَهُمْ إِلَّا إِيمَانًا وَتَسْلِيمًا",
    "مِّنَ الْمُؤْمِنِينَ رِجَالٌ صَدَقُوا مَا عَاهَدُوا اللَّهَ عَلَيْهِ ۖ فَمِنْهُم مَّن قَضَىٰ نَحْبَهُ وَمِنْهُم مَّن يَنتَظِرُ ۖ وَمَا بَدَّلُوا تَبْدِيلًا",
    "لِّيَجْزِيَ اللَّهُ الصَّادِقِينَ بِصِدْقِهِمْ وَيُعَذِّبَ الْمُنَافِقِينَ إِن شَاءَ أَوْ يَتُوبَ عَلَيْهِمْ ۚ إِنَّ اللَّهَ كَانَ غَفُورًا رَّحِيمًا",
    "وَرَدَّ اللَّهُ الَّذِينَ كَفَرُوا بِغَيْظِهِمْ لَمْ يَنَالُوا خَيْرًا ۚ وَكَفَى اللَّهُ الْمُؤْمِنِينَ الْقِتَالَ ۚ وَكَانَ اللَّهُ قَوِيًّا عَزِيزًا",
    "وَأَنزَلَ الَّذِينَ ظَاهَرُوهُم مِّنْ أَهْلِ الْكِتَابِ مِن صَيَاصِيهِمْ وَقَذَفَ فِي قُلُوبِهِمُ الرُّعْبَ فَرِيقًا تَقْتُلُونَ وَتَأْسِرُونَ فَرِيقًا",
    "وَأَوْرَثَكُمْ أَرْضَهُمْ وَدِيَارَهُمْ وَأَمْوَالَهُمْ وَأَرْضًا لَّمْ تَطَئُوهَا ۚ وَكَانَ اللَّهُ عَلَىٰ كُلِّ شَيْءٍ قَدِيرًا",
    "يَا أَيُّهَا النَّبِيُّ قُل لِّأَزْوَاجِكَ إِن كُنتُنَّ تُرِدْنَ الْحَيَاةَ الدُّنْيَا وَزِينَتَهَا فَتَعَالَيْنَ أُمَتِّعْكُنَّ وَأُسَرِّحْكُنَّ سَرَاحًا جَمِيلًا",
    "وَإِن كُنتُنَّ تُرِدْنَ اللَّهَ وَرَسُولَهُ وَالدَّارَ الْآخِرَةَ فَإِنَّ اللَّهَ أَعَدَّ لِلْمُحْسِنَاتِ مِنكُنَّ أَجْرًا عَظِيمًا",
    "يَا نِسَاءَ النَّبِيِّ مَن يَأْتِ مِنكُنَّ بِفَاحِشَةٍ مُّبَيِّنَةٍ يُضَاعَفْ لَهَا الْعَذَابُ ضِعْفَيْنِ ۚ وَكَانَ ذَٰلِكَ عَلَى اللَّهِ يَسِيرًا",
    "وَمَن يَقْنُتْ مِنكُنَّ لِلَّهِ وَرَسُولِهِ وَتَعْمَلْ صَالِحًا نُّؤْتِهَا أَجْرَهَا مَرَّتَيْنِ وَأَعْتَدْنَا لَهَا رِزْقًا كَرِيمًا",
    "يَا نِسَاءَ النَّبِيِّ لَسْتُنَّ كَأَحَدٍ مِّنَ النِّسَاءِ ۚ إِنِ اتَّقَيْتُنَّ فَلَا تَخْضَعْنَ بِالْقَوْلِ فَيَطْمَعَ الَّذِي فِي قَلْبِهِ مَرَضٌ وَقُلْنَ قَوْلًا مَّعْرُوفًا",
    "وَقَرْنَ فِي بُيُوتِكُنَّ وَلَا تَبَرَّجْنَ تَبَرُّجَ الْجَاهِلِيَّةِ الْأُولَىٰ ۖ وَأَقِمْنَ الصَّلَاةَ وَآتِينَ الزَّكَاةَ وَأَطِعْنَ اللَّهَ وَرَسُولَهُ ۚ إِنَّمَا يُرِيدُ اللَّهُ لِيُذْهِبَ عَنكُمُ الرِّجْسَ أَهْلَ الْبَيْتِ وَيُطَهِّرَكُمْ تَطْهِيرًا",
    "وَاذْكُرْنَ مَا يُتْلَىٰ فِي بُيُوتِكُنَّ مِنْ آيَاتِ اللَّهِ وَالْحِكْمَةِ ۚ إِنَّ اللَّهَ كَانَ لَطِيفًا خَبِيرًا",
    "إِنَّ الْمُسْلِمِينَ وَالْمُسْلِمَاتِ وَالْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ وَالْقَانِتِينَ وَالْقَانِتَاتِ وَالصَّادِقِينَ وَالصَّادِقَاتِ وَالصَّابِرِينَ وَالصَّابِرَاتِ وَالْخَاشِعِينَ وَالْخَاشِعَاتِ وَالْمُتَصَدِّقِينَ وَالْمُتَصَدِّقَاتِ وَالصَّائِمِينَ وَالصَّائِمَاتِ وَالْحَافِظِينَ فُرُوجَهُمْ وَالْحَافِظَاتِ وَالذَّاكِرِينَ اللَّهَ كَثِيرًا وَالذَّاكِرَاتِ أَعَدَّ اللَّهُ لَهُم مَّغْفِرَةً وَأَجْرًا عَظِيمًا",
    "وَمَا كَانَ لِمُؤْمِنٍ وَلَا مُؤْمِنَةٍ إِذَا قَضَى اللَّهُ وَرَسُولُهُ أَمْرًا أَن يَكُونَ لَهُمُ الْخِيَرَةُ مِنْ أَمْرِهِمْ ۗ وَمَن يَعْصِ اللَّهَ وَرَسُولَهُ فَقَدْ ضَلَّ ضَلَالًا مُّبِينًا",
    "وَإِذْ تَقُولُ لِلَّذِي أَنْعَمَ اللَّهُ عَلَيْهِ وَأَنْعَمْتَ عَلَيْهِ أَمْسِكْ عَلَيْكَ زَوْجَكَ وَاتَّقِ اللَّهَ وَتُخْفِي فِي نَفْسِكَ مَا اللَّهُ مُبْدِيهِ وَتَخْشَى النَّاسَ وَاللَّهُ أَحَقُّ أَن تَخْشَاهُ ۖ فَلَمَّا قَضَىٰ زَيْدٌ مِّنْهَا وَطَرًا زَوَّجْنَاكَهَا لِكَيْ لَا يَكُونَ عَلَى الْمُؤْمِنِينَ حَرَجٌ فِي أَزْوَاجِ أَدْعِيَائِهِمْ إِذَا قَضَوْا مِنْهُنَّ وَطَرًا ۚ وَكَانَ أَمْرُ اللَّهِ مَفْعُولًا",
    "مَّا كَانَ عَلَى النَّبِيِّ مِنْ حَرَجٍ فِيمَا فَرَضَ اللَّهُ لَهُ ۖ سُنَّةَ اللَّهِ فِي الَّذِينَ خَلَوْا مِن قَبْلُ ۚ وَكَانَ أَمْرُ اللَّهِ قَدَرًا مَّقْدُورًا",
    "الَّذِينَ يُبَلِّغُونَ رِسَالَاتِ اللَّهِ وَيَخْشَوْنَهُ وَلَا يَخْشَوْنَ أَحَدًا إِلَّا اللَّهَ ۗ وَكَفَىٰ بِاللَّهِ حَسِيبًا",
    "مَّا كَانَ مُحَمَّدٌ أَبَا أَحَدٍ مِّن رِّجَالِكُمْ وَلَٰكِن رَّسُولَ اللَّهِ وَخَاتَمَ النَّبِيِّينَ ۗ وَكَانَ اللَّهُ بِكُلِّ شَيْءٍ عَلِيمًا",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا اذْكُرُوا اللَّهَ ذِكْرًا كَثِيرًا",
    "وَسَبِّحُوهُ بُكْرَةً وَأَصِيلًا",
    "هُوَ الَّذِي يُصَلِّي عَلَيْكُمْ وَمَلَائِكَتُهُ لِيُخْرِجَكُم مِّنَ الظُّلُمَاتِ إِلَى النُّورِ ۚ وَكَانَ بِالْمُؤْمِنِينَ رَحِيمًا",
    "تَحِيَّتُهُمْ يَوْمَ يَلْقَوْنَهُ سَلَامٌ ۚ وَأَعَدَّ لَهُمْ أَجْرًا كَرِيمًا",
    "يَا أَيُّهَا النَّبِيُّ إِنَّا أَرْسَلْنَاكَ شَاهِدًا وَمُبَشِّرًا وَنَذِيرًا",
    "وَدَاعِيًا إِلَى اللَّهِ بِإِذْنِهِ وَسِرَاجًا مُّنِيرًا",
    "وَبَشِّرِ الْمُؤْمِنِينَ بِأَنَّ لَهُم مِّنَ اللَّهِ فَضْلًا كَبِيرًا",
    "وَلَا تُطِعِ الْكَافِرِينَ وَالْمُنَافِقِينَ وَدَعْ أَذَاهُمْ وَتَوَكَّلْ عَلَى اللَّهِ ۚ وَكَفَىٰ بِاللَّهِ وَكِيلًا",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِذَا نَكَحْتُمُ الْمُؤْمِنَاتِ ثُمَّ طَلَّقْتُمُوهُنَّ مِن قَبْلِ أَن تَمَسُّوهُنَّ فَمَا لَكُمْ عَلَيْهِنَّ مِنْ عِدَّةٍ تَعْتَدُّونَهَا ۖ فَمَتِّعُوهُنَّ وَسَرِّحُوهُنَّ سَرَاحًا جَمِيلًا",
    "يَا أَيُّهَا النَّبِيُّ إِنَّا أَحْلَلْنَا لَكَ أَزْوَاجَكَ اللَّاتِي آتَيْتَ أُجُورَهُنَّ وَمَا مَلَكَتْ يَمِينُكَ مِمَّا أَفَاءَ اللَّهُ عَلَيْكَ وَبَنَاتِ عَمِّكَ وَبَنَاتِ عَمَّاتِكَ وَبَنَاتِ خَالِكَ وَبَنَاتِ خَالَاتِكَ اللَّاتِي هَاجَرْنَ مَعَكَ وَامْرَأَةً مُّؤْمِنَةً إِن وَهَبَتْ نَفْسَهَا لِلنَّبِيِّ إِنْ أَرَادَ النَّبِيُّ أَن يَسْتَنكِحَهَا خَالِصَةً لَّكَ مِن دُونِ الْمُؤْمِنِينَ ۗ قَدْ عَلِمْنَا مَا فَرَضْنَا عَلَيْهِمْ فِي أَزْوَاجِهِمْ وَمَا مَلَكَتْ أَيْمَانُهُمْ لِكَيْلَا يَكُونَ عَلَيْكَ حَرَجٌ ۗ وَكَانَ اللَّهُ غَفُورًا رَّحِيمًا",
    "تُرْجِي مَن تَشَاءُ مِنْهُنَّ وَتُؤْوِي إِلَيْكَ مَن تَشَاءُ ۖ وَمَنِ ابْتَغَيْتَ مِمَّنْ عَزَلْتَ فَلَا جُنَاحَ عَلَيْكَ ۚ ذَٰلِكَ أَدْنَىٰ أَن تَقَرَّ أَعْيُنُهُنَّ وَلَا يَحْزَنَّ وَيَرْضَيْنَ بِمَا آتَيْتَهُنَّ كُلُّهُنَّ ۚ وَاللَّهُ يَعْلَمُ مَا فِي قُلُوبِكُمْ ۚ وَكَانَ اللَّهُ عَلِيمًا حَلِيمًا",
    "لَّا يَحِلُّ لَكَ النِّسَاءُ مِن بَعْدُ وَلَا أَن تَبَدَّلَ بِهِنَّ مِنْ أَزْوَاجٍ وَلَوْ أَعْجَبَكَ حُسْنُهُنَّ إِلَّا مَا مَلَكَتْ يَمِينُكَ ۗ وَكَانَ اللَّهُ عَلَىٰ كُلِّ شَيْءٍ رَّقِيبًا",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تَدْخُلُوا بُيُوتَ النَّبِيِّ إِلَّا أَن يُؤْذَنَ لَكُمْ إِلَىٰ طَعَامٍ غَيْرَ نَاظِرِينَ إِنَاهُ وَلَٰكِنْ إِذَا دُعِيتُمْ فَادْخُلُوا فَإِذَا طَعِمْتُمْ فَانتَشِرُوا وَلَا مُسْتَأْنِسِينَ لِحَدِيثٍ ۚ إِنَّ ذَٰلِكُمْ كَانَ يُؤْذِي النَّبِيَّ فَيَسْتَحْيِي مِنكُمْ ۖ وَاللَّهُ لَا يَسْتَحْيِي مِنَ الْحَقِّ ۚ وَإِذَا سَأَلْتُمُوهُنَّ مَتَاعًا فَاسْأَلُوهُنَّ مِن وَرَاءِ حِجَابٍ ۚ ذَٰلِكُمْ أَطْهَرُ لِقُلُوبِكُمْ وَقُلُوبِهِنَّ ۚ وَمَا كَانَ لَكُمْ أَن تُؤْذُوا رَسُولَ اللَّهِ وَلَا أَن تَنكِحُوا أَزْوَاجَهُ مِن بَعْدِهِ أَبَدًا ۚ إِنَّ ذَٰلِكُمْ كَانَ عِندَ اللَّهِ عَظِيمًا",
    "إِن تُبْدُوا شَيْئًا أَوْ تُخْفُوهُ فَإِنَّ اللَّهَ كَانَ بِكُلِّ شَيْءٍ عَلِيمًا",
    "لَّا جُنَاحَ عَلَيْهِنَّ فِي آبَائِهِنَّ وَلَا أَبْنَائِهِنَّ وَلَا إِخْوَانِهِنَّ وَلَا أَبْنَاءِ إِخْوَانِهِنَّ وَلَا أَبْنَاءِ أَخَوَاتِهِنَّ وَلَا نِسَائِهِنَّ وَلَا مَا مَلَكَتْ أَيْمَانُهُنَّ ۗ وَاتَّقِينَ اللَّهَ ۚ إِنَّ اللَّهَ كَانَ عَلَىٰ كُلِّ شَيْءٍ شَهِيدًا",
    "إِنَّ اللَّهَ وَمَلَائِكَتَهُ يُصَلُّونَ عَلَى النَّبِيِّ ۚ يَا أَيُّهَا الَّذِينَ آمَنُوا صَلُّوا عَلَيْهِ وَسَلِّمُوا تَسْلِيمًا",
    "إِنَّ الَّذِينَ يُؤْذُونَ اللَّهَ وَرَسُولَهُ لَعَنَهُمُ اللَّهُ فِي الدُّنْيَا وَالْآخِرَةِ وَأَعَدَّ لَهُمْ عَذَابًا مُّهِينًا",
    "وَالَّذِينَ يُؤْذُونَ الْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ بِغَيْرِ مَا اكْتَسَبُوا فَقَدِ احْتَمَلُوا بُهْتَانًا وَإِثْمًا مُّبِينًا",
    "يَا أَيُّهَا النَّبِيُّ قُل لِّأَزْوَاجِكَ وَبَنَاتِكَ وَنِسَاءِ الْمُؤْمِنِينَ يُدْنِينَ عَلَيْهِنَّ مِن جَلَابِيبِهِنَّ ۚ ذَٰلِكَ أَدْنَىٰ أَن يُعْرَفْنَ فَلَا يُؤْذَيْنَ ۗ وَكَانَ اللَّهُ غَفُورًا رَّحِيمًا",
    "لَّئِن لَّمْ يَنتَهِ الْمُنَافِقُونَ وَالَّذِينَ فِي قُلُوبِهِم مَّرَضٌ وَالْمُرْجِفُونَ فِي الْمَدِينَةِ لَنُغْرِيَنَّكَ بِهِمْ ثُمَّ لَا يُجَاوِرُونَكَ فِيهَا إِلَّا قَلِيلًا",
    "مَّلْعُونِينَ ۖ أَيْنَمَا ثُقِفُوا أُخِذُوا وَقُتِّلُوا تَقْتِيلًا",
    "سُنَّةَ اللَّهِ فِي الَّذِينَ خَلَوْا مِن قَبْلُ ۖ وَلَن تَجِدَ لِسُنَّةِ اللَّهِ تَبْدِيلًا",
    "يَسْأَلُكَ النَّاسُ عَنِ السَّاعَةِ ۖ قُلْ إِنَّمَا عِلْمُهَا عِندَ اللَّهِ ۚ وَمَا يُدْرِيكَ لَعَلَّ السَّاعَةَ تَكُونُ قَرِيبًا",
    "إِنَّ اللَّهَ لَعَنَ الْكَافِرِينَ وَأَعَدَّ لَهُمْ سَعِيرًا",
    "خَالِدِينَ فِيهَا أَبَدًا ۖ لَّا يَجِدُونَ وَلِيًّا وَلَا نَصِيرًا",
    "يَوْمَ تُقَلَّبُ وُجُوهُهُمْ فِي النَّارِ يَقُولُونَ يَا لَيْتَنَا أَطَعْنَا اللَّهَ وَأَطَعْنَا الرَّسُولَا",
    "وَقَالُوا رَبَّنَا إِنَّا أَطَعْنَا سَادَتَنَا وَكُبَرَاءَنَا فَأَضَلُّونَا السَّبِيلَا",
    "رَبَّنَا آتِهِمْ ضِعْفَيْنِ مِنَ الْعَذَابِ وَالْعَنْهُمْ لَعْنًا كَبِيرًا",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تَكُونُوا كَالَّذِينَ آذَوْا مُوسَىٰ فَبَرَّأَهُ اللَّهُ مِمَّا قَالُوا ۚ وَكَانَ عِندَ اللَّهِ وَجِيهًا",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا اتَّقُوا اللَّهَ وَقُولُوا قَوْلًا سَدِيدًا",
    "يُصْلِحْ لَكُمْ أَعْمَالَكُمْ وَيَغْفِرْ لَكُمْ ذُنُوبَكُمْ ۗ وَمَن يُطِعِ اللَّهَ وَرَسُولَهُ فَقَدْ فَازَ فَوْزًا عَظِيمًا",
    "إِنَّا عَرَضْنَا الْأَمَانَةَ عَلَى السَّمَاوَاتِ وَالْأَرْضِ وَالْجِبَالِ فَأَبَيْنَ أَن يَحْمِلْنَهَا وَأَشْفَقْنَ مِنْهَا وَحَمَلَهَا الْإِنسَانُ ۖ إِنَّهُ كَانَ ظَلُومًا جَهُولًا",
    "لِّيُعَذِّبَ اللَّهُ الْمُنَافِقِينَ وَالْمُنَافِقَاتِ وَالْمُشْرِكِينَ وَالْمُشْرِكَاتِ وَيَتُوبَ اللَّهُ عَلَى الْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ ۗ وَكَانَ اللَّهُ غَفُورًا رَّحِيمًا"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"O Prophet, fear Allah and do not obey the disbelievers and the hypocrites. Indeed, Allah is ever Knowing and Wise.",
    "And follow that which is revealed to you from your Lord. Indeed Allah is ever, with what you do, Acquainted.",
    "And rely upon Allah ; and sufficient is Allah as Disposer of affairs.",
    "Allah has not made for a man two hearts in his interior. And He has not made your wives whom you declare unlawful your mothers. And he has not made your adopted sons your [true] sons. That is [merely] your saying by your mouths, but Allah says the truth, and He guides to the [right] way.",
    "Call them by [the names of] their fathers; it is more just in the sight of Allah. But if you do not know their fathers - then they are [still] your brothers in religion and those entrusted to you. And there is no blame upon you for that in which you have erred but [only for] what your hearts intended. And ever is Allah Forgiving and Merciful.",
    "The Prophet is more worthy of the believers than themselves, and his wives are [in the position of] their mothers. And those of [blood] relationship are more entitled [to inheritance] in the decree of Allah than the [other] believers and the emigrants, except that you may do to your close associates a kindness [through bequest]. That was in the Book inscribed.",
    "And [mention, O Muhammad], when We took from the prophets their covenant and from you and from Noah and Abraham and Moses and Jesus, the son of Mary; and We took from them a solemn covenant.",
    "That He may question the truthful about their truth. And He has prepared for the disbelievers a painful punishment.",
    "O you who have believed, remember the favor of Allah upon you when armies came to [attack] you and We sent upon them a wind and armies [of angels] you did not see. And ever is Allah, of what you do, Seeing.",
    "[Remember] when they came at you from above you and from below you, and when eyes shifted [in fear], and hearts reached the throats and you assumed about Allah [various] assumptions.",
    "There the believers were tested and shaken with a severe shaking.",
    "And [remember] when the hypocrites and those in whose hearts is disease said, \"Allah and His Messenger did not promise us except delusion,\"",
    "And when a faction of them said, \"O people of Yathrib, there is no stability for you [here], so return [home].\" And a party of them asked permission of the Prophet, saying, \"Indeed, our houses are unprotected,\" while they were not exposed. They did not intend except to flee.",
    "And if they had been entered upon from all its [surrounding] regions and fitnah had been demanded of them, they would have done it and not hesitated over it except briefly.",
    "And they had already promised Allah before not to turn their backs and flee. And ever is the promise to Allah [that about which one will be] questioned.",
    "Say, [O Muhammad], \"Never will fleeing benefit you if you should flee from death or killing; and then [if you did], you would not be given enjoyment [of life] except for a little.\"",
    "Say, \"Who is it that can protect you from Allah if He intends for you an ill or intends for you a mercy?\" And they will not find for themselves besides Allah any protector or any helper.",
    "Already Allah knows the hinderers among you and those [hypocrites] who say to their brothers, \"Come to us,\" and do not go to battle, except for a few,",
    "Indisposed toward you. And when fear comes, you see them looking at you, their eyes revolving like one being overcome by death. But when fear departs, they lash you with sharp tongues, indisposed toward [any] good. Those have not believed, so Allah has rendered their deeds worthless, and ever is that, for Allah, easy.",
    "They think the companies have not [yet] withdrawn. And if the companies should come [again], they would wish they were in the desert among the bedouins, inquiring [from afar] about your news. And if they should be among you, they would not fight except for a little.",
    "There has certainly been for you in the Messenger of Allah an excellent pattern for anyone whose hope is in Allah and the Last Day and [who] remembers Allah often.",
    "And when the believers saw the companies, they said, \"This is what Allah and His Messenger had promised us, and Allah and His Messenger spoke the truth.\" And it increased them only in faith and acceptance.",
    "Among the believers are men true to what they promised Allah. Among them is he who has fulfilled his vow [to the death], and among them is he who awaits [his chance]. And they did not alter [the terms of their commitment] by any alteration -",
    "That Allah may reward the truthful for their truth and punish the hypocrites if He wills or accept their repentance. Indeed, Allah is ever Forgiving and Merciful.",
    "And Allah repelled those who disbelieved, in their rage, not having obtained any good. And sufficient was Allah for the believers in battle, and ever is Allah Powerful and Exalted in Might.",
    "And He brought down those who supported them among the People of the Scripture from their fortresses and cast terror into their hearts [so that] a party you killed, and you took captive a party.",
    "And He caused you to inherit their land and their homes and their properties and a land which you have not trodden. And ever is Allah, over all things, competent.",
    "O Prophet, say to your wives, \"If you should desire the worldly life and its adornment, then come, I will provide for you and give you a gracious release.",
    "But if you should desire Allah and His Messenger and the home of the Hereafter - then indeed, Allah has prepared for the doers of good among you a great reward.\"",
    "O wives of the Prophet, whoever of you should commit a clear immorality - for her the punishment would be doubled two fold, and ever is that, for Allah, easy.",
    "And whoever of you devoutly obeys Allah and His Messenger and does righteousness - We will give her her reward twice; and We have prepared for her a noble provision.",
    "O wives of the Prophet, you are not like anyone among women. If you fear Allah, then do not be soft in speech [to men], lest he in whose heart is disease should covet, but speak with appropriate speech.",
    "And abide in your houses and do not display yourselves as [was] the display of the former times of ignorance. And establish prayer and give zakah and obey Allah and His Messenger. Allah intends only to remove from you the impurity [of sin], O people of the [Prophet's] household, and to purify you with [extensive] purification.",
    "And remember what is recited in your houses of the verses of Allah and wisdom. Indeed, Allah is ever Subtle and Acquainted [with all things].",
    "Indeed, the Muslim men and Muslim women, the believing men and believing women, the obedient men and obedient women, the truthful men and truthful women, the patient men and patient women, the humble men and humble women, the charitable men and charitable women, the fasting men and fasting women, the men who guard their private parts and the women who do so, and the men who remember Allah often and the women who do so - for them Allah has prepared forgiveness and a great reward.",
    "It is not for a believing man or a believing woman, when Allah and His Messenger have decided a matter, that they should [thereafter] have any choice about their affair. And whoever disobeys Allah and His Messenger has certainly strayed into clear error.",
    "And [remember, O Muhammad], when you said to the one on whom Allah bestowed favor and you bestowed favor, \"Keep your wife and fear Allah,\" while you concealed within yourself that which Allah is to disclose. And you feared the people, while Allah has more right that you fear Him. So when Zayd had no longer any need for her, We married her to you in order that there not be upon the believers any discomfort concerning the wives of their adopted sons when they no longer have need of them. And ever is the command of Allah accomplished.",
    "There is not to be upon the Prophet any discomfort concerning that which Allah has imposed upon him. [This is] the established way of Allah with those [prophets] who have passed on before. And ever is the command of Allah a destiny decreed.",
    "[Allah praises] those who convey the messages of Allah and fear Him and do not fear anyone but Allah. And sufficient is Allah as Accountant.",
    "Muhammad is not the father of [any] one of your men, but [he is] the Messenger of Allah and last of the prophets. And ever is Allah, of all things, Knowing.",
    "O you who have believed, remember Allah with much remembrance",
    "And exalt Him morning and afternoon.",
    "It is He who confers blessing upon you, and His angels [ask Him to do so] that He may bring you out from darknesses into the light. And ever is He, to the believers, Merciful.",
    "Their greeting the Day they meet Him will be, \"Peace.\" And He has prepared for them a noble reward.",
    "O Prophet, indeed We have sent you as a witness and a bringer of good tidings and a warner.",
    "And one who invites to Allah, by His permission, and an illuminating lamp.",
    "And give good tidings to the believers that they will have from Allah great bounty.",
    "And do not obey the disbelievers and the hypocrites but do not harm them, and rely upon Allah. And sufficient is Allah as Disposer of affairs.",
    "O You who have believed, when you marry believing women and then divorce them before you have touched them, then there is not for you any waiting period to count concerning them. So provide for them and give them a gracious release.",
    "O Prophet, indeed We have made lawful to you your wives to whom you have given their due compensation and those your right hand possesses from what Allah has returned to you [of captives] and the daughters of your paternal uncles and the daughters of your paternal aunts and the daughters of your maternal uncles and the daughters of your maternal aunts who emigrated with you and a believing woman if she gives herself to the Prophet [and] if the Prophet wishes to marry her, [this is] only for you, excluding the [other] believers. We certainly know what We have made obligatory upon them concerning their wives and those their right hands possess, [but this is for you] in order that there will be upon you no discomfort. And ever is Allah Forgiving and Merciful.",
    "You, [O Muhammad], may put aside whom you will of them or take to yourself whom you will. And any that you desire of those [wives] from whom you had [temporarily] separated - there is no blame upon you [in returning her]. That is more suitable that they should be content and not grieve and that they should be satisfied with what you have given them - all of them. And Allah knows what is in your hearts. And ever is Allah Knowing and Forbearing.",
    "Not lawful to you, [O Muhammad], are [any additional] women after [this], nor [is it] for you to exchange them for [other] wives, even if their beauty were to please you, except what your right hand possesses. And ever is Allah, over all things, an Observer.",
    "O you who have believed, do not enter the houses of the Prophet except when you are permitted for a meal, without awaiting its readiness. But when you are invited, then enter; and when you have eaten, disperse without seeking to remain for conversation. Indeed, that [behavior] was troubling the Prophet, and he is shy of [dismissing] you. But Allah is not shy of the truth. And when you ask [his wives] for something, ask them from behind a partition. That is purer for your hearts and their hearts. And it is not [conceivable or lawful] for you to harm the Messenger of Allah or to marry his wives after him, ever. Indeed, that would be in the sight of Allah an enormity.",
    "Whether you reveal a thing or conceal it, indeed Allah is ever, of all things, Knowing.",
    "There is no blame upon women concerning their fathers or their sons or their brothers or their brothers' sons or their sisters' sons or their women or those their right hands possess. And fear Allah. Indeed Allah is ever, over all things, Witness.",
    "Indeed, Allah confers blessing upon the Prophet, and His angels [ask Him to do so]. O you who have believed, ask [Allah to confer] blessing upon him and ask [Allah to grant him] peace.",
    "Indeed, those who abuse Allah and His Messenger - Allah has cursed them in this world and the Hereafter and prepared for them a humiliating punishment.",
    "And those who harm believing men and believing women for [something] other than what they have earned have certainly born upon themselves a slander and manifest sin.",
    "O Prophet, tell your wives and your daughters and the women of the believers to bring down over themselves [part] of their outer garments. That is more suitable that they will be known and not be abused. And ever is Allah Forgiving and Merciful.",
    "If the hypocrites and those in whose hearts is disease and those who spread rumors in al-Madinah do not cease, We will surely incite you against them; then they will not remain your neighbors therein except for a little.",
    "Accursed wherever they are found, [being] seized and massacred completely.",
    "[This is] the established way of Allah with those who passed on before; and you will not find in the way of Allah any change.",
    "People ask you concerning the Hour. Say,\" Knowledge of it is only with Allah. And what may make you perceive? Perhaps the Hour is near.\"",
    "Indeed, Allah has cursed the disbelievers and prepared for them a Blaze.",
    "Abiding therein forever, they will not find a protector or a helper.",
    "The Day their faces will be turned about in the Fire, they will say, \"How we wish we had obeyed Allah and obeyed the Messenger.\"",
    "And they will say, \"Our Lord, indeed we obeyed our masters and our dignitaries, and they led us astray from the [right] way.",
    "Our Lord, give them double the punishment and curse them with a great curse.\"",
    "O you who have believed, be not like those who abused Moses; then Allah cleared him of what they said. And he, in the sight of Allah, was distinguished.",
    "O you who have believed, fear Allah and speak words of appropriate justice.",
    "He will [then] amend for you your deeds and forgive you your sins. And whoever obeys Allah and His Messenger has certainly attained a great attainment.",
    "Indeed, we offered the Trust to the heavens and the earth and the mountains, and they declined to bear it and feared it; but man [undertook to] bear it. Indeed, he was unjust and ignorant.",
    "[It was] so that Allah may punish the hypocrite men and hypocrite women and the men and women who associate others with Him and that Allah may accept repentance from the believing men and believing women. And ever is Allah Forgiving and Merciful."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__ahzab);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_ahzab);
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
