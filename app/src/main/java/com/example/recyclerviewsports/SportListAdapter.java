package com.example.recyclerviewsports;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SportListAdapter extends RecyclerView.Adapter<SportViewHolder> {
    private final ArrayList<Sport> sportList;
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
        holder.sportTitle.setText(sportList.get(position).getSportTitle());
        holder.sportInfo.setText(sportList.get(position).getSportInfo());
        holder.sportImage.setImageResource(sportList.get(position).getSportImageId());
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
