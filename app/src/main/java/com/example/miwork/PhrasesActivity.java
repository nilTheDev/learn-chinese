package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.WorkSource;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    WordAdapter wordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_activity);

        ArrayList<Word> wordList = new ArrayList<>();
        wordList.add(new Word("谢谢", "Thank You", R.raw.phrase_thank_you));
        wordList.add(new Word("不用谢", "You’re welcome", R.raw.phrase_you_are_welcome));
        wordList.add(new Word("你好", "Hello", R.raw.phrase_hello));
        wordList.add(new Word("你好吗", "How are you?", R.raw.phrase_how_are_you));
        wordList.add(new Word("好", "OK", R.raw.phrase_ok));
        wordList.add(new Word("不好", "Not Good", R.raw.phrase_not_good));
        wordList.add(new Word("请问", "I’m sorry", R.raw.phrase_i_am_sorry));
        wordList.add(new Word("对不起", "May I ask…", R.raw.phrase_may_i_ask));
        wordList.add(new Word("你会说英语吗", "Do you speak English?", R.raw.phrase_do_you_speak_english));
        wordList.add(new Word("救命", "Help!", R.raw.phrase_help));
        wordList.add(new Word("早上好", "Good Morning", R.raw.phrase_good_morning));

        wordAdapter = new WordAdapter(this, wordList, R.color.category_phrases);
        ListView listView = findViewById(R.id.activityListView);
        listView.setAdapter(wordAdapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        wordAdapter.releaseMediaPlayer();
    }
}