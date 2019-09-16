package com.example.windows.cv_kelas12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {
        private RecyclerView rvAndroid;
        private ArrayList<Android> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        rvAndroid = findViewById(R.id.apps);
        rvAndroid.setHasFixedSize(true);

        list.addAll(AndroidData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvAndroid.setLayoutManager(new LinearLayoutManager(this));
        CardViewAndroidAdapter cardViewAndroidAdapter = new CardViewAndroidAdapter(list);
        rvAndroid.setAdapter(cardViewAndroidAdapter);
    }

}
