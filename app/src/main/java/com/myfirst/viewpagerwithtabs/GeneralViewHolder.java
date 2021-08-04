package com.myfirst.viewpagerwithtabs;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GeneralViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public GeneralViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews() {
        mTextView = itemView.findViewById(R.id.textView);
    }

    public void setData(String data){
        mTextView.setText(data);
    }
}
