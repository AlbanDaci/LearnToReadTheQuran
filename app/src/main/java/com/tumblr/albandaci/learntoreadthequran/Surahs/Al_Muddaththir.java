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

public class Al_Muddaththir extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"74:1", "74:2", "74:3", "74:4", "74:5", "74:6", "74:7", "74:8", "74:9", "74:10", "74:11", "74:12", "74:13", "74:14", "74:15", "74:16",
            "74:17", "74:18", "74:19", "74:20", "74:21", "74:22", "74:23", "74:24", "74:25", "74:26", "74:27", "74:28", "74:29", "74:30", "74:31", "74:32",
            "74:33", "74:34", "74:35", "74:36", "74:37", "74:38", "74:39", "74:40", "74:41", "74:42", "74:43", "74:44", "74:45", "74:46", "74:47", "74:48",
            "74:49", "74:50", "74:51", "74:52", "74:53", "74:54", "74:55", "74:56"};

    String [] arabic_verses = {"يَا أَيُّهَا الْمُدَّثِّرُ",
    "قُمْ فَأَنذِرْ",
    "وَرَبَّكَ فَكَبِّرْ",
    "وَثِيَابَكَ فَطَهِّرْ",
    "وَالرُّجْزَ فَاهْجُرْ",
    "وَلَا تَمْنُن تَسْتَكْثِرُ",
    "وَلِرَبِّكَ فَاصْبِرْ",
    "فَإِذَا نُقِرَ فِي النَّاقُورِ",
    "فَذَٰلِكَ يَوْمَئِذٍ يَوْمٌ عَسِيرٌ",
    "عَلَى الْكَافِرِينَ غَيْرُ يَسِيرٍ",
    "ذَرْنِي وَمَنْ خَلَقْتُ وَحِيدًا",
    "وَجَعَلْتُ لَهُ مَالًا مَّمْدُودًا",
    "وَبَنِينَ شُهُودًا",
    "وَمَهَّدتُّ لَهُ تَمْهِيدًا",
    "ثُمَّ يَطْمَعُ أَنْ أَزِيدَ",
    "كَلَّا ۖ إِنَّهُ كَانَ لِآيَاتِنَا عَنِيدًا",
    "سَأُرْهِقُهُ صَعُودًا",
    "إِنَّهُ فَكَّرَ وَقَدَّرَ",
    "فَقُتِلَ كَيْفَ قَدَّرَ",
    "ثُمَّ قُتِلَ كَيْفَ قَدَّرَ",
    "ثُمَّ نَظَرَ",
    "ثُمَّ عَبَسَ وَبَسَرَ",
    "ثُمَّ أَدْبَرَ وَاسْتَكْبَرَ",
    "فَقَالَ إِنْ هَٰذَا إِلَّا سِحْرٌ يُؤْثَرُ",
    "إِنْ هَٰذَا إِلَّا قَوْلُ الْبَشَرِ",
    "سَأُصْلِيهِ سَقَرَ",
    "وَمَا أَدْرَاكَ مَا سَقَرُ",
    "لَا تُبْقِي وَلَا تَذَرُ",
    "لَوَّاحَةٌ لِّلْبَشَرِ",
    "عَلَيْهَا تِسْعَةَ عَشَرَ",
    "وَمَا جَعَلْنَا أَصْحَابَ النَّارِ إِلَّا مَلَائِكَةً ۙ وَمَا جَعَلْنَا عِدَّتَهُمْ إِلَّا فِتْنَةً لِّلَّذِينَ كَفَرُوا لِيَسْتَيْقِنَ الَّذِينَ أُوتُوا الْكِتَابَ وَيَزْدَادَ الَّذِينَ آمَنُوا إِيمَانًا ۙ وَلَا يَرْتَابَ الَّذِينَ أُوتُوا الْكِتَابَ وَالْمُؤْمِنُونَ ۙ وَلِيَقُولَ الَّذِينَ فِي قُلُوبِهِم مَّرَضٌ وَالْكَافِرُونَ مَاذَا أَرَادَ اللَّهُ بِهَٰذَا مَثَلًا ۚ كَذَٰلِكَ يُضِلُّ اللَّهُ مَن يَشَاءُ وَيَهْدِي مَن يَشَاءُ ۚ وَمَا يَعْلَمُ جُنُودَ رَبِّكَ إِلَّا هُوَ ۚ وَمَا هِيَ إِلَّا ذِكْرَىٰ لِلْبَشَرِ",
    "كَلَّا وَالْقَمَرِ",
    "وَاللَّيْلِ إِذْ أَدْبَرَ",
    "وَالصُّبْحِ إِذَا أَسْفَرَ",
    "إِنَّهَا لَإِحْدَى الْكُبَرِ",
    "نَذِيرًا لِّلْبَشَرِ",
    "لِمَن شَاءَ مِنكُمْ أَن يَتَقَدَّمَ أَوْ يَتَأَخَّرَ",
    "كُلُّ نَفْسٍ بِمَا كَسَبَتْ رَهِينَةٌ",
    "إِلَّا أَصْحَابَ الْيَمِينِ",
    "فِي جَنَّاتٍ يَتَسَاءَلُونَ",
    "عَنِ الْمُجْرِمِينَ",
    "مَا سَلَكَكُمْ فِي سَقَرَ",
    "قَالُوا لَمْ نَكُ مِنَ الْمُصَلِّينَ",
    "وَلَمْ نَكُ نُطْعِمُ الْمِسْكِينَ",
    "وَكُنَّا نَخُوضُ مَعَ الْخَائِضِينَ",
    "وَكُنَّا نُكَذِّبُ بِيَوْمِ الدِّينِ",
    "حَتَّىٰ أَتَانَا الْيَقِينُ",
    "فَمَا تَنفَعُهُمْ شَفَاعَةُ الشَّافِعِينَ",
    "فَمَا لَهُمْ عَنِ التَّذْكِرَةِ مُعْرِضِينَ",
    "كَأَنَّهُمْ حُمُرٌ مُّسْتَنفِرَةٌ",
    "فَرَّتْ مِن قَسْوَرَةٍ",
    "بَلْ يُرِيدُ كُلُّ امْرِئٍ مِّنْهُمْ أَن يُؤْتَىٰ صُحُفًا مُّنَشَّرَةً",
    "كَلَّا ۖ بَل لَّا يَخَافُونَ الْآخِرَةَ",
    "كَلَّا إِنَّهُ تَذْكِرَةٌ",
    "فَمَن شَاءَ ذَكَرَهُ",
    "وَمَا يَذْكُرُونَ إِلَّا أَن يَشَاءَ اللَّهُ ۚ هُوَ أَهْلُ التَّقْوَىٰ وَأَهْلُ الْمَغْفِرَةِ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"O you who covers himself [with a garment],",
    "Arise and warn",
    "And your Lord glorify",
    "And your clothing purify",
    "And uncleanliness avoid",
    "And do not confer favor to acquire more",
    "But for your Lord be patient.",
    "And when the trumpet is blown,",
    "That Day will be a difficult day",
    "For the disbelievers - not easy.",
    "Leave Me with the one I created alone",
    "And to whom I granted extensive wealth",
    "And children present [with him]",
    "And spread [everything] before him, easing [his life].",
    "Then he desires that I should add more.",
    "No! Indeed, he has been toward Our verses obstinate.",
    "I will cover him with arduous torment.",
    "Indeed, he thought and deliberated.",
    "So may he be destroyed [for] how he deliberated.",
    "Then may he be destroyed [for] how he deliberated.",
    "Then he considered [again];",
    "Then he frowned and scowled;",
    "Then he turned back and was arrogant",
    "And said, \"This is not but magic imitated [from others].",
    "This is not but the word of a human being.\"",
    "I will drive him into Saqar.",
    "And what can make you know what is Saqar?",
    "It lets nothing remain and leaves nothing [unburned],",
    "Blackening the skins.",
    "Over it are nineteen [angels].",
    "And We have not made the keepers of the Fire except angels. And We have not made their number except as a trial for those who disbelieve - that those who were given the Scripture will be convinced and those who have believed will increase in faith and those who were given the Scripture and the believers will not doubt and that those in whose hearts is hypocrisy and the disbelievers will say, \"What does Allah intend by this as an example?\" Thus does Allah leave astray whom He wills and guides whom He wills. And none knows the soldiers of your Lord except Him. And mention of the Fire is not but a reminder to humanity.",
    "No! By the moon",
    "And [by] the night when it departs",
    "And [by] the morning when it brightens,",
    "Indeed, the Fire is of the greatest [afflictions]",
    "As a warning to humanity -",
    "To whoever wills among you to proceed or stay behind.",
    "Every soul, for what it has earned, will be retained",
    "Except the companions of the right,",
    "[Who will be] in gardens, questioning each other",
    "About the criminals,",
    "[And asking them], \"What put you into Saqar?\"",
    "They will say, \"We were not of those who prayed,",
    "Nor did we used to feed the poor.",
    "And we used to enter into vain discourse with those who engaged [in it],",
    "And we used to deny the Day of Recompense",
    "Until there came to us the certainty.\"",
    "So there will not benefit them the intercession of [any] intercessors.",
    "Then what is [the matter] with them that they are, from the reminder, turning away",
    "As if they were alarmed donkeys",
    "Fleeing from a lion?",
    "Rather, every person among them desires that he would be given scriptures spread about.",
    "No! But they do not fear the Hereafter.",
    "No! Indeed, the Qur'an is a reminder",
    "Then whoever wills will remember it.",
    "And they will not remember except that Allah wills. He is worthy of fear and adequate for [granting] forgiveness."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__muddaththir);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_muddaththir);
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
