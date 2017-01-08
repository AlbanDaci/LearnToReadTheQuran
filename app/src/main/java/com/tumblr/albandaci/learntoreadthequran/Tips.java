package com.tumblr.albandaci.learntoreadthequran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tumblr.albandaci.learntoreadthequran.Adapter.Tips_And_Notes_Adapter;

public class Tips extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String [] arabic_letter = {"بَ",
            "بَا",
            "بِ",
            "بِي",
            "بُ",
            "بُو",
            "بْ",
            "ـَيْ\u200E",
            "ى",
            "آ",
            "مَٰ",
            "ٱ",
            "دَّ",
            "بِّ",
            "بٌ",
            "بًا",
            "بٍ",
            "ة",
            "ء",
            "أ"};

    String [] pronunciation = {"Pronounced: /ba/",
            "Pronounced: /baː/",
            "Pronounced: /bi/",
            "Pronounced: /biː/",
            "Pronounced: /bu/",
            "Pronounced: /buː/",
            "Pronounced: /b/",
            "Pronounced: /aj/",
            "Pronounced: /aː/",
            "Pronounced: /ʔaː/",
            "Pronounced: /maː/",
            "Pronounced: /∅/",
            "Pronounced: /dda/",
            "Pronounced: /bbi/",
            "Pronounced: /bun/",
            "Pronounced: /ban/",
            "Pronounced: /bin/",
            "Pronounced: /t/, /h/",
            "Pronounced: /ʔ/",
            "Pronounced: /a/"};

    String [] text = {"The fatḥah is a diagonal line placed above a letter, and represents a short /a/",
            "When a fatḥah is placed before the letter alif, it represents a long /aː/",
            "The kasrah is a diagonal line placed under a letter, and represents a short /i/",
            "When a kasrah is placed before the letter yaa', it represents a long /iː/",
            "The ḍammah is a curl-like diacritic placed above a letter, and represents a short /u/",
            "When a ḍammah is placed before the letter waaw, it represents a long /uː/",
            "The sukuun is a circle-shaped diacritic placed above a letter. It indicates that the consonant to which it is attached is not followed by a vowel.",
            "The sukuun may also be used to help represent a diphthong. A fatḥah followed by the letter yaa' with a sukuun over it, indicates the diphthong /aj/",
            "The alif maqṣūrah looks like a dotless yaa' and may appear only at the end of a word. Although it looks different from a regular alif, it represents the same sound /aː/",
            "The maddah is a tilde-like diacritic, which can appear mostly on top of an alif and indicates a glottal stop /ʔ/ followed by a long /aː/",
            "The superscript alif is written as short vertical stroke on top of a consonant. It indicates a long /aː/ sound for which alif is normally not written.",
            "The waṣlah looks like a small letter saad on top of an alif. It means that the alif is not pronounced.",
            "The shaddah is a diacritic shaped like a small Latin \"w\". It is used to indicate gemination (consonant doubling or extra length). It is written above the consonant which is to be doubled.",
            "When a shaddah and a kasrah are used on a consonant at the same time, the kasrah is written under the shaddah rather than under the consonant.",
            "This diacritic is used at the end of a word and marks the nominative case. It represents the sound /un/",
            "This diacritic is used at the end of a word and marks the accusative case. It represents the sound /an/ and is often followed by alif.",
            "This diacritic is used at the end of a word and marks the genitive case. It represents the sound /in/",
            "Taa' marbūṭah is used at the end of words to mark feminine gender for nouns and adjectives. Historically, it was pronounced as the /t/ sound in all positions, but in coda positions it eventually developed into a weakly aspirated /h/ sound.",
            "Hamza is a letter in the Arabic alphabet, representing the glottal stop.",
            "Hamza is not one of the 28 \"full\" letters, and owes its existence to historical inconsistencies in the standard writing system. Alif was used to express both a glottal stop and a long vowel /aː/. To indicate that a glottal stop, and not a mere vowel, was intended, hamza was added diacritically to alif."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_tips);
        adapter = new Tips_And_Notes_Adapter(arabic_letter, pronunciation, text);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
    }
}
