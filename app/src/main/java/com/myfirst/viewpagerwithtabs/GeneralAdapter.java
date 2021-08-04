package com.myfirst.viewpagerwithtabs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GeneralAdapter extends RecyclerView.Adapter<GeneralViewHolder> {

    private ArrayList<String> data;

    public GeneralAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public GeneralViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_general,
                parent,false);
        return new GeneralViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GeneralViewHolder holder, int position) {
        holder.setData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
