package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    WordAdapter wordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_activity);

        ArrayList<Word> wordList = new ArrayList<>();
        wordList.add(new Word("父亲", "father", R.raw.family_father, R.drawable.family_father));
        wordList.add(new Word("母亲", "mother", R.raw.family_mother, R.drawable.family_mother));
        wordList.add(new Word("儿子", "son", R.raw.family_son, R.drawable.family_son));
        wordList.add(new Word("女儿", "daughter", R.raw.family_daughter, R.drawable.family_daughter));
        wordList.add(new Word("哥哥", "older brother", R.raw.family_older_brother, R.drawable.family_older_brother));
        wordList.add(new Word("姐姐", "older sister", R.raw.family_older_sister, R.drawable.family_older_sister));
        wordList.add(new Word("弟弟", "younger brother", R.raw.family_younger_brother, R.drawable.family_younger_brother));
        wordList.add(new Word("妹妹", "younger sister", R.raw.family_younger_sister, R.drawable.family_younger_sister));
        wordList.add(new Word("祖父", "grandfather", R.raw.family_grandfather, R.drawable.family_grandfather));
        wordList.add(new Word("祖母", "grandmother", R.raw.family_grandmother, R.drawable.family_grandmother));


        wordAdapter = new WordAdapter(this, wordList, R.color.category_family);
        ListView listView = findViewById(R.id.activityListView);
        listView.setAdapter(wordAdapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        wordAdapter.releaseMediaPlayer();
    }
}