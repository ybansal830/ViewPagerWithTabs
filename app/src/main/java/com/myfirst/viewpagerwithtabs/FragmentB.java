package com.myfirst.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentB extends Fragment {

    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        setRecyclerView();
    }

    private void setRecyclerView() {
        ArrayList<String> data = new ArrayList<>();
        for(int i=0;i<10;i++){
            data.add("Delhi");
            data.add("Kerala");
            data.add("Karnataka");
            data.add("Bangalore");
        }
        GeneralAdapter generalAdapter = new GeneralAdapter(data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setAdapter(generalAdapter);
        mRecyclerView.setLayoutManager(linearLayoutManager);
    }
}