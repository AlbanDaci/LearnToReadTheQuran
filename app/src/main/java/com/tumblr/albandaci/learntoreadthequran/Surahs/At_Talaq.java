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

public class At_Talaq extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] verses = {"65:1", "65:2", "65:3", "65:4", "65:5", "65:6", "65:7", "65:8", "65:9", "65:10", "65:11", "65:12", ""};

    String [] arabic_verses = {"يَا أَيُّهَا النَّبِيُّ إِذَا طَلَّقْتُمُ النِّسَاءَ فَطَلِّقُوهُنَّ لِعِدَّتِهِنَّ وَأَحْصُوا الْعِدَّةَ ۖ وَاتَّقُوا اللَّهَ رَبَّكُمْ ۖ لَا تُخْرِجُوهُنَّ مِن بُيُوتِهِنَّ وَلَا يَخْرُجْنَ إِلَّا أَن يَأْتِينَ بِفَاحِشَةٍ مُّبَيِّنَةٍ ۚ وَتِلْكَ حُدُودُ اللَّهِ ۚ وَمَن يَتَعَدَّ حُدُودَ اللَّهِ فَقَدْ ظَلَمَ نَفْسَهُ ۚ لَا تَدْرِي لَعَلَّ اللَّهَ يُحْدِثُ بَعْدَ ذَٰلِكَ أَمْرًا",
    "فَإِذَا بَلَغْنَ أَجَلَهُنَّ فَأَمْسِكُوهُنَّ بِمَعْرُوفٍ أَوْ فَارِقُوهُنَّ بِمَعْرُوفٍ وَأَشْهِدُوا ذَوَيْ عَدْلٍ مِّنكُمْ وَأَقِيمُوا الشَّهَادَةَ لِلَّهِ ۚ ذَٰلِكُمْ يُوعَظُ بِهِ مَن كَانَ يُؤْمِنُ بِاللَّهِ وَالْيَوْمِ الْآخِرِ ۚ وَمَن يَتَّقِ اللَّهَ يَجْعَل لَّهُ مَخْرَجًا",
    "وَيَرْزُقْهُ مِنْ حَيْثُ لَا يَحْتَسِبُ ۚ وَمَن يَتَوَكَّلْ عَلَى اللَّهِ فَهُوَ حَسْبُهُ ۚ إِنَّ اللَّهَ بَالِغُ أَمْرِهِ ۚ قَدْ جَعَلَ اللَّهُ لِكُلِّ شَيْءٍ قَدْرًا",
    "وَاللَّائِي يَئِسْنَ مِنَ الْمَحِيضِ مِن نِّسَائِكُمْ إِنِ ارْتَبْتُمْ فَعِدَّتُهُنَّ ثَلَاثَةُ أَشْهُرٍ وَاللَّائِي لَمْ يَحِضْنَ ۚ وَأُولَاتُ الْأَحْمَالِ أَجَلُهُنَّ أَن يَضَعْنَ حَمْلَهُنَّ ۚ وَمَن يَتَّقِ اللَّهَ يَجْعَل لَّهُ مِنْ أَمْرِهِ يُسْرًا",
    "ذَٰلِكَ أَمْرُ اللَّهِ أَنزَلَهُ إِلَيْكُمْ ۚ وَمَن يَتَّقِ اللَّهَ يُكَفِّرْ عَنْهُ سَيِّئَاتِهِ وَيُعْظِمْ لَهُ أَجْرًا",
    "أَسْكِنُوهُنَّ مِنْ حَيْثُ سَكَنتُم مِّن وُجْدِكُمْ وَلَا تُضَارُّوهُنَّ لِتُضَيِّقُوا عَلَيْهِنَّ ۚ وَإِن كُنَّ أُولَاتِ حَمْلٍ فَأَنفِقُوا عَلَيْهِنَّ حَتَّىٰ يَضَعْنَ حَمْلَهُنَّ ۚ فَإِنْ أَرْضَعْنَ لَكُمْ فَآتُوهُنَّ أُجُورَهُنَّ ۖ وَأْتَمِرُوا بَيْنَكُم بِمَعْرُوفٍ ۖ وَإِن تَعَاسَرْتُمْ فَسَتُرْضِعُ لَهُ أُخْرَىٰ",
    "لِيُنفِقْ ذُو سَعَةٍ مِّن سَعَتِهِ ۖ وَمَن قُدِرَ عَلَيْهِ رِزْقُهُ فَلْيُنفِقْ مِمَّا آتَاهُ اللَّهُ ۚ لَا يُكَلِّفُ اللَّهُ نَفْسًا إِلَّا مَا آتَاهَا ۚ سَيَجْعَلُ اللَّهُ بَعْدَ عُسْرٍ يُسْرًا",
    "وَكَأَيِّن مِّن قَرْيَةٍ عَتَتْ عَنْ أَمْرِ رَبِّهَا وَرُسُلِهِ فَحَاسَبْنَاهَا حِسَابًا شَدِيدًا وَعَذَّبْنَاهَا عَذَابًا نُّكْرًا",
    "فَذَاقَتْ وَبَالَ أَمْرِهَا وَكَانَ عَاقِبَةُ أَمْرِهَا خُسْرًا",
    "أَعَدَّ اللَّهُ لَهُمْ عَذَابًا شَدِيدًا ۖ فَاتَّقُوا اللَّهَ يَا أُولِي الْأَلْبَابِ الَّذِينَ آمَنُوا ۚ قَدْ أَنزَلَ اللَّهُ إِلَيْكُمْ ذِكْرًا",
    "رَّسُولًا يَتْلُو عَلَيْكُمْ آيَاتِ اللَّهِ مُبَيِّنَاتٍ لِّيُخْرِجَ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ مِنَ الظُّلُمَاتِ إِلَى النُّورِ ۚ وَمَن يُؤْمِن بِاللَّهِ وَيَعْمَلْ صَالِحًا يُدْخِلْهُ جَنَّاتٍ تَجْرِي مِن تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا أَبَدًا ۖ قَدْ أَحْسَنَ اللَّهُ لَهُ رِزْقًا",
    "اللَّهُ الَّذِي خَلَقَ سَبْعَ سَمَاوَاتٍ وَمِنَ الْأَرْضِ مِثْلَهُنَّ يَتَنَزَّلُ الْأَمْرُ بَيْنَهُنَّ لِتَعْلَمُوا أَنَّ اللَّهَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ وَأَنَّ اللَّهَ قَدْ أَحَاطَ بِكُلِّ شَيْءٍ عِلْمًا",
    ""};

    String [] sahih_international = {"Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International", "Sahih International",
            "Sahih International", "Sahih International", ""};

    String [] english_verses = {"O Prophet, when you [Muslims] divorce women, divorce them for [the commencement of] their waiting period and keep count of the waiting period, and fear Allah, your Lord. Do not turn them out of their [husbands'] houses, nor should they [themselves] leave [during that period] unless they are committing a clear immorality. And those are the limits [set by] Allah. And whoever transgresses the limits of Allah has certainly wronged himself. You know not; perhaps Allah will bring about after that a [different] matter.",
    "And when they have [nearly] fulfilled their term, either retain them according to acceptable terms or part with them according to acceptable terms. And bring to witness two just men from among you and establish the testimony for [the acceptance of] Allah. That is instructed to whoever should believe in Allah and the Last day. And whoever fears Allah - He will make for him a way out",
    "And will provide for him from where he does not expect. And whoever relies upon Allah - then He is sufficient for him. Indeed, Allah will accomplish His purpose. Allah has already set for everything a [decreed] extent.",
    "And those who no longer expect menstruation among your women - if you doubt, then their period is three months, and [also for] those who have not menstruated. And for those who are pregnant, their term is until they give birth. And whoever fears Allah - He will make for him of his matter ease.",
    "That is the command of Allah, which He has sent down to you; and whoever fears Allah - He will remove for him his misdeeds and make great for him his reward.",
    "Lodge them [in a section] of where you dwell out of your means and do not harm them in order to oppress them. And if they should be pregnant, then spend on them until they give birth. And if they breastfeed for you, then give them their payment and confer among yourselves in the acceptable way; but if you are in discord, then there may breastfeed for the father another woman.",
    "Let a man of wealth spend from his wealth, and he whose provision is restricted - let him spend from what Allah has given him. Allah does not charge a soul except [according to] what He has given it. Allah will bring about, after hardship, ease.",
    "And how many a city was insolent toward the command of its Lord and His messengers, so We took it to severe account and punished it with a terrible punishment.",
    "And it tasted the bad consequence of its affair, and the outcome of its affair was loss.",
    "Allah has prepared for them a severe punishment; so fear Allah, O you of understanding who have believed. Allah has sent down to you the Qur'an.",
    "[He sent] a Messenger [Muhammad] reciting to you the distinct verses of Allah that He may bring out those who believe and do righteous deeds from darknesses into the light. And whoever believes in Allah and does righteousness - He will admit him into gardens beneath which rivers flow to abide therein forever. Allah will have perfected for him a provision.",
    "It is Allah who has created seven heavens and of the earth, the like of them. [His] command descends among them so you may know that Allah is over all things competent and that Allah has encompassed all things in knowledge.",
    ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at__talaq);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_at_talaq);
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
