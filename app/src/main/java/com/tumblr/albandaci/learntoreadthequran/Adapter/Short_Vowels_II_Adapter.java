package com.tumblr.albandaci.learntoreadthequran.Adapter;


import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tumblr.albandaci.learntoreadthequran.R;

public class Short_Vowels_II_Adapter extends RecyclerView.Adapter<Short_Vowels_II_Adapter.AlphabetViewHolder> {

    String [] arabic_letter, transliteration, english_letter;

    public Short_Vowels_II_Adapter (String [] arabic_letter, String [] transliteration, String [] english_letter) {

        this.arabic_letter = arabic_letter;
        this.transliteration = transliteration;
        this.english_letter = english_letter;

    }

    @Override
    public AlphabetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.alphabet_list,parent,false);
        AlphabetViewHolder alphabetViewHolder = new AlphabetViewHolder(view);
        return alphabetViewHolder;
    }

    @Override
    public void onBindViewHolder(AlphabetViewHolder holder, int position) {

        holder.arabic_letter2.setText(arabic_letter [position]);
        holder.transliteration2.setText(transliteration [position]);
        holder.english_letter2.setText(english_letter [position]);

    }

    @Override
    public int getItemCount() { return arabic_letter.length; }

    public static class AlphabetViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView arabic_letter2, transliteration2, english_letter2;

        private final Context context;

        public AlphabetViewHolder (View view) {

            super(view);
            view.setOnClickListener((View.OnClickListener) this);
            context = view.getContext();

            arabic_letter2 = (TextView) view.findViewById(R.id.arabic_letter);
            transliteration2 = (TextView) view.findViewById(R.id.transliteration);
            english_letter2 = (TextView) view.findViewById(R.id.english_letter);

        }

        @Override
        public void onClick (View v) {
            if (getLayoutPosition() == 0) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.da);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 1) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.di);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 2) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.du);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 3) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.dha);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 4) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.dhi);
                mediaPlayer.start();
            } else if(getLayoutPosition() == 5) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.dhu);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 6) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.ra);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 7) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.ri);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 8) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.ru);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 9) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.za);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 10) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.zi);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 11) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.zu);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 12) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.sa);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 13) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.si);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 14) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.su);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 15) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.sha);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 16) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.shi);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 17) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.shu);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 18) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.ssa);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 19) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.ssi);
                mediaPlayer.start();
            } else if (getLayoutPosition() == 20) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.ssu);
                mediaPlayer.start();
            } else {
                final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.da);
                mediaPlayer.start();
            }
        }

    }
}