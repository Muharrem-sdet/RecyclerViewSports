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
    private Sport sport;
    private final String LOG_TAG = "SportExplanation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_explanation);

        sportImage2 = findViewById(R.id.sport_image_2);
        sportTitle2 = findViewById(R.id.sport_title_2);
        sportExplanation = findViewById(R.id.sport_explanation);

        Intent intent = getIntent();
        sport = (Sport)intent.getSerializableExtra("Extra_sport");

        try {
            sportTitle2.setText(sport.sportTitle);
            sportExplanation.setText(sport.sportExplanation);
            sportImage2.setImageResource(sport.sportImageId);
        } catch (Exception e) {
            Log.d(LOG_TAG, "Invalid sport or no sport retrieved from MainActivity");
        }
    }
}