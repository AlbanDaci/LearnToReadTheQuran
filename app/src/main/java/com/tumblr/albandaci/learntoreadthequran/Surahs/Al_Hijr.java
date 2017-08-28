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

public class Al_Hijr extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"15:1", "15:2", "15:3", "15:4", "15:5", "15:6", "15:7", "15:8", "15:9", "15:10", "15:11", "15:12", "15:13", "15:14", "15:15", "15:16",
            "15:17", "15:18", "15:19", "15:20", "15:21", "15:22", "15:23", "15:24", "15:25", "15:26", "15:27", "15:28", "15:29", "15:30", "15:31", "15:32",
            "15:33", "15:34", "15:35", "15:36", "15:37", "15:38", "15:39", "15:40", "15:41", "15:42", "15:43", "15:44", "15:45", "15:46", "15:47", "15:48",
            "15:49", "15:50", "15:51", "15:52", "15:53", "15:54", "15:55", "15:56", "15:57", "15:58", "15:59", "15:60", "15:61", "15:62", "15:63", "15:64",
            "15:65", "15:66", "15:67", "15:68", "15:69", "15:70", "15:71", "15:72", "15:73", "15:74", "15:75", "15:76", "15:77", "15:78", "15:79", "15:80",
            "15:81", "15:82", "15:83", "15:84", "15:85", "15:86", "15:87", "15:88", "15:89", "15:90", "15:91", "15:92", "15:93", "15:94", "15:95", "15:96",
            "15:97", "15:98", "15:99", ""};

    String [] arabic_verses = {"الر ۚ تِلْكَ آيَاتُ الْكِتَابِ وَقُرْآنٍ مُّبِينٍ",
    "رُّبَمَا يَوَدُّ الَّذِينَ كَفَرُوا لَوْ كَانُوا مُسْلِمِينَ",
    "ذَرْهُمْ يَأْكُلُوا وَيَتَمَتَّعُوا وَيُلْهِهِمُ الْأَمَلُ ۖ فَسَوْفَ يَعْلَمُونَ",
    "وَمَا أَهْلَكْنَا مِن قَرْيَةٍ إِلَّا وَلَهَا كِتَابٌ مَّعْلُومٌ",
    "مَّا تَسْبِقُ مِنْ أُمَّةٍ أَجَلَهَا وَمَا يَسْتَأْخِرُونَ",
    "وَقَالُوا يَا أَيُّهَا الَّذِي نُزِّلَ عَلَيْهِ الذِّكْرُ إِنَّكَ لَمَجْنُونٌ",
    "لَّوْ مَا تَأْتِينَا بِالْمَلَائِكَةِ إِن كُنتَ مِنَ الصَّادِقِينَ",
    "مَا نُنَزِّلُ الْمَلَائِكَةَ إِلَّا بِالْحَقِّ وَمَا كَانُوا إِذًا مُّنظَرِينَ",
    "إِنَّا نَحْنُ نَزَّلْنَا الذِّكْرَ وَإِنَّا لَهُ لَحَافِظُونَ",
    "وَلَقَدْ أَرْسَلْنَا مِن قَبْلِكَ فِي شِيَعِ الْأَوَّلِينَ",
    "وَمَا يَأْتِيهِم مِّن رَّسُولٍ إِلَّا كَانُوا بِهِ يَسْتَهْزِئُونَ",
    "كَذَٰلِكَ نَسْلُكُهُ فِي قُلُوبِ الْمُجْرِمِينَ",
    "لَا يُؤْمِنُونَ بِهِ ۖ وَقَدْ خَلَتْ سُنَّةُ الْأَوَّلِينَ",
    "وَلَوْ فَتَحْنَا عَلَيْهِم بَابًا مِّنَ السَّمَاءِ فَظَلُّوا فِيهِ يَعْرُجُونَ",
    "لَقَالُوا إِنَّمَا سُكِّرَتْ أَبْصَارُنَا بَلْ نَحْنُ قَوْمٌ مَّسْحُورُونَ",
    "وَلَقَدْ جَعَلْنَا فِي السَّمَاءِ بُرُوجًا وَزَيَّنَّاهَا لِلنَّاظِرِينَ",
    "وَحَفِظْنَاهَا مِن كُلِّ شَيْطَانٍ رَّجِيمٍ",
    "إِلَّا مَنِ اسْتَرَقَ السَّمْعَ فَأَتْبَعَهُ شِهَابٌ مُّبِينٌ",
    "وَالْأَرْضَ مَدَدْنَاهَا وَأَلْقَيْنَا فِيهَا رَوَاسِيَ وَأَنبَتْنَا فِيهَا مِن كُلِّ شَيْءٍ مَّوْزُونٍ",
    "وَجَعَلْنَا لَكُمْ فِيهَا مَعَايِشَ وَمَن لَّسْتُمْ لَهُ بِرَازِقِينَ",
    "وَإِن مِّن شَيْءٍ إِلَّا عِندَنَا خَزَائِنُهُ وَمَا نُنَزِّلُهُ إِلَّا بِقَدَرٍ مَّعْلُومٍ",
    "وَأَرْسَلْنَا الرِّيَاحَ لَوَاقِحَ فَأَنزَلْنَا مِنَ السَّمَاءِ مَاءً فَأَسْقَيْنَاكُمُوهُ وَمَا أَنتُمْ لَهُ بِخَازِنِينَ",
    "وَإِنَّا لَنَحْنُ نُحْيِي وَنُمِيتُ وَنَحْنُ الْوَارِثُونَ",
    "وَلَقَدْ عَلِمْنَا الْمُسْتَقْدِمِينَ مِنكُمْ وَلَقَدْ عَلِمْنَا الْمُسْتَأْخِرِينَ",
    "وَإِنَّ رَبَّكَ هُوَ يَحْشُرُهُمْ ۚ إِنَّهُ حَكِيمٌ عَلِيمٌ",
    "وَلَقَدْ خَلَقْنَا الْإِنسَانَ مِن صَلْصَالٍ مِّنْ حَمَإٍ مَّسْنُونٍ",
    "وَالْجَانَّ خَلَقْنَاهُ مِن قَبْلُ مِن نَّارِ السَّمُومِ",
    "وَإِذْ قَالَ رَبُّكَ لِلْمَلَائِكَةِ إِنِّي خَالِقٌ بَشَرًا مِّن صَلْصَالٍ مِّنْ حَمَإٍ مَّسْنُونٍ",
    "فَإِذَا سَوَّيْتُهُ وَنَفَخْتُ فِيهِ مِن رُّوحِي فَقَعُوا لَهُ سَاجِدِينَ",
    "فَسَجَدَ الْمَلَائِكَةُ كُلُّهُمْ أَجْمَعُونَ",
    "إِلَّا إِبْلِيسَ أَبَىٰ أَن يَكُونَ مَعَ السَّاجِدِينَ",
    "قَالَ يَا إِبْلِيسُ مَا لَكَ أَلَّا تَكُونَ مَعَ السَّاجِدِينَ",
    "قَالَ لَمْ أَكُن لِّأَسْجُدَ لِبَشَرٍ خَلَقْتَهُ مِن صَلْصَالٍ مِّنْ حَمَإٍ مَّسْنُونٍ",
    "قَالَ فَاخْرُجْ مِنْهَا فَإِنَّكَ رَجِيمٌ",
    "وَإِنَّ عَلَيْكَ اللَّعْنَةَ إِلَىٰ يَوْمِ الدِّينِ",
    "قَالَ رَبِّ فَأَنظِرْنِي إِلَىٰ يَوْمِ يُبْعَثُونَ",
    "قَالَ فَإِنَّكَ مِنَ الْمُنظَرِينَ",
    "إِلَىٰ يَوْمِ الْوَقْتِ الْمَعْلُومِ",
    "قَالَ رَبِّ بِمَا أَغْوَيْتَنِي لَأُزَيِّنَنَّ لَهُمْ فِي الْأَرْضِ وَلَأُغْوِيَنَّهُمْ أَجْمَعِينَ",
    "إِلَّا عِبَادَكَ مِنْهُمُ الْمُخْلَصِينَ",
    "قَالَ هَٰذَا صِرَاطٌ عَلَيَّ مُسْتَقِيمٌ",
    "إِنَّ عِبَادِي لَيْسَ لَكَ عَلَيْهِمْ سُلْطَانٌ إِلَّا مَنِ اتَّبَعَكَ مِنَ الْغَاوِينَ",
    "وَإِنَّ جَهَنَّمَ لَمَوْعِدُهُمْ أَجْمَعِينَ",
    "لَهَا سَبْعَةُ أَبْوَابٍ لِّكُلِّ بَابٍ مِّنْهُمْ جُزْءٌ مَّقْسُومٌ",
    "إِنَّ الْمُتَّقِينَ فِي جَنَّاتٍ وَعُيُونٍ",
    "ادْخُلُوهَا بِسَلَامٍ آمِنِينَ",
    "وَنَزَعْنَا مَا فِي صُدُورِهِم مِّنْ غِلٍّ إِخْوَانًا عَلَىٰ سُرُرٍ مُّتَقَابِلِينَ",
    "لَا يَمَسُّهُمْ فِيهَا نَصَبٌ وَمَا هُم مِّنْهَا بِمُخْرَجِينَ",
    "نَبِّئْ عِبَادِي أَنِّي أَنَا الْغَفُورُ الرَّحِيمُ",
    "وَأَنَّ عَذَابِي هُوَ الْعَذَابُ الْأَلِيمُ",
    "وَنَبِّئْهُمْ عَن ضَيْفِ إِبْرَاهِيمَ",
    "إِذْ دَخَلُوا عَلَيْهِ فَقَالُوا سَلَامًا قَالَ إِنَّا مِنكُمْ وَجِلُونَ",
    "قَالُوا لَا تَوْجَلْ إِنَّا نُبَشِّرُكَ بِغُلَامٍ عَلِيمٍ",
    "قَالَ أَبَشَّرْتُمُونِي عَلَىٰ أَن مَّسَّنِيَ الْكِبَرُ فَبِمَ تُبَشِّرُونَ",
    "قَالُوا بَشَّرْنَاكَ بِالْحَقِّ فَلَا تَكُن مِّنَ الْقَانِطِينَ",
    "قَالَ وَمَن يَقْنَطُ مِن رَّحْمَةِ رَبِّهِ إِلَّا الضَّالُّونَ",
    "قَالَ فَمَا خَطْبُكُمْ أَيُّهَا الْمُرْسَلُونَ",
    "قَالُوا إِنَّا أُرْسِلْنَا إِلَىٰ قَوْمٍ مُّجْرِمِينَ",
    "إِلَّا آلَ لُوطٍ إِنَّا لَمُنَجُّوهُمْ أَجْمَعِينَ",
    "إِلَّا امْرَأَتَهُ قَدَّرْنَا ۙ إِنَّهَا لَمِنَ الْغَابِرِينَ",
    "فَلَمَّا جَاءَ آلَ لُوطٍ الْمُرْسَلُونَ",
    "قَالَ إِنَّكُمْ قَوْمٌ مُّنكَرُونَ",
    "قَالُوا بَلْ جِئْنَاكَ بِمَا كَانُوا فِيهِ يَمْتَرُونَ",
    "وَأَتَيْنَاكَ بِالْحَقِّ وَإِنَّا لَصَادِقُونَ",
    "فَأَسْرِ بِأَهْلِكَ بِقِطْعٍ مِّنَ اللَّيْلِ وَاتَّبِعْ أَدْبَارَهُمْ وَلَا يَلْتَفِتْ مِنكُمْ أَحَدٌ وَامْضُوا حَيْثُ تُؤْمَرُونَ",
    "وَقَضَيْنَا إِلَيْهِ ذَٰلِكَ الْأَمْرَ أَنَّ دَابِرَ هَٰؤُلَاءِ مَقْطُوعٌ مُّصْبِحِينَ",
    "وَجَاءَ أَهْلُ الْمَدِينَةِ يَسْتَبْشِرُونَ",
    "قَالَ إِنَّ هَٰؤُلَاءِ ضَيْفِي فَلَا تَفْضَحُونِ",
    "وَاتَّقُوا اللَّهَ وَلَا تُخْزُونِ",
    "قَالُوا أَوَلَمْ نَنْهَكَ عَنِ الْعَالَمِينَ",
    "قَالَ هَٰؤُلَاءِ بَنَاتِي إِن كُنتُمْ فَاعِلِينَ",
    "لَعَمْرُكَ إِنَّهُمْ لَفِي سَكْرَتِهِمْ يَعْمَهُونَ",
    "فَأَخَذَتْهُمُ الصَّيْحَةُ مُشْرِقِينَ",
    "فَجَعَلْنَا عَالِيَهَا سَافِلَهَا وَأَمْطَرْنَا عَلَيْهِمْ حِجَارَةً مِّن سِجِّيلٍ",
    "إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّلْمُتَوَسِّمِينَ",
    "وَإِنَّهَا لَبِسَبِيلٍ مُّقِيمٍ",
    "إِنَّ فِي ذَٰلِكَ لَآيَةً لِّلْمُؤْمِنِينَ",
    "وَإِن كَانَ أَصْحَابُ الْأَيْكَةِ لَظَالِمِينَ",
    "فَانتَقَمْنَا مِنْهُمْ وَإِنَّهُمَا لَبِإِمَامٍ مُّبِينٍ",
    "وَلَقَدْ كَذَّبَ أَصْحَابُ الْحِجْرِ الْمُرْسَلِينَ",
    "وَآتَيْنَاهُمْ آيَاتِنَا فَكَانُوا عَنْهَا مُعْرِضِينَ",
    "وَكَانُوا يَنْحِتُونَ مِنَ الْجِبَالِ بُيُوتًا آمِنِينَ",
    "فَأَخَذَتْهُمُ الصَّيْحَةُ مُصْبِحِينَ",
    "فَمَا أَغْنَىٰ عَنْهُم مَّا كَانُوا يَكْسِبُونَ",
    "وَمَا خَلَقْنَا السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا إِلَّا بِالْحَقِّ ۗ وَإِنَّ السَّاعَةَ لَآتِيَةٌ ۖ فَاصْفَحِ الصَّفْحَ الْجَمِيلَ",
    "إِنَّ رَبَّكَ هُوَ الْخَلَّاقُ الْعَلِيمُ",
    "وَلَقَدْ آتَيْنَاكَ سَبْعًا مِّنَ الْمَثَانِي وَالْقُرْآنَ الْعَظِيمَ",
    "لَا تَمُدَّنَّ عَيْنَيْكَ إِلَىٰ مَا مَتَّعْنَا بِهِ أَزْوَاجًا مِّنْهُمْ وَلَا تَحْزَنْ عَلَيْهِمْ وَاخْفِضْ جَنَاحَكَ لِلْمُؤْمِنِينَ",
    "وَقُلْ إِنِّي أَنَا النَّذِيرُ الْمُبِينُ",
    "كَمَا أَنزَلْنَا عَلَى الْمُقْتَسِمِينَ",
    "الَّذِينَ جَعَلُوا الْقُرْآنَ عِضِينَ",
    "فَوَرَبِّكَ لَنَسْأَلَنَّهُمْ أَجْمَعِينَ",
    "عَمَّا كَانُوا يَعْمَلُونَ",
    "فَاصْدَعْ بِمَا تُؤْمَرُ وَأَعْرِضْ عَنِ الْمُشْرِكِينَ",
    "إِنَّا كَفَيْنَاكَ الْمُسْتَهْزِئِينَ",
    "الَّذِينَ يَجْعَلُونَ مَعَ اللَّهِ إِلَٰهًا آخَرَ ۚ فَسَوْفَ يَعْلَمُونَ",
    "وَلَقَدْ نَعْلَمُ أَنَّكَ يَضِيقُ صَدْرُكَ بِمَا يَقُولُونَ",
    "فَسَبِّحْ بِحَمْدِ رَبِّكَ وَكُن مِّنَ السَّاجِدِينَ",
    "وَاعْبُدْ رَبَّكَ حَتَّىٰ يَأْتِيَكَ الْيَقِينُ",
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
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Alif, Lam, Ra. These are the verses of the Book and a clear Qur'an.",
    "Perhaps those who disbelieve will wish that they had been Muslims.",
    "Let them eat and enjoy themselves and be diverted by [false] hope, for they are going to know.",
    "And We did not destroy any city but that for it was a known decree.",
    "No nation will precede its term, nor will they remain thereafter.",
    "And they say,\"O you upon whom the message has been sent down, indeed you are mad.",
    "Why do you not bring us the angels, if you should be among the truthful?\"",
    "We do not send down the angels except with truth; and the disbelievers would not then be reprieved.",
    "Indeed, it is We who sent down the Qur'an and indeed, We will be its guardian.",
    "And We had certainly sent [messengers] before you, [O Muhammad], among the sects of the former peoples.",
    "And no messenger would come to them except that they ridiculed him.",
    "Thus do We insert denial into the hearts of the criminals.",
    "They will not believe in it, while there has already occurred the precedent of the former peoples.",
    "And [even] if We opened to them a gate from the heaven and they continued therein to ascend,",
    "They would say, \"Our eyes have only been dazzled. Rather, we are a people affected by magic.\"",
    "And We have placed within the heaven great stars and have beautified it for the observers.",
    "And We have protected it from every devil expelled [from the mercy of Allah]",
    "Except one who steals a hearing and is pursued by a clear burning flame.",
    "And the earth - We have spread it and cast therein firmly set mountains and caused to grow therein [something] of every well-balanced thing.",
    "And We have made for you therein means of living and [for] those for whom you are not providers.",
    "And there is not a thing but that with Us are its depositories, and We do not send it down except according to a known measure.",
    "And We have sent the fertilizing winds and sent down water from the sky and given you drink from it. And you are not its retainers.",
    "And indeed, it is We who give life and cause death, and We are the Inheritor.",
    "And We have already known the preceding [generations] among you, and We have already known the later [ones to come].",
    "And indeed, your Lord will gather them; indeed, He is Wise and Knowing.",
    "And We did certainly create man out of clay from an altered black mud.",
    "And the jinn We created before from scorching fire.",
    "And [mention, O Muhammad], when your Lord said to the angels, \"I will create a human being out of clay from an altered black mud.",
    "And when I have proportioned him and breathed into him of My [created] soul, then fall down to him in prostration.\"",
    "So the angels prostrated - all of them entirely,",
    "Except Iblees, he refused to be with those who prostrated.",
    "[Allah] said, O Iblees, what is [the matter] with you that you are not with those who prostrate?\"",
    "He said, \"Never would I prostrate to a human whom You created out of clay from an altered black mud.\"",
    "[Allah] said, \"Then get out of it, for indeed, you are expelled.",
    "And indeed, upon you is the curse until the Day of Recompense.\"",
    "He said,\"My Lord, then reprieve me until the Day they are resurrected.\"",
    "[Allah] said, \"So indeed, you are of those reprieved",
    "Until the Day of the time well-known.\"",
    "[Iblees] said, \"My Lord, because You have put me in error, I will surely make [disobedience] attractive to them on earth, and I will mislead them all",
    "Except, among them, Your chosen servants.\"",
    "[Allah] said, \"This is a path [of return] to Me [that is] straight.",
    "Indeed, My servants - no authority will you have over them, except those who follow you of the deviators.",
    "And indeed, Hell is the promised place for them all.",
    "It has seven gates; for every gate is of them a portion designated.\"",
    "Indeed, the righteous will be within gardens and springs.",
    "[Having been told], \"Enter it in peace, safe [and secure].\"",
    "And We will remove whatever is in their breasts of resentment, [so they will be] brothers, on thrones facing each other.",
    "No fatigue will touch them therein, nor from it will they [ever] be removed.",
    "[O Muhammad], inform My servants that it is I who am the Forgiving, the Merciful.",
    "And that it is My punishment which is the painful punishment.",
    "And inform them about the guests of Abraham,",
    "When they entered upon him and said, \"Peace.\" [Abraham] said, \"Indeed, we are fearful of you.\"",
    "[The angels] said, \"Fear not. Indeed, we give you good tidings of a learned boy.\"",
    "He said, \"Have you given me good tidings although old age has come upon me? Then of what [wonder] do you inform?\"",
    "They said, \"We have given you good tidings in truth, so do not be of the despairing.\"",
    "He said, \"And who despairs of the mercy of his Lord except for those astray?\"",
    "[Abraham] said, \"Then what is your business [here], O messengers?\"",
    "They said, \"Indeed, we have been sent to a people of criminals,",
    "Except the family of Lot; indeed, we will save them all",
    "Except his wife.\" Allah decreed that she is of those who remain behind.",
    "And when the messengers came to the family of Lot,",
    "He said, \"Indeed, you are people unknown.\"",
    "They said, \"But we have come to you with that about which they were disputing,",
    "And we have come to you with truth, and indeed, we are truthful.",
    "So set out with your family during a portion of the night and follow behind them and let not anyone among you look back and continue on to where you are commanded.\"",
    "And We conveyed to him [the decree] of that matter: that those [sinners] would be eliminated by early morning.",
    "And the people of the city came rejoicing.",
    "[Lot] said, \"Indeed, these are my guests, so do not shame me.",
    "And fear Allah and do not disgrace me.\"",
    "They said, \"Have we not forbidden you from [protecting] people?\"",
    "[Lot] said, \"These are my daughters - if you would be doers [of lawful marriage].\"",
    "By your life, [O Muhammad], indeed they were, in their intoxication, wandering blindly.",
    "So the shriek seized them at sunrise.",
    "And We made the highest part [of the city] its lowest and rained upon them stones of hard clay.",
    "Indeed in that are signs for those who discern.",
    "And indeed, those cities are [situated] on an established road.",
    "Indeed in that is a sign for the believers.",
    "And the companions of the thicket were [also] wrongdoers.",
    "So We took retribution from them, and indeed, both [cities] are on a clear highway.",
    "And certainly did the companions of Thamud deny the messengers.",
    "And We gave them Our signs, but from them they were turning away.",
    "And they used to carve from the mountains, houses, feeling secure.",
    "But the shriek seized them at early morning.",
    "So nothing availed them [from] what they used to earn.",
    "And We have not created the heavens and earth and that between them except in truth. And indeed, the Hour is coming; so forgive with gracious forgiveness.",
    "Indeed, your Lord - He is the Knowing Creator.",
    "And We have certainly given you, [O Muhammad], seven of the often repeated [verses] and the great Qur'an.",
    "Do not extend your eyes toward that by which We have given enjoyment to [certain] categories of the disbelievers, and do not grieve over them. And lower your wing to the believers",
    "And say, \"Indeed, I am the clear warner\" -",
    "Just as We had revealed [scriptures] to the separators",
    "Who have made the Qur'an into portions.",
    "So by your Lord, We will surely question them all",
    "About what they used to do.",
    "Then declare what you are commanded and turn away from the polytheists.",
    "Indeed, We are sufficient for you against the mockers",
    "Who make [equal] with Allah another deity. But they are going to know.",
    "And We already know that your breast is constrained by what they say.",
    "So exalt [Allah] with praise of your Lord and be of those who prostrate [to Him].",
    "And worship your Lord until there comes to you the certainty (death).",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__hijr);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_hijr);
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
