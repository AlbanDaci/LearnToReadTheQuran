package com.tumblr.albandaci.learntoreadthequran.Adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tumblr.albandaci.learntoreadthequran.R;

public class Tips_And_Notes_Adapter extends RecyclerView.Adapter<Tips_And_Notes_Adapter.Tips_And_Notes_ViewHolder> {

    String [] arabic_letter, pronunciation, text;

    public Tips_And_Notes_Adapter (String [] arabic_letter, String [] pronunciation, String [] text) {

        this.arabic_letter = arabic_letter;
        this.pronunciation = pronunciation;
        this.text = text;

    }

    @Override
    public Tips_And_Notes_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tips_and_notes_list,parent,false);
        Tips_And_Notes_ViewHolder tips_and_notes_viewHolder = new Tips_And_Notes_ViewHolder(view);
        return tips_and_notes_viewHolder;
    }

    @Override
    public void onBindViewHolder(Tips_And_Notes_ViewHolder holder, int position) {

        holder.arabic_letter2.setText(arabic_letter [position]);
        holder.pronunciation2.setText(pronunciation [position]);
        holder.text2.setText(text [position]);

    }

    @Override
    public int getItemCount() {return arabic_letter.length;}

    public static class Tips_And_Notes_ViewHolder extends RecyclerView.ViewHolder {

        TextView arabic_letter2, pronunciation2, text2;

        public Tips_And_Notes_ViewHolder(View view) {

            super (view);
            arabic_letter2 = (TextView) view.findViewById(R.id.arabic_letter);
            pronunciation2 = (TextView) view.findViewById(R.id.pronunciation);
            text2 = (TextView) view.findViewById(R.id.text);

        }
    }
}
