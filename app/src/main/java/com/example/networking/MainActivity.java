package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private ArrayList<Mountain> mountainArrayList;

    private RecyclerViewAdapter adapter;
    private Gson gson;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mountainArrayList = new ArrayList<>();
        setContentView(R.layout.activity_main);

        gson = new Gson();

        this.adapter = new RecyclerViewAdapter(this, mountainArrayList, new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(Mountain mountain) {
                Toast.makeText(MainActivity.this, mountain.info(), Toast.LENGTH_SHORT).show();
            }
        });

        //new JsonFile(this, this).execute(JSON_FILE);
        new JsonTask(this).execute(JSON_URL);

        /*
        mountainArrayList.add(new Mountain("Matterhorn","Alps",4478));
        mountainArrayList.add(new Mountain("Mont Blanc","Alps",4808));
        mountainArrayList.add(new Mountain("Denali","Alaska",6190));*/

        RecyclerView view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(this.adapter);

    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
        Type type = new TypeToken<List<Mountain>>() {}.getType();
        ArrayList<Mountain> listOfMountains = gson.fromJson(json, type);
        this.mountainArrayList = listOfMountains;
        adapter.updateData(listOfMountains);
    }
}
