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

public class Ar_Rad extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"13:1", "13:2", "13:3", "13:4", "13:5", "13:6", "13:7", "13:8", "13:9", "13:10", "13:11", "13:12", "13:13", "13:14", "13:15", "13:16",
            "13:17", "13:18", "13:19", "13:20", "13:21", "13:22", "13:23", "13:24", "13:25", "13:26", "13:27", "13:28", "13:29", "13:30", "13:31", "13:32",
            "13:33", "13:34", "13:35", "13:36", "13:37", "13:38", "13:39", "13:40", "13:41", "13:42", "13:43"};

    String [] arabic_verses = {"المر ۚ تِلْكَ آيَاتُ الْكِتَابِ ۗ وَالَّذِي أُنزِلَ إِلَيْكَ مِن رَّبِّكَ الْحَقُّ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يُؤْمِنُونَ",
    "اللَّهُ الَّذِي رَفَعَ السَّمَاوَاتِ بِغَيْرِ عَمَدٍ تَرَوْنَهَا ۖ ثُمَّ اسْتَوَىٰ عَلَى الْعَرْشِ ۖ وَسَخَّرَ الشَّمْسَ وَالْقَمَرَ ۖ كُلٌّ يَجْرِي لِأَجَلٍ مُّسَمًّى ۚ يُدَبِّرُ الْأَمْرَ يُفَصِّلُ الْآيَاتِ لَعَلَّكُم بِلِقَاءِ رَبِّكُمْ تُوقِنُونَ",
    "وَهُوَ الَّذِي مَدَّ الْأَرْضَ وَجَعَلَ فِيهَا رَوَاسِيَ وَأَنْهَارًا ۖ وَمِن كُلِّ الثَّمَرَاتِ جَعَلَ فِيهَا زَوْجَيْنِ اثْنَيْنِ ۖ يُغْشِي اللَّيْلَ النَّهَارَ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يَتَفَكَّرُونَ",
    "وَفِي الْأَرْضِ قِطَعٌ مُّتَجَاوِرَاتٌ وَجَنَّاتٌ مِّنْ أَعْنَابٍ وَزَرْعٌ وَنَخِيلٌ صِنْوَانٌ وَغَيْرُ صِنْوَانٍ يُسْقَىٰ بِمَاءٍ وَاحِدٍ وَنُفَضِّلُ بَعْضَهَا عَلَىٰ بَعْضٍ فِي الْأُكُلِ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يَعْقِلُونَ",
    "وَإِن تَعْجَبْ فَعَجَبٌ قَوْلُهُمْ أَإِذَا كُنَّا تُرَابًا أَإِنَّا لَفِي خَلْقٍ جَدِيدٍ ۗ أُولَٰئِكَ الَّذِينَ كَفَرُوا بِرَبِّهِمْ ۖ وَأُولَٰئِكَ الْأَغْلَالُ فِي أَعْنَاقِهِمْ ۖ وَأُولَٰئِكَ أَصْحَابُ النَّارِ ۖ هُمْ فِيهَا خَالِدُونَ",
    "وَيَسْتَعْجِلُونَكَ بِالسَّيِّئَةِ قَبْلَ الْحَسَنَةِ وَقَدْ خَلَتْ مِن قَبْلِهِمُ الْمَثُلَاتُ ۗ وَإِنَّ رَبَّكَ لَذُو مَغْفِرَةٍ لِّلنَّاسِ عَلَىٰ ظُلْمِهِمْ ۖ وَإِنَّ رَبَّكَ لَشَدِيدُ الْعِقَابِ",
    "وَيَقُولُ الَّذِينَ كَفَرُوا لَوْلَا أُنزِلَ عَلَيْهِ آيَةٌ مِّن رَّبِّهِ ۗ إِنَّمَا أَنتَ مُنذِرٌ ۖ وَلِكُلِّ قَوْمٍ هَادٍ",
    "اللَّهُ يَعْلَمُ مَا تَحْمِلُ كُلُّ أُنثَىٰ وَمَا تَغِيضُ الْأَرْحَامُ وَمَا تَزْدَادُ ۖ وَكُلُّ شَيْءٍ عِندَهُ بِمِقْدَارٍ",
    "عَالِمُ الْغَيْبِ وَالشَّهَادَةِ الْكَبِيرُ الْمُتَعَالِ",
    "سَوَاءٌ مِّنكُم مَّنْ أَسَرَّ الْقَوْلَ وَمَن جَهَرَ بِهِ وَمَنْ هُوَ مُسْتَخْفٍ بِاللَّيْلِ وَسَارِبٌ بِالنَّهَارِ",
    "لَهُ مُعَقِّبَاتٌ مِّن بَيْنِ يَدَيْهِ وَمِنْ خَلْفِهِ يَحْفَظُونَهُ مِنْ أَمْرِ اللَّهِ ۗ إِنَّ اللَّهَ لَا يُغَيِّرُ مَا بِقَوْمٍ حَتَّىٰ يُغَيِّرُوا مَا بِأَنفُسِهِمْ ۗ وَإِذَا أَرَادَ اللَّهُ بِقَوْمٍ سُوءًا فَلَا مَرَدَّ لَهُ ۚ وَمَا لَهُم مِّن دُونِهِ مِن وَالٍ",
    "هُوَ الَّذِي يُرِيكُمُ الْبَرْقَ خَوْفًا وَطَمَعًا وَيُنشِئُ السَّحَابَ الثِّقَالَ",
    "وَيُسَبِّحُ الرَّعْدُ بِحَمْدِهِ وَالْمَلَائِكَةُ مِنْ خِيفَتِهِ وَيُرْسِلُ الصَّوَاعِقَ فَيُصِيبُ بِهَا مَن يَشَاءُ وَهُمْ يُجَادِلُونَ فِي اللَّهِ وَهُوَ شَدِيدُ الْمِحَالِ",
    "لَهُ دَعْوَةُ الْحَقِّ ۖ وَالَّذِينَ يَدْعُونَ مِن دُونِهِ لَا يَسْتَجِيبُونَ لَهُم بِشَيْءٍ إِلَّا كَبَاسِطِ كَفَّيْهِ إِلَى الْمَاءِ لِيَبْلُغَ فَاهُ وَمَا هُوَ بِبَالِغِهِ ۚ وَمَا دُعَاءُ الْكَافِرِينَ إِلَّا فِي ضَلَالٍ",
    "وَلِلَّهِ يَسْجُدُ مَن فِي السَّمَاوَاتِ وَالْأَرْضِ طَوْعًا وَكَرْهًا وَظِلَالُهُم بِالْغُدُوِّ وَالْآصَالِ ۩",
    "قُلْ مَن رَّبُّ السَّمَاوَاتِ وَالْأَرْضِ قُلِ اللَّهُ ۚ قُلْ أَفَاتَّخَذْتُم مِّن دُونِهِ أَوْلِيَاءَ لَا يَمْلِكُونَ لِأَنفُسِهِمْ نَفْعًا وَلَا ضَرًّا ۚ قُلْ هَلْ يَسْتَوِي الْأَعْمَىٰ وَالْبَصِيرُ أَمْ هَلْ تَسْتَوِي الظُّلُمَاتُ وَالنُّورُ ۗ أَمْ جَعَلُوا لِلَّهِ شُرَكَاءَ خَلَقُوا كَخَلْقِهِ فَتَشَابَهَ الْخَلْقُ عَلَيْهِمْ ۚ قُلِ اللَّهُ خَالِقُ كُلِّ شَيْءٍ وَهُوَ الْوَاحِدُ الْقَهَّارُ",
    "أَنزَلَ مِنَ السَّمَاءِ مَاءً فَسَالَتْ أَوْدِيَةٌ بِقَدَرِهَا فَاحْتَمَلَ السَّيْلُ زَبَدًا رَّابِيًا ۚ وَمِمَّا يُوقِدُونَ عَلَيْهِ فِي النَّارِ ابْتِغَاءَ حِلْيَةٍ أَوْ مَتَاعٍ زَبَدٌ مِّثْلُهُ ۚ كَذَٰلِكَ يَضْرِبُ اللَّهُ الْحَقَّ وَالْبَاطِلَ ۚ فَأَمَّا الزَّبَدُ فَيَذْهَبُ جُفَاءً ۖ وَأَمَّا مَا يَنفَعُ النَّاسَ فَيَمْكُثُ فِي الْأَرْضِ ۚ كَذَٰلِكَ يَضْرِبُ اللَّهُ الْأَمْثَالَ",
    "لِلَّذِينَ اسْتَجَابُوا لِرَبِّهِمُ الْحُسْنَىٰ ۚ وَالَّذِينَ لَمْ يَسْتَجِيبُوا لَهُ لَوْ أَنَّ لَهُم مَّا فِي الْأَرْضِ جَمِيعًا وَمِثْلَهُ مَعَهُ لَافْتَدَوْا بِهِ ۚ أُولَٰئِكَ لَهُمْ سُوءُ الْحِسَابِ وَمَأْوَاهُمْ جَهَنَّمُ ۖ وَبِئْسَ الْمِهَادُ",
    "أَفَمَن يَعْلَمُ أَنَّمَا أُنزِلَ إِلَيْكَ مِن رَّبِّكَ الْحَقُّ كَمَنْ هُوَ أَعْمَىٰ ۚ إِنَّمَا يَتَذَكَّرُ أُولُو الْأَلْبَابِ",
    "الَّذِينَ يُوفُونَ بِعَهْدِ اللَّهِ وَلَا يَنقُضُونَ الْمِيثَاقَ",
    "وَالَّذِينَ يَصِلُونَ مَا أَمَرَ اللَّهُ بِهِ أَن يُوصَلَ وَيَخْشَوْنَ رَبَّهُمْ وَيَخَافُونَ سُوءَ الْحِسَابِ",
    "وَالَّذِينَ صَبَرُوا ابْتِغَاءَ وَجْهِ رَبِّهِمْ وَأَقَامُوا الصَّلَاةَ وَأَنفَقُوا مِمَّا رَزَقْنَاهُمْ سِرًّا وَعَلَانِيَةً وَيَدْرَءُونَ بِالْحَسَنَةِ السَّيِّئَةَ أُولَٰئِكَ لَهُمْ عُقْبَى الدَّارِ",
    "جَنَّاتُ عَدْنٍ يَدْخُلُونَهَا وَمَن صَلَحَ مِنْ آبَائِهِمْ وَأَزْوَاجِهِمْ وَذُرِّيَّاتِهِمْ ۖ وَالْمَلَائِكَةُ يَدْخُلُونَ عَلَيْهِم مِّن كُلِّ بَابٍ",
    "سَلَامٌ عَلَيْكُم بِمَا صَبَرْتُمْ ۚ فَنِعْمَ عُقْبَى الدَّارِ",
    "وَالَّذِينَ يَنقُضُونَ عَهْدَ اللَّهِ مِن بَعْدِ مِيثَاقِهِ وَيَقْطَعُونَ مَا أَمَرَ اللَّهُ بِهِ أَن يُوصَلَ وَيُفْسِدُونَ فِي الْأَرْضِ ۙ أُولَٰئِكَ لَهُمُ اللَّعْنَةُ وَلَهُمْ سُوءُ الدَّارِ",
    "اللَّهُ يَبْسُطُ الرِّزْقَ لِمَن يَشَاءُ وَيَقْدِرُ ۚ وَفَرِحُوا بِالْحَيَاةِ الدُّنْيَا وَمَا الْحَيَاةُ الدُّنْيَا فِي الْآخِرَةِ إِلَّا مَتَاعٌ",
    "وَيَقُولُ الَّذِينَ كَفَرُوا لَوْلَا أُنزِلَ عَلَيْهِ آيَةٌ مِّن رَّبِّهِ ۗ قُلْ إِنَّ اللَّهَ يُضِلُّ مَن يَشَاءُ وَيَهْدِي إِلَيْهِ مَنْ أَنَابَ",
    "الَّذِينَ آمَنُوا وَتَطْمَئِنُّ قُلُوبُهُم بِذِكْرِ اللَّهِ ۗ أَلَا بِذِكْرِ اللَّهِ تَطْمَئِنُّ الْقُلُوبُ",
    "الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ طُوبَىٰ لَهُمْ وَحُسْنُ مَآبٍ",
    "كَذَٰلِكَ أَرْسَلْنَاكَ فِي أُمَّةٍ قَدْ خَلَتْ مِن قَبْلِهَا أُمَمٌ لِّتَتْلُوَ عَلَيْهِمُ الَّذِي أَوْحَيْنَا إِلَيْكَ وَهُمْ يَكْفُرُونَ بِالرَّحْمَٰنِ ۚ قُلْ هُوَ رَبِّي لَا إِلَٰهَ إِلَّا هُوَ عَلَيْهِ تَوَكَّلْتُ وَإِلَيْهِ مَتَابِ",
    "وَلَوْ أَنَّ قُرْآنًا سُيِّرَتْ بِهِ الْجِبَالُ أَوْ قُطِّعَتْ بِهِ الْأَرْضُ أَوْ كُلِّمَ بِهِ الْمَوْتَىٰ ۗ بَل لِّلَّهِ الْأَمْرُ جَمِيعًا ۗ أَفَلَمْ يَيْأَسِ الَّذِينَ آمَنُوا أَن لَّوْ يَشَاءُ اللَّهُ لَهَدَى النَّاسَ جَمِيعًا ۗ وَلَا يَزَالُ الَّذِينَ كَفَرُوا تُصِيبُهُم بِمَا صَنَعُوا قَارِعَةٌ أَوْ تَحُلُّ قَرِيبًا مِّن دَارِهِمْ حَتَّىٰ يَأْتِيَ وَعْدُ اللَّهِ ۚ إِنَّ اللَّهَ لَا يُخْلِفُ الْمِيعَادَ",
    "وَلَقَدِ اسْتُهْزِئَ بِرُسُلٍ مِّن قَبْلِكَ فَأَمْلَيْتُ لِلَّذِينَ كَفَرُوا ثُمَّ أَخَذْتُهُمْ ۖ فَكَيْفَ كَانَ عِقَابِ",
    "أَفَمَنْ هُوَ قَائِمٌ عَلَىٰ كُلِّ نَفْسٍ بِمَا كَسَبَتْ ۗ وَجَعَلُوا لِلَّهِ شُرَكَاءَ قُلْ سَمُّوهُمْ ۚ أَمْ تُنَبِّئُونَهُ بِمَا لَا يَعْلَمُ فِي الْأَرْضِ أَم بِظَاهِرٍ مِّنَ الْقَوْلِ ۗ بَلْ زُيِّنَ لِلَّذِينَ كَفَرُوا مَكْرُهُمْ وَصُدُّوا عَنِ السَّبِيلِ ۗ وَمَن يُضْلِلِ اللَّهُ فَمَا لَهُ مِنْ هَادٍ",
    "لَّهُمْ عَذَابٌ فِي الْحَيَاةِ الدُّنْيَا ۖ وَلَعَذَابُ الْآخِرَةِ أَشَقُّ ۖ وَمَا لَهُم مِّنَ اللَّهِ مِن وَاقٍ",
    "مَّثَلُ الْجَنَّةِ الَّتِي وُعِدَ الْمُتَّقُونَ ۖ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ ۖ أُكُلُهَا دَائِمٌ وَظِلُّهَا ۚ تِلْكَ عُقْبَى الَّذِينَ اتَّقَوا ۖ وَّعُقْبَى الْكَافِرِينَ النَّارُ",
    "وَالَّذِينَ آتَيْنَاهُمُ الْكِتَابَ يَفْرَحُونَ بِمَا أُنزِلَ إِلَيْكَ ۖ وَمِنَ الْأَحْزَابِ مَن يُنكِرُ بَعْضَهُ ۚ قُلْ إِنَّمَا أُمِرْتُ أَنْ أَعْبُدَ اللَّهَ وَلَا أُشْرِكَ بِهِ ۚ إِلَيْهِ أَدْعُو وَإِلَيْهِ مَآبِ",
    "وَكَذَٰلِكَ أَنزَلْنَاهُ حُكْمًا عَرَبِيًّا ۚ وَلَئِنِ اتَّبَعْتَ أَهْوَاءَهُم بَعْدَمَا جَاءَكَ مِنَ الْعِلْمِ مَا لَكَ مِنَ اللَّهِ مِن وَلِيٍّ وَلَا وَاقٍ",
    "وَلَقَدْ أَرْسَلْنَا رُسُلًا مِّن قَبْلِكَ وَجَعَلْنَا لَهُمْ أَزْوَاجًا وَذُرِّيَّةً ۚ وَمَا كَانَ لِرَسُولٍ أَن يَأْتِيَ بِآيَةٍ إِلَّا بِإِذْنِ اللَّهِ ۗ لِكُلِّ أَجَلٍ كِتَابٌ",
    "يَمْحُو اللَّهُ مَا يَشَاءُ وَيُثْبِتُ ۖ وَعِندَهُ أُمُّ الْكِتَابِ",
    "وَإِن مَّا نُرِيَنَّكَ بَعْضَ الَّذِي نَعِدُهُمْ أَوْ نَتَوَفَّيَنَّكَ فَإِنَّمَا عَلَيْكَ الْبَلَاغُ وَعَلَيْنَا الْحِسَابُ",
    "أَوَلَمْ يَرَوْا أَنَّا نَأْتِي الْأَرْضَ نَنقُصُهَا مِنْ أَطْرَافِهَا ۚ وَاللَّهُ يَحْكُمُ لَا مُعَقِّبَ لِحُكْمِهِ ۚ وَهُوَ سَرِيعُ الْحِسَابِ",
    "وَقَدْ مَكَرَ الَّذِينَ مِن قَبْلِهِمْ فَلِلَّهِ الْمَكْرُ جَمِيعًا ۖ يَعْلَمُ مَا تَكْسِبُ كُلُّ نَفْسٍ ۗ وَسَيَعْلَمُ الْكُفَّارُ لِمَنْ عُقْبَى الدَّارِ",
    "وَيَقُولُ الَّذِينَ كَفَرُوا لَسْتَ مُرْسَلًا ۚ قُلْ كَفَىٰ بِاللَّهِ شَهِيدًا بَيْنِي وَبَيْنَكُمْ وَمَنْ عِندَهُ عِلْمُ الْكِتَابِ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"Alif, Lam, Meem, Ra. These are the verses of the Book; and what has been revealed to you from your Lord is the truth, but most of the people do not believe.",
    "It is Allah who erected the heavens without pillars that you [can] see; then He established Himself above the Throne and made subject the sun and the moon, each running [its course] for a specified term. He arranges [each] matter; He details the signs that you may, of the meeting with your Lord, be certain.",
    "And it is He who spread the earth and placed therein firmly set mountains and rivers; and from all of the fruits He made therein two mates; He causes the night to cover the day. Indeed in that are signs for a people who give thought.",
    "And within the land are neighboring plots and gardens of grapevines and crops and palm trees, [growing] several from a root or otherwise, watered with one water; but We make some of them exceed others in [quality of] fruit. Indeed in that are signs for a people who reason.",
    "And if you are astonished, [O Muhammad] - then astonishing is their saying, \"When we are dust, will we indeed be [brought] into a new creation?\" Those are the ones who have disbelieved in their Lord, and those will have shackles upon their necks, and those are the companions of the Fire; they will abide therein eternally.",
    "They impatiently urge you to bring about evil before good, while there has already occurred before them similar punishments [to what they demand]. And indeed, your Lord is full of forgiveness for the people despite their wrongdoing, and indeed, your Lord is severe in penalty.",
    "And those who disbelieved say, \"Why has a sign not been sent down to him from his Lord?\" You are only a warner, and for every people is a guide.",
    "Allah knows what every female carries and what the wombs lose [prematurely] or exceed. And everything with Him is by due measure.",
    "[He is] Knower of the unseen and the witnessed, the Grand, the Exalted.",
    "It is the same [to Him] concerning you whether one conceals [his] speech or one publicizes it and whether one is hidden by night or conspicuous [among others] by day.",
    "For each one are successive [angels] before and behind him who protect him by the decree of Allah. Indeed, Allah will not change the condition of a people until they change what is in themselves. And when Allah intends for a people ill, there is no repelling it. And there is not for them besides Him any patron.",
    "It is He who shows you lightening, [causing] fear and aspiration, and generates the heavy clouds.",
    "And the thunder exalts [Allah] with praise of Him - and the angels [as well] from fear of Him - and He sends thunderbolts and strikes therewith whom He wills while they dispute about Allah; and He is severe in assault.",
    "To Him [alone] is the supplication of truth. And those they call upon besides Him do not respond to them with a thing, except as one who stretches his hands toward water [from afar, calling it] to reach his mouth, but it will not reach it [thus]. And the supplication of the disbelievers is not but in error [i.e. futility].",
    "And to Allah prostrates whoever is within the heavens and the earth, willingly or by compulsion, and their shadows [as well] in the mornings and the afternoons.",
    "Say, \"Who is Lord of the heavens and earth?\" Say, \"Allah.\" Say, \"Have you then taken besides Him allies not possessing [even] for themselves any benefit or any harm?\" Say, \"Is the blind equivalent to the seeing? Or is darkness equivalent to light? Or have they attributed to Allah partners who created like His creation so that the creation [of each] seemed similar to them?\" Say, \"Allah is the Creator of all things, and He is the One, the Prevailing.\"",
    "He sends down from the sky, rain, and valleys flow according to their capacity, and the torrent carries a rising foam. And from that [ore] which they heat in the fire, desiring adornments and utensils, is a foam like it. Thus Allah presents [the example of] truth and falsehood. As for the foam, it vanishes, [being] cast off; but as for that which benefits the people, it remains on the earth. Thus does Allah present examples.",
    "For those who have responded to their Lord is the best [reward], but those who did not respond to Him - if they had all that is in the earth entirely and the like of it with it, they would [attempt to] ransom themselves thereby. Those will have the worst account, and their refuge is Hell, and wretched is the resting place.",
    "Then is he who knows that what has been revealed to you from your Lord is the truth like one who is blind? They will only be reminded who are people of understanding -",
    "Those who fulfill the covenant of Allah and do not break the contract,",
    "And those who join that which Allah has ordered to be joined and fear their Lord and are afraid of the evil of [their] account,",
    "And those who are patient, seeking the countenance of their Lord, and establish prayer and spend from what We have provided for them secretly and publicly and prevent evil with good - those will have the good consequence of [this] home -",
    "Gardens of perpetual residence; they will enter them with whoever were righteous among their fathers, their spouses and their descendants. And the angels will enter upon them from every gate, [saying],",
    "\"Peace be upon you for what you patiently endured. And excellent is the final home.\"",
    "But those who break the covenant of Allah after contracting it and sever that which Allah has ordered to be joined and spread corruption on earth - for them is the curse, and they will have the worst home.",
    "Allah extends provision for whom He wills and restricts [it]. And they rejoice in the worldly life, while the worldly life is not, compared to the Hereafter, except [brief] enjoyment.",
    "And those who disbelieved say, \"Why has a sign not been sent down to him from his Lord?\" Say, [O Muhammad], \"Indeed, Allah leaves astray whom He wills and guides to Himself whoever turns back [to Him] -",
    "Those who have believed and whose hearts are assured by the remembrance of Allah. Unquestionably, by the remembrance of Allah hearts are assured.\"",
    "Those who have believed and done righteous deeds - a good state is theirs and a good return.",
    "Thus have We sent you to a community before which [other] communities have passed on so you might recite to them that which We revealed to you, while they disbelieve in the Most Merciful. Say, \"He is my Lord; there is no deity except Him. Upon Him I rely, and to Him is my return.\"",
    "And if there was any qur'an by which the mountains would be removed or the earth would be broken apart or the dead would be made to speak, [it would be this Qur'an], but to Allah belongs the affair entirely. Then have those who believed not accepted that had Allah willed, He would have guided the people, all of them? And those who disbelieve do not cease to be struck, for what they have done, by calamity - or it will descend near their home - until there comes the promise of Allah. Indeed, Allah does not fail in [His] promise.",
    "And already were [other] messengers ridiculed before you, and I extended the time of those who disbelieved; then I seized them, and how [terrible] was My penalty.",
    "Then is He who is a maintainer of every soul, [knowing] what it has earned, [like any other]? But to Allah they have attributed partners. Say, \"Name them. Or do you inform Him of that which He knows not upon the earth or of what is apparent of speech?\" Rather, their [own] plan has been made attractive to those who disbelieve, and they have been averted from the way. And whomever Allah leaves astray - there will be for him no guide.",
    "For them will be punishment in the life of [this] world, and the punishment of the Hereafter is more severe. And they will not have from Allah any protector.",
    "The example of Paradise, which the righteous have been promised, is [that] beneath it rivers flow. Its fruit is lasting, and its shade. That is the consequence for the righteous, and the consequence for the disbelievers is the Fire.",
    "And [the believers among] those to whom We have given the [previous] Scripture rejoice at what has been revealed to you, [O Muhammad], but among the [opposing] factions are those who deny part of it. Say, \"I have only been commanded to worship Allah and not associate [anything] with Him. To Him I invite, and to Him is my return.\"",
    "And thus We have revealed it as an Arabic legislation. And if you should follow their inclinations after what has come to you of knowledge, you would not have against Allah any ally or any protector.",
    "And We have already sent messengers before you and assigned to them wives and descendants. And it was not for a messenger to come with a sign except by permission of Allah. For every term is a decree.",
    "Allah eliminates what He wills or confirms, and with Him is the Mother of the Book.",
    "And whether We show you part of what We promise them or take you in death, upon you is only the [duty of] notification, and upon Us is the account.",
    "Have they not seen that We set upon the land, reducing it from its borders? And Allah decides; there is no adjuster of His decision. And He is swift in account.",
    "And those before them had plotted, but to Allah belongs the plan entirely. He knows what every soul earns, and the disbelievers will know for whom is the final home.",
    "And those who have disbelieved say, \"You are not a messenger.\" Say, [O Muhammad], \"Sufficient is Allah as Witness between me and you, and [the witness of] whoever has knowledge of the Scripture.\""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar__rad);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ar_rad);
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
