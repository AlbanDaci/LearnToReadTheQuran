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

public class An_Naziat extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"79:1", "79:2", "79:3", "79:4", "79:5", "79:6", "79:7", "79:8", "79:9", "79:10", "79:11", "79:12", "79:13", "79:14", "79:15", "79:16",
            "79:17", "79:18", "79:19", "79:20", "79:21", "79:22", "79:23", "79:24", "79:25", "79:26", "79:27", "79:28", "79:29", "79:30", "79:31", "79:32",
            "79:33", "79:34", "79:35", "79:36", "79:37", "79:38", "79:39", "79:40", "79:41", "79:42", "79:43", "79:44", "79:45", "79:46"};

    String [] arabic_verses = {"وَالنَّازِعَاتِ غَرْقًا",
    "وَالنَّاشِطَاتِ نَشْطًا",
    "وَالسَّابِحَاتِ سَبْحًا",
    "فَالسَّابِقَاتِ سَبْقًا",
    "فَالْمُدَبِّرَاتِ أَمْرًا",
    "يَوْمَ تَرْجُفُ الرَّاجِفَةُ",
    "تَتْبَعُهَا الرَّادِفَةُ",
    "قُلُوبٌ يَوْمَئِذٍ وَاجِفَةٌ",
    "أَبْصَارُهَا خَاشِعَةٌ",
    "يَقُولُونَ أَإِنَّا لَمَرْدُودُونَ فِي الْحَافِرَةِ",
    "أَإِذَا كُنَّا عِظَامًا نَّخِرَةً",
    "قَالُوا تِلْكَ إِذًا كَرَّةٌ خَاسِرَةٌ",
    "فَإِنَّمَا هِيَ زَجْرَةٌ وَاحِدَةٌ",
    "فَإِذَا هُم بِالسَّاهِرَةِ",
    "هَلْ أَتَاكَ حَدِيثُ مُوسَىٰ",
    "إِذْ نَادَاهُ رَبُّهُ بِالْوَادِ الْمُقَدَّسِ طُوًى",
    "اذْهَبْ إِلَىٰ فِرْعَوْنَ إِنَّهُ طَغَىٰ",
    "فَقُلْ هَل لَّكَ إِلَىٰ أَن تَزَكَّىٰ",
    "وَأَهْدِيَكَ إِلَىٰ رَبِّكَ فَتَخْشَىٰ",
    "فَأَرَاهُ الْآيَةَ الْكُبْرَىٰ",
    "فَكَذَّبَ وَعَصَىٰ",
    "ثُمَّ أَدْبَرَ يَسْعَىٰ",
    "فَحَشَرَ فَنَادَىٰ",
    "فَقَالَ أَنَا رَبُّكُمُ الْأَعْلَىٰ",
    "فَأَخَذَهُ اللَّهُ نَكَالَ الْآخِرَةِ وَالْأُولَىٰ",
    "إِنَّ فِي ذَٰلِكَ لَعِبْرَةً لِّمَن يَخْشَىٰ",
    "أَأَنتُمْ أَشَدُّ خَلْقًا أَمِ السَّمَاءُ ۚ بَنَاهَا",
    "رَفَعَ سَمْكَهَا فَسَوَّاهَا",
    "وَأَغْطَشَ لَيْلَهَا وَأَخْرَجَ ضُحَاهَا",
    "وَالْأَرْضَ بَعْدَ ذَٰلِكَ دَحَاهَا",
    "أَخْرَجَ مِنْهَا مَاءَهَا وَمَرْعَاهَا",
    "وَالْجِبَالَ أَرْسَاهَا",
    "مَتَاعًا لَّكُمْ وَلِأَنْعَامِكُمْ",
    "فَإِذَا جَاءَتِ الطَّامَّةُ الْكُبْرَىٰ",
    "يَوْمَ يَتَذَكَّرُ الْإِنسَانُ مَا سَعَىٰ",
    "وَبُرِّزَتِ الْجَحِيمُ لِمَن يَرَىٰ",
    "فَأَمَّا مَن طَغَىٰ",
    "وَآثَرَ الْحَيَاةَ الدُّنْيَا",
    "فَإِنَّ الْجَحِيمَ هِيَ الْمَأْوَىٰ",
    "وَأَمَّا مَنْ خَافَ مَقَامَ رَبِّهِ وَنَهَى النَّفْسَ عَنِ الْهَوَىٰ",
    "فَإِنَّ الْجَنَّةَ هِيَ الْمَأْوَىٰ",
    "يَسْأَلُونَكَ عَنِ السَّاعَةِ أَيَّانَ مُرْسَاهَا",
    "فِيمَ أَنتَ مِن ذِكْرَاهَا",
    "إِلَىٰ رَبِّكَ مُنتَهَاهَا",
    "إِنَّمَا أَنتَ مُنذِرُ مَن يَخْشَاهَا",
    "كَأَنَّهُمْ يَوْمَ يَرَوْنَهَا لَمْ يَلْبَثُوا إِلَّا عَشِيَّةً أَوْ ضُحَاهَا"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International"};

    String [] english_verses = {"By those [angels] who extract with violence",
    "And [by] those who remove with ease",
    "And [by] those who glide [as if] swimming",
    "And those who race each other in a race",
    "And those who arrange [each] matter,",
    "On the Day the blast [of the Horn] will convulse [creation],",
    "There will follow it the subsequent [one].",
    "Hearts, that Day, will tremble,",
    "Their eyes humbled.",
    "They are [presently] saying, \"Will we indeed be returned to [our] former state [of life]?",
    "Even if we should be decayed bones?",
    "They say, \"That, then, would be a losing return.\"",
    "Indeed, it will be but one shout,",
    "And suddenly they will be [alert] upon the earth's surface.",
    "Has there reached you the story of Moses? -",
    "When his Lord called to him in the sacred valley of Tuwa,",
    "\"Go to Pharaoh. Indeed, he has transgressed.",
    "And say to him, 'Would you [be willing to] purify yourself",
    "And let me guide you to your Lord so you would fear [Him]?'\"",
    "And he showed him the greatest sign,",
    "But Pharaoh denied and disobeyed.",
    "Then he turned his back, striving.",
    "And he gathered [his people] and called out",
    "And said, \"I am your most exalted lord.\"",
    "So Allah seized him in exemplary punishment for the last and the first [transgression].",
    "Indeed in that is a warning for whoever would fear [Allah].",
    "Are you a more difficult creation or is the heaven? Allah constructed it.",
    "He raised its ceiling and proportioned it.",
    "And He darkened its night and extracted its brightness.",
    "And after that He spread the earth.",
    "He extracted from it its water and its pasture,",
    "And the mountains He set firmly",
    "As provision for you and your grazing livestock.",
    "But when there comes the greatest Overwhelming Calamity -",
    "The Day when man will remember that for which he strove,",
    "And Hellfire will be exposed for [all] those who see -",
    "So as for he who transgressed",
    "And preferred the life of the world,",
    "Then indeed, Hellfire will be [his] refuge.",
    "But as for he who feared the position of his Lord and prevented the soul from [unlawful] inclination,",
    "Then indeed, Paradise will be [his] refuge.",
    "They ask you, [O Muhammad], about the Hour: when is its arrival?",
    "In what [position] are you that you should mention it?",
    "To your Lord is its finality.",
    "You are only a warner for those who fear it.",
    "It will be, on the Day they see it, as though they had not remained [in the world] except for an afternoon or a morning thereof."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an__naziat);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_an_naziat);
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
