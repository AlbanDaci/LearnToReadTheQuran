package com.tumblr.albandaci.learntoreadthequran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Quran extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    String [] ordinal_number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
    "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35",
    "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54",
    "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73",
    "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92",
    "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110",
    "111", "112", "113", "114", ""};

    String [] latin_arabic = {"Al-Fatihah", "Al-Baqarah", "Ali 'Imran", "An-Nisa", "Al-Ma'idah", "Al-An'am", "Al-A'raf",
    "Al-Anfal", "At-Tawbah", "Yunus", "Hud", "Yusuf", "Ar-Ra'd", "Ibrahim", "Al-Hijr", "An-Nahl", "Al-Isra", "Al-Kahf",
    "Maryam", "Taha", "Al-Anbya", "Al-Haj", "Al-Mu'minun", "An-Nur", "Al-Furqan", "Ash-Shu'ara", "An-Naml", "Al-Qasas",
    "Al-'Ankabut", "Ar-Rum", "Luqman", "As-Sajdah", "Al-Ahzab", "Saba", "Fatir", "Ya-Sin", "As-Saffat", "Sad", "Az-Zumar",
    "Ghafir", "Fussilat", "Ash-Shuraa", "Az-Zukhruf", "Ad-Dukhan", "Al-Jathiyah", "Al-Ahqaf", "Muhammad", "Al-Fath", "Al-Hujurat",
    "Qaf", "Adh-Dhariyat", "At-Tur", "An-Najm", "Al-Qamar", "Ar-Rahman", "Al-Waqi'ah", "Al-Hadid", "Al-Mujadila", "Al-Hashr",
    "Al-Mumtahanah", "As-Saf", "Al-Jumu'ah", "Al-Munafiqun", "At-Taghabun", "At-Talaq", "At-Tahrim", "Al-Mulk", "Al-Qalam",
    "Al-Haqqah", "Al-Ma'arij", "Nuh", "Al-Jinn", "Al-Muzzammil", "Al-Muddaththir", "Al-Qiyamah", "Al-Insan", "Al-Mursalat",
    "An-Naba", "An-Nazi'at", "'Abasa", "At-Takwir", "Al-Infitar", "Al-Mutaffifin", "Al-Inshiqaq", "Al-Buruj", "At-Tariq",
    "Al-A'la", "Al-Ghashiyah", "Al-Fajr", "Al-Balad", "Ash-Shams", "Al-Layl", "Ad-Duhaa", "Ash-Sharh", "At-Tin", "Al-'Alaq",
    "Al-Qadr", "Al-Bayyinah", "Az-Zalzalah", "Al-'Adiyat", "Al-Qari'ah", "At-Takathur", "Al-'Asr", "Al-Humazah", "Al-Fil",
    "Quraysh", "Al-Ma'un", "Al-Kawthar", "Al-Kafirun", "An-Nasr", "Al-Masad", "Al-Ikhlas", "Al-Falaq", "An-Nas", ""};

    String [] english = {"THE OPENER", "THE COW", "FAMILY OF IMRAN", "THE WOMEN", "THE TABLE SPREAD", "THE CATTLE",
    "THE HEIGHTS", "THE SPOILS OF WAR", "THE REPENTANCE", "JONAH", "HUD", "JOSEPH", "THE THUNDER", "ABRAHIM", "THE ROCKY TRACT",
    "THE BEE", "THE NIGHT JOURNEY", "THE CAVE", "MARY", "TA-HA", "THE PROPHETS", "THE PILGRIMAGE", "THE BELIEVERS", "THE LIGHT",
    "THE CRITERIAN", "THE POETS", "THE ANT", "THE STORIES", "THE SPIDER", "THE ROMANS", "LUQMAN", "THE PROSTRATION",
    "THE COMBINED FORCES", "SHEBA", "ORIGINATOR", "YA SIN", "THOSE WHO SET THE RANKS", "THE LETTER 'SAAD'", "THE TROOPS",
    "THE FORGIVER", "EXPLAINED IN DETAIL", "THE CONSULTATION", "THE ORNAMENTS OF GOLD", "THE SMOKE", "THE CROUCHING",
    "THE WIND-CURVED SANDHILLS", "MUHAMMAD", "THE VICTORY", "THE ROOMS", "THE LETTER 'QAF'", "THE WINNOWING WINDS", "THE MOUNT",
    "THE STAR", "THE MOON", "THE BENEFICENT", "THE INEVITABLE", "THE IRON", "THE PLEADING WOMAN", "THE EXILE",
    "SHE THAT IS TO BE EXAMINED", "THE RANKS", "THE CONGREGATION, FRIDAY", "THE HYPOCRITES", "THE MUTUAL DISILLUSION",
    "THE DIVORCE", "THE PROHIBITION", "THE SOVEREIGNTY", "THE PEN", "THE REALITY", "THE ASCENDING STAIRWAYS", "NOAH", "THE JINN",
    "THE ENSHROUDED ONE", "THE CLOAKED ONE", "THE RESURRECTION", "THE MAN", "THE EMISSARIES", "THE TIDINGS", "THOSE WHO DRAG FORTH",
    "HE FROWNED", "THE OVERTHROWING", "THE CLEAVING", "THE DEFRAUDING", "THE SUNDERING", "THE MANSIONS OF THE STARS", "THE NIGHTCOMMER",
    "THE MOST HIGH", "THE OVERWHELMING", "THE DAWN", "THE CITY", "THE SUN", "THE NIGHT", "THE MORNING HOURS", "THE RELIEF", "THE FIG",
    "THE CLOT", "THE POWER", "THE CLEAR PROOF", "THE EARTHQUAKE", "THE COURSER", "THE CALAMITY", "THE RIVALRY IN WORLD INCREASE",
    "THE DECLINING DAY", "THE TRADUCER", "THE ELEPHANT", "QURAYSH", "THE SMALL KINDESSES", "THE ABUNDANCE", "THE DISBELIEVERS",
    "THE DIVINE SUPPORT", "THE PALM FIBER", "THE SINCERITY", "THE DAYBREAK", "THE MANKIND", ""};

    String [] arabic = {"الفاتحة", "البقرة", "آل عمران", "النساء", "المائدة", "الأنعام", "الأعراف", "الأنفال",
    "التوبة", "يونس", "هود", "يوسف", "الرعد", "ابراهيم", "الحجر", " النحل", "الإسراء", "الكهف", "مريم", "طه", "الأنبياء",
    "الحج", "المؤمنون", "النور", "الفرقان", "الشعراء", "النمل", "القصص", "العنكبوت", "الروم", "لقمان", "السجدة", "الأحزاب",
    "سبإ", "فاطر", "يس", "الصافات", "ص", "الزمر", "غافر", "فصلت", "الشورى", " الزخرف", "الدخان", "الجاثية", " الأحقاف",
    "محمد", " الفتح", "الحجرات", "ق", "الذاريات", "الطور", "النجم", "القمر", "الرحمن", "الواقعة", "الحديد", "المجادلة",
    "الحشر", "الممتحنة", "الصف", "الجمعة", "المنافقون", "التغابن", "الطلاق", "التحريم", "الملك", "القلم", "الحاقة", "المعارج",
    "نوح", "الجن", "المزمل", "المدثر", "القيامة", "الانسان", "المرسلات", "النبإ", "النازعات", "عبس", "التكوير", "الإنفطار",
    "المطففين", "الإنشقاق", " البروج", "الطارق", " الأعلى", "الغاشية", "الفجر", "البلد", "الشمس", " الليل", "الضحى", "الشرح",
    "التين", "العلق", "القدر", "البينة", "الزلزلة", "العاديات", "القارعة", "التكاثر", "العصر", "الهمزة", "الفيل", " قريش",
    "الماعون", " الكوثر", "الكافرون", "النصر", "المسد", "الإخلاص", "الفلق", "الناس", ""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new RecyclerAdapter(ordinal_number, latin_arabic, english, arabic);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize (true);
        recyclerView.setAdapter (adapter);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
