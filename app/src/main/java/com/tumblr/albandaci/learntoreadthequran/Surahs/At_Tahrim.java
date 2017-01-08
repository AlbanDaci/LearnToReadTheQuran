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

public class At_Tahrim extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"66:1", "66:2", "66:3", "66:4", "66:5", "66:6", "66:7", "66:8", "66:9", "66:10", "66:11", "66:12"};

    String [] arabic_verses = {"يَا أَيُّهَا النَّبِيُّ لِمَ تُحَرِّمُ مَا أَحَلَّ اللَّهُ لَكَ ۖ تَبْتَغِي مَرْضَاتَ أَزْوَاجِكَ ۚ وَاللَّهُ غَفُورٌ رَّحِيمٌ",
    "قَدْ فَرَضَ اللَّهُ لَكُمْ تَحِلَّةَ أَيْمَانِكُمْ ۚ وَاللَّهُ مَوْلَاكُمْ ۖ وَهُوَ الْعَلِيمُ الْحَكِيمُ",
    "وَإِذْ أَسَرَّ النَّبِيُّ إِلَىٰ بَعْضِ أَزْوَاجِهِ حَدِيثًا فَلَمَّا نَبَّأَتْ بِهِ وَأَظْهَرَهُ اللَّهُ عَلَيْهِ عَرَّفَ بَعْضَهُ وَأَعْرَضَ عَن بَعْضٍ ۖ فَلَمَّا نَبَّأَهَا بِهِ قَالَتْ مَنْ أَنبَأَكَ هَٰذَا ۖ قَالَ نَبَّأَنِيَ الْعَلِيمُ الْخَبِيرُ",
    "إِن تَتُوبَا إِلَى اللَّهِ فَقَدْ صَغَتْ قُلُوبُكُمَا ۖ وَإِن تَظَاهَرَا عَلَيْهِ فَإِنَّ اللَّهَ هُوَ مَوْلَاهُ وَجِبْرِيلُ وَصَالِحُ الْمُؤْمِنِينَ ۖ وَالْمَلَائِكَةُ بَعْدَ ذَٰلِكَ ظَهِيرٌ",
    "عَسَىٰ رَبُّهُ إِن طَلَّقَكُنَّ أَن يُبْدِلَهُ أَزْوَاجًا خَيْرًا مِّنكُنَّ مُسْلِمَاتٍ مُّؤْمِنَاتٍ قَانِتَاتٍ تَائِبَاتٍ عَابِدَاتٍ سَائِحَاتٍ ثَيِّبَاتٍ وَأَبْكَارًا",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا قُوا أَنفُسَكُمْ وَأَهْلِيكُمْ نَارًا وَقُودُهَا النَّاسُ وَالْحِجَارَةُ عَلَيْهَا مَلَائِكَةٌ غِلَاظٌ شِدَادٌ لَّا يَعْصُونَ اللَّهَ مَا أَمَرَهُمْ وَيَفْعَلُونَ مَا يُؤْمَرُونَ",
    "يَا أَيُّهَا الَّذِينَ كَفَرُوا لَا تَعْتَذِرُوا الْيَوْمَ ۖ إِنَّمَا تُجْزَوْنَ مَا كُنتُمْ تَعْمَلُونَ",
    "يَا أَيُّهَا الَّذِينَ آمَنُوا تُوبُوا إِلَى اللَّهِ تَوْبَةً نَّصُوحًا عَسَىٰ رَبُّكُمْ أَن يُكَفِّرَ عَنكُمْ سَيِّئَاتِكُمْ وَيُدْخِلَكُمْ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ يَوْمَ لَا يُخْزِي اللَّهُ النَّبِيَّ وَالَّذِينَ آمَنُوا مَعَهُ ۖ نُورُهُمْ يَسْعَىٰ بَيْنَ أَيْدِيهِمْ وَبِأَيْمَانِهِمْ يَقُولُونَ رَبَّنَا أَتْمِمْ لَنَا نُورَنَا وَاغْفِرْ لَنَا ۖ إِنَّكَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ",
    "يَا أَيُّهَا النَّبِيُّ جَاهِدِ الْكُفَّارَ وَالْمُنَافِقِينَ وَاغْلُظْ عَلَيْهِمْ ۚ وَمَأْوَاهُمْ جَهَنَّمُ ۖ وَبِئْسَ الْمَصِيرُ",
    "ضَرَبَ اللَّهُ مَثَلًا لِّلَّذِينَ كَفَرُوا امْرَأَتَ نُوحٍ وَامْرَأَتَ لُوطٍ ۖ كَانَتَا تَحْتَ عَبْدَيْنِ مِنْ عِبَادِنَا صَالِحَيْنِ فَخَانَتَاهُمَا فَلَمْ يُغْنِيَا عَنْهُمَا مِنَ اللَّهِ شَيْئًا وَقِيلَ ادْخُلَا النَّارَ مَعَ الدَّاخِلِينَ",
    "وَضَرَبَ اللَّهُ مَثَلًا لِّلَّذِينَ آمَنُوا امْرَأَتَ فِرْعَوْنَ إِذْ قَالَتْ رَبِّ ابْنِ لِي عِندَكَ بَيْتًا فِي الْجَنَّةِ وَنَجِّنِي مِن فِرْعَوْنَ وَعَمَلِهِ وَنَجِّنِي مِنَ الْقَوْمِ الظَّالِمِينَ",
    "وَمَرْيَمَ ابْنَتَ عِمْرَانَ الَّتِي أَحْصَنَتْ فَرْجَهَا فَنَفَخْنَا فِيهِ مِن رُّوحِنَا وَصَدَّقَتْ بِكَلِمَاتِ رَبِّهَا وَكُتُبِهِ وَكَانَتْ مِنَ الْقَانِتِينَ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International"};

    String [] english_verses = {"O Prophet, why do you prohibit [yourself from] what Allah has made lawful for you, seeking the approval of your wives? And Allah is Forgiving and Merciful.",
    "Allah has already ordained for you [Muslims] the dissolution of your oaths. And Allah is your protector, and He is the Knowing, the Wise.",
    "And [remember] when the Prophet confided to one of his wives a statement; and when she informed [another] of it and Allah showed it to him, he made known part of it and ignored a part. And when he informed her about it, she said, \"Who told you this?\" He said, \"I was informed by the Knowing, the Acquainted.\"",
    "If you two [wives] repent to Allah, [it is best], for your hearts have deviated. But if you cooperate against him - then indeed Allah is his protector, and Gabriel and the righteous of the believers and the angels, moreover, are [his] assistants.",
    "Perhaps his Lord, if he divorced you [all], would substitute for him wives better than you - submitting [to Allah], believing, devoutly obedient, repentant, worshipping, and traveling - [ones] previously married and virgins.",
    "O you who have believed, protect yourselves and your families from a Fire whose fuel is people and stones, over which are [appointed] angels, harsh and severe; they do not disobey Allah in what He commands them but do what they are commanded.",
    "O you who have disbelieved, make no excuses that Day. You will only be recompensed for what you used to do.",
    "O you who have believed, repent to Allah with sincere repentance. Perhaps your Lord will remove from you your misdeeds and admit you into gardens beneath which rivers flow [on] the Day when Allah will not disgrace the Prophet and those who believed with him. Their light will proceed before them and on their right; they will say, \"Our Lord, perfect for us our light and forgive us. Indeed, You are over all things competent.\"",
    "O Prophet, strive against the disbelievers and the hypocrites and be harsh upon them. And their refuge is Hell, and wretched is the destination.",
    "Allah presents an example of those who disbelieved: the wife of Noah and the wife of Lot. They were under two of Our righteous servants but betrayed them, so those prophets did not avail them from Allah at all, and it was said, \"Enter the Fire with those who enter.\"",
    "And Allah presents an example of those who believed: the wife of Pharaoh, when she said, \"My Lord, build for me near You a house in Paradise and save me from Pharaoh and his deeds and save me from the wrongdoing people.\"",
    "And [the example of] Mary, the daughter of 'Imran, who guarded her chastity, so We blew into [her garment] through Our angel, and she believed in the words of her Lord and His scriptures and was of the devoutly obedient."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at__tahrim);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_at_tahrim);
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
