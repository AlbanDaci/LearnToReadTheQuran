package com.tumblr.albandaci.learntoreadthequran.Adapter;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Advanced_Words_I;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Advanced_Words_II;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Advanced_Words_III;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Advanced_Words_IV;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Alphabet_End;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Alphabet_Initial;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Alphabet_Middle;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Alphabet_Single;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Basic_Words_I;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Basic_Words_II;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Basic_Words_III;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Basic_Words_IV;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Definites;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Definites_Plural;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Indefinites_Accusative;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Indefinites_Genitive;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Indefinites_Nominative;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Intermediate_Words_I;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Intermediate_Words_II;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Intermediate_Words_III;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Intermediate_Words_IV;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Long_Vowels_I;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Long_Vowels_II;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Long_Vowels_III;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Long_Vowels_IV;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Short_Vowels_I;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Short_Vowels_II;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Short_Vowels_III;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Short_Vowels_IV;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Sukuun_I;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Sukuun_II;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Sukuun_III;
import com.tumblr.albandaci.learntoreadthequran.LearnToReadPackage.Sukuun_IV;
import com.tumblr.albandaci.learntoreadthequran.Menu;
import com.tumblr.albandaci.learntoreadthequran.R;

public class Learn_To_Read_Adapter extends RecyclerView.Adapter<Learn_To_Read_Adapter.LearnToReadViewHolder> {

    String [] number, alphabet_text;

    public Learn_To_Read_Adapter (String [] number, String[] alphabet_text) {

        this.number = number;
        this.alphabet_text = alphabet_text;

    }

    @Override
    public LearnToReadViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.learn_to_read_list,parent,false);
        LearnToReadViewHolder learnToReadViewHolder = new LearnToReadViewHolder(view);
        return learnToReadViewHolder;
    }

    @Override
    public void onBindViewHolder(LearnToReadViewHolder holder, int position) {

        holder.number2.setText(number [position]);
        holder.alphabet_text2.setText(alphabet_text [position]);

    }

    @Override
    public int getItemCount() {return number.length;}

    public static class LearnToReadViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView number2, alphabet_text2;

        private final Context context;

        public LearnToReadViewHolder(View view) {

            super(view);
            view.setOnClickListener((View.OnClickListener) this);
            context = view.getContext();

            number2 = (TextView) view.findViewById(R.id.number);
            alphabet_text2 = (TextView) view.findViewById(R.id.alphabet_text);
        }

        @Override
        public void onClick (View v) {
            if (getLayoutPosition() == 0) {
                context.startActivity(new Intent(context, Alphabet_Single.class));
            } else if (getLayoutPosition() == 1) {
                context.startActivity(new Intent(context, Alphabet_Initial.class));
            } else if (getLayoutPosition() == 2) {
                context.startActivity(new Intent(context, Alphabet_Middle.class));
            } else if (getLayoutPosition() == 3) {
                context.startActivity(new Intent(context, Alphabet_End.class));
            } else if (getLayoutPosition() == 4) {
                context.startActivity(new Intent(context, Short_Vowels_I.class));
            } else if (getLayoutPosition() == 5) {
                context.startActivity(new Intent(context, Short_Vowels_II.class));
            } else if (getLayoutPosition() == 6) {
                context.startActivity(new Intent(context, Short_Vowels_III.class));
            } else if (getLayoutPosition() == 7) {
                context.startActivity(new Intent(context, Short_Vowels_IV.class));
            } else if (getLayoutPosition() == 8) {
                context.startActivity(new Intent(context, Long_Vowels_I.class));
            } else if (getLayoutPosition() == 9) {
                context.startActivity(new Intent(context, Long_Vowels_II.class));
            } else if (getLayoutPosition() == 10) {
                context.startActivity(new Intent(context, Long_Vowels_III.class));
            } else if (getLayoutPosition() == 11) {
                context.startActivity(new Intent(context, Long_Vowels_IV.class));
            } else if (getLayoutPosition() == 12) {
                context.startActivity(new Intent(context, Sukuun_I.class));
            } else if (getLayoutPosition() == 13) {
                context.startActivity(new Intent(context, Sukuun_II.class));
            } else if (getLayoutPosition() == 14) {
                context.startActivity(new Intent(context, Sukuun_III.class));
            } else if (getLayoutPosition() == 15) {
                context.startActivity(new Intent(context, Sukuun_IV.class));
            } else if (getLayoutPosition() == 16) {
                context.startActivity(new Intent(context, Basic_Words_I.class));
            } else if (getLayoutPosition() == 17) {
                context.startActivity(new Intent(context, Basic_Words_II.class));
            } else if (getLayoutPosition() == 18) {
                context.startActivity(new Intent(context, Basic_Words_III.class));
            } else if (getLayoutPosition() == 19) {
                context.startActivity(new Intent(context, Basic_Words_IV.class));
            } else if (getLayoutPosition() == 20) {
                context.startActivity(new Intent(context, Intermediate_Words_I.class));
            } else if (getLayoutPosition() == 21) {
                context.startActivity(new Intent(context, Intermediate_Words_II.class));
            } else if (getLayoutPosition() == 22) {
                context.startActivity(new Intent(context, Intermediate_Words_III.class));
            } else if (getLayoutPosition() == 23) {
                context.startActivity(new Intent(context, Intermediate_Words_IV.class));
            } else if (getLayoutPosition() == 24) {
                context.startActivity(new Intent(context, Advanced_Words_I.class));
            } else if (getLayoutPosition() == 25) {
                context.startActivity(new Intent(context, Advanced_Words_II.class));
            } else if (getLayoutPosition() == 26) {
                context.startActivity(new Intent(context, Advanced_Words_III.class));
            } else if (getLayoutPosition() == 27) {
                context.startActivity(new Intent(context, Advanced_Words_IV.class));
            } else if (getLayoutPosition() == 28) {
                context.startActivity(new Intent(context, Indefinites_Nominative.class));
            } else if (getLayoutPosition() == 29) {
                context.startActivity(new Intent(context, Indefinites_Accusative.class));
            } else if (getLayoutPosition() == 30) {
                context.startActivity(new Intent(context, Indefinites_Genitive.class));
            } else if (getLayoutPosition() == 31) {
                context.startActivity(new Intent(context, Definites.class));
            } else if (getLayoutPosition() == 32) {
                context.startActivity(new Intent(context, Definites_Plural.class));
            } else {
                context.startActivity(new Intent(context, Menu.class));
            }
        }
    }
}
