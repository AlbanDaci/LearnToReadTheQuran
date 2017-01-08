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

public class Al_Mumtahanah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"60:1", "60:2", "60:3", "60:4", "60:5", "60:6", "60:7", "60:8", "60:9", "60:10", "60:11", "60:12", "60:13"};

    String [] arabic_verses = {"يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تَتَّخِذُوا عَدُوِّي وَعَدُوَّكُمْ أَوْلِيَاءَ تُلْقُونَ إِلَيْهِم بِالْمَوَدَّةِ وَقَدْ كَفَرُوا بِمَا جَاءَكُم مِّنَ الْحَقِّ يُخْرِجُونَ الرَّسُولَ وَإِيَّاكُمْ ۙ أَن تُؤْمِنُوا بِاللَّهِ رَبِّكُمْ إِن كُنتُمْ خَرَجْتُمْ جِهَادًا فِي سَبِيلِي وَابْتِغَاءَ مَرْضَاتِي ۚ تُسِرُّونَ إِلَيْهِم بِالْمَوَدَّةِ وَأَنَا أَعْلَمُ بِمَا أَخْفَيْتُمْ وَمَا أَعْلَنتُمْ ۚ وَمَن يَفْعَلْهُ مِنكُمْ فَقَدْ ضَلَّ سَوَاءَ السَّبِيلِ",
    "إِن يَثْقَفُوكُمْ يَكُونُوا لَكُمْ أَعْدَاءً وَيَبْسُطُوا إِلَيْكُمْ أَيْدِيَهُمْ وَأَلْسِنَتَهُم بِالسُّوءِ وَوَدُّوا لَوْ تَكْفُرُونَ",
    "لَن تَنفَعَكُمْ أَرْحَامُكُمْ وَلَا أَوْلَادُكُمْ ۚ يَوْمَ الْقِيَامَةِ يَفْصِلُ بَيْنَكُمْ ۚ وَاللَّهُ بِمَا تَعْمَلُونَ بَصِيرٌ",
    "قَدْ كَانَتْ لَكُمْ أُسْوَةٌ حَسَنَةٌ فِي إِبْرَاهِيمَ وَالَّذِينَ مَعَهُ إِذْ قَالُوا لِقَوْمِهِمْ إِنَّا بُرَآءُ مِنكُمْ وَمِمَّا تَعْبُدُونَ مِن دُونِ اللَّهِ كَفَرْنَا بِكُمْ وَبَدَا بَيْنَنَا وَبَيْنَكُمُ الْعَدَاوَةُ وَالْبَغْضَاءُ أَبَدًا حَتَّىٰ تُؤْمِنُوا بِاللَّهِ وَحْدَهُ إِلَّا قَوْلَ إِبْرَاهِيمَ لِأَبِيهِ لَأَسْتَغْفِرَنَّ لَكَ وَمَا أَمْلِكُ لَكَ مِنَ اللَّهِ مِن شَيْءٍ ۖ رَّبَّنَا عَلَيْكَ تَوَكَّلْنَا وَإِلَيْكَ أَنَبْنَا وَإِلَيْكَ الْمَصِيرُ",
    "رَبَّنَا لَا تَجْعَلْنَا فِتْنَةً لِّلَّذِينَ كَفَرُوا وَاغْفِرْ لَنَا رَبَّنَا ۖ إِنَّكَ أَنتَ الْعَزِيزُ الْحَكِيمُ",
    "لَقَدْ كَانَ لَكُمْ فِيهِمْ أُسْوَةٌ حَسَنَةٌ لِّمَن كَانَ يَرْجُو اللَّهَ وَالْيَوْمَ الْآخِرَ ۚ وَمَن يَتَوَلَّ فَإِنَّ اللَّهَ هُوَ الْغَنِيُّ الْحَمِيدُ",
    "عَسَى اللَّهُ أَن يَجْعَلَ بَيْنَكُمْ وَبَيْنَ الَّذِينَ عَادَيْتُم مِّنْهُم مَّوَدَّةً ۚ وَاللَّهُ قَدِيرٌ ۚ وَاللَّهُ غَفُورٌ رَّحِيمٌ",
    "لَّا يَنْهَاكُمُ اللَّهُ عَنِ الَّذِينَ لَمْ يُقَاتِلُوكُمْ فِي الدِّينِ وَلَمْ يُخْرِجُوكُم مِّن دِيَارِكُمْ أَن تَبَرُّوهُمْ وَتُقْسِطُوا إِلَيْهِمْ ۚ إِنَّ اللَّهَ يُحِبُّ الْمُقْسِطِينَ",
    "إِنَّمَا يَنْهَاكُمُ اللَّهُ عَنِ الَّذِينَ قَاتَلُوكُمْ فِي الدِّينِ وَأَخْرَجُوكُم مِّن دِيَارِكُمْ وَظَاهَرُوا عَلَىٰ إِخْرَاجِكُمْ أَن تَوَلَّوْهُمْ ۚ وَمَن يَتَوَلَّهُمْ فَأُولَٰئِكَ هُمُ الظَّالِمُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا إِذَا جَاءَكُمُ الْمُؤْمِنَاتُ مُهَاجِرَاتٍ فَامْتَحِنُوهُنَّ ۖ اللَّهُ أَعْلَمُ بِإِيمَانِهِنَّ ۖ فَإِنْ عَلِمْتُمُوهُنَّ مُؤْمِنَاتٍ فَلَا تَرْجِعُوهُنَّ إِلَى الْكُفَّارِ ۖ لَا هُنَّ حِلٌّ لَّهُمْ وَلَا هُمْ يَحِلُّونَ لَهُنَّ ۖ وَآتُوهُم مَّا أَنفَقُوا ۚ وَلَا جُنَاحَ عَلَيْكُمْ أَن تَنكِحُوهُنَّ إِذَا آتَيْتُمُوهُنَّ أُجُورَهُنَّ ۚ وَلَا تُمْسِكُوا بِعِصَمِ الْكَوَافِرِ وَاسْأَلُوا مَا أَنفَقْتُمْ وَلْيَسْأَلُوا مَا أَنفَقُوا ۚ ذَٰلِكُمْ حُكْمُ اللَّهِ ۖ يَحْكُمُ بَيْنَكُمْ ۚ وَاللَّهُ عَلِيمٌ حَكِيمٌ",
    "وَإِن فَاتَكُمْ شَيْءٌ مِّنْ أَزْوَاجِكُمْ إِلَى الْكُفَّارِ فَعَاقَبْتُمْ فَآتُوا الَّذِينَ ذَهَبَتْ أَزْوَاجُهُم مِّثْلَ مَا أَنفَقُوا ۚ وَاتَّقُوا اللَّهَ الَّذِي أَنتُم بِهِ مُؤْمِنُونَ",
    "يَا أَيُّهَا النَّبِيُّ إِذَا جَاءَكَ الْمُؤْمِنَاتُ يُبَايِعْنَكَ عَلَىٰ أَن لَّا يُشْرِكْنَ بِاللَّهِ شَيْئًا وَلَا يَسْرِقْنَ وَلَا يَزْنِينَ وَلَا يَقْتُلْنَ أَوْلَادَهُنَّ وَلَا يَأْتِينَ بِبُهْتَانٍ يَفْتَرِينَهُ بَيْنَ أَيْدِيهِنَّ وَأَرْجُلِهِنَّ وَلَا يَعْصِينَكَ فِي مَعْرُوفٍ ۙ فَبَايِعْهُنَّ وَاسْتَغْفِرْ لَهُنَّ اللَّهَ ۖ إِنَّ اللَّهَ غَفُورٌ رَّحِيمٌ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا لَا تَتَوَلَّوْا قَوْمًا غَضِبَ اللَّهُ عَلَيْهِمْ قَدْ يَئِسُوا مِنَ الْآخِرَةِ كَمَا يَئِسَ الْكُفَّارُ مِنْ أَصْحَابِ الْقُبُورِ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"O you who have believed, do not take My enemies and your enemies as allies, extending to them affection while they have disbelieved in what came to you of the truth, having driven out the Prophet and yourselves [only] because you believe in Allah, your Lord. If you have come out for jihad in My cause and seeking means to My approval, [take them not as friends]. You confide to them affection, but I am most knowing of what you have concealed and what you have declared. And whoever does it among you has certainly strayed from the soundness of the way.",
    "If they gain dominance over you, they would be to you as enemies and extend against you their hands and their tongues with evil, and they wish you would disbelieve.",
    "Never will your relatives or your children benefit you; the Day of Resurrection He will judge between you. And Allah, of what you do, is Seeing.",
    "There has already been for you an excellent pattern in Abraham and those with him, when they said to their people, \"Indeed, we are disassociated from you and from whatever you worship other than Allah. We have denied you, and there has appeared between us and you animosity and hatred forever until you believe in Allah alone\" except for the saying of Abraham to his father, \"I will surely ask forgiveness for you, but I have not [power to do] for you anything against Allah. Our Lord, upon You we have relied, and to You we have returned, and to You is the destination.",
    "Our Lord, make us not [objects of] torment for the disbelievers and forgive us, our Lord. Indeed, it is You who is the Exalted in Might, the Wise.\"",
    "There has certainly been for you in them an excellent pattern for anyone whose hope is in Allah and the Last Day. And whoever turns away - then indeed, Allah is the Free of need, the Praiseworthy.",
    "Perhaps Allah will put, between you and those to whom you have been enemies among them, affection. And Allah is competent, and Allah is Forgiving and Merciful.",
    "Allah does not forbid you from those who do not fight you because of religion and do not expel you from your homes - from being righteous toward them and acting justly toward them. Indeed, Allah loves those who act justly.",
    "Allah only forbids you from those who fight you because of religion and expel you from your homes and aid in your expulsion - [forbids] that you make allies of them. And whoever makes allies of them, then it is those who are the wrongdoers.",
    "O you who have believed, when the believing women come to you as emigrants, examine them. Allah is most knowing as to their faith. And if you know them to be believers, then do not return them to the disbelievers; they are not lawful [wives] for them, nor are they lawful [husbands] for them. But give the disbelievers what they have spent. And there is no blame upon you if you marry them when you have given them their due compensation. And hold not to marriage bonds with disbelieving women, but ask for what you have spent and let them ask for what they have spent. That is the judgement of Allah; He judges between you. And Allah is Knowing and Wise.",
    "And if you have lost any of your wives to the disbelievers and you subsequently obtain [something], then give those whose wives have gone the equivalent of what they had spent. And fear Allah, in whom you are believers.",
    "O Prophet, when the believing women come to you pledging to you that they will not associate anything with Allah, nor will they steal, nor will they commit unlawful sexual intercourse, nor will they kill their children, nor will they bring forth a slander they have invented between their arms and legs, nor will they disobey you in what is right - then accept their pledge and ask forgiveness for them of Allah. Indeed, Allah is Forgiving and Merciful.",
    "O you who have believed, do not make allies of a people with whom Allah has become angry. They have despaired of [reward in] the Hereafter just as the disbelievers have despaired of [meeting] the inhabitants of the graves."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__mumtahanah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_mumtahanah);
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
