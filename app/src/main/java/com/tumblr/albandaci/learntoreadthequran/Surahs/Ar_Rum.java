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

public class Ar_Rum extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"30:1", "30:2", "30:3", "30:4", "30:5", "30:6", "30:7", "30:8", "30:9", "30:10", "30:11", "30:12", "30:13", "30:14", "30:15", "30:16",
            "30:17", "30:18", "30:19", "30:20", "30:21", "30:22", "30:23", "30:24", "30:25", "30:26", "30:27", "30:28", "30:29", "30:30", "30:31", "30:32",
            "30:33", "30:34", "30:35", "30:36", "30:37", "30:38", "30:39", "30:40", "30:41", "30:42", "30:43", "30:44", "30:45", "30:46", "30:47", "30:48",
            "30:49", "30:50", "30:51", "30:52", "30:53", "30:54", "30:55", "30:56", "30:57", "30:58", "30:59", "30:60", ""};

    String [] arabic_verses = {"الم",
    "غُلِبَتِ الرُّومُ",
    "فِي أَدْنَى الْأَرْضِ وَهُم مِّن بَعْدِ غَلَبِهِمْ سَيَغْلِبُونَ",
    "فِي بِضْعِ سِنِينَ ۗ لِلَّهِ الْأَمْرُ مِن قَبْلُ وَمِن بَعْدُ ۚ وَيَوْمَئِذٍ يَفْرَحُ الْمُؤْمِنُونَ",
    "بِنَصْرِ اللَّهِ ۚ يَنصُرُ مَن يَشَاءُ ۖ وَهُوَ الْعَزِيزُ الرَّحِيمُ",
    "وَعْدَ اللَّهِ ۖ لَا يُخْلِفُ اللَّهُ وَعْدَهُ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ",
    "يَعْلَمُونَ ظَاهِرًا مِّنَ الْحَيَاةِ الدُّنْيَا وَهُمْ عَنِ الْآخِرَةِ هُمْ غَافِلُونَ",
    "أَوَلَمْ يَتَفَكَّرُوا فِي أَنفُسِهِم ۗ مَّا خَلَقَ اللَّهُ السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا إِلَّا بِالْحَقِّ وَأَجَلٍ مُّسَمًّى ۗ وَإِنَّ كَثِيرًا مِّنَ النَّاسِ بِلِقَاءِ رَبِّهِمْ لَكَافِرُونَ",
    "أَوَلَمْ يَسِيرُوا فِي الْأَرْضِ فَيَنظُرُوا كَيْفَ كَانَ عَاقِبَةُ الَّذِينَ مِن قَبْلِهِمْ ۚ كَانُوا أَشَدَّ مِنْهُمْ قُوَّةً وَأَثَارُوا الْأَرْضَ وَعَمَرُوهَا أَكْثَرَ مِمَّا عَمَرُوهَا وَجَاءَتْهُمْ رُسُلُهُم بِالْبَيِّنَاتِ ۖ فَمَا كَانَ اللَّهُ لِيَظْلِمَهُمْ وَلَٰكِن كَانُوا أَنفُسَهُمْ يَظْلِمُونَ",
    "ثُمَّ كَانَ عَاقِبَةَ الَّذِينَ أَسَاءُوا السُّوأَىٰ أَن كَذَّبُوا بِآيَاتِ اللَّهِ وَكَانُوا بِهَا يَسْتَهْزِئُونَ",
    "اللَّهُ يَبْدَأُ الْخَلْقَ ثُمَّ يُعِيدُهُ ثُمَّ إِلَيْهِ تُرْجَعُونَ",
    "وَيَوْمَ تَقُومُ السَّاعَةُ يُبْلِسُ الْمُجْرِمُونَ",
    "وَلَمْ يَكُن لَّهُم مِّن شُرَكَائِهِمْ شُفَعَاءُ وَكَانُوا بِشُرَكَائِهِمْ كَافِرِينَ",
    "وَيَوْمَ تَقُومُ السَّاعَةُ يَوْمَئِذٍ يَتَفَرَّقُونَ",
    "فَأَمَّا الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ فَهُمْ فِي رَوْضَةٍ يُحْبَرُونَ",
    "وَأَمَّا الَّذِينَ كَفَرُوا وَكَذَّبُوا بِآيَاتِنَا وَلِقَاءِ الْآخِرَةِ فَأُولَٰئِكَ فِي الْعَذَابِ مُحْضَرُونَ",
    "فَسُبْحَانَ اللَّهِ حِينَ تُمْسُونَ وَحِينَ تُصْبِحُونَ",
    "وَلَهُ الْحَمْدُ فِي السَّمَاوَاتِ وَالْأَرْضِ وَعَشِيًّا وَحِينَ تُظْهِرُونَ",
    "يُخْرِجُ الْحَيَّ مِنَ الْمَيِّتِ وَيُخْرِجُ الْمَيِّتَ مِنَ الْحَيِّ وَيُحْيِي الْأَرْضَ بَعْدَ مَوْتِهَا ۚ وَكَذَٰلِكَ تُخْرَجُونَ",
    "وَمِنْ آيَاتِهِ أَنْ خَلَقَكُم مِّن تُرَابٍ ثُمَّ إِذَا أَنتُم بَشَرٌ تَنتَشِرُونَ",
    "وَمِنْ آيَاتِهِ أَنْ خَلَقَ لَكُم مِّنْ أَنفُسِكُمْ أَزْوَاجًا لِّتَسْكُنُوا إِلَيْهَا وَجَعَلَ بَيْنَكُم مَّوَدَّةً وَرَحْمَةً ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يَتَفَكَّرُونَ",
    "وَمِنْ آيَاتِهِ خَلْقُ السَّمَاوَاتِ وَالْأَرْضِ وَاخْتِلَافُ أَلْسِنَتِكُمْ وَأَلْوَانِكُمْ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّلْعَالِمِينَ",
    "وَمِنْ آيَاتِهِ مَنَامُكُم بِاللَّيْلِ وَالنَّهَارِ وَابْتِغَاؤُكُم مِّن فَضْلِهِ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يَسْمَعُونَ",
    "وَمِنْ آيَاتِهِ يُرِيكُمُ الْبَرْقَ خَوْفًا وَطَمَعًا وَيُنَزِّلُ مِنَ السَّمَاءِ مَاءً فَيُحْيِي بِهِ الْأَرْضَ بَعْدَ مَوْتِهَا ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يَعْقِلُونَ",
    "وَمِنْ آيَاتِهِ أَن تَقُومَ السَّمَاءُ وَالْأَرْضُ بِأَمْرِهِ ۚ ثُمَّ إِذَا دَعَاكُمْ دَعْوَةً مِّنَ الْأَرْضِ إِذَا أَنتُمْ تَخْرُجُونَ",
    "وَلَهُ مَن فِي السَّمَاوَاتِ وَالْأَرْضِ ۖ كُلٌّ لَّهُ قَانِتُونَ",
    "وَهُوَ الَّذِي يَبْدَأُ الْخَلْقَ ثُمَّ يُعِيدُهُ وَهُوَ أَهْوَنُ عَلَيْهِ ۚ وَلَهُ الْمَثَلُ الْأَعْلَىٰ فِي السَّمَاوَاتِ وَالْأَرْضِ ۚ وَهُوَ الْعَزِيزُ الْحَكِيمُ",
    "ضَرَبَ لَكُم مَّثَلًا مِّنْ أَنفُسِكُمْ ۖ هَل لَّكُم مِّن مَّا مَلَكَتْ أَيْمَانُكُم مِّن شُرَكَاءَ فِي مَا رَزَقْنَاكُمْ فَأَنتُمْ فِيهِ سَوَاءٌ تَخَافُونَهُمْ كَخِيفَتِكُمْ أَنفُسَكُمْ ۚ كَذَٰلِكَ نُفَصِّلُ الْآيَاتِ لِقَوْمٍ يَعْقِلُونَ",
    "بَلِ اتَّبَعَ الَّذِينَ ظَلَمُوا أَهْوَاءَهُم بِغَيْرِ عِلْمٍ ۖ فَمَن يَهْدِي مَنْ أَضَلَّ اللَّهُ ۖ وَمَا لَهُم مِّن نَّاصِرِينَ",
    "فَأَقِمْ وَجْهَكَ لِلدِّينِ حَنِيفًا ۚ فِطْرَتَ اللَّهِ الَّتِي فَطَرَ النَّاسَ عَلَيْهَا ۚ لَا تَبْدِيلَ لِخَلْقِ اللَّهِ ۚ ذَٰلِكَ الدِّينُ الْقَيِّمُ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ",
    "مُنِيبِينَ إِلَيْهِ وَاتَّقُوهُ وَأَقِيمُوا الصَّلَاةَ وَلَا تَكُونُوا مِنَ الْمُشْرِكِينَ",
    "مِنَ الَّذِينَ فَرَّقُوا دِينَهُمْ وَكَانُوا شِيَعًا ۖ كُلُّ حِزْبٍ بِمَا لَدَيْهِمْ فَرِحُونَ",
    "وَإِذَا مَسَّ النَّاسَ ضُرٌّ دَعَوْا رَبَّهُم مُّنِيبِينَ إِلَيْهِ ثُمَّ إِذَا أَذَاقَهُم مِّنْهُ رَحْمَةً إِذَا فَرِيقٌ مِّنْهُم بِرَبِّهِمْ يُشْرِكُونَ",
    "لِيَكْفُرُوا بِمَا آتَيْنَاهُمْ ۚ فَتَمَتَّعُوا فَسَوْفَ تَعْلَمُونَ",
    "أَمْ أَنزَلْنَا عَلَيْهِمْ سُلْطَانًا فَهُوَ يَتَكَلَّمُ بِمَا كَانُوا بِهِ يُشْرِكُونَ",
    "وَإِذَا أَذَقْنَا النَّاسَ رَحْمَةً فَرِحُوا بِهَا ۖ وَإِن تُصِبْهُمْ سَيِّئَةٌ بِمَا قَدَّمَتْ أَيْدِيهِمْ إِذَا هُمْ يَقْنَطُونَ",
    "أَوَلَمْ يَرَوْا أَنَّ اللَّهَ يَبْسُطُ الرِّزْقَ لِمَن يَشَاءُ وَيَقْدِرُ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يُؤْمِنُونَ",
    "فَآتِ ذَا الْقُرْبَىٰ حَقَّهُ وَالْمِسْكِينَ وَابْنَ السَّبِيلِ ۚ ذَٰلِكَ خَيْرٌ لِّلَّذِينَ يُرِيدُونَ وَجْهَ اللَّهِ ۖ وَأُولَٰئِكَ هُمُ الْمُفْلِحُونَ",
    "وَمَا آتَيْتُم مِّن رِّبًا لِّيَرْبُوَ فِي أَمْوَالِ النَّاسِ فَلَا يَرْبُو عِندَ اللَّهِ ۖ وَمَا آتَيْتُم مِّن زَكَاةٍ تُرِيدُونَ وَجْهَ اللَّهِ فَأُولَٰئِكَ هُمُ الْمُضْعِفُونَ",
    "اللَّهُ الَّذِي خَلَقَكُمْ ثُمَّ رَزَقَكُمْ ثُمَّ يُمِيتُكُمْ ثُمَّ يُحْيِيكُمْ ۖ هَلْ مِن شُرَكَائِكُم مَّن يَفْعَلُ مِن ذَٰلِكُم مِّن شَيْءٍ ۚ سُبْحَانَهُ وَتَعَالَىٰ عَمَّا يُشْرِكُونَ",
    "ظَهَرَ الْفَسَادُ فِي الْبَرِّ وَالْبَحْرِ بِمَا كَسَبَتْ أَيْدِي النَّاسِ لِيُذِيقَهُم بَعْضَ الَّذِي عَمِلُوا لَعَلَّهُمْ يَرْجِعُونَ",
    "قُلْ سِيرُوا فِي الْأَرْضِ فَانظُرُوا كَيْفَ كَانَ عَاقِبَةُ الَّذِينَ مِن قَبْلُ ۚ كَانَ أَكْثَرُهُم مُّشْرِكِينَ",
    "فَأَقِمْ وَجْهَكَ لِلدِّينِ الْقَيِّمِ مِن قَبْلِ أَن يَأْتِيَ يَوْمٌ لَّا مَرَدَّ لَهُ مِنَ اللَّهِ ۖ يَوْمَئِذٍ يَصَّدَّعُونَ",
    "مَن كَفَرَ فَعَلَيْهِ كُفْرُهُ ۖ وَمَنْ عَمِلَ صَالِحًا فَلِأَنفُسِهِمْ يَمْهَدُونَ",
    "لِيَجْزِيَ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ مِن فَضْلِهِ ۚ إِنَّهُ لَا يُحِبُّ الْكَافِرِينَ",
    "وَمِنْ آيَاتِهِ أَن يُرْسِلَ الرِّيَاحَ مُبَشِّرَاتٍ وَلِيُذِيقَكُم مِّن رَّحْمَتِهِ وَلِتَجْرِيَ الْفُلْكُ بِأَمْرِهِ وَلِتَبْتَغُوا مِن فَضْلِهِ وَلَعَلَّكُمْ تَشْكُرُونَ",
    "وَلَقَدْ أَرْسَلْنَا مِن قَبْلِكَ رُسُلًا إِلَىٰ قَوْمِهِمْ فَجَاءُوهُم بِالْبَيِّنَاتِ فَانتَقَمْنَا مِنَ الَّذِينَ أَجْرَمُوا ۖ وَكَانَ حَقًّا عَلَيْنَا نَصْرُ الْمُؤْمِنِينَ",
    "اللَّهُ الَّذِي يُرْسِلُ الرِّيَاحَ فَتُثِيرُ سَحَابًا فَيَبْسُطُهُ فِي السَّمَاءِ كَيْفَ يَشَاءُ وَيَجْعَلُهُ كِسَفًا فَتَرَى الْوَدْقَ يَخْرُجُ مِنْ خِلَالِهِ ۖ فَإِذَا أَصَابَ بِهِ مَن يَشَاءُ مِنْ عِبَادِهِ إِذَا هُمْ يَسْتَبْشِرُونَ",
    "وَإِن كَانُوا مِن قَبْلِ أَن يُنَزَّلَ عَلَيْهِم مِّن قَبْلِهِ لَمُبْلِسِينَ",
    "فَانظُرْ إِلَىٰ آثَارِ رَحْمَتِ اللَّهِ كَيْفَ يُحْيِي الْأَرْضَ بَعْدَ مَوْتِهَا ۚ إِنَّ ذَٰلِكَ لَمُحْيِي الْمَوْتَىٰ ۖ وَهُوَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "وَلَئِنْ أَرْسَلْنَا رِيحًا فَرَأَوْهُ مُصْفَرًّا لَّظَلُّوا مِن بَعْدِهِ يَكْفُرُونَ",
    "فَإِنَّكَ لَا تُسْمِعُ الْمَوْتَىٰ وَلَا تُسْمِعُ الصُّمَّ الدُّعَاءَ إِذَا وَلَّوْا مُدْبِرِينَ",
    "وَمَا أَنتَ بِهَادِ الْعُمْيِ عَن ضَلَالَتِهِمْ ۖ إِن تُسْمِعُ إِلَّا مَن يُؤْمِنُ بِآيَاتِنَا فَهُم مُّسْلِمُونَ",
    "اللَّهُ الَّذِي خَلَقَكُم مِّن ضَعْفٍ ثُمَّ جَعَلَ مِن بَعْدِ ضَعْفٍ قُوَّةً ثُمَّ جَعَلَ مِن بَعْدِ قُوَّةٍ ضَعْفًا وَشَيْبَةً ۚ يَخْلُقُ مَا يَشَاءُ ۖ وَهُوَ الْعَلِيمُ الْقَدِيرُ",
    "وَيَوْمَ تَقُومُ السَّاعَةُ يُقْسِمُ الْمُجْرِمُونَ مَا لَبِثُوا غَيْرَ سَاعَةٍ ۚ كَذَٰلِكَ كَانُوا يُؤْفَكُونَ",
    "وَقَالَ الَّذِينَ أُوتُوا الْعِلْمَ وَالْإِيمَانَ لَقَدْ لَبِثْتُمْ فِي كِتَابِ اللَّهِ إِلَىٰ يَوْمِ الْبَعْثِ ۖ فَهَٰذَا يَوْمُ الْبَعْثِ وَلَٰكِنَّكُمْ كُنتُمْ لَا تَعْلَمُونَ",
    "فَيَوْمَئِذٍ لَّا يَنفَعُ الَّذِينَ ظَلَمُوا مَعْذِرَتُهُمْ وَلَا هُمْ يُسْتَعْتَبُونَ",
    "وَلَقَدْ ضَرَبْنَا لِلنَّاسِ فِي هَٰذَا الْقُرْآنِ مِن كُلِّ مَثَلٍ ۚ وَلَئِن جِئْتَهُم بِآيَةٍ لَّيَقُولَنَّ الَّذِينَ كَفَرُوا إِنْ أَنتُمْ إِلَّا مُبْطِلُونَ",
    "كَذَٰلِكَ يَطْبَعُ اللَّهُ عَلَىٰ قُلُوبِ الَّذِينَ لَا يَعْلَمُونَ",
    "فَاصْبِرْ إِنَّ وَعْدَ اللَّهِ حَقٌّ ۖ وَلَا يَسْتَخِفَّنَّكَ الَّذِينَ لَا يُوقِنُونَ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Alif, Lam, Meem.",
    "The Byzantines have been defeated",
    "In the nearest land. But they, after their defeat, will overcome.",
    "Within three to nine years. To Allah belongs the command before and after. And that day the believers will rejoice",
    "In the victory of Allah. He gives victory to whom He wills, and He is the Exalted in Might, the Merciful.",
    "[It is] the promise of Allah. Allah does not fail in His promise, but most of the people do not know.",
    "They know what is apparent of the worldly life, but they, of the Hereafter, are unaware.",
    "Do they not contemplate within themselves? Allah has not created the heavens and the earth and what is between them except in truth and for a specified term. And indeed, many of the people, in [the matter of] the meeting with their Lord, are disbelievers.",
    "Have they not traveled through the earth and observed how was the end of those before them? They were greater than them in power, and they plowed the earth and built it up more than they have built it up, and their messengers came to them with clear evidences. And Allah would not ever have wronged them, but they were wronging themselves.",
    "Then the end of those who did evil was the worst [consequence] because they denied the signs of Allah and used to ridicule them.",
    "Allah begins creation; then He will repeat it; then to Him you will be returned.",
    "And the Day the Hour appears the criminals will be in despair.",
    "And there will not be for them among their [alleged] partners any intercessors, and they will [then] be disbelievers in their partners.",
    "And the Day the Hour appears - that Day they will become separated.",
    "And as for those who had believed and done righteous deeds, they will be in a garden [of Paradise], delighted.",
    "But as for those who disbelieved and denied Our verses and the meeting of the Hereafter, those will be brought into the punishment [to remain].",
    "So exalted is Allah when you reach the evening and when you reach the morning.",
    "And to Him is [due all] praise throughout the heavens and the earth. And [exalted is He] at night and when you are at noon.",
    "He brings the living out of the dead and brings the dead out of the living and brings to life the earth after its lifelessness. And thus will you be brought out.",
    "And of His signs is that He created you from dust; then, suddenly you were human beings dispersing [throughout the earth].",
    "And of His signs is that He created for you from yourselves mates that you may find tranquillity in them; and He placed between you affection and mercy. Indeed in that are signs for a people who give thought.",
    "And of His signs is the creation of the heavens and the earth and the diversity of your languages and your colors. Indeed in that are signs for those of knowledge.",
    "And of His signs is your sleep by night and day and your seeking of His bounty. Indeed in that are signs for a people who listen.",
    "And of His signs is [that] He shows you the lightening [causing] fear and aspiration, and He sends down rain from the sky by which He brings to life the earth after its lifelessness. Indeed in that are signs for a people who use reason.",
    "And of His signs is that the heaven and earth remain by His command. Then when He calls you with a [single] call from the earth, immediately you will come forth.",
    "And to Him belongs whoever is in the heavens and earth. All are to Him devoutly obedient.",
    "And it is He who begins creation; then He repeats it, and that is [even] easier for Him. To Him belongs the highest attribute in the heavens and earth. And He is the Exalted in Might, the Wise.",
    "He presents to you an example from yourselves. Do you have among those whom your right hands possess any partners in what We have provided for you so that you are equal therein [and] would fear them as your fear of one another [within a partnership]? Thus do We detail the verses for a people who use reason.",
    "But those who wrong follow their [own] desires without knowledge. Then who can guide one whom Allah has sent astray? And for them there are no helpers.",
    "So direct your face toward the religion, inclining to truth. [Adhere to] the fitrah of Allah upon which He has created [all] people. No change should there be in the creation of Allah. That is the correct religion, but most of the people do not know.",
    "[Adhere to it], turning in repentance to Him, and fear Him and establish prayer and do not be of those who associate others with Allah",
    "[Or] of those who have divided their religion and become sects, every faction rejoicing in what it has.",
    "And when adversity touches the people, they call upon their Lord, turning in repentance to Him. Then when He lets them taste mercy from Him, at once a party of them associate others with their Lord,",
    "So that they will deny what We have granted them. Then enjoy yourselves, for you are going to know.",
    "Or have We sent down to them an authority, and it speaks of what they were associating with Him?",
    "And when We let the people taste mercy, they rejoice therein, but if evil afflicts them for what their hands have put forth, immediately they despair.",
    "Do they not see that Allah extends provision for whom He wills and restricts [it]? Indeed, in that are signs for a people who believe.",
    "So give the relative his right, as well as the needy and the traveler. That is best for those who desire the countenance of Allah, and it is they who will be the successful.",
    "And whatever you give for interest to increase within the wealth of people will not increase with Allah. But what you give in zakah, desiring the countenance of Allah - those are the multipliers.",
    "Allah is the one who created you, then provided for you, then will cause you to die, and then will give you life. Are there any of your \"partners\" who does anything of that? Exalted is He and high above what they associate with Him.",
    "Corruption has appeared throughout the land and sea by [reason of] what the hands of people have earned so He may let them taste part of [the consequence of] what they have done that perhaps they will return [to righteousness].",
    "Say, [O Muhammad], \"Travel through the land and observe how was the end of those before. Most of them were associators [of others with Allah].",
    "So direct your face toward the correct religion before a Day comes from Allah of which there is no repelling. That Day, they will be divided.",
    "Whoever disbelieves - upon him is [the consequence of] his disbelief. And whoever does righteousness - they are for themselves preparing,",
    "That He may reward those who have believed and done righteous deeds out of His bounty. Indeed, He does not like the disbelievers.",
    "And of His signs is that He sends the winds as bringers of good tidings and to let you taste His mercy and so the ships may sail at His command and so you may seek of His bounty, and perhaps you will be grateful.",
    "And We have already sent messengers before you to their peoples, and they came to them with clear evidences; then We took retribution from those who committed crimes, and incumbent upon Us was support of the believers.",
    "It is Allah who sends the winds, and they stir the clouds and spread them in the sky however He wills, and He makes them fragments so you see the rain emerge from within them. And when He causes it to fall upon whom He wills of His servants, immediately they rejoice",
    "Although they were, before it was sent down upon them - before that, in despair.",
    "So observe the effects of the mercy of Allah - how He gives life to the earth after its lifelessness. Indeed, that [same one] will give life to the dead, and He is over all things competent.",
    "But if We should send a [bad] wind and they saw [their crops] turned yellow, they would remain thereafter disbelievers.",
    "So indeed, you will not make the dead hear, nor will you make the deaf hear the call when they turn their backs, retreating.",
    "And you cannot guide the blind away from their error. You will only make hear those who believe in Our verses so they are Muslims [in submission to Allah].",
    "Allah is the one who created you from weakness, then made after weakness strength, then made after strength weakness and white hair. He creates what He wills, and He is the Knowing, the Competent.",
    "And the Day the Hour appears the criminals will swear they had remained but an hour. Thus they were deluded.",
    "But those who were given knowledge and faith will say, \"You remained the extent of Allah's decree until the Day of Resurrection, and this is the Day of Resurrection, but you did not used to know.\"",
    "So that Day, their excuse will not benefit those who wronged, nor will they be asked to appease [Allah].",
    "And We have certainly presented to the people in this Qur'an from every [kind of] example. But, [O Muhammad], if you should bring them a sign, the disbelievers will surely say, \"You [believers] are but falsifiers.\"",
    "Thus does Allah seal the hearts of those who do not know.",
    "So be patient. Indeed, the promise of Allah is truth. And let them not disquiet you who are not certain [in faith].",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar__rum);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ar_rum);
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
