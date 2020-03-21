package com.shabiruzzaman_shiam.bice_18;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FirebaseViewHolder extends RecyclerView.ViewHolder {
    public TextView title,date;
    public FirebaseViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
        date = itemView.findViewById(R.id.date);
    }
}
