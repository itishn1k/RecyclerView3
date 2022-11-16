package com.example.recyclerview3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList CityList = new ArrayList();
    private final CityAdapter adapter = new CityAdapter(CityList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvCity = findViewById(R.id.recycler_view);
        loadCitiesData();
        rvCity.setAdapter(adapter);
    }

    private void loadCitiesData() {
        CityList.add("Bishkek");
        CityList.add("Osh");
        CityList.add("Jalal-Abad");
        CityList.add("Naryn");
        CityList.add("Talas");
        CityList.add("Yssyk-Kol");
        CityList.add("Batken");
        CityList.add("Kara-Kol");
        CityList.add("Kara-Kul");
        CityList.add("Toktogul");
        CityList.add("Tash-Komur");
        CityList.add("Arslan-Bab");
        CityList.add("Ozgon");
        CityList.add("Kara-Balta");
        CityList.add("Bosteri");
        CityList.add("Cholpon-Ata");
        CityList.add("Mailuu-Suu");
        CityList.add("Kara-Suu");
        CityList.add("Nookat");
        CityList.add("Isfana");
    }
}