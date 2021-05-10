package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    WordAdapter wordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_activity);

        ArrayList<Word> wordList = new ArrayList<>();
        wordList.add(new Word("一", "one",R.raw.number_one , R.drawable.number_one));
        wordList.add(new Word("二", "two",R.raw.number_two ,R.drawable.number_two));
        wordList.add(new Word("三", "three",R.raw.number_three ,R.drawable.number_three));
        wordList.add(new Word("四", "four", R.raw.number_four,R.drawable.number_four));
        wordList.add(new Word("五", "five", R.raw.number_five, R.drawable.number_five));
        wordList.add(new Word("六", "six", R.raw.number_six, R.drawable.number_six));
        wordList.add(new Word("七", "seven", R.raw.number_seven , R.drawable.number_seven));
        wordList.add(new Word("八", "eight", R.raw.number_eight ,R.drawable.number_eight));
        wordList.add(new Word("九", "nine", R.raw.number_nine ,R.drawable.number_nine));
        wordList.add(new Word("十", "ten", R.raw.number_ten ,R.drawable.number_nine));

        wordAdapter = new WordAdapter(this, wordList, R.color.category_numbers);

        ListView listView = findViewById(R.id.activityListView);

        listView.setAdapter(wordAdapter);


    }

    @Override
    protected void onStop() {
        super.onStop();
        wordAdapter.releaseMediaPlayer();
    }

}