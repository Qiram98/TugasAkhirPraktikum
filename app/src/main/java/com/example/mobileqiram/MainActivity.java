package com.example.mobileqiram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Albert Venrosius Sagala", "16033031", "031259687845"));
        mahasiswaArrayList.add(new Mahasiswa("Vantri Antonius", "16030035", "081756564215"));
        mahasiswaArrayList.add(new Mahasiswa("Yoseph Jonatan", "16030045", "084526357895"));
        mahasiswaArrayList.add(new Mahasiswa("Yusup", "16030098", "087756451235"));
        mahasiswaArrayList.add(new Mahasiswa("Kevin Asri", "16030069", "087755698235"));
        mahasiswaArrayList.add(new Mahasiswa("Riskan ", "16030056", "087754891235"));
        mahasiswaArrayList.add(new Mahasiswa("Azmi", "16030078", "085648329865"));

    }

}
