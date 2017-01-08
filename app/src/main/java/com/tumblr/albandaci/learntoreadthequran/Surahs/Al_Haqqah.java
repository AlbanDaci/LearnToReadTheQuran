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

public class Al_Haqqah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"69:1", "69:2", "69:3", "69:4", "69:5", "69:6", "69:7", "69:8", "69:9", "69:10", "69:11", "69:12", "69:13", "69:14", "69:15", "69:16",
            "69:17", "69:18", "69:19", "69:20", "69:21", "69:22", "69:23", "69:24", "69:25", "69:26", "69:27", "69:28", "69:29", "69:30", "69:31", "69:32",
            "69:33", "69:34", "69:35", "69:36", "69:37", "69:38", "69:39", "69:40", "69:41", "69:42", "69:43", "69:44", "69:45", "69:46", "69:47", "69:48",
            "69:49", "69:50", "69:51", "69:52"};

    String [] arabic_verses = {"الْحَاقَّةُ",
    "مَا الْحَاقَّةُ",
    "وَمَا أَدْرَاكَ مَا الْحَاقَّةُ",
    "كَذَّبَتْ ثَمُودُ وَعَادٌ بِالْقَارِعَةِ",
    "فَأَمَّا ثَمُودُ فَأُهْلِكُوا بِالطَّاغِيَةِ",
    "وَأَمَّا عَادٌ فَأُهْلِكُوا بِرِيحٍ صَرْصَرٍ عَاتِيَةٍ",
    "سَخَّرَهَا عَلَيْهِمْ سَبْعَ لَيَالٍ وَثَمَانِيَةَ أَيَّامٍ حُسُومًا فَتَرَى الْقَوْمَ فِيهَا صَرْعَىٰ كَأَنَّهُمْ أَعْجَازُ نَخْلٍ خَاوِيَةٍ",
    "فَهَلْ تَرَىٰ لَهُم مِّن بَاقِيَةٍ",
    "وَجَاءَ فِرْعَوْنُ وَمَن قَبْلَهُ وَالْمُؤْتَفِكَاتُ بِالْخَاطِئَةِ",
    "فَعَصَوْا رَسُولَ رَبِّهِمْ فَأَخَذَهُمْ أَخْذَةً رَّابِيَةً",
    "إِنَّا لَمَّا طَغَى الْمَاءُ حَمَلْنَاكُمْ فِي الْجَارِيَةِ",
    "لِنَجْعَلَهَا لَكُمْ تَذْكِرَةً وَتَعِيَهَا أُذُنٌ وَاعِيَةٌ",
    "فَإِذَا نُفِخَ فِي الصُّورِ نَفْخَةٌ وَاحِدَةٌ",
    "وَحُمِلَتِ الْأَرْضُ وَالْجِبَالُ فَدُكَّتَا دَكَّةً وَاحِدَةً",
    "فَيَوْمَئِذٍ وَقَعَتِ الْوَاقِعَةُ",
    "وَانشَقَّتِ السَّمَاءُ فَهِيَ يَوْمَئِذٍ وَاهِيَةٌ",
    "وَالْمَلَكُ عَلَىٰ أَرْجَائِهَا ۚ وَيَحْمِلُ عَرْشَ رَبِّكَ فَوْقَهُمْ يَوْمَئِذٍ ثَمَانِيَةٌ",
    "يَوْمَئِذٍ تُعْرَضُونَ لَا تَخْفَىٰ مِنكُمْ خَافِيَةٌ",
    "فَأَمَّا مَنْ أُوتِيَ كِتَابَهُ بِيَمِينِهِ فَيَقُولُ هَاؤُمُ اقْرَءُوا كِتَابِيَهْ",
    "إِنِّي ظَنَنتُ أَنِّي مُلَاقٍ حِسَابِيَهْ",
    "فَهُوَ فِي عِيشَةٍ رَّاضِيَةٍ",
    "فِي جَنَّةٍ عَالِيَةٍ",
    "قُطُوفُهَا دَانِيَةٌ",
    "كُلُوا وَاشْرَبُوا هَنِيئًا بِمَا أَسْلَفْتُمْ فِي الْأَيَّامِ الْخَالِيَةِ",
    "وَأَمَّا مَنْ أُوتِيَ كِتَابَهُ بِشِمَالِهِ فَيَقُولُ يَا لَيْتَنِي لَمْ أُوتَ كِتَابِيَهْ",
    "وَلَمْ أَدْرِ مَا حِسَابِيَهْ",
    "يَا لَيْتَهَا كَانَتِ الْقَاضِيَةَ",
    "مَا أَغْنَىٰ عَنِّي مَالِيَهْ ۜ",
    "هَلَكَ عَنِّي سُلْطَانِيَهْ",
    "خُذُوهُ فَغُلُّوهُ",
    "ثُمَّ الْجَحِيمَ صَلُّوهُ",
    "ثُمَّ فِي سِلْسِلَةٍ ذَرْعُهَا سَبْعُونَ ذِرَاعًا فَاسْلُكُوهُ",
    "إِنَّهُ كَانَ لَا يُؤْمِنُ بِاللَّهِ الْعَظِيمِ",
    "وَلَا يَحُضُّ عَلَىٰ طَعَامِ الْمِسْكِينِ",
    "فَلَيْسَ لَهُ الْيَوْمَ هَاهُنَا حَمِيمٌ",
    "وَلَا طَعَامٌ إِلَّا مِنْ غِسْلِينٍ",
    "لَّا يَأْكُلُهُ إِلَّا الْخَاطِئُونَ",
    "فَلَا أُقْسِمُ بِمَا تُبْصِرُونَ",
    "وَمَا لَا تُبْصِرُونَ",
    "إِنَّهُ لَقَوْلُ رَسُولٍ كَرِيمٍ",
    "وَمَا هُوَ بِقَوْلِ شَاعِرٍ ۚ قَلِيلًا مَّا تُؤْمِنُونَ",
    "وَلَا بِقَوْلِ كَاهِنٍ ۚ قَلِيلًا مَّا تَذَكَّرُونَ",
    "تَنزِيلٌ مِّن رَّبِّ الْعَالَمِينَ",
    "وَلَوْ تَقَوَّلَ عَلَيْنَا بَعْضَ الْأَقَاوِيلِ",
    "لَأَخَذْنَا مِنْهُ بِالْيَمِينِ",
    "ثُمَّ لَقَطَعْنَا مِنْهُ الْوَتِينَ",
    "فَمَا مِنكُم مِّنْ أَحَدٍ عَنْهُ حَاجِزِينَ",
    "وَإِنَّهُ لَتَذْكِرَةٌ لِّلْمُتَّقِينَ",
    "وَإِنَّا لَنَعْلَمُ أَنَّ مِنكُم مُّكَذِّبِينَ",
    "وَإِنَّهُ لَحَسْرَةٌ عَلَى الْكَافِرِينَ",
    "وَإِنَّهُ لَحَقُّ الْيَقِينِ",
    "فَسَبِّحْ بِاسْمِ رَبِّكَ الْعَظِيمِ"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International"};

    String [] english_verses = {"The Inevitable Reality -",
    "What is the Inevitable Reality?",
    "And what can make you know what is the Inevitable Reality?",
    "Thamud and 'Aad denied the Striking Calamity.",
    "So as for Thamud, they were destroyed by the overpowering [blast].",
    "And as for 'Aad, they were destroyed by a screaming, violent wind",
    "Which Allah imposed upon them for seven nights and eight days in succession, so you would see the people therein fallen as if they were hollow trunks of palm trees.",
    "Then do you see of them any remains?",
    "And there came Pharaoh and those before him and the overturned cities with sin.",
    "And they disobeyed the messenger of their Lord, so He seized them with a seizure exceeding [in severity].",
    "Indeed, when the water overflowed, We carried your ancestors in the sailing ship",
    "That We might make it for you a reminder and [that] a conscious ear would be conscious of it.",
    "Then when the Horn is blown with one blast",
    "And the earth and the mountains are lifted and leveled with one blow -",
    "Then on that Day, the Resurrection will occur,",
    "And the heaven will split [open], for that Day it is infirm.",
    "And the angels are at its edges. And there will bear the Throne of your Lord above them, that Day, eight [of them].",
    "That Day, you will be exhibited [for judgement]; not hidden among you is anything concealed.",
    "So as for he who is given his record in his right hand, he will say, \"Here, read my record!",
    "Indeed, I was certain that I would be meeting my account.\"",
    "So he will be in a pleasant life -",
    "In an elevated garden,",
    "Its [fruit] to be picked hanging near.",
    "[They will be told], \"Eat and drink in satisfaction for what you put forth in the days past.\"",
    "But as for he who is given his record in his left hand, he will say, \"Oh, I wish I had not been given my record",
    "And had not known what is my account.",
    "I wish my death had been the decisive one.",
    "My wealth has not availed me.",
    "Gone from me is my authority.\"",
    "[Allah will say], \"Seize him and shackle him.",
    "Then into Hellfire drive him.",
    "Then into a chain whose length is seventy cubits insert him.\"",
    "Indeed, he did not used to believe in Allah, the Most Great,",
    "Nor did he encourage the feeding of the poor.",
    "So there is not for him here this Day any devoted friend",
    "Nor any food except from the discharge of wounds;",
    "None will eat it except the sinners.",
    "So I swear by what you see",
    "And what you do not see",
    "[That] indeed, the Qur'an is the word of a noble Messenger.",
    "And it is not the word of a poet; little do you believe.",
    "Nor the word of a soothsayer; little do you remember.",
    "[It is] a revelation from the Lord of the worlds.",
    "And if Muhammad had made up about Us some [false] sayings,",
    "We would have seized him by the right hand;",
    "Then We would have cut from him the aorta.",
    "And there is no one of you who could prevent [Us] from him.",
    "And indeed, the Qur'an is a reminder for the righteous.",
    "And indeed, We know that among you are deniers.",
    "And indeed, it will be [a cause of] regret upon the disbelievers.",
    "And indeed, it is the truth of certainty.",
    "So exalt the name of your Lord, the Most Great."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__haqqah);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_al_haqqah);
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
