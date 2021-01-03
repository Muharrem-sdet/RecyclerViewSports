package com.example.recyclerviewsports;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SportListAdapter extends RecyclerView.Adapter<SportViewHolder> {
    private ArrayList<Sport> sportList = new ArrayList<>();
    private final MyOnClickSportAction listener;

    public SportListAdapter(ArrayList<Sport> sportList, MyOnClickSportAction listener) {
        this.sportList = sportList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_sport, parent, false);
        return new SportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        holder.sportTitle.setText(sportList.get(position).sportTitle);
        holder.sportInfo.setText(sportList.get(position).sportInfo);
        holder.sportImage.setImageResource(sportList.get(position).sportImageId);
        if (position % 2 == 0) {
            holder.constLayout.setBackgroundColor(holder.itemView.getResources().getColor((R.color.purple_200)));
        }

        holder.itemView.setOnClickListener(v -> listener.perform(sportList.get(position)));
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

}
