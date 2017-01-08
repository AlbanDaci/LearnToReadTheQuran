package com.tumblr.albandaci.learntoreadthequran.Surahs;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Al_Fatihah_Adapter;
import com.tumblr.albandaci.learntoreadthequran.R;

import java.io.IOException;

public class Al_Anfal extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private String URL1 = "http://www.audioislam.com/audio/quran/recitation/al-afaasee/surah_al_anfal.mp3";
    private MediaPlayer mediaPlayer;

    String [] verses = {"8:1", "8:2", "8:3", "8:4", "8:5", "8:6", "8:7", "8:8", "8:9", "8:10", "8:11", "8:12", "8:13", "8:14", "8:15", "8:16",
            "8:17", "8:18", "8:19", "8:20", "8:21", "8:22", "8:23", "8:24", "8:25", "8:26", "8:27", "8:28", "8:29", "8:30", "8:31", "8:32",
            "8:33", "8:34", "8:35", "8:36", "8:37", "8:38", "8:39", "8:40", "8:41", "8:42", "8:43", "8:44", "8:45", "8:46", "8:47", "8:48",
            "8:49", "8:50", "8:51", "8:52", "8:53", "8:54", "8:55", "8:56", "8:57", "8:58", "8:59", "8:60", "8:61", "8:62", "8:63", "8:64",
            "8:65", "8:66", "8:67", "8:68", "8:69", "8:70", "8:71", "8:72", "8:73", "8:74", "8:75"};

    String [] arabic_verses = {"يَسْأَلُونَكَ عَنِ الْأَنفَالِ ۖ قُلِ الْأَنفَالُ لِلَّهِ وَالرَّسُولِ ۖ فَاتَّقُوا اللَّهَ وَأَصْلِحُوا ذَاتَ بَيْنِكُمْ ۖ وَأَطِيعُوا اللَّهَ وَرَسُولَهُ إِن كُنتُم مُّؤْمِنِينَ",
    "إِنَّمَا الْمُؤْمِنُونَ الَّذِينَ إِذَا ذُكِرَ اللَّهُ وَجِلَتْ قُلُوبُهُمْ وَإِذَا تُلِيَتْ عَلَيْهِمْ آيَاتُهُ زَادَتْهُمْ إِيمَانًا وَعَلَىٰ رَبِّهِمْ يَتَوَكَّلُونَ",
    "الَّذِينَ يُقِيمُونَ الصَّلَاةَ وَمِمَّا رَزَقْنَاهُمْ يُنفِقُونَ",
    "أُولَٰئِكَ هُمُ الْمُؤْمِنُونَ حَقًّا ۚ لَّهُمْ دَرَجَاتٌ عِندَ رَبِّهِمْ وَمَغْفِرَةٌ وَرِزْقٌ كَرِيمٌ",
    "كَمَا أَخْرَجَكَ رَبُّكَ مِن بَيْتِكَ بِالْحَقِّ وَإِنَّ فَرِيقًا مِّنَ الْمُؤْمِنِينَ لَكَارِهُونَ",
    "يُجَادِلُونَكَ فِي الْحَقِّ بَعْدَمَا تَبَيَّنَ كَأَنَّمَا يُسَاقُونَ إِلَى الْمَوْتِ وَهُمْ يَنظُرُونَ",
    "وَإِذْ يَعِدُكُمُ اللَّهُ إِحْدَى الطَّائِفَتَيْنِ أَنَّهَا لَكُمْ وَتَوَدُّونَ أَنَّ غَيْرَ ذَاتِ الشَّوْكَةِ تَكُونُ لَكُمْ وَيُرِيدُ اللَّهُ أَن يُحِقَّ الْحَقَّ بِكَلِمَاتِهِ وَيَقْطَعَ دَابِرَ الْكَافِرِينَ",
    "لِيُحِقَّ الْحَقَّ وَيُبْطِلَ الْبَاطِلَ وَلَوْ كَرِهَ الْمُجْرِمُونَ",
    "إِذْ تَسْتَغِيثُونَ رَبَّكُمْ فَاسْتَجَابَ لَكُمْ أَنِّي مُمِدُّكُم بِأَلْفٍ مِّنَ الْمَلَائِكَةِ مُرْدِفِينَ",
    "وَمَا جَعَلَهُ اللَّهُ إِلَّا بُشْرَىٰ وَلِتَطْمَئِنَّ بِهِ قُلُوبُكُمْ ۚ وَمَا النَّصْرُ إِلَّا مِنْ عِندِ اللَّهِ ۚ إِنَّ اللَّهَ عَزِيزٌ حَكِيمٌ",
    "إِذْ يُغَشِّيكُمُ النُّعَاسَ أَمَنَةً مِّنْهُ وَيُنَزِّلُ عَلَيْكُم مِّنَ السَّمَاءِ مَاءً لِّيُطَهِّرَكُم بِهِ وَيُذْهِبَ عَنكُمْ رِجْزَ الشَّيْطَانِ وَلِيَرْبِطَ عَلَىٰ قُلُوبِكُمْ وَيُثَبِّتَ بِهِ الْأَقْدَامَ",
    "إِذْ يُوحِي رَبُّكَ إِلَى الْمَلَائِكَةِ أَنِّي مَعَكُمْ فَثَبِّتُوا الَّذِينَ آمَنُوا ۚ سَأُلْقِي فِي قُلُوبِ الَّذِينَ كَفَرُوا الرُّعْبَ فَاضْرِبُوا فَوْقَ الْأَعْنَاقِ وَاضْرِبُوا مِنْهُمْ كُلَّ بَنَانٍ",
    "ذَٰلِكَ بِأَنَّهُمْ شَاقُّوا اللَّهَ وَرَسُولَهُ ۚ وَمَن يُشَاقِقِ اللَّهَ وَرَسُولَهُ فَإِنَّ اللَّهَ شَدِيدُ الْعِقَابِ",
    "ذَٰلِكُمْ فَذُوقُوهُ وَأَنَّ لِلْكَافِرِينَ عَذَابَ النَّارِ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِذَا لَقِيتُمُ الَّذِينَ كَفَرُوا زَحْفًا فَلَا تُوَلُّوهُمُ الْأَدْبَارَ",
    "وَمَن يُوَلِّهِمْ يَوْمَئِذٍ دُبُرَهُ إِلَّا مُتَحَرِّفًا لِّقِتَالٍ أَوْ مُتَحَيِّزًا إِلَىٰ فِئَةٍ فَقَدْ بَاءَ بِغَضَبٍ مِّنَ اللَّهِ وَمَأْوَاهُ جَهَنَّمُ ۖ وَبِئْسَ الْمَصِيرُ",
    "فَلَمْ تَقْتُلُوهُمْ وَلَٰكِنَّ اللَّهَ قَتَلَهُمْ ۚ وَمَا رَمَيْتَ إِذْ رَمَيْتَ وَلَٰكِنَّ اللَّهَ رَمَىٰ ۚ وَلِيُبْلِيَ الْمُؤْمِنِينَ مِنْهُ بَلَاءً حَسَنًا ۚ إِنَّ اللَّهَ سَمِيعٌ عَلِيمٌ",
    "ذَٰلِكُمْ وَأَنَّ اللَّهَ مُوهِنُ كَيْدِ الْكَافِرِينَ",
    "إِن تَسْتَفْتِحُوا فَقَدْ جَاءَكُمُ الْفَتْحُ ۖ وَإِن تَنتَهُوا فَهُوَ خَيْرٌ لَّكُمْ ۖ وَإِن تَعُودُوا نَعُدْ وَلَن تُغْنِيَ عَنكُمْ فِئَتُكُمْ شَيْئًا وَلَوْ كَثُرَتْ وَأَنَّ اللَّهَ مَعَ الْمُؤْمِنِينَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا أَطِيعُوا اللَّهَ وَرَسُولَهُ وَلَا تَوَلَّوْا عَنْهُ وَأَنتُمْ تَسْمَعُونَ",
    "وَلَا تَكُونُوا كَالَّذِينَ قَالُوا سَمِعْنَا وَهُمْ لَا يَسْمَعُونَ",
    "إِنَّ شَرَّ الدَّوَابِّ عِندَ اللَّهِ الصُّمُّ الْبُكْمُ الَّذِينَ لَا يَعْقِلُونَ",
    "وَلَوْ عَلِمَ اللَّهُ فِيهِمْ خَيْرًا لَّأَسْمَعَهُمْ ۖ وَلَوْ أَسْمَعَهُمْ لَتَوَلَّوا وَّهُم مُّعْرِضُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا اسْتَجِيبُوا لِلَّهِ وَلِلرَّسُولِ إِذَا دَعَاكُمْ لِمَا يُحْيِيكُمْ ۖ وَاعْلَمُوا أَنَّ اللَّهَ يَحُولُ بَيْنَ الْمَرْءِ وَقَلْبِهِ وَأَنَّهُ إِلَيْهِ تُحْشَرُونَ",
    "وَاتَّقُوا فِتْنَةً لَّا تُصِيبَنَّ الَّذِينَ ظَلَمُوا مِنكُمْ خَاصَّةً ۖ وَاعْلَمُوا أَنَّ اللَّهَ شَدِيدُ الْعِقَابِ",
    "وَاذْكُرُوا إِذْ أَنتُمْ قَلِيلٌ مُّسْتَضْعَفُونَ فِي الْأَرْضِ تَخَافُونَ أَن يَتَخَطَّفَكُمُ النَّاسُ فَآوَاكُمْ وَأَيَّدَكُم بِنَصْرِهِ وَرَزَقَكُم مِّنَ الطَّيِّبَاتِ لَعَلَّكُمْ تَشْكُرُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تَخُونُوا اللَّهَ وَالرَّسُولَ وَتَخُونُوا أَمَانَاتِكُمْ وَأَنتُمْ تَعْلَمُونَ",
    "وَاعْلَمُوا أَنَّمَا أَمْوَالُكُمْ وَأَوْلَادُكُمْ فِتْنَةٌ وَأَنَّ اللَّهَ عِندَهُ أَجْرٌ عَظِيمٌ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِن تَتَّقُوا اللَّهَ يَجْعَل لَّكُمْ فُرْقَانًا وَيُكَفِّرْ عَنكُمْ سَيِّئَاتِكُمْ وَيَغْفِرْ لَكُمْ ۗ وَاللَّهُ ذُو الْفَضْلِ الْعَظِيمِ",
    "وَإِذْ يَمْكُرُ بِكَ الَّذِينَ كَفَرُوا لِيُثْبِتُوكَ أَوْ يَقْتُلُوكَ أَوْ يُخْرِجُوكَ ۚ وَيَمْكُرُونَ وَيَمْكُرُ اللَّهُ ۖ وَاللَّهُ خَيْرُ الْمَاكِرِينَ",
    "وَإِذَا تُتْلَىٰ عَلَيْهِمْ آيَاتُنَا قَالُوا قَدْ سَمِعْنَا لَوْ نَشَاءُ لَقُلْنَا مِثْلَ هَٰذَا ۙ إِنْ هَٰذَا إِلَّا أَسَاطِيرُ الْأَوَّلِينَ",
    "وَإِذْ قَالُوا اللَّهُمَّ إِن كَانَ هَٰذَا هُوَ الْحَقَّ مِنْ عِندِكَ فَأَمْطِرْ عَلَيْنَا حِجَارَةً مِّنَ السَّمَاءِ أَوِ ائْتِنَا بِعَذَابٍ أَلِيمٍ",
    "وَمَا كَانَ اللَّهُ لِيُعَذِّبَهُمْ وَأَنتَ فِيهِمْ ۚ وَمَا كَانَ اللَّهُ مُعَذِّبَهُمْ وَهُمْ يَسْتَغْفِرُونَ",
    "وَمَا لَهُمْ أَلَّا يُعَذِّبَهُمُ اللَّهُ وَهُمْ يَصُدُّونَ عَنِ الْمَسْجِدِ الْحَرَامِ وَمَا كَانُوا أَوْلِيَاءَهُ ۚ إِنْ أَوْلِيَاؤُهُ إِلَّا الْمُتَّقُونَ وَلَٰكِنَّ أَكْثَرَهُمْ لَا يَعْلَمُونَ",
    "وَمَا كَانَ صَلَاتُهُمْ عِندَ الْبَيْتِ إِلَّا مُكَاءً وَتَصْدِيَةً ۚ فَذُوقُوا الْعَذَابَ بِمَا كُنتُمْ تَكْفُرُونَ",
    "إِنَّ الَّذِينَ كَفَرُوا يُنفِقُونَ أَمْوَالَهُمْ لِيَصُدُّوا عَن سَبِيلِ اللَّهِ ۚ فَسَيُنفِقُونَهَا ثُمَّ تَكُونُ عَلَيْهِمْ حَسْرَةً ثُمَّ يُغْلَبُونَ ۗ وَالَّذِينَ كَفَرُوا إِلَىٰ جَهَنَّمَ يُحْشَرُونَ",
    "لِيَمِيزَ اللَّهُ الْخَبِيثَ مِنَ الطَّيِّبِ وَيَجْعَلَ الْخَبِيثَ بَعْضَهُ عَلَىٰ بَعْضٍ فَيَرْكُمَهُ جَمِيعًا فَيَجْعَلَهُ فِي جَهَنَّمَ ۚ أُولَٰئِكَ هُمُ الْخَاسِرُونَ",
    "قُل لِّلَّذِينَ كَفَرُوا إِن يَنتَهُوا يُغْفَرْ لَهُم مَّا قَدْ سَلَفَ وَإِن يَعُودُوا فَقَدْ مَضَتْ سُنَّتُ الْأَوَّلِينَ",
    "وَقَاتِلُوهُمْ حَتَّىٰ لَا تَكُونَ فِتْنَةٌ وَيَكُونَ الدِّينُ كُلُّهُ لِلَّهِ ۚ فَإِنِ انتَهَوْا فَإِنَّ اللَّهَ بِمَا يَعْمَلُونَ بَصِيرٌ",
    "وَإِن تَوَلَّوْا فَاعْلَمُوا أَنَّ اللَّهَ مَوْلَاكُمْ ۚ نِعْمَ الْمَوْلَىٰ وَنِعْمَ النَّصِيرُ",
    "وَاعْلَمُوا أَنَّمَا غَنِمْتُم مِّن شَيْءٍ فَأَنَّ لِلَّهِ خُمُسَهُ وَلِلرَّسُولِ وَلِذِي الْقُرْبَىٰ وَالْيَتَامَىٰ وَالْمَسَاكِينِ وَابْنِ السَّبِيلِ إِن كُنتُمْ آمَنتُم بِاللَّهِ وَمَا أَنزَلْنَا عَلَىٰ عَبْدِنَا يَوْمَ الْفُرْقَانِ يَوْمَ الْتَقَى الْجَمْعَانِ ۗ وَاللَّهُ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "إِذْ أَنتُم بِالْعُدْوَةِ الدُّنْيَا وَهُم بِالْعُدْوَةِ الْقُصْوَىٰ وَالرَّكْبُ أَسْفَلَ مِنكُمْ ۚ وَلَوْ تَوَاعَدتُّمْ لَاخْتَلَفْتُمْ فِي الْمِيعَادِ ۙ وَلَٰكِن لِّيَقْضِيَ اللَّهُ أَمْرًا كَانَ مَفْعُولًا لِّيَهْلِكَ مَنْ هَلَكَ عَن بَيِّنَةٍ وَيَحْيَىٰ مَنْ حَيَّ عَن بَيِّنَةٍ ۗ وَإِنَّ اللَّهَ لَسَمِيعٌ عَلِيمٌ",
    "إِذْ يُرِيكَهُمُ اللَّهُ فِي مَنَامِكَ قَلِيلًا ۖ وَلَوْ أَرَاكَهُمْ كَثِيرًا لَّفَشِلْتُمْ وَلَتَنَازَعْتُمْ فِي الْأَمْرِ وَلَٰكِنَّ اللَّهَ سَلَّمَ ۗ إِنَّهُ عَلِيمٌ بِذَاتِ الصُّدُورِ",
    "وَإِذْ يُرِيكُمُوهُمْ إِذِ الْتَقَيْتُمْ فِي أَعْيُنِكُمْ قَلِيلًا وَيُقَلِّلُكُمْ فِي أَعْيُنِهِمْ لِيَقْضِيَ اللَّهُ أَمْرًا كَانَ مَفْعُولًا ۗ وَإِلَى اللَّهِ تُرْجَعُ الْأُمُورُ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِذَا لَقِيتُمْ فِئَةً فَاثْبُتُوا وَاذْكُرُوا اللَّهَ كَثِيرًا لَّعَلَّكُمْ تُفْلِحُونَ",
    "وَأَطِيعُوا اللَّهَ وَرَسُولَهُ وَلَا تَنَازَعُوا فَتَفْشَلُوا وَتَذْهَبَ رِيحُكُمْ ۖ وَاصْبِرُوا ۚ إِنَّ اللَّهَ مَعَ الصَّابِرِينَ",
    "وَلَا تَكُونُوا كَالَّذِينَ خَرَجُوا مِن دِيَارِهِم بَطَرًا وَرِئَاءَ النَّاسِ وَيَصُدُّونَ عَن سَبِيلِ اللَّهِ ۚ وَاللَّهُ بِمَا يَعْمَلُونَ مُحِيطٌ",
    "وَإِذْ زَيَّنَ لَهُمُ الشَّيْطَانُ أَعْمَالَهُمْ وَقَالَ لَا غَالِبَ لَكُمُ الْيَوْمَ مِنَ النَّاسِ وَإِنِّي جَارٌ لَّكُمْ ۖ فَلَمَّا تَرَاءَتِ الْفِئَتَانِ نَكَصَ عَلَىٰ عَقِبَيْهِ وَقَالَ إِنِّي بَرِيءٌ مِّنكُمْ إِنِّي أَرَىٰ مَا لَا تَرَوْنَ إِنِّي أَخَافُ اللَّهَ ۚ وَاللَّهُ شَدِيدُ الْعِقَابِ",
    "إِذْ يَقُولُ الْمُنَافِقُونَ وَالَّذِينَ فِي قُلُوبِهِم مَّرَضٌ غَرَّ هَٰؤُلَاءِ دِينُهُمْ ۗ وَمَن يَتَوَكَّلْ عَلَى اللَّهِ فَإِنَّ اللَّهَ عَزِيزٌ حَكِيمٌ",
    "وَلَوْ تَرَىٰ إِذْ يَتَوَفَّى الَّذِينَ كَفَرُوا ۙ الْمَلَائِكَةُ يَضْرِبُونَ وُجُوهَهُمْ وَأَدْبَارَهُمْ وَذُوقُوا عَذَابَ الْحَرِيقِ",
    "ذَٰلِكَ بِمَا قَدَّمَتْ أَيْدِيكُمْ وَأَنَّ اللَّهَ لَيْسَ بِظَلَّامٍ لِّلْعَبِيدِ",
    "كَدَأْبِ آلِ فِرْعَوْنَ ۙ وَالَّذِينَ مِن قَبْلِهِمْ ۚ كَفَرُوا بِآيَاتِ اللَّهِ فَأَخَذَهُمُ اللَّهُ بِذُنُوبِهِمْ ۗ إِنَّ اللَّهَ قَوِيٌّ شَدِيدُ الْعِقَابِ",
    "ذَٰلِكَ بِأَنَّ اللَّهَ لَمْ يَكُ مُغَيِّرًا نِّعْمَةً أَنْعَمَهَا عَلَىٰ قَوْمٍ حَتَّىٰ يُغَيِّرُوا مَا بِأَنفُسِهِمْ ۙ وَأَنَّ اللَّهَ سَمِيعٌ عَلِيمٌ",
    "كَدَأْبِ آلِ فِرْعَوْنَ ۙ وَالَّذِينَ مِن قَبْلِهِمْ ۚ كَذَّبُوا بِآيَاتِ رَبِّهِمْ فَأَهْلَكْنَاهُم بِذُنُوبِهِمْ وَأَغْرَقْنَا آلَ فِرْعَوْنَ ۚ وَكُلٌّ كَانُوا ظَالِمِينَ",
    "إِنَّ شَرَّ الدَّوَابِّ عِندَ اللَّهِ الَّذِينَ كَفَرُوا فَهُمْ لَا يُؤْمِنُونَ",
    "الَّذِينَ عَاهَدتَّ مِنْهُمْ ثُمَّ يَنقُضُونَ عَهْدَهُمْ فِي كُلِّ مَرَّةٍ وَهُمْ لَا يَتَّقُونَ",
    "فَإِمَّا تَثْقَفَنَّهُمْ فِي الْحَرْبِ فَشَرِّدْ بِهِم مَّنْ خَلْفَهُمْ لَعَلَّهُمْ يَذَّكَّرُونَ",
    "وَإِمَّا تَخَافَنَّ مِن قَوْمٍ خِيَانَةً فَانبِذْ إِلَيْهِمْ عَلَىٰ سَوَاءٍ ۚ إِنَّ اللَّهَ لَا يُحِبُّ الْخَائِنِينَ",
    "وَلَا يَحْسَبَنَّ الَّذِينَ كَفَرُوا سَبَقُوا ۚ إِنَّهُمْ لَا يُعْجِزُونَ",
    "وَأَعِدُّوا لَهُم مَّا اسْتَطَعْتُم مِّن قُوَّةٍ وَمِن رِّبَاطِ الْخَيْلِ تُرْهِبُونَ بِهِ عَدُوَّ اللَّهِ وَعَدُوَّكُمْ وَآخَرِينَ مِن دُونِهِمْ لَا تَعْلَمُونَهُمُ اللَّهُ يَعْلَمُهُمْ ۚ وَمَا تُنفِقُوا مِن شَيْءٍ فِي سَبِيلِ اللَّهِ يُوَفَّ إِلَيْكُمْ وَأَنتُمْ لَا تُظْلَمُونَ",
    "وَإِن جَنَحُوا لِلسَّلْمِ فَاجْنَحْ لَهَا وَتَوَكَّلْ عَلَى اللَّهِ ۚ إِنَّهُ هُوَ السَّمِيعُ الْعَلِيمُ",
    "وَإِن يُرِيدُوا أَن يَخْدَعُوكَ فَإِنَّ حَسْبَكَ اللَّهُ ۚ هُوَ الَّذِي أَيَّدَكَ بِنَصْرِهِ وَبِالْمُؤْمِنِينَ",
    "وَأَلَّفَ بَيْنَ قُلُوبِهِمْ ۚ لَوْ أَنفَقْتَ مَا فِي الْأَرْضِ جَمِيعًا مَّا أَلَّفْتَ بَيْنَ قُلُوبِهِمْ وَلَٰكِنَّ اللَّهَ أَلَّفَ بَيْنَهُمْ ۚ إِنَّهُ عَزِيزٌ حَكِيمٌ",
    "يَا أَيُّهَا النَّبِيُّ حَسْبُكَ اللَّهُ وَمَنِ اتَّبَعَكَ مِنَ الْمُؤْمِنِينَ",
    "يَا أَيُّهَا النَّبِيُّ حَرِّضِ الْمُؤْمِنِينَ عَلَى الْقِتَالِ ۚ إِن يَكُن مِّنكُمْ عِشْرُونَ صَابِرُونَ يَغْلِبُوا مِائَتَيْنِ ۚ وَإِن يَكُن مِّنكُم مِّائَةٌ يَغْلِبُوا أَلْفًا مِّنَ الَّذِينَ كَفَرُوا بِأَنَّهُمْ قَوْمٌ لَّا يَفْقَهُونَ",
    "الْآنَ خَفَّفَ اللَّهُ عَنكُمْ وَعَلِمَ أَنَّ فِيكُمْ ضَعْفًا ۚ فَإِن يَكُن مِّنكُم مِّائَةٌ صَابِرَةٌ يَغْلِبُوا مِائَتَيْنِ ۚ وَإِن يَكُن مِّنكُمْ أَلْفٌ يَغْلِبُوا أَلْفَيْنِ بِإِذْنِ اللَّهِ ۗ وَاللَّهُ مَعَ الصَّابِرِينَ",
    "مَا كَانَ لِنَبِيٍّ أَن يَكُونَ لَهُ أَسْرَىٰ حَتَّىٰ يُثْخِنَ فِي الْأَرْضِ ۚ تُرِيدُونَ عَرَضَ الدُّنْيَا وَاللَّهُ يُرِيدُ الْآخِرَةَ ۗ وَاللَّهُ عَزِيزٌ حَكِيمٌ",
    "لَّوْلَا كِتَابٌ مِّنَ اللَّهِ سَبَقَ لَمَسَّكُمْ فِيمَا أَخَذْتُمْ عَذَابٌ عَظِيمٌ",
    "فَكُلُوا مِمَّا غَنِمْتُمْ حَلَالًا طَيِّبًا ۚ وَاتَّقُوا اللَّهَ ۚ إِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ",
    "يَا أَيُّهَا النَّبِيُّ قُل لِّمَن فِي أَيْدِيكُم مِّنَ الْأَسْرَىٰ إِن يَعْلَمِ اللَّهُ فِي قُلُوبِكُمْ خَيْرًا يُؤْتِكُمْ خَيْرًا مِّمَّا أُخِذَ مِنكُمْ وَيَغْفِرْ لَكُمْ ۗ وَاللَّهُ غَفُورٌ رَّحِيمٌ",
    "وَإِن يُرِيدُوا خِيَانَتَكَ فَقَدْ خَانُوا اللَّهَ مِن قَبْلُ فَأَمْكَنَ مِنْهُمْ ۗ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "إِنَّ الَّذِينَ آمَنُوا وَهَاجَرُوا وَجَاهَدُوا بِأَمْوَالِهِمْ وَأَنفُسِهِمْ فِي سَبِيلِ اللَّهِ وَالَّذِينَ آوَوا وَّنَصَرُوا أُولَٰئِكَ بَعْضُهُمْ أَوْلِيَاءُ بَعْضٍ ۚ وَالَّذِينَ آمَنُوا وَلَمْ يُهَاجِرُوا مَا لَكُم مِّن وَلَايَتِهِم مِّن شَيْءٍ حَتَّىٰ يُهَاجِرُوا ۚ وَإِنِ اسْتَنصَرُوكُمْ فِي الدِّينِ فَعَلَيْكُمُ النَّصْرُ إِلَّا عَلَىٰ قَوْمٍ بَيْنَكُمْ وَبَيْنَهُم مِّيثَاقٌ ۗ وَاللَّهُ بِمَا تَعْمَلُونَ بَصِيرٌ",
    "وَالَّذِينَ كَفَرُوا بَعْضُهُمْ أَوْلِيَاءُ بَعْضٍ ۚ إِلَّا تَفْعَلُوهُ تَكُن فِتْنَةٌ فِي الْأَرْضِ وَفَسَادٌ كَبِيرٌ",
    "وَالَّذِينَ آمَنُوا وَهَاجَرُوا وَجَاهَدُوا فِي سَبِيلِ اللَّهِ وَالَّذِينَ آوَوا وَّنَصَرُوا أُولَٰئِكَ هُمُ الْمُؤْمِنُونَ حَقًّا ۚ لَّهُم مَّغْفِرَةٌ وَرِزْقٌ كَرِيمٌ",
    "وَالَّذِينَ آمَنُوا مِن بَعْدُ وَهَاجَرُوا وَجَاهَدُوا مَعَكُمْ فَأُولَٰئِكَ مِنكُمْ ۚ وَأُولُو الْأَرْحَامِ بَعْضُهُمْ أَوْلَىٰ بِبَعْضٍ فِي كِتَابِ اللَّهِ ۗ إِنَّ اللَّهَ بِكُلِّ شَيْءٍ عَلِيمٌ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"They ask you, [O Muhammad], about the bounties [of war]. Say, \"The [decision concerning] bounties is for Allah and the Messenger.\" So fear Allah and amend that which is between you and obey Allah and His Messenger, if you should be believers.",
    "The believers are only those who, when Allah is mentioned, their hearts become fearful, and when His verses are recited to them, it increases them in faith; and upon their Lord they rely -",
    "The ones who establish prayer, and from what We have provided them, they spend.",
    "Those are the believers, truly. For them are degrees [of high position] with their Lord and forgiveness and noble provision.",
    "[It is] just as when your Lord brought you out of your home [for the battle of Badr] in truth, while indeed, a party among the believers were unwilling,",
    "Arguing with you concerning the truth after it had become clear, as if they were being driven toward death while they were looking on.",
    "[Remember, O believers], when Allah promised you one of the two groups - that it would be yours - and you wished that the unarmed one would be yours. But Allah intended to establish the truth by His words and to eliminate the disbelievers",
    "That He should establish the truth and abolish falsehood, even if the criminals disliked it.",
    "[Remember] when you asked help of your Lord, and He answered you, \"Indeed, I will reinforce you with a thousand from the angels, following one another.\"",
    "And Allah made it not but good tidings and so that your hearts would be assured thereby. And victory is not but from Allah. Indeed, Allah is Exalted in Might and Wise.",
    "[Remember] when He overwhelmed you with drowsiness [giving] security from Him and sent down upon you from the sky, rain by which to purify you and remove from you the evil [suggestions] of Satan and to make steadfast your hearts and plant firmly thereby your feet.",
    "[Remember] when your Lord inspired to the angels, \"I am with you, so strengthen those who have believed. I will cast terror into the hearts of those who disbelieved, so strike [them] upon the necks and strike from them every fingertip.\"",
    "That is because they opposed Allah and His Messenger. And whoever opposes Allah and His Messenger - indeed, Allah is severe in penalty.",
    "\"That [is yours], so taste it.\" And indeed for the disbelievers is the punishment of the Fire.",
    "O you who have believed, when you meet those who disbelieve advancing [for battle], do not turn to them your backs [in flight].",
    "And whoever turns his back to them on such a day, unless swerving [as a strategy] for war or joining [another] company, has certainly returned with anger [upon him] from Allah, and his refuge is Hell - and wretched is the destination.",
    "And you did not kill them, but it was Allah who killed them. And you threw not, [O Muhammad], when you threw, but it was Allah who threw that He might test the believers with a good test. Indeed, Allah is Hearing and Knowing.",
    "That [is so], and [also] that Allah will weaken the plot of the disbelievers.",
    "If you [disbelievers] seek the victory - the defeat has come to you. And if you desist [from hostilities], it is best for you; but if you return [to war], We will return, and never will you be availed by your [large] company at all, even if it should increase; and [that is] because Allah is with the believers.",
    "O you who have believed, obey Allah and His Messenger and do not turn from him while you hear [his order].",
    "And do not be like those who say, \"We have heard,\" while they do not hear.",
    "Indeed, the worst of living creatures in the sight of Allah are the deaf and dumb who do not use reason.",
    "Had Allah known any good in them, He would have made them hear. And if He had made them hear, they would [still] have turned away, while they were refusing.",
    "O you who have believed, respond to Allah and to the Messenger when he calls you to that which gives you life. And know that Allah intervenes between a man and his heart and that to Him you will be gathered.",
    "And fear a trial which will not strike those who have wronged among you exclusively, and know that Allah is severe in penalty.",
    "And remember when you were few and oppressed in the land, fearing that people might abduct you, but He sheltered you, supported you with His victory, and provided you with good things - that you might be grateful.",
    "O you who have believed, do not betray Allah and the Messenger or betray your trusts while you know [the consequence].",
    "And know that your properties and your children are but a trial and that Allah has with Him a great reward.",
    "O you who have believed, if you fear Allah, He will grant you a criterion and will remove from you your misdeeds and forgive you. And Allah is the possessor of great bounty.",
    "And [remember, O Muhammad], when those who disbelieved plotted against you to restrain you or kill you or evict you [from Makkah]. But they plan, and Allah plans. And Allah is the best of planners.",
    "And when Our verses are recited to them, they say, \"We have heard. If we willed, we could say [something] like this. This is not but legends of the former peoples.\"",
    "And [remember] when they said, \"O Allah, if this should be the truth from You, then rain down upon us stones from the sky or bring us a painful punishment.\"",
    "But Allah would not punish them while you, [O Muhammad], are among them, and Allah would not punish them while they seek forgiveness.",
    "But why should Allah not punish them while they obstruct [people] from al-Masjid al- Haram and they were not [fit to be] its guardians? Its [true] guardians are not but the righteous, but most of them do not know.",
    "And their prayer at the House was not except whistling and handclapping. So taste the punishment for what you disbelieved.",
    "Indeed, those who disbelieve spend their wealth to avert [people] from the way of Allah. So they will spend it; then it will be for them a [source of] regret; then they will be overcome. And those who have disbelieved - unto Hell they will be gathered.",
    "[This is] so that Allah may distinguish the wicked from the good and place the wicked some of them upon others and heap them all together and put them into Hell. It is those who are the losers.",
    "Say to those who have disbelieved [that] if they cease, what has previously occurred will be forgiven for them. But if they return [to hostility] - then the precedent of the former [rebellious] peoples has already taken place.",
    "And fight them until there is no fitnah and [until] the religion, all of it, is for Allah. And if they cease - then indeed, Allah is Seeing of what they do.",
    "But if they turn away - then know that Allah is your protector. Excellent is the protector, and Excellent is the helper.",
    "And know that anything you obtain of war booty - then indeed, for Allah is one fifth of it and for the Messenger and for [his] near relatives and the orphans, the needy, and the [stranded] traveler, if you have believed in Allah and in that which We sent down to Our Servant on the day of criterion - the day when the two armies met. And Allah, over all things, is competent.",
    "[Remember] when you were on the near side of the valley, and they were on the farther side, and the caravan was lower [in position] than you. If you had made an appointment [to meet], you would have missed the appointment. But [it was] so that Allah might accomplish a matter already destined - that those who perished [through disbelief] would perish upon evidence and those who lived [in faith] would live upon evidence; and indeed, Allah is Hearing and Knowing.",
    "[Remember, O Muhammad], when Allah showed them to you in your dream as few; and if He had shown them to you as many, you [believers] would have lost courage and would have disputed in the matter [of whether to fight], but Allah saved [you from that]. Indeed, He is Knowing of that within the breasts.",
    "And [remember] when He showed them to you, when you met, as few in your eyes, and He made you [appear] as few in their eyes so that Allah might accomplish a matter already destined. And to Allah are [all] matters returned.",
    "O you who have believed, when you encounter a company [from the enemy forces], stand firm and remember Allah much that you may be successful.",
    "And obey Allah and His Messenger, and do not dispute and [thus] lose courage and [then] your strength would depart; and be patient. Indeed, Allah is with the patient.",
    "And do not be like those who came forth from their homes insolently and to be seen by people and avert [them] from the way of Allah. And Allah is encompassing of what they do.",
    "And [remember] when Satan made their deeds pleasing to them and said, \"No one can overcome you today from among the people, and indeed, I am your protector.\" But when the two armies sighted each other, he turned on his heels and said, \"Indeed, I am disassociated from you. Indeed, I see what you do not see; indeed I fear Allah. And Allah is severe in penalty.\"",
    "[Remember] when the hypocrites and those in whose hearts was disease said, \"Their religion has deluded those [Muslims].\" But whoever relies upon Allah - then indeed, Allah is Exalted in Might and Wise.",
    "And if you could but see when the angels take the souls of those who disbelieved... They are striking their faces and their backs and [saying], \"Taste the punishment of the Burning Fire.",
    "That is for what your hands have put forth [of evil] and because Allah is not ever unjust to His servants.\"",
    "[Theirs is] like the custom of the people of Pharaoh and of those before them. They disbelieved in the signs of Allah, so Allah seized them for their sins. Indeed, Allah is Powerful and severe in penalty.",
    "That is because Allah would not change a favor which He had bestowed upon a people until they change what is within themselves. And indeed, Allah is Hearing and Knowing.",
    "[Theirs is] like the custom of the people of Pharaoh and of those before them. They denied the signs of their Lord, so We destroyed them for their sins, and We drowned the people of Pharaoh. And all [of them] were wrongdoers.",
    "Indeed, the worst of living creatures in the sight of Allah are those who have disbelieved, and they will not [ever] believe -",
    "The ones with whom you made a treaty but then they break their pledge every time, and they do not fear Allah.",
    "So if you, [O Muhammad], gain dominance over them in war, disperse by [means of] them those behind them that perhaps they will be reminded.",
    "If you [have reason to] fear from a people betrayal, throw [their treaty] back to them, [putting you] on equal terms. Indeed, Allah does not like traitors.",
    "And let not those who disbelieve think they will escape. Indeed, they will not cause failure [to Allah].",
    "And prepare against them whatever you are able of power and of steeds of war by which you may terrify the enemy of Allah and your enemy and others besides them whom you do not know [but] whom Allah knows. And whatever you spend in the cause of Allah will be fully repaid to you, and you will not be wronged.",
    "And if they incline to peace, then incline to it [also] and rely upon Allah. Indeed, it is He who is the Hearing, the Knowing.",
    "But if they intend to deceive you - then sufficient for you is Allah. It is He who supported you with His help and with the believers",
    "And brought together their hearts. If you had spent all that is in the earth, you could not have brought their hearts together; but Allah brought them together. Indeed, He is Exalted in Might and Wise.",
    "O Prophet, sufficient for you is Allah and for whoever follows you of the believers.",
    "O Prophet, urge the believers to battle. If there are among you twenty [who are] steadfast, they will overcome two hundred. And if there are among you one hundred [who are] steadfast, they will overcome a thousand of those who have disbelieved because they are a people who do not understand.",
    "Now, Allah has lightened [the hardship] for you, and He knows that among you is weakness. So if there are from you one hundred [who are] steadfast, they will overcome two hundred. And if there are among you a thousand, they will overcome two thousand by permission of Allah. And Allah is with the steadfast.",
    "It is not for a prophet to have captives [of war] until he inflicts a massacre [upon Allah's enemies] in the land. Some Muslims desire the commodities of this world, but Allah desires [for you] the Hereafter. And Allah is Exalted in Might and Wise.",
    "If not for a decree from Allah that preceded, you would have been touched for what you took by a great punishment.",
    "So consume what you have taken of war booty [as being] lawful and good, and fear Allah. Indeed, Allah is Forgiving and Merciful.",
    "O Prophet, say to whoever is in your hands of the captives, \"If Allah knows [any] good in your hearts, He will give you [something] better than what was taken from you, and He will forgive you; and Allah is Forgiving and Merciful.\"",
    "But if they intend to betray you - then they have already betrayed Allah before, and He empowered [you] over them. And Allah is Knowing and Wise.",
    "Indeed, those who have believed and emigrated and fought with their wealth and lives in the cause of Allah and those who gave shelter and aided - they are allies of one another. But those who believed and did not emigrate - for you there is no guardianship of them until they emigrate. And if they seek help of you for the religion, then you must help, except against a people between yourselves and whom is a treaty. And Allah is Seeing of what you do.",
    "And those who disbelieved are allies of one another. If you do not do so, there will be fitnah on earth and great corruption.",
    "But those who have believed and emigrated and fought in the cause of Allah and those who gave shelter and aided - it is they who are the believers, truly. For them is forgiveness and noble provision.",
    "And those who believed after [the initial emigration] and emigrated and fought with you - they are of you. But those of [blood] relationship are more entitled [to inheritance] in the decree of Allah. Indeed, Allah is Knowing of all things."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__anfal);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_anfal);
        adapter = new Al_Fatihah_Adapter(verses, arabic_verses, sahih_international, english_verses);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        mediaPlayer = new MediaPlayer();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.play_arrow_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        try {
            mediaPlayer.setDataSource(URL1);
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer1) {
                    mediaPlayer1.start();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.onOptionsItemSelected(item);
    }
}
