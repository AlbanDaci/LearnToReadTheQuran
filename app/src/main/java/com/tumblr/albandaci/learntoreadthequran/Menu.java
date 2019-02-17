package com.tumblr.albandaci.learntoreadthequran;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private static Button Quran_button;
    private static Button Quiz_button;
    private static Button Rate_button;
    private static Button Tips_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        OnClickButtonListenerQuran();
        OnClickButtonListenerQuiz();
        OnClickButtonListenerRate();
        OnClickButtonListenerTips();
    }

    public void OnClickButtonListenerQuran() {
        Quran_button = (Button) findViewById(R.id.QuranButton);
        Quran_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.tumblr.albandaci.learntoreadthequran.Quran");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickButtonListenerTips() {
        Tips_button = (Button) findViewById(R.id.TipsAndNotesButton);
        Tips_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.tumblr.albandaci.learntoreadthequran.Tips");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickButtonListenerQuiz() {
        Quiz_button = (Button) findViewById(R.id.QuizButton);
        Quiz_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.tumblr.albandaci.learntoreadthequran.LearnToRead");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickButtonListenerRate() {
        Rate_button = (Button) findViewById(R.id.RateButton);
        Rate_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.tumblr.albandaci.learntoreadthequran")));
                    }
                }
        );
    }
}