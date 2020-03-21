package com.shabiruzzaman_shiam.bice_18;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.util.ULocale;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Locale;

public class Notices extends AppCompatActivity {


    RecyclerView recyclerView;

    private ArrayList<DataSetFire> arrayList;
    private FirebaseRecyclerOptions<DataSetFire> options;
    private FirebaseRecyclerAdapter<DataSetFire,FirebaseViewHolder> adapter;
    private DatabaseReference databaseReference;
    @Override
    protected void onStart() {

        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notices);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList = new ArrayList<DataSetFire>();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Notice");
        databaseReference.keepSynced(true);
        options = new FirebaseRecyclerOptions.Builder<DataSetFire>().setQuery(databaseReference,
                DataSetFire.class).build();

        adapter = new FirebaseRecyclerAdapter<DataSetFire, FirebaseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull FirebaseViewHolder firebaseViewHolder, int i, @NonNull final DataSetFire dataSetFire) {

                firebaseViewHolder.title.setText(dataSetFire.getTitle());
                firebaseViewHolder.date.setText(dataSetFire.getDate());

            }

            @NonNull
            @Override
            public FirebaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new FirebaseViewHolder(LayoutInflater.from(Notices.this).inflate(R.layout.notices,parent,false));
            }
        };

        recyclerView.setAdapter(adapter);


    }

    public void backpress(View view) {
        Intent intent = new Intent(Notices.this,DashBoard.class);
        startActivity(intent);
    }
}
