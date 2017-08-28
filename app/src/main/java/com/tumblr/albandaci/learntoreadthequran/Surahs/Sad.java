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

public class Sad extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"38:1", "38:2", "38:3", "38:4", "38:5", "38:6", "38:7", "38:8", "38:9", "38:10", "38:11", "38:12", "38:13", "38:14", "38:15", "38:16",
            "38:17", "38:18", "38:19", "38:20", "38:21", "38:22", "38:23", "38:24", "38:25", "38:26", "38:27", "38:28", "38:29", "38:30", "38:31", "38:32",
            "38:33", "38:34", "38:35", "38:36", "38:37", "38:38", "38:39", "38:40", "38:41", "38:42", "38:43", "38:44", "38:45", "38:46", "38:47", "38:48",
            "38:49", "38:50", "38:51", "38:52", "38:53", "38:54", "38:55", "38:56", "38:57", "38:58", "38:59", "38:60", "38:61", "38:62", "38:63", "38:64",
            "38:65", "38:66", "38:67", "38:68", "38:69", "38:70", "38:71", "38:72", "38:73", "38:74", "38:75", "38:76", "38:77", "38:78", "38:79", "38:80",
            "38:81", "38:82", "38:83", "38:84", "38:85", "38:86", "38:87", "38:88", ""};

    String [] arabic_verses = {"ص ۚ وَالْقُرْآنِ ذِي الذِّكْرِ",
    "بَلِ الَّذِينَ كَفَرُوا فِي عِزَّةٍ وَشِقَاقٍ",
    "كَمْ أَهْلَكْنَا مِن قَبْلِهِم مِّن قَرْنٍ فَنَادَوا وَّلَاتَ حِينَ مَنَاصٍ",
    "وَعَجِبُوا أَن جَاءَهُم مُّنذِرٌ مِّنْهُمْ ۖ وَقَالَ الْكَافِرُونَ هَٰذَا سَاحِرٌ كَذَّابٌ",
    "أَجَعَلَ الْآلِهَةَ إِلَٰهًا وَاحِدًا ۖ إِنَّ هَٰذَا لَشَيْءٌ عُجَابٌ",
    "وَانطَلَقَ الْمَلَأُ مِنْهُمْ أَنِ امْشُوا وَاصْبِرُوا عَلَىٰ آلِهَتِكُمْ ۖ إِنَّ هَٰذَا لَشَيْءٌ يُرَادُ",
    "مَا سَمِعْنَا بِهَٰذَا فِي الْمِلَّةِ الْآخِرَةِ إِنْ هَٰذَا إِلَّا اخْتِلَاقٌ",
    "أَأُنزِلَ عَلَيْهِ الذِّكْرُ مِن بَيْنِنَا ۚ بَلْ هُمْ فِي شَكٍّ مِّن ذِكْرِي ۖ بَل لَّمَّا يَذُوقُوا عَذَابِ",
    "أَمْ عِندَهُمْ خَزَائِنُ رَحْمَةِ رَبِّكَ الْعَزِيزِ الْوَهَّابِ",
    "أَمْ لَهُم مُّلْكُ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا ۖ فَلْيَرْتَقُوا فِي الْأَسْبَابِ",
    "جُندٌ مَّا هُنَالِكَ مَهْزُومٌ مِّنَ الْأَحْزَابِ",
    "كَذَّبَتْ قَبْلَهُمْ قَوْمُ نُوحٍ وَعَادٌ وَفِرْعَوْنُ ذُو الْأَوْتَادِ",
    "وَثَمُودُ وَقَوْمُ لُوطٍ وَأَصْحَابُ الْأَيْكَةِ ۚ أُولَٰئِكَ الْأَحْزَابُ",
    "إِن كُلٌّ إِلَّا كَذَّبَ الرُّسُلَ فَحَقَّ عِقَابِ",
    "وَمَا يَنظُرُ هَٰؤُلَاءِ إِلَّا صَيْحَةً وَاحِدَةً مَّا لَهَا مِن فَوَاقٍ",
    "وَقَالُوا رَبَّنَا عَجِّل لَّنَا قِطَّنَا قَبْلَ يَوْمِ الْحِسَابِ",
    "اصْبِرْ عَلَىٰ مَا يَقُولُونَ وَاذْكُرْ عَبْدَنَا دَاوُودَ ذَا الْأَيْدِ ۖ إِنَّهُ أَوَّابٌ",
    "إِنَّا سَخَّرْنَا الْجِبَالَ مَعَهُ يُسَبِّحْنَ بِالْعَشِيِّ وَالْإِشْرَاقِ",
    "وَالطَّيْرَ مَحْشُورَةً ۖ كُلٌّ لَّهُ أَوَّابٌ",
    "وَشَدَدْنَا مُلْكَهُ وَآتَيْنَاهُ الْحِكْمَةَ وَفَصْلَ الْخِطَابِ",
    "وَهَلْ أَتَاكَ نَبَأُ الْخَصْمِ إِذْ تَسَوَّرُوا الْمِحْرَابَ",
    "إِذْ دَخَلُوا عَلَىٰ دَاوُودَ فَفَزِعَ مِنْهُمْ ۖ قَالُوا لَا تَخَفْ ۖ خَصْمَانِ بَغَىٰ بَعْضُنَا عَلَىٰ بَعْضٍ فَاحْكُم بَيْنَنَا بِالْحَقِّ وَلَا تُشْطِطْ وَاهْدِنَا إِلَىٰ سَوَاءِ الصِّرَاطِ",
    "إِنَّ هَٰذَا أَخِي لَهُ تِسْعٌ وَتِسْعُونَ نَعْجَةً وَلِيَ نَعْجَةٌ وَاحِدَةٌ فَقَالَ أَكْفِلْنِيهَا وَعَزَّنِي فِي الْخِطَابِ",
    "قَالَ لَقَدْ ظَلَمَكَ بِسُؤَالِ نَعْجَتِكَ إِلَىٰ نِعَاجِهِ ۖ وَإِنَّ كَثِيرًا مِّنَ الْخُلَطَاءِ لَيَبْغِي بَعْضُهُمْ عَلَىٰ بَعْضٍ إِلَّا الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ وَقَلِيلٌ مَّا هُمْ ۗ وَظَنَّ دَاوُودُ أَنَّمَا فَتَنَّاهُ فَاسْتَغْفَرَ رَبَّهُ وَخَرَّ رَاكِعًا وَأَنَابَ ۩",
    "فَغَفَرْنَا لَهُ ذَٰلِكَ ۖ وَإِنَّ لَهُ عِندَنَا لَزُلْفَىٰ وَحُسْنَ مَآبٍ",
    "يَا دَاوُودُ إِنَّا جَعَلْنَاكَ خَلِيفَةً فِي الْأَرْضِ فَاحْكُم بَيْنَ النَّاسِ بِالْحَقِّ وَلَا تَتَّبِعِ الْهَوَىٰ فَيُضِلَّكَ عَن سَبِيلِ اللَّهِ ۚ إِنَّ الَّذِينَ يَضِلُّونَ عَن سَبِيلِ اللَّهِ لَهُمْ عَذَابٌ شَدِيدٌ بِمَا نَسُوا يَوْمَ الْحِسَابِ",
    "وَمَا خَلَقْنَا السَّمَاءَ وَالْأَرْضَ وَمَا بَيْنَهُمَا بَاطِلًا ۚ ذَٰلِكَ ظَنُّ الَّذِينَ كَفَرُوا ۚ فَوَيْلٌ لِّلَّذِينَ كَفَرُوا مِنَ النَّارِ",
    "أَمْ نَجْعَلُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ كَالْمُفْسِدِينَ فِي الْأَرْضِ أَمْ نَجْعَلُ الْمُتَّقِينَ كَالْفُجَّارِ",
    "كِتَابٌ أَنزَلْنَاهُ إِلَيْكَ مُبَارَكٌ لِّيَدَّبَّرُوا آيَاتِهِ وَلِيَتَذَكَّرَ أُولُو الْأَلْبَابِ",
    "وَوَهَبْنَا لِدَاوُودَ سُلَيْمَانَ ۚ نِعْمَ الْعَبْدُ ۖ إِنَّهُ أَوَّابٌ",
    "إِذْ عُرِضَ عَلَيْهِ بِالْعَشِيِّ الصَّافِنَاتُ الْجِيَادُ",
    "فَقَالَ إِنِّي أَحْبَبْتُ حُبَّ الْخَيْرِ عَن ذِكْرِ رَبِّي حَتَّىٰ تَوَارَتْ بِالْحِجَابِ",
    "رُدُّوهَا عَلَيَّ ۖ فَطَفِقَ مَسْحًا بِالسُّوقِ وَالْأَعْنَاقِ",
    "وَلَقَدْ فَتَنَّا سُلَيْمَانَ وَأَلْقَيْنَا عَلَىٰ كُرْسِيِّهِ جَسَدًا ثُمَّ أَنَابَ",
    "قَالَ رَبِّ اغْفِرْ لِي وَهَبْ لِي مُلْكًا لَّا يَنبَغِي لِأَحَدٍ مِّن بَعْدِي ۖ إِنَّكَ أَنتَ الْوَهَّابُ",
    "فَسَخَّرْنَا لَهُ الرِّيحَ تَجْرِي بِأَمْرِهِ رُخَاءً حَيْثُ أَصَابَ",
    "وَالشَّيَاطِينَ كُلَّ بَنَّاءٍ وَغَوَّاصٍ",
    "وَآخَرِينَ مُقَرَّنِينَ فِي الْأَصْفَادِ",
    "هَٰذَا عَطَاؤُنَا فَامْنُنْ أَوْ أَمْسِكْ بِغَيْرِ حِسَابٍ",
    "وَإِنَّ لَهُ عِندَنَا لَزُلْفَىٰ وَحُسْنَ مَآبٍ",
    "وَاذْكُرْ عَبْدَنَا أَيُّوبَ إِذْ نَادَىٰ رَبَّهُ أَنِّي مَسَّنِيَ الشَّيْطَانُ بِنُصْبٍ وَعَذَابٍ",
    "ارْكُضْ بِرِجْلِكَ ۖ هَٰذَا مُغْتَسَلٌ بَارِدٌ وَشَرَابٌ",
    "وَوَهَبْنَا لَهُ أَهْلَهُ وَمِثْلَهُم مَّعَهُمْ رَحْمَةً مِّنَّا وَذِكْرَىٰ لِأُولِي الْأَلْبَابِ",
    "وَخُذْ بِيَدِكَ ضِغْثًا فَاضْرِب بِّهِ وَلَا تَحْنَثْ ۗ إِنَّا وَجَدْنَاهُ صَابِرًا ۚ نِّعْمَ الْعَبْدُ ۖ إِنَّهُ أَوَّابٌ",
    "وَاذْكُرْ عِبَادَنَا إِبْرَاهِيمَ وَإِسْحَاقَ وَيَعْقُوبَ أُولِي الْأَيْدِي وَالْأَبْصَارِ",
    "إِنَّا أَخْلَصْنَاهُم بِخَالِصَةٍ ذِكْرَى الدَّارِ",
    "وَإِنَّهُمْ عِندَنَا لَمِنَ الْمُصْطَفَيْنَ الْأَخْيَارِ",
    "وَاذْكُرْ إِسْمَاعِيلَ وَالْيَسَعَ وَذَا الْكِفْلِ ۖ وَكُلٌّ مِّنَ الْأَخْيَارِ",
    "هَٰذَا ذِكْرٌ ۚ وَإِنَّ لِلْمُتَّقِينَ لَحُسْنَ مَآبٍ",
    "جَنَّاتِ عَدْنٍ مُّفَتَّحَةً لَّهُمُ الْأَبْوَابُ",
    "مُتَّكِئِينَ فِيهَا يَدْعُونَ فِيهَا بِفَاكِهَةٍ كَثِيرَةٍ وَشَرَابٍ",
    "وَعِندَهُمْ قَاصِرَاتُ الطَّرْفِ أَتْرَابٌ",
    "هَٰذَا مَا تُوعَدُونَ لِيَوْمِ الْحِسَابِ",
    "إِنَّ هَٰذَا لَرِزْقُنَا مَا لَهُ مِن نَّفَادٍ",
    "هَٰذَا ۚ وَإِنَّ لِلطَّاغِينَ لَشَرَّ مَآبٍ",
    "جَهَنَّمَ يَصْلَوْنَهَا فَبِئْسَ الْمِهَادُ",
    "هَٰذَا فَلْيَذُوقُوهُ حَمِيمٌ وَغَسَّاقٌ",
    "وَآخَرُ مِن شَكْلِهِ أَزْوَاجٌ",
    "هَٰذَا فَوْجٌ مُّقْتَحِمٌ مَّعَكُمْ ۖ لَا مَرْحَبًا بِهِمْ ۚ إِنَّهُمْ صَالُو النَّارِ",
    "قَالُوا بَلْ أَنتُمْ لَا مَرْحَبًا بِكُمْ ۖ أَنتُمْ قَدَّمْتُمُوهُ لَنَا ۖ فَبِئْسَ الْقَرَارُ",
    "قَالُوا رَبَّنَا مَن قَدَّمَ لَنَا هَٰذَا فَزِدْهُ عَذَابًا ضِعْفًا فِي النَّارِ",
    "وَقَالُوا مَا لَنَا لَا نَرَىٰ رِجَالًا كُنَّا نَعُدُّهُم مِّنَ الْأَشْرَارِ",
    "أَتَّخَذْنَاهُمْ سِخْرِيًّا أَمْ زَاغَتْ عَنْهُمُ الْأَبْصَارُ",
    "إِنَّ ذَٰلِكَ لَحَقٌّ تَخَاصُمُ أَهْلِ النَّارِ",
    "قُلْ إِنَّمَا أَنَا مُنذِرٌ ۖ وَمَا مِنْ إِلَٰهٍ إِلَّا اللَّهُ الْوَاحِدُ الْقَهَّارُ",
    "رَبُّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا الْعَزِيزُ الْغَفَّارُ",
    "قُلْ هُوَ نَبَأٌ عَظِيمٌ",
    "أَنتُمْ عَنْهُ مُعْرِضُونَ",
    "مَا كَانَ لِيَ مِنْ عِلْمٍ بِالْمَلَإِ الْأَعْلَىٰ إِذْ يَخْتَصِمُونَ",
    "إِن يُوحَىٰ إِلَيَّ إِلَّا أَنَّمَا أَنَا نَذِيرٌ مُّبِينٌ",
    "إِذْ قَالَ رَبُّكَ لِلْمَلَائِكَةِ إِنِّي خَالِقٌ بَشَرًا مِّن طِينٍ",
    "فَإِذَا سَوَّيْتُهُ وَنَفَخْتُ فِيهِ مِن رُّوحِي فَقَعُوا لَهُ سَاجِدِينَ",
    "فَسَجَدَ الْمَلَائِكَةُ كُلُّهُمْ أَجْمَعُونَ",
    "إِلَّا إِبْلِيسَ اسْتَكْبَرَ وَكَانَ مِنَ الْكَافِرِينَ",
    "قَالَ يَا إِبْلِيسُ مَا مَنَعَكَ أَن تَسْجُدَ لِمَا خَلَقْتُ بِيَدَيَّ ۖ أَسْتَكْبَرْتَ أَمْ كُنتَ مِنَ الْعَالِينَ",
    "قَالَ أَنَا خَيْرٌ مِّنْهُ ۖ خَلَقْتَنِي مِن نَّارٍ وَخَلَقْتَهُ مِن طِينٍ",
    "قَالَ فَاخْرُجْ مِنْهَا فَإِنَّكَ رَجِيمٌ",
    "وَإِنَّ عَلَيْكَ لَعْنَتِي إِلَىٰ يَوْمِ الدِّينِ",
    "قَالَ رَبِّ فَأَنظِرْنِي إِلَىٰ يَوْمِ يُبْعَثُونَ",
    "قَالَ فَإِنَّكَ مِنَ الْمُنظَرِينَ",
    "إِلَىٰ يَوْمِ الْوَقْتِ الْمَعْلُومِ",
    "قَالَ فَبِعِزَّتِكَ لَأُغْوِيَنَّهُمْ أَجْمَعِينَ",
    "إِلَّا عِبَادَكَ مِنْهُمُ الْمُخْلَصِينَ",
    "قَالَ فَالْحَقُّ وَالْحَقَّ أَقُولُ",
    "لَأَمْلَأَنَّ جَهَنَّمَ مِنكَ وَمِمَّن تَبِعَكَ مِنْهُمْ أَجْمَعِينَ",
    "قُلْ مَا أَسْأَلُكُمْ عَلَيْهِ مِنْ أَجْرٍ وَمَا أَنَا مِنَ الْمُتَكَلِّفِينَ",
    "إِنْ هُوَ إِلَّا ذِكْرٌ لِّلْعَالَمِينَ",
    "وَلَتَعْلَمُنَّ نَبَأَهُ بَعْدَ حِينٍ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Sad. By the Qur'an containing reminder...",
    "But those who disbelieve are in pride and dissension.",
    "How many a generation have We destroyed before them, and they [then] called out; but it was not a time for escape.",
    "And they wonder that there has come to them a warner from among themselves. And the disbelievers say, \"This is a magician and a liar.",
    "Has he made the gods [only] one God? Indeed, this is a curious thing.\"",
    "And the eminent among them went forth, [saying], \"Continue, and be patient over [the defense of] your gods. Indeed, this is a thing intended.",
    "We have not heard of this in the latest religion. This is not but a fabrication.",
    "Has the message been revealed to him out of [all of] us?\" Rather, they are in doubt about My message. Rather, they have not yet tasted My punishment.",
    "Or do they have the depositories of the mercy of your Lord, the Exalted in Might, the Bestower?",
    "Or is theirs the dominion of the heavens and the earth and what is between them? Then let them ascend through [any] ways of access.",
    "[They are but] soldiers [who will be] defeated there among the companies [of disbelievers].",
    "The people of Noah denied before them, and [the tribe of] 'Aad and Pharaoh, the owner of stakes,",
    "And [the tribe of] Thamud and the people of Lot and the companions of the thicket. Those are the companies.",
    "Each of them denied the messengers, so My penalty was justified.",
    "And these [disbelievers] await not but one blast [of the Horn]; for it there will be no delay.",
    "And they say, \"Our Lord, hasten for us our share [of the punishment] before the Day of Account\"",
    "Be patient over what they say and remember Our servant, David, the possessor of strength; indeed, he was one who repeatedly turned back [to Allah].",
    "Indeed, We subjected the mountains [to praise] with him, exalting [Allah] in the [late] afternoon and [after] sunrise.",
    "And the birds were assembled, all with him repeating [praises].",
    "And We strengthened his kingdom and gave him wisdom and discernment in speech.",
    "And has there come to you the news of the adversaries, when they climbed over the wall of [his] prayer chamber -",
    "When they entered upon David and he was alarmed by them? They said, \"Fear not. [We are] two adversaries, one of whom has wronged the other, so judge between us with truth and do not exceed [it] and guide us to the sound path.",
    "Indeed this, my brother, has ninety-nine ewes, and I have one ewe; so he said, 'Entrust her to me,' and he overpowered me in speech.\"",
    "[David] said, \"He has certainly wronged you in demanding your ewe [in addition] to his ewes. And indeed, many associates oppress one another, except for those who believe and do righteous deeds - and few are they.\" And David became certain that We had tried him, and he asked forgiveness of his Lord and fell down bowing [in prostration] and turned in repentance [to Allah].",
    "So We forgave him that; and indeed, for him is nearness to Us and a good place of return.",
    "[We said], \"O David, indeed We have made you a successor upon the earth, so judge between the people in truth and do not follow [your own] desire, as it will lead you astray from the way of Allah.\" Indeed, those who go astray from the way of Allah will have a severe punishment for having forgotten the Day of Account.",
    "And We did not create the heaven and the earth and that between them aimlessly. That is the assumption of those who disbelieve, so woe to those who disbelieve from the Fire.",
    "Or should we treat those who believe and do righteous deeds like corrupters in the land? Or should We treat those who fear Allah like the wicked?",
    "[This is] a blessed Book which We have revealed to you, [O Muhammad], that they might reflect upon its verses and that those of understanding would be reminded.",
    "And to David We gave Solomon. An excellent servant, indeed he was one repeatedly turning back [to Allah].",
    "[Mention] when there were exhibited before him in the afternoon the poised [standing] racehorses.",
    "And he said, \"Indeed, I gave preference to the love of good [things] over the remembrance of my Lord until the sun disappeared into the curtain [of darkness].\"",
    "[He said], \"Return them to me,\" and set about striking [their] legs and necks.",
    "And We certainly tried Solomon and placed on his throne a body; then he returned.",
    "He said, \"My Lord, forgive me and grant me a kingdom such as will not belong to anyone after me. Indeed, You are the Bestower.\"",
    "So We subjected to him the wind blowing by his command, gently, wherever he directed,",
    "And [also] the devils [of jinn] - every builder and diver",
    "And others bound together in shackles.",
    "[We said], \"This is Our gift, so grant or withhold without account.\"",
    "And indeed, for him is nearness to Us and a good place of return.",
    "And remember Our servant Job, when he called to his Lord, \"Indeed, Satan has touched me with hardship and torment.\"",
    "[So he was told], \"Strike [the ground] with your foot; this is a [spring for] a cool bath and drink.\"",
    "And We granted him his family and a like [number] with them as mercy from Us and a reminder for those of understanding.",
    "[We said], \"And take in your hand a bunch [of grass] and strike with it and do not break your oath.\" Indeed, We found him patient, an excellent servant. Indeed, he was one repeatedly turning back [to Allah].",
    "And remember Our servants, Abraham, Isaac and Jacob - those of strength and [religious] vision.",
    "Indeed, We chose them for an exclusive quality: remembrance of the home [of the Hereafter].",
    "And indeed they are, to Us, among the chosen and outstanding.",
    "And remember Ishmael, Elisha and Dhul-Kifl, and all are among the outstanding.",
    "This is a reminder. And indeed, for the righteous is a good place of return",
    "Gardens of perpetual residence, whose doors will be opened to them.",
    "Reclining within them, they will call therein for abundant fruit and drink.",
    "And with them will be women limiting [their] glances and of equal age.",
    "This is what you, [the righteous], are promised for the Day of Account.",
    "Indeed, this is Our provision; for it there is no depletion.",
    "This [is so]. But indeed, for the transgressors is an evil place of return -",
    "Hell, which they will [enter to] burn, and wretched is the resting place.",
    "This - so let them taste it - is scalding water and [foul] purulence.",
    "And other [punishments] of its type [in various] kinds.",
    "[Its inhabitants will say], \"This is a company bursting in with you. No welcome for them. Indeed, they will burn in the Fire.\"",
    "They will say, \"Nor you! No welcome for you. You, [our leaders], brought this upon us, and wretched is the settlement.\"",
    "They will say, \"Our Lord, whoever brought this upon us - increase for him double punishment in the Fire.\"",
    "And they will say, \"Why do we not see men whom we used to count among the worst?",
    "Is it [because] we took them in ridicule, or has [our] vision turned away from them?\"",
    "Indeed, that is truth - the quarreling of the people of the Fire.",
    "Say, [O Muhammad], \"I am only a warner, and there is not any deity except Allah, the One, the Prevailing.",
    "Lord of the heavens and the earth and whatever is between them, the Exalted in Might, the Perpetual Forgiver.\"",
    "Say, \"It is great news",
    "From which you turn away.",
    "I had no knowledge of the exalted assembly [of angels] when they were disputing [the creation of Adam].",
    "It has not been revealed to me except that I am a clear warner.\"",
    "[So mention] when your Lord said to the angels, \"Indeed, I am going to create a human being from clay.",
    "So when I have proportioned him and breathed into him of My [created] soul, then fall down to him in prostration.\"",
    "So the angels prostrated - all of them entirely.",
    "Except Iblees; he was arrogant and became among the disbelievers.",
    "[Allah] said, \"O Iblees, what prevented you from prostrating to that which I created with My hands? Were you arrogant [then], or were you [already] among the haughty?\"",
    "He said, \"I am better than him. You created me from fire and created him from clay.\"",
    "[Allah] said, \"Then get out of Paradise, for indeed, you are expelled.",
    "And indeed, upon you is My curse until the Day of Recompense.\"",
    "He said, \"My Lord, then reprieve me until the Day they are resurrected.\"",
    "[Allah] said, \"So indeed, you are of those reprieved",
    "Until the Day of the time well-known.\"",
    "[Iblees] said, \"By your might, I will surely mislead them all",
    "Except, among them, Your chosen servants.\"",
    "[Allah] said, \"The truth [is My oath], and the truth I say -",
    "[That] I will surely fill Hell with you and those of them that follow you all together.\"",
    "Say, [O Muhammad], \"I do not ask you for the Qur'an any payment, and I am not of the pretentious",
    "It is but a reminder to the worlds.",
    "And you will surely know [the truth of] its information after a time.\"",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_sad);
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
