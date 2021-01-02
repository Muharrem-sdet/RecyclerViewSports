package com.example.recyclerviewsports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SportExplanationActivity extends AppCompatActivity {

    private ImageView sportImage2;
    private TextView sportTitle2;
    private TextView sportExplanation;
    private int position;
    private final String LOG_TAG = "SportExplanation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_explanation);

        sportImage2 = findViewById(R.id.sport_image_2);
        sportTitle2 = findViewById(R.id.sport_title_2);
        sportExplanation = findViewById(R.id.sport_explanation);

        Intent intent = getIntent();
        position = intent.getIntExtra("Extra_position", -1);

        if(position == -1){
            Log.d(LOG_TAG, "Invalid position or no position");
        } else{
            String[] sportTitle = getResources().getStringArray(R.array.sport_title);
            String[] sportExplanations = getResources().getStringArray(R.array.sport_explanation);
            String[] sportImageName = getResources().getStringArray(R.array.sport_image_name);
            sportTitle2.setText(sportTitle[position]);
            sportExplanation.setText(sportExplanations[position]);
            int imageId = getResources().getIdentifier(sportImageName[position], "drawable", getPackageName());
            sportImage2.setImageResource(imageId);
        }

    }
}