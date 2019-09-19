package com.gtabila.Emina;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvData;
    private ArrayList<DataEmina> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvData = findViewById(R.id.id_emina);
        rvData.setHasFixedSize(true);

        list.addAll(DataEmina2.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvData.setLayoutManager(new LinearLayoutManager(this));
        ListEminaAdapter listEminaAdapter = new ListEminaAdapter(list) {
        };
        rvData.setAdapter(listEminaAdapter);
    }
}
