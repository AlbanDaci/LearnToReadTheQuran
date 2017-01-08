package com.tumblr.albandaci.learntoreadthequran;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tumblr.albandaci.learntoreadthequran.Surahs.*;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {


    String [] ordinal_number, latin_arabic, english, arabic;

    public RecyclerAdapter (String [] ordinal_number, String [] latin_arabic, String [] english, String [] arabic) {

        this.ordinal_number = ordinal_number;
        this.latin_arabic = latin_arabic;
        this.english = english;
        this.arabic = arabic;

    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quran_list,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.o_number.setText(ordinal_number [position]);
        holder.l_arabic.setText(latin_arabic [position]);
        holder.english2.setText(english [position]);
        holder.arabic2.setText(arabic [position]);
    }

    @Override
    public int getItemCount() {
        return ordinal_number.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView o_number, l_arabic, english2, arabic2;

        private final Context context;

        public RecyclerViewHolder (View view) {

            super (view);
            view.setOnClickListener((View.OnClickListener) this);
            context = view.getContext();

            o_number = (TextView) view.findViewById(R.id.ordinal_number);
            l_arabic = (TextView) view.findViewById(R.id.latin_arabic);
            english2 = (TextView) view.findViewById(R.id.english);
            arabic2 = (TextView) view.findViewById(R.id.arabic);

        }


        @Override
        public void onClick (View v) {
            if (getLayoutPosition() == 0) {
                context.startActivity(new Intent(context, Al_Fatihah.class));
            } else if (getLayoutPosition() == 1){
                context.startActivity(new Intent(context, Al_Baqarah.class));
            } else if (getLayoutPosition() == 2){
                context.startActivity(new Intent(context, Ali_Imran.class));
            } else if (getLayoutPosition() == 3) {
                context.startActivity(new Intent(context, An_Nisa.class));
            } else if (getLayoutPosition() == 4) {
                context.startActivity(new Intent(context, Al_Maidah.class));
            } else if (getLayoutPosition() == 5) {
                context.startActivity(new Intent(context, Al_Anam.class));
            } else if (getLayoutPosition() == 6) {
                context.startActivity(new Intent(context, Al_Araf.class));
            } else if (getLayoutPosition() == 7) {
                context.startActivity(new Intent(context, Al_Anfal.class));
            } else if (getLayoutPosition() == 8) {
                context.startActivity(new Intent(context, At_Tawbah.class));
            } else if (getLayoutPosition() == 9) {
                context.startActivity(new Intent(context, Yunus.class));
            } else if (getLayoutPosition() == 10){
                context.startActivity(new Intent(context, Hud.class));
            } else if (getLayoutPosition() == 11) {
                context.startActivity(new Intent(context, Yusuf.class));
            } else if (getLayoutPosition() == 12) {
                context.startActivity(new Intent(context, Ar_Rad.class));
            } else if (getLayoutPosition() == 13) {
                context.startActivity(new Intent(context, Ibrahim.class));
            } else if (getLayoutPosition() == 14) {
                context.startActivity(new Intent(context, Al_Hijr.class));
            } else if (getLayoutPosition() == 15) {
                context.startActivity(new Intent(context, An_Nahl.class));
            } else if (getLayoutPosition() == 16) {
                context.startActivity(new Intent(context, Al_Isra.class));
            } else if (getLayoutPosition() == 17) {
                context.startActivity(new Intent(context, Al_Kahf.class));
            } else if (getLayoutPosition() == 18) {
                context.startActivity(new Intent(context, Maryam.class));
            } else if (getLayoutPosition() == 19) {
                context.startActivity(new Intent(context, Taha.class));
            } else if (getLayoutPosition() == 20){
                context.startActivity(new Intent(context, Al_Anbya.class));
            } else if (getLayoutPosition() == 21) {
                context.startActivity(new Intent(context, Al_Haj.class));
            } else if (getLayoutPosition() == 22) {
                context.startActivity(new Intent(context, Al_Muminun.class));
            } else if (getLayoutPosition() == 23) {
                context.startActivity(new Intent(context, An_Nur.class));
            } else if (getLayoutPosition() == 24) {
                context.startActivity(new Intent(context, Al_Furqan.class));
            } else if (getLayoutPosition() == 25) {
                context.startActivity(new Intent(context, Ash_Shuara.class));
            } else if (getLayoutPosition() == 26) {
                context.startActivity(new Intent(context, An_Naml.class));
            } else if (getLayoutPosition() == 27) {
                context.startActivity(new Intent(context, Al_Qasas.class));
            } else if (getLayoutPosition() == 28) {
                context.startActivity(new Intent(context, Al_Ankabut.class));
            } else if (getLayoutPosition() == 29) {
                context.startActivity(new Intent(context, Ar_Rum.class));
            } else if (getLayoutPosition() == 30){
                context.startActivity(new Intent(context, Luqman.class));
            } else if (getLayoutPosition() == 31) {
                context.startActivity(new Intent(context, As_Sajdah.class));
            } else if (getLayoutPosition() == 32) {
                context.startActivity(new Intent(context, Al_Ahzab.class));
            } else if (getLayoutPosition() == 33) {
                context.startActivity(new Intent(context, Saba.class));
            } else if (getLayoutPosition() == 34) {
                context.startActivity(new Intent(context, Fatir.class));
            } else if (getLayoutPosition() == 35) {
                context.startActivity(new Intent(context, Ya_Sin.class));
            } else if (getLayoutPosition() == 36) {
                context.startActivity(new Intent(context, As_Saffat.class));
            } else if (getLayoutPosition() == 37) {
                context.startActivity(new Intent(context, Sad.class));
            } else if (getLayoutPosition() == 38) {
                context.startActivity(new Intent(context, Az_Zumar.class));
            } else if (getLayoutPosition() == 39) {
                context.startActivity(new Intent(context, Ghafir.class));
            } else if (getLayoutPosition() == 40){
                context.startActivity(new Intent(context, Fussilat.class));
            } else if (getLayoutPosition() == 41) {
                context.startActivity(new Intent(context, Ash_Shuraa.class));
            } else if (getLayoutPosition() == 42) {
                context.startActivity(new Intent(context, Az_Zukhruf.class));
            } else if (getLayoutPosition() == 43) {
                context.startActivity(new Intent(context, Ad_Dukhan.class));
            } else if (getLayoutPosition() == 44) {
                context.startActivity(new Intent(context, Al_Jathiyah.class));
            } else if (getLayoutPosition() == 45) {
                context.startActivity(new Intent(context, Al_Ahqaf.class));
            } else if (getLayoutPosition() == 46) {
                context.startActivity(new Intent(context, Muhammad.class));
            } else if (getLayoutPosition() == 47) {
                context.startActivity(new Intent(context, Al_Fath.class));
            } else if (getLayoutPosition() == 48) {
                context.startActivity(new Intent(context, Al_Hujurat.class));
            } else if (getLayoutPosition() == 49) {
                context.startActivity(new Intent(context, Qaf.class));
            } else if (getLayoutPosition() == 50){
                context.startActivity(new Intent(context, Adh_Dhariyat.class));
            } else if (getLayoutPosition() == 51) {
                context.startActivity(new Intent(context, At_Tur.class));
            } else if (getLayoutPosition() == 52) {
                context.startActivity(new Intent(context, An_Najm.class));
            } else if (getLayoutPosition() == 53) {
                context.startActivity(new Intent(context, Al_Qamar.class));
            } else if (getLayoutPosition() == 54) {
                context.startActivity(new Intent(context, Ar_Rahman.class));
            } else if (getLayoutPosition() == 55) {
                context.startActivity(new Intent(context, Al_Waqiah.class));
            } else if (getLayoutPosition() == 56) {
                context.startActivity(new Intent(context, Al_Hadid.class));
            } else if (getLayoutPosition() == 57) {
                context.startActivity(new Intent(context, Al_Mujadila.class));
            } else if (getLayoutPosition() == 58) {
                context.startActivity(new Intent(context, Al_Hashr.class));
            } else if (getLayoutPosition() == 59) {
                context.startActivity(new Intent(context, Al_Mumtahanah.class));
            } else if (getLayoutPosition() == 60) {
                context.startActivity(new Intent(context, As_Saf.class));
            } else if (getLayoutPosition() == 61) {
                context.startActivity(new Intent(context, Al_Jumuah.class));
            } else if (getLayoutPosition() == 62) {
                context.startActivity(new Intent(context, Al_Munafiqun.class));
            } else if (getLayoutPosition() == 63) {
                context.startActivity(new Intent(context, At_Taghabun.class));
            } else if (getLayoutPosition() == 64) {
                context.startActivity(new Intent(context, At_Talaq.class));
            } else if (getLayoutPosition() == 65) {
                context.startActivity(new Intent(context, At_Tahrim.class));
            } else if (getLayoutPosition() == 66) {
                context.startActivity(new Intent(context, Al_Mulk.class));
            } else if (getLayoutPosition() == 67) {
                context.startActivity(new Intent(context, Al_Qalam.class));
            } else if (getLayoutPosition() == 68) {
                context.startActivity(new Intent(context, Al_Haqqah.class));
            } else if (getLayoutPosition() == 69) {
                context.startActivity(new Intent(context, Al_Maarij.class));
            } else if (getLayoutPosition() == 70){
                context.startActivity(new Intent(context, Nuh.class));
            } else if (getLayoutPosition() == 71) {
                context.startActivity(new Intent(context, Al_Jinn.class));
            } else if (getLayoutPosition() == 72) {
                context.startActivity(new Intent(context, Al_Muzzammil.class));
            } else if (getLayoutPosition() == 73) {
                context.startActivity(new Intent(context, Al_Muddaththir.class));
            } else if (getLayoutPosition() == 74) {
                context.startActivity(new Intent(context, Al_Qiyamah.class));
            } else if (getLayoutPosition() == 75) {
                context.startActivity(new Intent(context, Al_Insan.class));
            } else if (getLayoutPosition() == 76) {
                context.startActivity(new Intent(context, Al_Mursalat.class));
            } else if (getLayoutPosition() == 77) {
                context.startActivity(new Intent(context, An_Naba.class));
            } else if (getLayoutPosition() == 78) {
                context.startActivity(new Intent(context, An_Naziat.class));
            } else if (getLayoutPosition() == 79) {
                context.startActivity(new Intent(context, Abasa.class));
            } else if (getLayoutPosition() == 80){
                context.startActivity(new Intent(context, At_Takwir.class));
            } else if (getLayoutPosition() == 81) {
                context.startActivity(new Intent(context, Al_Infitar.class));
            } else if (getLayoutPosition() == 82) {
                context.startActivity(new Intent(context, Al_Mutaffifin.class));
            } else if (getLayoutPosition() == 83) {
                context.startActivity(new Intent(context, Al_Inshiqaq.class));
            } else if (getLayoutPosition() == 84) {
                context.startActivity(new Intent(context, Al_Buruj.class));
            } else if (getLayoutPosition() == 85) {
                context.startActivity(new Intent(context, At_Tariq.class));
            } else if (getLayoutPosition() == 86) {
                context.startActivity(new Intent(context, Al_Ala.class));
            } else if (getLayoutPosition() == 87) {
                context.startActivity(new Intent(context, Al_Ghashiyah.class));
            } else if (getLayoutPosition() == 88) {
                context.startActivity(new Intent(context, Al_Fajr.class));
            } else if (getLayoutPosition() == 89) {
                context.startActivity(new Intent(context, Al_Balad.class));
            } else if (getLayoutPosition() == 90) {
                context.startActivity(new Intent(context, Ash_Shams.class));
            } else if (getLayoutPosition() == 91) {
                context.startActivity(new Intent(context, Al_Layl.class));
            } else if (getLayoutPosition() == 92) {
                context.startActivity(new Intent(context, Ad_Duhaa.class));
            } else if (getLayoutPosition() == 93) {
                context.startActivity(new Intent(context, Ash_Sharh.class));
            } else if (getLayoutPosition() == 94) {
                context.startActivity(new Intent(context, At_Tin.class));
            } else if (getLayoutPosition() == 95) {
                context.startActivity(new Intent(context, Al_Alaq.class));
            } else if (getLayoutPosition() == 96) {
                context.startActivity(new Intent(context, Al_Qadr.class));
            } else if (getLayoutPosition() == 97) {
                context.startActivity(new Intent(context, Al_Bayyinah.class));
            } else if (getLayoutPosition() == 98) {
                context.startActivity(new Intent(context, Az_Zalzalah.class));
            } else if (getLayoutPosition() == 99) {
                context.startActivity(new Intent(context, Al_Adiyat.class));
            } else if (getLayoutPosition() == 100) {
                context.startActivity(new Intent(context, Al_Qariah.class));
            } else if (getLayoutPosition() == 101) {
                context.startActivity(new Intent(context, At_Takathur.class));
            } else if (getLayoutPosition() == 102) {
                context.startActivity(new Intent(context, Al_Asr.class));
            } else if (getLayoutPosition() == 103) {
                context.startActivity(new Intent(context, Al_Humazah.class));
            } else if (getLayoutPosition() == 104) {
                context.startActivity(new Intent(context, Al_Fil.class));
            } else if (getLayoutPosition() == 105) {
                context.startActivity(new Intent(context, Quraysh.class));
            } else if (getLayoutPosition() == 106) {
                context.startActivity(new Intent(context, Al_Maun.class));
            } else if (getLayoutPosition() == 107) {
                context.startActivity(new Intent(context, Al_Kawthar.class));
            } else if (getLayoutPosition() == 108) {
                context.startActivity(new Intent(context, Al_Kafirun.class));
            } else if (getLayoutPosition() == 109) {
                context.startActivity(new Intent(context, An_Nasr.class));
            } else if (getLayoutPosition() == 110) {
                context.startActivity(new Intent(context, Al_Masad.class));
            } else if (getLayoutPosition() == 111) {
                context.startActivity(new Intent(context, Al_Ikhlas.class));
            } else if (getLayoutPosition() == 112) {
                context.startActivity(new Intent(context, Al_Falaq.class));
            } else if (getLayoutPosition() == 113) {
                context.startActivity(new Intent(context, An_Nas.class));
            } else {
                context.startActivity(new Intent(context, Menu.class));
            }
        }
    }
}
