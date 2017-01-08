package com.tumblr.albandaci.learntoreadthequran.Adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tumblr.albandaci.learntoreadthequran.R;

public class Al_Fatihah_Adapter extends RecyclerView.Adapter<Al_Fatihah_Adapter.AlFatihahViewHolder> {

    String [] verses, arabic_verses, sahih_international, english_verses;

    public Al_Fatihah_Adapter (String [] verses, String [] arabic_verses, String [] sahih_international, String [] english_verses) {

        this.verses = verses;
        this.arabic_verses = arabic_verses;
        this.sahih_international = sahih_international;
        this.english_verses = english_verses;

    }

    @Override
    public AlFatihahViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ayahs_list,parent,false);
        AlFatihahViewHolder alFatihahViewHolder = new AlFatihahViewHolder(view);
        return alFatihahViewHolder;
    }

    @Override
    public void onBindViewHolder(AlFatihahViewHolder holder, int position) {

        holder.verses2.setText(verses [position]);
        holder.arabic_verses2.setText(arabic_verses [position]);
        holder.sahih_international2.setText(sahih_international [position]);
        holder.english_verses2.setText(english_verses [position]);

    }

    @Override
    public int getItemCount() {
        return verses.length;
    }

    public static class AlFatihahViewHolder extends RecyclerView.ViewHolder {

        TextView verses2, arabic_verses2, sahih_international2, english_verses2;

        public AlFatihahViewHolder(View view) {

            super (view);
            verses2 = (TextView) view.findViewById(R.id.verses);
            arabic_verses2 = (TextView) view.findViewById(R.id.arabic_verses);
            sahih_international2 = (TextView) view.findViewById(R.id.sahih_internaitonal);
            english_verses2 = (TextView) view.findViewById(R.id.english_verses);

        }
    }
}
