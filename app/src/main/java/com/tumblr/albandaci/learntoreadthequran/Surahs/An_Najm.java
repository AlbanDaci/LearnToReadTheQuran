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

public class An_Najm extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"53:1", "53:2", "53:3", "53:4", "53:5", "53:6", "53:7", "53:8", "53:9", "53:10", "53:11", "53:12", "53:13", "53:14", "53:15", "53:16",
            "53:17", "53:18", "53:19", "53:20", "53:21", "53:22", "53:23", "53:24", "53:25", "53:26", "53:27", "53:28", "53:29", "53:30", "53:31", "53:32",
            "53:33", "53:34", "53:35", "53:36", "53:37", "53:38", "53:39", "53:40", "53:41", "53:42", "53:43", "53:44", "53:45", "53:46", "53:47", "53:48",
            "53:49", "53:50", "53:51", "53:52", "53:53", "53:54", "53:55", "53:56", "53:57", "53:58", "53:59", "53:60", "53:61", "53:62"};

    String [] arabic_verses = {"وَالنَّجْمِ إِذَا هَوَىٰ",
    "مَا ضَلَّ صَاحِبُكُمْ وَمَا غَوَىٰ",
    "وَمَا يَنطِقُ عَنِ الْهَوَىٰ",
    "إِنْ هُوَ إِلَّا وَحْيٌ يُوحَىٰ",
    "عَلَّمَهُ شَدِيدُ الْقُوَىٰ",
    "ذُو مِرَّةٍ فَاسْتَوَىٰ",
    "وَهُوَ بِالْأُفُقِ الْأَعْلَىٰ",
    "ثُمَّ دَنَا فَتَدَلَّىٰ",
    "فَكَانَ قَابَ قَوْسَيْنِ أَوْ أَدْنَىٰ",
    "فَأَوْحَىٰ إِلَىٰ عَبْدِهِ مَا أَوْحَىٰ",
    "مَا كَذَبَ الْفُؤَادُ مَا رَأَىٰ",
    "أَفَتُمَارُونَهُ عَلَىٰ مَا يَرَىٰ",
    "وَلَقَدْ رَآهُ نَزْلَةً أُخْرَىٰ",
    "عِندَ سِدْرَةِ الْمُنتَهَىٰ",
    "عِندَهَا جَنَّةُ الْمَأْوَىٰ",
    "إِذْ يَغْشَى السِّدْرَةَ مَا يَغْشَىٰ",
    "مَا زَاغَ الْبَصَرُ وَمَا طَغَىٰ",
    "لَقَدْ رَأَىٰ مِنْ آيَاتِ رَبِّهِ الْكُبْرَىٰ",
    "أَفَرَأَيْتُمُ اللَّاتَ وَالْعُزَّىٰ",
    "وَمَنَاةَ الثَّالِثَةَ الْأُخْرَىٰ",
    "أَلَكُمُ الذَّكَرُ وَلَهُ الْأُنثَىٰ",
    "تِلْكَ إِذًا قِسْمَةٌ ضِيزَىٰ",
    "إِنْ هِيَ إِلَّا أَسْمَاءٌ سَمَّيْتُمُوهَا أَنتُمْ وَآبَاؤُكُم مَّا أَنزَلَ اللَّهُ بِهَا مِن سُلْطَانٍ ۚ إِن يَتَّبِعُونَ إِلَّا الظَّنَّ وَمَا تَهْوَى الْأَنفُسُ ۖ وَلَقَدْ جَاءَهُم مِّن رَّبِّهِمُ الْهُدَىٰ",
    "أَمْ لِلْإِنسَانِ مَا تَمَنَّىٰ",
    "فَلِلَّهِ الْآخِرَةُ وَالْأُولَىٰ",
    "وَكَم مِّن مَّلَكٍ فِي السَّمَاوَاتِ لَا تُغْنِي شَفَاعَتُهُمْ شَيْئًا إِلَّا مِن بَعْدِ أَن يَأْذَنَ اللَّهُ لِمَن يَشَاءُ وَيَرْضَىٰ",
    "إِنَّ الَّذِينَ لَا يُؤْمِنُونَ بِالْآخِرَةِ لَيُسَمُّونَ الْمَلَائِكَةَ تَسْمِيَةَ الْأُنثَىٰ",
    "وَمَا لَهُم بِهِ مِنْ عِلْمٍ ۖ إِن يَتَّبِعُونَ إِلَّا الظَّنَّ ۖ وَإِنَّ الظَّنَّ لَا يُغْنِي مِنَ الْحَقِّ شَيْئًا",
    "فَأَعْرِضْ عَن مَّن تَوَلَّىٰ عَن ذِكْرِنَا وَلَمْ يُرِدْ إِلَّا الْحَيَاةَ الدُّنْيَا",
    "ذَٰلِكَ مَبْلَغُهُم مِّنَ الْعِلْمِ ۚ إِنَّ رَبَّكَ هُوَ أَعْلَمُ بِمَن ضَلَّ عَن سَبِيلِهِ وَهُوَ أَعْلَمُ بِمَنِ اهْتَدَىٰ",
    "وَلِلَّهِ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ لِيَجْزِيَ الَّذِينَ أَسَاءُوا بِمَا عَمِلُوا وَيَجْزِيَ الَّذِينَ أَحْسَنُوا بِالْحُسْنَى",
    "الَّذِينَ يَجْتَنِبُونَ كَبَائِرَ الْإِثْمِ وَالْفَوَاحِشَ إِلَّا اللَّمَمَ ۚ إِنَّ رَبَّكَ وَاسِعُ الْمَغْفِرَةِ ۚ هُوَ أَعْلَمُ بِكُمْ إِذْ أَنشَأَكُم مِّنَ الْأَرْضِ وَإِذْ أَنتُمْ أَجِنَّةٌ فِي بُطُونِ أُمَّهَاتِكُمْ ۖ فَلَا تُزَكُّوا أَنفُسَكُمْ ۖ هُوَ أَعْلَمُ بِمَنِ اتَّقَىٰ",
    "أَفَرَأَيْتَ الَّذِي تَوَلَّىٰ",
    "وَأَعْطَىٰ قَلِيلًا وَأَكْدَىٰ",
    "أَعِندَهُ عِلْمُ الْغَيْبِ فَهُوَ يَرَىٰ",
    "أَمْ لَمْ يُنَبَّأْ بِمَا فِي صُحُفِ مُوسَىٰ",
    "وَإِبْرَاهِيمَ الَّذِي وَفَّىٰ",
    "أَلَّا تَزِرُ وَازِرَةٌ وِزْرَ أُخْرَىٰ",
    "وَأَن لَّيْسَ لِلْإِنسَانِ إِلَّا مَا سَعَىٰ",
    "وَأَنَّ سَعْيَهُ سَوْفَ يُرَىٰ",
    "ثُمَّ يُجْزَاهُ الْجَزَاءَ الْأَوْفَىٰ",
    "وَأَنَّ إِلَىٰ رَبِّكَ الْمُنتَهَىٰ",
    "وَأَنَّهُ هُوَ أَضْحَكَ وَأَبْكَىٰ",
    "وَأَنَّهُ هُوَ أَمَاتَ وَأَحْيَا",
    "وَأَنَّهُ خَلَقَ الزَّوْجَيْنِ الذَّكَرَ وَالْأُنثَىٰ",
    "مِن نُّطْفَةٍ إِذَا تُمْنَىٰ",
    "وَأَنَّ عَلَيْهِ النَّشْأَةَ الْأُخْرَىٰ",
    "وَأَنَّهُ هُوَ أَغْنَىٰ وَأَقْنَىٰ",
    "وَأَنَّهُ هُوَ رَبُّ الشِّعْرَىٰ",
    "وَأَنَّهُ أَهْلَكَ عَادًا الْأُولَىٰ",
    "وَثَمُودَ فَمَا أَبْقَىٰ",
    "وَقَوْمَ نُوحٍ مِّن قَبْلُ ۖ إِنَّهُمْ كَانُوا هُمْ أَظْلَمَ وَأَطْغَىٰ",
    "وَالْمُؤْتَفِكَةَ أَهْوَىٰ",
    "فَغَشَّاهَا مَا غَشَّىٰ",
    "فَبِأَيِّ آلَاءِ رَبِّكَ تَتَمَارَىٰ",
    "هَٰذَا نَذِيرٌ مِّنَ النُّذُرِ الْأُولَىٰ",
    "أَزِفَتِ الْآزِفَةُ",
    "لَيْسَ لَهَا مِن دُونِ اللَّهِ كَاشِفَةٌ",
    "أَفَمِنْ هَٰذَا الْحَدِيثِ تَعْجَبُونَ",
    "وَتَضْحَكُونَ وَلَا تَبْكُونَ",
    "وَأَنتُمْ سَامِدُونَ",
    "فَاسْجُدُوا لِلَّهِ وَاعْبُدُوا ۩"};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International"};

    String [] english_verses = {"By the star when it descends,",
    "Your companion [Muhammad] has not strayed, nor has he erred,",
    "Nor does he speak from [his own] inclination.",
    "It is not but a revelation revealed,",
    "Taught to him by one intense in strength -",
    "One of soundness. And he rose to [his] true form",
    "While he was in the higher [part of the] horizon.",
    "Then he approached and descended",
    "And was at a distance of two bow lengths or nearer.",
    "And he revealed to His Servant what he revealed.",
    "The heart did not lie [about] what it saw.",
    "So will you dispute with him over what he saw?",
    "And he certainly saw him in another descent",
    "At the Lote Tree of the Utmost Boundary -",
    "Near it is the Garden of Refuge -",
    "When there covered the Lote Tree that which covered [it].",
    "The sight [of the Prophet] did not swerve, nor did it transgress [its limit].",
    "He certainly saw of the greatest signs of his Lord.",
    "So have you considered al-Lat and al-'Uzza?",
    "And Manat, the third - the other one?",
    "Is the male for you and for Him the female?",
    "That, then, is an unjust division.",
    "They are not but [mere] names you have named them - you and your forefathers - for which Allah has sent down no authority. They follow not except assumption and what [their] souls desire, and there has already come to them from their Lord guidance.",
    "Or is there for man whatever he wishes?",
    "Rather, to Allah belongs the Hereafter and the first [life].",
    "And how many angels there are in the heavens whose intercession will not avail at all except [only] after Allah has permitted [it] to whom He wills and approves.",
    "Indeed, those who do not believe in the Hereafter name the angels female names,",
    "And they have thereof no knowledge. They follow not except assumption, and indeed, assumption avails not against the truth at all.",
    "So turn away from whoever turns his back on Our message and desires not except the worldly life.",
    "That is their sum of knowledge. Indeed, your Lord is most knowing of who strays from His way, and He is most knowing of who is guided.",
    "And to Allah belongs whatever is in the heavens and whatever is in the earth - that He may recompense those who do evil with [the penalty of] what they have done and recompense those who do good with the best [reward] -",
    "Those who avoid the major sins and immoralities, only [committing] slight ones. Indeed, your Lord is vast in forgiveness. He was most knowing of you when He produced you from the earth and when you were fetuses in the wombs of your mothers. So do not claim yourselves to be pure; He is most knowing of who fears Him.",
    "Have you seen the one who turned away",
    "And gave a little and [then] refrained?",
    "Does he have knowledge of the unseen, so he sees?",
    "Or has he not been informed of what was in the scriptures of Moses",
    "And [of] Abraham, who fulfilled [his obligations] -",
    "That no bearer of burdens will bear the burden of another",
    "And that there is not for man except that [good] for which he strives",
    "And that his effort is going to be seen -",
    "Then he will be recompensed for it with the fullest recompense",
    "And that to your Lord is the finality",
    "And that it is He who makes [one] laugh and weep",
    "And that it is He who causes death and gives life",
    "And that He creates the two mates - the male and female -",
    "From a sperm-drop when it is emitted",
    "And that [incumbent] upon Him is the next creation",
    "And that it is He who enriches and suffices",
    "And that it is He who is the Lord of Sirius",
    "And that He destroyed the first [people of] 'Aad",
    "And Thamud - and He did not spare [them] -",
    "And the people of Noah before. Indeed, it was they who were [even] more unjust and oppressing.",
    "And the overturned towns He hurled down",
    "And covered them by that which He covered.",
    "Then which of the favors of your Lord do you doubt?",
    "This [Prophet] is a warner like the former warners.",
    "The Approaching Day has approached.",
    "Of it, [from those] besides Allah, there is no remover.",
    "Then at this statement do you wonder?",
    "And you laugh and do not weep",
    "While you are proudly sporting?",
    "So prostrate to Allah and worship [Him]."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an__najm);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_an_najm);
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
