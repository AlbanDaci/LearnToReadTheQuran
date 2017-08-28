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

public class Fussilat extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"41:1", "41:2", "41:3", "41:4", "41:5", "41:6", "41:7", "41:8", "41:9", "41:10", "41:11", "41:12", "41:13", "41:14", "41:15", "41:16",
            "41:17", "41:18", "41:19", "41:20", "41:21", "41:22", "41:23", "41:24", "41:25", "41:26", "41:27", "41:28", "41:29", "41:30", "41:31", "41:32",
            "41:33", "41:34", "41:35", "41:36", "41:37", "41:38", "41:39", "41:40", "41:41", "41:42", "41:43", "41:44", "41:45", "41:46", "41:47", "41:48",
            "41:49", "41:50", "41:51", "41:52", "41:53", "41:54", ""};

    String [] arabic_verses = {"حم",
    "تَنزِيلٌ مِّنَ الرَّحْمَٰنِ الرَّحِيمِ",
    "كِتَابٌ فُصِّلَتْ آيَاتُهُ قُرْآنًا عَرَبِيًّا لِّقَوْمٍ يَعْلَمُونَ",
    "بَشِيرًا وَنَذِيرًا فَأَعْرَضَ أَكْثَرُهُمْ فَهُمْ لَا يَسْمَعُونَ",
    "وَقَالُوا قُلُوبُنَا فِي أَكِنَّةٍ مِّمَّا تَدْعُونَا إِلَيْهِ وَفِي آذَانِنَا وَقْرٌ وَمِن بَيْنِنَا وَبَيْنِكَ حِجَابٌ فَاعْمَلْ إِنَّنَا عَامِلُونَ",
    "قُلْ إِنَّمَا أَنَا بَشَرٌ مِّثْلُكُمْ يُوحَىٰ إِلَيَّ أَنَّمَا إِلَٰهُكُمْ إِلَٰهٌ وَاحِدٌ فَاسْتَقِيمُوا إِلَيْهِ وَاسْتَغْفِرُوهُ ۗ وَوَيْلٌ لِّلْمُشْرِكِينَ",
    "الَّذِينَ لَا يُؤْتُونَ الزَّكَاةَ وَهُم بِالْآخِرَةِ هُمْ كَافِرُونَ",
    "إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍ",
    "قُلْ أَئِنَّكُمْ لَتَكْفُرُونَ بِالَّذِي خَلَقَ الْأَرْضَ فِي يَوْمَيْنِ وَتَجْعَلُونَ لَهُ أَندَادًا ۚ ذَٰلِكَ رَبُّ الْعَالَمِينَ",
    "وَجَعَلَ فِيهَا رَوَاسِيَ مِن فَوْقِهَا وَبَارَكَ فِيهَا وَقَدَّرَ فِيهَا أَقْوَاتَهَا فِي أَرْبَعَةِ أَيَّامٍ سَوَاءً لِّلسَّائِلِينَ",
    "ثُمَّ اسْتَوَىٰ إِلَى السَّمَاءِ وَهِيَ دُخَانٌ فَقَالَ لَهَا وَلِلْأَرْضِ ائْتِيَا طَوْعًا أَوْ كَرْهًا قَالَتَا أَتَيْنَا طَائِعِينَ",
    "فَقَضَاهُنَّ سَبْعَ سَمَاوَاتٍ فِي يَوْمَيْنِ وَأَوْحَىٰ فِي كُلِّ سَمَاءٍ أَمْرَهَا ۚ وَزَيَّنَّا السَّمَاءَ الدُّنْيَا بِمَصَابِيحَ وَحِفْظًا ۚ ذَٰلِكَ تَقْدِيرُ الْعَزِيزِ الْعَلِيمِ",
    "فَإِنْ أَعْرَضُوا فَقُلْ أَنذَرْتُكُمْ صَاعِقَةً مِّثْلَ صَاعِقَةِ عَادٍ وَثَمُودَ",
    "إِذْ جَاءَتْهُمُ الرُّسُلُ مِن بَيْنِ أَيْدِيهِمْ وَمِنْ خَلْفِهِمْ أَلَّا تَعْبُدُوا إِلَّا اللَّهَ ۖ قَالُوا لَوْ شَاءَ رَبُّنَا لَأَنزَلَ مَلَائِكَةً فَإِنَّا بِمَا أُرْسِلْتُم بِهِ كَافِرُونَ",
    "فَأَمَّا عَادٌ فَاسْتَكْبَرُوا فِي الْأَرْضِ بِغَيْرِ الْحَقِّ وَقَالُوا مَنْ أَشَدُّ مِنَّا قُوَّةً ۖ أَوَلَمْ يَرَوْا أَنَّ اللَّهَ الَّذِي خَلَقَهُمْ هُوَ أَشَدُّ مِنْهُمْ قُوَّةً ۖ وَكَانُوا بِآيَاتِنَا يَجْحَدُونَ",
    "فَأَرْسَلْنَا عَلَيْهِمْ رِيحًا صَرْصَرًا فِي أَيَّامٍ نَّحِسَاتٍ لِّنُذِيقَهُمْ عَذَابَ الْخِزْيِ فِي الْحَيَاةِ الدُّنْيَا ۖ وَلَعَذَابُ الْآخِرَةِ أَخْزَىٰ ۖ وَهُمْ لَا يُنصَرُونَ",
    "وَأَمَّا ثَمُودُ فَهَدَيْنَاهُمْ فَاسْتَحَبُّوا الْعَمَىٰ عَلَى الْهُدَىٰ فَأَخَذَتْهُمْ صَاعِقَةُ الْعَذَابِ الْهُونِ بِمَا كَانُوا يَكْسِبُونَ",
    "وَنَجَّيْنَا الَّذِينَ آمَنُوا وَكَانُوا يَتَّقُونَ",
    "وَيَوْمَ يُحْشَرُ أَعْدَاءُ اللَّهِ إِلَى النَّارِ فَهُمْ يُوزَعُونَ",
    "حَتَّىٰ إِذَا مَا جَاءُوهَا شَهِدَ عَلَيْهِمْ سَمْعُهُمْ وَأَبْصَارُهُمْ وَجُلُودُهُم بِمَا كَانُوا يَعْمَلُونَ",
    "وَقَالُوا لِجُلُودِهِمْ لِمَ شَهِدتُّمْ عَلَيْنَا ۖ قَالُوا أَنطَقَنَا اللَّهُ الَّذِي أَنطَقَ كُلَّ شَيْءٍ وَهُوَ خَلَقَكُمْ أَوَّلَ مَرَّةٍ وَإِلَيْهِ تُرْجَعُونَ",
    "وَمَا كُنتُمْ تَسْتَتِرُونَ أَن يَشْهَدَ عَلَيْكُمْ سَمْعُكُمْ وَلَا أَبْصَارُكُمْ وَلَا جُلُودُكُمْ وَلَٰكِن ظَنَنتُمْ أَنَّ اللَّهَ لَا يَعْلَمُ كَثِيرًا مِّمَّا تَعْمَلُونَ",
    "وَذَٰلِكُمْ ظَنُّكُمُ الَّذِي ظَنَنتُم بِرَبِّكُمْ أَرْدَاكُمْ فَأَصْبَحْتُم مِّنَ الْخَاسِرِينَ",
    "فَإِن يَصْبِرُوا فَالنَّارُ مَثْوًى لَّهُمْ ۖ وَإِن يَسْتَعْتِبُوا فَمَا هُم مِّنَ الْمُعْتَبِينَ",
    "وَقَيَّضْنَا لَهُمْ قُرَنَاءَ فَزَيَّنُوا لَهُم مَّا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَحَقَّ عَلَيْهِمُ الْقَوْلُ فِي أُمَمٍ قَدْ خَلَتْ مِن قَبْلِهِم مِّنَ الْجِنِّ وَالْإِنسِ ۖ إِنَّهُمْ كَانُوا خَاسِرِينَ",
    "وَقَالَ الَّذِينَ كَفَرُوا لَا تَسْمَعُوا لِهَٰذَا الْقُرْآنِ وَالْغَوْا فِيهِ لَعَلَّكُمْ تَغْلِبُونَ",
    "فَلَنُذِيقَنَّ الَّذِينَ كَفَرُوا عَذَابًا شَدِيدًا وَلَنَجْزِيَنَّهُمْ أَسْوَأَ الَّذِي كَانُوا يَعْمَلُونَ",
    "ذَٰلِكَ جَزَاءُ أَعْدَاءِ اللَّهِ النَّارُ ۖ لَهُمْ فِيهَا دَارُ الْخُلْدِ ۖ جَزَاءً بِمَا كَانُوا بِآيَاتِنَا يَجْحَدُونَ",
    "وَقَالَ الَّذِينَ كَفَرُوا رَبَّنَا أَرِنَا اللَّذَيْنِ أَضَلَّانَا مِنَ الْجِنِّ وَالْإِنسِ نَجْعَلْهُمَا تَحْتَ أَقْدَامِنَا لِيَكُونَا مِنَ الْأَسْفَلِينَ",
    "إِنَّ الَّذِينَ قَالُوا رَبُّنَا اللَّهُ ثُمَّ اسْتَقَامُوا تَتَنَزَّلُ عَلَيْهِمُ الْمَلَائِكَةُ أَلَّا تَخَافُوا وَلَا تَحْزَنُوا وَأَبْشِرُوا بِالْجَنَّةِ الَّتِي كُنتُمْ تُوعَدُونَ",
    "نَحْنُ أَوْلِيَاؤُكُمْ فِي الْحَيَاةِ الدُّنْيَا وَفِي الْآخِرَةِ ۖ وَلَكُمْ فِيهَا مَا تَشْتَهِي أَنفُسُكُمْ وَلَكُمْ فِيهَا مَا تَدَّعُونَ",
    "نُزُلًا مِّنْ غَفُورٍ رَّحِيمٍ",
    "وَمَنْ أَحْسَنُ قَوْلًا مِّمَّن دَعَا إِلَى اللَّهِ وَعَمِلَ صَالِحًا وَقَالَ إِنَّنِي مِنَ الْمُسْلِمِينَ",
    "وَلَا تَسْتَوِي الْحَسَنَةُ وَلَا السَّيِّئَةُ ۚ ادْفَعْ بِالَّتِي هِيَ أَحْسَنُ فَإِذَا الَّذِي بَيْنَكَ وَبَيْنَهُ عَدَاوَةٌ كَأَنَّهُ وَلِيٌّ حَمِيمٌ",
    "وَمَا يُلَقَّاهَا إِلَّا الَّذِينَ صَبَرُوا وَمَا يُلَقَّاهَا إِلَّا ذُو حَظٍّ عَظِيمٍ",
    "وَإِمَّا يَنزَغَنَّكَ مِنَ الشَّيْطَانِ نَزْغٌ فَاسْتَعِذْ بِاللَّهِ ۖ إِنَّهُ هُوَ السَّمِيعُ الْعَلِيمُ",
    "وَمِنْ آيَاتِهِ اللَّيْلُ وَالنَّهَارُ وَالشَّمْسُ وَالْقَمَرُ ۚ لَا تَسْجُدُوا لِلشَّمْسِ وَلَا لِلْقَمَرِ وَاسْجُدُوا لِلَّهِ الَّذِي خَلَقَهُنَّ إِن كُنتُمْ إِيَّاهُ تَعْبُدُونَ",
    "فَإِنِ اسْتَكْبَرُوا فَالَّذِينَ عِندَ رَبِّكَ يُسَبِّحُونَ لَهُ بِاللَّيْلِ وَالنَّهَارِ وَهُمْ لَا يَسْأَمُونَ ۩",
    "وَمِنْ آيَاتِهِ أَنَّكَ تَرَى الْأَرْضَ خَاشِعَةً فَإِذَا أَنزَلْنَا عَلَيْهَا الْمَاءَ اهْتَزَّتْ وَرَبَتْ ۚ إِنَّ الَّذِي أَحْيَاهَا لَمُحْيِي الْمَوْتَىٰ ۚ إِنَّهُ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "إِنَّ الَّذِينَ يُلْحِدُونَ فِي آيَاتِنَا لَا يَخْفَوْنَ عَلَيْنَا ۗ أَفَمَن يُلْقَىٰ فِي النَّارِ خَيْرٌ أَم مَّن يَأْتِي آمِنًا يَوْمَ الْقِيَامَةِ ۚ اعْمَلُوا مَا شِئْتُمْ ۖ إِنَّهُ بِمَا تَعْمَلُونَ بَصِيرٌ",
    "إِنَّ الَّذِينَ كَفَرُوا بِالذِّكْرِ لَمَّا جَاءَهُمْ ۖ وَإِنَّهُ لَكِتَابٌ عَزِيزٌ",
    "لَّا يَأْتِيهِ الْبَاطِلُ مِن بَيْنِ يَدَيْهِ وَلَا مِنْ خَلْفِهِ ۖ تَنزِيلٌ مِّنْ حَكِيمٍ حَمِيدٍ",
    "مَّا يُقَالُ لَكَ إِلَّا مَا قَدْ قِيلَ لِلرُّسُلِ مِن قَبْلِكَ ۚ إِنَّ رَبَّكَ لَذُو مَغْفِرَةٍ وَذُو عِقَابٍ أَلِيمٍ",
    "وَلَوْ جَعَلْنَاهُ قُرْآنًا أَعْجَمِيًّا لَّقَالُوا لَوْلَا فُصِّلَتْ آيَاتُهُ ۖ أَأَعْجَمِيٌّ وَعَرَبِيٌّ ۗ قُلْ هُوَ لِلَّذِينَ آمَنُوا هُدًى وَشِفَاءٌ ۖ وَالَّذِينَ لَا يُؤْمِنُونَ فِي آذَانِهِمْ وَقْرٌ وَهُوَ عَلَيْهِمْ عَمًى ۚ أُولَٰئِكَ يُنَادَوْنَ مِن مَّكَانٍ بَعِيدٍ",
    "وَلَقَدْ آتَيْنَا مُوسَى الْكِتَابَ فَاخْتُلِفَ فِيهِ ۗ وَلَوْلَا كَلِمَةٌ سَبَقَتْ مِن رَّبِّكَ لَقُضِيَ بَيْنَهُمْ ۚ وَإِنَّهُمْ لَفِي شَكٍّ مِّنْهُ مُرِيبٍ",
    "مَّنْ عَمِلَ صَالِحًا فَلِنَفْسِهِ ۖ وَمَنْ أَسَاءَ فَعَلَيْهَا ۗ وَمَا رَبُّكَ بِظَلَّامٍ لِّلْعَبِيدِ",
    "إِلَيْهِ يُرَدُّ عِلْمُ السَّاعَةِ ۚ وَمَا تَخْرُجُ مِن ثَمَرَاتٍ مِّنْ أَكْمَامِهَا وَمَا تَحْمِلُ مِنْ أُنثَىٰ وَلَا تَضَعُ إِلَّا بِعِلْمِهِ ۚ وَيَوْمَ يُنَادِيهِمْ أَيْنَ شُرَكَائِي قَالُوا آذَنَّاكَ مَا مِنَّا مِن شَهِيدٍ",
    "وَضَلَّ عَنْهُم مَّا كَانُوا يَدْعُونَ مِن قَبْلُ ۖ وَظَنُّوا مَا لَهُم مِّن مَّحِيصٍ",
    "لَّا يَسْأَمُ الْإِنسَانُ مِن دُعَاءِ الْخَيْرِ وَإِن مَّسَّهُ الشَّرُّ فَيَئُوسٌ قَنُوطٌ",
    "وَلَئِنْ أَذَقْنَاهُ رَحْمَةً مِّنَّا مِن بَعْدِ ضَرَّاءَ مَسَّتْهُ لَيَقُولَنَّ هَٰذَا لِي وَمَا أَظُنُّ السَّاعَةَ قَائِمَةً وَلَئِن رُّجِعْتُ إِلَىٰ رَبِّي إِنَّ لِي عِندَهُ لَلْحُسْنَىٰ ۚ فَلَنُنَبِّئَنَّ الَّذِينَ كَفَرُوا بِمَا عَمِلُوا وَلَنُذِيقَنَّهُم مِّنْ عَذَابٍ غَلِيظٍ",
    "وَإِذَا أَنْعَمْنَا عَلَى الْإِنسَانِ أَعْرَضَ وَنَأَىٰ بِجَانِبِهِ وَإِذَا مَسَّهُ الشَّرُّ فَذُو دُعَاءٍ عَرِيضٍ",
    "قُلْ أَرَأَيْتُمْ إِن كَانَ مِنْ عِندِ اللَّهِ ثُمَّ كَفَرْتُم بِهِ مَنْ أَضَلُّ مِمَّنْ هُوَ فِي شِقَاقٍ بَعِيدٍ",
    "سَنُرِيهِمْ آيَاتِنَا فِي الْآفَاقِ وَفِي أَنفُسِهِمْ حَتَّىٰ يَتَبَيَّنَ لَهُمْ أَنَّهُ الْحَقُّ ۗ أَوَلَمْ يَكْفِ بِرَبِّكَ أَنَّهُ عَلَىٰ كُلِّ شَيْءٍ شَهِيدٌ",
    "أَلَا إِنَّهُمْ فِي مِرْيَةٍ مِّن لِّقَاءِ رَبِّهِمْ ۗ أَلَا إِنَّهُ بِكُلِّ شَيْءٍ مُّحِيطٌ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Ha, Meem.",
    "[This is] a revelation from the Entirely Merciful, the Especially Merciful -",
    "A Book whose verses have been detailed, an Arabic Qur'an for a people who know,",
    "As a giver of good tidings and a warner; but most of them turn away, so they do not hear.",
    "And they say, \"Our hearts are within coverings from that to which you invite us, and in our ears is deafness, and between us and you is a partition, so work; indeed, we are working.\"",
    "Say, O [Muhammad], \"I am only a man like you to whom it has been revealed that your god is but one God; so take a straight course to Him and seek His forgiveness.\" And woe to those who associate others with Allah -",
    "Those who do not give zakah, and in the Hereafter they are disbelievers.",
    "Indeed, those who believe and do righteous deeds - for them is a reward uninterrupted.",
    "Say, \"Do you indeed disbelieve in He who created the earth in two days and attribute to Him equals? That is the Lord of the worlds.\"",
    "And He placed on the earth firmly set mountains over its surface, and He blessed it and determined therein its [creatures'] sustenance in four days without distinction - for [the information] of those who ask.",
    "Then He directed Himself to the heaven while it was smoke and said to it and to the earth, \"Come [into being], willingly or by compulsion.\" They said, \"We have come willingly.\"",
    "And He completed them as seven heavens within two days and inspired in each heaven its command. And We adorned the nearest heaven with lamps and as protection. That is the determination of the Exalted in Might, the Knowing.",
    "But if they turn away, then say, \"I have warned you of a thunderbolt like the thunderbolt [that struck] 'Aad and Thamud.",
    "[That occurred] when the messengers had come to them before them and after them, [saying], \"Worship not except Allah.\" They said, \"If our Lord had willed, He would have sent down the angels, so indeed we, in that with which you have been sent, are disbelievers.\"",
    "As for 'Aad, they were arrogant upon the earth without right and said, \"Who is greater than us in strength?\" Did they not consider that Allah who created them was greater than them in strength? But they were rejecting Our signs.",
    "So We sent upon them a screaming wind during days of misfortune to make them taste the punishment of disgrace in the worldly life; but the punishment of the Hereafter is more disgracing, and they will not be helped.",
    "And as for Thamud, We guided them, but they preferred blindness over guidance, so the thunderbolt of humiliating punishment seized them for what they used to earn.",
    "And We saved those who believed and used to fear Allah.",
    "And [mention, O Muhammad], the Day when the enemies of Allah will be gathered to the Fire while they are [driven] assembled in rows,",
    "Until, when they reach it, their hearing and their eyes and their skins will testify against them of what they used to do.",
    "And they will say to their skins, \"Why have you testified against us?\" They will say, \"We were made to speak by Allah, who has made everything speak; and He created you the first time, and to Him you are returned.",
    "And you were not covering yourselves, lest your hearing testify against you or your sight or your skins, but you assumed that Allah does not know much of what you do.",
    "And that was your assumption which you assumed about your Lord. It has brought you to ruin, and you have become among the losers.\"",
    "So [even] if they are patient, the Fire is a residence for them; and if they ask to appease [Allah], they will not be of those who are allowed to appease.",
    "And We appointed for them companions who made attractive to them what was before them and what was behind them [of sin], and the word has come into effect upon them among nations which had passed on before them of jinn and men. Indeed, they [all] were losers.",
    "And those who disbelieve say, \"Do not listen to this Qur'an and speak noisily during [the recitation of] it that perhaps you will overcome.\"",
    "But We will surely cause those who disbelieve to taste a severe punishment, and We will surely recompense them for the worst of what they had been doing.",
    "That is the recompense of the enemies of Allah - the Fire. For them therein is the home of eternity as recompense for what they, of Our verses, were rejecting.",
    "And those who disbelieved will [then] say, \"Our Lord, show us those who misled us of the jinn and men [so] we may put them under our feet that they will be among the lowest.\"",
    "Indeed, those who have said, \"Our Lord is Allah\" and then remained on a right course - the angels will descend upon them, [saying], \"Do not fear and do not grieve but receive good tidings of Paradise, which you were promised.",
    "We were your allies in the worldly life and in the Hereafter. And you will have therein whatever your souls desire, and you will have therein whatever you request",
    "As accommodation from a [Lord who is] Forgiving and Merciful.\"",
    "And who is better in speech than one who invites to Allah and does righteousness and says, \"Indeed, I am of the Muslims.\"",
    "And not equal are the good deed and the bad. Repel [evil] by that [deed] which is better; and thereupon the one whom between you and him is enmity [will become] as though he was a devoted friend.",
    "But none is granted it except those who are patient, and none is granted it except one having a great portion [of good].",
    "And if there comes to you from Satan an evil suggestion, then seek refuge in Allah. Indeed, He is the Hearing, the Knowing.",
    "And of His signs are the night and day and the sun and moon. Do not prostrate to the sun or to the moon, but prostate to Allah, who created them, if it should be Him that you worship.",
    "But if they are arrogant - then those who are near your Lord exalt Him by night and by day, and they do not become weary.",
    "And of His signs is that you see the earth stilled, but when We send down upon it rain, it quivers and grows. Indeed, He who has given it life is the Giver of Life to the dead. Indeed, He is over all things competent.",
    "Indeed, those who inject deviation into Our verses are not concealed from Us. So, is he who is cast into the Fire better or he who comes secure on the Day of Resurrection? Do whatever you will; indeed, He is Seeing of what you do.",
    "Indeed, those who disbelieve in the message after it has come to them... And indeed, it is a mighty Book.",
    "Falsehood cannot approach it from before it or from behind it; [it is] a revelation from a [Lord who is] Wise and Praiseworthy.",
    "Nothing is said to you, [O Muhammad], except what was already said to the messengers before you. Indeed, your Lord is a possessor of forgiveness and a possessor of painful penalty.",
    "And if We had made it a non-Arabic Qur'an, they would have said, \"Why are its verses not explained in detail [in our language]? Is it a foreign [recitation] and an Arab [messenger]?\" Say, \"It is, for those who believe, a guidance and cure.\" And those who do not believe - in their ears is deafness, and it is upon them blindness. Those are being called from a distant place.",
    "And We had already given Moses the Scripture, but it came under disagreement. And if not for a word that preceded from your Lord, it would have been concluded between them. And indeed they are, concerning the Qur'an, in disquieting doubt.",
    "Whoever does righteousness - it is for his [own] soul; and whoever does evil [does so] against it. And your Lord is not ever unjust to [His] servants.",
    "To him [alone] is attributed knowledge of the Hour. And fruits emerge not from their coverings nor does a female conceive or give birth except with His knowledge. And the Day He will call to them, \"Where are My 'partners'?\" they will say, \"We announce to You that there is [no longer] among us any witness [to that].\"",
    "And lost from them will be those they were invoking before, and they will be certain that they have no place of escape.",
    "Man is not weary of supplication for good [things], but if evil touches him, he is hopeless and despairing.",
    "And if We let him taste mercy from Us after an adversity which has touched him, he will surely say, \"This is [due] to me, and I do not think the Hour will occur; and [even] if I should be returned to my Lord, indeed, for me there will be with Him the best.\" But We will surely inform those who disbelieved about what they did, and We will surely make them taste a massive punishment.",
    "And when We bestow favor upon man, he turns away and distances himself; but when evil touches him, then he is full of extensive supplication.",
    "Say, \"Have you considered: if the Qur'an is from Allah and you disbelieved in it, who would be more astray than one who is in extreme dissension?\"",
    "We will show them Our signs in the horizons and within themselves until it becomes clear to them that it is the truth. But is it not sufficient concerning your Lord that He is, over all things, a Witness?",
    "Unquestionably, they are in doubt about the meeting with their Lord. Unquestionably He is, of all things, encompassing.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fussilat);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_fussilat);
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
