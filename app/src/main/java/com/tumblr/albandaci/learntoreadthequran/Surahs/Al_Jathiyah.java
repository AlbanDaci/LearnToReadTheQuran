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

public class Al_Jathiyah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"45:1", "45:2", "45:3", "45:4", "45:5", "45:6", "45:7", "45:8", "45:9", "45:10", "45:11", "45:12", "45:13", "45:14", "45:15", "45:16",
            "45:17", "45:18", "45:19", "45:20", "45:21", "45:22", "45:23", "45:24", "45:25", "45:26", "45:27", "45:28", "45:29", "45:30", "45:31", "45:32",
            "45:33", "45:34", "45:35", "45:36", "45:37", ""};

    String [] arabic_verses = {"حم",
    "تَنزِيلُ الْكِتَابِ مِنَ اللَّهِ الْعَزِيزِ الْحَكِيمِ",
    "إِنَّ فِي السَّمَاوَاتِ وَالْأَرْضِ لَآيَاتٍ لِّلْمُؤْمِنِينَ",
    "وَفِي خَلْقِكُمْ وَمَا يَبُثُّ مِن دَابَّةٍ آيَاتٌ لِّقَوْمٍ يُوقِنُونَ",
    "وَاخْتِلَافِ اللَّيْلِ وَالنَّهَارِ وَمَا أَنزَلَ اللَّهُ مِنَ السَّمَاءِ مِن رِّزْقٍ فَأَحْيَا بِهِ الْأَرْضَ بَعْدَ مَوْتِهَا وَتَصْرِيفِ الرِّيَاحِ آيَاتٌ لِّقَوْمٍ يَعْقِلُونَ",
    "تِلْكَ آيَاتُ اللَّهِ نَتْلُوهَا عَلَيْكَ بِالْحَقِّ ۖ فَبِأَيِّ حَدِيثٍ بَعْدَ اللَّهِ وَآيَاتِهِ يُؤْمِنُونَ",
    "وَيْلٌ لِّكُلِّ أَفَّاكٍ أَثِيمٍ",
    "يَسْمَعُ آيَاتِ اللَّهِ تُتْلَىٰ عَلَيْهِ ثُمَّ يُصِرُّ مُسْتَكْبِرًا كَأَن لَّمْ يَسْمَعْهَا ۖ فَبَشِّرْهُ بِعَذَابٍ أَلِيمٍ",
    "وَإِذَا عَلِمَ مِنْ آيَاتِنَا شَيْئًا اتَّخَذَهَا هُزُوًا ۚ أُولَٰئِكَ لَهُمْ عَذَابٌ مُّهِينٌ",
    "مِّن وَرَائِهِمْ جَهَنَّمُ ۖ وَلَا يُغْنِي عَنْهُم مَّا كَسَبُوا شَيْئًا وَلَا مَا اتَّخَذُوا مِن دُونِ اللَّهِ أَوْلِيَاءَ ۖ وَلَهُمْ عَذَابٌ عَظِيمٌ",
    "هَٰذَا هُدًى ۖ وَالَّذِينَ كَفَرُوا بِآيَاتِ رَبِّهِمْ لَهُمْ عَذَابٌ مِّن رِّجْزٍ أَلِيمٌ",
    "اللَّهُ الَّذِي سَخَّرَ لَكُمُ الْبَحْرَ لِتَجْرِيَ الْفُلْكُ فِيهِ بِأَمْرِهِ وَلِتَبْتَغُوا مِن فَضْلِهِ وَلَعَلَّكُمْ تَشْكُرُونَ",
    "وَسَخَّرَ لَكُم مَّا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ جَمِيعًا مِّنْهُ ۚ إِنَّ فِي ذَٰلِكَ لَآيَاتٍ لِّقَوْمٍ يَتَفَكَّرُونَ",
    "قُل لِّلَّذِينَ آمَنُوا يَغْفِرُوا لِلَّذِينَ لَا يَرْجُونَ أَيَّامَ اللَّهِ لِيَجْزِيَ قَوْمًا بِمَا كَانُوا يَكْسِبُونَ",
    "مَنْ عَمِلَ صَالِحًا فَلِنَفْسِهِ ۖ وَمَنْ أَسَاءَ فَعَلَيْهَا ۖ ثُمَّ إِلَىٰ رَبِّكُمْ تُرْجَعُونَ",
    "وَلَقَدْ آتَيْنَا بَنِي إِسْرَائِيلَ الْكِتَابَ وَالْحُكْمَ وَالنُّبُوَّةَ وَرَزَقْنَاهُم مِّنَ الطَّيِّبَاتِ وَفَضَّلْنَاهُمْ عَلَى الْعَالَمِينَ",
    "وَآتَيْنَاهُم بَيِّنَاتٍ مِّنَ الْأَمْرِ ۖ فَمَا اخْتَلَفُوا إِلَّا مِن بَعْدِ مَا جَاءَهُمُ الْعِلْمُ بَغْيًا بَيْنَهُمْ ۚ إِنَّ رَبَّكَ يَقْضِي بَيْنَهُمْ يَوْمَ الْقِيَامَةِ فِيمَا كَانُوا فِيهِ يَخْتَلِفُونَ",
    "ثُمَّ جَعَلْنَاكَ عَلَىٰ شَرِيعَةٍ مِّنَ الْأَمْرِ فَاتَّبِعْهَا وَلَا تَتَّبِعْ أَهْوَاءَ الَّذِينَ لَا يَعْلَمُونَ",
    "إِنَّهُمْ لَن يُغْنُوا عَنكَ مِنَ اللَّهِ شَيْئًا ۚ وَإِنَّ الظَّالِمِينَ بَعْضُهُمْ أَوْلِيَاءُ بَعْضٍ ۖ وَاللَّهُ وَلِيُّ الْمُتَّقِينَ",
    "هَٰذَا بَصَائِرُ لِلنَّاسِ وَهُدًى وَرَحْمَةٌ لِّقَوْمٍ يُوقِنُونَ",
    "أَمْ حَسِبَ الَّذِينَ اجْتَرَحُوا السَّيِّئَاتِ أَن نَّجْعَلَهُمْ كَالَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ سَوَاءً مَّحْيَاهُمْ وَمَمَاتُهُمْ ۚ سَاءَ مَا يَحْكُمُونَ",
    "وَخَلَقَ اللَّهُ السَّمَاوَاتِ وَالْأَرْضَ بِالْحَقِّ وَلِتُجْزَىٰ كُلُّ نَفْسٍ بِمَا كَسَبَتْ وَهُمْ لَا يُظْلَمُونَ",
    "أَفَرَأَيْتَ مَنِ اتَّخَذَ إِلَٰهَهُ هَوَاهُ وَأَضَلَّهُ اللَّهُ عَلَىٰ عِلْمٍ وَخَتَمَ عَلَىٰ سَمْعِهِ وَقَلْبِهِ وَجَعَلَ عَلَىٰ بَصَرِهِ غِشَاوَةً فَمَن يَهْدِيهِ مِن بَعْدِ اللَّهِ ۚ أَفَلَا تَذَكَّرُونَ",
    "وَقَالُوا مَا هِيَ إِلَّا حَيَاتُنَا الدُّنْيَا نَمُوتُ وَنَحْيَا وَمَا يُهْلِكُنَا إِلَّا الدَّهْرُ ۚ وَمَا لَهُم بِذَٰلِكَ مِنْ عِلْمٍ ۖ إِنْ هُمْ إِلَّا يَظُنُّونَ",
    "وَإِذَا تُتْلَىٰ عَلَيْهِمْ آيَاتُنَا بَيِّنَاتٍ مَّا كَانَ حُجَّتَهُمْ إِلَّا أَن قَالُوا ائْتُوا بِآبَائِنَا إِن كُنتُمْ صَادِقِينَ",
    "قُلِ اللَّهُ يُحْيِيكُمْ ثُمَّ يُمِيتُكُمْ ثُمَّ يَجْمَعُكُمْ إِلَىٰ يَوْمِ الْقِيَامَةِ لَا رَيْبَ فِيهِ وَلَٰكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ",
    "وَلِلَّهِ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ ۚ وَيَوْمَ تَقُومُ السَّاعَةُ يَوْمَئِذٍ يَخْسَرُ الْمُبْطِلُونَ",
    "وَتَرَىٰ كُلَّ أُمَّةٍ جَاثِيَةً ۚ كُلُّ أُمَّةٍ تُدْعَىٰ إِلَىٰ كِتَابِهَا الْيَوْمَ تُجْزَوْنَ مَا كُنتُمْ تَعْمَلُونَ",
    "هَٰذَا كِتَابُنَا يَنطِقُ عَلَيْكُم بِالْحَقِّ ۚ إِنَّا كُنَّا نَسْتَنسِخُ مَا كُنتُمْ تَعْمَلُونَ",
    "فَأَمَّا الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ فَيُدْخِلُهُمْ رَبُّهُمْ فِي رَحْمَتِهِ ۚ ذَٰلِكَ هُوَ الْفَوْزُ الْمُبِينُ",
    "وَأَمَّا الَّذِينَ كَفَرُوا أَفَلَمْ تَكُنْ آيَاتِي تُتْلَىٰ عَلَيْكُمْ فَاسْتَكْبَرْتُمْ وَكُنتُمْ قَوْمًا مُّجْرِمِينَ",
    "وَإِذَا قِيلَ إِنَّ وَعْدَ اللَّهِ حَقٌّ وَالسَّاعَةُ لَا رَيْبَ فِيهَا قُلْتُم مَّا نَدْرِي مَا السَّاعَةُ إِن نَّظُنُّ إِلَّا ظَنًّا وَمَا نَحْنُ بِمُسْتَيْقِنِينَ",
    "وَبَدَا لَهُمْ سَيِّئَاتُ مَا عَمِلُوا وَحَاقَ بِهِم مَّا كَانُوا بِهِ يَسْتَهْزِئُونَ",
    "وَقِيلَ الْيَوْمَ نَنسَاكُمْ كَمَا نَسِيتُمْ لِقَاءَ يَوْمِكُمْ هَٰذَا وَمَأْوَاكُمُ النَّارُ وَمَا لَكُم مِّن نَّاصِرِينَ",
    "ذَٰلِكُم بِأَنَّكُمُ اتَّخَذْتُمْ آيَاتِ اللَّهِ هُزُوًا وَغَرَّتْكُمُ الْحَيَاةُ الدُّنْيَا ۚ فَالْيَوْمَ لَا يُخْرَجُونَ مِنْهَا وَلَا هُمْ يُسْتَعْتَبُونَ",
    "فَلِلَّهِ الْحَمْدُ رَبِّ السَّمَاوَاتِ وَرَبِّ الْأَرْضِ رَبِّ الْعَالَمِينَ",
    "وَلَهُ الْكِبْرِيَاءُ فِي السَّمَاوَاتِ وَالْأَرْضِ ۖ وَهُوَ الْعَزِيزُ الْحَكِيمُ",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", ""};

    String [] english_verses = {"Ha, Meem.",
    "The revelation of the Book is from Allah, the Exalted in Might, the Wise.",
    "Indeed, within the heavens and earth are signs for the believers.",
    "And in the creation of yourselves and what He disperses of moving creatures are signs for people who are certain [in faith].",
    "And [in] the alternation of night and day and [in] what Allah sends down from the sky of provision and gives life thereby to the earth after its lifelessness and [in His] directing of the winds are signs for a people who reason.",
    "These are the verses of Allah which We recite to you in truth. Then in what statement after Allah and His verses will they believe?",
    "Woe to every sinful liar",
    "Who hears the verses of Allah recited to him, then persists arrogantly as if he had not heard them. So give him tidings of a painful punishment.",
    "And when he knows anything of Our verses, he takes them in ridicule. Those will have a humiliating punishment.",
    "Before them is Hell, and what they had earned will not avail them at all nor what they had taken besides Allah as allies. And they will have a great punishment.",
    "This [Qur'an] is guidance. And those who have disbelieved in the verses of their Lord will have a painful punishment of foul nature.",
    "It is Allah who subjected to you the sea so that ships may sail upon it by His command and that you may seek of His bounty; and perhaps you will be grateful.",
    "And He has subjected to you whatever is in the heavens and whatever is on the earth - all from Him. Indeed in that are signs for a people who give thought.",
    "Say, [O Muhammad], to those who have believed that they [should] forgive those who expect not the days of Allah so that He may recompense a people for what they used to earn.",
    "Whoever does a good deed - it is for himself; and whoever does evil - it is against the self. Then to your Lord you will be returned.",
    "And We did certainly give the Children of Israel the Scripture and judgement and prophethood, and We provided them with good things and preferred them over the worlds.",
    "And We gave them clear proofs of the matter [of religion]. And they did not differ except after knowledge had come to them - out of jealous animosity between themselves. Indeed, your Lord will judge between them on the Day of Resurrection concerning that over which they used to differ.",
    "Then We put you, [O Muhammad], on an ordained way concerning the matter [of religion]; so follow it and do not follow the inclinations of those who do not know.",
    "Indeed, they will never avail you against Allah at all. And indeed, the wrongdoers are allies of one another; but Allah is the protector of the righteous.",
    "This [Qur'an] is enlightenment for mankind and guidance and mercy for a people who are certain [in faith].",
    "Or do those who commit evils think We will make them like those who have believed and done righteous deeds - [make them] equal in their life and their death? Evil is that which they judge.",
    "And Allah created the heavens and earth in truth and so that every soul may be recompensed for what it has earned, and they will not be wronged.",
    "Have you seen he who has taken as his god his [own] desire, and Allah has sent him astray due to knowledge and has set a seal upon his hearing and his heart and put over his vision a veil? So who will guide him after Allah? Then will you not be reminded?",
    "And they say, \"There is not but our worldly life; we die and live, and nothing destroys us except time.\" And they have of that no knowledge; they are only assuming.",
    "And when Our verses are recited to them as clear evidences, their argument is only that they say, \"Bring [back] our forefathers, if you should be truthful.\"",
    "Say, \"Allah causes you to live, then causes you to die; then He will assemble you for the Day of Resurrection, about which there is no doubt, but most of the people do not know.\"",
    "And to Allah belongs the dominion of the heavens and the earth. And the Day the Hour appears - that Day the falsifiers will lose.",
    "And you will see every nation kneeling [from fear]. Every nation will be called to its record [and told], \"Today you will be recompensed for what you used to do.",
    "This, Our record, speaks about you in truth. Indeed, We were having transcribed whatever you used to do.\"",
    "So as for those who believed and did righteous deeds, their Lord will admit them into His mercy. That is what is the clear attainment.",
    "But as for those who disbelieved, [it will be said], \"Were not Our verses recited to you, but you were arrogant and became a people of criminals?",
    "And when it was said, 'Indeed, the promise of Allah is truth and the Hour [is coming] - no doubt about it,' you said, 'We know not what is the Hour. We assume only assumption, and we are not convinced.' \"",
    "And the evil consequences of what they did will appear to them, and they will be enveloped by what they used to ridicule.",
    "And it will be said, \"Today We will forget you as you forgot the meeting of this Day of yours, and your refuge is the Fire, and for you there are no helpers.",
    "That is because you took the verses of Allah in ridicule, and worldly life deluded you.\" So that Day they will not be removed from it, nor will they be asked to appease [Allah].",
    "Then, to Allah belongs [all] praise - Lord of the heavens and Lord of the earth, Lord of the worlds.",
    "And to Him belongs [all] grandeur within the heavens and the earth, and He is the Exalted in Might, the Wise.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__jathiyah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_jathiyah);
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
