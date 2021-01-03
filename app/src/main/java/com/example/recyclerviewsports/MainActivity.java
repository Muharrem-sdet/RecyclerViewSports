package com.example.recyclerviewsports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<Sport> sportList = new ArrayList<>();
    private RecyclerView recyclerView;
    private final String EXTRA_SPORT = getResources().getString(R.string.extra_sport);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        populateSportList();

        MyOnClickSportAction listener = sport -> onClickSport(sport);

        SportListAdapter adapter = new SportListAdapter(sportList, listener);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public void onClickSport(Sport sport) {
        Intent intent = new Intent(this, SportExplanationActivity.class);
        intent.putExtra(EXTRA_SPORT, sport);
        startActivity(intent);
    }

    public void populateSportList() {
        String[] sportTitle = getResources().getStringArray(R.array.sport_title);
        String[] sportInfo = getResources().getStringArray(R.array.sport_info);
        String[] sportExplanation = getResources().getStringArray(R.array.sport_explanation);
        String[] sportImageName = getResources().getStringArray(R.array.sport_image_name);

        for (int i = 0; i < sportTitle.length; i++) {
            int imageId = getResources().getIdentifier(sportImageName[i], "drawable", getPackageName());
            sportList.add(new Sport(sportTitle[i], sportInfo[i], sportExplanation[i], imageId));
        }
    }
}