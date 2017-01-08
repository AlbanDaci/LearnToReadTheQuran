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

public class Al_Hadid extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"57:1", "57:2", "57:3", "57:4", "57:5", "57:6", "57:7", "57:8", "57:9", "57:10", "57:11", "57:12", "57:13", "57:14", "57:15", "57:16",
            "57:17", "57:18", "57:19", "57:20", "57:21", "57:22", "57:23", "57:24", "57:25", "57:26", "57:27", "57:28", "57:29"};

    String [] arabic_verses = {"سَبَّحَ لِلَّهِ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ ۖ وَهُوَ الْعَزِيزُ الْحَكِيمُ",
    "لَهُ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ ۖ يُحْيِي وَيُمِيتُ ۖ وَهُوَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "هُوَ الْأَوَّلُ وَالْآخِرُ وَالظَّاهِرُ وَالْبَاطِنُ ۖ وَهُوَ بِكُلِّ شَيْءٍ عَلِيمٌ",
    "هُوَ الَّذِي خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ فِي سِتَّةِ أَيَّامٍ ثُمَّ اسْتَوَىٰ عَلَى الْعَرْشِ ۚ يَعْلَمُ مَا يَلِجُ فِي الْأَرْضِ وَمَا يَخْرُجُ مِنْهَا وَمَا يَنزِلُ مِنَ السَّمَاءِ وَمَا يَعْرُجُ فِيهَا ۖ وَهُوَ مَعَكُمْ أَيْنَ مَا كُنتُمْ ۚ وَاللَّهُ بِمَا تَعْمَلُونَ بَصِيرٌ",
    "لَّهُ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ ۚ وَإِلَى اللَّهِ تُرْجَعُ الْأُمُورُ",
    "يُولِجُ اللَّيْلَ فِي النَّهَارِ وَيُولِجُ النَّهَارَ فِي اللَّيْلِ ۚ وَهُوَ عَلِيمٌ بِذَاتِ الصُّدُورِ",
    "آمِنُوا بِاللَّهِ وَرَسُولِهِ وَأَنفِقُوا مِمَّا جَعَلَكُم مُّسْتَخْلَفِينَ فِيهِ ۖ فَالَّذِينَ آمَنُوا مِنكُمْ وَأَنفَقُوا لَهُمْ أَجْرٌ كَبِيرٌ",
    "وَمَا لَكُمْ لَا تُؤْمِنُونَ بِاللَّهِ ۙ وَالرَّسُولُ يَدْعُوكُمْ لِتُؤْمِنُوا بِرَبِّكُمْ وَقَدْ أَخَذَ مِيثَاقَكُمْ إِن كُنتُم مُّؤْمِنِينَ",
    "هُوَ الَّذِي يُنَزِّلُ عَلَىٰ عَبْدِهِ آيَاتٍ بَيِّنَاتٍ لِّيُخْرِجَكُم مِّنَ الظُّلُمَاتِ إِلَى النُّورِ ۚ وَإِنَّ اللَّهَ بِكُمْ لَرَءُوفٌ رَّحِيمٌ",
    "وَمَا لَكُمْ أَلَّا تُنفِقُوا فِي سَبِيلِ اللَّهِ وَلِلَّهِ مِيرَاثُ السَّمَاوَاتِ وَالْأَرْضِ ۚ لَا يَسْتَوِي مِنكُم مَّنْ أَنفَقَ مِن قَبْلِ الْفَتْحِ وَقَاتَلَ ۚ أُولَٰئِكَ أَعْظَمُ دَرَجَةً مِّنَ الَّذِينَ أَنفَقُوا مِن بَعْدُ وَقَاتَلُوا ۚ وَكُلًّا وَعَدَ اللَّهُ الْحُسْنَىٰ ۚ وَاللَّهُ بِمَا تَعْمَلُونَ خَبِيرٌ",
    "مَّن ذَا الَّذِي يُقْرِضُ اللَّهَ قَرْضًا حَسَنًا فَيُضَاعِفَهُ لَهُ وَلَهُ أَجْرٌ كَرِيمٌ",
    "يَوْمَ تَرَى الْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ يَسْعَىٰ نُورُهُم بَيْنَ أَيْدِيهِمْ وَبِأَيْمَانِهِم بُشْرَاكُمُ الْيَوْمَ جَنَّاتٌ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا ۚ ذَٰلِكَ هُوَ الْفَوْزُ الْعَظِيمُ",
    "يَوْمَ يَقُولُ الْمُنَافِقُونَ وَالْمُنَافِقَاتُ لِلَّذِينَ آمَنُوا انظُرُونَا نَقْتَبِسْ مِن نُّورِكُمْ قِيلَ ارْجِعُوا وَرَاءَكُمْ فَالْتَمِسُوا نُورًا فَضُرِبَ بَيْنَهُم بِسُورٍ لَّهُ بَابٌ بَاطِنُهُ فِيهِ الرَّحْمَةُ وَظَاهِرُهُ مِن قِبَلِهِ الْعَذَابُ",
    "يُنَادُونَهُمْ أَلَمْ نَكُن مَّعَكُمْ ۖ قَالُوا بَلَىٰ وَلَٰكِنَّكُمْ فَتَنتُمْ أَنفُسَكُمْ وَتَرَبَّصْتُمْ وَارْتَبْتُمْ وَغَرَّتْكُمُ الْأَمَانِيُّ حَتَّىٰ جَاءَ أَمْرُ اللَّهِ وَغَرَّكُم بِاللَّهِ الْغَرُورُ",
    "فَالْيَوْمَ لَا يُؤْخَذُ مِنكُمْ فِدْيَةٌ وَلَا مِنَ الَّذِينَ كَفَرُوا ۚ مَأْوَاكُمُ النَّارُ ۖ هِيَ مَوْلَاكُمْ ۖ وَبِئْسَ الْمَصِيرُ",
    "أَلَمْ يَأْنِ لِلَّذِينَ آمَنُوا أَن تَخْشَعَ قُلُوبُهُمْ لِذِكْرِ اللَّهِ وَمَا نَزَلَ مِنَ الْحَقِّ وَلَا يَكُونُوا كَالَّذِينَ أُوتُوا الْكِتَابَ مِن قَبْلُ فَطَالَ عَلَيْهِمُ الْأَمَدُ فَقَسَتْ قُلُوبُهُمْ ۖ وَكَثِيرٌ مِّنْهُمْ فَاسِقُونَ",
    "اعْلَمُوا أَنَّ اللَّهَ يُحْيِي الْأَرْضَ بَعْدَ مَوْتِهَا ۚ قَدْ بَيَّنَّا لَكُمُ الْآيَاتِ لَعَلَّكُمْ تَعْقِلُونَ",
    "إِنَّ الْمُصَّدِّقِينَ وَالْمُصَّدِّقَاتِ وَأَقْرَضُوا اللَّهَ قَرْضًا حَسَنًا يُضَاعَفُ لَهُمْ وَلَهُمْ أَجْرٌ كَرِيمٌ",
    "وَالَّذِينَ آمَنُوا بِاللَّهِ وَرُسُلِهِ أُولَٰئِكَ هُمُ الصِّدِّيقُونَ ۖ وَالشُّهَدَاءُ عِندَ رَبِّهِمْ لَهُمْ أَجْرُهُمْ وَنُورُهُمْ ۖ وَالَّذِينَ كَفَرُوا وَكَذَّبُوا بِآيَاتِنَا أُولَٰئِكَ أَصْحَابُ الْجَحِيمِ",
    "اعْلَمُوا أَنَّمَا الْحَيَاةُ الدُّنْيَا لَعِبٌ وَلَهْوٌ وَزِينَةٌ وَتَفَاخُرٌ بَيْنَكُمْ وَتَكَاثُرٌ فِي الْأَمْوَالِ وَالْأَوْلَادِ ۖ كَمَثَلِ غَيْثٍ أَعْجَبَ الْكُفَّارَ نَبَاتُهُ ثُمَّ يَهِيجُ فَتَرَاهُ مُصْفَرًّا ثُمَّ يَكُونُ حُطَامًا ۖ وَفِي الْآخِرَةِ عَذَابٌ شَدِيدٌ وَمَغْفِرَةٌ مِّنَ اللَّهِ وَرِضْوَانٌ ۚ وَمَا الْحَيَاةُ الدُّنْيَا إِلَّا مَتَاعُ الْغُرُورِ",
    "سَابِقُوا إِلَىٰ مَغْفِرَةٍ مِّن رَّبِّكُمْ وَجَنَّةٍ عَرْضُهَا كَعَرْضِ السَّمَاءِ وَالْأَرْضِ أُعِدَّتْ لِلَّذِينَ آمَنُوا بِاللَّهِ وَرُسُلِهِ ۚ ذَٰلِكَ فَضْلُ اللَّهِ يُؤْتِيهِ مَن يَشَاءُ ۚ وَاللَّهُ ذُو الْفَضْلِ الْعَظِيمِ",
    "مَا أَصَابَ مِن مُّصِيبَةٍ فِي الْأَرْضِ وَلَا فِي أَنفُسِكُمْ إِلَّا فِي كِتَابٍ مِّن قَبْلِ أَن نَّبْرَأَهَا ۚ إِنَّ ذَٰلِكَ عَلَى اللَّهِ يَسِيرٌ",
    "لِّكَيْلَا تَأْسَوْا عَلَىٰ مَا فَاتَكُمْ وَلَا تَفْرَحُوا بِمَا آتَاكُمْ ۗ وَاللَّهُ لَا يُحِبُّ كُلَّ مُخْتَالٍ فَخُورٍ",
    "الَّذِينَ يَبْخَلُونَ وَيَأْمُرُونَ النَّاسَ بِالْبُخْلِ ۗ وَمَن يَتَوَلَّ فَإِنَّ اللَّهَ هُوَ الْغَنِيُّ الْحَمِيدُ",
    "لَقَدْ أَرْسَلْنَا رُسُلَنَا بِالْبَيِّنَاتِ وَأَنزَلْنَا مَعَهُمُ الْكِتَابَ وَالْمِيزَانَ لِيَقُومَ النَّاسُ بِالْقِسْطِ ۖ وَأَنزَلْنَا الْحَدِيدَ فِيهِ بَأْسٌ شَدِيدٌ وَمَنَافِعُ لِلنَّاسِ وَلِيَعْلَمَ اللَّهُ مَن يَنصُرُهُ وَرُسُلَهُ بِالْغَيْبِ ۚ إِنَّ اللَّهَ قَوِيٌّ عَزِيزٌ",
    "وَلَقَدْ أَرْسَلْنَا نُوحًا وَإِبْرَاهِيمَ وَجَعَلْنَا فِي ذُرِّيَّتِهِمَا النُّبُوَّةَ وَالْكِتَابَ ۖ فَمِنْهُم مُّهْتَدٍ ۖ وَكَثِيرٌ مِّنْهُمْ فَاسِقُونَ",
    "ثُمَّ قَفَّيْنَا عَلَىٰ آثَارِهِم بِرُسُلِنَا وَقَفَّيْنَا بِعِيسَى ابْنِ مَرْيَمَ وَآتَيْنَاهُ الْإِنجِيلَ وَجَعَلْنَا فِي قُلُوبِ الَّذِينَ اتَّبَعُوهُ رَأْفَةً وَرَحْمَةً وَرَهْبَانِيَّةً ابْتَدَعُوهَا مَا كَتَبْنَاهَا عَلَيْهِمْ إِلَّا ابْتِغَاءَ رِضْوَانِ اللَّهِ فَمَا رَعَوْهَا حَقَّ رِعَايَتِهَا ۖ فَآتَيْنَا الَّذِينَ آمَنُوا مِنْهُمْ أَجْرَهُمْ ۖ وَكَثِيرٌ مِّنْهُمْ فَاسِقُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا اتَّقُوا اللَّهَ وَآمِنُوا بِرَسُولِهِ يُؤْتِكُمْ كِفْلَيْنِ مِن رَّحْمَتِهِ وَيَجْعَل لَّكُمْ نُورًا تَمْشُونَ بِهِ وَيَغْفِرْ لَكُمْ ۚ وَاللَّهُ غَفُورٌ رَّحِيمٌ",
    "لِّئَلَّا يَعْلَمَ أَهْلُ الْكِتَابِ أَلَّا يَقْدِرُونَ عَلَىٰ شَيْءٍ مِّن فَضْلِ اللَّهِ ۙ وَأَنَّ الْفَضْلَ بِيَدِ اللَّهِ يُؤْتِيهِ مَن يَشَاءُ ۚ وَاللَّهُ ذُو الْفَضْلِ الْعَظِيمِ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"Whatever is in the heavens and earth exalts Allah, and He is the Exalted in Might, the Wise.",
    "His is the dominion of the heavens and earth. He gives life and causes death, and He is over all things competent.",
    "He is the First and the Last, the Ascendant and the Intimate, and He is, of all things, Knowing.",
    "It is He who created the heavens and earth in six days and then established Himself above the Throne. He knows what penetrates into the earth and what emerges from it and what descends from the heaven and what ascends therein; and He is with you wherever you are. And Allah, of what you do, is Seeing.",
    "His is the dominion of the heavens and earth. And to Allah are returned [all] matters.",
    "He causes the night to enter the day and causes the day to enter the night, and he is Knowing of that within the breasts.",
    "Believe in Allah and His Messenger and spend out of that in which He has made you successors. For those who have believed among you and spent, there will be a great reward.",
    "And why do you not believe in Allah while the Messenger invites you to believe in your Lord and He has taken your covenant, if you should [truly] be believers?",
    "It is He who sends down upon His Servant [Muhammad] verses of clear evidence that He may bring you out from darknesses into the light. And indeed, Allah is to you Kind and Merciful.",
    "And why do you not spend in the cause of Allah while to Allah belongs the heritage of the heavens and the earth? Not equal among you are those who spent before the conquest [of Makkah] and fought [and those who did so after it]. Those are greater in degree than they who spent afterwards and fought. But to all Allah has promised the best [reward]. And Allah, with what you do, is Acquainted.",
    "Who is it that would loan Allah a goodly loan so He will multiply it for him and he will have a noble reward?",
    "On the Day you see the believing men and believing women, their light proceeding before them and on their right, [it will be said], \"Your good tidings today are [of] gardens beneath which rivers flow, wherein you will abide eternally.\" That is what is the great attainment.",
    "On the [same] Day the hypocrite men and hypocrite women will say to those who believed, \"Wait for us that we may acquire some of your light.\" It will be said, \"Go back behind you and seek light.\" And a wall will be placed between them with a door, its interior containing mercy, but on the outside of it is torment.",
    "The hypocrites will call to the believers, \"Were we not with you?\" They will say, \"Yes, but you afflicted yourselves and awaited [misfortune for us] and doubted, and wishful thinking deluded you until there came the command of Allah. And the Deceiver deceived you concerning Allah.",
    "So today no ransom will be taken from you or from those who disbelieved. Your refuge is the Fire. It is most worthy of you, and wretched is the destination.",
    "Has the time not come for those who have believed that their hearts should become humbly submissive at the remembrance of Allah and what has come down of the truth? And let them not be like those who were given the Scripture before, and a long period passed over them, so their hearts hardened; and many of them are defiantly disobedient.",
    "Know that Allah gives life to the earth after its lifelessness. We have made clear to you the signs; perhaps you will understand.",
    "Indeed, the men who practice charity and the women who practice charity and [they who] have loaned Allah a goodly loan - it will be multiplied for them, and they will have a noble reward.",
    "And those who have believed in Allah and His messengers - those are [in the ranks of] the supporters of truth and the martyrs, with their Lord. For them is their reward and their light. But those who have disbelieved and denied Our verses - those are the companions of Hellfire.",
    "Know that the life of this world is but amusement and diversion and adornment and boasting to one another and competition in increase of wealth and children - like the example of a rain whose [resulting] plant growth pleases the tillers; then it dries and you see it turned yellow; then it becomes [scattered] debris. And in the Hereafter is severe punishment and forgiveness from Allah and approval. And what is the worldly life except the enjoyment of delusion.",
    "Race toward forgiveness from your Lord and a Garden whose width is like the width of the heavens and earth, prepared for those who believed in Allah and His messengers. That is the bounty of Allah which He gives to whom He wills, and Allah is the possessor of great bounty.",
    "No disaster strikes upon the earth or among yourselves except that it is in a register before We bring it into being - indeed that, for Allah, is easy -",
    "In order that you not despair over what has eluded you and not exult [in pride] over what He has given you. And Allah does not like everyone self-deluded and boastful -",
    "[Those] who are stingy and enjoin upon people stinginess. And whoever turns away - then indeed, Allah is the Free of need, the Praiseworthy.",
    "We have already sent Our messengers with clear evidences and sent down with them the Scripture and the balance that the people may maintain [their affairs] in justice. And We sent down iron, wherein is great military might and benefits for the people, and so that Allah may make evident those who support Him and His messengers unseen. Indeed, Allah is Powerful and Exalted in Might.",
    "And We have already sent Noah and Abraham and placed in their descendants prophethood and scripture; and among them is he who is guided, but many of them are defiantly disobedient.",
    "Then We sent following their footsteps Our messengers and followed [them] with Jesus, the son of Mary, and gave him the Gospel. And We placed in the hearts of those who followed him compassion and mercy and monasticism, which they innovated; We did not prescribe it for them except [that they did so] seeking the approval of Allah. But they did not observe it with due observance. So We gave the ones who believed among them their reward, but many of them are defiantly disobedient.",
    "O you who have believed, fear Allah and believe in His Messenger; He will [then] give you a double portion of His mercy and make for you a light by which you will walk and forgive you; and Allah is Forgiving and Merciful.",
    "[This is] so that the People of the Scripture may know that they are not able [to obtain] anything from the bounty of Allah and that [all] bounty is in the hand of Allah; He gives it to whom He wills. And Allah is the possessor of great bounty."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__hadid);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_hadid);
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
