package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    WordAdapter wordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_activity);

        ArrayList<Word> wordList = new ArrayList<>();
        wordList.add(new Word("红色", "red", R.raw.color_red, R.drawable.color_red));
        wordList.add(new Word("绿色", "green", R.raw.color_green, R.drawable.color_green));
        wordList.add(new Word("咖啡色", "brown", R.raw.color_brown, R.drawable.color_brown));
        wordList.add(new Word("灰色", "grey", R.raw.color_grey, R.drawable.color_gray));
        wordList.add(new Word("白色", "white", R.raw.color_white, R.drawable.color_white));
        wordList.add(new Word("黄色", "yellow", R.raw.color_yellow, R.drawable.color_dusty_yellow));

        wordList.add(new Word("蓝色", "blue", R.raw.color_blue, R.drawable.color_blue));
        wordList.add(new Word("橘色", "orange", R.raw.color_orange, R.drawable.color_orange));
        wordList.add(new Word("黑色", "black", R.raw.color_black, R.drawable.color_black));
        wordList.add(new Word("紫色", "purple", R.raw.color_purple, R.drawable.color_purple));


        wordAdapter = new WordAdapter(this, wordList, R.color.category_colors);
        ListView listView = findViewById(R.id.activityListView);
        listView.setAdapter(wordAdapter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        wordAdapter.releaseMediaPlayer();
    }
}