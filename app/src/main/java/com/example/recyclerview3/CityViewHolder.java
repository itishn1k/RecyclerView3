package com.example.recyclerview3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityViewHolder extends RecyclerView.ViewHolder {
    private final TextView tvYear;

    public CityViewHolder(@NonNull View itemView) {
        super(itemView);
        tvYear = itemView.findViewById(R.id.tv_city);
    }

    public void bind(String year) {
        tvYear.setText(year);
    }
}
